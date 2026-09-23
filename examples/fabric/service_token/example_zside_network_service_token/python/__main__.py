import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    notifications=[{
        "type": "ALL",
        "emails": ["example@equinix.com"],
    }],
    service_token_connections=[{
        "z_sides": [{
            "access_point_selectors": [{
                "network": {
                    "uuid": "<network_uuid>",
                },
                "type": "NETWORK",
            }],
        }],
        "type": "EVPL_VC",
        "supported_bandwidths": [
            50,
            200,
            10000,
        ],
    }],
    type="VC_TOKEN",
    description="Zside Network Service Token",
    expiration_date_time="2025-01-18T06:43:49.986Z")
