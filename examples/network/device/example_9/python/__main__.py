import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
panw_cluster = equinix.networkedge.Device("panwCluster",
    name="tf-panw",
    metro_code=sv.metro_code,
    type_code="PA-VM",
    self_managed=True,
    byol=True,
    package_code="VM100",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="11.1.3",
    interface_count=10,
    core_count=2,
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    cluster_details={
        "cluster_name": "tf-panw-cluster",
        "node0": {
            "vendor_configuration": {
                "hostname": "panw-node0",
                "panorama_ip_address": "x.x.x.x",
                "panorama_auth_key": "xxxxxxxxxxx",
            },
            "license_token": "licenseToken",
        },
        "node1": {
            "vendor_configuration": {
                "hostname": "panw-node1",
                "panorama_ip_address": "x.x.x.x",
                "panorama_auth_key": "xxxxxxxxxxx",
            },
            "license_token": "licenseToken",
        },
    })
