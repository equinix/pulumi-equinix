import pulumi
import pulumi_equinix as equinix

tf_project1 = equinix.metal.Project("tfProject1",
    name="tftest",
    bgp_config=equinix.metal.ProjectBgpConfigArgs(
        deployment_type="local",
        md5="C179c28c41a85b",
        asn=65000,
    ))
