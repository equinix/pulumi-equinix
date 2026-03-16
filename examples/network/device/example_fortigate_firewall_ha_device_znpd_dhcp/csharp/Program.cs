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
        TypeCode = "FG-VM",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 10,
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
            { "ipAddressType", "DHCP" },
            { "managementInterfaceId", "6" },
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
                { "ipAddressType", "DHCP" },
                { "managementInterfaceId", "6" },
            },
        },
    });

});

