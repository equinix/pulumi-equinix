using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var netskopeNpa = new Equinix.NetworkEdge.Device("netskope-npa", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "NETSKOPE-NPA-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "privateCidrMask", "24" },
                { "ipAddressType", "STATIC" },
                { "ipAddress", "x.x.x.x" },
                { "gatewayIp", "x.x.x.x" },
                { "primaryNameServer", "x.x.x.x" },
                { "secondaryNameServer", "x.x.x.x" },
                { "dnsSearchDomain", "xxxxx" },
            },
        },
        Name = "NETSKOPE-NPA",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "NETSKOPE-NPA",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 1,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        Connectivity = "PRIVATE",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "R138",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "privateCidrMask", "24" },
            { "ipAddressType", "STATIC" },
            { "ipAddress", "x.x.x.x" },
            { "gatewayIp", "x.x.x.x" },
            { "primaryNameServer", "x.x.x.x" },
            { "secondaryNameServer", "x.x.x.x" },
            { "dnsSearchDomain", "xxxxx" },
        },
    });

});

