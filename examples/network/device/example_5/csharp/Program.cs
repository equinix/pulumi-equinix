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

    var vsrxSingle = new Equinix.NetworkEdge.Device("vsrxSingle", new()
    {
        Name = "tf-c8kv-sdwan",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VSRX",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "VSRX",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "23.2R1.13",
        CoreCount = 2,
        TermLength = 12,
        AdditionalBandwidth = 5,
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        DiverseDeviceId = "ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
        AclTemplateId = "3e548c02-9164-4197-aa23-05b1f644883c",
    });

});

