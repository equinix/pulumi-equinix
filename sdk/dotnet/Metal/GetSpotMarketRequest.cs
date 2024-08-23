// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetSpotMarketRequest
    {
        public static Task<GetSpotMarketRequestResult> InvokeAsync(GetSpotMarketRequestArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSpotMarketRequestResult>("equinix:metal/getSpotMarketRequest:getSpotMarketRequest", args ?? new GetSpotMarketRequestArgs(), options.WithDefaults());

        public static Output<GetSpotMarketRequestResult> Invoke(GetSpotMarketRequestInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpotMarketRequestResult>("equinix:metal/getSpotMarketRequest:getSpotMarketRequest", args ?? new GetSpotMarketRequestInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSpotMarketRequestArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Spot Market Request.
        /// </summary>
        [Input("requestId", required: true)]
        public string RequestId { get; set; } = null!;

        public GetSpotMarketRequestArgs()
        {
        }
        public static new GetSpotMarketRequestArgs Empty => new GetSpotMarketRequestArgs();
    }

    public sealed class GetSpotMarketRequestInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Spot Market Request.
        /// </summary>
        [Input("requestId", required: true)]
        public Input<string> RequestId { get; set; } = null!;

        public GetSpotMarketRequestInvokeArgs()
        {
        }
        public static new GetSpotMarketRequestInvokeArgs Empty => new GetSpotMarketRequestInvokeArgs();
    }


    [OutputType]
    public sealed class GetSpotMarketRequestResult
    {
        /// <summary>
        /// List of IDs of devices spawned by the referenced Spot Market Request.
        /// </summary>
        public readonly ImmutableArray<string> DeviceIds;
        /// <summary>
        /// Maximum number devices to be created.
        /// </summary>
        public readonly int DevicesMax;
        /// <summary>
        /// Miniumum number devices to be created.
        /// </summary>
        public readonly int DevicesMin;
        /// <summary>
        /// Date and time When the spot market request will be ended.
        /// </summary>
        public readonly string EndAt;
        /// <summary>
        /// (**Deprecated**) Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        /// </summary>
        public readonly ImmutableArray<string> Facilities;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Maximum price user is willing to pay per hour per device.
        /// </summary>
        public readonly double MaxBidPrice;
        /// <summary>
        /// Metro where devices should be created.
        /// </summary>
        public readonly string Metro;
        /// <summary>
        /// The device plan slug.
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// Project ID.
        /// </summary>
        public readonly string ProjectId;
        public readonly string RequestId;

        [OutputConstructor]
        private GetSpotMarketRequestResult(
            ImmutableArray<string> deviceIds,

            int devicesMax,

            int devicesMin,

            string endAt,

            ImmutableArray<string> facilities,

            string id,

            double maxBidPrice,

            string metro,

            string plan,

            string projectId,

            string requestId)
        {
            DeviceIds = deviceIds;
            DevicesMax = devicesMax;
            DevicesMin = devicesMin;
            EndAt = endAt;
            Facilities = facilities;
            Id = id;
            MaxBidPrice = maxBidPrice;
            Metro = metro;
            Plan = plan;
            ProjectId = projectId;
            RequestId = requestId;
        }
    }
}