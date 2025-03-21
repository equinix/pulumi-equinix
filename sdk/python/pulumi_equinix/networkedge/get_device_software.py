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

__all__ = [
    'GetDeviceSoftwareResult',
    'AwaitableGetDeviceSoftwareResult',
    'get_device_software',
    'get_device_software_output',
]

@pulumi.output_type
class GetDeviceSoftwareResult:
    """
    A collection of values returned by getDeviceSoftware.
    """
    def __init__(__self__, date=None, device_type=None, id=None, image_name=None, most_recent=None, packages=None, release_notes_link=None, stable=None, status=None, version=None, version_regex=None):
        if date and not isinstance(date, str):
            raise TypeError("Expected argument 'date' to be a str")
        pulumi.set(__self__, "date", date)
        if device_type and not isinstance(device_type, str):
            raise TypeError("Expected argument 'device_type' to be a str")
        pulumi.set(__self__, "device_type", device_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_name and not isinstance(image_name, str):
            raise TypeError("Expected argument 'image_name' to be a str")
        pulumi.set(__self__, "image_name", image_name)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if packages and not isinstance(packages, list):
            raise TypeError("Expected argument 'packages' to be a list")
        pulumi.set(__self__, "packages", packages)
        if release_notes_link and not isinstance(release_notes_link, str):
            raise TypeError("Expected argument 'release_notes_link' to be a str")
        pulumi.set(__self__, "release_notes_link", release_notes_link)
        if stable and not isinstance(stable, bool):
            raise TypeError("Expected argument 'stable' to be a bool")
        pulumi.set(__self__, "stable", stable)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if version_regex and not isinstance(version_regex, str):
            raise TypeError("Expected argument 'version_regex' to be a str")
        pulumi.set(__self__, "version_regex", version_regex)

    @property
    @pulumi.getter
    def date(self) -> str:
        """
        Version release date.
        """
        return pulumi.get(self, "date")

    @property
    @pulumi.getter(name="deviceType")
    def device_type(self) -> str:
        return pulumi.get(self, "device_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> str:
        """
        Software image name.
        """
        return pulumi.get(self, "image_name")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter
    def packages(self) -> Sequence[str]:
        return pulumi.get(self, "packages")

    @property
    @pulumi.getter(name="releaseNotesLink")
    def release_notes_link(self) -> str:
        """
        Link to version release notes.
        """
        return pulumi.get(self, "release_notes_link")

    @property
    @pulumi.getter
    def stable(self) -> bool:
        return pulumi.get(self, "stable")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Version status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        Version number.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="versionRegex")
    def version_regex(self) -> Optional[str]:
        return pulumi.get(self, "version_regex")


class AwaitableGetDeviceSoftwareResult(GetDeviceSoftwareResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceSoftwareResult(
            date=self.date,
            device_type=self.device_type,
            id=self.id,
            image_name=self.image_name,
            most_recent=self.most_recent,
            packages=self.packages,
            release_notes_link=self.release_notes_link,
            stable=self.stable,
            status=self.status,
            version=self.version,
            version_regex=self.version_regex)


def get_device_software(device_type: Optional[str] = None,
                        most_recent: Optional[bool] = None,
                        packages: Optional[Sequence[str]] = None,
                        stable: Optional[bool] = None,
                        version_regex: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceSoftwareResult:
    """
    Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    csr_latest1609 = equinix.networkedge.get_device_software(device_type="CSR1000V",
        most_recent=True,
        packages=["IPBASE"],
        version_regex="^16.09.+")
    ```


    :param str device_type: Code of a device type.
    :param bool most_recent: Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
    :param Sequence[str] packages: Limits returned versions to those that are supported by given software package codes.
    :param bool stable: Boolean value to limit query results to stable versions only.
    :param str version_regex: A regex string to apply on returned versions and filter search results.
    """
    __args__ = dict()
    __args__['deviceType'] = device_type
    __args__['mostRecent'] = most_recent
    __args__['packages'] = packages
    __args__['stable'] = stable
    __args__['versionRegex'] = version_regex
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:networkedge/getDeviceSoftware:getDeviceSoftware', __args__, opts=opts, typ=GetDeviceSoftwareResult).value

    return AwaitableGetDeviceSoftwareResult(
        date=pulumi.get(__ret__, 'date'),
        device_type=pulumi.get(__ret__, 'device_type'),
        id=pulumi.get(__ret__, 'id'),
        image_name=pulumi.get(__ret__, 'image_name'),
        most_recent=pulumi.get(__ret__, 'most_recent'),
        packages=pulumi.get(__ret__, 'packages'),
        release_notes_link=pulumi.get(__ret__, 'release_notes_link'),
        stable=pulumi.get(__ret__, 'stable'),
        status=pulumi.get(__ret__, 'status'),
        version=pulumi.get(__ret__, 'version'),
        version_regex=pulumi.get(__ret__, 'version_regex'))
def get_device_software_output(device_type: Optional[pulumi.Input[str]] = None,
                               most_recent: Optional[pulumi.Input[Optional[bool]]] = None,
                               packages: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               stable: Optional[pulumi.Input[Optional[bool]]] = None,
                               version_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDeviceSoftwareResult]:
    """
    Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    csr_latest1609 = equinix.networkedge.get_device_software(device_type="CSR1000V",
        most_recent=True,
        packages=["IPBASE"],
        version_regex="^16.09.+")
    ```


    :param str device_type: Code of a device type.
    :param bool most_recent: Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
    :param Sequence[str] packages: Limits returned versions to those that are supported by given software package codes.
    :param bool stable: Boolean value to limit query results to stable versions only.
    :param str version_regex: A regex string to apply on returned versions and filter search results.
    """
    __args__ = dict()
    __args__['deviceType'] = device_type
    __args__['mostRecent'] = most_recent
    __args__['packages'] = packages
    __args__['stable'] = stable
    __args__['versionRegex'] = version_regex
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:networkedge/getDeviceSoftware:getDeviceSoftware', __args__, opts=opts, typ=GetDeviceSoftwareResult)
    return __ret__.apply(lambda __response__: GetDeviceSoftwareResult(
        date=pulumi.get(__response__, 'date'),
        device_type=pulumi.get(__response__, 'device_type'),
        id=pulumi.get(__response__, 'id'),
        image_name=pulumi.get(__response__, 'image_name'),
        most_recent=pulumi.get(__response__, 'most_recent'),
        packages=pulumi.get(__response__, 'packages'),
        release_notes_link=pulumi.get(__response__, 'release_notes_link'),
        stable=pulumi.get(__response__, 'stable'),
        status=pulumi.get(__response__, 'status'),
        version=pulumi.get(__response__, 'version'),
        version_regex=pulumi.get(__response__, 'version_regex')))
