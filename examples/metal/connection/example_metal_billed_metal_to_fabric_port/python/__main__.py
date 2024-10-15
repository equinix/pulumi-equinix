import pulumi
import pulumi_equinix as equinix

a_side = equinix.fabric.get_ports_output(filter={
    "name": "<name_of_port||port_prefix>",
})
example = equinix.metal.Interconnection("example",
    name="tf-metal-2-port",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="redundant",
    metro="FR",
    speed="1Gbps",
    service_token_type="a_side",
    contact_email="username@example.com")
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-2-port",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    project={
        "project_id": "<fabric_project_id>",
    },
    bandwidth=100,
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "service_token": {
            "uuid": example.service_tokens[0].id,
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": a_side.data[0].uuid,
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 1234,
            },
        },
    })
