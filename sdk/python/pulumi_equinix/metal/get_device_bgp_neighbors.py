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
    'GetDeviceBgpNeighborsResult',
    'AwaitableGetDeviceBgpNeighborsResult',
    'get_device_bgp_neighbors',
    'get_device_bgp_neighbors_output',
]

@pulumi.output_type
class GetDeviceBgpNeighborsResult:
    """
    A collection of values returned by getDeviceBgpNeighbors.
    """
    def __init__(__self__, bgp_neighbors=None, device_id=None, id=None):
        if bgp_neighbors and not isinstance(bgp_neighbors, list):
            raise TypeError("Expected argument 'bgp_neighbors' to be a list")
        pulumi.set(__self__, "bgp_neighbors", bgp_neighbors)
        if device_id and not isinstance(device_id, str):
            raise TypeError("Expected argument 'device_id' to be a str")
        pulumi.set(__self__, "device_id", device_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="bgpNeighbors")
    def bgp_neighbors(self) -> Sequence['outputs.GetDeviceBgpNeighborsBgpNeighborResult']:
        """
        array of BGP neighbor records with attributes:
        """
        return pulumi.get(self, "bgp_neighbors")

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> str:
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetDeviceBgpNeighborsResult(GetDeviceBgpNeighborsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceBgpNeighborsResult(
            bgp_neighbors=self.bgp_neighbors,
            device_id=self.device_id,
            id=self.id)


def get_device_bgp_neighbors(device_id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceBgpNeighborsResult:
    """
    Use this datasource to retrieve list of BGP neighbors of a device in the Equinix Metal host.

    To have any BGP neighbors listed, the device must be in BGP-enabled project and have a BGP session assigned.

    To learn more about using BGP in Equinix Metal, see the metal.BgpSession resource documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    test = equinix.metal.get_device_bgp_neighbors(device_id="4c641195-25e5-4c3c-b2b7-4cd7a42c7b40")
    pulumi.export("bgpNeighborsListing", test.bgp_neighbors)
    ```


    :param str device_id: UUID of BGP-enabled device whose neighbors to list.
    """
    __args__ = dict()
    __args__['deviceId'] = device_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getDeviceBgpNeighbors:getDeviceBgpNeighbors', __args__, opts=opts, typ=GetDeviceBgpNeighborsResult).value

    return AwaitableGetDeviceBgpNeighborsResult(
        bgp_neighbors=pulumi.get(__ret__, 'bgp_neighbors'),
        device_id=pulumi.get(__ret__, 'device_id'),
        id=pulumi.get(__ret__, 'id'))
def get_device_bgp_neighbors_output(device_id: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDeviceBgpNeighborsResult]:
    """
    Use this datasource to retrieve list of BGP neighbors of a device in the Equinix Metal host.

    To have any BGP neighbors listed, the device must be in BGP-enabled project and have a BGP session assigned.

    To learn more about using BGP in Equinix Metal, see the metal.BgpSession resource documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    test = equinix.metal.get_device_bgp_neighbors(device_id="4c641195-25e5-4c3c-b2b7-4cd7a42c7b40")
    pulumi.export("bgpNeighborsListing", test.bgp_neighbors)
    ```


    :param str device_id: UUID of BGP-enabled device whose neighbors to list.
    """
    __args__ = dict()
    __args__['deviceId'] = device_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:metal/getDeviceBgpNeighbors:getDeviceBgpNeighbors', __args__, opts=opts, typ=GetDeviceBgpNeighborsResult)
    return __ret__.apply(lambda __response__: GetDeviceBgpNeighborsResult(
        bgp_neighbors=pulumi.get(__response__, 'bgp_neighbors'),
        device_id=pulumi.get(__response__, 'device_id'),
        id=pulumi.get(__response__, 'id')))
