import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
c8_kv_single = equinix.networkedge.Device("c8kvSingle",
    name="tf-c8kv",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    notifications=["test@equinix.com"],
    hostname="C8KV",
    account_number=sv.number,
    version="17.06.01a",
    core_count=2,
    term_length=12,
    license_token="valid-license-token",
    additional_bandwidth=5,
    ssh_key=equinix.networkedge.DeviceSshKeyArgs(
        username="test-username",
        key_name="valid-key-name",
    ),
    acl_template_id="3e548c02-9164-4197-aa23-05b1f644883c")
