// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class ConnectionZSideAccessPointVirtualDevice
    {
        /// <summary>
        /// Connection URI information
        /// </summary>
        public readonly string? Href;
        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        public readonly string? Type;
        public readonly string? Uuid;

        [OutputConstructor]
        private ConnectionZSideAccessPointVirtualDevice(
            string? href,

            string? type,

            string? uuid)
        {
            Href = href;
            Type = type;
            Uuid = uuid;
        }
    }
}
