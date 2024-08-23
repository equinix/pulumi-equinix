import pulumi
import pulumi_equinix as equinix

zside = equinix.fabric.get_service_profiles_output(filter={
    "property": "/name",
    "operator": "=",
    "values": ["AWS Direct Connect"],
})
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
    type=equinix.fabric.ConnectionType.EVPL,
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
            "type": "METAL_NETWORK",
            "authentication_key": example.authorization_code,
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": aws_account_id,
            "seller_region": "us-west-1",
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": zside.id,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
        },
    })