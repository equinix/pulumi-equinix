// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetPort
    {
        /// <summary>
        /// Use this data source to read ports of existing devices. You can read port by either its UUID,
        /// or by a device UUID and port name.
        /// 
        /// ## Example Usage
        /// 
        /// Create a device and read it's eth0 port to the datasource.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var projectId = "&lt;UUID_of_your_project&gt;";
        /// 
        ///     var testDevice = new Equinix.Metal.Device("testDevice", new()
        ///     {
        ///         Hostname = "tfacc-test-device-port",
        ///         Plan = Equinix.Metal.Plan.C3MediumX86,
        ///         Metro = "sv",
        ///         OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ///         ProjectId = projectId,
        ///     });
        /// 
        ///     var testPort = Equinix.Metal.GetPort.Invoke(new()
        ///     {
        ///         DeviceId = testDevice.Id,
        ///         Name = "eth0",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPortResult> InvokeAsync(GetPortArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPortResult>("equinix:metal/getPort:getPort", args ?? new GetPortArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to read ports of existing devices. You can read port by either its UUID,
        /// or by a device UUID and port name.
        /// 
        /// ## Example Usage
        /// 
        /// Create a device and read it's eth0 port to the datasource.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var projectId = "&lt;UUID_of_your_project&gt;";
        /// 
        ///     var testDevice = new Equinix.Metal.Device("testDevice", new()
        ///     {
        ///         Hostname = "tfacc-test-device-port",
        ///         Plan = Equinix.Metal.Plan.C3MediumX86,
        ///         Metro = "sv",
        ///         OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        ///         BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ///         ProjectId = projectId,
        ///     });
        /// 
        ///     var testPort = Equinix.Metal.GetPort.Invoke(new()
        ///     {
        ///         DeviceId = testDevice.Id,
        ///         Name = "eth0",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPortResult> Invoke(GetPortInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPortResult>("equinix:metal/getPort:getPort", args ?? new GetPortInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPortArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Device UUID where to lookup the port.
        /// </summary>
        [Input("deviceId")]
        public string? DeviceId { get; set; }

        /// <summary>
        /// Name of the port to look up, i.e. `bond0`, `eth1`.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// ID of the port to read, conflicts with `device_id`.
        /// </summary>
        [Input("portId")]
        public string? PortId { get; set; }

        public GetPortArgs()
        {
        }
        public static new GetPortArgs Empty => new GetPortArgs();
    }

    public sealed class GetPortInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Device UUID where to lookup the port.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Name of the port to look up, i.e. `bond0`, `eth1`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the port to read, conflicts with `device_id`.
        /// </summary>
        [Input("portId")]
        public Input<string>? PortId { get; set; }

        public GetPortInvokeArgs()
        {
        }
        public static new GetPortInvokeArgs Empty => new GetPortInvokeArgs();
    }


    [OutputType]
    public sealed class GetPortResult
    {
        /// <summary>
        /// UUID of the bond port.
        /// </summary>
        public readonly string BondId;
        /// <summary>
        /// Name of the bond port.
        /// </summary>
        public readonly string BondName;
        /// <summary>
        /// Flag indicating whether the port is bonded.
        /// </summary>
        public readonly bool Bonded;
        public readonly string? DeviceId;
        /// <summary>
        /// Flag indicating whether the port can be removed from a bond.
        /// </summary>
        public readonly bool DisbondSupported;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool Layer2;
        /// <summary>
        /// MAC address of the port.
        /// </summary>
        public readonly string Mac;
        public readonly string Name;
        /// <summary>
        /// UUID of native VLAN of the port.
        /// </summary>
        public readonly string NativeVlanId;
        /// <summary>
        /// One of `layer2-bonded`, `layer2-individual`, `layer3`, `hybrid`, `hybrid-bonded`.
        /// </summary>
        public readonly string NetworkType;
        public readonly string? PortId;
        /// <summary>
        /// Type is either `NetworkBondPort` for bond ports or `NetworkPort` for bondable ethernet ports.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// UUIDs of attached VLANs.
        /// </summary>
        public readonly ImmutableArray<string> VlanIds;
        /// <summary>
        /// VXLAN ids of attached VLANs.
        /// </summary>
        public readonly ImmutableArray<int> VxlanIds;

        [OutputConstructor]
        private GetPortResult(
            string bondId,

            string bondName,

            bool bonded,

            string? deviceId,

            bool disbondSupported,

            string id,

            bool layer2,

            string mac,

            string name,

            string nativeVlanId,

            string networkType,

            string? portId,

            string type,

            ImmutableArray<string> vlanIds,

            ImmutableArray<int> vxlanIds)
        {
            BondId = bondId;
            BondName = bondName;
            Bonded = bonded;
            DeviceId = deviceId;
            DisbondSupported = disbondSupported;
            Id = id;
            Layer2 = layer2;
            Mac = mac;
            Name = name;
            NativeVlanId = nativeVlanId;
            NetworkType = networkType;
            PortId = portId;
            Type = type;
            VlanIds = vlanIds;
            VxlanIds = vxlanIds;
        }
    }
}
