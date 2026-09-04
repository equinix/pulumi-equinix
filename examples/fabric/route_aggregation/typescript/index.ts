import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newRa = new equinix.fabric.RouteAggregation("new-ra", {
    type: "BGP_IPv4_PREFIX_AGGREGATION",
    name: "new-ra",
    description: "Test aggregation",
    project: {
        projectId: "776847000642406",
    },
});
