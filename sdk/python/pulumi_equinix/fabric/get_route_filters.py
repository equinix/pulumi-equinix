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
    'GetRouteFiltersResult',
    'AwaitableGetRouteFiltersResult',
    'get_route_filters',
    'get_route_filters_output',
]

@pulumi.output_type
class GetRouteFiltersResult:
    """
    A collection of values returned by getRouteFilters.
    """
    def __init__(__self__, datas=None, filters=None, id=None, pagination=None, sorts=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pagination and not isinstance(pagination, dict):
            raise TypeError("Expected argument 'pagination' to be a dict")
        pulumi.set(__self__, "pagination", pagination)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetRouteFiltersDataResult']:
        """
        List of Route Filters
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def filters(self) -> Sequence['outputs.GetRouteFiltersFilterResult']:
        """
        Filters for the Data Source Search Request. Maximum of 8 total filters.
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
    @pulumi.getter
    def pagination(self) -> Optional['outputs.GetRouteFiltersPaginationResult']:
        """
        Pagination details for the Data Source Search Request
        """
        return pulumi.get(self, "pagination")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetRouteFiltersSortResult']]:
        """
        Filters for the Data Source Search Request
        """
        return pulumi.get(self, "sorts")


class AwaitableGetRouteFiltersResult(GetRouteFiltersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouteFiltersResult(
            datas=self.datas,
            filters=self.filters,
            id=self.id,
            pagination=self.pagination,
            sorts=self.sorts)


def get_route_filters(filters: Optional[Sequence[Union['GetRouteFiltersFilterArgs', 'GetRouteFiltersFilterArgsDict']]] = None,
                      pagination: Optional[Union['GetRouteFiltersPaginationArgs', 'GetRouteFiltersPaginationArgsDict']] = None,
                      sorts: Optional[Sequence[Union['GetRouteFiltersSortArgs', 'GetRouteFiltersSortArgsDict']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouteFiltersResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    rf_policies = equinix.fabric.get_route_filters(filters=[
            {
                "property": "/type",
                "operator": "=",
                "values": ["BGP_IPv4_PREFIX_FILTER"],
            },
            {
                "property": "/state",
                "operator": "=",
                "values": ["PROVISIONED"],
            },
            {
                "property": "/project/projectId",
                "operator": "=",
                "values": ["<project_id>"],
            },
        ],
        pagination={
            "offset": 0,
            "limit": 5,
            "total": 25,
        },
        sorts=[{
            "direction": "ASC",
            "property": "/name",
        }])
    pulumi.export("firstRfUuid", rf_policies.datas[0].uuid)
    pulumi.export("type", rf_policies.datas[0].type)
    pulumi.export("state", rf_policies.datas[0].state)
    pulumi.export("notMatchedRuleAction", rf_policies.datas[0].not_matched_rule_action)
    pulumi.export("connectionsCount", rf_policies.datas[0].connections_count)
    pulumi.export("rulesCount", rf_policies.datas[0].rules_count)
    ```


    :param Sequence[Union['GetRouteFiltersFilterArgs', 'GetRouteFiltersFilterArgsDict']] filters: Filters for the Data Source Search Request. Maximum of 8 total filters.
    :param Union['GetRouteFiltersPaginationArgs', 'GetRouteFiltersPaginationArgsDict'] pagination: Pagination details for the Data Source Search Request
    :param Sequence[Union['GetRouteFiltersSortArgs', 'GetRouteFiltersSortArgsDict']] sorts: Filters for the Data Source Search Request
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['pagination'] = pagination
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getRouteFilters:getRouteFilters', __args__, opts=opts, typ=GetRouteFiltersResult).value

    return AwaitableGetRouteFiltersResult(
        datas=pulumi.get(__ret__, 'datas'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        pagination=pulumi.get(__ret__, 'pagination'),
        sorts=pulumi.get(__ret__, 'sorts'))
def get_route_filters_output(filters: Optional[pulumi.Input[Sequence[Union['GetRouteFiltersFilterArgs', 'GetRouteFiltersFilterArgsDict']]]] = None,
                             pagination: Optional[pulumi.Input[Optional[Union['GetRouteFiltersPaginationArgs', 'GetRouteFiltersPaginationArgsDict']]]] = None,
                             sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetRouteFiltersSortArgs', 'GetRouteFiltersSortArgsDict']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRouteFiltersResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    rf_policies = equinix.fabric.get_route_filters(filters=[
            {
                "property": "/type",
                "operator": "=",
                "values": ["BGP_IPv4_PREFIX_FILTER"],
            },
            {
                "property": "/state",
                "operator": "=",
                "values": ["PROVISIONED"],
            },
            {
                "property": "/project/projectId",
                "operator": "=",
                "values": ["<project_id>"],
            },
        ],
        pagination={
            "offset": 0,
            "limit": 5,
            "total": 25,
        },
        sorts=[{
            "direction": "ASC",
            "property": "/name",
        }])
    pulumi.export("firstRfUuid", rf_policies.datas[0].uuid)
    pulumi.export("type", rf_policies.datas[0].type)
    pulumi.export("state", rf_policies.datas[0].state)
    pulumi.export("notMatchedRuleAction", rf_policies.datas[0].not_matched_rule_action)
    pulumi.export("connectionsCount", rf_policies.datas[0].connections_count)
    pulumi.export("rulesCount", rf_policies.datas[0].rules_count)
    ```


    :param Sequence[Union['GetRouteFiltersFilterArgs', 'GetRouteFiltersFilterArgsDict']] filters: Filters for the Data Source Search Request. Maximum of 8 total filters.
    :param Union['GetRouteFiltersPaginationArgs', 'GetRouteFiltersPaginationArgsDict'] pagination: Pagination details for the Data Source Search Request
    :param Sequence[Union['GetRouteFiltersSortArgs', 'GetRouteFiltersSortArgsDict']] sorts: Filters for the Data Source Search Request
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['pagination'] = pagination
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getRouteFilters:getRouteFilters', __args__, opts=opts, typ=GetRouteFiltersResult)
    return __ret__.apply(lambda __response__: GetRouteFiltersResult(
        datas=pulumi.get(__response__, 'datas'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        pagination=pulumi.get(__response__, 'pagination'),
        sorts=pulumi.get(__response__, 'sorts')))
