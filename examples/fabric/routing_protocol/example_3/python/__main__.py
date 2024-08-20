import pulumi
import pulumi_equinix as equinix

direct = equinix.fabric.RoutingProtocol("direct",
    connection_uuid="<some_id>",
    type="DIRECT",
    name="direct_rp",
    direct_ipv4=equinix.fabric.RoutingProtocolDirectIpv4Args(
        equinix_iface_ip="190.1.1.1/30",
    ),
    direct_ipv6=equinix.fabric.RoutingProtocolDirectIpv6Args(
        equinix_iface_ip="190::1:1/126",
    ))
bgp = equinix.fabric.RoutingProtocol("bgp",
    connection_uuid="<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type="BGP",
    name="bgp_rp",
    bgp_ipv4=equinix.fabric.RoutingProtocolBgpIpv4Args(
        customer_peer_ip="190.1.1.2",
        enabled=True,
    ),
    bgp_ipv6=equinix.fabric.RoutingProtocolBgpIpv6Args(
        customer_peer_ip="190::1:2",
        enabled=True,
    ),
    customer_asn=4532,
    opts = pulumi.ResourceOptions(depends_on=[direct]))
