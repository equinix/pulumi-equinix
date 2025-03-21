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
    'GetNetworksResult',
    'AwaitableGetNetworksResult',
    'get_networks',
    'get_networks_output',
]

@pulumi.output_type
class GetNetworksResult:
    """
    A collection of values returned by getNetworks.
    """
    def __init__(__self__, datas=None, filters=None, id=None, outer_operator=None, pagination=None, sorts=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if outer_operator and not isinstance(outer_operator, str):
            raise TypeError("Expected argument 'outer_operator' to be a str")
        pulumi.set(__self__, "outer_operator", outer_operator)
        if pagination and not isinstance(pagination, dict):
            raise TypeError("Expected argument 'pagination' to be a dict")
        pulumi.set(__self__, "pagination", pagination)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetNetworksDataResult']:
        """
        List of Cloud Routers
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def filters(self) -> Sequence['outputs.GetNetworksFilterResult']:
        """
        Filters for the Data Source Search Request
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outerOperator")
    def outer_operator(self) -> str:
        """
        Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
        """
        return pulumi.get(self, "outer_operator")

    @property
    @pulumi.getter
    def pagination(self) -> Optional['outputs.GetNetworksPaginationResult']:
        """
        Pagination details for the Data Source Search Request
        """
        return pulumi.get(self, "pagination")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetNetworksSortResult']]:
        """
        Filters for the Data Source Search Request
        """
        return pulumi.get(self, "sorts")


class AwaitableGetNetworksResult(GetNetworksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworksResult(
            datas=self.datas,
            filters=self.filters,
            id=self.id,
            outer_operator=self.outer_operator,
            pagination=self.pagination,
            sorts=self.sorts)


def get_networks(filters: Optional[Sequence[Union['GetNetworksFilterArgs', 'GetNetworksFilterArgsDict']]] = None,
                 outer_operator: Optional[str] = None,
                 pagination: Optional[Union['GetNetworksPaginationArgs', 'GetNetworksPaginationArgsDict']] = None,
                 sorts: Optional[Sequence[Union['GetNetworksSortArgs', 'GetNetworksSortArgsDict']]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworksResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks


    :param Sequence[Union['GetNetworksFilterArgs', 'GetNetworksFilterArgsDict']] filters: Filters for the Data Source Search Request
    :param str outer_operator: Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
    :param Union['GetNetworksPaginationArgs', 'GetNetworksPaginationArgsDict'] pagination: Pagination details for the Data Source Search Request
    :param Sequence[Union['GetNetworksSortArgs', 'GetNetworksSortArgsDict']] sorts: Filters for the Data Source Search Request
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['outerOperator'] = outer_operator
    __args__['pagination'] = pagination
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getNetworks:getNetworks', __args__, opts=opts, typ=GetNetworksResult).value

    return AwaitableGetNetworksResult(
        datas=pulumi.get(__ret__, 'datas'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        outer_operator=pulumi.get(__ret__, 'outer_operator'),
        pagination=pulumi.get(__ret__, 'pagination'),
        sorts=pulumi.get(__ret__, 'sorts'))
def get_networks_output(filters: Optional[pulumi.Input[Sequence[Union['GetNetworksFilterArgs', 'GetNetworksFilterArgsDict']]]] = None,
                        outer_operator: Optional[pulumi.Input[str]] = None,
                        pagination: Optional[pulumi.Input[Optional[Union['GetNetworksPaginationArgs', 'GetNetworksPaginationArgsDict']]]] = None,
                        sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworksSortArgs', 'GetNetworksSortArgsDict']]]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworksResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks


    :param Sequence[Union['GetNetworksFilterArgs', 'GetNetworksFilterArgsDict']] filters: Filters for the Data Source Search Request
    :param str outer_operator: Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
    :param Union['GetNetworksPaginationArgs', 'GetNetworksPaginationArgsDict'] pagination: Pagination details for the Data Source Search Request
    :param Sequence[Union['GetNetworksSortArgs', 'GetNetworksSortArgsDict']] sorts: Filters for the Data Source Search Request
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['outerOperator'] = outer_operator
    __args__['pagination'] = pagination
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getNetworks:getNetworks', __args__, opts=opts, typ=GetNetworksResult)
    return __ret__.apply(lambda __response__: GetNetworksResult(
        datas=pulumi.get(__response__, 'datas'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        outer_operator=pulumi.get(__response__, 'outer_operator'),
        pagination=pulumi.get(__response__, 'pagination'),
        sorts=pulumi.get(__response__, 'sorts')))
