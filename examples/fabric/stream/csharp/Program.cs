using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newStream = new Equinix.Fabric.Stream("newStream", new()
    {
        Type = "TELEMETRY_STREAM",
        Name = "<name_of_stream_resource>",
        Description = "<description_of_stream_resource>",
        Project = new Equinix.Fabric.Inputs.StreamProjectArgs
        {
            ProjectId = "<destination_project_id_for_stream",
        },
    });

    return new Dictionary<string, object?>
    {
        ["streamState"] = newStream.State,
    };
});

