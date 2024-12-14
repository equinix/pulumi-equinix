import pulumi
import pulumi_equinix as equinix

port2_alibaba = equinix.fabric.Connection("port2alibaba",
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
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 2019,
            },
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<alibaba_account_id>",
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
