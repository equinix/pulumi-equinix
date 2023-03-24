using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var networkType = config.Get("networkType") ?? "hybrid";
    var deviceNetwork = new Equinix.Metal.DeviceNetworkType("deviceNetwork", new()
    {
        DeviceId = deviceId,
        Type = networkType,
    });

    return new Dictionary<string, object?>
    {
        ["deviceNetworkId"] = deviceNetwork.Id,
    };
});

