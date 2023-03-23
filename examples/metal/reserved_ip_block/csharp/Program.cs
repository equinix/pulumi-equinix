using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "FR";
    var type = config.Get("type") ?? "public_ipv4";
    var quantity = config.GetNumber("quantity") ?? 1;
    var ipBlock = new Equinix.Metal.ReservedIpBlock("ipBlock", new()
    {
        ProjectId = projectId,
        Type = "public_ipv4",
        Quantity = quantity,
        Metro = metro,
    });

    return new Dictionary<string, object?>
    {
        ["ipBlockId"] = ipBlock.Id,
        ["ipBlockSubent"] = ipBlock.CidrNotation,
    };
});

