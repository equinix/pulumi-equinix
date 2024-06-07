using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "SV";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 200;
    var connection = new Equinix.Metal.Interconnection("connection", new()
    {
        Name = "fabric-port-to-metal",
        ProjectId = projectId,
        Type = "shared",
        Redundancy = "primary",
        Metro = metro,
        Speed = $"{speedInMbps}Mbps",
        ServiceTokenType = "z_side",
    });

    return new Dictionary<string, object?>
    {
        ["connectionStatus"] = connection.Status,
        ["connectionTokens"] = connection.ServiceTokens,
    };
});

