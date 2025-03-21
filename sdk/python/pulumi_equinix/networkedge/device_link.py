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

__all__ = ['DeviceLinkArgs', 'DeviceLink']

@pulumi.input_type
class DeviceLinkArgs:
    def __init__(__self__, *,
                 devices: pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]],
                 links: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]] = None,
                 metro_links: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 redundancy_type: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DeviceLink resource.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]] devices: definition of one or more devices belonging to the device link. See Device section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]] links: definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]] metro_links: definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        :param pulumi.Input[str] name: device link name.
        :param pulumi.Input[str] project_id: Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        :param pulumi.Input[str] redundancy_type: Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        :param pulumi.Input[str] subnet: device link subnet in CIDR format. Not required for link between self configured devices.
        """
        pulumi.set(__self__, "devices", devices)
        if links is not None:
            warnings.warn("""Links is deprecated. Please use metro links instead.""", DeprecationWarning)
            pulumi.log.warn("""links is deprecated: Links is deprecated. Please use metro links instead.""")
        if links is not None:
            pulumi.set(__self__, "links", links)
        if metro_links is not None:
            pulumi.set(__self__, "metro_links", metro_links)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if redundancy_type is not None:
            pulumi.set(__self__, "redundancy_type", redundancy_type)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)

    @property
    @pulumi.getter
    def devices(self) -> pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]]:
        """
        definition of one or more devices belonging to the device link. See Device section below for more details.
        """
        return pulumi.get(self, "devices")

    @devices.setter
    def devices(self, value: pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]]):
        pulumi.set(self, "devices", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Links is deprecated. Please use metro links instead.""")
    def links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        """
        return pulumi.get(self, "links")

    @links.setter
    def links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]]):
        pulumi.set(self, "links", value)

    @property
    @pulumi.getter(name="metroLinks")
    def metro_links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        """
        return pulumi.get(self, "metro_links")

    @metro_links.setter
    def metro_links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]]):
        pulumi.set(self, "metro_links", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        device link name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="redundancyType")
    def redundancy_type(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        """
        return pulumi.get(self, "redundancy_type")

    @redundancy_type.setter
    def redundancy_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redundancy_type", value)

    @property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input[str]]:
        """
        device link subnet in CIDR format. Not required for link between self configured devices.
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet", value)


@pulumi.input_type
class _DeviceLinkState:
    def __init__(__self__, *,
                 devices: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]]] = None,
                 links: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]] = None,
                 metro_links: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 redundancy_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DeviceLink resources.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]] devices: definition of one or more devices belonging to the device link. See Device section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]] links: definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]] metro_links: definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        :param pulumi.Input[str] name: device link name.
        :param pulumi.Input[str] project_id: Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        :param pulumi.Input[str] redundancy_type: Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        :param pulumi.Input[str] status: device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
        :param pulumi.Input[str] subnet: device link subnet in CIDR format. Not required for link between self configured devices.
        :param pulumi.Input[str] uuid: Device link unique identifier.
        """
        if devices is not None:
            pulumi.set(__self__, "devices", devices)
        if links is not None:
            warnings.warn("""Links is deprecated. Please use metro links instead.""", DeprecationWarning)
            pulumi.log.warn("""links is deprecated: Links is deprecated. Please use metro links instead.""")
        if links is not None:
            pulumi.set(__self__, "links", links)
        if metro_links is not None:
            pulumi.set(__self__, "metro_links", metro_links)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if redundancy_type is not None:
            pulumi.set(__self__, "redundancy_type", redundancy_type)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def devices(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]]]:
        """
        definition of one or more devices belonging to the device link. See Device section below for more details.
        """
        return pulumi.get(self, "devices")

    @devices.setter
    def devices(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkDeviceArgs']]]]):
        pulumi.set(self, "devices", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Links is deprecated. Please use metro links instead.""")
    def links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        """
        return pulumi.get(self, "links")

    @links.setter
    def links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkLinkArgs']]]]):
        pulumi.set(self, "links", value)

    @property
    @pulumi.getter(name="metroLinks")
    def metro_links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        """
        return pulumi.get(self, "metro_links")

    @metro_links.setter
    def metro_links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DeviceLinkMetroLinkArgs']]]]):
        pulumi.set(self, "metro_links", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        device link name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="redundancyType")
    def redundancy_type(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        """
        return pulumi.get(self, "redundancy_type")

    @redundancy_type.setter
    def redundancy_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redundancy_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input[str]]:
        """
        device link subnet in CIDR format. Not required for link between self configured devices.
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Device link unique identifier.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class DeviceLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkDeviceArgs', 'DeviceLinkDeviceArgsDict']]]]] = None,
                 links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkLinkArgs', 'DeviceLinkLinkArgsDict']]]]] = None,
                 metro_links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkMetroLinkArgs', 'DeviceLinkMetroLinkArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 redundancy_type: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource `networkedge.DeviceLink` allows creation and management of Equinix Network Edge virtual network device links.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.networkedge.DeviceLink("test",
            name="test-link",
            subnet="192.168.40.64/27",
            project_id="a86d7112-d740-4758-9c9c-31e66373746b",
            devices=[
                {
                    "id": test_equinix_network_device["uuid"],
                    "asn": 22111,
                    "interface_id": 6,
                },
                {
                    "id": test_equinix_network_device["secondaryDevice"][0]["uuid"],
                    "asn": 22333,
                    "interface_id": 7,
                },
            ],
            links=[{
                "account_number": test_equinix_network_device["accountNumber"],
                "src_metro_code": test_equinix_network_device["metroCode"],
                "dst_metro_code": test_equinix_network_device["secondaryDevice"][0]["metroCode"],
                "throughput": "50",
                "throughput_unit": "Mbps",
            }])
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/deviceLink:DeviceLink example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkDeviceArgs', 'DeviceLinkDeviceArgsDict']]]] devices: definition of one or more devices belonging to the device link. See Device section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkLinkArgs', 'DeviceLinkLinkArgsDict']]]] links: definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkMetroLinkArgs', 'DeviceLinkMetroLinkArgsDict']]]] metro_links: definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        :param pulumi.Input[str] name: device link name.
        :param pulumi.Input[str] project_id: Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        :param pulumi.Input[str] redundancy_type: Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        :param pulumi.Input[str] subnet: device link subnet in CIDR format. Not required for link between self configured devices.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeviceLinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource `networkedge.DeviceLink` allows creation and management of Equinix Network Edge virtual network device links.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.networkedge.DeviceLink("test",
            name="test-link",
            subnet="192.168.40.64/27",
            project_id="a86d7112-d740-4758-9c9c-31e66373746b",
            devices=[
                {
                    "id": test_equinix_network_device["uuid"],
                    "asn": 22111,
                    "interface_id": 6,
                },
                {
                    "id": test_equinix_network_device["secondaryDevice"][0]["uuid"],
                    "asn": 22333,
                    "interface_id": 7,
                },
            ],
            links=[{
                "account_number": test_equinix_network_device["accountNumber"],
                "src_metro_code": test_equinix_network_device["metroCode"],
                "dst_metro_code": test_equinix_network_device["secondaryDevice"][0]["metroCode"],
                "throughput": "50",
                "throughput_unit": "Mbps",
            }])
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/deviceLink:DeviceLink example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param DeviceLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeviceLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkDeviceArgs', 'DeviceLinkDeviceArgsDict']]]]] = None,
                 links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkLinkArgs', 'DeviceLinkLinkArgsDict']]]]] = None,
                 metro_links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkMetroLinkArgs', 'DeviceLinkMetroLinkArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 redundancy_type: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeviceLinkArgs.__new__(DeviceLinkArgs)

            if devices is None and not opts.urn:
                raise TypeError("Missing required property 'devices'")
            __props__.__dict__["devices"] = devices
            __props__.__dict__["links"] = links
            __props__.__dict__["metro_links"] = metro_links
            __props__.__dict__["name"] = name
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["redundancy_type"] = redundancy_type
            __props__.__dict__["subnet"] = subnet
            __props__.__dict__["status"] = None
            __props__.__dict__["uuid"] = None
        super(DeviceLink, __self__).__init__(
            'equinix:networkedge/deviceLink:DeviceLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            devices: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkDeviceArgs', 'DeviceLinkDeviceArgsDict']]]]] = None,
            links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkLinkArgs', 'DeviceLinkLinkArgsDict']]]]] = None,
            metro_links: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkMetroLinkArgs', 'DeviceLinkMetroLinkArgsDict']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            redundancy_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subnet: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'DeviceLink':
        """
        Get an existing DeviceLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkDeviceArgs', 'DeviceLinkDeviceArgsDict']]]] devices: definition of one or more devices belonging to the device link. See Device section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkLinkArgs', 'DeviceLinkLinkArgsDict']]]] links: definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DeviceLinkMetroLinkArgs', 'DeviceLinkMetroLinkArgsDict']]]] metro_links: definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        :param pulumi.Input[str] name: device link name.
        :param pulumi.Input[str] project_id: Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        :param pulumi.Input[str] redundancy_type: Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        :param pulumi.Input[str] status: device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
        :param pulumi.Input[str] subnet: device link subnet in CIDR format. Not required for link between self configured devices.
        :param pulumi.Input[str] uuid: Device link unique identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeviceLinkState.__new__(_DeviceLinkState)

        __props__.__dict__["devices"] = devices
        __props__.__dict__["links"] = links
        __props__.__dict__["metro_links"] = metro_links
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["redundancy_type"] = redundancy_type
        __props__.__dict__["status"] = status
        __props__.__dict__["subnet"] = subnet
        __props__.__dict__["uuid"] = uuid
        return DeviceLink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def devices(self) -> pulumi.Output[Sequence['outputs.DeviceLinkDevice']]:
        """
        definition of one or more devices belonging to the device link. See Device section below for more details.
        """
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Links is deprecated. Please use metro links instead.""")
    def links(self) -> pulumi.Output[Optional[Sequence['outputs.DeviceLinkLink']]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
        """
        return pulumi.get(self, "links")

    @property
    @pulumi.getter(name="metroLinks")
    def metro_links(self) -> pulumi.Output[Optional[Sequence['outputs.DeviceLinkMetroLink']]]:
        """
        definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
        """
        return pulumi.get(self, "metro_links")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        device link name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="redundancyType")
    def redundancy_type(self) -> pulumi.Output[Optional[str]]:
        """
        Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
        """
        return pulumi.get(self, "redundancy_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def subnet(self) -> pulumi.Output[Optional[str]]:
        """
        device link subnet in CIDR format. Not required for link between self configured devices.
        """
        return pulumi.get(self, "subnet")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        Device link unique identifier.
        """
        return pulumi.get(self, "uuid")

