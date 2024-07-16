using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var testPublicKey = new Equinix.NetworkEdge.SshKey("testPublicKey", new()
    {
        Name = "key-name",
        PublicKey = "ssh-dss key-value",
        Type = "DSA",
    });

    var bluecatBddsHa = new Equinix.NetworkEdge.Device("bluecatBddsHa", new()
    {
        Name = "tf-bluecat-bdds-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "BLUECAT",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.6.0",
        CoreCount = 2,
        TermLength = 12,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "privateAddress", "x.x.x.x" },
            { "privateCidrMask", "24" },
            { "privateGateway", "x.x.x.x" },
            { "licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx" },
            { "licenseId", "xxxxxxxxxxxxxxx" },
        },
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = testPublicKey.Name,
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-bluecat-bdds-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "privateAddress", "x.x.x.x" },
                { "privateCidrMask", "24" },
                { "privateGateway", "x.x.x.x" },
                { "licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx" },
                { "licenseId", "xxxxxxxxxxxxxxx" },
            },
        },
    });

});

