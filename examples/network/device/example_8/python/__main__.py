import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
bluecat_edge_service_point_cloudinit_primary_file = equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_cloudinit_secondary_file = equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_ha = equinix.networkedge.Device("bluecatEdgeServicePointHa",
    name="tf-bluecat-edge-service-point-p",
    metro_code=sv.metro_code,
    type_code="BLUECAT-EDGE-SERVICE-POINT",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    account_number=sv.number,
    cloud_init_file_id=bluecat_edge_service_point_cloudinit_primary_file.uuid,
    version="4.6.3",
    core_count=4,
    term_length=12,
    secondary_device=equinix.networkedge.DeviceSecondaryDeviceArgs(
        name="tf-bluecat-edge-service-point-s",
        metro_code=sv.metro_code,
        notifications=["test@eq.com"],
        account_number=sv.number,
        cloud_init_file_id=bluecat_edge_service_point_cloudinit_secondary_file.uuid,
    ))
