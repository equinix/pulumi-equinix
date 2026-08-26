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

    var niosXHa = new Equinix.NetworkEdge.Device("nios-x-ha", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_INFOBLOX-NIOS-X-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "token", "xxxxx" },
            },
        },
        Name = "TF_INFOBLOX-NIOS-X",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-NIOSX",
        SelfManaged = true,
        Connectivity = "INTERNET-ACCESS",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "4.0",
        CoreCount = 3,
        InterfaceCount = 5,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "token", "xxxxx" },
        },
    });

});

