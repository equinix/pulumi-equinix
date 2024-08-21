// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetOrganization
    {
        /// <summary>
        /// Provides an Equinix Metal organization datasource.
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
        ///     var test = Equinix.Metal.GetOrganization.Invoke(new()
        ///     {
        ///         OrganizationId = local.Org_id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["projectsInTheOrg"] = test.Apply(getOrganizationResult =&gt; getOrganizationResult.ProjectIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(GetOrganizationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("equinix:metal/getOrganization:getOrganization", args ?? new GetOrganizationArgs(), options.WithDefaults());

        /// <summary>
        /// Provides an Equinix Metal organization datasource.
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
        ///     var test = Equinix.Metal.GetOrganization.Invoke(new()
        ///     {
        ///         OrganizationId = local.Org_id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["projectsInTheOrg"] = test.Apply(getOrganizationResult =&gt; getOrganizationResult.ProjectIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(GetOrganizationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("equinix:metal/getOrganization:getOrganization", args ?? new GetOrganizationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Description string.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The organization name.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The UUID of the organization resource.
        /// 
        /// Exactly one of `name` or `organization_id` must be given.
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        public GetOrganizationArgs()
        {
        }
        public static new GetOrganizationArgs Empty => new GetOrganizationArgs();
    }

    public sealed class GetOrganizationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Description string.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The organization name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID of the organization resource.
        /// 
        /// Exactly one of `name` or `organization_id` must be given.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public GetOrganizationInvokeArgs()
        {
        }
        public static new GetOrganizationInvokeArgs Empty => new GetOrganizationInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationResult
    {
        /// <summary>
        /// Postal address.
        /// </summary>
        public readonly Outputs.GetOrganizationAddressResult Address;
        /// <summary>
        /// Description string.
        /// </summary>
        public readonly string? Description;
        public readonly string Id;
        /// <summary>
        /// (Deprecated) Logo URL.
        /// </summary>
        public readonly string Logo;
        public readonly string Name;
        public readonly string OrganizationId;
        /// <summary>
        /// UUIDs of project resources which belong to this organization.
        /// </summary>
        public readonly ImmutableArray<string> ProjectIds;
        /// <summary>
        /// Twitter handle.
        /// </summary>
        public readonly string Twitter;
        /// <summary>
        /// Website link.
        /// </summary>
        public readonly string Website;

        [OutputConstructor]
        private GetOrganizationResult(
            Outputs.GetOrganizationAddressResult address,

            string? description,

            string id,

            string logo,

            string name,

            string organizationId,

            ImmutableArray<string> projectIds,

            string twitter,

            string website)
        {
            Address = address;
            Description = description;
            Id = id;
            Logo = logo;
            Name = name;
            OrganizationId = organizationId;
            ProjectIds = projectIds;
            Twitter = twitter;
            Website = website;
        }
    }
}
