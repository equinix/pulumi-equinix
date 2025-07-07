using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
    return new Dictionary<string, object?>
    {
        ["connectionRouteAggregationId"] = policyAttachment.Id,
        ["connectionRouteAggregationConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteAggregationType"] = policyAttachment.Type,
        ["connectionRouteAggregationAttachmentStatus"] = policyAttachment.AttachmentStatus,
    };
});

