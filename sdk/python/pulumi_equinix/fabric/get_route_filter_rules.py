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

__all__ = [
    'GetRouteFilterRulesResult',
    'AwaitableGetRouteFilterRulesResult',
    'get_route_filter_rules',
    'get_route_filter_rules_output',
]

@pulumi.output_type
class GetRouteFilterRulesResult:
    """
    A collection of values returned by getRouteFilterRules.
    """
    def __init__(__self__, datas=None, id=None, limit=None, offset=None, paginations=None, route_filter_id=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if offset and not isinstance(offset, int):
            raise TypeError("Expected argument 'offset' to be a int")
        pulumi.set(__self__, "offset", offset)
        if paginations and not isinstance(paginations, list):
            raise TypeError("Expected argument 'paginations' to be a list")
        pulumi.set(__self__, "paginations", paginations)
        if route_filter_id and not isinstance(route_filter_id, str):
            raise TypeError("Expected argument 'route_filter_id' to be a str")
        pulumi.set(__self__, "route_filter_id", route_filter_id)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetRouteFilterRulesDataResult']:
        """
        The list of Rules attached to the given Route Filter Policy UUID
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> Optional[int]:
        """
        Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def offset(self) -> Optional[int]:
        """
        The page offset for the pagination request. Index of the first element. Default is 0.
        """
        return pulumi.get(self, "offset")

    @property
    @pulumi.getter
    def paginations(self) -> Sequence['outputs.GetRouteFilterRulesPaginationResult']:
        """
        Pagination details for the Data Source Search Request
        """
        return pulumi.get(self, "paginations")

    @property
    @pulumi.getter(name="routeFilterId")
    def route_filter_id(self) -> str:
        """
        UUID of the Route Filter Policy the rule is attached to
        """
        return pulumi.get(self, "route_filter_id")


class AwaitableGetRouteFilterRulesResult(GetRouteFilterRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouteFilterRulesResult(
            datas=self.datas,
            id=self.id,
            limit=self.limit,
            offset=self.offset,
            paginations=self.paginations,
            route_filter_id=self.route_filter_id)


def get_route_filter_rules(limit: Optional[int] = None,
                           offset: Optional[int] = None,
                           route_filter_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouteFilterRulesResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    rf_rules = equinix.fabric.get_route_filter_rules(route_filter_id="<route_filter_policy_id",
        limit=100,
        offset=5)
    pulumi.export("firstRouteFilterRuleName", rf_rules.datas[0].name)
    pulumi.export("firstRouteFilterRuleDescription", rf_rules.datas[0].description)
    pulumi.export("firstRouteFilterRulePrefix", rf_rules.datas[0].prefix)
    pulumi.export("firstRouteFilterRulePrefixMatch", rf_rules.datas[0].prefix_match)
    ```


    :param int limit: Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
    :param int offset: The page offset for the pagination request. Index of the first element. Default is 0.
    :param str route_filter_id: UUID of the Route Filter Policy the rule is attached to
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['offset'] = offset
    __args__['routeFilterId'] = route_filter_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getRouteFilterRules:getRouteFilterRules', __args__, opts=opts, typ=GetRouteFilterRulesResult).value

    return AwaitableGetRouteFilterRulesResult(
        datas=pulumi.get(__ret__, 'datas'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        offset=pulumi.get(__ret__, 'offset'),
        paginations=pulumi.get(__ret__, 'paginations'),
        route_filter_id=pulumi.get(__ret__, 'route_filter_id'))
def get_route_filter_rules_output(limit: Optional[pulumi.Input[Optional[int]]] = None,
                                  offset: Optional[pulumi.Input[Optional[int]]] = None,
                                  route_filter_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRouteFilterRulesResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    rf_rules = equinix.fabric.get_route_filter_rules(route_filter_id="<route_filter_policy_id",
        limit=100,
        offset=5)
    pulumi.export("firstRouteFilterRuleName", rf_rules.datas[0].name)
    pulumi.export("firstRouteFilterRuleDescription", rf_rules.datas[0].description)
    pulumi.export("firstRouteFilterRulePrefix", rf_rules.datas[0].prefix)
    pulumi.export("firstRouteFilterRulePrefixMatch", rf_rules.datas[0].prefix_match)
    ```


    :param int limit: Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
    :param int offset: The page offset for the pagination request. Index of the first element. Default is 0.
    :param str route_filter_id: UUID of the Route Filter Policy the rule is attached to
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['offset'] = offset
    __args__['routeFilterId'] = route_filter_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getRouteFilterRules:getRouteFilterRules', __args__, opts=opts, typ=GetRouteFilterRulesResult)
    return __ret__.apply(lambda __response__: GetRouteFilterRulesResult(
        datas=pulumi.get(__response__, 'datas'),
        id=pulumi.get(__response__, 'id'),
        limit=pulumi.get(__response__, 'limit'),
        offset=pulumi.get(__response__, 'offset'),
        paginations=pulumi.get(__response__, 'paginations'),
        route_filter_id=pulumi.get(__response__, 'route_filter_id')))
