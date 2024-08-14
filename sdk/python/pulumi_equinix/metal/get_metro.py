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
    'GetMetroResult',
    'AwaitableGetMetroResult',
    'get_metro',
    'get_metro_output',
]

@pulumi.output_type
class GetMetroResult:
    """
    A collection of values returned by getMetro.
    """
    def __init__(__self__, capacities=None, code=None, country=None, id=None, name=None):
        if capacities and not isinstance(capacities, list):
            raise TypeError("Expected argument 'capacities' to be a list")
        pulumi.set(__self__, "capacities", capacities)
        if code and not isinstance(code, str):
            raise TypeError("Expected argument 'code' to be a str")
        pulumi.set(__self__, "code", code)
        if country and not isinstance(country, str):
            raise TypeError("Expected argument 'country' to be a str")
        pulumi.set(__self__, "country", country)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def capacities(self) -> Optional[Sequence['outputs.GetMetroCapacityResult']]:
        return pulumi.get(self, "capacities")

    @property
    @pulumi.getter
    def code(self) -> str:
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def country(self) -> str:
        """
        The country of the metro.
        """
        return pulumi.get(self, "country")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the metro.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the metro.
        """
        return pulumi.get(self, "name")


class AwaitableGetMetroResult(GetMetroResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMetroResult(
            capacities=self.capacities,
            code=self.code,
            country=self.country,
            id=self.id,
            name=self.name)


def get_metro(capacities: Optional[Sequence[Union['GetMetroCapacityArgs', 'GetMetroCapacityArgsDict']]] = None,
              code: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMetroResult:
    """
    Provides an Equinix Metal metro datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    sv = equinix.metal.get_metro(code="sv")
    pulumi.export("id", sv.id)
    ```


    :param Sequence[Union['GetMetroCapacityArgs', 'GetMetroCapacityArgsDict']] capacities: One or more device plans for which the metro must have capacity.
    :param str code: The metro code to search for.
    """
    __args__ = dict()
    __args__['capacities'] = capacities
    __args__['code'] = code
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getMetro:getMetro', __args__, opts=opts, typ=GetMetroResult).value

    return AwaitableGetMetroResult(
        capacities=pulumi.get(__ret__, 'capacities'),
        code=pulumi.get(__ret__, 'code'),
        country=pulumi.get(__ret__, 'country'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_metro)
def get_metro_output(capacities: Optional[pulumi.Input[Optional[Sequence[Union['GetMetroCapacityArgs', 'GetMetroCapacityArgsDict']]]]] = None,
                     code: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMetroResult]:
    """
    Provides an Equinix Metal metro datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    sv = equinix.metal.get_metro(code="sv")
    pulumi.export("id", sv.id)
    ```


    :param Sequence[Union['GetMetroCapacityArgs', 'GetMetroCapacityArgsDict']] capacities: One or more device plans for which the metro must have capacity.
    :param str code: The metro code to search for.
    """
    ...
