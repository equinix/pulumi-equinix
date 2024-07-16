import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

config = pulumi.Config()
filepath = config.get("filepath")
if filepath is None:
    filepath = "fileFolder/fileName.txt"
test_file = equinix.networkedge.NetworkFile("test-file",
    file_name="fileName.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=equinix.Metro.SILICON_VALLEY,
    device_type_code="AVIATRIX_EDGE",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
