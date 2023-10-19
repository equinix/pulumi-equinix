using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var connectionId = config.Require("connectionId");
    var routingProtocol = new Equinix.Fabric.RoutingProtocol("RoutingProtocol", new()
    {
        ConnectionUuid = connectionId,
        Name = "My-Direct-route-1",
        Type = "DIRECT",
        DirectIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv4Args
        {
            EquinixIfaceIp = "192.168.100.1/30",
        },
    });

    return new Dictionary<string, object?>
    {
        ["routingProtocolId"] = routingProtocol.Id,
        ["routingProtocolState"] = routingProtocol.State,
        ["routingProtocolEquinixAsn"] = routingProtocol.EquinixAsn,
    };
});

