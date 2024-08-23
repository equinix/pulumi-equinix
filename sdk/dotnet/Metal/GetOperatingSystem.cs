// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetOperatingSystem
    {
        /// <summary>
        /// Use this data source to get Equinix Metal Operating System image.
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
        ///     var example = Equinix.Metal.GetOperatingSystem.Invoke(new()
        ///     {
        ///         Distro = "ubuntu",
        ///         Version = "20.04",
        ///         ProvisionableOn = "c3.medium.x86",
        ///     });
        /// 
        ///     var server = new Equinix.Metal.Device("server", new()
        ///     {
        ///         Hostname = "tf.ubuntu",
        ///         Plan = Equinix.Metal.Plan.C3MediumX86,
        ///         Metro = "ny",
        ///         OperatingSystem = example.Apply(getOperatingSystemResult =&gt; getOperatingSystemResult.Id).Apply(System.Enum.Parse&lt;Equinix.Metal.OperatingSystem&gt;),
        ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ///         ProjectId = local.Project_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOperatingSystemResult> InvokeAsync(GetOperatingSystemArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOperatingSystemResult>("equinix:metal/getOperatingSystem:getOperatingSystem", args ?? new GetOperatingSystemArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Metal Operating System image.
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
        ///     var example = Equinix.Metal.GetOperatingSystem.Invoke(new()
        ///     {
        ///         Distro = "ubuntu",
        ///         Version = "20.04",
        ///         ProvisionableOn = "c3.medium.x86",
        ///     });
        /// 
        ///     var server = new Equinix.Metal.Device("server", new()
        ///     {
        ///         Hostname = "tf.ubuntu",
        ///         Plan = Equinix.Metal.Plan.C3MediumX86,
        ///         Metro = "ny",
        ///         OperatingSystem = example.Apply(getOperatingSystemResult =&gt; getOperatingSystemResult.Id).Apply(System.Enum.Parse&lt;Equinix.Metal.OperatingSystem&gt;),
        ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ///         ProjectId = local.Project_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOperatingSystemResult> Invoke(GetOperatingSystemInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOperatingSystemResult>("equinix:metal/getOperatingSystem:getOperatingSystem", args ?? new GetOperatingSystemInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOperatingSystemArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the OS distribution.
        /// </summary>
        [Input("distro")]
        public string? Distro { get; set; }

        /// <summary>
        /// Name or part of the name of the distribution. Case insensitive.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Plan name.
        /// </summary>
        [Input("provisionableOn")]
        public string? ProvisionableOn { get; set; }

        /// <summary>
        /// Version of the distribution.
        /// </summary>
        [Input("version")]
        public string? Version { get; set; }

        public GetOperatingSystemArgs()
        {
        }
        public static new GetOperatingSystemArgs Empty => new GetOperatingSystemArgs();
    }

    public sealed class GetOperatingSystemInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the OS distribution.
        /// </summary>
        [Input("distro")]
        public Input<string>? Distro { get; set; }

        /// <summary>
        /// Name or part of the name of the distribution. Case insensitive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Plan name.
        /// </summary>
        [Input("provisionableOn")]
        public Input<string>? ProvisionableOn { get; set; }

        /// <summary>
        /// Version of the distribution.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetOperatingSystemInvokeArgs()
        {
        }
        public static new GetOperatingSystemInvokeArgs Empty => new GetOperatingSystemInvokeArgs();
    }


    [OutputType]
    public sealed class GetOperatingSystemResult
    {
        public readonly string? Distro;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        public readonly string? ProvisionableOn;
        /// <summary>
        /// Operating system slug (same as `id`).
        /// </summary>
        public readonly string Slug;
        public readonly string? Version;

        [OutputConstructor]
        private GetOperatingSystemResult(
            string? distro,

            string id,

            string? name,

            string? provisionableOn,

            string slug,

            string? version)
        {
            Distro = distro;
            Id = id;
            Name = name;
            ProvisionableOn = provisionableOn;
            Slug = slug;
            Version = version;
        }
    }
}