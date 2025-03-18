import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
cisco_ftdsv = equinix.networkedge.Device("cisco-FTD-SV",
    name="TF_Cisco_NGFW_CLUSTER_ZNPD",
    project_id="XXXXXXX",
    metro_code=sv.metro_code,
    type_code="Cisco_NGFW",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="FTDv10",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.0.4-55",
    hostname="test",
    core_count=4,
    term_length=1,
    interface_count=10,
    cluster_details={
        "cluster_name": "tf-ftd-cluster",
        "node0": {
            "vendor_configuration": {
                "hostname": "test",
                "activation_key": "XXXXX",
                "controller1": "X.X.X.X",
                "management_type": "FMC",
            },
        },
        "node1": {
            "vendor_configuration": {
                "hostname": "test",
                "management_type": "FMC",
            },
        },
    })
