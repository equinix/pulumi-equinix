using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.NetworkEdge.DeviceLink("test", new()
    {
        Name = "test-link",
        Subnet = "192.168.40.64/27",
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.Uuid,
                Asn = 22111,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.SecondaryDevice[0].Uuid,
                Asn = 22333,
                InterfaceId = 7,
            },
        },
        Links = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.AccountNumber,
                SrcMetroCode = testEquinixNetworkDevice.MetroCode,
                DstMetroCode = testEquinixNetworkDevice.SecondaryDevice[0].MetroCode,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
        },
    });

});

