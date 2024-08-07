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
    /// Provides a resource to manage BGP sessions in Equinix Metal Host. Refer to [Equinix Metal BGP documentation](https://metal.equinix.com/developers/docs/networking/local-global-bgp/) for more details.
    /// 
    /// You need to have BGP config enabled in your project.
    /// 
    /// BGP session must be linked to a device running [BIRD](https://bird.network.cz) or other BGP routing daemon which will control route advertisements via the session to Equinix Metal's upstream routers.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// using Null = Pulumi.Null;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bgpPassword = "955dB0b81Ef";
    /// 
    ///     var projectId = "&lt;UUID_of_your_project&gt;";
    /// 
    ///     var addr = new Equinix.Metal.ReservedIpBlock("addr", new()
    ///     {
    ///         ProjectId = projectId,
    ///         Metro = "ny",
    ///         Quantity = 1,
    ///     });
    /// 
    ///     var interfaceLo0 = Output.Tuple(addr.Address, addr.Netmask).Apply(values =&gt;
    ///     {
    ///         var address = values.Item1;
    ///         var netmask = values.Item2;
    ///         return @$"auto lo:0
    /// iface lo:0 inet static
    ///    address {address}
    ///    netmask {netmask}
    /// ";
    ///     });
    /// 
    ///     var test = new Equinix.Metal.Device("test", new()
    ///     {
    ///         Hostname = "terraform-test-bgp-sesh",
    ///         Plan = Equinix.Metal.Plan.C3SmallX86,
    ///         Metro = "ny",
    ///         OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
    ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var birdConf = Output.Tuple(addr.Address, addr.Cidr, test.Network, test.Network).Apply(values =&gt;
    ///     {
    ///         var address = values.Item1;
    ///         var cidr = values.Item2;
    ///         var testNetwork = values.Item3;
    ///         var testNetwork1 = values.Item4;
    ///         return @$"filter equinix_metal_bgp {{
    ///     if net = {address}/{cidr} then accept;
    /// }}
    /// router id {testNetwork[2].Address};
    /// protocol direct {{
    ///     interface ""lo"";
    /// }}
    /// protocol kernel {{
    ///     scan time 10;
    ///     persist;
    ///     import all;
    ///     export all;
    /// }}
    /// protocol device {{
    ///     scan time 10;
    /// }}
    /// protocol bgp {{
    ///     export filter equinix_metal_bgp;
    ///     local as 65000;
    ///     neighbor {testNetwork1[2].Gateway} as 65530;
    ///     password ""{bgpPassword}"";
    /// }}
    /// ";
    ///     });
    /// 
    ///     var testBgpSession = new Equinix.Metal.BgpSession("testBgpSession", new()
    ///     {
    ///         DeviceId = test.Id,
    ///         AddressFamily = "ipv4",
    ///     });
    /// 
    ///     var configureBird = new Null.Resource("configureBird", new()
    ///     {
    ///         Triggers = 
    ///         {
    ///             { "bird_conf", birdConf },
    ///             { "interface", interfaceLo0 },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/bgpSession:BgpSession")]
    public partial class BgpSession : global::Pulumi.CustomResource
    {
        /// <summary>
        /// `ipv4` or `ipv6`.
        /// </summary>
        [Output("addressFamily")]
        public Output<string> AddressFamily { get; private set; } = null!;

        /// <summary>
        /// Boolean flag to set the default route policy. False by default.
        /// </summary>
        [Output("defaultRoute")]
        public Output<bool?> DefaultRoute { get; private set; } = null!;

        /// <summary>
        /// ID of device.
        /// </summary>
        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// Status of the session - `up` or `down`
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a BgpSession resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BgpSession(string name, BgpSessionArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/bgpSession:BgpSession", name, args ?? new BgpSessionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BgpSession(string name, Input<string> id, BgpSessionState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/bgpSession:BgpSession", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BgpSession resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BgpSession Get(string name, Input<string> id, BgpSessionState? state = null, CustomResourceOptions? options = null)
        {
            return new BgpSession(name, id, state, options);
        }
    }

    public sealed class BgpSessionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `ipv4` or `ipv6`.
        /// </summary>
        [Input("addressFamily", required: true)]
        public Input<string> AddressFamily { get; set; } = null!;

        /// <summary>
        /// Boolean flag to set the default route policy. False by default.
        /// </summary>
        [Input("defaultRoute")]
        public Input<bool>? DefaultRoute { get; set; }

        /// <summary>
        /// ID of device.
        /// </summary>
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        public BgpSessionArgs()
        {
        }
        public static new BgpSessionArgs Empty => new BgpSessionArgs();
    }

    public sealed class BgpSessionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `ipv4` or `ipv6`.
        /// </summary>
        [Input("addressFamily")]
        public Input<string>? AddressFamily { get; set; }

        /// <summary>
        /// Boolean flag to set the default route policy. False by default.
        /// </summary>
        [Input("defaultRoute")]
        public Input<bool>? DefaultRoute { get; set; }

        /// <summary>
        /// ID of device.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Status of the session - `up` or `down`
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public BgpSessionState()
        {
        }
        public static new BgpSessionState Empty => new BgpSessionState();
    }
}
