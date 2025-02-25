import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newStream = new equinix.fabric.Stream("newStream", {
    type: "TELEMETRY_STREAM",
    name: "<name_of_stream_resource>",
    description: "<description_of_stream_resource>",
    project: {
        projectId: "<destination_project_id_for_stream",
    },
});
export const streamState = newStream.state;
