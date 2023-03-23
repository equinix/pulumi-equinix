using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var portId = config.Require("portId");
    var vlanId = config.Require("vlanId");
    var portBond0 = new Equinix.Metal.Port("portBond0", new()
    {
        PortId = portId,
        Bonded = true,
        Layer2 = false,
        VlanIds = new[]
        {
            vlanId,
        },
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
        ["portBondedNetworkType"] = port.NetworkType,
    };
});

