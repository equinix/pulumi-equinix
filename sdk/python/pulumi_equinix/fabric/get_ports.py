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
    'GetPortsResult',
    'AwaitableGetPortsResult',
    'get_ports',
    'get_ports_output',
]

@pulumi.output_type
class GetPortsResult:
    """
    A collection of values returned by getPorts.
    """
    def __init__(__self__, data=None, filter=None, id=None):
        if data and not isinstance(data, list):
            raise TypeError("Expected argument 'data' to be a list")
        pulumi.set(__self__, "data", data)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def data(self) -> Sequence['outputs.GetPortsDatumResult']:
        """
        List of Ports
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def filter(self) -> 'outputs.GetPortsFilterResult':
        """
        name
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetPortsResult(GetPortsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPortsResult(
            data=self.data,
            filter=self.filter,
            id=self.id)


def get_ports(filter: Optional[Union['GetPortsFilterArgs', 'GetPortsFilterArgsDict']] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPortsResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch port by name

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    ports_data_name = equinix.fabric.get_ports(filter={
        "name": "<name_of_port||port_prefix>",
    })
    pulumi.export("id", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["id"])
    pulumi.export("name", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["name"])
    pulumi.export("state", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["state"])
    pulumi.export("accountName", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["account"][0]["account_name"])
    pulumi.export("type", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["type"])
    pulumi.export("bandwidth", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["bandwidth"])
    pulumi.export("usedBandwidth", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["used_bandwidth"])
    pulumi.export("encapsulationType", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["encapsulation"][0]["type"])
    pulumi.export("ibx", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["ibx"])
    pulumi.export("metroCode", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["metro_code"])
    pulumi.export("metroName", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["metro_name"])
    pulumi.export("region", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["region"])
    pulumi.export("deviceRedundancyEnabled", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["device"][0]["redundancy"][0]["enabled"])
    pulumi.export("deviceRedundancyPriority", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["device"][0]["redundancy"][0]["priority"])
    ```


    :param Union['GetPortsFilterArgs', 'GetPortsFilterArgsDict'] filter: name
    """
    __args__ = dict()
    __args__['filter'] = filter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getPorts:getPorts', __args__, opts=opts, typ=GetPortsResult).value

    return AwaitableGetPortsResult(
        data=pulumi.get(__ret__, 'data'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'))
def get_ports_output(filter: Optional[pulumi.Input[Union['GetPortsFilterArgs', 'GetPortsFilterArgsDict']]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPortsResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch port by name

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    ports_data_name = equinix.fabric.get_ports(filter={
        "name": "<name_of_port||port_prefix>",
    })
    pulumi.export("id", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["id"])
    pulumi.export("name", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["name"])
    pulumi.export("state", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["state"])
    pulumi.export("accountName", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["account"][0]["account_name"])
    pulumi.export("type", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["type"])
    pulumi.export("bandwidth", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["bandwidth"])
    pulumi.export("usedBandwidth", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["used_bandwidth"])
    pulumi.export("encapsulationType", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["encapsulation"][0]["type"])
    pulumi.export("ibx", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["ibx"])
    pulumi.export("metroCode", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["metro_code"])
    pulumi.export("metroName", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["metro_name"])
    pulumi.export("region", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["location"][0]["region"])
    pulumi.export("deviceRedundancyEnabled", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["device"][0]["redundancy"][0]["enabled"])
    pulumi.export("deviceRedundancyPriority", data["equinix_fabric_port"]["ports_data_name"]["data"][0]["device"][0]["redundancy"][0]["priority"])
    ```


    :param Union['GetPortsFilterArgs', 'GetPortsFilterArgsDict'] filter: name
    """
    __args__ = dict()
    __args__['filter'] = filter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getPorts:getPorts', __args__, opts=opts, typ=GetPortsResult)
    return __ret__.apply(lambda __response__: GetPortsResult(
        data=pulumi.get(__response__, 'data'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id')))
