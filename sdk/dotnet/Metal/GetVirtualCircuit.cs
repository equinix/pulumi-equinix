// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetVirtualCircuit
    {
        /// <summary>
        /// Use this data source to retrieve a virtual circuit resource from
        /// [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/)
        /// 
        /// &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
        /// </summary>
        public static Task<GetVirtualCircuitResult> InvokeAsync(GetVirtualCircuitArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualCircuitResult>("equinix:metal/getVirtualCircuit:getVirtualCircuit", args ?? new GetVirtualCircuitArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a virtual circuit resource from
        /// [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/)
        /// 
        /// &gt; VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.
        /// </summary>
        public static Output<GetVirtualCircuitResult> Invoke(GetVirtualCircuitInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualCircuitResult>("equinix:metal/getVirtualCircuit:getVirtualCircuit", args ?? new GetVirtualCircuitInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualCircuitArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the virtual circuit resource
        /// </summary>
        [Input("virtualCircuitId", required: true)]
        public string VirtualCircuitId { get; set; } = null!;

        public GetVirtualCircuitArgs()
        {
        }
        public static new GetVirtualCircuitArgs Empty => new GetVirtualCircuitArgs();
    }

    public sealed class GetVirtualCircuitInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the virtual circuit resource
        /// </summary>
        [Input("virtualCircuitId", required: true)]
        public Input<string> VirtualCircuitId { get; set; } = null!;

        public GetVirtualCircuitInvokeArgs()
        {
        }
        public static new GetVirtualCircuitInvokeArgs Empty => new GetVirtualCircuitInvokeArgs();
    }


    [OutputType]
    public sealed class GetVirtualCircuitResult
    {
        /// <summary>
        /// UUID of Connection where the VC is scoped to.
        /// </summary>
        public readonly string ConnectionId;
        /// <summary>
        /// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
        /// </summary>
        public readonly string CustomerIp;
        /// <summary>
        /// Description for the Virtual Circuit resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The password that can be set for the VRF BGP peer
        /// </summary>
        public readonly string Md5;
        /// <summary>
        /// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
        /// </summary>
        public readonly string MetalIp;
        /// <summary>
        /// Name of the virtual circuit resource.
        /// </summary>
        public readonly string Name;
        public readonly int NniVlan;
        public readonly int NniVnid;
        /// <summary>
        /// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the local_asn of the VRF.
        /// </summary>
        public readonly int PeerAsn;
        /// <summary>
        /// UUID of the Connection Port where the VC is scoped to.
        /// </summary>
        public readonly string PortId;
        /// <summary>
        /// ID of project to which the VC belongs.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Speed of the Virtual Circuit resource.
        /// </summary>
        public readonly string Speed;
        /// <summary>
        /// Status of the virtal circuit.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A subnet from one of the IP
        /// blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
        /// * For a /31 block, it will only have two IP addresses, which will be used for
        /// the metal_ip and customer_ip.
        /// * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
        /// </summary>
        public readonly string Subnet;
        /// <summary>
        /// Tags for the Virtual Circuit resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly string VirtualCircuitId;
        public readonly string VlanId;
        /// <summary>
        /// , `nni_vlan`, `nni_nvid` - VLAN parameters, see the
        /// [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
        /// </summary>
        public readonly int Vnid;
        /// <summary>
        /// UUID of the VLAN to associate.
        /// </summary>
        public readonly string VrfId;

        [OutputConstructor]
        private GetVirtualCircuitResult(
            string connectionId,

            string customerIp,

            string description,

            string id,

            string md5,

            string metalIp,

            string name,

            int nniVlan,

            int nniVnid,

            int peerAsn,

            string portId,

            string projectId,

            string speed,

            string status,

            string subnet,

            ImmutableArray<string> tags,

            string virtualCircuitId,

            string vlanId,

            int vnid,

            string vrfId)
        {
            ConnectionId = connectionId;
            CustomerIp = customerIp;
            Description = description;
            Id = id;
            Md5 = md5;
            MetalIp = metalIp;
            Name = name;
            NniVlan = nniVlan;
            NniVnid = nniVnid;
            PeerAsn = peerAsn;
            PortId = portId;
            ProjectId = projectId;
            Speed = speed;
            Status = status;
            Subnet = subnet;
            Tags = tags;
            VirtualCircuitId = virtualCircuitId;
            VlanId = vlanId;
            Vnid = vnid;
            VrfId = vrfId;
        }
    }
}
