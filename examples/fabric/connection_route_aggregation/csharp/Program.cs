using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var policyAttachment = new Equinix.Fabric.ConnectionRouteAggregation("policyAttachment", new()
    {
        RouteAggregationId = "<route_aggregation_id>",
        ConnectionId = "<connection_id>",
    });

    return new Dictionary<string, object?>
    {
        ["connectionRouteAggregationId"] = policyAttachment.Id,
        ["connectionRouteAggregationConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteAggregationType"] = policyAttachment.Type,
        ["connectionRouteAggregationAttachmentStatus"] = policyAttachment.AttachmentStatus,
    };
});

