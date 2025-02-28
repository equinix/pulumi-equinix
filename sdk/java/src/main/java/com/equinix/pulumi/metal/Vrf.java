// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.VrfArgs;
import com.equinix.pulumi.metal.inputs.VrfState;
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
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 * 
 * ## Example Usage
 * ### example 1
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Project;
 * import com.pulumi.equinix.metal.ProjectArgs;
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
 *         var example = new Project("example", ProjectArgs.builder()
 *             .name("example")
 *             .build());
 * 
 *         var exampleVrf = new Vrf("exampleVrf", VrfArgs.builder()
 *             .description("VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25")
 *             .name("example-vrf")
 *             .metro("da")
 *             .localAsn(65000)
 *             .ipRanges(            
 *                 "192.168.100.0/25",
 *                 "192.168.200.0/25")
 *             .projectId(example.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 2
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.ReservedIpBlock;
 * import com.pulumi.equinix.metal.ReservedIpBlockArgs;
 * import com.pulumi.equinix.metal.Vlan;
 * import com.pulumi.equinix.metal.VlanArgs;
 * import com.pulumi.equinix.metal.Gateway;
 * import com.pulumi.equinix.metal.GatewayArgs;
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
 *         var example = new ReservedIpBlock("example", ReservedIpBlockArgs.builder()
 *             .description("Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.")
 *             .projectId(exampleEquinixMetalProject.id())
 *             .metro(exampleEquinixMetalVrf.metro())
 *             .type("vrf")
 *             .vrfId(exampleEquinixMetalVrf.id())
 *             .cidr(29)
 *             .network("192.168.100.0")
 *             .build());
 * 
 *         var exampleVlan = new Vlan("exampleVlan", VlanArgs.builder()
 *             .description("A VLAN for Layer2 and Hybrid Metal devices")
 *             .metro(exampleEquinixMetalVrf.metro())
 *             .projectId(exampleEquinixMetalProject.id())
 *             .build());
 * 
 *         var exampleGateway = new Gateway("exampleGateway", GatewayArgs.builder()
 *             .projectId(exampleEquinixMetalProject.id())
 *             .vlanId(exampleVlan.id())
 *             .ipReservationId(example.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 3
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.VirtualCircuit;
 * import com.pulumi.equinix.metal.VirtualCircuitArgs;
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
 *         var exampleVirtualCircuit = new VirtualCircuit("exampleVirtualCircuit", VirtualCircuitArgs.builder()
 *             .name("example-vc")
 *             .description("Virtual Circuit")
 *             .connectionId(example.id())
 *             .projectId(exampleEquinixMetalProject.id())
 *             .portId(example.ports()[0].id())
 *             .nniVlan(1024)
 *             .vrfId(exampleEquinixMetalVrf.id())
 *             .peerAsn(65530)
 *             .subnet("192.168.100.16/31")
 *             .metalIp("192.168.100.16")
 *             .customerIp("192.168.100.17")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 * ## Import
 * 
 * This resource can be imported using an existing VRF ID:
 * 
 * ```sh
 * $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id}
 * ```
 * 
 */
@ResourceType(type="equinix:metal/vrf:Vrf")
public class Vrf extends com.pulumi.resources.CustomResource {
    /**
     * Description of the VRF
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the VRF
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
     * Metro ID or Code where the VRF will be deployed
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output<String> metro;

    /**
     * @return Metro ID or Code where the VRF will be deployed
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
     * Project ID where the VRF will be deployed
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project ID where the VRF will be deployed
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vrf(java.lang.String name) {
        this(name, VrfArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vrf(java.lang.String name, VrfArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vrf(java.lang.String name, VrfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vrf:Vrf", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Vrf(java.lang.String name, Output<java.lang.String> id, @Nullable VrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/vrf:Vrf", name, state, makeResourceOptions(options, id), false);
    }

    private static VrfArgs makeArgs(VrfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VrfArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Vrf get(java.lang.String name, Output<java.lang.String> id, @Nullable VrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vrf(name, id, state, options);
    }
}
