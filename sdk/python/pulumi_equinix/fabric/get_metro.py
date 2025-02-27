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
    def __init__(__self__, code=None, connected_metros=None, equinix_asn=None, geo_coordinates=None, geo_scopes=None, href=None, id=None, local_vc_bandwidth_max=None, metro_code=None, name=None, region=None, type=None):
        if code and not isinstance(code, str):
            raise TypeError("Expected argument 'code' to be a str")
        pulumi.set(__self__, "code", code)
        if connected_metros and not isinstance(connected_metros, list):
            raise TypeError("Expected argument 'connected_metros' to be a list")
        pulumi.set(__self__, "connected_metros", connected_metros)
        if equinix_asn and not isinstance(equinix_asn, int):
            raise TypeError("Expected argument 'equinix_asn' to be a int")
        pulumi.set(__self__, "equinix_asn", equinix_asn)
        if geo_coordinates and not isinstance(geo_coordinates, dict):
            raise TypeError("Expected argument 'geo_coordinates' to be a dict")
        pulumi.set(__self__, "geo_coordinates", geo_coordinates)
        if geo_scopes and not isinstance(geo_scopes, list):
            raise TypeError("Expected argument 'geo_scopes' to be a list")
        pulumi.set(__self__, "geo_scopes", geo_scopes)
        if href and not isinstance(href, str):
            raise TypeError("Expected argument 'href' to be a str")
        pulumi.set(__self__, "href", href)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if local_vc_bandwidth_max and not isinstance(local_vc_bandwidth_max, int):
            raise TypeError("Expected argument 'local_vc_bandwidth_max' to be a int")
        pulumi.set(__self__, "local_vc_bandwidth_max", local_vc_bandwidth_max)
        if metro_code and not isinstance(metro_code, str):
            raise TypeError("Expected argument 'metro_code' to be a str")
        pulumi.set(__self__, "metro_code", metro_code)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        Code assigned to an Equinix IBX data center in a specified metropolitan area
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter(name="connectedMetros")
    def connected_metros(self) -> Sequence['outputs.GetMetroConnectedMetroResult']:
        """
        Arrays of objects containing latency data for the specified metro
        """
        return pulumi.get(self, "connected_metros")

    @property
    @pulumi.getter(name="equinixAsn")
    def equinix_asn(self) -> int:
        """
        Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
        """
        return pulumi.get(self, "equinix_asn")

    @property
    @pulumi.getter(name="geoCoordinates")
    def geo_coordinates(self) -> 'outputs.GetMetroGeoCoordinatesResult':
        """
        Geographic location data of Fabric Metro
        """
        return pulumi.get(self, "geo_coordinates")

    @property
    @pulumi.getter(name="geoScopes")
    def geo_scopes(self) -> Sequence[str]:
        """
        List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
        """
        return pulumi.get(self, "geo_scopes")

    @property
    @pulumi.getter
    def href(self) -> str:
        """
        The canonical URL at which the resource resides
        """
        return pulumi.get(self, "href")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique identifier of the resource
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="localVcBandwidthMax")
    def local_vc_bandwidth_max(self) -> int:
        """
        This field holds Max Connection speed within the metro.
        """
        return pulumi.get(self, "local_vc_bandwidth_max")

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> str:
        """
        The metro code this data source should retrieve
        """
        return pulumi.get(self, "metro_code")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the region in which the data center is located
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Board geographical area in which the data center is located
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Indicator of a fabric metro
        """
        return pulumi.get(self, "type")


class AwaitableGetMetroResult(GetMetroResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMetroResult(
            code=self.code,
            connected_metros=self.connected_metros,
            equinix_asn=self.equinix_asn,
            geo_coordinates=self.geo_coordinates,
            geo_scopes=self.geo_scopes,
            href=self.href,
            id=self.id,
            local_vc_bandwidth_max=self.local_vc_bandwidth_max,
            metro_code=self.metro_code,
            name=self.name,
            region=self.region,
            type=self.type)


def get_metro(metro_code: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMetroResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    metro = equinix.fabric.get_metro(metro_code="<metro_code>")
    pulumi.export("id", metro.id)
    pulumi.export("type", metro.type)
    pulumi.export("metroCode", metro.metro_code)
    pulumi.export("region", metro.region)
    pulumi.export("name", metro.name)
    pulumi.export("equinixAsn", metro.equinix_asn)
    pulumi.export("localVcBandwidthMax", metro.local_vc_bandwidth_max)
    pulumi.export("geoCoordinates", metro.geo_coordinates)
    pulumi.export("connectedMetros", metro.connected_metros)
    pulumi.export("geoScopes", metro.geo_scopes)
    ```


    :param str metro_code: The metro code this data source should retrieve
    """
    __args__ = dict()
    __args__['metroCode'] = metro_code
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getMetro:getMetro', __args__, opts=opts, typ=GetMetroResult).value

    return AwaitableGetMetroResult(
        code=pulumi.get(__ret__, 'code'),
        connected_metros=pulumi.get(__ret__, 'connected_metros'),
        equinix_asn=pulumi.get(__ret__, 'equinix_asn'),
        geo_coordinates=pulumi.get(__ret__, 'geo_coordinates'),
        geo_scopes=pulumi.get(__ret__, 'geo_scopes'),
        href=pulumi.get(__ret__, 'href'),
        id=pulumi.get(__ret__, 'id'),
        local_vc_bandwidth_max=pulumi.get(__ret__, 'local_vc_bandwidth_max'),
        metro_code=pulumi.get(__ret__, 'metro_code'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        type=pulumi.get(__ret__, 'type'))
def get_metro_output(metro_code: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMetroResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    metro = equinix.fabric.get_metro(metro_code="<metro_code>")
    pulumi.export("id", metro.id)
    pulumi.export("type", metro.type)
    pulumi.export("metroCode", metro.metro_code)
    pulumi.export("region", metro.region)
    pulumi.export("name", metro.name)
    pulumi.export("equinixAsn", metro.equinix_asn)
    pulumi.export("localVcBandwidthMax", metro.local_vc_bandwidth_max)
    pulumi.export("geoCoordinates", metro.geo_coordinates)
    pulumi.export("connectedMetros", metro.connected_metros)
    pulumi.export("geoScopes", metro.geo_scopes)
    ```


    :param str metro_code: The metro code this data source should retrieve
    """
    __args__ = dict()
    __args__['metroCode'] = metro_code
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getMetro:getMetro', __args__, opts=opts, typ=GetMetroResult)
    return __ret__.apply(lambda __response__: GetMetroResult(
        code=pulumi.get(__response__, 'code'),
        connected_metros=pulumi.get(__response__, 'connected_metros'),
        equinix_asn=pulumi.get(__response__, 'equinix_asn'),
        geo_coordinates=pulumi.get(__response__, 'geo_coordinates'),
        geo_scopes=pulumi.get(__response__, 'geo_scopes'),
        href=pulumi.get(__response__, 'href'),
        id=pulumi.get(__response__, 'id'),
        local_vc_bandwidth_max=pulumi.get(__response__, 'local_vc_bandwidth_max'),
        metro_code=pulumi.get(__response__, 'metro_code'),
        name=pulumi.get(__response__, 'name'),
        region=pulumi.get(__response__, 'region'),
        type=pulumi.get(__response__, 'type')))
