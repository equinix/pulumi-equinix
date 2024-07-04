// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    public static class GetDeviceSoftware
    {
        /// <summary>
        /// Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
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
        ///     var csrLatest1609 = Equinix.NetworkEdge.GetDeviceSoftware.Invoke(new()
        ///     {
        ///         DeviceType = "CSR1000V",
        ///         MostRecent = true,
        ///         Packages = new[]
        ///         {
        ///             "IPBASE",
        ///         },
        ///         VersionRegex = "^16.09.+",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDeviceSoftwareResult> InvokeAsync(GetDeviceSoftwareArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeviceSoftwareResult>("equinix:networkedge/getDeviceSoftware:getDeviceSoftware", args ?? new GetDeviceSoftwareArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
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
        ///     var csrLatest1609 = Equinix.NetworkEdge.GetDeviceSoftware.Invoke(new()
        ///     {
        ///         DeviceType = "CSR1000V",
        ///         MostRecent = true,
        ///         Packages = new[]
        ///         {
        ///             "IPBASE",
        ///         },
        ///         VersionRegex = "^16.09.+",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeviceSoftwareResult> Invoke(GetDeviceSoftwareInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeviceSoftwareResult>("equinix:networkedge/getDeviceSoftware:getDeviceSoftware", args ?? new GetDeviceSoftwareInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceSoftwareArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Code of a device type.
        /// </summary>
        [Input("deviceType", required: true)]
        public string DeviceType { get; set; } = null!;

        /// <summary>
        /// Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        [Input("packages")]
        private List<string>? _packages;

        /// <summary>
        /// Limits returned versions to those that are supported by given software package codes.
        /// </summary>
        public List<string> Packages
        {
            get => _packages ?? (_packages = new List<string>());
            set => _packages = value;
        }

        /// <summary>
        /// Boolean value to limit query results to stable versions only.
        /// </summary>
        [Input("stable")]
        public bool? Stable { get; set; }

        /// <summary>
        /// A regex string to apply on returned versions and filter search results.
        /// </summary>
        [Input("versionRegex")]
        public string? VersionRegex { get; set; }

        public GetDeviceSoftwareArgs()
        {
        }
        public static new GetDeviceSoftwareArgs Empty => new GetDeviceSoftwareArgs();
    }

    public sealed class GetDeviceSoftwareInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Code of a device type.
        /// </summary>
        [Input("deviceType", required: true)]
        public Input<string> DeviceType { get; set; } = null!;

        /// <summary>
        /// Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// Limits returned versions to those that are supported by given software package codes.
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        /// <summary>
        /// Boolean value to limit query results to stable versions only.
        /// </summary>
        [Input("stable")]
        public Input<bool>? Stable { get; set; }

        /// <summary>
        /// A regex string to apply on returned versions and filter search results.
        /// </summary>
        [Input("versionRegex")]
        public Input<string>? VersionRegex { get; set; }

        public GetDeviceSoftwareInvokeArgs()
        {
        }
        public static new GetDeviceSoftwareInvokeArgs Empty => new GetDeviceSoftwareInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceSoftwareResult
    {
        /// <summary>
        /// Version release date.
        /// </summary>
        public readonly string Date;
        public readonly string DeviceType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Software image name.
        /// </summary>
        public readonly string ImageName;
        public readonly bool? MostRecent;
        public readonly ImmutableArray<string> Packages;
        /// <summary>
        /// Link to version release notes.
        /// </summary>
        public readonly string ReleaseNotesLink;
        public readonly bool Stable;
        /// <summary>
        /// Version status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Version number.
        /// </summary>
        public readonly string Version;
        public readonly string? VersionRegex;

        [OutputConstructor]
        private GetDeviceSoftwareResult(
            string date,

            string deviceType,

            string id,

            string imageName,

            bool? mostRecent,

            ImmutableArray<string> packages,

            string releaseNotesLink,

            bool stable,

            string status,

            string version,

            string? versionRegex)
        {
            Date = date;
            DeviceType = deviceType;
            Id = id;
            ImageName = imageName;
            MostRecent = mostRecent;
            Packages = packages;
            ReleaseNotesLink = releaseNotesLink;
            Stable = stable;
            Status = status;
            Version = version;
            VersionRegex = versionRegex;
        }
    }
}
