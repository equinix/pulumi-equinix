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
    /// Device and VLAN must be in the same metro.
    /// 
    /// If you need this resource to add the port back to bond on removal, set `force_bond = true`.
    /// 
    /// To learn more about Layer 2 networking in Equinix Metal, refer to
    /// 
    /// * https://metal.equinix.com/developers/docs/networking/layer2/
    /// * https://metal.equinix.com/developers/docs/networking/layer2-configs/
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
    /// ### example 1
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Equinix.Metal.Vlan("test", new()
    ///     {
    ///         Description = "VLAN in New York",
    ///         Metro = "ny",
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var testDevice = new Equinix.Metal.Device("testDevice", new()
    ///     {
    ///         Hostname = "test",
    ///         Plan = Equinix.Metal.Plan.C3SmallX86,
    ///         Metro = "ny",
    ///         OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
    ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    ///     {
    ///         DeviceId = testDevice.Id,
    ///         Type = "hybrid",
    ///     });
    /// 
    ///     var testPortVlanAttachment = new Equinix.Metal.PortVlanAttachment("testPortVlanAttachment", new()
    ///     {
    ///         DeviceId = testDeviceNetworkType.Id,
    ///         PortName = "eth1",
    ///         VlanVnid = test.Vxlan,
    ///     });
    /// 
    /// });
    /// ```
    /// ### example 2
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Equinix.Metal.Device("test", new()
    ///     {
    ///         Hostname = "test",
    ///         Plan = Equinix.Metal.Plan.C3SmallX86,
    ///         Metro = "ny",
    ///         OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
    ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    ///     {
    ///         DeviceId = test.Id,
    ///         Type = "layer2-individual",
    ///     });
    /// 
    ///     var test1 = new Equinix.Metal.Vlan("test1", new()
    ///     {
    ///         Description = "VLAN in New York",
    ///         Metro = "ny",
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var test2 = new Equinix.Metal.Vlan("test2", new()
    ///     {
    ///         Description = "VLAN in New Jersey",
    ///         Metro = "ny",
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var test1PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test1PortVlanAttachment", new()
    ///     {
    ///         DeviceId = testDeviceNetworkType.Id,
    ///         VlanVnid = test1.Vxlan,
    ///         PortName = "eth1",
    ///     });
    /// 
    ///     var test2PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test2PortVlanAttachment", new()
    ///     {
    ///         DeviceId = testDeviceNetworkType.Id,
    ///         VlanVnid = test2.Vxlan,
    ///         PortName = "eth1",
    ///         Native = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             test1PortVlanAttachment,
    ///         },
    ///     });
    /// 
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
        /// Add port back to the bond when this resource is removed. Default is `false`.
        /// </summary>
        [Output("forceBond")]
        public Output<bool?> ForceBond { get; private set; } = null!;

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
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
                PluginDownloadURL = "github://api.github.com/equinix",
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
        /// Add port back to the bond when this resource is removed. Default is `false`.
        /// </summary>
        [Input("forceBond")]
        public Input<bool>? ForceBond { get; set; }

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
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
        /// Add port back to the bond when this resource is removed. Default is `false`.
        /// </summary>
        [Input("forceBond")]
        public Input<bool>? ForceBond { get; set; }

        /// <summary>
        /// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `depends_on` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
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
