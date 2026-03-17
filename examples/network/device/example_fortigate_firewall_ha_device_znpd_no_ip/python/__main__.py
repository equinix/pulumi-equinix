import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
f_tntfirewallsv = equinix.networkedge.Device("FTNT-FIREWALL-SV",
    name="TF_FTNT-FIREWALL",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="FG-VM",
    interface_count=10,
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.6.3",
    hostname="test",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "ipAddressType": "NO_IP_ADDRESS",
    },
    secondary_device={
        "name": "TF_FTNT-FIREWALL-secondary",
        "metro_code": sv.metro_code,
        "hostname": "fg-vm-znpd",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "ipAddressType": "NO_IP_ADDRESS",
        },
    })
