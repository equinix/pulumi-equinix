using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var twoElasticAddresses = new Equinix.Metal.ReservedIpBlock("twoElasticAddresses", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 2,
    });

    var test1 = new Equinix.Metal.ReservedIpBlock("test1", new()
    {
        ProjectId = projectId,
        Type = Equinix.Metal.IpBlockType.PublicIPv4,
        Metro = "sv",
        Quantity = 1,
    });

    var test = new Equinix.Metal.ReservedIpBlock("test", new()
    {
        ProjectId = projectId,
        Type = Equinix.Metal.IpBlockType.GlobalIPv4,
        Quantity = 1,
    });

});

