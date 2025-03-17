import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c_heckpointsv = equinix.networkedge.Device("CHECKPOINT-SV",
    name="TF_CHECKPOINT",
    project_id="XXXX",
    metro_code=sv.metro_code,
    type_code="CGUARD",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="R81.20",
    hostname="test",
    core_count=2,
    term_length=1,
    additional_bandwidth=5,
    acl_template_id="XXXXXXX",
    ssh_key={
        "username": "XXXXX",
        "key_name": "XXXXXX",
    })
