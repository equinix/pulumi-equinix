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

    var fTNTSDWANSV = new Equinix.NetworkEdge.Device("FTNT-SDWAN-SV", new()
    {
        Name = "TF_FTNT-SDWAN",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "FG-SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.0.14",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXX",
        VendorConfiguration = 
        {
            { "adminPassword", "XXXXX" },
            { "controller1", "X.X.X.X" },
        },
    });

});

