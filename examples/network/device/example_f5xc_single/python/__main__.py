import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
f5_xc_single = equinix.networkedge.Device("f5xc-single",
    name="tf-f5xc",
    project_id="XXXXXX",
    metro_code=sv.metro_code,
    type_code="F5XC",
    self_managed=True,
    byol=True,
    connectivity="INTERNET-ACCESS",
    package_code="STD",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=1,
    account_number=sv.number,
    acl_template_id="xxxx",
    version="9.2025.17",
    interface_count=8,
    core_count=8,
    vendor_configuration={
        "token": "XXXXXXXXXX",
        "hostname": "XXXX",
    })
