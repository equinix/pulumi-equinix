using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var existingProject = new Equinix.Metal.Project("existingProject", new()
    {
        Name = "The name of the project (if different, will rewrite)",
        BgpConfig = new Equinix.Metal.Inputs.ProjectBgpConfigArgs
        {
            DeploymentType = "local",
            Md5 = "C179c28c41a85b",
            Asn = 65000,
        },
    });

});

