// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetFacility
    {
        /// <summary>
        /// &gt; **Deprecated** Use `equinix.metal.getMetro` instead.  For more information, refer to the facility to metro migration guide.
        /// 
        /// Provides an Equinix Metal facility datasource.
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
        ///     var ny5 = Equinix.Metal.GetFacility.Invoke(new()
        ///     {
        ///         Code = "ny5",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = ny5.Apply(getFacilityResult =&gt; getFacilityResult.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFacilityResult> InvokeAsync(GetFacilityArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFacilityResult>("equinix:metal/getFacility:getFacility", args ?? new GetFacilityArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Deprecated** Use `equinix.metal.getMetro` instead.  For more information, refer to the facility to metro migration guide.
        /// 
        /// Provides an Equinix Metal facility datasource.
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
        ///     var ny5 = Equinix.Metal.GetFacility.Invoke(new()
        ///     {
        ///         Code = "ny5",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = ny5.Apply(getFacilityResult =&gt; getFacilityResult.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFacilityResult> Invoke(GetFacilityInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFacilityResult>("equinix:metal/getFacility:getFacility", args ?? new GetFacilityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFacilityArgs : global::Pulumi.InvokeArgs
    {
        [Input("capacities")]
        private List<Inputs.GetFacilityCapacityArgs>? _capacities;

        /// <summary>
        /// One or more device plans for which the facility must have capacity.
        /// </summary>
        public List<Inputs.GetFacilityCapacityArgs> Capacities
        {
            get => _capacities ?? (_capacities = new List<Inputs.GetFacilityCapacityArgs>());
            set => _capacities = value;
        }

        /// <summary>
        /// The facility code to search for facilities.
        /// </summary>
        [Input("code", required: true)]
        public string Code { get; set; } = null!;

        [Input("featuresRequireds")]
        private List<string>? _featuresRequireds;

        /// <summary>
        /// Set of feature strings that the facility must have. Some
        /// possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
        /// </summary>
        public List<string> FeaturesRequireds
        {
            get => _featuresRequireds ?? (_featuresRequireds = new List<string>());
            set => _featuresRequireds = value;
        }

        public GetFacilityArgs()
        {
        }
        public static new GetFacilityArgs Empty => new GetFacilityArgs();
    }

    public sealed class GetFacilityInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("capacities")]
        private InputList<Inputs.GetFacilityCapacityInputArgs>? _capacities;

        /// <summary>
        /// One or more device plans for which the facility must have capacity.
        /// </summary>
        public InputList<Inputs.GetFacilityCapacityInputArgs> Capacities
        {
            get => _capacities ?? (_capacities = new InputList<Inputs.GetFacilityCapacityInputArgs>());
            set => _capacities = value;
        }

        /// <summary>
        /// The facility code to search for facilities.
        /// </summary>
        [Input("code", required: true)]
        public Input<string> Code { get; set; } = null!;

        [Input("featuresRequireds")]
        private InputList<string>? _featuresRequireds;

        /// <summary>
        /// Set of feature strings that the facility must have. Some
        /// possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
        /// </summary>
        public InputList<string> FeaturesRequireds
        {
            get => _featuresRequireds ?? (_featuresRequireds = new InputList<string>());
            set => _featuresRequireds = value;
        }

        public GetFacilityInvokeArgs()
        {
        }
        public static new GetFacilityInvokeArgs Empty => new GetFacilityInvokeArgs();
    }


    [OutputType]
    public sealed class GetFacilityResult
    {
        public readonly ImmutableArray<Outputs.GetFacilityCapacityResult> Capacities;
        public readonly string Code;
        /// <summary>
        /// The features of the facility.
        /// </summary>
        public readonly ImmutableArray<string> Features;
        public readonly ImmutableArray<string> FeaturesRequireds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The metro code the facility is part of.
        /// </summary>
        public readonly string Metro;
        /// <summary>
        /// The name of the facility.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetFacilityResult(
            ImmutableArray<Outputs.GetFacilityCapacityResult> capacities,

            string code,

            ImmutableArray<string> features,

            ImmutableArray<string> featuresRequireds,

            string id,

            string metro,

            string name)
        {
            Capacities = capacities;
            Code = code;
            Features = features;
            FeaturesRequireds = featuresRequireds;
            Id = id;
            Metro = metro;
            Name = name;
        }
    }
}
