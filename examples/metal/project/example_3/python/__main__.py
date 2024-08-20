import pulumi
import pulumi_equinix as equinix

existing_project = equinix.metal.Project("existingProject",
    name="The name of the project (if different, will rewrite)",
    bgp_config=equinix.metal.ProjectBgpConfigArgs(
        deployment_type="local",
        md5="C179c28c41a85b",
        asn=65000,
    ))
