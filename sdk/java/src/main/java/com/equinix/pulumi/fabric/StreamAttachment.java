// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.StreamAttachmentArgs;
import com.equinix.pulumi.fabric.inputs.StreamAttachmentState;
import com.equinix.pulumi.fabric.outputs.StreamAttachmentTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Stream Attachments
 * 
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.fabric.StreamAttachment;
 * import com.pulumi.equinix.fabric.StreamAttachmentArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var asset = new StreamAttachment("asset", StreamAttachmentArgs.builder()
 *             .asset("<asset_group>")
 *             .assetId("<id_of_the_asset_being_attached>")
 *             .streamId("<id_of_the_stream_asset_is_being_attached_to>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="equinix:fabric/streamAttachment:StreamAttachment")
public class StreamAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Equinix defined asset category. Matches the product name the asset is a part of
     * 
     */
    @Export(name="asset", refs={String.class}, tree="[0]")
    private Output<String> asset;

    /**
     * @return Equinix defined asset category. Matches the product name the asset is a part of
     * 
     */
    public Output<String> asset() {
        return this.asset;
    }
    /**
     * Equinix defined UUID of the asset being attached to the stream
     * 
     */
    @Export(name="assetId", refs={String.class}, tree="[0]")
    private Output<String> assetId;

    /**
     * @return Equinix defined UUID of the asset being attached to the stream
     * 
     */
    public Output<String> assetId() {
        return this.assetId;
    }
    /**
     * Value representing status for the stream attachment
     * 
     */
    @Export(name="attachmentStatus", refs={String.class}, tree="[0]")
    private Output<String> attachmentStatus;

    /**
     * @return Value representing status for the stream attachment
     * 
     */
    public Output<String> attachmentStatus() {
        return this.attachmentStatus;
    }
    /**
     * Equinix auto generated URI to the stream attachment in Equinix Portal
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Equinix auto generated URI to the stream attachment in Equinix Portal
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Boolean value indicating enablement of metrics for this asset stream attachment
     * 
     */
    @Export(name="metricsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> metricsEnabled;

    /**
     * @return Boolean value indicating enablement of metrics for this asset stream attachment
     * 
     */
    public Output<Boolean> metricsEnabled() {
        return this.metricsEnabled;
    }
    /**
     * UUID of the stream that is the target of this asset attachment
     * 
     */
    @Export(name="streamId", refs={String.class}, tree="[0]")
    private Output<String> streamId;

    /**
     * @return UUID of the stream that is the target of this asset attachment
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }
    @Export(name="timeouts", refs={StreamAttachmentTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ StreamAttachmentTimeouts> timeouts;

    public Output<Optional<StreamAttachmentTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Equinix defined type for the asset stream attachment
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Equinix defined type for the asset stream attachment
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix-assigned unique id for the stream attachment
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix-assigned unique id for the stream attachment
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamAttachment(java.lang.String name) {
        this(name, StreamAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamAttachment(java.lang.String name, StreamAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamAttachment(java.lang.String name, StreamAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/streamAttachment:StreamAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable StreamAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/streamAttachment:StreamAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamAttachmentArgs makeArgs(StreamAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamAttachmentArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/equinix")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StreamAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamAttachment(name, id, state, options);
    }
}
