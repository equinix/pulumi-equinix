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

    var c8000VByol = new Equinix.NetworkEdge.Device("c8000v-byol", new()
    {
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Connectivity = "PRIVATE",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        VendorConfiguration = 
        {
            { "restApiSupportRequirement", "true" },
            { "ipAddressType", "NO_IP_ADDRESS" },
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-c8000v-byol-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr8000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "restApiSupportRequirement", "true" },
                { "ipAddressType", "NO_IP_ADDRESS" },
            },
        },
    });

});

