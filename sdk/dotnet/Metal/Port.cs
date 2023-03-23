// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    [EquinixResourceType("equinix:metal/port:Port")]
    public partial class Port : global::Pulumi.CustomResource
    {
        /// <summary>
        /// UUID of the bond port.
        /// </summary>
        [Output("bondId")]
        public Output<string> BondId { get; private set; } = null!;

        /// <summary>
        /// Name of the bond port.
        /// </summary>
        [Output("bondName")]
        public Output<string> BondName { get; private set; } = null!;

        /// <summary>
        /// Whether the port should be bonded.
        /// </summary>
        [Output("bonded")]
        public Output<bool> Bonded { get; private set; } = null!;

        /// <summary>
        /// Flag indicating whether the port can be removed from a bond.
        /// </summary>
        [Output("disbondSupported")]
        public Output<bool> DisbondSupported { get; private set; } = null!;

        /// <summary>
        /// Whether to put the port to Layer 2 mode, valid only for bond ports.
        /// </summary>
        [Output("layer2")]
        public Output<bool?> Layer2 { get; private set; } = null!;

        /// <summary>
        /// MAC address of the port.
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        /// <summary>
        /// Name of the port, e.g. `bond0` or `eth0`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// UUID of a VLAN to assign as a native VLAN. It must be one of
        /// attached VLANs (from `vlan_ids` parameter).
        /// </summary>
        [Output("nativeVlanId")]
        public Output<string?> NativeVlanId { get; private set; } = null!;

        /// <summary>
        /// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This
        /// attribute is only set on bond ports.
        /// </summary>
        [Output("networkType")]
        public Output<string> NetworkType { get; private set; } = null!;

        /// <summary>
        /// ID of the port to read.
        /// </summary>
        [Output("portId")]
        public Output<string> PortId { get; private set; } = null!;

        /// <summary>
        /// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
        /// </summary>
        [Output("resetOnDelete")]
        public Output<bool?> ResetOnDelete { get; private set; } = null!;

        /// <summary>
        /// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        [Output("vlanIds")]
        public Output<ImmutableArray<string>> VlanIds { get; private set; } = null!;

        /// <summary>
        /// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        [Output("vxlanIds")]
        public Output<ImmutableArray<int>> VxlanIds { get; private set; } = null!;


        /// <summary>
        /// Create a Port resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Port(string name, PortArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/port:Port", name, args ?? new PortArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Port(string name, Input<string> id, PortState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/port:Port", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1679576138+f6b31edc.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Port resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Port Get(string name, Input<string> id, PortState? state = null, CustomResourceOptions? options = null)
        {
            return new Port(name, id, state, options);
        }
    }

    public sealed class PortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the port should be bonded.
        /// </summary>
        [Input("bonded", required: true)]
        public Input<bool> Bonded { get; set; } = null!;

        /// <summary>
        /// Whether to put the port to Layer 2 mode, valid only for bond ports.
        /// </summary>
        [Input("layer2")]
        public Input<bool>? Layer2 { get; set; }

        /// <summary>
        /// UUID of a VLAN to assign as a native VLAN. It must be one of
        /// attached VLANs (from `vlan_ids` parameter).
        /// </summary>
        [Input("nativeVlanId")]
        public Input<string>? NativeVlanId { get; set; }

        /// <summary>
        /// ID of the port to read.
        /// </summary>
        [Input("portId", required: true)]
        public Input<string> PortId { get; set; } = null!;

        /// <summary>
        /// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
        /// </summary>
        [Input("resetOnDelete")]
        public Input<bool>? ResetOnDelete { get; set; }

        [Input("vlanIds")]
        private InputList<string>? _vlanIds;

        /// <summary>
        /// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        public InputList<string> VlanIds
        {
            get => _vlanIds ?? (_vlanIds = new InputList<string>());
            set => _vlanIds = value;
        }

        [Input("vxlanIds")]
        private InputList<int>? _vxlanIds;

        /// <summary>
        /// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        public InputList<int> VxlanIds
        {
            get => _vxlanIds ?? (_vxlanIds = new InputList<int>());
            set => _vxlanIds = value;
        }

        public PortArgs()
        {
        }
        public static new PortArgs Empty => new PortArgs();
    }

    public sealed class PortState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// UUID of the bond port.
        /// </summary>
        [Input("bondId")]
        public Input<string>? BondId { get; set; }

        /// <summary>
        /// Name of the bond port.
        /// </summary>
        [Input("bondName")]
        public Input<string>? BondName { get; set; }

        /// <summary>
        /// Whether the port should be bonded.
        /// </summary>
        [Input("bonded")]
        public Input<bool>? Bonded { get; set; }

        /// <summary>
        /// Flag indicating whether the port can be removed from a bond.
        /// </summary>
        [Input("disbondSupported")]
        public Input<bool>? DisbondSupported { get; set; }

        /// <summary>
        /// Whether to put the port to Layer 2 mode, valid only for bond ports.
        /// </summary>
        [Input("layer2")]
        public Input<bool>? Layer2 { get; set; }

        /// <summary>
        /// MAC address of the port.
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// Name of the port, e.g. `bond0` or `eth0`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// UUID of a VLAN to assign as a native VLAN. It must be one of
        /// attached VLANs (from `vlan_ids` parameter).
        /// </summary>
        [Input("nativeVlanId")]
        public Input<string>? NativeVlanId { get; set; }

        /// <summary>
        /// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This
        /// attribute is only set on bond ports.
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// ID of the port to read.
        /// </summary>
        [Input("portId")]
        public Input<string>? PortId { get; set; }

        /// <summary>
        /// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
        /// </summary>
        [Input("resetOnDelete")]
        public Input<bool>? ResetOnDelete { get; set; }

        /// <summary>
        /// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vlanIds")]
        private InputList<string>? _vlanIds;

        /// <summary>
        /// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        public InputList<string> VlanIds
        {
            get => _vlanIds ?? (_vlanIds = new InputList<string>());
            set => _vlanIds = value;
        }

        [Input("vxlanIds")]
        private InputList<int>? _vxlanIds;

        /// <summary>
        /// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid
        /// ports.
        /// </summary>
        public InputList<int> VxlanIds
        {
            get => _vxlanIds ?? (_vxlanIds = new InputList<int>());
            set => _vxlanIds = value;
        }

        public PortState()
        {
        }
        public static new PortState Empty => new PortState();
    }
}
