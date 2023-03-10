// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Outputs
{

    [OutputType]
    public sealed class GetDeviceClusterDetailNode1VendorConfigurationResult
    {
        public readonly string ActivationKey;
        public readonly string AdminPassword;
        public readonly string Controller1;
        public readonly string ControllerFqdn;
        public readonly string Hostname;
        public readonly string RootPassword;

        [OutputConstructor]
        private GetDeviceClusterDetailNode1VendorConfigurationResult(
            string activationKey,

            string adminPassword,

            string controller1,

            string controllerFqdn,

            string hostname,

            string rootPassword)
        {
            ActivationKey = activationKey;
            AdminPassword = adminPassword;
            Controller1 = controller1;
            ControllerFqdn = controllerFqdn;
            Hostname = hostname;
            RootPassword = rootPassword;
        }
    }
}
