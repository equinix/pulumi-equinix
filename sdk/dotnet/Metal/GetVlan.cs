// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetVlan
    {
        /// <summary>
        /// Provides an Equinix Metal Virtual Network datasource. VLANs data sources can be searched by VLAN UUID, or project UUID and vxlan number.
        /// 
        /// ## Example Usage
        /// 
        /// Fetch a vlan by ID:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foovlan = new Equinix.Metal.Vlan("foovlan", new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Metro = "sv",
        ///         Vxlan = 5,
        ///     });
        /// 
        ///     var dsvlan = Equinix.Metal.GetVlan.Invoke(new()
        ///     {
        ///         VlanId = foovlan.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Fetch a vlan by project ID, vxlan and metro
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dsvlan = Equinix.Metal.GetVlan.Invoke(new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Vxlan = 5,
        ///         Metro = "sv",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVlanResult> InvokeAsync(GetVlanArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlanResult>("equinix:metal/getVlan:getVlan", args ?? new GetVlanArgs(), options.WithDefaults());

        /// <summary>
        /// Provides an Equinix Metal Virtual Network datasource. VLANs data sources can be searched by VLAN UUID, or project UUID and vxlan number.
        /// 
        /// ## Example Usage
        /// 
        /// Fetch a vlan by ID:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foovlan = new Equinix.Metal.Vlan("foovlan", new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Metro = "sv",
        ///         Vxlan = 5,
        ///     });
        /// 
        ///     var dsvlan = Equinix.Metal.GetVlan.Invoke(new()
        ///     {
        ///         VlanId = foovlan.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Fetch a vlan by project ID, vxlan and metro
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dsvlan = Equinix.Metal.GetVlan.Invoke(new()
        ///     {
        ///         ProjectId = local.Project_id,
        ///         Vxlan = 5,
        ///         Metro = "sv",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVlanResult> Invoke(GetVlanInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVlanResult>("equinix:metal/getVlan:getVlan", args ?? new GetVlanInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVlanArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
        /// </summary>
        [Input("facility")]
        public string? Facility { get; set; }

        /// <summary>
        /// Metro where the VLAN is deployed.
        /// 
        /// &gt; **NOTE:** You must set either `vlan_id` or a combination of `vxlan`, `project_id`, and, `metro` or `facility`.
        /// </summary>
        [Input("metro")]
        public string? Metro { get; set; }

        /// <summary>
        /// UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Metal UUID of the VLAN resource to look up.
        /// </summary>
        [Input("vlanId")]
        public string? VlanId { get; set; }

        /// <summary>
        /// vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
        /// </summary>
        [Input("vxlan")]
        public int? Vxlan { get; set; }

        public GetVlanArgs()
        {
        }
        public static new GetVlanArgs Empty => new GetVlanArgs();
    }

    public sealed class GetVlanInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
        /// </summary>
        [Input("facility")]
        public Input<string>? Facility { get; set; }

        /// <summary>
        /// Metro where the VLAN is deployed.
        /// 
        /// &gt; **NOTE:** You must set either `vlan_id` or a combination of `vxlan`, `project_id`, and, `metro` or `facility`.
        /// </summary>
        [Input("metro")]
        public Input<string>? Metro { get; set; }

        /// <summary>
        /// UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Metal UUID of the VLAN resource to look up.
        /// </summary>
        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        /// <summary>
        /// vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
        /// </summary>
        [Input("vxlan")]
        public Input<int>? Vxlan { get; set; }

        public GetVlanInvokeArgs()
        {
        }
        public static new GetVlanInvokeArgs Empty => new GetVlanInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlanResult
    {
        /// <summary>
        /// List of device ID to which this VLAN is assigned.
        /// </summary>
        public readonly ImmutableArray<string> AssignedDevicesIds;
        /// <summary>
        /// Description text of the VLAN resource.
        /// </summary>
        public readonly string Description;
        public readonly string Facility;
        public readonly string Id;
        public readonly string Metro;
        public readonly string ProjectId;
        public readonly string VlanId;
        public readonly int Vxlan;

        [OutputConstructor]
        private GetVlanResult(
            ImmutableArray<string> assignedDevicesIds,

            string description,

            string facility,

            string id,

            string metro,

            string projectId,

            string vlanId,

            int vxlan)
        {
            AssignedDevicesIds = assignedDevicesIds;
            Description = description;
            Facility = facility;
            Id = id;
            Metro = metro;
            ProjectId = projectId;
            VlanId = vlanId;
            Vxlan = vxlan;
        }
    }
}
