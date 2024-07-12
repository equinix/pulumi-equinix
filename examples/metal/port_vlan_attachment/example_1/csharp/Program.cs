using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.Vlan("test", new()
    {
        Description = "VLAN in New York",
        Metro = "ny",
        ProjectId = projectId,
    });

    var testDevice = new Equinix.Metal.Device("testDevice", new()
    {
        Hostname = "test",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    {
        DeviceId = testDevice.Id,
        Type = "hybrid",
    });

    var testPortVlanAttachment = new Equinix.Metal.PortVlanAttachment("testPortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        PortName = "eth1",
        VlanVnid = test.Vxlan,
    });

});

