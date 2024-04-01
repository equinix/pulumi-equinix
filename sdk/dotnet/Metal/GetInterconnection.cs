// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetInterconnection
    {
        /// <summary>
        /// Use this data source to retrieve a [connection resource](https://metal.equinix.com/developers/docs/networking/fabric/)
        /// 
        /// &gt; Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetInterconnection.Invoke(new()
        ///     {
        ///         ConnectionId = "4347e805-eb46-4699-9eb9-5c116e6a017d",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetInterconnectionResult> InvokeAsync(GetInterconnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterconnectionResult>("equinix:metal/getInterconnection:getInterconnection", args ?? new GetInterconnectionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a [connection resource](https://metal.equinix.com/developers/docs/networking/fabric/)
        /// 
        /// &gt; Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetInterconnection.Invoke(new()
        ///     {
        ///         ConnectionId = "4347e805-eb46-4699-9eb9-5c116e6a017d",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetInterconnectionResult> Invoke(GetInterconnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterconnectionResult>("equinix:metal/getInterconnection:getInterconnection", args ?? new GetInterconnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterconnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the connection resource.
        /// </summary>
        [Input("connectionId", required: true)]
        public string ConnectionId { get; set; } = null!;

        public GetInterconnectionArgs()
        {
        }
        public static new GetInterconnectionArgs Empty => new GetInterconnectionArgs();
    }

    public sealed class GetInterconnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the connection resource.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        public GetInterconnectionInvokeArgs()
        {
        }
        public static new GetInterconnectionInvokeArgs Empty => new GetInterconnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterconnectionResult
    {
        public readonly string ConnectionId;
        /// <summary>
        /// The preferred email used for communication and notifications about the Equinix Fabric interconnection.
        /// </summary>
        public readonly string ContactEmail;
        /// <summary>
        /// Description of the connection resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (**Deprecated**) Slug of a facility to which the connection belongs. Use metro instead; read the facility to metro migration guide
        /// </summary>
        public readonly string Facility;
        /// <summary>
        /// Port UUID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Slug of a metro to which the connection belongs.
        /// </summary>
        public readonly string Metro;
        /// <summary>
        /// Mode for connections in IBX facilities with the dedicated type - standard or tunnel.
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// Port name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// ID of the organization where the connection is scoped to.
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInterconnectionPortResult> Ports;
        /// <summary>
        /// ID of project to which the connection belongs.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Connection redundancy, reduntant or primary.
        /// </summary>
        public readonly string Redundancy;
        /// <summary>
        /// Type of service token, a_side or z_side. One available in shared connection.
        /// </summary>
        public readonly string ServiceTokenType;
        /// <summary>
        /// List of connection service tokens with attributes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInterconnectionServiceTokenResult> ServiceTokens;
        /// <summary>
        /// Port speed in bits per second.
        /// </summary>
        public readonly string Speed;
        /// <summary>
        /// Port status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// String list of tags.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix_ecx_l2_connection resource or from the [Equinix Fabric Portal](https://ecxfabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
        /// </summary>
        public readonly string Token;
        /// <summary>
        /// Token type, `a_side` or `z_side`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Attached VLANs. Only available in shared connection. One vlan for Primary/Single connection and two vlans for Redundant connection.
        /// </summary>
        public readonly ImmutableArray<int> Vlans;
        public readonly ImmutableArray<string> Vrfs;

        [OutputConstructor]
        private GetInterconnectionResult(
            string connectionId,

            string contactEmail,

            string description,

            string facility,

            string id,

            string metro,

            string mode,

            string name,

            string organizationId,

            ImmutableArray<Outputs.GetInterconnectionPortResult> ports,

            string projectId,

            string redundancy,

            string serviceTokenType,

            ImmutableArray<Outputs.GetInterconnectionServiceTokenResult> serviceTokens,

            string speed,

            string status,

            ImmutableArray<string> tags,

            string token,

            string type,

            ImmutableArray<int> vlans,

            ImmutableArray<string> vrfs)
        {
            ConnectionId = connectionId;
            ContactEmail = contactEmail;
            Description = description;
            Facility = facility;
            Id = id;
            Metro = metro;
            Mode = mode;
            Name = name;
            OrganizationId = organizationId;
            Ports = ports;
            ProjectId = projectId;
            Redundancy = redundancy;
            ServiceTokenType = serviceTokenType;
            ServiceTokens = serviceTokens;
            Speed = speed;
            Status = status;
            Tags = tags;
            Token = token;
            Type = type;
            Vlans = vlans;
            Vrfs = vrfs;
        }
    }
}
