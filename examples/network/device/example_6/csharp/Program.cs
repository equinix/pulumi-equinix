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

    var aristaHa = new Equinix.NetworkEdge.Device("aristaHa", new()
    {
        Name = "tf-arista-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ARISTA-ROUTER",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "CloudEOS",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "arista-p",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "4.29.0",
        CoreCount = 4,
        TermLength = 12,
        AdditionalBandwidth = 5,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = testPublicKey.Name,
        },
        AclTemplateId = "c637a17b-7a6a-4486-924b-30e6c36904b0",
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-arista-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "arista-s",
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            AclTemplateId = "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
        },
    });

});

