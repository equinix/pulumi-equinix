import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

config = pulumi.Config()
filepath = config.get("filepath")
if filepath is None:
    filepath = "cloudInitFileFolder/TF-AVX-cloud-init-file.txt"
sv = equinix.networkedge.get_account_output(metro_code="SV")
aviatrix_cloudinit_file = equinix.networkedge.NetworkFile("aviatrixCloudinitFile",
    file_name="TF-AVX-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="AVIATRIX_TRANSIT_EDGE",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
aviatrix_transit_edge_single = equinix.networkedge.Device("aviatrix-transit-edge-single",
    name="tf-aviatrix",
    metro_code=sv.metro_code,
    type_code="AVIATRIX_TRANSIT_EDGE",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["john@equinix.com"],
    term_length=12,
    account_number=sv.number,
    version="7.2.a",
    core_count=2,
    cloud_init_file_id=aviatrix_cloudinit_file.uuid,
    acl_template_id="c06150ea-b604-4ad1-832a-d63936e9b938")
