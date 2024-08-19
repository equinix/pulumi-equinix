import pulumi
import pulumi_equinix as equinix

example1 = equinix.metal.Vlan("example1",
    project_id=my_project_id,
    metro="SV")
example = equinix.metal.Interconnection("example",
    name="tf-port-to-metal-legacy",
    project_id=my_project_id,
    metro="SV",
    redundancy="primary",
    type="shared_port_vlan",
    contact_email="username@example.com",
    vlans=[example1.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-NIMF-metal-2-aws-legacy",
    type="IP_VC",
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": "sername@example.com",
    }],
    project={
        "project_id": fabric_project_id,
    },
    bandwidth=200,
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "type": "CLOUD_ROUTER",
            "router": {
                "uuid": cloud_router_uuid,
            },
        },
    },
    z_side={
        "access_point": {
            "type": "METAL_NETWORK",
            "authentication_key": example.authorization_code,
        },
    })
