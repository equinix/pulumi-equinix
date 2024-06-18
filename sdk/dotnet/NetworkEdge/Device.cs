// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    /// <summary>
    /// Resource `equinix.networkedge.Device` allows creation and management of Equinix Network Edge virtual
    /// network devices.
    /// 
    /// Network Edge virtual network devices can be created in two modes:
    /// 
    /// * **managed** - (default) Where Equinix manages connectivity and services in the device and
    ///   customer gets limited access to the device.
    /// * **self-configured** - Where customer provisions and manages own services in the device with less
    ///   restricted access. Some device types are offered only in this mode.
    /// 
    /// In addition to management modes, there are two software license modes available:
    /// 
    /// * **subscription** - Where Equinix provides software license, including end-to-end support, and
    ///   bills for the service respectively.
    /// * **BYOL** - [bring your own license] Where customer brings his own, already procured device
    ///   software license. There are no charges associated with such license. It is the only licensing mode
    ///   for `self-configured` devices.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var accountName = config.Require("accountName");
    ///     var licenseToken = config.Require("licenseToken");
    ///     var sshUserName = config.Require("sshUserName");
    ///     var sshKeyName = config.Require("sshKeyName");
    ///     var aclTemplateId = config.Require("aclTemplateId");
    ///     var metro = config.Get("metro") ?? "SV";
    ///     var devicePackageCode = config.Get("devicePackageCode") ?? "network-essentials";
    ///     var deviceVersion = config.Get("deviceVersion") ?? "17.06.01a";
    ///     var sizeInCores = config.GetNumber("sizeInCores") ?? 2;
    ///     var termLength = config.GetNumber("termLength") ?? 6;
    ///     var additionalBandwidth = config.GetNumber("additionalBandwidth") ?? 5;
    ///     var accountNum = Equinix.NetworkEdge.GetAccount.Invoke(new()
    ///     {
    ///         Name = accountName,
    ///         MetroCode = metro,
    ///     }).Apply(invoke =&gt; invoke.Number);
    /// 
    ///     var c8KRouter = new Equinix.NetworkEdge.Device("c8kRouter", new()
    ///     {
    ///         Name = "catalystRouter",
    ///         MetroCode = metro,
    ///         TypeCode = "C8000V",
    ///         SelfManaged = true,
    ///         Byol = true,
    ///         PackageCode = devicePackageCode,
    ///         Notifications = new[]
    ///         {
    ///             "example@equinix.com",
    ///         },
    ///         Hostname = "C8KV",
    ///         AccountNumber = accountNum,
    ///         Version = deviceVersion,
    ///         CoreCount = sizeInCores,
    ///         TermLength = termLength,
    ///         LicenseToken = licenseToken,
    ///         AdditionalBandwidth = additionalBandwidth,
    ///         SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
    ///         {
    ///             Username = sshUserName,
    ///             KeyName = sshKeyName,
    ///         },
    ///         AclTemplateId = aclTemplateId,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["routerId"] = c8KRouter.Id,
    ///         ["provisionStatus"] = c8KRouter.Status,
    ///         ["licenseStatus"] = c8KRouter.LicenseStatus,
    ///         ["sshIpAddress"] = c8KRouter.SshIpAddress,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing ID:
    /// 
    /// ```sh
    /// $ pulumi import equinix:networkedge/device:Device example {existing_id}
    /// ```
    /// 
    /// The `license_token`, `mgmt_acl_template_uuid` and `cloud_init_file_id` fields can not be imported.
    /// </summary>
    [EquinixResourceType("equinix:networkedge/device:Device")]
    public partial class Device : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Billing account number for a device.
        /// </summary>
        [Output("accountNumber")]
        public Output<string> AccountNumber { get; private set; } = null!;

        /// <summary>
        /// Identifier of a WAN interface ACL template that will be applied on the device.
        /// </summary>
        [Output("aclTemplateId")]
        public Output<string?> AclTemplateId { get; private set; } = null!;

        /// <summary>
        /// Additional Internet bandwidth, in Mbps, that will be
        /// allocated to the device (in addition to default 15Mbps).
        /// </summary>
        [Output("additionalBandwidth")]
        public Output<int> AdditionalBandwidth { get; private set; } = null!;

        /// <summary>
        /// (Autonomous System Number) Unique identifier for a network on the internet.
        /// </summary>
        [Output("asn")]
        public Output<int> Asn { get; private set; } = null!;

        /// <summary>
        /// Boolean value that determines device licensing mode, i.e.,
        /// `bring your own license` or `subscription` (default).
        /// </summary>
        [Output("byol")]
        public Output<bool?> Byol { get; private set; } = null!;

        /// <summary>
        /// Identifier of a cloud init file that will be applied on the device.
        /// </summary>
        [Output("cloudInitFileId")]
        public Output<string?> CloudInitFileId { get; private set; } = null!;

        /// <summary>
        /// An object that has the cluster details. See
        /// Cluster Details below for more details.
        /// </summary>
        [Output("clusterDetails")]
        public Output<Outputs.DeviceClusterDetails?> ClusterDetails { get; private set; } = null!;

        /// <summary>
        /// Device accessibility (INTERNET-ACCESS or PRIVATE or INTERNET-ACCESS-WITH-PRVT-MGMT).
        /// If not specified, default will be INTERNET-ACCESS
        /// </summary>
        [Output("connectivity")]
        public Output<string?> Connectivity { get; private set; } = null!;

        /// <summary>
        /// Number of CPU cores used by device. (**NOTE: Use this field to resize your device. When resizing your HA devices, primary device will be upgraded first. If the upgrade failed, device will be automatically rolled back to the previous state with original core number.**)
        /// </summary>
        [Output("coreCount")]
        public Output<int> CoreCount { get; private set; } = null!;

        /// <summary>
        /// Unique ID of an existing device.
        /// Use this field to let Equinix know if you want your new device to be in a different location from any existing virtual
        /// device. This field is only meaningful for single devices.
        /// </summary>
        [Output("diverseDeviceId")]
        public Output<string> DiverseDeviceId { get; private set; } = null!;

        /// <summary>
        /// Name of the device with diverse device UUID. This field is returned in device details if the
        /// device is created by passing diverse_device_id.
        /// </summary>
        [Output("diverseDeviceName")]
        public Output<string> DiverseDeviceName { get; private set; } = null!;

        /// <summary>
        /// Device hostname prefix.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// Device location Equinix Business Exchange name.
        /// </summary>
        [Output("ibx")]
        public Output<string> Ibx { get; private set; } = null!;

        /// <summary>
        /// Number of network interfaces on a device. If not specified,
        /// default number for a given device type will be used.
        /// </summary>
        [Output("interfaceCount")]
        public Output<int> InterfaceCount { get; private set; } = null!;

        /// <summary>
        /// List of device interfaces. See Interface Attribute below
        /// for more details.
        /// </summary>
        [Output("interfaces")]
        public Output<ImmutableArray<Outputs.DeviceInterface>> Interfaces { get; private set; } = null!;

        /// <summary>
        /// Path to the license file that will be uploaded and applied on a
        /// device. Applicable for some device types in BYOL licensing mode.
        /// </summary>
        [Output("licenseFile")]
        public Output<string?> LicenseFile { get; private set; } = null!;

        /// <summary>
        /// Identifier of a license file that will be applied on the device.
        /// </summary>
        [Output("licenseFileId")]
        public Output<string> LicenseFileId { get; private set; } = null!;

        /// <summary>
        /// Device license registration status. Possible values are `APPLYING_LICENSE`,
        /// `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
        /// </summary>
        [Output("licenseStatus")]
        public Output<string> LicenseStatus { get; private set; } = null!;

        /// <summary>
        /// License Token applicable for some device types in BYOL licensing
        /// mode.
        /// </summary>
        [Output("licenseToken")]
        public Output<string?> LicenseToken { get; private set; } = null!;

        /// <summary>
        /// Device location metro code.
        /// </summary>
        [Output("metroCode")]
        public Output<string> MetroCode { get; private set; } = null!;

        /// <summary>
        /// Identifier of an MGMT interface ACL template that will be
        /// applied on the device.
        /// </summary>
        [Output("mgmtAclTemplateUuid")]
        public Output<string?> MgmtAclTemplateUuid { get; private set; } = null!;

        /// <summary>
        /// Device name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of email addresses that will receive device status
        /// notifications.
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<string>> Notifications { get; private set; } = null!;

        /// <summary>
        /// Name/number used to identify device order on the invoice.
        /// </summary>
        [Output("orderReference")]
        public Output<string?> OrderReference { get; private set; } = null!;

        /// <summary>
        /// Device software package code.
        /// </summary>
        [Output("packageCode")]
        public Output<string> PackageCode { get; private set; } = null!;

        /// <summary>
        /// Unique Identifier for the project resource where the device is scoped to.If you
        /// leave it out, the device will be created under the default project id of your organization.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Purchase order number associated with a device order.
        /// </summary>
        [Output("purchaseOrderNumber")]
        public Output<string?> PurchaseOrderNumber { get; private set; } = null!;

        /// <summary>
        /// Device redundancy type applicable for HA devices, either
        /// primary or secondary.
        /// </summary>
        [Output("redundancyType")]
        public Output<string> RedundancyType { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for a redundant device applicable for HA devices.
        /// </summary>
        [Output("redundantId")]
        public Output<string> RedundantId { get; private set; } = null!;

        /// <summary>
        /// Device location region.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Definition of secondary device for redundant
        /// device configurations. See Secondary Device below for more details.
        /// </summary>
        [Output("secondaryDevice")]
        public Output<Outputs.DeviceSecondaryDevice?> SecondaryDevice { get; private set; } = null!;

        /// <summary>
        /// Boolean value that determines device management mode, i.e.,
        /// `self-managed` or `Equinix-managed` (default).
        /// </summary>
        [Output("selfManaged")]
        public Output<bool?> SelfManaged { get; private set; } = null!;

        /// <summary>
        /// IP address of SSH enabled interface on the device.
        /// </summary>
        [Output("sshIpAddress")]
        public Output<string> SshIpAddress { get; private set; } = null!;

        /// <summary>
        /// FQDN of SSH enabled interface on the device.
        /// </summary>
        [Output("sshIpFqdn")]
        public Output<string> SshIpFqdn { get; private set; } = null!;

        /// <summary>
        /// Definition of SSH key that will be provisioned on a device
        /// </summary>
        [Output("sshKey")]
        public Output<Outputs.DeviceSshKey?> SshKey { get; private set; } = null!;

        /// <summary>
        /// interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Device term length.
        /// </summary>
        [Output("termLength")]
        public Output<int> TermLength { get; private set; } = null!;

        /// <summary>
        /// Device license throughput.
        /// </summary>
        [Output("throughput")]
        public Output<int?> Throughput { get; private set; } = null!;

        /// <summary>
        /// License throughput unit. One of `Mbps` or `Gbps`.
        /// </summary>
        [Output("throughputUnit")]
        public Output<string?> ThroughputUnit { get; private set; } = null!;

        /// <summary>
        /// Device type code.
        /// </summary>
        [Output("typeCode")]
        public Output<string> TypeCode { get; private set; } = null!;

        /// <summary>
        /// Device unique identifier.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;

        /// <summary>
        /// Map of vendor specific configuration parameters for a device
        /// (controller1, activationKey, managementType, siteId, systemIpAddress, private_address, private_cidr_mask, private_gateway, license_key, license_id)
        /// * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
        /// on a device (max one key).  See SSH Key below for more details.
        /// </summary>
        [Output("vendorConfiguration")]
        public Output<ImmutableDictionary<string, string>> VendorConfiguration { get; private set; } = null!;

        /// <summary>
        /// Device software software version.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// device interface id picked for WAN
        /// </summary>
        [Output("wanInterfaceId")]
        public Output<string?> WanInterfaceId { get; private set; } = null!;

        /// <summary>
        /// Device location zone code.
        /// </summary>
        [Output("zoneCode")]
        public Output<string> ZoneCode { get; private set; } = null!;


        /// <summary>
        /// Create a Device resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Device(string name, DeviceArgs args, CustomResourceOptions? options = null)
            : base("equinix:networkedge/device:Device", name, args ?? new DeviceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Device(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
            : base("equinix:networkedge/device:Device", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Device resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Device Get(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
        {
            return new Device(name, id, state, options);
        }
    }

    public sealed class DeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Billing account number for a device.
        /// </summary>
        [Input("accountNumber", required: true)]
        public Input<string> AccountNumber { get; set; } = null!;

        /// <summary>
        /// Identifier of a WAN interface ACL template that will be applied on the device.
        /// </summary>
        [Input("aclTemplateId")]
        public Input<string>? AclTemplateId { get; set; }

        /// <summary>
        /// Additional Internet bandwidth, in Mbps, that will be
        /// allocated to the device (in addition to default 15Mbps).
        /// </summary>
        [Input("additionalBandwidth")]
        public Input<int>? AdditionalBandwidth { get; set; }

        /// <summary>
        /// Boolean value that determines device licensing mode, i.e.,
        /// `bring your own license` or `subscription` (default).
        /// </summary>
        [Input("byol")]
        public Input<bool>? Byol { get; set; }

        /// <summary>
        /// Identifier of a cloud init file that will be applied on the device.
        /// </summary>
        [Input("cloudInitFileId")]
        public Input<string>? CloudInitFileId { get; set; }

        /// <summary>
        /// An object that has the cluster details. See
        /// Cluster Details below for more details.
        /// </summary>
        [Input("clusterDetails")]
        public Input<Inputs.DeviceClusterDetailsArgs>? ClusterDetails { get; set; }

        /// <summary>
        /// Device accessibility (INTERNET-ACCESS or PRIVATE or INTERNET-ACCESS-WITH-PRVT-MGMT).
        /// If not specified, default will be INTERNET-ACCESS
        /// </summary>
        [Input("connectivity")]
        public Input<string>? Connectivity { get; set; }

        /// <summary>
        /// Number of CPU cores used by device. (**NOTE: Use this field to resize your device. When resizing your HA devices, primary device will be upgraded first. If the upgrade failed, device will be automatically rolled back to the previous state with original core number.**)
        /// </summary>
        [Input("coreCount", required: true)]
        public Input<int> CoreCount { get; set; } = null!;

        /// <summary>
        /// Unique ID of an existing device.
        /// Use this field to let Equinix know if you want your new device to be in a different location from any existing virtual
        /// device. This field is only meaningful for single devices.
        /// </summary>
        [Input("diverseDeviceId")]
        public Input<string>? DiverseDeviceId { get; set; }

        /// <summary>
        /// Device hostname prefix.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Number of network interfaces on a device. If not specified,
        /// default number for a given device type will be used.
        /// </summary>
        [Input("interfaceCount")]
        public Input<int>? InterfaceCount { get; set; }

        /// <summary>
        /// Path to the license file that will be uploaded and applied on a
        /// device. Applicable for some device types in BYOL licensing mode.
        /// </summary>
        [Input("licenseFile")]
        public Input<string>? LicenseFile { get; set; }

        /// <summary>
        /// Identifier of a license file that will be applied on the device.
        /// </summary>
        [Input("licenseFileId")]
        public Input<string>? LicenseFileId { get; set; }

        /// <summary>
        /// License Token applicable for some device types in BYOL licensing
        /// mode.
        /// </summary>
        [Input("licenseToken")]
        public Input<string>? LicenseToken { get; set; }

        /// <summary>
        /// Device location metro code.
        /// </summary>
        [Input("metroCode", required: true)]
        public Input<string> MetroCode { get; set; } = null!;

        /// <summary>
        /// Identifier of an MGMT interface ACL template that will be
        /// applied on the device.
        /// </summary>
        [Input("mgmtAclTemplateUuid")]
        public Input<string>? MgmtAclTemplateUuid { get; set; }

        /// <summary>
        /// Device name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications", required: true)]
        private InputList<string>? _notifications;

        /// <summary>
        /// List of email addresses that will receive device status
        /// notifications.
        /// </summary>
        public InputList<string> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<string>());
            set => _notifications = value;
        }

        /// <summary>
        /// Name/number used to identify device order on the invoice.
        /// </summary>
        [Input("orderReference")]
        public Input<string>? OrderReference { get; set; }

        /// <summary>
        /// Device software package code.
        /// </summary>
        [Input("packageCode", required: true)]
        public Input<string> PackageCode { get; set; } = null!;

        /// <summary>
        /// Unique Identifier for the project resource where the device is scoped to.If you
        /// leave it out, the device will be created under the default project id of your organization.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Purchase order number associated with a device order.
        /// </summary>
        [Input("purchaseOrderNumber")]
        public Input<string>? PurchaseOrderNumber { get; set; }

        /// <summary>
        /// Definition of secondary device for redundant
        /// device configurations. See Secondary Device below for more details.
        /// </summary>
        [Input("secondaryDevice")]
        public Input<Inputs.DeviceSecondaryDeviceArgs>? SecondaryDevice { get; set; }

        /// <summary>
        /// Boolean value that determines device management mode, i.e.,
        /// `self-managed` or `Equinix-managed` (default).
        /// </summary>
        [Input("selfManaged")]
        public Input<bool>? SelfManaged { get; set; }

        /// <summary>
        /// Definition of SSH key that will be provisioned on a device
        /// </summary>
        [Input("sshKey")]
        public Input<Inputs.DeviceSshKeyArgs>? SshKey { get; set; }

        /// <summary>
        /// Device term length.
        /// </summary>
        [Input("termLength", required: true)]
        public Input<int> TermLength { get; set; } = null!;

        /// <summary>
        /// Device license throughput.
        /// </summary>
        [Input("throughput")]
        public Input<int>? Throughput { get; set; }

        /// <summary>
        /// License throughput unit. One of `Mbps` or `Gbps`.
        /// </summary>
        [Input("throughputUnit")]
        public InputUnion<string, Pulumi.Equinix.NetworkEdge.ThroughputUnit>? ThroughputUnit { get; set; }

        /// <summary>
        /// Device type code.
        /// </summary>
        [Input("typeCode", required: true)]
        public Input<string> TypeCode { get; set; } = null!;

        [Input("vendorConfiguration")]
        private InputMap<string>? _vendorConfiguration;

        /// <summary>
        /// Map of vendor specific configuration parameters for a device
        /// (controller1, activationKey, managementType, siteId, systemIpAddress, private_address, private_cidr_mask, private_gateway, license_key, license_id)
        /// * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
        /// on a device (max one key).  See SSH Key below for more details.
        /// </summary>
        public InputMap<string> VendorConfiguration
        {
            get => _vendorConfiguration ?? (_vendorConfiguration = new InputMap<string>());
            set => _vendorConfiguration = value;
        }

        /// <summary>
        /// Device software software version.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        /// <summary>
        /// device interface id picked for WAN
        /// </summary>
        [Input("wanInterfaceId")]
        public Input<string>? WanInterfaceId { get; set; }

        public DeviceArgs()
        {
        }
        public static new DeviceArgs Empty => new DeviceArgs();
    }

    public sealed class DeviceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Billing account number for a device.
        /// </summary>
        [Input("accountNumber")]
        public Input<string>? AccountNumber { get; set; }

        /// <summary>
        /// Identifier of a WAN interface ACL template that will be applied on the device.
        /// </summary>
        [Input("aclTemplateId")]
        public Input<string>? AclTemplateId { get; set; }

        /// <summary>
        /// Additional Internet bandwidth, in Mbps, that will be
        /// allocated to the device (in addition to default 15Mbps).
        /// </summary>
        [Input("additionalBandwidth")]
        public Input<int>? AdditionalBandwidth { get; set; }

        /// <summary>
        /// (Autonomous System Number) Unique identifier for a network on the internet.
        /// </summary>
        [Input("asn")]
        public Input<int>? Asn { get; set; }

        /// <summary>
        /// Boolean value that determines device licensing mode, i.e.,
        /// `bring your own license` or `subscription` (default).
        /// </summary>
        [Input("byol")]
        public Input<bool>? Byol { get; set; }

        /// <summary>
        /// Identifier of a cloud init file that will be applied on the device.
        /// </summary>
        [Input("cloudInitFileId")]
        public Input<string>? CloudInitFileId { get; set; }

        /// <summary>
        /// An object that has the cluster details. See
        /// Cluster Details below for more details.
        /// </summary>
        [Input("clusterDetails")]
        public Input<Inputs.DeviceClusterDetailsGetArgs>? ClusterDetails { get; set; }

        /// <summary>
        /// Device accessibility (INTERNET-ACCESS or PRIVATE or INTERNET-ACCESS-WITH-PRVT-MGMT).
        /// If not specified, default will be INTERNET-ACCESS
        /// </summary>
        [Input("connectivity")]
        public Input<string>? Connectivity { get; set; }

        /// <summary>
        /// Number of CPU cores used by device. (**NOTE: Use this field to resize your device. When resizing your HA devices, primary device will be upgraded first. If the upgrade failed, device will be automatically rolled back to the previous state with original core number.**)
        /// </summary>
        [Input("coreCount")]
        public Input<int>? CoreCount { get; set; }

        /// <summary>
        /// Unique ID of an existing device.
        /// Use this field to let Equinix know if you want your new device to be in a different location from any existing virtual
        /// device. This field is only meaningful for single devices.
        /// </summary>
        [Input("diverseDeviceId")]
        public Input<string>? DiverseDeviceId { get; set; }

        /// <summary>
        /// Name of the device with diverse device UUID. This field is returned in device details if the
        /// device is created by passing diverse_device_id.
        /// </summary>
        [Input("diverseDeviceName")]
        public Input<string>? DiverseDeviceName { get; set; }

        /// <summary>
        /// Device hostname prefix.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Device location Equinix Business Exchange name.
        /// </summary>
        [Input("ibx")]
        public Input<string>? Ibx { get; set; }

        /// <summary>
        /// Number of network interfaces on a device. If not specified,
        /// default number for a given device type will be used.
        /// </summary>
        [Input("interfaceCount")]
        public Input<int>? InterfaceCount { get; set; }

        [Input("interfaces")]
        private InputList<Inputs.DeviceInterfaceGetArgs>? _interfaces;

        /// <summary>
        /// List of device interfaces. See Interface Attribute below
        /// for more details.
        /// </summary>
        public InputList<Inputs.DeviceInterfaceGetArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.DeviceInterfaceGetArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// Path to the license file that will be uploaded and applied on a
        /// device. Applicable for some device types in BYOL licensing mode.
        /// </summary>
        [Input("licenseFile")]
        public Input<string>? LicenseFile { get; set; }

        /// <summary>
        /// Identifier of a license file that will be applied on the device.
        /// </summary>
        [Input("licenseFileId")]
        public Input<string>? LicenseFileId { get; set; }

        /// <summary>
        /// Device license registration status. Possible values are `APPLYING_LICENSE`,
        /// `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
        /// </summary>
        [Input("licenseStatus")]
        public Input<string>? LicenseStatus { get; set; }

        /// <summary>
        /// License Token applicable for some device types in BYOL licensing
        /// mode.
        /// </summary>
        [Input("licenseToken")]
        public Input<string>? LicenseToken { get; set; }

        /// <summary>
        /// Device location metro code.
        /// </summary>
        [Input("metroCode")]
        public Input<string>? MetroCode { get; set; }

        /// <summary>
        /// Identifier of an MGMT interface ACL template that will be
        /// applied on the device.
        /// </summary>
        [Input("mgmtAclTemplateUuid")]
        public Input<string>? MgmtAclTemplateUuid { get; set; }

        /// <summary>
        /// Device name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<string>? _notifications;

        /// <summary>
        /// List of email addresses that will receive device status
        /// notifications.
        /// </summary>
        public InputList<string> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<string>());
            set => _notifications = value;
        }

        /// <summary>
        /// Name/number used to identify device order on the invoice.
        /// </summary>
        [Input("orderReference")]
        public Input<string>? OrderReference { get; set; }

        /// <summary>
        /// Device software package code.
        /// </summary>
        [Input("packageCode")]
        public Input<string>? PackageCode { get; set; }

        /// <summary>
        /// Unique Identifier for the project resource where the device is scoped to.If you
        /// leave it out, the device will be created under the default project id of your organization.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Purchase order number associated with a device order.
        /// </summary>
        [Input("purchaseOrderNumber")]
        public Input<string>? PurchaseOrderNumber { get; set; }

        /// <summary>
        /// Device redundancy type applicable for HA devices, either
        /// primary or secondary.
        /// </summary>
        [Input("redundancyType")]
        public Input<string>? RedundancyType { get; set; }

        /// <summary>
        /// Unique identifier for a redundant device applicable for HA devices.
        /// </summary>
        [Input("redundantId")]
        public Input<string>? RedundantId { get; set; }

        /// <summary>
        /// Device location region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Definition of secondary device for redundant
        /// device configurations. See Secondary Device below for more details.
        /// </summary>
        [Input("secondaryDevice")]
        public Input<Inputs.DeviceSecondaryDeviceGetArgs>? SecondaryDevice { get; set; }

        /// <summary>
        /// Boolean value that determines device management mode, i.e.,
        /// `self-managed` or `Equinix-managed` (default).
        /// </summary>
        [Input("selfManaged")]
        public Input<bool>? SelfManaged { get; set; }

        /// <summary>
        /// IP address of SSH enabled interface on the device.
        /// </summary>
        [Input("sshIpAddress")]
        public Input<string>? SshIpAddress { get; set; }

        /// <summary>
        /// FQDN of SSH enabled interface on the device.
        /// </summary>
        [Input("sshIpFqdn")]
        public Input<string>? SshIpFqdn { get; set; }

        /// <summary>
        /// Definition of SSH key that will be provisioned on a device
        /// </summary>
        [Input("sshKey")]
        public Input<Inputs.DeviceSshKeyGetArgs>? SshKey { get; set; }

        /// <summary>
        /// interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Device term length.
        /// </summary>
        [Input("termLength")]
        public Input<int>? TermLength { get; set; }

        /// <summary>
        /// Device license throughput.
        /// </summary>
        [Input("throughput")]
        public Input<int>? Throughput { get; set; }

        /// <summary>
        /// License throughput unit. One of `Mbps` or `Gbps`.
        /// </summary>
        [Input("throughputUnit")]
        public InputUnion<string, Pulumi.Equinix.NetworkEdge.ThroughputUnit>? ThroughputUnit { get; set; }

        /// <summary>
        /// Device type code.
        /// </summary>
        [Input("typeCode")]
        public Input<string>? TypeCode { get; set; }

        /// <summary>
        /// Device unique identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("vendorConfiguration")]
        private InputMap<string>? _vendorConfiguration;

        /// <summary>
        /// Map of vendor specific configuration parameters for a device
        /// (controller1, activationKey, managementType, siteId, systemIpAddress, private_address, private_cidr_mask, private_gateway, license_key, license_id)
        /// * `ssh-key` - (Optional) Definition of SSH key that will be provisioned
        /// on a device (max one key).  See SSH Key below for more details.
        /// </summary>
        public InputMap<string> VendorConfiguration
        {
            get => _vendorConfiguration ?? (_vendorConfiguration = new InputMap<string>());
            set => _vendorConfiguration = value;
        }

        /// <summary>
        /// Device software software version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// device interface id picked for WAN
        /// </summary>
        [Input("wanInterfaceId")]
        public Input<string>? WanInterfaceId { get; set; }

        /// <summary>
        /// Device location zone code.
        /// </summary>
        [Input("zoneCode")]
        public Input<string>? ZoneCode { get; set; }

        public DeviceState()
        {
        }
        public static new DeviceState Empty => new DeviceState();
    }
}
