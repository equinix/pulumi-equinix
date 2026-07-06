using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.NetworkEdge.DeviceLink("test", new()
    {
        Name = "test-DLG",
        ProjectId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.Uuid,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.SecondaryDevice[0].Uuid,
                InterfaceId = 7,
            },
        },
        MetroLinks = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkMetroLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.AccountNumber,
                MetroCode = testEquinixNetworkDevice.MetroCode,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkMetroLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.SecondaryDevice[0].AccountNumber,
                MetroCode = testEquinixNetworkDevice.SecondaryDevice[0].MetroCode,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
        },
    });

});

