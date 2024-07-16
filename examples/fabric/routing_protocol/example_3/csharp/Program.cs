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

    var bgp = new Equinix.Fabric.RoutingProtocol("bgp", new()
    {
        ConnectionUuid = "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
        Type = "BGP",
        Name = "bgp_rp",
        BgpIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv4Args
        {
            CustomerPeerIp = "190.1.1.2",
            Enabled = true,
        },
        BgpIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv6Args
        {
            CustomerPeerIp = "190::1:2",
            Enabled = true,
        },
        CustomerAsn = 4532,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            direct,
        },
    });

});

