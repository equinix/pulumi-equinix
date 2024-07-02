using System.Collections.Generic;
using System.IO;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var sshKey = new Equinix.Metal.ProjectSshKey("sshKey", new()
    {
        ProjectId = projectId,
        Name = "johnKent",
        PublicKey = File.ReadAllText("/Users/John/.ssh/metal_rsa.pub"),
    });

    return new Dictionary<string, object?>
    {
        ["sshKeyId"] = sshKey.Id,
    };
});

