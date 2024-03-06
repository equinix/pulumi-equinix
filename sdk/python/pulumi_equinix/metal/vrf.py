# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VrfArgs', 'Vrf']

@pulumi.input_type
class VrfArgs:
    def __init__(__self__, *,
                 metro: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 ip_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Vrf resource.
        :param pulumi.Input[str] metro: Metro ID or Code where the VRF will be deployed.
        :param pulumi.Input[str] project_id: Project ID where the VRF will be deployed.
        :param pulumi.Input[str] description: Description of the VRF.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_ranges: All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        :param pulumi.Input[int] local_asn: The 4-byte ASN set on the VRF.
        :param pulumi.Input[str] name: User-supplied name of the VRF, unique to the project
        """
        pulumi.set(__self__, "metro", metro)
        pulumi.set(__self__, "project_id", project_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ip_ranges is not None:
            pulumi.set(__self__, "ip_ranges", ip_ranges)
        if local_asn is not None:
            pulumi.set(__self__, "local_asn", local_asn)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def metro(self) -> pulumi.Input[str]:
        """
        Metro ID or Code where the VRF will be deployed.
        """
        return pulumi.get(self, "metro")

    @metro.setter
    def metro(self, value: pulumi.Input[str]):
        pulumi.set(self, "metro", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Project ID where the VRF will be deployed.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the VRF.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipRanges")
    def ip_ranges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        """
        return pulumi.get(self, "ip_ranges")

    @ip_ranges.setter
    def ip_ranges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ip_ranges", value)

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> Optional[pulumi.Input[int]]:
        """
        The 4-byte ASN set on the VRF.
        """
        return pulumi.get(self, "local_asn")

    @local_asn.setter
    def local_asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "local_asn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        User-supplied name of the VRF, unique to the project
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VrfState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 ip_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Vrf resources.
        :param pulumi.Input[str] description: Description of the VRF.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_ranges: All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        :param pulumi.Input[int] local_asn: The 4-byte ASN set on the VRF.
        :param pulumi.Input[str] metro: Metro ID or Code where the VRF will be deployed.
        :param pulumi.Input[str] name: User-supplied name of the VRF, unique to the project
        :param pulumi.Input[str] project_id: Project ID where the VRF will be deployed.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ip_ranges is not None:
            pulumi.set(__self__, "ip_ranges", ip_ranges)
        if local_asn is not None:
            pulumi.set(__self__, "local_asn", local_asn)
        if metro is not None:
            pulumi.set(__self__, "metro", metro)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the VRF.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipRanges")
    def ip_ranges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        """
        return pulumi.get(self, "ip_ranges")

    @ip_ranges.setter
    def ip_ranges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ip_ranges", value)

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> Optional[pulumi.Input[int]]:
        """
        The 4-byte ASN set on the VRF.
        """
        return pulumi.get(self, "local_asn")

    @local_asn.setter
    def local_asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "local_asn", value)

    @property
    @pulumi.getter
    def metro(self) -> Optional[pulumi.Input[str]]:
        """
        Metro ID or Code where the VRF will be deployed.
        """
        return pulumi.get(self, "metro")

    @metro.setter
    def metro(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metro", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        User-supplied name of the VRF, unique to the project
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project ID where the VRF will be deployed.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class Vrf(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ip_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to manage a VRF.

        > VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        metro = config.get("metro")
        if metro is None:
            metro = "DA"
        vrf = equinix.metal.Vrf("vrf",
            description="VRF with ASN 65000 and a pool of address space",
            name="example-vrf",
            metro=metro,
            local_asn=65000,
            ip_ranges=[
                "192.168.100.0/25",
                "192.168.200.0/25",
            ],
            project_id=project_id)
        pulumi.export("vrfId", vrf.id)
        ```

        ## Import

        This resource can be imported using an existing VRF ID:<break><break> ```sh<break> $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id} <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the VRF.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_ranges: All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        :param pulumi.Input[int] local_asn: The 4-byte ASN set on the VRF.
        :param pulumi.Input[str] metro: Metro ID or Code where the VRF will be deployed.
        :param pulumi.Input[str] name: User-supplied name of the VRF, unique to the project
        :param pulumi.Input[str] project_id: Project ID where the VRF will be deployed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VrfArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to manage a VRF.

        > VRF features are not generally available. The interfaces related to VRF resources may change ahead of general availability.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        metro = config.get("metro")
        if metro is None:
            metro = "DA"
        vrf = equinix.metal.Vrf("vrf",
            description="VRF with ASN 65000 and a pool of address space",
            name="example-vrf",
            metro=metro,
            local_asn=65000,
            ip_ranges=[
                "192.168.100.0/25",
                "192.168.200.0/25",
            ],
            project_id=project_id)
        pulumi.export("vrfId", vrf.id)
        ```

        ## Import

        This resource can be imported using an existing VRF ID:<break><break> ```sh<break> $ pulumi import equinix:metal/vrf:Vrf equinix_metal_vrf {existing_id} <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param VrfArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VrfArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ip_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VrfArgs.__new__(VrfArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["ip_ranges"] = ip_ranges
            __props__.__dict__["local_asn"] = local_asn
            if metro is None and not opts.urn:
                raise TypeError("Missing required property 'metro'")
            __props__.__dict__["metro"] = metro
            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        super(Vrf, __self__).__init__(
            'equinix:metal/vrf:Vrf',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            ip_ranges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            local_asn: Optional[pulumi.Input[int]] = None,
            metro: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'Vrf':
        """
        Get an existing Vrf resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the VRF.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_ranges: All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        :param pulumi.Input[int] local_asn: The 4-byte ASN set on the VRF.
        :param pulumi.Input[str] metro: Metro ID or Code where the VRF will be deployed.
        :param pulumi.Input[str] name: User-supplied name of the VRF, unique to the project
        :param pulumi.Input[str] project_id: Project ID where the VRF will be deployed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VrfState.__new__(_VrfState)

        __props__.__dict__["description"] = description
        __props__.__dict__["ip_ranges"] = ip_ranges
        __props__.__dict__["local_asn"] = local_asn
        __props__.__dict__["metro"] = metro
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        return Vrf(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the VRF.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="ipRanges")
    def ip_ranges(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
        """
        return pulumi.get(self, "ip_ranges")

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> pulumi.Output[int]:
        """
        The 4-byte ASN set on the VRF.
        """
        return pulumi.get(self, "local_asn")

    @property
    @pulumi.getter
    def metro(self) -> pulumi.Output[str]:
        """
        Metro ID or Code where the VRF will be deployed.
        """
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        User-supplied name of the VRF, unique to the project
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Project ID where the VRF will be deployed.
        """
        return pulumi.get(self, "project_id")

