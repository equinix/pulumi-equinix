using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var vlan1 = new Equinix.Metal.Vlan("vlan1", new()
    {
        Description = "VLAN in New Jersey",
        Metro = "sv",
        ProjectId = projectId,
        Vxlan = 1040,
    });

});

