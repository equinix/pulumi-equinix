// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal;

import com.equinix.pulumi.equinix.Utilities;
import com.equinix.pulumi.equinix.metal.VirtualCircuitArgs;
import com.equinix.pulumi.equinix.metal.inputs.VirtualCircuitState;
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
 * Use this resource to associate VLAN with a Dedicated Port from
 * [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/#associating-a-vlan-with-a-dedicated-port).
 * 
 * &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
 * 
 * ## Example Usage
 * 
 * Pick an existing Project and dedicated Connection, create a VLAN and use `equinix.metal.VirtualCircuit`
 * to associate it with a Primary Port of the Connection.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.MetalFunctions;
 * import com.pulumi.equinix.metal.inputs.GetConnectionArgs;
 * import com.pulumi.equinix.metal.Vlan;
 * import com.pulumi.equinix.metal.VlanArgs;
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
 *         final var projectId = &#34;52000fb2-ee46-4673-93a8-de2c2bdba33c&#34;;
 * 
 *         final var connId = &#34;73f12f29-3e19-43a0-8e90-ae81580db1e0&#34;;
 * 
 *         final var testConnection = MetalFunctions.getConnection(GetConnectionArgs.builder()
 *             .connectionId(connId)
 *             .build());
 * 
 *         var testVlan = new Vlan(&#34;testVlan&#34;, VlanArgs.builder()        
 *             .projectId(projectId)
 *             .metro(testConnection.applyValue(getConnectionResult -&gt; getConnectionResult.metro()))
 *             .build());
 * 
 *         var testVirtualCircuit = new VirtualCircuit(&#34;testVirtualCircuit&#34;, VirtualCircuitArgs.builder()        
 *             .connectionId(connId)
 *             .projectId(projectId)
 *             .portId(testConnection.applyValue(getConnectionResult -&gt; getConnectionResult.ports()[0].id()))
 *             .vlanId(testVlan.id())
 *             .nniVlan(1056)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing Virtual Circuit ID
 * 
 * ```sh
 *  $ pulumi import equinix:metal/virtualCircuit:VirtualCircuit equinix_metal_virtual_circuit {existing_id}
 * ```
 * 
 */
@ResourceType(type="equinix:metal/virtualCircuit:VirtualCircuit")
public class VirtualCircuit extends com.pulumi.resources.CustomResource {
    /**
     * UUID of Connection where the VC is scoped to.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return UUID of Connection where the VC is scoped to.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
     * 
     */
    @Export(name="customerIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerIp;

    /**
     * @return The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
     * 
     */
    public Output<Optional<String>> customerIp() {
        return Codegen.optional(this.customerIp);
    }
    /**
     * Description for the Virtual Circuit resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the Virtual Circuit resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The password that can be set for the VRF BGP peer
     * 
     */
    @Export(name="md5", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> md5;

    /**
     * @return The password that can be set for the VRF BGP peer
     * 
     */
    public Output<Optional<String>> md5() {
        return Codegen.optional(this.md5);
    }
    /**
     * The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
     * 
     */
    @Export(name="metalIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metalIp;

    /**
     * @return The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
     * 
     */
    public Output<Optional<String>> metalIp() {
        return Codegen.optional(this.metalIp);
    }
    /**
     * Name of the Virtual Circuit resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Virtual Circuit resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Equinix Metal network-to-network VLAN ID.
     * 
     */
    @Export(name="nniVlan", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> nniVlan;

    /**
     * @return Equinix Metal network-to-network VLAN ID.
     * 
     */
    public Output<Optional<Integer>> nniVlan() {
        return Codegen.optional(this.nniVlan);
    }
    /**
     * NNI VLAN parameters, see the [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
     * 
     */
    @Export(name="nniVnid", refs={Integer.class}, tree="[0]")
    private Output<Integer> nniVnid;

    /**
     * @return NNI VLAN parameters, see the [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
     * 
     */
    public Output<Integer> nniVnid() {
        return this.nniVnid;
    }
    /**
     * The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the local_asn of the VRF.
     * 
     */
    @Export(name="peerAsn", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> peerAsn;

    /**
     * @return The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the local_asn of the VRF.
     * 
     */
    public Output<Optional<Integer>> peerAsn() {
        return Codegen.optional(this.peerAsn);
    }
    /**
     * UUID of the Connection Port where the VC is scoped to.
     * 
     */
    @Export(name="portId", refs={String.class}, tree="[0]")
    private Output<String> portId;

    /**
     * @return UUID of the Connection Port where the VC is scoped to.
     * 
     */
    public Output<String> portId() {
        return this.portId;
    }
    /**
     * UUID of the Project where the VC is scoped to.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return UUID of the Project where the VC is scoped to.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Speed of the Virtual Circuit resource.
     * 
     */
    @Export(name="speed", refs={String.class}, tree="[0]")
    private Output<String> speed;

    /**
     * @return Speed of the Virtual Circuit resource.
     * 
     */
    public Output<String> speed() {
        return this.speed;
    }
    /**
     * Status of the virtal circuit.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the virtal circuit.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A subnet from one of the IP
     * blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
     * * For a /31 block, it will only have two IP addresses, which will be used for
     *   the metal_ip and customer_ip.
     * * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     * 
     */
    @Export(name="subnet", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnet;

    /**
     * @return A subnet from one of the IP
     * blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
     * * For a /31 block, it will only have two IP addresses, which will be used for
     *   the metal_ip and customer_ip.
     * * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     * 
     */
    public Output<Optional<String>> subnet() {
        return Codegen.optional(this.subnet);
    }
    /**
     * Tags for the Virtual Circuit resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags for the Virtual Circuit resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * UUID of the VLAN to associate.
     * 
     */
    @Export(name="vlanId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanId;

    /**
     * @return UUID of the VLAN to associate.
     * 
     */
    public Output<Optional<String>> vlanId() {
        return Codegen.optional(this.vlanId);
    }
    /**
     * VNID VLAN parameter, see the [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
     * 
     */
    @Export(name="vnid", refs={Integer.class}, tree="[0]")
    private Output<Integer> vnid;

    /**
     * @return VNID VLAN parameter, see the [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
     * 
     */
    public Output<Integer> vnid() {
        return this.vnid;
    }
    /**
     * UUID of the VRF to associate.
     * 
     */
    @Export(name="vrfId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vrfId;

    /**
     * @return UUID of the VRF to associate.
     * 
     */
    public Output<Optional<String>> vrfId() {
        return Codegen.optional(this.vrfId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualCircuit(String name) {
        this(name, VirtualCircuitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualCircuit(String name, VirtualCircuitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualCircuit(String name, VirtualCircuitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/virtualCircuit:VirtualCircuit", name, args == null ? VirtualCircuitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualCircuit(String name, Output<String> id, @Nullable VirtualCircuitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/virtualCircuit:VirtualCircuit", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "md5"
            ))
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
    public static VirtualCircuit get(String name, Output<String> id, @Nullable VirtualCircuitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualCircuit(name, id, state, options);
    }
}
