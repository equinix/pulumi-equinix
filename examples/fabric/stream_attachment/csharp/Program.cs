using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var asset = new Equinix.Fabric.StreamAttachment("asset", new()
    {
        AssetId = "<id_of_the_asset_being_attached>",
        Asset = "<asset_group>",
        StreamId = "<id_of_the_stream_asset_is_being_attached_to>",
    });

});

