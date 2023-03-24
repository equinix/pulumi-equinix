import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
account_name = config.require("accountName")
account_metro = config.require("accountMetro")
device1_id = config.require("device1Id")
device2_id = config.require("device2Id")
accountf_num = equinix.networkedge.get_account(name=account_name,
    metro_code=account_metro).number
device1_metro = equinix.networkedge.get_device(uuid=device1_id).metro_code
device2_metro = equinix.networkedge.get_device(uuid=device2_id).metro_code
device_link = equinix.networkedge.DeviceLink("deviceLink",
    name="test-link",
    subnet="192.168.40.64/27",
    devices=[
        equinix.networkedge.DeviceLinkDeviceArgs(
            id="device1Id",
            asn=22111,
            interface_id=6,
        ),
        equinix.networkedge.DeviceLinkDeviceArgs(
            id="device2Id",
            asn=22333,
            interface_id=7,
        ),
    ],
    links=[equinix.networkedge.DeviceLinkLinkArgs(
        account_number=accountf_num,
        src_metro_code=device1_metro,
        dst_metro_code=device2_metro,
        throughput="50",
        throughput_unit="Mbps",
    )])
pulumi.export("status", device_link.status)
pulumi.export("devices", device_link.devices)
