// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.IpAttachmentArgs;
import com.equinix.pulumi.metal.inputs.IpAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to attach elastic IP subnets to devices.
 * 
 * To attach an IP subnet from a reserved block to a provisioned device, you must derive a subnet CIDR belonging to one of your reserved blocks in the same project and metro as the target device.
 * 
 * For example, you have reserved IPv4 address block `147.229.10.152/30`, you can choose to assign either the whole block as one subnet to a device; or 2 subnets with CIDRs `147.229.10.152/31` and `147.229.10.154/31`; or 4 subnets with mask prefix length `32`. More about the elastic IP subnets is [here](https://metal.equinix.com/developers/docs/networking/elastic-ips/).
 * 
 * Device and reserved block must be in the same metro.
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.ReservedIpBlock;
 * import com.pulumi.equinix.metal.ReservedIpBlockArgs;
 * import com.pulumi.equinix.metal.IpAttachment;
 * import com.pulumi.equinix.metal.IpAttachmentArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.CidrhostArgs;
 * import com.pulumi.std.inputs.JoinArgs;
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
 *         var myblock = new ReservedIpBlock("myblock", ReservedIpBlockArgs.builder()
 *             .projectId(projectId)
 *             .metro("ny")
 *             .quantity(2)
 *             .build());
 * 
 *         var firstAddressAssignment = new IpAttachment("firstAddressAssignment", IpAttachmentArgs.builder()
 *             .deviceId(mydevice.id())
 *             .cidrNotation(StdFunctions.join(JoinArgs.builder()
 *                 .separator("/")
 *                 .input(                
 *                     StdFunctions.cidrhost(CidrhostArgs.builder()
 *                         .input(myblockMetalReservedIpBlock.cidrNotation())
 *                         .host(0)
 *                         .build()).applyValue(_invoke -> _invoke.result()),
 *                     "32")
 *                 .build()).applyValue(_invoke -> _invoke.result()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:metal/ipAttachment:IpAttachment")
public class IpAttachment extends com.pulumi.resources.CustomResource {
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
     * Length of CIDR prefix of the subnet as integer.
     * 
     */
    @Export(name="cidr", refs={Integer.class}, tree="[0]")
    private Output<Integer> cidr;

    /**
     * @return Length of CIDR prefix of the subnet as integer.
     * 
     */
    public Output<Integer> cidr() {
        return this.cidr;
    }
    /**
     * CIDR notation of subnet from block reserved in the same project and metro as the device.
     * 
     */
    @Export(name="cidrNotation", refs={String.class}, tree="[0]")
    private Output<String> cidrNotation;

    /**
     * @return CIDR notation of subnet from block reserved in the same project and metro as the device.
     * 
     */
    public Output<String> cidrNotation() {
        return this.cidrNotation;
    }
    /**
     * ID of device to which to assign the subnet.
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return ID of device to which to assign the subnet.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * IP address of gateway for the subnet.
     * 
     */
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output<String> gateway;

    /**
     * @return IP address of gateway for the subnet.
     * 
     */
    public Output<String> gateway() {
        return this.gateway;
    }
    /**
     * Flag indicating whether IP block is global, i.e. assignable in any location
     * 
     */
    @Export(name="global", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> global;

    /**
     * @return Flag indicating whether IP block is global, i.e. assignable in any location
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
     * Subnet mask in decimal notation, e.g., `255.255.255.0`.
     * 
     */
    @Export(name="netmask", refs={String.class}, tree="[0]")
    private Output<String> netmask;

    /**
     * @return Subnet mask in decimal notation, e.g., `255.255.255.0`.
     * 
     */
    public Output<String> netmask() {
        return this.netmask;
    }
    /**
     * Subnet network address.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return Subnet network address.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Boolean flag whether subnet is reachable from the Internet.
     * 
     */
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    /**
     * @return Boolean flag whether subnet is reachable from the Internet.
     * 
     */
    public Output<Boolean> public_() {
        return this.public_;
    }
    @Export(name="vrfId", refs={String.class}, tree="[0]")
    private Output<String> vrfId;

    public Output<String> vrfId() {
        return this.vrfId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpAttachment(java.lang.String name) {
        this(name, IpAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpAttachment(java.lang.String name, IpAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpAttachment(java.lang.String name, IpAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/ipAttachment:IpAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IpAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable IpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/ipAttachment:IpAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static IpAttachmentArgs makeArgs(IpAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IpAttachmentArgs.Empty : args;
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
    public static IpAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable IpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpAttachment(name, id, state, options);
    }
}
