using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var direct = new Equinix.Fabric.RoutingProtocol("direct", new()
    {
        ConnectionUuid = "<some_id>",
        Type = "DIRECT",
        Name = "direct_rp",
        DirectIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv4Args
        {
            EquinixIfaceIp = "190.1.1.1/30",
        },
        DirectIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv6Args
        {
            EquinixIfaceIp = "190::1:1/126",
        },
    });

});

