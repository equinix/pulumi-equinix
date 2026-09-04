import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
nios_x_ha = equinix.networkedge.Device("nios-x-ha",
    secondary_device={
        "name": "TF_INFOBLOX-NIOS-X-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "hostname": "test",
            "token": "xxxxx",
        },
    },
    name="TF_INFOBLOX-NIOS-X",
    project_id="xxxxxxx",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-NIOSX",
    self_managed=True,
    connectivity="INTERNET-ACCESS",
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="4.0",
    core_count=3,
    interface_count=5,
    term_length=1,
    vendor_configuration={
        "hostname": "test",
        "token": "xxxxx",
    })
