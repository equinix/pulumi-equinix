using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var device1Id = config.Require("device1Id");
    var device2Id = config.Require("device2Id");
    var sshUser = new Equinix.NetworkEdge.SshUser("sshUser", new()
    {
        Username = "johnKent",
        DeviceIds = new[]
        {
            device1Id,
            device2Id,
        },
    });

    return new Dictionary<string, object?>
    {
        ["sshUserId"] = sshUser.Id,
    };
});

