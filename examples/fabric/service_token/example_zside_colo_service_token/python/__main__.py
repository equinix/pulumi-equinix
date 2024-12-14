import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    type="VC_TOKEN",
    description="Zside COLO Service Token",
    expiration_date_time="2025-01-18T06:43:49.981Z",
    service_token_connections=[{
        "type": "EVPL_VC",
        "supported_bandwidths": [
            50,
            200,
            10000,
        ],
        "z_sides": [{
            "access_point_selectors": [{
                "type": "COLO",
                "port": {
                    "uuid": "<port_uuid>",
                },
                "link_protocol": {
                    "type": "DOT1Q",
                    "vlan_tag": 2087,
                },
            }],
        }],
    }],
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }])
