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
    /// Use this resource to create Metal Gateway resources in Equinix Metal.
    /// 
    /// &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create Metal Gateway for a VLAN with a private IPv4 block with 8 IP addresses
    ///     var testVlan = new Equinix.Metal.Vlan("testVlan", new()
    ///     {
    ///         Description = "test VLAN in SV",
    ///         Metro = "sv",
    ///         ProjectId = local.Project_id,
    ///     });
    /// 
    ///     var testGateway = new Equinix.Metal.Gateway("testGateway", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         VlanId = testVlan.Id,
    ///         PrivateIpv4SubnetSize = 8,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create Metal Gateway for a VLAN and reserved IP address block
    ///     var testVlan = new Equinix.Metal.Vlan("testVlan", new()
    ///     {
    ///         Description = "test VLAN in SV",
    ///         Metro = "sv",
    ///         ProjectId = local.Project_id,
    ///     });
    /// 
    ///     var testReservedIpBlock = new Equinix.Metal.ReservedIpBlock("testReservedIpBlock", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         Metro = "sv",
    ///         Quantity = 2,
    ///     });
    /// 
    ///     var testGateway = new Equinix.Metal.Gateway("testGateway", new()
    ///     {
    ///         ProjectId = local.Project_id,
    ///         VlanId = testVlan.Id,
    ///         IpReservationId = testReservedIpBlock.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/gateway:Gateway")]
    public partial class Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// UUID of Public or VRF IP Reservation to associate with the gateway, the
        /// reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        /// </summary>
        [Output("ipReservationId")]
        public Output<string?> IpReservationId { get; private set; } = null!;

        /// <summary>
        /// Size of the private IPv4 subnet to create for this metal
        /// gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        /// </summary>
        [Output("privateIpv4SubnetSize")]
        public Output<int> PrivateIpv4SubnetSize { get; private set; } = null!;

        /// <summary>
        /// UUID of the project where the gateway is scoped to.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Status of the gateway resource.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// UUID of the VLAN where the gateway is scoped to.
        /// </summary>
        [Output("vlanId")]
        public Output<string> VlanId { get; private set; } = null!;

        /// <summary>
        /// UUID of the VRF associated with the IP Reservation
        /// </summary>
        [Output("vrfId")]
        public Output<string> VrfId { get; private set; } = null!;


        /// <summary>
        /// Create a Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gateway(string name, GatewayArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/gateway:Gateway", name, args ?? new GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gateway(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/gateway:Gateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gateway Get(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Gateway(name, id, state, options);
        }
    }

    public sealed class GatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// UUID of Public or VRF IP Reservation to associate with the gateway, the
        /// reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        /// </summary>
        [Input("ipReservationId")]
        public Input<string>? IpReservationId { get; set; }

        /// <summary>
        /// Size of the private IPv4 subnet to create for this metal
        /// gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        /// </summary>
        [Input("privateIpv4SubnetSize")]
        public Input<int>? PrivateIpv4SubnetSize { get; set; }

        /// <summary>
        /// UUID of the project where the gateway is scoped to.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// UUID of the VLAN where the gateway is scoped to.
        /// </summary>
        [Input("vlanId", required: true)]
        public Input<string> VlanId { get; set; } = null!;

        public GatewayArgs()
        {
        }
        public static new GatewayArgs Empty => new GatewayArgs();
    }

    public sealed class GatewayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// UUID of Public or VRF IP Reservation to associate with the gateway, the
        /// reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        /// </summary>
        [Input("ipReservationId")]
        public Input<string>? IpReservationId { get; set; }

        /// <summary>
        /// Size of the private IPv4 subnet to create for this metal
        /// gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        /// </summary>
        [Input("privateIpv4SubnetSize")]
        public Input<int>? PrivateIpv4SubnetSize { get; set; }

        /// <summary>
        /// UUID of the project where the gateway is scoped to.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Status of the gateway resource.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// UUID of the VLAN where the gateway is scoped to.
        /// </summary>
        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        /// <summary>
        /// UUID of the VRF associated with the IP Reservation
        /// </summary>
        [Input("vrfId")]
        public Input<string>? VrfId { get; set; }

        public GatewayState()
        {
        }
        public static new GatewayState Empty => new GatewayState();
    }
}
