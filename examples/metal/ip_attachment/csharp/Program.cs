using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var subnetCidr = config.Get("subnetCidr") ?? "147.229.10.152/31";
    var ipAttachResource = new Equinix.Metal.IpAttachment("ipAttach", new()
    {
        DeviceId = deviceId,
        CidrNotation = subnetCidr,
    });

    return new Dictionary<string, object?>
    {
        ["ipAttach"] = ipAttachResource.Id,
        ["ipNetmask"] = ipAttachResource.Netmask,
    };
});

