using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sshKey = new Equinix.NetworkEdge.SshKey("sshKey", new()
    {
        Name = "johnKent",
        PublicKey = File.ReadAllText("/Users/John/.ssh/ne_rsa.pub"),
    });

    return new Dictionary<string, object?>
    {
        ["sshKeyId"] = sshKey.Id,
    };
});

