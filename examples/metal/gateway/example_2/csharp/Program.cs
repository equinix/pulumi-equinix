using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.Vlan("test", new()
    {
        Description = "test VLAN in SV",
        Metro = "sv",
        ProjectId = projectId,
    });

    var test1 = new Equinix.Metal.ReservedIpBlock("test1", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 8,
    });

    var testGateway = new Equinix.Metal.Gateway("testGateway", new()
    {
        ProjectId = projectId,
        VlanId = test.Id,
        IpReservationId = testEquinixMetalReservedIpBlock.Id,
    });

});

