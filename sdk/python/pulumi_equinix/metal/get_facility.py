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
    'GetFacilityResult',
    'AwaitableGetFacilityResult',
    'get_facility',
    'get_facility_output',
]

@pulumi.output_type
class GetFacilityResult:
    """
    A collection of values returned by getFacility.
    """
    def __init__(__self__, capacities=None, code=None, features=None, features_requireds=None, id=None, metro=None, name=None):
        if capacities and not isinstance(capacities, list):
            raise TypeError("Expected argument 'capacities' to be a list")
        pulumi.set(__self__, "capacities", capacities)
        if code and not isinstance(code, str):
            raise TypeError("Expected argument 'code' to be a str")
        pulumi.set(__self__, "code", code)
        if features and not isinstance(features, list):
            raise TypeError("Expected argument 'features' to be a list")
        pulumi.set(__self__, "features", features)
        if features_requireds and not isinstance(features_requireds, list):
            raise TypeError("Expected argument 'features_requireds' to be a list")
        pulumi.set(__self__, "features_requireds", features_requireds)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metro and not isinstance(metro, str):
            raise TypeError("Expected argument 'metro' to be a str")
        pulumi.set(__self__, "metro", metro)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def capacities(self) -> Optional[Sequence['outputs.GetFacilityCapacityResult']]:
        return pulumi.get(self, "capacities")

    @property
    @pulumi.getter
    def code(self) -> str:
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def features(self) -> Sequence[str]:
        """
        The features of the facility.
        """
        return pulumi.get(self, "features")

    @property
    @pulumi.getter(name="featuresRequireds")
    def features_requireds(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "features_requireds")

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
        """
        The metro code the facility is part of.
        """
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the facility.
        """
        return pulumi.get(self, "name")


class AwaitableGetFacilityResult(GetFacilityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFacilityResult(
            capacities=self.capacities,
            code=self.code,
            features=self.features,
            features_requireds=self.features_requireds,
            id=self.id,
            metro=self.metro,
            name=self.name)


def get_facility(capacities: Optional[Sequence[Union['GetFacilityCapacityArgs', 'GetFacilityCapacityArgsDict']]] = None,
                 code: Optional[str] = None,
                 features_requireds: Optional[Sequence[str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFacilityResult:
    """
    > **Deprecated** Use `metal_get_metro` instead. For more information, refer to the facility to metro migration guide.

    Provides an Equinix Metal facility datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    ny5 = equinix.metal.get_facility(code="ny5")
    pulumi.export("id", ny5.id)
    ```


    :param Sequence[Union['GetFacilityCapacityArgs', 'GetFacilityCapacityArgsDict']] capacities: One or more device plans for which the facility must have capacity.
    :param str code: The facility code to search for facilities.
    :param Sequence[str] features_requireds: Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
    """
    __args__ = dict()
    __args__['capacities'] = capacities
    __args__['code'] = code
    __args__['featuresRequireds'] = features_requireds
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getFacility:getFacility', __args__, opts=opts, typ=GetFacilityResult).value

    return AwaitableGetFacilityResult(
        capacities=pulumi.get(__ret__, 'capacities'),
        code=pulumi.get(__ret__, 'code'),
        features=pulumi.get(__ret__, 'features'),
        features_requireds=pulumi.get(__ret__, 'features_requireds'),
        id=pulumi.get(__ret__, 'id'),
        metro=pulumi.get(__ret__, 'metro'),
        name=pulumi.get(__ret__, 'name'))
def get_facility_output(capacities: Optional[pulumi.Input[Optional[Sequence[Union['GetFacilityCapacityArgs', 'GetFacilityCapacityArgsDict']]]]] = None,
                        code: Optional[pulumi.Input[str]] = None,
                        features_requireds: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFacilityResult]:
    """
    > **Deprecated** Use `metal_get_metro` instead. For more information, refer to the facility to metro migration guide.

    Provides an Equinix Metal facility datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    ny5 = equinix.metal.get_facility(code="ny5")
    pulumi.export("id", ny5.id)
    ```


    :param Sequence[Union['GetFacilityCapacityArgs', 'GetFacilityCapacityArgsDict']] capacities: One or more device plans for which the facility must have capacity.
    :param str code: The facility code to search for facilities.
    :param Sequence[str] features_requireds: Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
    """
    __args__ = dict()
    __args__['capacities'] = capacities
    __args__['code'] = code
    __args__['featuresRequireds'] = features_requireds
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:metal/getFacility:getFacility', __args__, opts=opts, typ=GetFacilityResult)
    return __ret__.apply(lambda __response__: GetFacilityResult(
        capacities=pulumi.get(__response__, 'capacities'),
        code=pulumi.get(__response__, 'code'),
        features=pulumi.get(__response__, 'features'),
        features_requireds=pulumi.get(__response__, 'features_requireds'),
        id=pulumi.get(__response__, 'id'),
        metro=pulumi.get(__response__, 'metro'),
        name=pulumi.get(__response__, 'name')))
