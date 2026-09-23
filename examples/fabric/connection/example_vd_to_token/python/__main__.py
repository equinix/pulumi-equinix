import pulumi
import pulumi_equinix as equinix

vd2_token = equinix.fabric.Connection("vd2token",
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
                "type": "NETWORK",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "service_token": {
            "uuid": "<service_token_uuid>",
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
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
