// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileMetroGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metro Code - Example SV
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Display Name
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("ibxs")]
        private InputList<string>? _ibxs;

        /// <summary>
        /// IBX- Equinix International Business Exchange list
        /// </summary>
        public InputList<string> Ibxs
        {
            get => _ibxs ?? (_ibxs = new InputList<string>());
            set => _ibxs = value;
        }

        /// <summary>
        /// In Trail
        /// </summary>
        [Input("inTrail")]
        public Input<bool>? InTrail { get; set; }

        /// <summary>
        /// Metro Name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sellerRegions")]
        private InputMap<string>? _sellerRegions;

        /// <summary>
        /// Seller Regions
        /// </summary>
        public InputMap<string> SellerRegions
        {
            get => _sellerRegions ?? (_sellerRegions = new InputMap<string>());
            set => _sellerRegions = value;
        }

        public ServiceProfileMetroGetArgs()
        {
        }
        public static new ServiceProfileMetroGetArgs Empty => new ServiceProfileMetroGetArgs();
    }
}
