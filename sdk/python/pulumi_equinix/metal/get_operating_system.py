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
    'GetOperatingSystemResult',
    'AwaitableGetOperatingSystemResult',
    'get_operating_system',
    'get_operating_system_output',
]

@pulumi.output_type
class GetOperatingSystemResult:
    """
    A collection of values returned by getOperatingSystem.
    """
    def __init__(__self__, distro=None, id=None, name=None, provisionable_on=None, slug=None, version=None):
        if distro and not isinstance(distro, str):
            raise TypeError("Expected argument 'distro' to be a str")
        pulumi.set(__self__, "distro", distro)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if provisionable_on and not isinstance(provisionable_on, str):
            raise TypeError("Expected argument 'provisionable_on' to be a str")
        pulumi.set(__self__, "provisionable_on", provisionable_on)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def distro(self) -> Optional[str]:
        return pulumi.get(self, "distro")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="provisionableOn")
    def provisionable_on(self) -> Optional[str]:
        return pulumi.get(self, "provisionable_on")

    @property
    @pulumi.getter
    def slug(self) -> str:
        """
        Operating system slug (same as `id`).
        """
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        return pulumi.get(self, "version")


class AwaitableGetOperatingSystemResult(GetOperatingSystemResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOperatingSystemResult(
            distro=self.distro,
            id=self.id,
            name=self.name,
            provisionable_on=self.provisionable_on,
            slug=self.slug,
            version=self.version)


def get_operating_system(distro: Optional[str] = None,
                         name: Optional[str] = None,
                         provisionable_on: Optional[str] = None,
                         version: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOperatingSystemResult:
    """
    Use this data source to get Equinix Metal Operating System image.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_operating_system(distro="ubuntu",
        version="20.04",
        provisionable_on="c3.medium.x86")
    server = equinix.metal.Device("server",
        hostname="tf.ubuntu",
        plan=equinix.metal.Plan.C3_MEDIUM_X86,
        metro="ny",
        operating_system=example.id.apply(lambda x: equinix.metal.OperatingSystem(x)),
        billing_cycle=equinix.metal.BillingCycle.HOURLY,
        project_id=local["project_id"])
    ```


    :param str distro: Name of the OS distribution.
    :param str name: Name or part of the name of the distribution. Case insensitive.
    :param str provisionable_on: Plan name.
    :param str version: Version of the distribution.
    """
    __args__ = dict()
    __args__['distro'] = distro
    __args__['name'] = name
    __args__['provisionableOn'] = provisionable_on
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getOperatingSystem:getOperatingSystem', __args__, opts=opts, typ=GetOperatingSystemResult).value

    return AwaitableGetOperatingSystemResult(
        distro=pulumi.get(__ret__, 'distro'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        provisionable_on=pulumi.get(__ret__, 'provisionable_on'),
        slug=pulumi.get(__ret__, 'slug'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_operating_system)
def get_operating_system_output(distro: Optional[pulumi.Input[Optional[str]]] = None,
                                name: Optional[pulumi.Input[Optional[str]]] = None,
                                provisionable_on: Optional[pulumi.Input[Optional[str]]] = None,
                                version: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOperatingSystemResult]:
    """
    Use this data source to get Equinix Metal Operating System image.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_operating_system(distro="ubuntu",
        version="20.04",
        provisionable_on="c3.medium.x86")
    server = equinix.metal.Device("server",
        hostname="tf.ubuntu",
        plan=equinix.metal.Plan.C3_MEDIUM_X86,
        metro="ny",
        operating_system=example.id.apply(lambda x: equinix.metal.OperatingSystem(x)),
        billing_cycle=equinix.metal.BillingCycle.HOURLY,
        project_id=local["project_id"])
    ```


    :param str distro: Name of the OS distribution.
    :param str name: Name or part of the name of the distribution. Case insensitive.
    :param str provisionable_on: Plan name.
    :param str version: Version of the distribution.
    """
    ...