using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var web1 = new Equinix.Metal.Device("web1", new()
    {
        Hostname = "tf.coreos2",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

});

