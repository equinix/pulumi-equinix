// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    /// <summary>
    /// Resource `equinix.networkedge.Bgp` allows creation and management of Equinix Network
    /// Edge BGP peering configurations.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bgp = new Equinix.NetworkEdge.Bgp("bgp", new()
    ///     {
    ///         ConnectionId = "54014acf-9730-4b55-a791-459283d05fb1",
    ///         LocalIpAddress = "10.1.1.1/30",
    ///         LocalAsn = 12345,
    ///         RemoteIpAddress = "10.1.1.2",
    ///         RemoteAsn = 66123,
    ///         AuthenticationKey = "secret",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["state"] = bgp.State,
    ///         ["provisioningStatus"] = bgp.ProvisioningStatus,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing ID: &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import equinix:networkedge/bgp:Bgp example {existing_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
    /// </summary>
    [EquinixResourceType("equinix:networkedge/bgp:Bgp")]
    public partial class Bgp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// shared key used for BGP peer authentication.
        /// </summary>
        [Output("authenticationKey")]
        public Output<string?> AuthenticationKey { get; private set; } = null!;

        /// <summary>
        /// identifier of a connection established between.
        /// network device and remote service provider that will be used for peering.
        /// </summary>
        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// unique identifier of a network device that is a local peer in a given BGP peering
        /// configuration.
        /// </summary>
        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// Local ASN number.
        /// </summary>
        [Output("localAsn")]
        public Output<int> LocalAsn { get; private set; } = null!;

        /// <summary>
        /// IP address in CIDR format of a local device.
        /// </summary>
        [Output("localIpAddress")]
        public Output<string> LocalIpAddress { get; private set; } = null!;

        /// <summary>
        /// BGP peering configuration provisioning status, one of `PROVISIONING`,
        /// `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        /// </summary>
        [Output("provisioningStatus")]
        public Output<string> ProvisioningStatus { get; private set; } = null!;

        /// <summary>
        /// Remote ASN number.
        /// </summary>
        [Output("remoteAsn")]
        public Output<int> RemoteAsn { get; private set; } = null!;

        /// <summary>
        /// IP address of remote peer.
        /// </summary>
        [Output("remoteIpAddress")]
        public Output<string> RemoteIpAddress { get; private set; } = null!;

        /// <summary>
        /// BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`,
        /// `Established`.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// BGP peering configuration unique identifier.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a Bgp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Bgp(string name, BgpArgs args, CustomResourceOptions? options = null)
            : base("equinix:networkedge/bgp:Bgp", name, args ?? new BgpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Bgp(string name, Input<string> id, BgpState? state = null, CustomResourceOptions? options = null)
            : base("equinix:networkedge/bgp:Bgp", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1679677797+354405ae.dirty",
                AdditionalSecretOutputs =
                {
                    "authenticationKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Bgp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Bgp Get(string name, Input<string> id, BgpState? state = null, CustomResourceOptions? options = null)
        {
            return new Bgp(name, id, state, options);
        }
    }

    public sealed class BgpArgs : global::Pulumi.ResourceArgs
    {
        [Input("authenticationKey")]
        private Input<string>? _authenticationKey;

        /// <summary>
        /// shared key used for BGP peer authentication.
        /// </summary>
        public Input<string>? AuthenticationKey
        {
            get => _authenticationKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authenticationKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// identifier of a connection established between.
        /// network device and remote service provider that will be used for peering.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        /// <summary>
        /// Local ASN number.
        /// </summary>
        [Input("localAsn", required: true)]
        public Input<int> LocalAsn { get; set; } = null!;

        /// <summary>
        /// IP address in CIDR format of a local device.
        /// </summary>
        [Input("localIpAddress", required: true)]
        public Input<string> LocalIpAddress { get; set; } = null!;

        /// <summary>
        /// Remote ASN number.
        /// </summary>
        [Input("remoteAsn", required: true)]
        public Input<int> RemoteAsn { get; set; } = null!;

        /// <summary>
        /// IP address of remote peer.
        /// </summary>
        [Input("remoteIpAddress", required: true)]
        public Input<string> RemoteIpAddress { get; set; } = null!;

        public BgpArgs()
        {
        }
        public static new BgpArgs Empty => new BgpArgs();
    }

    public sealed class BgpState : global::Pulumi.ResourceArgs
    {
        [Input("authenticationKey")]
        private Input<string>? _authenticationKey;

        /// <summary>
        /// shared key used for BGP peer authentication.
        /// </summary>
        public Input<string>? AuthenticationKey
        {
            get => _authenticationKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authenticationKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// identifier of a connection established between.
        /// network device and remote service provider that will be used for peering.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// unique identifier of a network device that is a local peer in a given BGP peering
        /// configuration.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Local ASN number.
        /// </summary>
        [Input("localAsn")]
        public Input<int>? LocalAsn { get; set; }

        /// <summary>
        /// IP address in CIDR format of a local device.
        /// </summary>
        [Input("localIpAddress")]
        public Input<string>? LocalIpAddress { get; set; }

        /// <summary>
        /// BGP peering configuration provisioning status, one of `PROVISIONING`,
        /// `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        /// </summary>
        [Input("provisioningStatus")]
        public Input<string>? ProvisioningStatus { get; set; }

        /// <summary>
        /// Remote ASN number.
        /// </summary>
        [Input("remoteAsn")]
        public Input<int>? RemoteAsn { get; set; }

        /// <summary>
        /// IP address of remote peer.
        /// </summary>
        [Input("remoteIpAddress")]
        public Input<string>? RemoteIpAddress { get; set; }

        /// <summary>
        /// BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`,
        /// `Established`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// BGP peering configuration unique identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public BgpState()
        {
        }
        public static new BgpState Empty => new BgpState();
    }
}
