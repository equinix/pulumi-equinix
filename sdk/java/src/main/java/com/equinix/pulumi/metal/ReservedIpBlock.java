// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.ReservedIpBlockArgs;
import com.equinix.pulumi.metal.inputs.ReservedIpBlockState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create and manage blocks of reserved IP addresses in a project.
 * 
 * When a user provisions first device in a metro, Equinix Metal API automatically allocates IPv6/56 and private IPv4/25 blocks. The new device then gets IPv6 and private IPv4 addresses from those block. It also gets a public IPv4/31 address. Every new device in the project and metro will automatically get IPv6 and private IPv4 addresses from these pre-allocated blocks. The IPv6 and private IPv4 blocks can&#39;t be created, only imported. With this resource, it&#39;s possible to create either public IPv4 blocks or global IPv4 blocks.
 * 
 * Public blocks are allocated in a metro. Addresses from public blocks can only be assigned to devices in the metro. Public blocks can have mask from /24 (256 addresses) to /32 (1 address). If you create public block with this resource, you must fill the metro argument.
 * 
 * Addresses from global blocks can be assigned in any metro. Global blocks can have mask from /30 (4 addresses), to /32 (1 address). If you create global block with this resource, you must specify type = &#34;global_ipv4&#34; and you must omit the metro argument.
 * 
 * Once IP block is allocated or imported, an address from it can be assigned to device with the `equinix.metal.IpAttachment` resource.
 * 
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.equinix.pulumi.metal.ReservedIpBlock;
 * import com.equinix.pulumi.metal.ReservedIpBlockArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var projectId = config.get("projectId").get();
 *         final var metro = config.get("metro").orElse("FR");
 *         final var type = config.get("type").orElse("public_ipv4");
 *         final var quantity = Integer.parseInt(config.get("quantity").orElse("1"));
 *         var ipBlock = new ReservedIpBlock("ipBlock", ReservedIpBlockArgs.builder()        
 *             .projectId(projectId)
 *             .type(type)
 *             .quantity(quantity)
 *             .metro(metro)
 *             .build());
 * 
 *         ctx.export("ipBlockId", ipBlock.id());
 *         ctx.export("ipBlockSubent", ipBlock.cidrNotation());
 *     }
 * }
 * }
 * </pre>
 * 
 * ## Import
 * 
 * This resource can be imported using an existing IP reservation ID:
 * 
 * ```sh
 * $ pulumi import equinix:metal/reservedIpBlock:ReservedIpBlock equinix_metal_reserved_ip_block {existing_ip_reservation_id}
 * ```
 * 
 */
@ResourceType(type="equinix:metal/reservedIpBlock:ReservedIpBlock")
public class ReservedIpBlock extends com.pulumi.resources.CustomResource {
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }
    /**
     * Address family as integer. One of `4` or `6`.
     * 
     */
    @Export(name="addressFamily", refs={Integer.class}, tree="[0]")
    private Output<Integer> addressFamily;

    /**
     * @return Address family as integer. One of `4` or `6`.
     * 
     */
    public Output<Integer> addressFamily() {
        return this.addressFamily;
    }
    /**
     * Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrf_id`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
     * 
     */
    @Export(name="cidr", refs={Integer.class}, tree="[0]")
    private Output<Integer> cidr;

    /**
     * @return Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrf_id`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
     * 
     */
    public Output<Integer> cidr() {
        return this.cidr;
    }
    /**
     * Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
     * 
     */
    @Export(name="cidrNotation", refs={String.class}, tree="[0]")
    private Output<String> cidrNotation;

    /**
     * @return Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
     * 
     */
    public Output<String> cidrNotation() {
        return this.cidrNotation;
    }
    @Export(name="customData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customData;

    public Output<Optional<String>> customData() {
        return Codegen.optional(this.customData);
    }
    /**
     * Arbitrary description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Arbitrary description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Facility where to allocate the public IP address block, makes sense only if type is `public_ipv4` and must be empty if type is `global_ipv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
     * 
     */
    @Export(name="facility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> facility;

    /**
     * @return Facility where to allocate the public IP address block, makes sense only if type is `public_ipv4` and must be empty if type is `global_ipv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
     * 
     */
    public Output<Optional<String>> facility() {
        return Codegen.optional(this.facility);
    }
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output<String> gateway;

    public Output<String> gateway() {
        return this.gateway;
    }
    /**
     * Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
     * 
     */
    @Export(name="global", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> global;

    /**
     * @return Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
     * 
     */
    public Output<Boolean> global() {
        return this.global;
    }
    @Export(name="manageable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> manageable;

    public Output<Boolean> manageable() {
        return this.manageable;
    }
    @Export(name="management", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> management;

    public Output<Boolean> management() {
        return this.management;
    }
    /**
     * Metro where to allocate the public IP address block, makes sense only if type is `public_ipv4` and must be empty if type is `global_ipv4`. Conflicts with `facility`.
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metro;

    /**
     * @return Metro where to allocate the public IP address block, makes sense only if type is `public_ipv4` and must be empty if type is `global_ipv4`. Conflicts with `facility`.
     * 
     */
    public Output<Optional<String>> metro() {
        return Codegen.optional(this.metro);
    }
    /**
     * Mask in decimal notation, e.g. `255.255.255.0`.
     * 
     */
    @Export(name="netmask", refs={String.class}, tree="[0]")
    private Output<String> netmask;

    /**
     * @return Mask in decimal notation, e.g. `255.255.255.0`.
     * 
     */
    public Output<String> netmask() {
        return this.netmask;
    }
    /**
     * Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ip_range` in the specified VRF.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ip_range` in the specified VRF.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The metal project ID where to allocate the address block.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The metal project ID where to allocate the address block.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Boolean flag whether addresses from a block are public.
     * 
     */
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    /**
     * @return Boolean flag whether addresses from a block are public.
     * 
     */
    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
     * 
     */
    @Export(name="quantity", refs={Integer.class}, tree="[0]")
    private Output<Integer> quantity;

    /**
     * @return The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
     * 
     */
    public Output<Integer> quantity() {
        return this.quantity;
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
     * One of `global_ipv4`, `public_ipv4`, or `vrf`. Defaults to `public_ipv4` for backward compatibility.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return One of `global_ipv4`, `public_ipv4`, or `vrf`. Defaults to `public_ipv4` for backward compatibility.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
     * 
     */
    @Export(name="vrfId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vrfId;

    /**
     * @return Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
     * 
     */
    public Output<Optional<String>> vrfId() {
        return Codegen.optional(this.vrfId);
    }
    /**
     * Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
     * 
     */
    @Export(name="waitForState", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> waitForState;

    /**
     * @return Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
     * 
     */
    public Output<Optional<String>> waitForState() {
        return Codegen.optional(this.waitForState);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReservedIpBlock(String name) {
        this(name, ReservedIpBlockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReservedIpBlock(String name, ReservedIpBlockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReservedIpBlock(String name, ReservedIpBlockArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/reservedIpBlock:ReservedIpBlock", name, args == null ? ReservedIpBlockArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReservedIpBlock(String name, Output<String> id, @Nullable ReservedIpBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/reservedIpBlock:ReservedIpBlock", name, state, makeResourceOptions(options, id));
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
    public static ReservedIpBlock get(String name, Output<String> id, @Nullable ReservedIpBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReservedIpBlock(name, id, state, options);
    }
}
