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
 * 
 * Create a VRF in your desired metro and project with any IP ranges that you want the VRF to route and forward.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Project;
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
 *         var exampleProject = new Project(&#34;exampleProject&#34;);
 * 
 *         var exampleVrf = new Vrf(&#34;exampleVrf&#34;, VrfArgs.builder()        
 *             .description(&#34;VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25&#34;)
 *             .metro(&#34;da&#34;)
 *             .localAsn(&#34;65000&#34;)
 *             .ipRanges(            
 *                 &#34;192.168.100.0/25&#34;,
 *                 &#34;192.168.200.0/25&#34;)
 *             .projectId(exampleProject.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Create IP reservations and assign them to a Metal Gateway resources. The Gateway will be assigned the first address in the block.
 * ```java
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
 *         var exampleReservedIpBlock = new ReservedIpBlock(&#34;exampleReservedIpBlock&#34;, ReservedIpBlockArgs.builder()        
 *             .description(&#34;Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF&#39;s pool of address space.&#34;)
 *             .projectId(equinix_metal_project.example().id())
 *             .metro(equinix_metal_vrf.example().metro())
 *             .type(&#34;vrf&#34;)
 *             .vrfId(equinix_metal_vrf.example().id())
 *             .cidr(29)
 *             .network(&#34;192.168.100.0&#34;)
 *             .build());
 * 
 *         var exampleVlan = new Vlan(&#34;exampleVlan&#34;, VlanArgs.builder()        
 *             .description(&#34;A VLAN for Layer2 and Hybrid Metal devices&#34;)
 *             .metro(equinix_metal_vrf.example().metro())
 *             .projectId(equinix_metal_project.example().id())
 *             .build());
 * 
 *         var exampleGateway = new Gateway(&#34;exampleGateway&#34;, GatewayArgs.builder()        
 *             .projectId(equinix_metal_project.example().id())
 *             .vlanId(exampleVlan.id())
 *             .ipReservationId(exampleReservedIpBlock.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Attach a Virtual Circuit from a Dedicated Metal Connection to the Metal Gateway.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.MetalFunctions;
 * import com.pulumi.equinix.metal.inputs.GetConnectionArgs;
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
 *         final var exampleConnection = MetalFunctions.getConnection(GetConnectionArgs.builder()
 *             .connectionId(var_.metal_dedicated_connection_id())
 *             .build());
 * 
 *         var exampleVirtualCircuit = new VirtualCircuit(&#34;exampleVirtualCircuit&#34;, VirtualCircuitArgs.builder()        
 *             .description(&#34;Virtual Circuit&#34;)
 *             .connectionId(exampleConnection.applyValue(getConnectionResult -&gt; getConnectionResult.id()))
 *             .projectId(equinix_metal_project.example().id())
 *             .portId(exampleConnection.applyValue(getConnectionResult -&gt; getConnectionResult.ports()[0].id()))
 *             .nniVlan(1024)
 *             .vrfId(equinix_metal_vrf.example().id())
 *             .peerAsn(65530)
 *             .subnet(&#34;192.168.100.16/31&#34;)
 *             .metalIp(&#34;192.168.100.16&#34;)
 *             .customerIp(&#34;192.168.100.17&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing VRF ID
 * 
 * ```sh
 *  $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id}
 * ```
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
