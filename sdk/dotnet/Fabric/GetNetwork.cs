// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetNetwork
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
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
        ///     var networkDataName = Equinix.Fabric.GetNetwork.Invoke(new()
        ///     {
        ///         Uuid = "&lt;uuid_of_network&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///         ["name"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Name),
        ///         ["scope"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Scope),
        ///         ["type"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Type),
        ///         ["region"] = .Select(location =&gt; 
        ///         {
        ///             return location.Region;
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkResult> InvokeAsync(GetNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkResult>("equinix:fabric/getNetwork:getNetwork", args ?? new GetNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
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
        ///     var networkDataName = Equinix.Fabric.GetNetwork.Invoke(new()
        ///     {
        ///         Uuid = "&lt;uuid_of_network&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///         ["name"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Name),
        ///         ["scope"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Scope),
        ///         ["type"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Type),
        ///         ["region"] = .Select(location =&gt; 
        ///         {
        ///             return location.Region;
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("equinix:fabric/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
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
        ///     var networkDataName = Equinix.Fabric.GetNetwork.Invoke(new()
        ///     {
        ///         Uuid = "&lt;uuid_of_network&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///         ["name"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Name),
        ///         ["scope"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Scope),
        ///         ["type"] = networkDataName.Apply(getNetworkResult =&gt; getNetworkResult.Type),
        ///         ["region"] = .Select(location =&gt; 
        ///         {
        ///             return location.Region;
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("equinix:fabric/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix-assigned network identifier
        /// </summary>
        [Input("uuid", required: true)]
        public string Uuid { get; set; } = null!;

        public GetNetworkArgs()
        {
        }
        public static new GetNetworkArgs Empty => new GetNetworkArgs();
    }

    public sealed class GetNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix-assigned network identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public GetNetworkInvokeArgs()
        {
        }
        public static new GetNetworkInvokeArgs Empty => new GetNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkResult
    {
        /// <summary>
        /// Information on asset change operation
        /// </summary>
        public readonly Outputs.GetNetworkChangeResult Change;
        /// <summary>
        /// A permanent record of asset creation, modification, or deletion
        /// </summary>
        public readonly Outputs.GetNetworkChangeLogResult ChangeLog;
        /// <summary>
        /// Number of connections associated with this network
        /// </summary>
        public readonly int ConnectionsCount;
        /// <summary>
        /// Fabric Network URI information
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Fabric Network location
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkLocationResult> Locations;
        /// <summary>
        /// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Preferences for notifications on Fabric Network configuration or status changes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkNotificationResult> Notifications;
        /// <summary>
        /// Network operation information that is associated with this Fabric Network
        /// </summary>
        public readonly Outputs.GetNetworkOperationResult Operation;
        /// <summary>
        /// Fabric Network project
        /// </summary>
        public readonly Outputs.GetNetworkProjectResult Project;
        /// <summary>
        /// Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// Fabric Network overall state
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned network identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetNetworkResult(
            Outputs.GetNetworkChangeResult change,

            Outputs.GetNetworkChangeLogResult changeLog,

            int connectionsCount,

            string href,

            string id,

            ImmutableArray<Outputs.GetNetworkLocationResult> locations,

            string name,

            ImmutableArray<Outputs.GetNetworkNotificationResult> notifications,

            Outputs.GetNetworkOperationResult operation,

            Outputs.GetNetworkProjectResult project,

            string scope,

            string state,

            string type,

            string uuid)
        {
            Change = change;
            ChangeLog = changeLog;
            ConnectionsCount = connectionsCount;
            Href = href;
            Id = id;
            Locations = locations;
            Name = name;
            Notifications = notifications;
            Operation = operation;
            Project = project;
            Scope = scope;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
