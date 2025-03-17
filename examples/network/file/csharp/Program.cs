using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var filepath = config.Get("filepath") ?? "fileFolder/fileName.txt";
    var testFile = new Equinix.NetworkEdge.NetworkFile("test-file", new()
    {
        FileName = "fileName.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = Equinix.Metro.SiliconValley,
        DeviceTypeCode = "AVIATRIX_EDGE_10",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

});

