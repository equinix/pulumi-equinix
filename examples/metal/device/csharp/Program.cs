using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var web = new Equinix.Metal.Device("web", new()
    {
        Hostname = "webserver1",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        Metro = "sv",
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    return new Dictionary<string, object?>
    {
        ["webPublicIp"] = web.AccessPublicIpv4.Apply(accessPublicIpv4 => $"http://{accessPublicIpv4}"),
    };
});

