import pulumi
import pulumi_equinix as equinix

eplan = equinix.fabric.Connection("eplan",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
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
    type="EPLAN_VC",
    bandwidth=50)
