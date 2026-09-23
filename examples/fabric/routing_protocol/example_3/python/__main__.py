import pulumi
import pulumi_equinix as equinix

direct = equinix.fabric.RoutingProtocol("direct",
    direct_ipv4={
        "equinix_iface_ip": "190.1.1.1/30",
    },
    direct_ipv6={
        "equinix_iface_ip": "190::1:1/126",
    },
    connection_uuid="<some_id>",
    type="DIRECT",
    name="direct_rp")
bgp = equinix.fabric.RoutingProtocol("bgp",
    bgp_ipv4={
        "customer_peer_ip": "190.1.1.2",
        "enabled": True,
    },
    bgp_ipv6={
        "customer_peer_ip": "190::1:2",
        "enabled": True,
    },
    connection_uuid="<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type="BGP",
    name="bgp_rp",
    customer_asn=4532,
    opts = pulumi.ResourceOptions(depends_on=[direct]))
