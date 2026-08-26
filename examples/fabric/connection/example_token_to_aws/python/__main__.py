import pulumi
import pulumi_equinix as equinix

token2_aws = equinix.fabric.Connection("token2aws",
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
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<service_profile_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<aws_account_id>",
            "seller_region": "us-west-1",
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
