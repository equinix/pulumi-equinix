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
    'GetVrfResult',
    'AwaitableGetVrfResult',
    'get_vrf',
    'get_vrf_output',
]

@pulumi.output_type
class GetVrfResult:
    """
    A collection of values returned by getVrf.
    """
    def __init__(__self__, description=None, id=None, ip_ranges=None, local_asn=None, metro=None, name=None, project_id=None, vrf_id=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_ranges and not isinstance(ip_ranges, list):
            raise TypeError("Expected argument 'ip_ranges' to be a list")
        pulumi.set(__self__, "ip_ranges", ip_ranges)
        if local_asn and not isinstance(local_asn, int):
            raise TypeError("Expected argument 'local_asn' to be a int")
        pulumi.set(__self__, "local_asn", local_asn)
        if metro and not isinstance(metro, str):
            raise TypeError("Expected argument 'metro' to be a str")
        pulumi.set(__self__, "metro", metro)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if vrf_id and not isinstance(vrf_id, str):
            raise TypeError("Expected argument 'vrf_id' to be a str")
        pulumi.set(__self__, "vrf_id", vrf_id)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the VRF.
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
    @pulumi.getter(name="ipRanges")
    def ip_ranges(self) -> Sequence[str]:
        """
        All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        """
        return pulumi.get(self, "ip_ranges")

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> int:
        """
        The 4-byte ASN set on the VRF.
        """
        return pulumi.get(self, "local_asn")

    @property
    @pulumi.getter
    def metro(self) -> str:
        """
        Metro ID or Code where the VRF will be deployed.
        """
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        User-supplied name of the VRF, unique to the project
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Project ID where the VRF will be deployed.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="vrfId")
    def vrf_id(self) -> str:
        return pulumi.get(self, "vrf_id")


class AwaitableGetVrfResult(GetVrfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVrfResult(
            description=self.description,
            id=self.id,
            ip_ranges=self.ip_ranges,
            local_asn=self.local_asn,
            metro=self.metro,
            name=self.name,
            project_id=self.project_id,
            vrf_id=self.vrf_id)


def get_vrf(vrf_id: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVrfResult:
    """
    Use this data source to retrieve a VRF resource.

    See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example_vrf = equinix.metal.get_vrf(vrf_id="48630899-9ff2-4ce6-a93f-50ff4ebcdf6e")
    ```


    :param str vrf_id: ID of the VRF resource
    """
    __args__ = dict()
    __args__['vrfId'] = vrf_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getVrf:getVrf', __args__, opts=opts, typ=GetVrfResult).value

    return AwaitableGetVrfResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        ip_ranges=pulumi.get(__ret__, 'ip_ranges'),
        local_asn=pulumi.get(__ret__, 'local_asn'),
        metro=pulumi.get(__ret__, 'metro'),
        name=pulumi.get(__ret__, 'name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        vrf_id=pulumi.get(__ret__, 'vrf_id'))


@_utilities.lift_output_func(get_vrf)
def get_vrf_output(vrf_id: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVrfResult]:
    """
    Use this data source to retrieve a VRF resource.

    See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example_vrf = equinix.metal.get_vrf(vrf_id="48630899-9ff2-4ce6-a93f-50ff4ebcdf6e")
    ```


    :param str vrf_id: ID of the VRF resource
    """
    ...
