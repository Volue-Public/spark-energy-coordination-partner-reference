using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using Partner.Api.Controllers;
using Partner.Api.Filters;
using Partner.Api.Models;

namespace Partner.Api.Implementations;

/// <summary>
/// Reference implementation of the notification event webhook
/// </summary>
public class NotificationApiControllerImplementation(
    ILogger<NotificationApiControllerImplementation> logger
) : NotificationApiController
{
    /// <inheritdoc/>
    [BodySignatureFilter]
    public override async Task<IActionResult> NotifyPost(
        [FromHeader(Name = "x-payload-signature"), Required] string xPayloadSignature,
        [FromBody] EventNotification eventNotification
    )
    {
        // Fetch calculated signature from BodySignatureFilter
        if (
            !HttpContext.Items.TryGetValue(BodySignatureFilter.ItemsKey, out var computedHash)
            || computedHash == null
        )
        {
            logger.LogWarning("Unable to compute hash for incoming request");
            return Problem(statusCode: StatusCodes.Status500InternalServerError);
        }
        if (computedHash.ToString() != xPayloadSignature)
        {
            return BadRequest();
        }
        // Do not perform long processing before returning a 200 OK response
        await SaveEventForLaterProcessingAsync(eventNotification);

        // It is important to return a 200 OK response to acknowledge receipt of event
        return Ok();
    }

    private static Task SaveEventForLaterProcessingAsync(EventNotification eventNotification)
    {
        // Save the event to a queue or database for later processing
        // For example, you can save the event to a database for later processing
        // using Entity Framework Core or Dapper
        // or enqueue the event to a message broker like Azure Service Bus or RabbitMQ
        return Task.CompletedTask;
    }
}
