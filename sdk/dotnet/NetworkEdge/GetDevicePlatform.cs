// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    public static class GetDevicePlatform
    {
        /// <summary>
        /// Use this data source to get Equinix Network Edge device platform configuration details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
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
        ///     var csrLarge = Equinix.NetworkEdge.GetDevicePlatform.Invoke(new()
        ///     {
        ///         DeviceType = "CSR1000V",
        ///         Flavor = "large",
        ///         Packages = new[]
        ///         {
        ///             "IPBASE",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDevicePlatformResult> InvokeAsync(GetDevicePlatformArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDevicePlatformResult>("equinix:networkedge/getDevicePlatform:getDevicePlatform", args ?? new GetDevicePlatformArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Network Edge device platform configuration details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
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
        ///     var csrLarge = Equinix.NetworkEdge.GetDevicePlatform.Invoke(new()
        ///     {
        ///         DeviceType = "CSR1000V",
        ///         Flavor = "large",
        ///         Packages = new[]
        ///         {
        ///             "IPBASE",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDevicePlatformResult> Invoke(GetDevicePlatformInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDevicePlatformResult>("equinix:networkedge/getDevicePlatform:getDevicePlatform", args ?? new GetDevicePlatformInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Equinix Network Edge device platform configuration details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
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
        ///     var csrLarge = Equinix.NetworkEdge.GetDevicePlatform.Invoke(new()
        ///     {
        ///         DeviceType = "CSR1000V",
        ///         Flavor = "large",
        ///         Packages = new[]
        ///         {
        ///             "IPBASE",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDevicePlatformResult> Invoke(GetDevicePlatformInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDevicePlatformResult>("equinix:networkedge/getDevicePlatform:getDevicePlatform", args ?? new GetDevicePlatformInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDevicePlatformArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of CPU cores used to limit platform search results.
        /// </summary>
        [Input("coreCount")]
        public int? CoreCount { get; set; }

        /// <summary>
        /// Device type code
        /// </summary>
        [Input("deviceType", required: true)]
        public string DeviceType { get; set; } = null!;

        /// <summary>
        /// Device platform flavor that determines number of CPU cores and memory. Supported values are: `small`, `medium`, `large`, `xlarge`.
        /// </summary>
        [Input("flavor")]
        public string? Flavor { get; set; }

        [Input("licenseOptions")]
        private List<string>? _licenseOptions;

        /// <summary>
        /// List of device licensing options to limit platform search result. Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
        /// </summary>
        public List<string> LicenseOptions
        {
            get => _licenseOptions ?? (_licenseOptions = new List<string>());
            set => _licenseOptions = value;
        }

        [Input("managementTypes")]
        private List<string>? _managementTypes;

        /// <summary>
        /// List of device management types to limit platform search results. Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
        /// </summary>
        public List<string> ManagementTypes
        {
            get => _managementTypes ?? (_managementTypes = new List<string>());
            set => _managementTypes = value;
        }

        [Input("packages")]
        private List<string>? _packages;

        /// <summary>
        /// List of software package codes to limit platform search results.
        /// </summary>
        public List<string> Packages
        {
            get => _packages ?? (_packages = new List<string>());
            set => _packages = value;
        }

        public GetDevicePlatformArgs()
        {
        }
        public static new GetDevicePlatformArgs Empty => new GetDevicePlatformArgs();
    }

    public sealed class GetDevicePlatformInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of CPU cores used to limit platform search results.
        /// </summary>
        [Input("coreCount")]
        public Input<int>? CoreCount { get; set; }

        /// <summary>
        /// Device type code
        /// </summary>
        [Input("deviceType", required: true)]
        public Input<string> DeviceType { get; set; } = null!;

        /// <summary>
        /// Device platform flavor that determines number of CPU cores and memory. Supported values are: `small`, `medium`, `large`, `xlarge`.
        /// </summary>
        [Input("flavor")]
        public Input<string>? Flavor { get; set; }

        [Input("licenseOptions")]
        private InputList<string>? _licenseOptions;

        /// <summary>
        /// List of device licensing options to limit platform search result. Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
        /// </summary>
        public InputList<string> LicenseOptions
        {
            get => _licenseOptions ?? (_licenseOptions = new InputList<string>());
            set => _licenseOptions = value;
        }

        [Input("managementTypes")]
        private InputList<string>? _managementTypes;

        /// <summary>
        /// List of device management types to limit platform search results. Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
        /// </summary>
        public InputList<string> ManagementTypes
        {
            get => _managementTypes ?? (_managementTypes = new InputList<string>());
            set => _managementTypes = value;
        }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of software package codes to limit platform search results.
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        public GetDevicePlatformInvokeArgs()
        {
        }
        public static new GetDevicePlatformInvokeArgs Empty => new GetDevicePlatformInvokeArgs();
    }


    [OutputType]
    public sealed class GetDevicePlatformResult
    {
        public readonly int CoreCount;
        public readonly string DeviceType;
        public readonly string Flavor;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> LicenseOptions;
        public readonly ImmutableArray<string> ManagementTypes;
        /// <summary>
        /// The amount of memory provided by device platform.
        /// </summary>
        public readonly int Memory;
        /// <summary>
        /// Unit of memory provider by device platform.
        /// </summary>
        public readonly string MemoryUnit;
        public readonly ImmutableArray<string> Packages;

        [OutputConstructor]
        private GetDevicePlatformResult(
            int coreCount,

            string deviceType,

            string flavor,

            string id,

            ImmutableArray<string> licenseOptions,

            ImmutableArray<string> managementTypes,

            int memory,

            string memoryUnit,

            ImmutableArray<string> packages)
        {
            CoreCount = coreCount;
            DeviceType = deviceType;
            Flavor = flavor;
            Id = id;
            LicenseOptions = licenseOptions;
            ManagementTypes = managementTypes;
            Memory = memory;
            MemoryUnit = memoryUnit;
            Packages = packages;
        }
    }
}
