# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetDevicesResult',
    'AwaitableGetDevicesResult',
    'get_devices',
    'get_devices_output',
]

@pulumi.output_type
class GetDevicesResult:
    """
    A collection of values returned by getDevices.
    """
    def __init__(__self__, devices=None, filters=None, id=None, organization_id=None, project_id=None, search=None, sorts=None):
        if devices and not isinstance(devices, list):
            raise TypeError("Expected argument 'devices' to be a list")
        pulumi.set(__self__, "devices", devices)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if search and not isinstance(search, str):
            raise TypeError("Expected argument 'search' to be a str")
        pulumi.set(__self__, "search", search)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def devices(self) -> Sequence['outputs.GetDevicesDeviceResult']:
        """
        list of resources with attributes like in the equninix_metal_device datasources.
        """
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetDevicesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[str]:
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def search(self) -> Optional[str]:
        return pulumi.get(self, "search")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetDevicesSortResult']]:
        return pulumi.get(self, "sorts")


class AwaitableGetDevicesResult(GetDevicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDevicesResult(
            devices=self.devices,
            filters=self.filters,
            id=self.id,
            organization_id=self.organization_id,
            project_id=self.project_id,
            search=self.search,
            sorts=self.sorts)


def get_devices(filters: Optional[Sequence[Union['GetDevicesFilterArgs', 'GetDevicesFilterArgsDict']]] = None,
                organization_id: Optional[str] = None,
                project_id: Optional[str] = None,
                search: Optional[str] = None,
                sorts: Optional[Sequence[Union['GetDevicesSortArgs', 'GetDevicesSortArgsDict']]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDevicesResult:
    """
    The datasource can be used to find a list of devices which meet filter criteria.

    If you need to fetch a single device by ID or by project ID and hostname, use the metal.Device datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_devices(project_id=local["project_id"],
        filters=[
            {
                "attribute": "plan",
                "values": ["c3.small.x86"],
            },
            {
                "attribute": "metro",
                "values": [
                    "da",
                    "sv",
                ],
            },
        ])
    pulumi.export("devices", example.devices)
    ```

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_devices(search="database")
    pulumi.export("devices", example.devices)
    ```

    ## search vs filter

    The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.


    :param Sequence[Union['GetDevicesFilterArgs', 'GetDevicesFilterArgsDict']] filters: One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `metal.Device` datasource.
    :param str organization_id: ID of organization containing the devices.
    :param str project_id: ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
    :param str search: Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['organizationId'] = organization_id
    __args__['projectId'] = project_id
    __args__['search'] = search
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getDevices:getDevices', __args__, opts=opts, typ=GetDevicesResult).value

    return AwaitableGetDevicesResult(
        devices=pulumi.get(__ret__, 'devices'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        search=pulumi.get(__ret__, 'search'),
        sorts=pulumi.get(__ret__, 'sorts'))
def get_devices_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetDevicesFilterArgs', 'GetDevicesFilterArgsDict']]]]] = None,
                       organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                       project_id: Optional[pulumi.Input[Optional[str]]] = None,
                       search: Optional[pulumi.Input[Optional[str]]] = None,
                       sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetDevicesSortArgs', 'GetDevicesSortArgsDict']]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDevicesResult]:
    """
    The datasource can be used to find a list of devices which meet filter criteria.

    If you need to fetch a single device by ID or by project ID and hostname, use the metal.Device datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_devices(project_id=local["project_id"],
        filters=[
            {
                "attribute": "plan",
                "values": ["c3.small.x86"],
            },
            {
                "attribute": "metro",
                "values": [
                    "da",
                    "sv",
                ],
            },
        ])
    pulumi.export("devices", example.devices)
    ```

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_devices(search="database")
    pulumi.export("devices", example.devices)
    ```

    ## search vs filter

    The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.


    :param Sequence[Union['GetDevicesFilterArgs', 'GetDevicesFilterArgsDict']] filters: One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `metal.Device` datasource.
    :param str organization_id: ID of organization containing the devices.
    :param str project_id: ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
    :param str search: Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['organizationId'] = organization_id
    __args__['projectId'] = project_id
    __args__['search'] = search
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:metal/getDevices:getDevices', __args__, opts=opts, typ=GetDevicesResult)
    return __ret__.apply(lambda __response__: GetDevicesResult(
        devices=pulumi.get(__response__, 'devices'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        search=pulumi.get(__response__, 'search'),
        sorts=pulumi.get(__response__, 'sorts')))
