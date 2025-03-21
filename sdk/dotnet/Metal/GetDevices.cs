// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetDevices
    {
        /// <summary>
        /// The datasource can be used to find a list of devices which meet filter criteria.
        /// 
        /// If you need to fetch a single device by ID or by project ID and hostname, use the equinix.metal.Device datasource.
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
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Filters = new[]
        ///         {
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "plan",
        ///                 Values = new[]
        ///                 {
        ///                     "c3.small.x86",
        ///                 },
        ///             },
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "metro",
        ///                 Values = new[]
        ///                 {
        ///                     "da",
        ///                     "sv",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         Search = "database",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ## search vs filter
        /// 
        /// The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
        /// </summary>
        public static Task<GetDevicesResult> InvokeAsync(GetDevicesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDevicesResult>("equinix:metal/getDevices:getDevices", args ?? new GetDevicesArgs(), options.WithDefaults());

        /// <summary>
        /// The datasource can be used to find a list of devices which meet filter criteria.
        /// 
        /// If you need to fetch a single device by ID or by project ID and hostname, use the equinix.metal.Device datasource.
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
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Filters = new[]
        ///         {
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "plan",
        ///                 Values = new[]
        ///                 {
        ///                     "c3.small.x86",
        ///                 },
        ///             },
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "metro",
        ///                 Values = new[]
        ///                 {
        ///                     "da",
        ///                     "sv",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         Search = "database",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ## search vs filter
        /// 
        /// The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
        /// </summary>
        public static Output<GetDevicesResult> Invoke(GetDevicesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDevicesResult>("equinix:metal/getDevices:getDevices", args ?? new GetDevicesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// The datasource can be used to find a list of devices which meet filter criteria.
        /// 
        /// If you need to fetch a single device by ID or by project ID and hostname, use the equinix.metal.Device datasource.
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
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Filters = new[]
        ///         {
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "plan",
        ///                 Values = new[]
        ///                 {
        ///                     "c3.small.x86",
        ///                 },
        ///             },
        ///             new Equinix.Metal.Inputs.GetDevicesFilterInputArgs
        ///             {
        ///                 Attribute = "metro",
        ///                 Values = new[]
        ///                 {
        ///                     "da",
        ///                     "sv",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetDevices.Invoke(new()
        ///     {
        ///         Search = "database",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["devices"] = example.Apply(getDevicesResult =&gt; getDevicesResult.Devices),
        ///     };
        /// });
        /// ```
        /// 
        /// ## search vs filter
        /// 
        /// The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
        /// </summary>
        public static Output<GetDevicesResult> Invoke(GetDevicesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDevicesResult>("equinix:metal/getDevices:getDevices", args ?? new GetDevicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDevicesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetDevicesFilterArgs>? _filters;

        /// <summary>
        /// One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `equinix.metal.Device` datasource.
        /// </summary>
        public List<Inputs.GetDevicesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDevicesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of organization containing the devices.
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
        /// </summary>
        [Input("search")]
        public string? Search { get; set; }

        [Input("sorts")]
        private List<Inputs.GetDevicesSortArgs>? _sorts;
        public List<Inputs.GetDevicesSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetDevicesSortArgs>());
            set => _sorts = value;
        }

        public GetDevicesArgs()
        {
        }
        public static new GetDevicesArgs Empty => new GetDevicesArgs();
    }

    public sealed class GetDevicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetDevicesFilterInputArgs>? _filters;

        /// <summary>
        /// One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `equinix.metal.Device` datasource.
        /// </summary>
        public InputList<Inputs.GetDevicesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDevicesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of organization containing the devices.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
        /// </summary>
        [Input("search")]
        public Input<string>? Search { get; set; }

        [Input("sorts")]
        private InputList<Inputs.GetDevicesSortInputArgs>? _sorts;
        public InputList<Inputs.GetDevicesSortInputArgs> Sorts
        {
            get => _sorts ?? (_sorts = new InputList<Inputs.GetDevicesSortInputArgs>());
            set => _sorts = value;
        }

        public GetDevicesInvokeArgs()
        {
        }
        public static new GetDevicesInvokeArgs Empty => new GetDevicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDevicesResult
    {
        /// <summary>
        /// list of resources with attributes like in the equninix_metal_device datasources.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesDeviceResult> Devices;
        public readonly ImmutableArray<Outputs.GetDevicesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OrganizationId;
        public readonly string? ProjectId;
        public readonly string? Search;
        public readonly ImmutableArray<Outputs.GetDevicesSortResult> Sorts;

        [OutputConstructor]
        private GetDevicesResult(
            ImmutableArray<Outputs.GetDevicesDeviceResult> devices,

            ImmutableArray<Outputs.GetDevicesFilterResult> filters,

            string id,

            string? organizationId,

            string? projectId,

            string? search,

            ImmutableArray<Outputs.GetDevicesSortResult> sorts)
        {
            Devices = devices;
            Filters = filters;
            Id = id;
            OrganizationId = organizationId;
            ProjectId = projectId;
            Search = search;
            Sorts = sorts;
        }
    }
}
