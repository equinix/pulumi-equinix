import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
metro = config.get("metro")
if metro is None:
    metro = "SV"
network_file = equinix.networkedge.NetworkFile("networkFile",
    file_name="Aviatrix-ZTP-file",
    content=pulumi.FileAsset("./assets/aviatrix-cloud-init.txt"),
    metro_code=metro,
    device_type_code="AVIATRIX_EDGE",
    process_type="CLOUD_INIT",
    self_managed=True,
    byol=True)
pulumi.export("networkFileId", network_file.id)
pulumi.export("networkFileStatus", network_file.status)
