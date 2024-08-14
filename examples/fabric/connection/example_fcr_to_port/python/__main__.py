import pulumi
import pulumi_equinix as equinix

fcr2_port = equinix.fabric.Connection("fcr2port",
    name="ConnectionName",
    type="IP_VC",
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
            "type": "CLOUD_ROUTER",
            "router": {
                "uuid": "<cloud_router_uuid>",
            },
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": "<port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 2711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })
