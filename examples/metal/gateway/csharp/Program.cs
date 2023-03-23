using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var vlanId = config.Require("vlanId");
    var gateway = new Equinix.Metal.Gateway("gateway", new()
    {
        ProjectId = projectId,
        VlanId = vlanId,
        PrivateIpv4SubnetSize = 8,
    });

    return new Dictionary<string, object?>
    {
        ["gatewayState"] = gateway.State,
    };
});

