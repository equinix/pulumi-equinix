using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var metro = config.Get("metro") ?? "SV";
    var networkFile = new Equinix.NetworkEdge.NetworkFile("networkFile", new()
    {
        FileName = "Aviatrix-ZTP-file",
        Content = File.ReadAllText("./../assets/aviatrix-cloud-init.txt"),
        MetroCode = metro,
        DeviceTypeCode = "AVIATRIX_EDGE",
        ProcessType = "CLOUD_INIT",
        SelfManaged = true,
        Byol = true,
    });

    return new Dictionary<string, object?>
    {
        ["networkFileId"] = networkFile.Id,
        ["networkFileStatus"] = networkFile.Status,
    };
});

