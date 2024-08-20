import pulumi
import pulumi_equinix as equinix

test = equinix.networkedge.DeviceLink("test",
    name="test-link",
    subnet="192.168.40.64/27",
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    devices=[
        equinix.networkedge.DeviceLinkDeviceArgs(
            id=test_equinix_network_device["uuid"],
            asn=22111,
            interface_id=6,
        ),
        equinix.networkedge.DeviceLinkDeviceArgs(
            id=test_equinix_network_device["secondaryDevice"][0]["uuid"],
            asn=22333,
            interface_id=7,
        ),
    ],
    links=[equinix.networkedge.DeviceLinkLinkArgs(
        account_number=test_equinix_network_device["accountNumber"],
        src_metro_code=test_equinix_network_device["metroCode"],
        dst_metro_code=test_equinix_network_device["secondaryDevice"][0]["metroCode"],
        throughput="50",
        throughput_unit="Mbps",
    )])
