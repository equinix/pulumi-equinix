// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal;

import com.equinix.pulumi.equinix.Utilities;
import com.equinix.pulumi.equinix.metal.VrfArgs;
import com.equinix.pulumi.equinix.metal.inputs.VrfState;
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
 * Use this resource to manage a VRF.
 * 
 * &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Vrf;
 * import com.pulumi.equinix.metal.VrfArgs;
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
 *         final var projectId = config.get(&#34;projectId&#34;);
 *         final var metro = config.get(&#34;metro&#34;).orElse(&#34;DA&#34;);
 *         var vrf = new Vrf(&#34;vrf&#34;, VrfArgs.builder()        
 *             .description(&#34;VRF with ASN 65000 and a pool of address space&#34;)
 *             .name(&#34;example-vrf&#34;)
 *             .metro(metro)
 *             .localAsn(&#34;65000&#34;)
 *             .ipRanges(            
 *                 &#34;192.168.100.0/25&#34;,
 *                 &#34;192.168.200.0/25&#34;)
 *             .projectId(projectId)
 *             .build());
 * 
 *         ctx.export(&#34;vrfId&#34;, vrf.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing VRF ID: &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
 * 
 */
@ResourceType(type="equinix:metal/vrf:Vrf")
public class Vrf extends com.pulumi.resources.CustomResource {
    /**
     * Description of the VRF.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the VRF.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
     * 
     */
    @Export(name="ipRanges", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipRanges;

    /**
     * @return All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
     * 
     */
    public Output<Optional<List<String>>> ipRanges() {
        return Codegen.optional(this.ipRanges);
    }
    /**
     * The 4-byte ASN set on the VRF.
     * 
     */
    @Export(name="localAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> localAsn;

    /**
     * @return The 4-byte ASN set on the VRF.
     * 
     */
    public Output<Integer> localAsn() {
        return this.localAsn;
    }
    /**
     * Metro ID or Code where the VRF will be deployed.
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output<String> metro;

    /**
     * @return Metro ID or Code where the VRF will be deployed.
     * 
     */
    public Output<String> metro() {
        return this.metro;
    }
    /**
     * User-supplied name of the VRF, unique to the project
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return User-supplied name of the VRF, unique to the project
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Project ID where the VRF will be deployed.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project ID where the VRF will be deployed.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vrf(String name) {
        this(name, VrfArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vrf(String name, VrfArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vrf(String name, VrfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vrf:Vrf", name, args == null ? VrfArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vrf(String name, Output<String> id, @Nullable VrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vrf:Vrf", name, state, makeResourceOptions(options, id));
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
    public static Vrf get(String name, Output<String> id, @Nullable VrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vrf(name, id, state, options);
    }
}
