using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var filepath = config.Get("filepath") ?? "cloudInitFileFolder/TF-AVX-cloud-init-file.txt";
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var aviatrixCloudinitFile = new Equinix.NetworkEdge.NetworkFile("aviatrixCloudinitFile", new()
    {
        FileName = "TF-AVX-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "AVIATRIX_EDGE_10",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var aviatrixSingle = new Equinix.NetworkEdge.Device("aviatrixSingle", new()
    {
        Name = "tf-aviatrix",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "AVIATRIX_EDGE_10",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "6.9",
        CoreCount = 2,
        CloudInitFileId = aviatrixCloudinitFile.Uuid,
        AclTemplateId = "c06150ea-b604-4ad1-832a-d63936e9b938",
    });

});

