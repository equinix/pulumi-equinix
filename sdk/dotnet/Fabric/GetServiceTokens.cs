// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetServiceTokens
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch service token for a given search data set
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
        /// * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
        /// </summary>
        public static Task<GetServiceTokensResult> InvokeAsync(GetServiceTokensArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceTokensResult>("equinix:fabric/getServiceTokens:getServiceTokens", args ?? new GetServiceTokensArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch service token for a given search data set
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
        /// * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
        /// </summary>
        public static Output<GetServiceTokensResult> Invoke(GetServiceTokensInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceTokensResult>("equinix:fabric/getServiceTokens:getServiceTokens", args ?? new GetServiceTokensInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch service token for a given search data set
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
        /// * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
        /// </summary>
        public static Output<GetServiceTokensResult> Invoke(GetServiceTokensInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceTokensResult>("equinix:fabric/getServiceTokens:getServiceTokens", args ?? new GetServiceTokensInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceTokensArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters", required: true)]
        private List<Inputs.GetServiceTokensFilterArgs>? _filters;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public List<Inputs.GetServiceTokensFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetServiceTokensFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        [Input("pagination")]
        public Inputs.GetServiceTokensPaginationArgs? Pagination { get; set; }

        public GetServiceTokensArgs()
        {
        }
        public static new GetServiceTokensArgs Empty => new GetServiceTokensArgs();
    }

    public sealed class GetServiceTokensInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters", required: true)]
        private InputList<Inputs.GetServiceTokensFilterInputArgs>? _filters;

        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public InputList<Inputs.GetServiceTokensFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetServiceTokensFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        [Input("pagination")]
        public Input<Inputs.GetServiceTokensPaginationInputArgs>? Pagination { get; set; }

        public GetServiceTokensInvokeArgs()
        {
        }
        public static new GetServiceTokensInvokeArgs Empty => new GetServiceTokensInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceTokensResult
    {
        /// <summary>
        /// List of Service Tokens
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataResult> Datas;
        /// <summary>
        /// Filters for the Data Source Search Request
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Pagination details for the Data Source Search Request
        /// </summary>
        public readonly Outputs.GetServiceTokensPaginationResult? Pagination;

        [OutputConstructor]
        private GetServiceTokensResult(
            ImmutableArray<Outputs.GetServiceTokensDataResult> datas,

            ImmutableArray<Outputs.GetServiceTokensFilterResult> filters,

            string id,

            Outputs.GetServiceTokensPaginationResult? pagination)
        {
            Datas = datas;
            Filters = filters;
            Id = id;
            Pagination = pagination;
        }
    }
}
