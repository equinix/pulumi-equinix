using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sshKey = new Equinix.Metal.SshKey("sshKey", new()
    {
        Name = "johnKent",
        PublicKey = File.ReadAllText("/Users/John/.ssh/metal_rsa.pub"),
    });

    return new Dictionary<string, object?>
    {
        ["sshKeyId"] = sshKey.Id,
    };
});

