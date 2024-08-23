// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetDeviceBgpNeighbors
    {
        /// <summary>
        /// Use this datasource to retrieve list of BGP neighbors of a device in the Equinix Metal host.
        /// 
        /// To have any BGP neighbors listed, the device must be in BGP-enabled project and have a BGP session assigned.
        /// 
        /// To learn more about using BGP in Equinix Metal, see the equinix.metal.BgpSession resource documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Equinix.Metal.GetDeviceBgpNeighbors.Invoke(new()
        ///     {
        ///         DeviceId = "4c641195-25e5-4c3c-b2b7-4cd7a42c7b40",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bgpNeighborsListing"] = test.Apply(getDeviceBgpNeighborsResult =&gt; getDeviceBgpNeighborsResult.BgpNeighbors),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDeviceBgpNeighborsResult> InvokeAsync(GetDeviceBgpNeighborsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeviceBgpNeighborsResult>("equinix:metal/getDeviceBgpNeighbors:getDeviceBgpNeighbors", args ?? new GetDeviceBgpNeighborsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this datasource to retrieve list of BGP neighbors of a device in the Equinix Metal host.
        /// 
        /// To have any BGP neighbors listed, the device must be in BGP-enabled project and have a BGP session assigned.
        /// 
        /// To learn more about using BGP in Equinix Metal, see the equinix.metal.BgpSession resource documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Equinix.Metal.GetDeviceBgpNeighbors.Invoke(new()
        ///     {
        ///         DeviceId = "4c641195-25e5-4c3c-b2b7-4cd7a42c7b40",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bgpNeighborsListing"] = test.Apply(getDeviceBgpNeighborsResult =&gt; getDeviceBgpNeighborsResult.BgpNeighbors),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeviceBgpNeighborsResult> Invoke(GetDeviceBgpNeighborsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeviceBgpNeighborsResult>("equinix:metal/getDeviceBgpNeighbors:getDeviceBgpNeighbors", args ?? new GetDeviceBgpNeighborsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceBgpNeighborsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of BGP-enabled device whose neighbors to list.
        /// </summary>
        [Input("deviceId", required: true)]
        public string DeviceId { get; set; } = null!;

        public GetDeviceBgpNeighborsArgs()
        {
        }
        public static new GetDeviceBgpNeighborsArgs Empty => new GetDeviceBgpNeighborsArgs();
    }

    public sealed class GetDeviceBgpNeighborsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of BGP-enabled device whose neighbors to list.
        /// </summary>
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        public GetDeviceBgpNeighborsInvokeArgs()
        {
        }
        public static new GetDeviceBgpNeighborsInvokeArgs Empty => new GetDeviceBgpNeighborsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceBgpNeighborsResult
    {
        /// <summary>
        /// array of BGP neighbor records with attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeviceBgpNeighborsBgpNeighborResult> BgpNeighbors;
        public readonly string DeviceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetDeviceBgpNeighborsResult(
            ImmutableArray<Outputs.GetDeviceBgpNeighborsBgpNeighborResult> bgpNeighbors,

            string deviceId,

            string id)
        {
            BgpNeighbors = bgpNeighbors;
            DeviceId = deviceId;
            Id = id;
        }
    }
}