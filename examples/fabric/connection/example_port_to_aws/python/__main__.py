import pulumi
import pulumi_equinix as equinix

port2_aws = equinix.fabric.Connection("port2aws",
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
    redundancy={
        "priority": "PRIMARY",
    },
    order={
        "purchase_order_number": "1-323929",
    },
    a_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 2019,
                "vlan_c_tag": 2112,
            },
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
    },
    additional_info=[
        {
            "key": "accessKey",
            "value": "<aws_access_key>",
        },
        {
            "key": "secretKey",
            "value": "<aws_secret_key>",
        },
    ])
