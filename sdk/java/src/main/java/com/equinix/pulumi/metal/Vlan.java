// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.VlanArgs;
import com.equinix.pulumi.metal.inputs.VlanState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to allow users to manage Virtual Networks in their projects.
 * 
 * To learn more about Layer 2 networking in Equinix Metal, refer to
 * 
 * * https://metal.equinix.com/developers/docs/networking/layer2/
 * * https://metal.equinix.com/developers/docs/networking/layer2-configs/
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.equinix.pulumi.metal.Vlan;
 * import com.equinix.pulumi.metal.VlanArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var projectId = config.get(&#34;projectId&#34;).get();
 *         final var metro = config.get(&#34;metro&#34;).orElse(&#34;DA&#34;);
 *         final var vxlan = Integer.parseInt(config.get(&#34;vxlan&#34;).get());
 *         var vlan = new Vlan(&#34;vlan&#34;, VlanArgs.builder()        
 *             .description(&#34;VLAN in Dallas&#34;)
 *             .projectId(projectId)
 *             .metro(metro)
 *             .vxlan(vxlan)
 *             .build());
 * 
 *         ctx.export(&#34;vlanId&#34;, vlan.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing VLAN ID (UUID):
 * 
 * ```sh
 * $ pulumi import equinix:metal/vlan:Vlan equinix_metal_vlan {existing_vlan_id}
 * ```
 * 
 */
@ResourceType(type="equinix:metal/vlan:Vlan")
public class Vlan extends com.pulumi.resources.CustomResource {
    /**
     * Description string.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description string.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Export(name="facility", refs={String.class}, tree="[0]")
    private Output<String> facility;

    /**
     * @return Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
     * 
     */
    public Output<String> facility() {
        return this.facility;
    }
    /**
     * Metro in which to create the VLAN
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output<String> metro;

    /**
     * @return Metro in which to create the VLAN
     * 
     */
    public Output<String> metro() {
        return this.metro;
    }
    /**
     * ID of parent project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return ID of parent project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * VLAN ID, must be unique in metro.
     * 
     */
    @Export(name="vxlan", refs={Integer.class}, tree="[0]")
    private Output<Integer> vxlan;

    /**
     * @return VLAN ID, must be unique in metro.
     * 
     */
    public Output<Integer> vxlan() {
        return this.vxlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vlan(String name) {
        this(name, VlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vlan(String name, VlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vlan(String name, VlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vlan:Vlan", name, args == null ? VlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vlan(String name, Output<String> id, @Nullable VlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vlan:Vlan", name, state, makeResourceOptions(options, id));
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
    public static Vlan get(String name, Output<String> id, @Nullable VlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vlan(name, id, state, options);
    }
}
