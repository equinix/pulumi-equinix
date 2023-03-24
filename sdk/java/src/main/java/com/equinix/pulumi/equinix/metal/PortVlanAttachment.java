// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal;

import com.equinix.pulumi.equinix.Utilities;
import com.equinix.pulumi.equinix.metal.PortVlanAttachmentArgs;
import com.equinix.pulumi.equinix.metal.inputs.PortVlanAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to attach device ports to VLANs.
 * 
 * Device and VLAN must be in the same facility.
 * 
 * If you need this resource to add the port back to bond on removal, set `force_bond = true`.
 * 
 * To learn more about Layer 2 networking in Equinix Metal, refer to
 * 
 * * &lt;https://metal.equinix.com/developers/docs/networking/layer2/&gt;
 * * &lt;https://metal.equinix.com/developers/docs/networking/layer2-configs/&gt;
 * 
 * ## Attribute Referece
 * 
 * In addition to all arguments above, the following attributes are exported:
 * 
 * * `id` - UUID of device port used in the assignment.
 * * `vlan_id` - UUID of VLAN API resource.
 * * `port_id` - UUID of device port.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.PortVlanAttachment;
 * import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
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
 *         final var deviceId = config.get(&#34;deviceId&#34;);
 *         final var portName = config.get(&#34;portName&#34;).orElse(&#34;eth1&#34;);
 *         final var vxlanId = config.get(&#34;vxlanId&#34;).orElse(1004);
 *         var attach = new PortVlanAttachment(&#34;attach&#34;, PortVlanAttachmentArgs.builder()        
 *             .deviceId(deviceId)
 *             .portName(portName)
 *             .vlanVnid(vxlanId)
 *             .build());
 * 
 *         ctx.export(&#34;attachId&#34;, attach.id());
 *         ctx.export(&#34;portId&#34;, attach.portId());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:metal/portVlanAttachment:PortVlanAttachment")
public class PortVlanAttachment extends com.pulumi.resources.CustomResource {
    /**
     * ID of device to be assigned to the VLAN.
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return ID of device to be assigned to the VLAN.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * Add port back to the bond when this resource is removed. Default is
     * `false`.
     * 
     */
    @Export(name="forceBond", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceBond;

    /**
     * @return Add port back to the bond when this resource is removed. Default is
     * `false`.
     * 
     */
    public Output<Optional<Boolean>> forceBond() {
        return Codegen.optional(this.forceBond);
    }
    /**
     * Mark this VLAN a native VLAN on the port. This can be used only if this
     * assignment assigns second or further VLAN to the port. To ensure that this attachment is not first
     * on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just
     * like in the layer2-individual example above.
     * 
     */
    @Export(name="native", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> native_;

    /**
     * @return Mark this VLAN a native VLAN on the port. This can be used only if this
     * assignment assigns second or further VLAN to the port. To ensure that this attachment is not first
     * on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just
     * like in the layer2-individual example above.
     * 
     */
    public Output<Optional<Boolean>> native_() {
        return Codegen.optional(this.native_);
    }
    /**
     * UUID of device port
     * 
     */
    @Export(name="portId", refs={String.class}, tree="[0]")
    private Output<String> portId;

    /**
     * @return UUID of device port
     * 
     */
    public Output<String> portId() {
        return this.portId;
    }
    /**
     * Name of network port to be assigned to the VLAN.
     * 
     */
    @Export(name="portName", refs={String.class}, tree="[0]")
    private Output<String> portName;

    /**
     * @return Name of network port to be assigned to the VLAN.
     * 
     */
    public Output<String> portName() {
        return this.portName;
    }
    /**
     * UUID of VLAN API resource
     * 
     */
    @Export(name="vlanId", refs={String.class}, tree="[0]")
    private Output<String> vlanId;

    /**
     * @return UUID of VLAN API resource
     * 
     */
    public Output<String> vlanId() {
        return this.vlanId;
    }
    /**
     * VXLAN Network Identifier.
     * 
     */
    @Export(name="vlanVnid", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanVnid;

    /**
     * @return VXLAN Network Identifier.
     * 
     */
    public Output<Integer> vlanVnid() {
        return this.vlanVnid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PortVlanAttachment(String name) {
        this(name, PortVlanAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PortVlanAttachment(String name, PortVlanAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PortVlanAttachment(String name, PortVlanAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/portVlanAttachment:PortVlanAttachment", name, args == null ? PortVlanAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PortVlanAttachment(String name, Output<String> id, @Nullable PortVlanAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/portVlanAttachment:PortVlanAttachment", name, state, makeResourceOptions(options, id));
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
    public static PortVlanAttachment get(String name, Output<String> id, @Nullable PortVlanAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PortVlanAttachment(name, id, state, options);
    }
}
