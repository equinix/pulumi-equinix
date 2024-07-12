using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";

    var connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";

    var test = Equinix.Metal.GetInterconnection.Invoke(new()
    {
        ConnectionId = connId,
    });

    var testVlan = new Equinix.Metal.Vlan("testVlan", new()
    {
        ProjectId = projectId,
        Metro = test.Apply(getInterconnectionResult => getInterconnectionResult.Metro),
    });

    var testVirtualCircuit = new Equinix.Metal.VirtualCircuit("testVirtualCircuit", new()
    {
        ConnectionId = connId,
        ProjectId = projectId,
        PortId = test.Apply(getInterconnectionResult => getInterconnectionResult.Ports[0]?.Id),
        VlanId = testVlan.Id,
        NniVlan = 1056,
    });

});

