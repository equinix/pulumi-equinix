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

    var zscalerPseSingle = new Equinix.NetworkEdge.Device("zscaler-pse-single", new()
    {
        Name = "tf-zscaler-pse",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ZSCALER-PSE",
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

