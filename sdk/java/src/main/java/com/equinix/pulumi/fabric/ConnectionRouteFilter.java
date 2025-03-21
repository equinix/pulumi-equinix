// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.ConnectionRouteFilterArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionRouteFilterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows attachment of Route Filter Polices to Fabric Connections
 * 
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
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
 * import com.pulumi.equinix.fabric.ConnectionRouteFilter;
 * import com.pulumi.equinix.fabric.ConnectionRouteFilterArgs;
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
 *         var policyAttachment = new ConnectionRouteFilter("policyAttachment", ConnectionRouteFilterArgs.builder()
 *             .connectionId("<connection_uuid>")
 *             .routeFilterId("<route_filter_policy_uuid>")
 *             .direction("INBOUND")
 *             .build());
 * 
 *         ctx.export("connectionRouteFilterId", policyAttachment.id());
 *         ctx.export("connectionRouteFilterConnectionId", policyAttachment.connectionId());
 *         ctx.export("connectionRouteFilterDirection", policyAttachment.direction());
 *         ctx.export("connectionRouteFilterType", policyAttachment.type());
 *         ctx.export("connectionRouteFilterAttachmentStatus", policyAttachment.attachmentStatus());
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="equinix:fabric/connectionRouteFilter:ConnectionRouteFilter")
public class ConnectionRouteFilter extends com.pulumi.resources.CustomResource {
    /**
     * Status of the Route Filter Policy attachment lifecycle
     * 
     */
    @Export(name="attachmentStatus", refs={String.class}, tree="[0]")
    private Output<String> attachmentStatus;

    /**
     * @return Status of the Route Filter Policy attachment lifecycle
     * 
     */
    public Output<String> attachmentStatus() {
        return this.attachmentStatus;
    }
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * Direction of the filtering of the attached Route Filter Policy
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output<String> direction;

    /**
     * @return Direction of the filtering of the attached Route Filter Policy
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * URI to the attached Route Filter Policy on the Connection
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return URI to the attached Route Filter Policy on the Connection
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    @Export(name="routeFilterId", refs={String.class}, tree="[0]")
    private Output<String> routeFilterId;

    /**
     * @return Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    public Output<String> routeFilterId() {
        return this.routeFilterId;
    }
    /**
     * Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix Assigned ID for Route Filter Policy
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix Assigned ID for Route Filter Policy
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionRouteFilter(java.lang.String name) {
        this(name, ConnectionRouteFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionRouteFilter(java.lang.String name, ConnectionRouteFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionRouteFilter(java.lang.String name, ConnectionRouteFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/connectionRouteFilter:ConnectionRouteFilter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectionRouteFilter(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionRouteFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/connectionRouteFilter:ConnectionRouteFilter", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionRouteFilterArgs makeArgs(ConnectionRouteFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionRouteFilterArgs.Empty : args;
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
    public static ConnectionRouteFilter get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionRouteFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionRouteFilter(name, id, state, options);
    }
}
