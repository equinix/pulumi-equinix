import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Device("test",
    hostname="test",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
test_device_network_type = equinix.metal.DeviceNetworkType("testDeviceNetworkType",
    device_id=test.id,
    type="layer2-individual")
test1 = equinix.metal.Vlan("test1",
    description="VLAN in New York",
    metro="ny",
    project_id=project_id)
test2 = equinix.metal.Vlan("test2",
    description="VLAN in New Jersey",
    metro="ny",
    project_id=project_id)
test1_port_vlan_attachment = equinix.metal.PortVlanAttachment("test1PortVlanAttachment",
    device_id=test_device_network_type.id,
    vlan_vnid=test1.vxlan,
    port_name="eth1")
test2_port_vlan_attachment = equinix.metal.PortVlanAttachment("test2PortVlanAttachment",
    device_id=test_device_network_type.id,
    vlan_vnid=test2.vxlan,
    port_name="eth1",
    native=True,
    opts = pulumi.ResourceOptions(depends_on=[test1_port_vlan_attachment]))
