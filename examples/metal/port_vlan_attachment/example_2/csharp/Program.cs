using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "test",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = "ubuntu_24_04",
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    {
        DeviceId = test.Id,
        Type = "layer2-individual",
    });

    var test1 = new Equinix.Metal.Vlan("test1", new()
    {
        Description = "VLAN in New York",
        Metro = "ny",
        ProjectId = projectId,
    });

    var test2 = new Equinix.Metal.Vlan("test2", new()
    {
        Description = "VLAN in New Jersey",
        Metro = "ny",
        ProjectId = projectId,
    });

    var test1PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test1PortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        VlanVnid = test1.Vxlan,
        PortName = "eth1",
    });

    var test2PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test2PortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        VlanVnid = test2.Vxlan,
        PortName = "eth1",
        Native = true,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            test1PortVlanAttachment,
        },
    });

});

