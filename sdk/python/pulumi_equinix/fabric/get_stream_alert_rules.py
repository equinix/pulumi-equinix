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
    'GetStreamAlertRulesResult',
    'AwaitableGetStreamAlertRulesResult',
    'get_stream_alert_rules',
    'get_stream_alert_rules_output',
]

@pulumi.output_type
class GetStreamAlertRulesResult:
    """
    A collection of values returned by getStreamAlertRules.
    """
    def __init__(__self__, datas=None, id=None, pagination=None, stream_id=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pagination and not isinstance(pagination, dict):
            raise TypeError("Expected argument 'pagination' to be a dict")
        pulumi.set(__self__, "pagination", pagination)
        if stream_id and not isinstance(stream_id, str):
            raise TypeError("Expected argument 'stream_id' to be a str")
        pulumi.set(__self__, "stream_id", stream_id)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetStreamAlertRulesDataResult']:
        """
        Returned list of stream objects
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique identifier of the resource
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def pagination(self) -> 'outputs.GetStreamAlertRulesPaginationResult':
        """
        Pagination details for the returned stream alert rules list
        """
        return pulumi.get(self, "pagination")

    @property
    @pulumi.getter(name="streamId")
    def stream_id(self) -> str:
        """
        The uuid of the stream that is the target of the stream alert rule
        """
        return pulumi.get(self, "stream_id")


class AwaitableGetStreamAlertRulesResult(GetStreamAlertRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamAlertRulesResult(
            datas=self.datas,
            id=self.id,
            pagination=self.pagination,
            stream_id=self.stream_id)


def get_stream_alert_rules(pagination: Optional[Union['GetStreamAlertRulesPaginationArgs', 'GetStreamAlertRulesPaginationArgsDict']] = None,
                           stream_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamAlertRulesResult:
    """
    Fabric V4 API compatible data source that allows user to fetch Equinix Fabric Stream Alert Rules with pagination

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
    * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Alert-Rules

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    data_stream_alert_rules = equinix.fabric.get_stream_alert_rules(stream_id="<uuid_of_stream>",
        pagination={
            "limit": 5,
            "offset": 1,
        })
    pulumi.export("streamAlertRulesType", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["type"])
    pulumi.export("streamAlertRulesId", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["uuid"])
    pulumi.export("streamAlertRulesState", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["state"])
    pulumi.export("streamAlertRulesStreamId", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["stream_id"])
    ```


    :param Union['GetStreamAlertRulesPaginationArgs', 'GetStreamAlertRulesPaginationArgsDict'] pagination: Pagination details for the returned stream alert rules list
    :param str stream_id: The uuid of the stream that is the target of the stream alert rule
    """
    __args__ = dict()
    __args__['pagination'] = pagination
    __args__['streamId'] = stream_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getStreamAlertRules:getStreamAlertRules', __args__, opts=opts, typ=GetStreamAlertRulesResult).value

    return AwaitableGetStreamAlertRulesResult(
        datas=pulumi.get(__ret__, 'datas'),
        id=pulumi.get(__ret__, 'id'),
        pagination=pulumi.get(__ret__, 'pagination'),
        stream_id=pulumi.get(__ret__, 'stream_id'))
def get_stream_alert_rules_output(pagination: Optional[pulumi.Input[Union['GetStreamAlertRulesPaginationArgs', 'GetStreamAlertRulesPaginationArgsDict']]] = None,
                                  stream_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStreamAlertRulesResult]:
    """
    Fabric V4 API compatible data source that allows user to fetch Equinix Fabric Stream Alert Rules with pagination

    Additional Documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
    * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Alert-Rules

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    data_stream_alert_rules = equinix.fabric.get_stream_alert_rules(stream_id="<uuid_of_stream>",
        pagination={
            "limit": 5,
            "offset": 1,
        })
    pulumi.export("streamAlertRulesType", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["type"])
    pulumi.export("streamAlertRulesId", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["uuid"])
    pulumi.export("streamAlertRulesState", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["state"])
    pulumi.export("streamAlertRulesStreamId", data["equinix_fabric_stream_alert_rules"]["alert_rules"]["data"][0]["stream_id"])
    ```


    :param Union['GetStreamAlertRulesPaginationArgs', 'GetStreamAlertRulesPaginationArgsDict'] pagination: Pagination details for the returned stream alert rules list
    :param str stream_id: The uuid of the stream that is the target of the stream alert rule
    """
    __args__ = dict()
    __args__['pagination'] = pagination
    __args__['streamId'] = stream_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getStreamAlertRules:getStreamAlertRules', __args__, opts=opts, typ=GetStreamAlertRulesResult)
    return __ret__.apply(lambda __response__: GetStreamAlertRulesResult(
        datas=pulumi.get(__response__, 'datas'),
        id=pulumi.get(__response__, 'id'),
        pagination=pulumi.get(__response__, 'pagination'),
        stream_id=pulumi.get(__response__, 'stream_id')))
