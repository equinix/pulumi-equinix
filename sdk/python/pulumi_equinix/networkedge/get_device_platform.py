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
    'GetDevicePlatformResult',
    'AwaitableGetDevicePlatformResult',
    'get_device_platform',
    'get_device_platform_output',
]

@pulumi.output_type
class GetDevicePlatformResult:
    """
    A collection of values returned by getDevicePlatform.
    """
    def __init__(__self__, core_count=None, device_type=None, flavor=None, id=None, license_options=None, management_types=None, memory=None, memory_unit=None, packages=None):
        if core_count and not isinstance(core_count, int):
            raise TypeError("Expected argument 'core_count' to be a int")
        pulumi.set(__self__, "core_count", core_count)
        if device_type and not isinstance(device_type, str):
            raise TypeError("Expected argument 'device_type' to be a str")
        pulumi.set(__self__, "device_type", device_type)
        if flavor and not isinstance(flavor, str):
            raise TypeError("Expected argument 'flavor' to be a str")
        pulumi.set(__self__, "flavor", flavor)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if license_options and not isinstance(license_options, list):
            raise TypeError("Expected argument 'license_options' to be a list")
        pulumi.set(__self__, "license_options", license_options)
        if management_types and not isinstance(management_types, list):
            raise TypeError("Expected argument 'management_types' to be a list")
        pulumi.set(__self__, "management_types", management_types)
        if memory and not isinstance(memory, int):
            raise TypeError("Expected argument 'memory' to be a int")
        pulumi.set(__self__, "memory", memory)
        if memory_unit and not isinstance(memory_unit, str):
            raise TypeError("Expected argument 'memory_unit' to be a str")
        pulumi.set(__self__, "memory_unit", memory_unit)
        if packages and not isinstance(packages, list):
            raise TypeError("Expected argument 'packages' to be a list")
        pulumi.set(__self__, "packages", packages)

    @property
    @pulumi.getter(name="coreCount")
    def core_count(self) -> int:
        return pulumi.get(self, "core_count")

    @property
    @pulumi.getter(name="deviceType")
    def device_type(self) -> str:
        return pulumi.get(self, "device_type")

    @property
    @pulumi.getter
    def flavor(self) -> str:
        return pulumi.get(self, "flavor")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="licenseOptions")
    def license_options(self) -> Sequence[str]:
        return pulumi.get(self, "license_options")

    @property
    @pulumi.getter(name="managementTypes")
    def management_types(self) -> Sequence[str]:
        return pulumi.get(self, "management_types")

    @property
    @pulumi.getter
    def memory(self) -> int:
        """
        The amount of memory provided by device platform.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter(name="memoryUnit")
    def memory_unit(self) -> str:
        """
        Unit of memory provider by device platform.
        """
        return pulumi.get(self, "memory_unit")

    @property
    @pulumi.getter
    def packages(self) -> Sequence[str]:
        return pulumi.get(self, "packages")


class AwaitableGetDevicePlatformResult(GetDevicePlatformResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDevicePlatformResult(
            core_count=self.core_count,
            device_type=self.device_type,
            flavor=self.flavor,
            id=self.id,
            license_options=self.license_options,
            management_types=self.management_types,
            memory=self.memory,
            memory_unit=self.memory_unit,
            packages=self.packages)


def get_device_platform(core_count: Optional[int] = None,
                        device_type: Optional[str] = None,
                        flavor: Optional[str] = None,
                        license_options: Optional[Sequence[str]] = None,
                        management_types: Optional[Sequence[str]] = None,
                        packages: Optional[Sequence[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDevicePlatformResult:
    """
    Use this data source to get Equinix Network Edge device platform configuration details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    csr_large = equinix.networkedge.get_device_platform(device_type="CSR1000V",
        flavor="large",
        packages=["IPBASE"])
    ```


    :param int core_count: Number of CPU cores used to limit platform search results.
    :param str device_type: Device type code
    :param str flavor: Device platform flavor that determines number of CPU cores and memory. Supported values are: `small`, `medium`, `large`, `xlarge`.
    :param Sequence[str] license_options: List of device licensing options to limit platform search result. Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
    :param Sequence[str] management_types: List of device management types to limit platform search results. Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
    :param Sequence[str] packages: List of software package codes to limit platform search results.
    """
    __args__ = dict()
    __args__['coreCount'] = core_count
    __args__['deviceType'] = device_type
    __args__['flavor'] = flavor
    __args__['licenseOptions'] = license_options
    __args__['managementTypes'] = management_types
    __args__['packages'] = packages
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:networkedge/getDevicePlatform:getDevicePlatform', __args__, opts=opts, typ=GetDevicePlatformResult).value

    return AwaitableGetDevicePlatformResult(
        core_count=pulumi.get(__ret__, 'core_count'),
        device_type=pulumi.get(__ret__, 'device_type'),
        flavor=pulumi.get(__ret__, 'flavor'),
        id=pulumi.get(__ret__, 'id'),
        license_options=pulumi.get(__ret__, 'license_options'),
        management_types=pulumi.get(__ret__, 'management_types'),
        memory=pulumi.get(__ret__, 'memory'),
        memory_unit=pulumi.get(__ret__, 'memory_unit'),
        packages=pulumi.get(__ret__, 'packages'))


@_utilities.lift_output_func(get_device_platform)
def get_device_platform_output(core_count: Optional[pulumi.Input[Optional[int]]] = None,
                               device_type: Optional[pulumi.Input[str]] = None,
                               flavor: Optional[pulumi.Input[Optional[str]]] = None,
                               license_options: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               management_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               packages: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDevicePlatformResult]:
    """
    Use this data source to get Equinix Network Edge device platform configuration details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    csr_large = equinix.networkedge.get_device_platform(device_type="CSR1000V",
        flavor="large",
        packages=["IPBASE"])
    ```


    :param int core_count: Number of CPU cores used to limit platform search results.
    :param str device_type: Device type code
    :param str flavor: Device platform flavor that determines number of CPU cores and memory. Supported values are: `small`, `medium`, `large`, `xlarge`.
    :param Sequence[str] license_options: List of device licensing options to limit platform search result. Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
    :param Sequence[str] management_types: List of device management types to limit platform search results. Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
    :param Sequence[str] packages: List of software package codes to limit platform search results.
    """
    ...
