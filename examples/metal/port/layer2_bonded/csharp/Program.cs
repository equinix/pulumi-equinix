using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var portId = config.Require("portId");
    var org = new Equinix.Metal.Port("org", new()
    {
        PortId = portId,
        Bonded = true,
        Layer2 = true,
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
        ["portBondedNetworkType"] = port.NetworkType,
    };
});

