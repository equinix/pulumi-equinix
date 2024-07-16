using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var req = new Equinix.Metal.SpotMarketRequest("req", new()
    {
        ProjectId = projectId,
        MaxBidPrice = 0.03,
        Metro = "ny",
        DevicesMin = 1,
        DevicesMax = 1,
        InstanceParameters = new Equinix.Metal.Inputs.SpotMarketRequestInstanceParametersArgs
        {
            Hostname = "testspot",
            BillingCycle = "hourly",
            OperatingSystem = "ubuntu_20_04",
            Plan = "c3.small.x86",
        },
    });

});

