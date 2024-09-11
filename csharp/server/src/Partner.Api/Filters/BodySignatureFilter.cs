using System;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;
using Microsoft.Extensions.Configuration;

namespace Partner.Api.Filters;

/// <summary>
/// Filter to compute the HMAC SHA256 signature of the request body.
/// </summary>
public class BodySignatureFilter : IAsyncResourceFilter
{
    /// <summary> The key for the calculated signature in <see cref="HttpContext.Items"/> </summary>
    public const string ItemsKey = "HmacSha256Signature";

    /// <summary> The config key for the signing key</summary>
    public const string SigningKeyConfigKey = "SIGNING_KEY";

    private readonly string _signingKey;

    /// <summary>
    /// Instantiate a new BodySignatureFilter.
    /// </summary>
    public BodySignatureFilter(IConfiguration configuration)
    {
        // Fetch signing secret from configuration, should be injected via an Environment variable
        string signingKey = configuration.GetValue<string>(SigningKeyConfigKey);
        ArgumentNullException.ThrowIfNull(signingKey);
        _signingKey = signingKey;
    }

    /// <inheritdoc/>
    public async Task OnResourceExecutionAsync(
        ResourceExecutingContext context,
        ResourceExecutionDelegate next
    )
    {
        var request = context.HttpContext.Request;
        if (request.ContentType == null || !request.ContentType.Contains("application/json"))
        {
            await next();
            return;
        }
        request.EnableBuffering();
        using var hmacsha256 = new HMACSHA256(Encoding.UTF8.GetBytes(_signingKey));
        byte[] hash = await hmacsha256.ComputeHashAsync(request.Body);
        request.Body.Position = 0;
        var signature = Convert.ToBase64String(hash);

        context.HttpContext.Items[ItemsKey] = signature;

        await next();
    }
}

/// <summary>Register to a controller to compute the HMAC SHA256 signature of the body</summary>
public class BodySignatureFilterAttribute : TypeFilterAttribute
{
    /// <summary>Initializes a new instance of <see cref="BodySignatureFilterAttribute"/></summary>
    public BodySignatureFilterAttribute()
        : base(typeof(BodySignatureFilter)) { }
}
