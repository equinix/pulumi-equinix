using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.ReservedIpBlock("example", new()
    {
        Description = "Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
        ProjectId = exampleEquinixMetalProject.Id,
        Metro = exampleEquinixMetalVrf.Metro,
        Type = "vrf",
        VrfId = exampleEquinixMetalVrf.Id,
        Cidr = 29,
        Network = "192.168.100.0",
    });

    var exampleVlan = new Equinix.Metal.Vlan("exampleVlan", new()
    {
        Description = "A VLAN for Layer2 and Hybrid Metal devices",
        Metro = exampleEquinixMetalVrf.Metro,
        ProjectId = exampleEquinixMetalProject.Id,
    });

    var exampleGateway = new Equinix.Metal.Gateway("exampleGateway", new()
    {
        ProjectId = exampleEquinixMetalProject.Id,
        VlanId = exampleVlan.Id,
        IpReservationId = example.Id,
    });

});

