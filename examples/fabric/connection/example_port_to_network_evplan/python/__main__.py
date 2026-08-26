import pulumi
import pulumi_equinix as equinix

evplan = equinix.fabric.Connection("evplan",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_s_tag": 1976,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "network": {
                "uuid": "<network_uuid>",
            },
            "type": equinix.fabric.AccessPointType.NETWORK,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="EVPLAN_VC",
    bandwidth=50)
