import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfProject1 = new equinix.metal.Project("tfProject1", {name: "Terraform Fun"});
