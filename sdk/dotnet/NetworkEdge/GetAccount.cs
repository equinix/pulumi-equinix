// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    public static class GetAccount
    {
        /// <summary>
        /// Use this data source to get number and identifier of Equinix Network Edge billing account in a given metro location.
        /// 
        /// Billing account reference is required to create Network Edge virtual device in corresponding metro location.
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
        ///     var dc = Equinix.NetworkEdge.GetAccount.Invoke(new()
        ///     {
        ///         MetroCode = "DC",
        ///         Status = "Active",
        ///         ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["number"] = dc.Apply(getAccountResult =&gt; getAccountResult.Number),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(GetAccountArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("equinix:networkedge/getAccount:getAccount", args ?? new GetAccountArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get number and identifier of Equinix Network Edge billing account in a given metro location.
        /// 
        /// Billing account reference is required to create Network Edge virtual device in corresponding metro location.
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
        ///     var dc = Equinix.NetworkEdge.GetAccount.Invoke(new()
        ///     {
        ///         MetroCode = "DC",
        ///         Status = "Active",
        ///         ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["number"] = dc.Apply(getAccountResult =&gt; getAccountResult.Number),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountResult> Invoke(GetAccountInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("equinix:networkedge/getAccount:getAccount", args ?? new GetAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account location metro code.
        /// </summary>
        [Input("metroCode", required: true)]
        public string MetroCode { get; set; } = null!;

        /// <summary>
        /// Account name for filtering.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetAccountArgs()
        {
        }
        public static new GetAccountArgs Empty => new GetAccountArgs();
    }

    public sealed class GetAccountInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account location metro code.
        /// </summary>
        [Input("metroCode", required: true)]
        public Input<string> MetroCode { get; set; } = null!;

        /// <summary>
        /// Account name for filtering.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetAccountInvokeArgs()
        {
        }
        public static new GetAccountInvokeArgs Empty => new GetAccountInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string MetroCode;
        public readonly string Name;
        /// <summary>
        /// Account unique number.
        /// </summary>
        public readonly string Number;
        public readonly string ProjectId;
        public readonly string Status;
        /// <summary>
        /// Account unique identifier.
        /// </summary>
        public readonly string UcmId;

        [OutputConstructor]
        private GetAccountResult(
            string id,

            string metroCode,

            string name,

            string number,

            string projectId,

            string status,

            string ucmId)
        {
            Id = id;
            MetroCode = metroCode;
            Name = name;
            Number = number;
            ProjectId = projectId;
            Status = status;
            UcmId = ucmId;
        }
    }
}
