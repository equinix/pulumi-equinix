import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("testPublicKey",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
bluecat_bdds_ha = equinix.networkedge.Device("bluecatBddsHa",
    name="tf-bluecat-bdds-p",
    metro_code=sv.metro_code,
    type_code="BLUECAT",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    account_number=sv.number,
    version="9.6.0",
    core_count=2,
    term_length=12,
    vendor_configuration={
        "hostname": "test",
        "privateAddress": "x.x.x.x",
        "privateCidrMask": "24",
        "privateGateway": "x.x.x.x",
        "licenseKey": "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
        "licenseId": "xxxxxxxxxxxxxxx",
    },
    ssh_key=equinix.networkedge.DeviceSshKeyArgs(
        username="test-username",
        key_name=test_public_key.name,
    ),
    secondary_device=equinix.networkedge.DeviceSecondaryDeviceArgs(
        name="tf-bluecat-bdds-s",
        metro_code=sv.metro_code,
        notifications=["test@eq.com"],
        account_number=sv.number,
        vendor_configuration={
            "hostname": "test",
            "privateAddress": "x.x.x.x",
            "privateCidrMask": "24",
            "privateGateway": "x.x.x.x",
            "licenseKey": "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
            "licenseId": "xxxxxxxxxxxxxxx",
        },
    ))
