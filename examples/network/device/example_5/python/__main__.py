import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
vsrx_single = equinix.networkedge.Device("vsrxSingle",
    name="tf-c8kv-sdwan",
    metro_code=sv.metro_code,
    type_code="VSRX",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    hostname="VSRX",
    account_number=sv.number,
    version="23.2R1.13",
    core_count=2,
    term_length=12,
    additional_bandwidth=5,
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    diverse_device_id="ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
    ssh_key={
        "username": "test-username",
        "key_name": "valid-key-name",
    },
    acl_template_id="3e548c02-9164-4197-aa23-05b1f644883c")
