// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetServiceProfiles
    {
        public static Task<GetServiceProfilesResult> InvokeAsync(GetServiceProfilesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceProfilesResult>("equinix:fabric/getServiceProfiles:getServiceProfiles", args ?? new GetServiceProfilesArgs(), options.WithDefaults());

        public static Output<GetServiceProfilesResult> Invoke(GetServiceProfilesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceProfilesResult>("equinix:fabric/getServiceProfiles:getServiceProfiles", args ?? new GetServiceProfilesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceProfilesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Service Profile Search Filter
        /// </summary>
        [Input("filter")]
        public Inputs.GetServiceProfilesFilterArgs? Filter { get; set; }

        [Input("sort")]
        private List<Inputs.GetServiceProfilesSortArgs>? _sort;

        /// <summary>
        /// Service Profile Sort criteria for Search Request response payload
        /// </summary>
        public List<Inputs.GetServiceProfilesSortArgs> Sort
        {
            get => _sort ?? (_sort = new List<Inputs.GetServiceProfilesSortArgs>());
            set => _sort = value;
        }

        /// <summary>
        /// Service Profile Search Buyer/Seller Representation. Possible values are aSide and zSide.
        /// </summary>
        [Input("viewPoint")]
        public string? ViewPoint { get; set; }

        public GetServiceProfilesArgs()
        {
        }
        public static new GetServiceProfilesArgs Empty => new GetServiceProfilesArgs();
    }

    public sealed class GetServiceProfilesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Service Profile Search Filter
        /// </summary>
        [Input("filter")]
        public Input<Inputs.GetServiceProfilesFilterInputArgs>? Filter { get; set; }

        [Input("sort")]
        private InputList<Inputs.GetServiceProfilesSortInputArgs>? _sort;

        /// <summary>
        /// Service Profile Sort criteria for Search Request response payload
        /// </summary>
        public InputList<Inputs.GetServiceProfilesSortInputArgs> Sort
        {
            get => _sort ?? (_sort = new InputList<Inputs.GetServiceProfilesSortInputArgs>());
            set => _sort = value;
        }

        /// <summary>
        /// Service Profile Search Buyer/Seller Representation. Possible values are aSide and zSide.
        /// </summary>
        [Input("viewPoint")]
        public Input<string>? ViewPoint { get; set; }

        public GetServiceProfilesInvokeArgs()
        {
        }
        public static new GetServiceProfilesInvokeArgs Empty => new GetServiceProfilesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceProfilesResult
    {
        /// <summary>
        /// List of  Service Profiles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfilesDatumResult> Data;
        /// <summary>
        /// Service Profile Search Filter
        /// </summary>
        public readonly Outputs.GetServiceProfilesFilterResult? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Service Profile Sort criteria for Search Request response payload
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfilesSortResult> Sort;
        /// <summary>
        /// Service Profile Search Buyer/Seller Representation. Possible values are aSide and zSide.
        /// </summary>
        public readonly string? ViewPoint;

        [OutputConstructor]
        private GetServiceProfilesResult(
            ImmutableArray<Outputs.GetServiceProfilesDatumResult> data,

            Outputs.GetServiceProfilesFilterResult? filter,

            string id,

            ImmutableArray<Outputs.GetServiceProfilesSortResult> sort,

            string? viewPoint)
        {
            Data = data;
            Filter = filter;
            Id = id;
            Sort = sort;
            ViewPoint = viewPoint;
        }
    }
}
