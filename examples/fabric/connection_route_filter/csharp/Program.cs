using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
    return new Dictionary<string, object?>
    {
        ["connectionRouteFilterId"] = policyAttachment.Id,
        ["connectionRouteFilterConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteFilterDirection"] = policyAttachment.Direction,
        ["connectionRouteFilterType"] = policyAttachment.Type,
        ["connectionRouteFilterAttachmentStatus"] = policyAttachment.AttachmentStatus,
    };
});

