import pulumi
import pulumi_equinix as equinix

vd2_network = equinix.fabric.Connection("vd2network",
    name="ConnectionName",
    type="EVPLAN_VC",
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
                "type": "CLOUD",
                "id": 7,
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
