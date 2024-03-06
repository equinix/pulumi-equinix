# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetServiceProfilesResult',
    'AwaitableGetServiceProfilesResult',
    'get_service_profiles',
    'get_service_profiles_output',
]

@pulumi.output_type
class GetServiceProfilesResult:
    """
    A collection of values returned by getServiceProfiles.
    """
    def __init__(__self__, data=None, filter=None, id=None, sort=None, view_point=None):
        if data and not isinstance(data, list):
            raise TypeError("Expected argument 'data' to be a list")
        pulumi.set(__self__, "data", data)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if sort and not isinstance(sort, list):
            raise TypeError("Expected argument 'sort' to be a list")
        pulumi.set(__self__, "sort", sort)
        if view_point and not isinstance(view_point, str):
            raise TypeError("Expected argument 'view_point' to be a str")
        pulumi.set(__self__, "view_point", view_point)

    @property
    @pulumi.getter
    def data(self) -> Sequence['outputs.GetServiceProfilesDatumResult']:
        """
        List of Service Profiles
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetServiceProfilesFilterResult']:
        """
        Service Profile Search Filter
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def sort(self) -> Optional[Sequence['outputs.GetServiceProfilesSortResult']]:
        """
        Service Profile Sort criteria for Search Request response payload
        """
        return pulumi.get(self, "sort")

    @property
    @pulumi.getter(name="viewPoint")
    def view_point(self) -> Optional[str]:
        """
        flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
        """
        return pulumi.get(self, "view_point")


class AwaitableGetServiceProfilesResult(GetServiceProfilesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceProfilesResult(
            data=self.data,
            filter=self.filter,
            id=self.id,
            sort=self.sort,
            view_point=self.view_point)


def get_service_profiles(filter: Optional[pulumi.InputType['GetServiceProfilesFilterArgs']] = None,
                         sort: Optional[Sequence[pulumi.InputType['GetServiceProfilesSortArgs']]] = None,
                         view_point: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceProfilesResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch Service Profile by name filter criteria

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    service_profiles_data_name = equinix.fabric.get_service_profiles(filter=equinix.fabric.GetServiceProfilesFilterArgs(
        operator="=",
        property="/name",
        values=["<list_of_profiles_to_return>"],
    ))
    ```


    :param pulumi.InputType['GetServiceProfilesFilterArgs'] filter: Service Profile Search Filter
    :param Sequence[pulumi.InputType['GetServiceProfilesSortArgs']] sort: Service Profile Sort criteria for Search Request response payload
    :param str view_point: flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['sort'] = sort
    __args__['viewPoint'] = view_point
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getServiceProfiles:getServiceProfiles', __args__, opts=opts, typ=GetServiceProfilesResult).value

    return AwaitableGetServiceProfilesResult(
        data=pulumi.get(__ret__, 'data'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        sort=pulumi.get(__ret__, 'sort'),
        view_point=pulumi.get(__ret__, 'view_point'))


@_utilities.lift_output_func(get_service_profiles)
def get_service_profiles_output(filter: Optional[pulumi.Input[Optional[pulumi.InputType['GetServiceProfilesFilterArgs']]]] = None,
                                sort: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetServiceProfilesSortArgs']]]]] = None,
                                view_point: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceProfilesResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch Service Profile by name filter criteria

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    service_profiles_data_name = equinix.fabric.get_service_profiles(filter=equinix.fabric.GetServiceProfilesFilterArgs(
        operator="=",
        property="/name",
        values=["<list_of_profiles_to_return>"],
    ))
    ```


    :param pulumi.InputType['GetServiceProfilesFilterArgs'] filter: Service Profile Search Filter
    :param Sequence[pulumi.InputType['GetServiceProfilesSortArgs']] sort: Service Profile Sort criteria for Search Request response payload
    :param str view_point: flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
    """
    ...
