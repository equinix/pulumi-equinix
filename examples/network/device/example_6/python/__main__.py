import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("testPublicKey",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
arista_ha = equinix.networkedge.Device("aristaHa",
    name="tf-arista-p",
    metro_code=sv.metro_code,
    type_code="ARISTA-ROUTER",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="CloudEOS",
    notifications=["test@equinix.com"],
    hostname="arista-p",
    account_number=sv.number,
    version="4.29.0",
    core_count=4,
    term_length=12,
    additional_bandwidth=5,
    ssh_key={
        "username": "test-username",
        "key_name": test_public_key.name,
    },
    acl_template_id="c637a17b-7a6a-4486-924b-30e6c36904b0",
    secondary_device={
        "name": "tf-arista-s",
        "metro_code": sv.metro_code,
        "hostname": "arista-s",
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "acl_template_id": "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    })
