using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var bluecatEdgeServicePointCloudinitPrimaryFile = new Equinix.NetworkEdge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", new()
    {
        FileName = "TF-BLUECAT-ESP-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var bluecatEdgeServicePointCloudinitSecondaryFile = new Equinix.NetworkEdge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", new()
    {
        FileName = "TF-BLUECAT-ESP-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var bluecatEdgeServicePointHa = new Equinix.NetworkEdge.Device("bluecatEdgeServicePointHa", new()
    {
        Name = "tf-bluecat-edge-service-point-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        CloudInitFileId = bluecatEdgeServicePointCloudinitPrimaryFile.Uuid,
        Version = "4.6.3",
        CoreCount = 4,
        TermLength = 12,
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-bluecat-edge-service-point-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            CloudInitFileId = bluecatEdgeServicePointCloudinitSecondaryFile.Uuid,
        },
    });

});

