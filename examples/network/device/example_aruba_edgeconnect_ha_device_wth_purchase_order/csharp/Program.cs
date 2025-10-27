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

    var aRUBAEDGECONNECTAM = new Equinix.NetworkEdge.Device("ARUBA-EDGECONNECT-AM", new()
    {
        Name = "TF_Aruba_Edge_Connect",
        ProjectId = "XXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "EDGECONNECT-SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "EC-V",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.4.2.3",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        InterfaceCount = 32,
        AclTemplateId = "XXXXXXX",
        PurchaseOrderNumber = "PO-Primary-Account-123",
        VendorConfiguration = 
        {
            { "accountKey", "xxxxx" },
            { "accountName", "xxxx" },
            { "applianceTag", "tests" },
            { "hostname", "test" },
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_CHECKPOINT",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            PurchaseOrderNumber = "PO-Secondary-Account-123",
            AclTemplateId = "XXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "accountKey", "xxxxx" },
                { "accountName", "xxxx" },
                { "applianceTag", "test" },
                { "hostname", "test" },
            },
        },
    });

});

