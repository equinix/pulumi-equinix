import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
six_wind_vsr = equinix.networkedge.Device("six-wind-vsr",
    ssh_key={
        "username": "xxxx",
        "key_name": "xxxxx",
    },
    secondary_device={
        "name": "6WIND-VSR-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "hostname": "test",
            "token": "xxxx",
        },
    },
    name="6WIND-VSR",
    project_id="xxxxxxx",
    metro_code=sv.metro_code,
    type_code="6WIND-VSR",
    self_managed=True,
    byol=True,
    interface_count=10,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="3.10.8",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "hostname": "test",
        "token": "xxxx",
    })
