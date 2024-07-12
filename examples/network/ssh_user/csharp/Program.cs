using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var john = new Equinix.NetworkEdge.SshUser("john", new()
    {
        Username = "john",
        Password = "secret",
        DeviceIds = new[]
        {
            "csr1000v-ha-uuid",
            "csr1000v-ha-redundant-uuid",
        },
    });

});

