import pulumi
import pulumi_equinix as equinix

fcr2_metal = equinix.fabric.Connection("fcr2metal",
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
            "type": "METAL_NETWORK",
            "authentication_key": "<metal_authorization_code>",
        },
    })
