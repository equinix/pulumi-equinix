import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
f_tntfirewallsv = equinix.networkedge.Device("FTNT-FIREWALL-SV",
    name="TF_FTNT-FIREWALL",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    interface_count=10,
    type_code="FG-VM",
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
        "gatewayIp": "X.X.X.X",
        "ipAddress": "X.X.X.X",
        "ipAddressType": "STATIC",
        "subnetMaskIp": "x.x.x.x",
        "managementInterfaceId": "6",
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
            "gatewayIp": "X.X.X.X",
            "ipAddress": "X.X.X.X",
            "ipAddressType": "STATIC",
            "subnetMaskIp": "X.X.X.X",
            "managementInterfaceId": "6",
        },
    })
