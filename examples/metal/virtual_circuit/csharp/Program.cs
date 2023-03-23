using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var connectionId = config.Require("connectionId");
    var vlanId = config.Require("vlanId");
    var portId = Equinix.Metal.GetInterconnection.Invoke(new()
    {
        ConnectionId = connectionId,
    }).Apply(invoke => invoke.Ports[0]?.Id);

    var vc = new Equinix.Metal.VirtualCircuit("vc", new()
    {
        ConnectionId = connectionId,
        ProjectId = projectId,
        PortId = portId,
        VlanId = vlanId,
        NniVlan = 1056,
    });

    return new Dictionary<string, object?>
    {
        ["vcStatus"] = vc.Status,
        ["vcVnid"] = vc.Vnid,
    };
});

