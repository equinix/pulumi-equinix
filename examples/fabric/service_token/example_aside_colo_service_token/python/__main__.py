import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    service_token_connections=[{
        "a_sides": [{
            "access_point_selectors": [{
                "port": {
                    "uuid": "<port_uuid>",
                },
                "link_protocol": {
                    "type": "DOT1Q",
                    "vlan_tag": 2987,
                },
                "type": "COLO",
            }],
        }],
        "type": "EVPL_VC",
        "bandwidth_limit": 1000,
    }],
    type="VC_TOKEN",
    description="Aside COLO Service Token",
    expiration_date_time="2025-01-18T06:43:49.981Z")
