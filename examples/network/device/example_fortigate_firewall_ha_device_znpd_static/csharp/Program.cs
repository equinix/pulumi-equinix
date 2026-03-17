using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
        Name = "account-name",
    });

    var fTNTFIREWALLSV = new Equinix.NetworkEdge.Device("FTNT-FIREWALL-SV", new()
    {
        Name = "TF_FTNT-FIREWALL",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        InterfaceCount = 10,
        TypeCode = "FG-VM",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.6.3",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "gatewayIp", "X.X.X.X" },
            { "ipAddress", "X.X.X.X" },
            { "ipAddressType", "STATIC" },
            { "subnetMaskIp", "x.x.x.x" },
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_FTNT-FIREWALL-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "fg-vm-znpd",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "ipAddressType", "STATIC" },
                { "ipAddress", "x.x.x.x" },
                { "gatewayIp", "x.x.x.x" },
                { "subnetMaskIp", "x.x.x.x" },
                { "managementInterfaceId", "6" },
            },
        },
    });

});

