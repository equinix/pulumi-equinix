using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var tfProject1 = new Equinix.Metal.Project("tfProject1", new()
    {
        Name = "tftest",
        BgpConfig = new Equinix.Metal.Inputs.ProjectBgpConfigArgs
        {
            DeploymentType = "local",
            Md5 = "C179c28c41a85b",
            Asn = 65000,
        },
    });

});

