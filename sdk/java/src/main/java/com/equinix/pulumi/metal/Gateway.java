// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.GatewayArgs;
import com.equinix.pulumi.metal.inputs.GatewayState;
import com.equinix.pulumi.metal.outputs.GatewayTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create Metal Gateway resources in Equinix Metal.
 * 
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.equinix.pulumi.metal.Gateway;
 * import com.equinix.pulumi.metal.GatewayArgs;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var projectId = config.get(&#34;projectId&#34;).get();
 *         final var vlanId = config.get(&#34;vlanId&#34;).get();
 *         var gateway = new Gateway(&#34;gateway&#34;, GatewayArgs.builder()        
 *             .projectId(projectId)
 *             .vlanId(vlanId)
 *             .privateIpv4SubnetSize(8)
 *             .build());
 * 
 *         ctx.export(&#34;gatewayState&#34;, gateway.state());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:metal/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
     * 
     */
    @Export(name="ipReservationId", refs={String.class}, tree="[0]")
    private Output<String> ipReservationId;

    /**
     * @return UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
     * 
     */
    public Output<String> ipReservationId() {
        return this.ipReservationId;
    }
    /**
     * Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
     * 
     */
    @Export(name="privateIpv4SubnetSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> privateIpv4SubnetSize;

    /**
     * @return Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
     * 
     */
    public Output<Integer> privateIpv4SubnetSize() {
        return this.privateIpv4SubnetSize;
    }
    /**
     * UUID of the project where the gateway is scoped to.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return UUID of the project where the gateway is scoped to.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Status of the gateway resource.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Status of the gateway resource.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    @Export(name="timeouts", refs={GatewayTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ GatewayTimeouts> timeouts;

    public Output<Optional<GatewayTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * UUID of the VLAN where the gateway is scoped to.
     * 
     */
    @Export(name="vlanId", refs={String.class}, tree="[0]")
    private Output<String> vlanId;

    /**
     * @return UUID of the VLAN where the gateway is scoped to.
     * 
     */
    public Output<String> vlanId() {
        return this.vlanId;
    }
    /**
     * UUID of the VRF associated with the IP Reservation
     * 
     */
    @Export(name="vrfId", refs={String.class}, tree="[0]")
    private Output<String> vrfId;

    /**
     * @return UUID of the VRF associated with the IP Reservation
     * 
     */
    public Output<String> vrfId() {
        return this.vrfId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/gateway:Gateway", name, state, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
