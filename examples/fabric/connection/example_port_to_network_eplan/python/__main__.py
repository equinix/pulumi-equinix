import pulumi
import pulumi_equinix as equinix

eplan = equinix.fabric.Connection("eplan",
    name="ConnectionName",
    type="EPLAN_VC",
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
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.NETWORK,
            "network": {
                "uuid": "<network_uuid>",
            },
        },
    })
