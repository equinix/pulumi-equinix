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
        Bonded = false,
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
    };
});

