using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var exampleVirtualCircuit = new Equinix.Metal.VirtualCircuit("exampleVirtualCircuit", new()
    {
        Name = "example-vc",
        Description = "Virtual Circuit",
        ConnectionId = example.Id,
        ProjectId = exampleEquinixMetalProject.Id,
        PortId = example.Ports[0].Id,
        NniVlan = 1024,
        VrfId = exampleEquinixMetalVrf.Id,
        PeerAsn = 65530,
        Subnet = "192.168.100.16/31",
        MetalIp = "192.168.100.16",
        CustomerIp = "192.168.100.17",
    });

});

