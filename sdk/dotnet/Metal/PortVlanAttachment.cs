// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    /// <summary>
    /// Provides a resource to attach device ports to VLANs.
    /// 
    /// Device and VLAN must be in the same facility.
    /// 
    /// If you need this resource to add the port back to bond on removal, set `force_bond = true`.
    /// 
    /// To learn more about Layer 2 networking in Equinix Metal, refer to
    /// 
    /// * &lt;https://metal.equinix.com/developers/docs/networking/layer2/&gt;
    /// * &lt;https://metal.equinix.com/developers/docs/networking/layer2-configs/&gt;
    /// 
    /// ## Attribute Referece
    /// 
    /// In addition to all arguments above, the following attributes are exported:
    /// 
    /// * `id` - UUID of device port used in the assignment.
    /// * `vlan_id` - UUID of VLAN API resource.
    /// * `port_id` - UUID of device port.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var deviceId = config.Require("deviceId");
    ///     var portName = config.Get("portName") ?? "eth1";
    ///     var vxlanId = config.GetNumber("vxlanId") ?? 1004;
    ///     var attach = new Equinix.Metal.PortVlanAttachment("attach", new()
    ///     {
    ///         DeviceId = deviceId,
    ///         PortName = portName,
    ///         VlanVnid = vxlanId,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["attachId"] = attach.Id,
    ///         ["portId"] = attach.PortId,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/portVlanAttachment:PortVlanAttachment")]
    public partial class PortVlanAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of device to be assigned to the VLAN.
        /// </summary>
        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// Add port back to the bond when this resource is removed. Default is
        /// `false`.
        /// </summary>
        [Output("forceBond")]
        public Output<bool?> ForceBond { get; private set; } = null!;

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this
        /// assignment assigns second or further VLAN to the port. To ensure that this attachment is not first
        /// on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just
        /// like in the layer2-individual example above.
        /// </summary>
        [Output("native")]
        public Output<bool?> Native { get; private set; } = null!;

        /// <summary>
        /// UUID of device port
        /// </summary>
        [Output("portId")]
        public Output<string> PortId { get; private set; } = null!;

        /// <summary>
        /// Name of network port to be assigned to the VLAN.
        /// </summary>
        [Output("portName")]
        public Output<string> PortName { get; private set; } = null!;

        /// <summary>
        /// UUID of VLAN API resource
        /// </summary>
        [Output("vlanId")]
        public Output<string> VlanId { get; private set; } = null!;

        /// <summary>
        /// VXLAN Network Identifier.
        /// </summary>
        [Output("vlanVnid")]
        public Output<int> VlanVnid { get; private set; } = null!;


        /// <summary>
        /// Create a PortVlanAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PortVlanAttachment(string name, PortVlanAttachmentArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/portVlanAttachment:PortVlanAttachment", name, args ?? new PortVlanAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PortVlanAttachment(string name, Input<string> id, PortVlanAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/portVlanAttachment:PortVlanAttachment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1680197579+b252741a.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PortVlanAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PortVlanAttachment Get(string name, Input<string> id, PortVlanAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new PortVlanAttachment(name, id, state, options);
        }
    }

    public sealed class PortVlanAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of device to be assigned to the VLAN.
        /// </summary>
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        /// <summary>
        /// Add port back to the bond when this resource is removed. Default is
        /// `false`.
        /// </summary>
        [Input("forceBond")]
        public Input<bool>? ForceBond { get; set; }

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this
        /// assignment assigns second or further VLAN to the port. To ensure that this attachment is not first
        /// on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just
        /// like in the layer2-individual example above.
        /// </summary>
        [Input("native")]
        public Input<bool>? Native { get; set; }

        /// <summary>
        /// Name of network port to be assigned to the VLAN.
        /// </summary>
        [Input("portName", required: true)]
        public Input<string> PortName { get; set; } = null!;

        /// <summary>
        /// VXLAN Network Identifier.
        /// </summary>
        [Input("vlanVnid", required: true)]
        public Input<int> VlanVnid { get; set; } = null!;

        public PortVlanAttachmentArgs()
        {
        }
        public static new PortVlanAttachmentArgs Empty => new PortVlanAttachmentArgs();
    }

    public sealed class PortVlanAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of device to be assigned to the VLAN.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Add port back to the bond when this resource is removed. Default is
        /// `false`.
        /// </summary>
        [Input("forceBond")]
        public Input<bool>? ForceBond { get; set; }

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this
        /// assignment assigns second or further VLAN to the port. To ensure that this attachment is not first
        /// on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just
        /// like in the layer2-individual example above.
        /// </summary>
        [Input("native")]
        public Input<bool>? Native { get; set; }

        /// <summary>
        /// UUID of device port
        /// </summary>
        [Input("portId")]
        public Input<string>? PortId { get; set; }

        /// <summary>
        /// Name of network port to be assigned to the VLAN.
        /// </summary>
        [Input("portName")]
        public Input<string>? PortName { get; set; }

        /// <summary>
        /// UUID of VLAN API resource
        /// </summary>
        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        /// <summary>
        /// VXLAN Network Identifier.
        /// </summary>
        [Input("vlanVnid")]
        public Input<int>? VlanVnid { get; set; }

        public PortVlanAttachmentState()
        {
        }
        public static new PortVlanAttachmentState Empty => new PortVlanAttachmentState();
    }
}
