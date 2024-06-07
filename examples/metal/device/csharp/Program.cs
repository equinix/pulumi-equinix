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
        Plan = "c3.small.x86",
        OperatingSystem = "ubuntu_20_04",
        Metro = "sv",
        BillingCycle = "hourly",
        ProjectId = projectId,
    });

    return new Dictionary<string, object?>
    {
        ["webPublicIp"] = web.AccessPublicIpv4.Apply(accessPublicIpv4 => $"http://{accessPublicIpv4}"),
    };
});

