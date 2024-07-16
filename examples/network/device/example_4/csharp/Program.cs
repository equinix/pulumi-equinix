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

    var c8KvSingle = new Equinix.NetworkEdge.Device("c8kvSingle", new()
    {
        Name = "tf-c8kv",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "C8KV",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.06.01a",
        CoreCount = 2,
        TermLength = 12,
        LicenseToken = "valid-license-token",
        AdditionalBandwidth = 5,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
        AclTemplateId = "3e548c02-9164-4197-aa23-05b1f644883c",
    });

});

