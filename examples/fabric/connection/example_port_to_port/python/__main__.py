import pulumi
import pulumi_equinix as equinix

port2_port = equinix.fabric.Connection("port2port",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth=50,
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 1976,
            },
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": "<zside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 3711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })
