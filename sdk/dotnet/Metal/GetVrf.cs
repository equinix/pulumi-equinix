// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetVrf
    {
        /// <summary>
        /// Use this data source to retrieve a VRF resource.
        /// 
        /// &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
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
        ///     var exampleVrf = Equinix.Metal.GetVrf.Invoke(new()
        ///     {
        ///         VrfId = "48630899-9ff2-4ce6-a93f-50ff4ebcdf6e",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVrfResult> InvokeAsync(GetVrfArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVrfResult>("equinix:metal/getVrf:getVrf", args ?? new GetVrfArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a VRF resource.
        /// 
        /// &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
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
        ///     var exampleVrf = Equinix.Metal.GetVrf.Invoke(new()
        ///     {
        ///         VrfId = "48630899-9ff2-4ce6-a93f-50ff4ebcdf6e",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVrfResult> Invoke(GetVrfInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVrfResult>("equinix:metal/getVrf:getVrf", args ?? new GetVrfInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVrfArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the VRF resource
        /// </summary>
        [Input("vrfId", required: true)]
        public string VrfId { get; set; } = null!;

        public GetVrfArgs()
        {
        }
        public static new GetVrfArgs Empty => new GetVrfArgs();
    }

    public sealed class GetVrfInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the VRF resource
        /// </summary>
        [Input("vrfId", required: true)]
        public Input<string> VrfId { get; set; } = null!;

        public GetVrfInvokeArgs()
        {
        }
        public static new GetVrfInvokeArgs Empty => new GetVrfInvokeArgs();
    }


    [OutputType]
    public sealed class GetVrfResult
    {
        /// <summary>
        /// Description of the VRF.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        /// </summary>
        public readonly ImmutableArray<string> IpRanges;
        /// <summary>
        /// The 4-byte ASN set on the VRF.
        /// </summary>
        public readonly int LocalAsn;
        /// <summary>
        /// Metro ID or Code where the VRF will be deployed.
        /// </summary>
        public readonly string Metro;
        /// <summary>
        /// User-supplied name of the VRF, unique to the project
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Project ID where the VRF will be deployed.
        /// </summary>
        public readonly string ProjectId;
        public readonly string VrfId;

        [OutputConstructor]
        private GetVrfResult(
            string description,

            string id,

            ImmutableArray<string> ipRanges,

            int localAsn,

            string metro,

            string name,

            string projectId,

            string vrfId)
        {
            Description = description;
            Id = id;
            IpRanges = ipRanges;
            LocalAsn = localAsn;
            Metro = metro;
            Name = name;
            ProjectId = projectId;
            VrfId = vrfId;
        }
    }
}
