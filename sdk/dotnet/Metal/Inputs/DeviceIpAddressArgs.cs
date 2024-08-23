// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class DeviceIpAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR suffix for IP block assigned to this device
        /// </summary>
        [Input("cidr")]
        public Input<int>? Cidr { get; set; }

        [Input("reservationIds")]
        private InputList<string>? _reservationIds;

        /// <summary>
        /// IDs of reservations to pick the blocks from
        /// </summary>
        public InputList<string> ReservationIds
        {
            get => _reservationIds ?? (_reservationIds = new InputList<string>());
            set => _reservationIds = value;
        }

        /// <summary>
        /// one of public*ipv4,private*ipv4,public_ipv6
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeviceIpAddressArgs()
        {
        }
        public static new DeviceIpAddressArgs Empty => new DeviceIpAddressArgs();
    }
}