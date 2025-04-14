import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
i_nfobloxsv = equinix.networkedge.Device("INFOBLOX-SV",
    name="TF_INFOBLOX",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-GRID-MEMBER",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    core_count=8,
    term_length=1,
    vendor_configuration={
        "adminPassword": "xxxxxx",
        "ipAddress": "X.X.X.X",
        "subnetMaskIp": "X.X.X.X",
        "gatewayIp": "X.X.X.X",
    })
