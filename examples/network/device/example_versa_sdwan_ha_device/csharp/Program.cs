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
        Name = "TF_VERSA-SDWAN",
        ProjectId = "XXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VERSA_SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "FLEX_VNF_2",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "21.2.3",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXXX",
        VendorConfiguration = 
        {
            { "controller1", "X.X.X.X" },
            { "controller2", "X.X.X.X" },
            { "localId", "test@test.com" },
            { "remoteId", "test@test.com" },
            { "serialNumber", "4" },
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "Praveena_TF_VERSA",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            AclTemplateId = "XXXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "controller1", "X.X.X.X" },
                { "controller2", "X.X.X.X" },
                { "localId", "test@test.com" },
                { "remoteId", "test@test.com" },
                { "serialNumber", "4" },
            },
        },
    });

});

