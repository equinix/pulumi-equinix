// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.InterconnectionArgs;
import com.equinix.pulumi.metal.inputs.InterconnectionState;
import com.equinix.pulumi.metal.outputs.InterconnectionPort;
import com.equinix.pulumi.metal.outputs.InterconnectionServiceToken;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to request the creation an Interconnection asset to connect with other parties using [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/).
 * 
 * &gt; Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.equinix.pulumi.metal.Interconnection;
 * import com.equinix.pulumi.metal.InterconnectionArgs;
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
 *         final var config = ctx.config();
 *         final var projectId = config.get(&#34;projectId&#34;).get();
 *         final var metro = config.get(&#34;metro&#34;).orElse(&#34;SV&#34;);
 *         final var speedInMbps = Integer.parseInt(config.get(&#34;speedInMbps&#34;).orElse(&#34;200&#34;));
 *         var connection = new Interconnection(&#34;connection&#34;, InterconnectionArgs.builder()        
 *             .name(&#34;fabric-port-to-metal&#34;)
 *             .projectId(projectId)
 *             .type(&#34;shared&#34;)
 *             .redundancy(&#34;primary&#34;)
 *             .metro(metro)
 *             .speed(String.format(&#34;%sMbps&#34;, speedInMbps))
 *             .serviceTokenType(&#34;z_side&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;connectionStatus&#34;, connection.status());
 *         ctx.export(&#34;connectionTokens&#34;, connection.serviceTokens());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:metal/interconnection:Interconnection")
public class Interconnection extends com.pulumi.resources.CustomResource {
    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
     * 
     */
    @Export(name="contactEmail", refs={String.class}, tree="[0]")
    private Output<String> contactEmail;

    /**
     * @return The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
     * 
     */
    public Output<String> contactEmail() {
        return this.contactEmail;
    }
    /**
     * Description for the connection resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description for the connection resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Facility where the connection will be created.   Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility. For more information, read the migration guide.
     * 
     */
    @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
    @Export(name="facility", refs={String.class}, tree="[0]")
    private Output<String> facility;

    /**
     * @return Facility where the connection will be created.   Use metro instead; read the facility to metro migration guide
     * 
     */
    public Output<String> facility() {
        return this.facility;
    }
    /**
     * Metro where the connection will be created.
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output<String> metro;

    /**
     * @return Metro where the connection will be created.
     * 
     */
    public Output<String> metro() {
        return this.metro;
    }
    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * Name of the connection resource
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the connection resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the organization where the connection is scoped to.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return ID of the organization where the connection is scoped to.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of
     * port is described in documentation of the
     * equinix.metal.Interconnection datasource.
     * 
     */
    @Export(name="ports", refs={List.class,InterconnectionPort.class}, tree="[0,1]")
    private Output<List<InterconnectionPort>> ports;

    /**
     * @return List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of
     * port is described in documentation of the
     * equinix.metal.Interconnection datasource.
     * 
     */
    public Output<List<InterconnectionPort>> ports() {
        return this.ports;
    }
    /**
     * ID of the project where the connection is scoped to, must be set for.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return ID of the project where the connection is scoped to, must be set for.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Connection redundancy - redundant or primary.
     * 
     */
    @Export(name="redundancy", refs={String.class}, tree="[0]")
    private Output<String> redundancy;

    /**
     * @return Connection redundancy - redundant or primary.
     * 
     */
    public Output<String> redundancy() {
        return this.redundancy;
    }
    /**
     * Only used with shared connection. Type of service token to use for the connection, a_side or z_side
     * 
     */
    @Export(name="serviceTokenType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceTokenType;

    /**
     * @return Only used with shared connection. Type of service token to use for the connection, a_side or z_side
     * 
     */
    public Output<Optional<String>> serviceTokenType() {
        return Codegen.optional(this.serviceTokenType);
    }
    /**
     * List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    @Export(name="serviceTokens", refs={List.class,InterconnectionServiceToken.class}, tree="[0,1]")
    private Output<List<InterconnectionServiceToken>> serviceTokens;

    /**
     * @return List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    public Output<List<InterconnectionServiceToken>> serviceTokens() {
        return this.serviceTokens;
    }
    /**
     * Connection speed -  Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    @Export(name="speed", refs={String.class}, tree="[0]")
    private Output<String> speed;

    /**
     * @return Connection speed -  Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    public Output<String> speed() {
        return this.speed;
    }
    /**
     * Status of the connection resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the connection resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * String list of tags.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return String list of tags.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
     * 
     * @deprecated
     * If your organization already has connection service tokens enabled, use `service_tokens` instead
     * 
     */
    @Deprecated /* If your organization already has connection service tokens enabled, use `service_tokens` instead */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output<String> token;

    /**
     * @return (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
     * 
     */
    public Output<String> token() {
        return this.token;
    }
    /**
     * Connection type - dedicated or shared.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Connection type - dedicated or shared.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
     * 
     */
    @Export(name="vlans", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> vlans;

    /**
     * @return Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
     * 
     */
    public Output<Optional<List<Integer>>> vlans() {
        return Codegen.optional(this.vlans);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Interconnection(String name) {
        this(name, InterconnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Interconnection(String name, InterconnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Interconnection(String name, InterconnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/interconnection:Interconnection", name, args == null ? InterconnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Interconnection(String name, Output<String> id, @Nullable InterconnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/interconnection:Interconnection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Interconnection get(String name, Output<String> id, @Nullable InterconnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Interconnection(name, id, state, options);
    }
}
