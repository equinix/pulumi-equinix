import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
connection_id = config.require("connectionId")
routing_protocol = equinix.fabric.RoutingProtocol("RoutingProtocol",
    connection_uuid=connection_id,
    name="My-Direct-route-1",
    type="DIRECT",
    direct_ipv4=equinix.fabric.RoutingProtocolDirectIpv4Args(
        equinix_iface_ip="192.168.100.1/30",
    ))
pulumi.export("routingProtocolId", routing_protocol.id)
pulumi.export("routingProtocolState", routing_protocol.state)
pulumi.export("routingProtocolEquinixAsn", routing_protocol.equinix_asn)
