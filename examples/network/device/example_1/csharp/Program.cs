using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var dc = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "DC",
    });

    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var csr1000VHa = new Equinix.NetworkEdge.Device("csr1000vHa", new()
    {
        Name = "tf-csr1000v-p",
        Throughput = 500,
        ThroughputUnit = Equinix.NetworkEdge.ThroughputUnit.Mbps,
        MetroCode = dc.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "CSR1000V",
        SelfManaged = false,
        Connectivity = "INTERNET-ACCESS",
        Byol = false,
        PackageCode = "SEC",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        Hostname = "csr1000v-p",
        TermLength = 12,
        AccountNumber = dc.Apply(getAccountResult => getAccountResult.Number),
        Version = "16.09.05",
        CoreCount = 2,
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-csr1000v-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr1000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        },
    });

});

