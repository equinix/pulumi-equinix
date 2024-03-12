# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetVlanResult',
    'AwaitableGetVlanResult',
    'get_vlan',
    'get_vlan_output',
]

@pulumi.output_type
class GetVlanResult:
    """
    A collection of values returned by getVlan.
    """
    def __init__(__self__, assigned_devices_ids=None, description=None, facility=None, id=None, metro=None, project_id=None, vlan_id=None, vxlan=None):
        if assigned_devices_ids and not isinstance(assigned_devices_ids, list):
            raise TypeError("Expected argument 'assigned_devices_ids' to be a list")
        pulumi.set(__self__, "assigned_devices_ids", assigned_devices_ids)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if facility and not isinstance(facility, str):
            raise TypeError("Expected argument 'facility' to be a str")
        pulumi.set(__self__, "facility", facility)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metro and not isinstance(metro, str):
            raise TypeError("Expected argument 'metro' to be a str")
        pulumi.set(__self__, "metro", metro)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if vlan_id and not isinstance(vlan_id, str):
            raise TypeError("Expected argument 'vlan_id' to be a str")
        pulumi.set(__self__, "vlan_id", vlan_id)
        if vxlan and not isinstance(vxlan, int):
            raise TypeError("Expected argument 'vxlan' to be a int")
        pulumi.set(__self__, "vxlan", vxlan)

    @property
    @pulumi.getter(name="assignedDevicesIds")
    def assigned_devices_ids(self) -> Sequence[str]:
        """
        List of device ID to which this VLAN is assigned.
        """
        return pulumi.get(self, "assigned_devices_ids")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description text of the VLAN resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def facility(self) -> str:
        warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
        pulumi.log.warn("""facility is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")

        return pulumi.get(self, "facility")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def metro(self) -> str:
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> str:
        return pulumi.get(self, "vlan_id")

    @property
    @pulumi.getter
    def vxlan(self) -> int:
        return pulumi.get(self, "vxlan")


class AwaitableGetVlanResult(GetVlanResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVlanResult(
            assigned_devices_ids=self.assigned_devices_ids,
            description=self.description,
            facility=self.facility,
            id=self.id,
            metro=self.metro,
            project_id=self.project_id,
            vlan_id=self.vlan_id,
            vxlan=self.vxlan)


def get_vlan(facility: Optional[str] = None,
             metro: Optional[str] = None,
             project_id: Optional[str] = None,
             vlan_id: Optional[str] = None,
             vxlan: Optional[int] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVlanResult:
    """
    Provides an Equinix Metal Virtual Network datasource. VLANs data sources can be
    searched by VLAN UUID, or project UUID and vxlan number.

    ## Example Usage

    Fetch a vlan by ID:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    foovlan = equinix.metal.Vlan("foovlan",
        project_id=local["project_id"],
        metro="sv",
        vxlan=5)
    dsvlan = equinix.metal.get_vlan_output(vlan_id=foovlan.id)
    ```
    <!--End PulumiCodeChooser -->

    Fetch a vlan by project ID, vxlan and metro

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    dsvlan = equinix.metal.get_vlan(project_id=local["project_id"],
        vxlan=5,
        metro="sv")
    ```
    <!--End PulumiCodeChooser -->


    :param str facility: Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
    :param str metro: Metro where the VLAN is deployed.
           
           > **NOTE:** You must set either `vlan_id` or a combination of `vxlan`, `project_id`, and, `metro` or `facility`.
    :param str project_id: UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
    :param str vlan_id: Metal UUID of the VLAN resource to look up.
    :param int vxlan: vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
    """
    __args__ = dict()
    __args__['facility'] = facility
    __args__['metro'] = metro
    __args__['projectId'] = project_id
    __args__['vlanId'] = vlan_id
    __args__['vxlan'] = vxlan
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getVlan:getVlan', __args__, opts=opts, typ=GetVlanResult).value

    return AwaitableGetVlanResult(
        assigned_devices_ids=pulumi.get(__ret__, 'assigned_devices_ids'),
        description=pulumi.get(__ret__, 'description'),
        facility=pulumi.get(__ret__, 'facility'),
        id=pulumi.get(__ret__, 'id'),
        metro=pulumi.get(__ret__, 'metro'),
        project_id=pulumi.get(__ret__, 'project_id'),
        vlan_id=pulumi.get(__ret__, 'vlan_id'),
        vxlan=pulumi.get(__ret__, 'vxlan'))


@_utilities.lift_output_func(get_vlan)
def get_vlan_output(facility: Optional[pulumi.Input[Optional[str]]] = None,
                    metro: Optional[pulumi.Input[Optional[str]]] = None,
                    project_id: Optional[pulumi.Input[Optional[str]]] = None,
                    vlan_id: Optional[pulumi.Input[Optional[str]]] = None,
                    vxlan: Optional[pulumi.Input[Optional[int]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVlanResult]:
    """
    Provides an Equinix Metal Virtual Network datasource. VLANs data sources can be
    searched by VLAN UUID, or project UUID and vxlan number.

    ## Example Usage

    Fetch a vlan by ID:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    foovlan = equinix.metal.Vlan("foovlan",
        project_id=local["project_id"],
        metro="sv",
        vxlan=5)
    dsvlan = equinix.metal.get_vlan_output(vlan_id=foovlan.id)
    ```
    <!--End PulumiCodeChooser -->

    Fetch a vlan by project ID, vxlan and metro

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    dsvlan = equinix.metal.get_vlan(project_id=local["project_id"],
        vxlan=5,
        metro="sv")
    ```
    <!--End PulumiCodeChooser -->


    :param str facility: Facility where the VLAN is deployed. Deprecated, see https://feedback.equinixmetal.com/changelog/bye-facilities-hello-again-metros
    :param str metro: Metro where the VLAN is deployed.
           
           > **NOTE:** You must set either `vlan_id` or a combination of `vxlan`, `project_id`, and, `metro` or `facility`.
    :param str project_id: UUID of parent project of the VLAN. Use together with the vxlan number and metro or facility.
    :param str vlan_id: Metal UUID of the VLAN resource to look up.
    :param int vxlan: vxlan number of the VLAN to look up. Use together with the project_id and metro or facility.
    """
    ...
