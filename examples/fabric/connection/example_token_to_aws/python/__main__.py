import pulumi
import pulumi_equinix as equinix

token2_aws = equinix.fabric.Connection("token2aws",
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
        "service_token": {
            "uuid": "<service_token_uuid>",
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<aws_account_id>",
            "seller_region": "us-west-1",
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<service_profile_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })
