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

    var vYOSAM = new Equinix.NetworkEdge.Device("VYOS-AM", new()
    {
        Name = "TF_VYOS",
        ProjectId = "XXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VYOS-ROUTER",
        SelfManaged = true,
        Byol = false,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "1.4.1-2501",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXX",
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "xxxxxxxx",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_CHECKPOINT",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Hostname = "test",
            AclTemplateId = "XXXXXXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
        },
    });

});

