// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetConnections
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch connection for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-connections-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#connections
        /// </summary>
        public static Task<GetConnectionsResult> InvokeAsync(GetConnectionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionsResult>("equinix:fabric/getConnections:getConnections", args ?? new GetConnectionsArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch connection for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-connections-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#connections
        /// </summary>
        public static Output<GetConnectionsResult> Invoke(GetConnectionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionsResult>("equinix:fabric/getConnections:getConnections", args ?? new GetConnectionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch connection for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-connections-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#connections
        /// </summary>
        public static Output<GetConnectionsResult> Invoke(GetConnectionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionsResult>("equinix:fabric/getConnections:getConnections", args ?? new GetConnectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters", required: true)]
        private List<Inputs.GetConnectionsFilterArgs>? _filters;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public List<Inputs.GetConnectionsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetConnectionsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
        /// </summary>
        [Input("outerOperator", required: true)]
        public string OuterOperator { get; set; } = null!;

        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        [Input("pagination")]
        public Inputs.GetConnectionsPaginationArgs? Pagination { get; set; }

        [Input("sorts")]
        private List<Inputs.GetConnectionsSortArgs>? _sorts;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public List<Inputs.GetConnectionsSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetConnectionsSortArgs>());
            set => _sorts = value;
        }

        public GetConnectionsArgs()
        {
        }
        public static new GetConnectionsArgs Empty => new GetConnectionsArgs();
    }

    public sealed class GetConnectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters", required: true)]
        private InputList<Inputs.GetConnectionsFilterInputArgs>? _filters;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public InputList<Inputs.GetConnectionsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetConnectionsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
        /// </summary>
        [Input("outerOperator", required: true)]
        public Input<string> OuterOperator { get; set; } = null!;

        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        [Input("pagination")]
        public Input<Inputs.GetConnectionsPaginationInputArgs>? Pagination { get; set; }

        [Input("sorts")]
        private InputList<Inputs.GetConnectionsSortInputArgs>? _sorts;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public InputList<Inputs.GetConnectionsSortInputArgs> Sorts
        {
            get => _sorts ?? (_sorts = new InputList<Inputs.GetConnectionsSortInputArgs>());
            set => _sorts = value;
        }

        public GetConnectionsInvokeArgs()
        {
        }
        public static new GetConnectionsInvokeArgs Empty => new GetConnectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionsResult
    {
        /// <summary>
        /// List of Cloud Routers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsDataResult> Datas;
        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
        /// </summary>
        public readonly string OuterOperator;
        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        public readonly Outputs.GetConnectionsPaginationResult? Pagination;
        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsSortResult> Sorts;

        [OutputConstructor]
        private GetConnectionsResult(
            ImmutableArray<Outputs.GetConnectionsDataResult> datas,

            ImmutableArray<Outputs.GetConnectionsFilterResult> filters,

            string id,

            string outerOperator,

            Outputs.GetConnectionsPaginationResult? pagination,

            ImmutableArray<Outputs.GetConnectionsSortResult> sorts)
        {
            Datas = datas;
            Filters = filters;
            Id = id;
            OuterOperator = outerOperator;
            Pagination = pagination;
            Sorts = sorts;
        }
    }
}
