using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var networkType = config.Get("networkType") ?? "hybrid";
    return new Dictionary<string, object?>
    {
        ["deviceNetworkId"] = deviceNetwork.Id,
    };
});

