using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "DA";
    var vxlan = config.RequireInt32("vxlan");
    var vlan = new Equinix.Metal.Vlan("vlan", new()
    {
        Description = "VLAN in Dallas",
        ProjectId = projectId,
        Metro = metro,
        Vxlan = vxlan,
    });

    return new Dictionary<string, object?>
    {
        ["vlanId"] = vlan.Id,
    };
});

