import pulumi
import pulumi_equinix as equinix

a_side = equinix.fabric.get_ports_output(filter={
    "name": "<name_of_port||port_prefix>",
})
example = equinix.metal.Vlan("example",
    project_id="<metal_project_id>",
    metro="FR")
example_interconnection = equinix.metal.Interconnection("exampleInterconnection",
    name="tf-metal-from-port",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="primary",
    metro="FR",
    speed="200Mbps",
    service_token_type="z_side",
    contact_email="username@example.com",
    vlans=[example.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-port",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=200,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    order={
        "purchase_order_number": "1-323292",
    },
    project={
        "project_id": "<fabric_project_id>",
    },
    a_side={
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
    },
    z_side={
        "service_token": {
            "uuid": example_interconnection.service_tokens[0].id,
        },
    })
