import pulumi
import pulumi_equinix as equinix

example1 = equinix.metal.Vlan("example1",
    project_id="<metal_project_id>",
    metro="SV")
example = equinix.metal.Interconnection("example",
    name="tf-metal-from-fcr",
    project_id="<metal_project_id>",
    metro="SV",
    redundancy="primary",
    type="shared_port_vlan",
    contact_email="username@example.com",
    speed="200Mbps",
    vlans=[example1.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-fcr",
    type="IP_VC",
    bandwidth=200,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    project={
        "project_id": "<fabric_project_id>",
    },
    a_side={
        "access_point": {
            "type": "CLOUD_ROUTER",
            "router": {
                "uuid": example_equinix_fabric_cloud_router["id"],
            },
        },
    },
    z_side={
        "access_point": {
            "type": "METAL_NETWORK",
            "authentication_key": example.authorization_code,
        },
    })
