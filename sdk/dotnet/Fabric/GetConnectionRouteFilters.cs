// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetConnectionRouteFilters
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch all route filter policies attached to a fabric connection
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
        /// </summary>
        public static Task<GetConnectionRouteFiltersResult> InvokeAsync(GetConnectionRouteFiltersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionRouteFiltersResult>("equinix:fabric/getConnectionRouteFilters:getConnectionRouteFilters", args ?? new GetConnectionRouteFiltersArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch all route filter policies attached to a fabric connection
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
        /// </summary>
        public static Output<GetConnectionRouteFiltersResult> Invoke(GetConnectionRouteFiltersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionRouteFiltersResult>("equinix:fabric/getConnectionRouteFilters:getConnectionRouteFilters", args ?? new GetConnectionRouteFiltersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionRouteFiltersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
        /// </summary>
        [Input("connectionId", required: true)]
        public string ConnectionId { get; set; } = null!;

        public GetConnectionRouteFiltersArgs()
        {
        }
        public static new GetConnectionRouteFiltersArgs Empty => new GetConnectionRouteFiltersArgs();
    }

    public sealed class GetConnectionRouteFiltersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        public GetConnectionRouteFiltersInvokeArgs()
        {
        }
        public static new GetConnectionRouteFiltersInvokeArgs Empty => new GetConnectionRouteFiltersInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionRouteFiltersResult
    {
        /// <summary>
        /// Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
        /// </summary>
        public readonly string ConnectionId;
        /// <summary>
        /// The list of Rules attached to the given Route Filter Policy UUID
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionRouteFiltersDataResult> Datas;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionRouteFiltersPaginationResult> Paginations;

        [OutputConstructor]
        private GetConnectionRouteFiltersResult(
            string connectionId,

            ImmutableArray<Outputs.GetConnectionRouteFiltersDataResult> datas,

            string id,

            ImmutableArray<Outputs.GetConnectionRouteFiltersPaginationResult> paginations)
        {
            ConnectionId = connectionId;
            Datas = datas;
            Id = id;
            Paginations = paginations;
        }
    }
}