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

    var f5XcSingle = new Equinix.NetworkEdge.Device("f5xc-single", new()
    {
        Name = "tf-f5xc",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "F5XC",
        SelfManaged = true,
        Byol = true,
        Connectivity = "INTERNET-ACCESS",
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 1,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        AclTemplateId = "xxxx",
        Version = "9.2025.17",
        InterfaceCount = 8,
        CoreCount = 8,
        VendorConfiguration = 
        {
            { "token", "XXXXXXXXXX" },
            { "hostname", "XXXX" },
        },
    });

});

