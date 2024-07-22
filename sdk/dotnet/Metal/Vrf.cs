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
    /// Use this resource to manage a VRF.
    /// 
    /// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
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
    ///     var example = new Equinix.Metal.Project("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleVrf = new Equinix.Metal.Vrf("exampleVrf", new()
    ///     {
    ///         Description = "VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
    ///         Name = "example-vrf",
    ///         Metro = "da",
    ///         LocalAsn = 65000,
    ///         IpRanges = new[]
    ///         {
    ///             "192.168.100.0/25",
    ///             "192.168.200.0/25",
    ///         },
    ///         ProjectId = example.Id,
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
    ///     var example = new Equinix.Metal.ReservedIpBlock("example", new()
    ///     {
    ///         Description = "Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
    ///         ProjectId = exampleEquinixMetalProject.Id,
    ///         Metro = exampleEquinixMetalVrf.Metro,
    ///         Type = "vrf",
    ///         VrfId = exampleEquinixMetalVrf.Id,
    ///         Cidr = 29,
    ///         Network = "192.168.100.0",
    ///     });
    /// 
    ///     var exampleVlan = new Equinix.Metal.Vlan("exampleVlan", new()
    ///     {
    ///         Description = "A VLAN for Layer2 and Hybrid Metal devices",
    ///         Metro = exampleEquinixMetalVrf.Metro,
    ///         ProjectId = exampleEquinixMetalProject.Id,
    ///     });
    /// 
    ///     var exampleGateway = new Equinix.Metal.Gateway("exampleGateway", new()
    ///     {
    ///         ProjectId = exampleEquinixMetalProject.Id,
    ///         VlanId = exampleVlan.Id,
    ///         IpReservationId = example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### example 3
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleVirtualCircuit = new Equinix.Metal.VirtualCircuit("exampleVirtualCircuit", new()
    ///     {
    ///         Name = "example-vc",
    ///         Description = "Virtual Circuit",
    ///         ConnectionId = example.Id,
    ///         ProjectId = exampleEquinixMetalProject.Id,
    ///         PortId = example.Ports[0].Id,
    ///         NniVlan = 1024,
    ///         VrfId = exampleEquinixMetalVrf.Id,
    ///         PeerAsn = 65530,
    ///         Subnet = "192.168.100.16/31",
    ///         MetalIp = "192.168.100.16",
    ///         CustomerIp = "192.168.100.17",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing VRF ID:
    /// 
    /// ```sh
    /// $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/vrf:Vrf")]
    public partial class Vrf : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the VRF.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        /// </summary>
        [Output("ipRanges")]
        public Output<ImmutableArray<string>> IpRanges { get; private set; } = null!;

        /// <summary>
        /// The 4-byte ASN set on the VRF.
        /// </summary>
        [Output("localAsn")]
        public Output<int> LocalAsn { get; private set; } = null!;

        /// <summary>
        /// Metro ID or Code where the VRF will be deployed.
        /// </summary>
        [Output("metro")]
        public Output<string> Metro { get; private set; } = null!;

        /// <summary>
        /// User-supplied name of the VRF, unique to the project
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Project ID where the VRF will be deployed.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a Vrf resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vrf(string name, VrfArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/vrf:Vrf", name, args ?? new VrfArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vrf(string name, Input<string> id, VrfState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/vrf:Vrf", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vrf resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vrf Get(string name, Input<string> id, VrfState? state = null, CustomResourceOptions? options = null)
        {
            return new Vrf(name, id, state, options);
        }
    }

    public sealed class VrfArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the VRF.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ipRanges")]
        private InputList<string>? _ipRanges;

        /// <summary>
        /// All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        /// </summary>
        public InputList<string> IpRanges
        {
            get => _ipRanges ?? (_ipRanges = new InputList<string>());
            set => _ipRanges = value;
        }

        /// <summary>
        /// The 4-byte ASN set on the VRF.
        /// </summary>
        [Input("localAsn")]
        public Input<int>? LocalAsn { get; set; }

        /// <summary>
        /// Metro ID or Code where the VRF will be deployed.
        /// </summary>
        [Input("metro", required: true)]
        public Input<string> Metro { get; set; } = null!;

        /// <summary>
        /// User-supplied name of the VRF, unique to the project
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Project ID where the VRF will be deployed.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public VrfArgs()
        {
        }
        public static new VrfArgs Empty => new VrfArgs();
    }

    public sealed class VrfState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the VRF.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ipRanges")]
        private InputList<string>? _ipRanges;

        /// <summary>
        /// All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        /// </summary>
        public InputList<string> IpRanges
        {
            get => _ipRanges ?? (_ipRanges = new InputList<string>());
            set => _ipRanges = value;
        }

        /// <summary>
        /// The 4-byte ASN set on the VRF.
        /// </summary>
        [Input("localAsn")]
        public Input<int>? LocalAsn { get; set; }

        /// <summary>
        /// Metro ID or Code where the VRF will be deployed.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// User-supplied name of the VRF, unique to the project
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Project ID where the VRF will be deployed.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public VrfState()
        {
        }
        public static new VrfState Empty => new VrfState();
    }
}
