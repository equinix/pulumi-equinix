import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
i_nfobloxsv = equinix.networkedge.Device("INFOBLOX-SV",
    name="TF_INFOBLOX",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-GRID-MEMBER",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    core_count=8,
    term_length=1,
    vendor_configuration={
        "adminPassword": "X.X.X.X",
        "ipAddress": "X.X.X.X",
        "subnetMaskIp": "X.X.X.X",
        "gatewayIp": "X.X.X.X",
    },
    secondary_device={
        "name": "TF_INFOBLOX-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "adminPassword": "X.X.X.X",
            "ipAddress": "X.X.X.X",
            "subnetMaskIp": "X.X.X.X",
            "gatewayIp": "X.X.X.X",
        },
    })
