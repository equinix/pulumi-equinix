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

    var zscalerAppcSingle = new Equinix.NetworkEdge.Device("zscaler-appc-single", new()
    {
        Name = "tf-zscaler-appc",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ZSCALER-APPC",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "23.395.1",
        InterfaceCount = 1,
        CoreCount = 4,
        VendorConfiguration = 
        {
            { "provisioningKey", "XXXXXXXXXX" },
            { "hostname", "XXXX" },
        },
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
    });

});

