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

    var iNFOBLOXSV = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
        Name = "TF_INFOBLOX",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-GRID-MEMBER",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.0.5",
        Hostname = "test",
        CoreCount = 8,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "adminPassword", "X.X.X.X" },
            { "ipAddress", "X.X.X.X" },
            { "subnetMaskIp", "X.X.X.X" },
            { "gatewayIp", "X.X.X.X" },
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_INFOBLOX-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            Hostname = "test",
            VendorConfiguration = 
            {
                { "adminPassword", "X.X.X.X" },
                { "ipAddress", "X.X.X.X" },
                { "subnetMaskIp", "X.X.X.X" },
                { "gatewayIp", "X.X.X.X" },
            },
        },
    });

});

