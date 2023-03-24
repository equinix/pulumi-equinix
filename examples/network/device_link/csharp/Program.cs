using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var accountName = config.Require("accountName");
    var accountMetro = config.Require("accountMetro");
    var device1Id = config.Require("device1Id");
    var device2Id = config.Require("device2Id");
    var accountfNum = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = accountName,
        MetroCode = accountMetro,
    }).Apply(invoke => invoke.Number);

    var device1Metro = Equinix.NetworkEdge.GetDevice.Invoke(new()
    {
        Uuid = device1Id,
    }).Apply(invoke => invoke.MetroCode);

    var device2Metro = Equinix.NetworkEdge.GetDevice.Invoke(new()
    {
        Uuid = device2Id,
    }).Apply(invoke => invoke.MetroCode);

    var deviceLink = new Equinix.NetworkEdge.DeviceLink("deviceLink", new()
    {
        Name = "test-link",
        Subnet = "192.168.40.64/27",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = "device1Id",
                Asn = 22111,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = "device2Id",
                Asn = 22333,
                InterfaceId = 7,
            },
        },
        Links = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkLinkArgs
            {
                AccountNumber = accountfNum,
                SrcMetroCode = device1Metro,
                DstMetroCode = device2Metro,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["status"] = deviceLink.Status,
        ["devices"] = deviceLink.Devices,
    };
});

