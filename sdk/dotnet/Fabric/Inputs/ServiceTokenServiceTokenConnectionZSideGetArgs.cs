// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceTokenServiceTokenConnectionZSideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessPointSelectors", required: true)]
        private InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorGetArgs>? _accessPointSelectors;

        /// <summary>
        /// List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
        /// </summary>
        public InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorGetArgs> AccessPointSelectors
        {
            get => _accessPointSelectors ?? (_accessPointSelectors = new InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorGetArgs>());
            set => _accessPointSelectors = value;
        }

        public ServiceTokenServiceTokenConnectionZSideGetArgs()
        {
        }
        public static new ServiceTokenServiceTokenConnectionZSideGetArgs Empty => new ServiceTokenServiceTokenConnectionZSideGetArgs();
    }
}
