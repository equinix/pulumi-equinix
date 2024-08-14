import pulumi
import pulumi_equinix as equinix

vd2_port = equinix.fabric.Connection("vd2port",
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
            "type": equinix.fabric.AccessPointType.VD,
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "NETWORK",
                "id": 7,
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
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_s_tag": 3711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })
