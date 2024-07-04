// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetReservedIpBlock
    {
        /// <summary>
        /// Use this data source to find IP address blocks in Equinix Metal. You can use IP address or a block ID for lookup.
        /// 
        /// &gt; For backward compatibility, this data source can be also used for precreated (management) IP blocks.
        /// 
        /// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
        /// </summary>
        public static Task<GetReservedIpBlockResult> InvokeAsync(GetReservedIpBlockArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetReservedIpBlockResult>("equinix:metal/getReservedIpBlock:getReservedIpBlock", args ?? new GetReservedIpBlockArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to find IP address blocks in Equinix Metal. You can use IP address or a block ID for lookup.
        /// 
        /// &gt; For backward compatibility, this data source can be also used for precreated (management) IP blocks.
        /// 
        /// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
        /// </summary>
        public static Output<GetReservedIpBlockResult> Invoke(GetReservedIpBlockInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetReservedIpBlockResult>("equinix:metal/getReservedIpBlock:getReservedIpBlock", args ?? new GetReservedIpBlockInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReservedIpBlockArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of the IP address block to look up.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Block containing this IP address will be returned.
        /// 
        /// &gt; **NOTE:** You should pass either `id`, or both `project_id` and `ip_address`.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// UUID of the project where the searched block should be.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetReservedIpBlockArgs()
        {
        }
        public static new GetReservedIpBlockArgs Empty => new GetReservedIpBlockArgs();
    }

    public sealed class GetReservedIpBlockInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of the IP address block to look up.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Block containing this IP address will be returned.
        /// 
        /// &gt; **NOTE:** You should pass either `id`, or both `project_id` and `ip_address`.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// UUID of the project where the searched block should be.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetReservedIpBlockInvokeArgs()
        {
        }
        public static new GetReservedIpBlockInvokeArgs Empty => new GetReservedIpBlockInvokeArgs();
    }


    [OutputType]
    public sealed class GetReservedIpBlockResult
    {
        public readonly string Address;
        public readonly int AddressFamily;
        public readonly int Cidr;
        public readonly string CidrNotation;
        public readonly string Facility;
        public readonly string Gateway;
        public readonly bool Global;
        public readonly string Id;
        public readonly string? IpAddress;
        public readonly bool Manageable;
        public readonly bool Management;
        public readonly string Metro;
        public readonly string Netmask;
        public readonly string Network;
        public readonly string ProjectId;
        public readonly bool Public;
        public readonly int Quantity;
        /// <summary>
        /// One of `global_ipv4`, `public_ipv4`, `private_ipv4`, `public_ipv6`,or `vrf`
        /// </summary>
        public readonly string Type;
        public readonly int VrfId;

        [OutputConstructor]
        private GetReservedIpBlockResult(
            string address,

            int addressFamily,

            int cidr,

            string cidrNotation,

            string facility,

            string gateway,

            bool global,

            string id,

            string? ipAddress,

            bool manageable,

            bool management,

            string metro,

            string netmask,

            string network,

            string projectId,

            bool @public,

            int quantity,

            string type,

            int vrfId)
        {
            Address = address;
            AddressFamily = addressFamily;
            Cidr = cidr;
            CidrNotation = cidrNotation;
            Facility = facility;
            Gateway = gateway;
            Global = global;
            Id = id;
            IpAddress = ipAddress;
            Manageable = manageable;
            Management = management;
            Metro = metro;
            Netmask = netmask;
            Network = network;
            ProjectId = projectId;
            Public = @public;
            Quantity = quantity;
            Type = type;
            VrfId = vrfId;
        }
    }
}
