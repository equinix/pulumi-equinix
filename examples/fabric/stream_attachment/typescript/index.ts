import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const asset = new equinix.fabric.StreamAttachment("asset", {
    assetId: "<id_of_the_asset_being_attached>",
    asset: "<asset_group>",
    streamId: "<id_of_the_stream_asset_is_being_attached_to>",
});
