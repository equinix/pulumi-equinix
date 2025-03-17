import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
f_tntsdwansv = equinix.networkedge.Device("FTNT-SDWAN-SV",
    name="TF_FTNT-SDWAN",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="FG-SDWAN",
    self_managed=True,
    byol=True,
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.0.14",
    hostname="test",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    acl_template_id="XXXXXXXX",
    vendor_configuration={
        "adminPassword": "XXXXX",
        "controller1": "X.X.X.X",
    })
