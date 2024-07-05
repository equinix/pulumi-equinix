# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetDeviceTypeResult',
    'AwaitableGetDeviceTypeResult',
    'get_device_type',
    'get_device_type_output',
]

@pulumi.output_type
class GetDeviceTypeResult:
    """
    A collection of values returned by getDeviceType.
    """
    def __init__(__self__, category=None, code=None, description=None, id=None, metro_codes=None, name=None, vendor=None):
        if category and not isinstance(category, str):
            raise TypeError("Expected argument 'category' to be a str")
        pulumi.set(__self__, "category", category)
        if code and not isinstance(code, str):
            raise TypeError("Expected argument 'code' to be a str")
        pulumi.set(__self__, "code", code)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metro_codes and not isinstance(metro_codes, list):
            raise TypeError("Expected argument 'metro_codes' to be a list")
        pulumi.set(__self__, "metro_codes", metro_codes)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if vendor and not isinstance(vendor, str):
            raise TypeError("Expected argument 'vendor' to be a str")
        pulumi.set(__self__, "vendor", vendor)

    @property
    @pulumi.getter
    def category(self) -> str:
        return pulumi.get(self, "category")

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        Device type short code, unique identifier of a network device type
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Device type textual description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="metroCodes")
    def metro_codes(self) -> Sequence[str]:
        return pulumi.get(self, "metro_codes")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def vendor(self) -> str:
        return pulumi.get(self, "vendor")


class AwaitableGetDeviceTypeResult(GetDeviceTypeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceTypeResult(
            category=self.category,
            code=self.code,
            description=self.description,
            id=self.id,
            metro_codes=self.metro_codes,
            name=self.name,
            vendor=self.vendor)


def get_device_type(category: Optional[str] = None,
                    metro_codes: Optional[Sequence[str]] = None,
                    name: Optional[str] = None,
                    vendor: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceTypeResult:
    """
    Use this data source to get Equinix Network Edge device type details. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    cisco_router = equinix.networkedge.get_device_type(category="Router",
        metro_codes=[
            "DC",
            "SV",
        ],
        vendor="Cisco")
    ```


    :param str category: Device type category. One of: `Router`, `Firewall`, `SDWAN`.
    :param Sequence[str] metro_codes: List of metro codes where device type has to be available
    :param str name: Device type name.
    :param str vendor: Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['metroCodes'] = metro_codes
    __args__['name'] = name
    __args__['vendor'] = vendor
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:networkedge/getDeviceType:getDeviceType', __args__, opts=opts, typ=GetDeviceTypeResult).value

    return AwaitableGetDeviceTypeResult(
        category=pulumi.get(__ret__, 'category'),
        code=pulumi.get(__ret__, 'code'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        metro_codes=pulumi.get(__ret__, 'metro_codes'),
        name=pulumi.get(__ret__, 'name'),
        vendor=pulumi.get(__ret__, 'vendor'))


@_utilities.lift_output_func(get_device_type)
def get_device_type_output(category: Optional[pulumi.Input[Optional[str]]] = None,
                           metro_codes: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           vendor: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeviceTypeResult]:
    """
    Use this data source to get Equinix Network Edge device type details. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    cisco_router = equinix.networkedge.get_device_type(category="Router",
        metro_codes=[
            "DC",
            "SV",
        ],
        vendor="Cisco")
    ```


    :param str category: Device type category. One of: `Router`, `Firewall`, `SDWAN`.
    :param Sequence[str] metro_codes: List of metro codes where device type has to be available
    :param str name: Device type name.
    :param str vendor: Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
    """
    ...
