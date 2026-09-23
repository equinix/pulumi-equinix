import pulumi
import pulumi_equinix as equinix

fcr2_network = equinix.fabric.Connection("fcr2network",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "router": {
                "uuid": "<cloud_router_uuid>",
            },
            "type": "CLOUD_ROUTER",
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
    type="IPWAN_VC",
    bandwidth=50)
