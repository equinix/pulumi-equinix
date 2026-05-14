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

    var sixWindVsr = new Equinix.NetworkEdge.Device("six-wind-vsr", new()
    {
        Name = "6WIND-VSR",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "6WIND-VSR",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 10,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "3.10.8",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "token", "xxxx" },
        },
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "xxxx",
            KeyName = "xxxxx",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "6WIND-VSR-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "token", "xxxx" },
            },
        },
    });

});

