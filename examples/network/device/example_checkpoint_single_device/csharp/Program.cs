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

    var cHECKPOINTSV = new Equinix.NetworkEdge.Device("CHECKPOINT-SV", new()
    {
        Name = "TF_CHECKPOINT",
        ProjectId = "XXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "CGUARD",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "R81.20",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 5,
        AclTemplateId = "XXXXXXX",
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "XXXXX",
            KeyName = "XXXXXX",
        },
    });

});

