using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newRa = new Equinix.Fabric.RouteAggregation("new-ra", new()
    {
        Type = "BGP_IPv4_PREFIX_AGGREGATION",
        Name = "new-ra",
        Description = "Test aggregation",
        Project = new Equinix.Fabric.Inputs.RouteAggregationProjectArgs
        {
            ProjectId = "776847000642406",
        },
    });

});

