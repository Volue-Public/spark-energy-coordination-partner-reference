using System.Net;
using System.Text;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Mvc.Testing;
using Microsoft.Extensions.Configuration;
using Partner.Api.Implementations;
using static Partner.Api.Filters.BodySignatureFilter;

namespace Partner.Api.Tests;

public class NotificationApiTests
    : IClassFixture<WebApplicationFactory<NotificationApiControllerImplementation>>
{
    private static readonly string _testFilesDirectory = Path.GetFullPath(
        "../../../../../../../_tests/webhook-test-data"
    );

    private readonly HttpClient _client;
    private readonly IConfiguration _configuration;

    public NotificationApiTests(
        WebApplicationFactory<NotificationApiControllerImplementation> factory
    )
    {
        string signingKeyFile = Path.Join(_testFilesDirectory, "signing-key.txt");
        var signingKey = File.ReadAllText(signingKeyFile);
        var configuration = new Dictionary<string, string?> { { SigningKeyConfigKey, signingKey } };
        _configuration = new ConfigurationBuilder().AddInMemoryCollection(configuration).Build();
        _client = factory
            .WithWebHostBuilder(config => config.UseConfiguration(_configuration))
            .CreateClient();
    }

    public static TheoryData<string, string> GetTestDataSignatureAndPayloads()
    {
        var data = new TheoryData<string, string>();
        foreach (var file in Directory.GetFiles(_testFilesDirectory, "*.json"))
        {
            string jsonPayload = File.ReadAllText(file);
            string signature = File.ReadAllText(file + ".hmacsha256b64").TrimEnd();
            data.Add(jsonPayload, signature);
        }
        return data;
    }

    [Theory]
    [MemberData(nameof(GetTestDataSignatureAndPayloads))]
    public async Task NotifyPostReturnsOkOnValidSignature(string jsonPayload, string signature)
    {
        _client.DefaultRequestHeaders.Add("x-payload-signature", signature);
        var jsonContent = new StringContent(jsonPayload, Encoding.UTF8, "application/json");

        var response = await _client.PostAsync(
            "/notify",
            jsonContent,
            TestContext.Current.CancellationToken
        );

        Assert.Equal(HttpStatusCode.OK, response.StatusCode);
    }

    [Theory]
    [MemberData(nameof(GetTestDataSignatureAndPayloads))]
    public async Task NotifyPostReturnsBadRequestOnInvalidSignature(string jsonPayload, string _)
    {
        var badSignature = Convert.ToBase64String(Encoding.UTF8.GetBytes("bad signature"));

        _client.DefaultRequestHeaders.Add("x-payload-signature", badSignature);
        var jsonContent = new StringContent(jsonPayload, Encoding.UTF8, "application/json");

        var response = await _client.PostAsync(
            "/notify",
            jsonContent,
            TestContext.Current.CancellationToken
        );

        Assert.Equal(HttpStatusCode.BadRequest, response.StatusCode);
    }
}
