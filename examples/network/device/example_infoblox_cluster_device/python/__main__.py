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
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    connectivity="PRIVATE",
    core_count=8,
    term_length=1,
    cluster_details={
        "cluster_name": "tf-infoblox-cluster",
        "node0": {
            "vendor_configuration": {
                "admin_password": "xxxxxxx",
                "ip_address": "X.X.X.X",
                "subnet_mask_ip": "X.X.X.X",
                "gateway_ip": "X.X.X.X",
            },
        },
        "node1": {
            "vendor_configuration": {
                "admin_password": "xxxxxxx",
                "ip_address": "X.X.X.X",
                "subnet_mask_ip": "X.X.X.X",
                "gateway_ip": "X.X.X.X",
            },
        },
    })
