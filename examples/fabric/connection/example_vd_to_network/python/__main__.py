import pulumi
import pulumi_equinix as equinix

vd2_network = equinix.fabric.Connection("vd2network",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "CLOUD",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
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
