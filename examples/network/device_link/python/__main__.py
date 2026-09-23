import pulumi
import pulumi_equinix as equinix

test = equinix.networkedge.DeviceLink("test",
    devices=[
        {
            "id": test_equinix_network_device["uuid"],
            "interface_id": 6,
        },
        {
            "id": test_equinix_network_device["secondaryDevice"][0]["uuid"],
            "interface_id": 7,
        },
    ],
    metro_links=[
        {
            "account_number": test_equinix_network_device["accountNumber"],
            "metro_code": test_equinix_network_device["metroCode"],
            "throughput": "50",
            "throughput_unit": "Mbps",
        },
        {
            "account_number": test_equinix_network_device["secondaryDevice"][0]["accountNumber"],
            "metro_code": test_equinix_network_device["secondaryDevice"][0]["metroCode"],
            "throughput": "50",
            "throughput_unit": "Mbps",
        },
    ],
    name="test-DLG",
    project_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
