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
    /// ## Example Usage
    /// 
    /// &gt; **NOTE:** This resource takes a named network type with any mode required parameters and converts a device to the named network type. This resource simulated the network type interface for Devices in the Equinix Metal Portal. That interface changed when additional network types were introduced with more diverse port configurations and it is not guaranteed to work in devices with more than two ethernet ports. See the Network Types Guide for examples of this resource and to learn about the recommended `equinix.metal.Port` alternative.
    /// 
    /// ## Import
    /// 
    /// This resource can also be imported using existing device ID
    /// 
    /// ```sh
    ///  $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/deviceNetworkType:DeviceNetworkType")]
    public partial class DeviceNetworkType : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the device on which the network type should be set.
        /// </summary>
        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
        /// and `layer2-bonded`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceNetworkType resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceNetworkType(string name, DeviceNetworkTypeArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/deviceNetworkType:DeviceNetworkType", name, args ?? new DeviceNetworkTypeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceNetworkType(string name, Input<string> id, DeviceNetworkTypeState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/deviceNetworkType:DeviceNetworkType", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1678463449+7a8d98d9.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DeviceNetworkType resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceNetworkType Get(string name, Input<string> id, DeviceNetworkTypeState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceNetworkType(name, id, state, options);
        }
    }

    public sealed class DeviceNetworkTypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the device on which the network type should be set.
        /// </summary>
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        /// <summary>
        /// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
        /// and `layer2-bonded`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeviceNetworkTypeArgs()
        {
        }
        public static new DeviceNetworkTypeArgs Empty => new DeviceNetworkTypeArgs();
    }

    public sealed class DeviceNetworkTypeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the device on which the network type should be set.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
        /// and `layer2-bonded`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DeviceNetworkTypeState()
        {
        }
        public static new DeviceNetworkTypeState Empty => new DeviceNetworkTypeState();
    }
}
