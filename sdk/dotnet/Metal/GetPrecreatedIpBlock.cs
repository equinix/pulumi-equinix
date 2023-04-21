// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetPrecreatedIpBlock
    {
        /// <summary>
        /// Use this data source to get CIDR expression for precreated (management) IPv6 and IPv4 blocks in Equinix Metal.
        /// You can then use the cidrsubnet TF builtin function to derive subnets.
        /// 
        /// &gt; For backward compatibility, this data source will also return reserved (elastic) IP blocks.
        /// 
        /// &gt; Precreated (management) IP blocks for a metro will not be available until first device is created in that metro.
        /// 
        /// &gt; Public IPv4 blocks auto-assigned (management) to a device cannot be retrieved. If you need that information, consider using the equinix.metal.Device data source instead.
        /// </summary>
        public static Task<GetPrecreatedIpBlockResult> InvokeAsync(GetPrecreatedIpBlockArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrecreatedIpBlockResult>("equinix:metal/getPrecreatedIpBlock:getPrecreatedIpBlock", args ?? new GetPrecreatedIpBlockArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get CIDR expression for precreated (management) IPv6 and IPv4 blocks in Equinix Metal.
        /// You can then use the cidrsubnet TF builtin function to derive subnets.
        /// 
        /// &gt; For backward compatibility, this data source will also return reserved (elastic) IP blocks.
        /// 
        /// &gt; Precreated (management) IP blocks for a metro will not be available until first device is created in that metro.
        /// 
        /// &gt; Public IPv4 blocks auto-assigned (management) to a device cannot be retrieved. If you need that information, consider using the equinix.metal.Device data source instead.
        /// </summary>
        public static Output<GetPrecreatedIpBlockResult> Invoke(GetPrecreatedIpBlockInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrecreatedIpBlockResult>("equinix:metal/getPrecreatedIpBlock:getPrecreatedIpBlock", args ?? new GetPrecreatedIpBlockInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrecreatedIpBlockArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// 4 or 6, depending on which block you are looking for.
        /// </summary>
        [Input("addressFamily", required: true)]
        public int AddressFamily { get; set; }

        [Input("facility")]
        public string? Facility { get; set; }

        /// <summary>
        /// Whether to look for global block. Default is false for backward compatibility.
        /// </summary>
        [Input("global")]
        public bool? Global { get; set; }

        /// <summary>
        /// Metro of the searched block (for non-global blocks).
        /// </summary>
        [Input("metro")]
        public string? Metro { get; set; }

        /// <summary>
        /// ID of the project where the searched block should be.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Whether to look for public or private block.
        /// </summary>
        [Input("public", required: true)]
        public bool Public { get; set; }

        public GetPrecreatedIpBlockArgs()
        {
        }
        public static new GetPrecreatedIpBlockArgs Empty => new GetPrecreatedIpBlockArgs();
    }

    public sealed class GetPrecreatedIpBlockInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// 4 or 6, depending on which block you are looking for.
        /// </summary>
        [Input("addressFamily", required: true)]
        public Input<int> AddressFamily { get; set; } = null!;

        [Input("facility")]
        public Input<string>? Facility { get; set; }

        /// <summary>
        /// Whether to look for global block. Default is false for backward compatibility.
        /// </summary>
        [Input("global")]
        public Input<bool>? Global { get; set; }

        /// <summary>
        /// Metro of the searched block (for non-global blocks).
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// ID of the project where the searched block should be.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Whether to look for public or private block.
        /// </summary>
        [Input("public", required: true)]
        public Input<bool> Public { get; set; } = null!;

        public GetPrecreatedIpBlockInvokeArgs()
        {
        }
        public static new GetPrecreatedIpBlockInvokeArgs Empty => new GetPrecreatedIpBlockInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrecreatedIpBlockResult
    {
        public readonly string Address;
        public readonly int AddressFamily;
        public readonly int Cidr;
        /// <summary>
        /// CIDR notation of the looked up block.
        /// </summary>
        public readonly string CidrNotation;
        public readonly string? Facility;
        public readonly string Gateway;
        public readonly bool? Global;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool Manageable;
        public readonly bool Management;
        public readonly string? Metro;
        public readonly string Netmask;
        public readonly string Network;
        public readonly string ProjectId;
        public readonly bool Public;
        public readonly int Quantity;
        public readonly string Type;
        public readonly string VrfId;

        [OutputConstructor]
        private GetPrecreatedIpBlockResult(
            string address,

            int addressFamily,

            int cidr,

            string cidrNotation,

            string? facility,

            string gateway,

            bool? global,

            string id,

            bool manageable,

            bool management,

            string? metro,

            string netmask,

            string network,

            string projectId,

            bool @public,

            int quantity,

            string type,

            string vrfId)
        {
            Address = address;
            AddressFamily = addressFamily;
            Cidr = cidr;
            CidrNotation = cidrNotation;
            Facility = facility;
            Gateway = gateway;
            Global = global;
            Id = id;
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
