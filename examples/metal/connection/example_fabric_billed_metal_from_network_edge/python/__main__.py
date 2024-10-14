import pulumi
import pulumi_equinix as equinix

example = equinix.metal.Vrf("example",
    name="tf-metal-from-ne",
    metro="FR",
    local_asn=65001,
    ip_ranges=["10.99.1.0/24"],
    project_id=test["id"])
example_interconnection = equinix.metal.Interconnection("exampleInterconnection",
    name="tf-metal-from-ne",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="primary",
    metro="FR",
    speed="200Mbps",
    service_token_type="z_side",
    contact_email="username@example.com",
    vrfs=[example.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-ne",
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
            "type": equinix.fabric.AccessPointType.VD,
            "virtual_device": {
                "type": "EDGE",
                "uuid": example_equinix_network_device["id"],
            },
        },
    },
    z_side={
        "service_token": {
            "uuid": example_interconnection.service_tokens[0].id,
        },
    })
