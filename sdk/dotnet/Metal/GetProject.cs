// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetProject
    {
        /// <summary>
        /// Use this datasource to retrieve attributes of the Project API resource.
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
        ///     var tfProject1 = Equinix.Metal.GetProject.Invoke(new()
        ///     {
        ///         Name = "Terraform Fun",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["usersOfTerraformFun"] = tfProject1.Apply(getProjectResult =&gt; getProjectResult.UserIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectResult> InvokeAsync(GetProjectArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectResult>("equinix:metal/getProject:getProject", args ?? new GetProjectArgs(), options.WithDefaults());

        /// <summary>
        /// Use this datasource to retrieve attributes of the Project API resource.
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
        ///     var tfProject1 = Equinix.Metal.GetProject.Invoke(new()
        ///     {
        ///         Name = "Terraform Fun",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["usersOfTerraformFun"] = tfProject1.Apply(getProjectResult =&gt; getProjectResult.UserIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectResult> Invoke(GetProjectInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectResult>("equinix:metal/getProject:getProject", args ?? new GetProjectInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this datasource to retrieve attributes of the Project API resource.
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
        ///     var tfProject1 = Equinix.Metal.GetProject.Invoke(new()
        ///     {
        ///         Name = "Terraform Fun",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["usersOfTerraformFun"] = tfProject1.Apply(getProjectResult =&gt; getProjectResult.UserIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectResult> Invoke(GetProjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectResult>("equinix:metal/getProject:getProject", args ?? new GetProjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name which is used to look up the project.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The UUID by which to look up the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetProjectArgs()
        {
        }
        public static new GetProjectArgs Empty => new GetProjectArgs();
    }

    public sealed class GetProjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name which is used to look up the project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID by which to look up the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetProjectInvokeArgs()
        {
        }
        public static new GetProjectInvokeArgs Empty => new GetProjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectResult
    {
        /// <summary>
        /// Whether Backend Transfer is enabled for this project.
        /// </summary>
        public readonly bool BackendTransfer;
        /// <summary>
        /// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
        /// </summary>
        public readonly Outputs.GetProjectBgpConfigResult BgpConfig;
        /// <summary>
        /// The timestamp for when the project was created.
        /// </summary>
        public readonly string Created;
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The UUID of this project's parent organization.
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// The UUID of payment method for this project.
        /// </summary>
        public readonly string PaymentMethodId;
        public readonly string ProjectId;
        /// <summary>
        /// The timestamp for the last time the project was updated.
        /// </summary>
        public readonly string Updated;
        /// <summary>
        /// List of UUIDs of user accounts which belong to this project.
        /// </summary>
        public readonly ImmutableArray<string> UserIds;

        [OutputConstructor]
        private GetProjectResult(
            bool backendTransfer,

            Outputs.GetProjectBgpConfigResult bgpConfig,

            string created,

            string id,

            string name,

            string organizationId,

            string paymentMethodId,

            string projectId,

            string updated,

            ImmutableArray<string> userIds)
        {
            BackendTransfer = backendTransfer;
            BgpConfig = bgpConfig;
            Created = created;
            Id = id;
            Name = name;
            OrganizationId = organizationId;
            PaymentMethodId = paymentMethodId;
            ProjectId = projectId;
            Updated = updated;
            UserIds = userIds;
        }
    }
}
