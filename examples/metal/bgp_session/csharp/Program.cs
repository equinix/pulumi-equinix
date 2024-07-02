using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var bgp = new Equinix.Metal.BgpSession("bgp", new()
    {
        DeviceId = deviceId,
        AddressFamily = "ipv4",
    });

    return new Dictionary<string, object?>
    {
        ["bgpSessionStatus"] = bgp.Status,
    };
});

