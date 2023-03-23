using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var portName = config.Get("portName") ?? "eth1";
    var vxlanId = config.GetNumber("vxlanId") ?? 1004;
    var attach = new Equinix.Metal.PortVlanAttachment("attach", new()
    {
        DeviceId = deviceId,
        PortName = portName,
        VlanVnid = vxlanId,
    });

    return new Dictionary<string, object?>
    {
        ["attachId"] = attach.Id,
        ["portId"] = attach.PortId,
    };
});

