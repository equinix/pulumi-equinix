import pulumi
import pulumi_equinix as equinix

tf_project1 = equinix.metal.Project("tfProject1", name="Terraform Fun")
