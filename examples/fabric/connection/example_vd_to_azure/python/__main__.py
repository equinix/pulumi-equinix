import pulumi
import pulumi_equinix as equinix

vd2_azure = equinix.fabric.Connection("vd2azure",
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
                "type": "CLOUD",
                "id": 7,
            },
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<Azure_ExpressRouter_Auth_Key>",
            "peering_type": equinix.fabric.AccessPointPeeringType.PRIVATE,
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<Azure_Service_Profile_UUID>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })
