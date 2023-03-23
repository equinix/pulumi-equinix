using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "FR";
    var request = new Equinix.Metal.SpotMarketRequest("request", new()
    {
        ProjectId = projectId,
        Metro = metro,
        MaxBidPrice = 0.75,
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

    return new Dictionary<string, object?>
    {
        ["requestId"] = request.Id,
    };
});

