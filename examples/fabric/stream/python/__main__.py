import pulumi
import pulumi_equinix as equinix

new_stream = equinix.fabric.Stream("newStream",
    type="TELEMETRY_STREAM",
    name="<name_of_stream_resource>",
    description="<description_of_stream_resource>",
    project={
        "project_id": "<destination_project_id_for_stream",
    })
pulumi.export("streamState", new_stream.state)
