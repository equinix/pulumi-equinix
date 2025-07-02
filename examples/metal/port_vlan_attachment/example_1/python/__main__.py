import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="VLAN in New York",
    metro="ny",
    project_id=project_id)
test_device = equinix.metal.Device("testDevice",
    hostname="test",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system="ubuntu_24_04",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
test_device_network_type = equinix.metal.DeviceNetworkType("testDeviceNetworkType",
    device_id=test_device.id,
    type="hybrid")
test_port_vlan_attachment = equinix.metal.PortVlanAttachment("testPortVlanAttachment",
    device_id=test_device_network_type.id,
    port_name="eth1",
    vlan_vnid=test.vxlan)
