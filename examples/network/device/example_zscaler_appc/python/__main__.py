import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
zscaler_appc_single = equinix.networkedge.Device("zscaler-appc-single",
    name="tf-zscaler-appc",
    project_id="XXXXXX",
    metro_code=sv.metro_code,
    type_code="ZSCALER-APPC",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="STD",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="23.395.1",
    interface_count=1,
    core_count=4,
    vendor_configuration={
        "provisioningKey": "XXXXXXXXXX",
        "hostname": "XXXX",
    },
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    })
