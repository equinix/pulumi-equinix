using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var policyAttachment = new Equinix.Fabric.ConnectionRouteFilter("policyAttachment", new()
    {
        ConnectionId = "<connection_uuid>",
        RouteFilterId = "<route_filter_policy_uuid>",
        Direction = "INBOUND",
    });

    return new Dictionary<string, object?>
    {
        ["connectionRouteFilterId"] = policyAttachment.Id,
        ["connectionRouteFilterConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteFilterDirection"] = policyAttachment.Direction,
        ["connectionRouteFilterType"] = policyAttachment.Type,
        ["connectionRouteFilterAttachmentStatus"] = policyAttachment.AttachmentStatus,
    };
});

