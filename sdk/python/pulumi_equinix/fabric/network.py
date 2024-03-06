# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkArgs', 'Network']

@pulumi.input_type
class NetworkArgs:
    def __init__(__self__, *,
                 notifications: pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]],
                 project: pulumi.Input['NetworkProjectArgs'],
                 scope: pulumi.Input[str],
                 type: pulumi.Input[str],
                 location: Optional[pulumi.Input['NetworkLocationArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Network resource.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]] notifications: Preferences for notifications on Fabric Network configuration or status changes
        :param pulumi.Input['NetworkProjectArgs'] project: Fabric Network project
        :param pulumi.Input[str] scope: Fabric Network scope
        :param pulumi.Input[str] type: Supported Network types - EVPLAN, EPLAN, IPWAN
        :param pulumi.Input['NetworkLocationArgs'] location: Fabric Network location
        :param pulumi.Input[str] name: Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        pulumi.set(__self__, "notifications", notifications)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "scope", scope)
        pulumi.set(__self__, "type", type)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def notifications(self) -> pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]]:
        """
        Preferences for notifications on Fabric Network configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input['NetworkProjectArgs']:
        """
        Fabric Network project
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input['NetworkProjectArgs']):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Input[str]:
        """
        Fabric Network scope
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: pulumi.Input[str]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Supported Network types - EVPLAN, EPLAN, IPWAN
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input['NetworkLocationArgs']]:
        """
        Fabric Network location
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input['NetworkLocationArgs']]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NetworkState:
    def __init__(__self__, *,
                 change: Optional[pulumi.Input['NetworkChangeArgs']] = None,
                 change_log: Optional[pulumi.Input['NetworkChangeLogArgs']] = None,
                 connections_count: Optional[pulumi.Input[int]] = None,
                 href: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input['NetworkLocationArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]]] = None,
                 operation: Optional[pulumi.Input['NetworkOperationArgs']] = None,
                 project: Optional[pulumi.Input['NetworkProjectArgs']] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Network resources.
        :param pulumi.Input['NetworkChangeArgs'] change: Information on asset change operation
        :param pulumi.Input['NetworkChangeLogArgs'] change_log: A permanent record of asset creation, modification, or deletion
        :param pulumi.Input[int] connections_count: Number of connections associated with this network
        :param pulumi.Input[str] href: Fabric Network URI information
        :param pulumi.Input['NetworkLocationArgs'] location: Fabric Network location
        :param pulumi.Input[str] name: Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        :param pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]] notifications: Preferences for notifications on Fabric Network configuration or status changes
        :param pulumi.Input['NetworkOperationArgs'] operation: Network operation information that is associated with this Fabric Network
        :param pulumi.Input['NetworkProjectArgs'] project: Fabric Network project
        :param pulumi.Input[str] scope: Fabric Network scope
        :param pulumi.Input[str] state: Fabric Network overall state
        :param pulumi.Input[str] type: Supported Network types - EVPLAN, EPLAN, IPWAN
        :param pulumi.Input[str] uuid: Equinix-assigned network identifier
        """
        if change is not None:
            pulumi.set(__self__, "change", change)
        if change_log is not None:
            pulumi.set(__self__, "change_log", change_log)
        if connections_count is not None:
            pulumi.set(__self__, "connections_count", connections_count)
        if href is not None:
            pulumi.set(__self__, "href", href)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notifications is not None:
            pulumi.set(__self__, "notifications", notifications)
        if operation is not None:
            pulumi.set(__self__, "operation", operation)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def change(self) -> Optional[pulumi.Input['NetworkChangeArgs']]:
        """
        Information on asset change operation
        """
        return pulumi.get(self, "change")

    @change.setter
    def change(self, value: Optional[pulumi.Input['NetworkChangeArgs']]):
        pulumi.set(self, "change", value)

    @property
    @pulumi.getter(name="changeLog")
    def change_log(self) -> Optional[pulumi.Input['NetworkChangeLogArgs']]:
        """
        A permanent record of asset creation, modification, or deletion
        """
        return pulumi.get(self, "change_log")

    @change_log.setter
    def change_log(self, value: Optional[pulumi.Input['NetworkChangeLogArgs']]):
        pulumi.set(self, "change_log", value)

    @property
    @pulumi.getter(name="connectionsCount")
    def connections_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of connections associated with this network
        """
        return pulumi.get(self, "connections_count")

    @connections_count.setter
    def connections_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "connections_count", value)

    @property
    @pulumi.getter
    def href(self) -> Optional[pulumi.Input[str]]:
        """
        Fabric Network URI information
        """
        return pulumi.get(self, "href")

    @href.setter
    def href(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "href", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input['NetworkLocationArgs']]:
        """
        Fabric Network location
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input['NetworkLocationArgs']]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notifications(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]]]:
        """
        Preferences for notifications on Fabric Network configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkNotificationArgs']]]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter
    def operation(self) -> Optional[pulumi.Input['NetworkOperationArgs']]:
        """
        Network operation information that is associated with this Fabric Network
        """
        return pulumi.get(self, "operation")

    @operation.setter
    def operation(self, value: Optional[pulumi.Input['NetworkOperationArgs']]):
        pulumi.set(self, "operation", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input['NetworkProjectArgs']]:
        """
        Fabric Network project
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input['NetworkProjectArgs']]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        Fabric Network scope
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Fabric Network overall state
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Supported Network types - EVPLAN, EPLAN, IPWAN
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Equinix-assigned network identifier
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class Network(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[pulumi.InputType['NetworkLocationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkNotificationArgs']]]]] = None,
                 project: Optional[pulumi.Input[pulumi.InputType['NetworkProjectArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Fabric V4 API compatible resource allows creation and management of Equinix Fabric Network

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        new_network = equinix.fabric.Network("newNetwork",
            notifications=[equinix.fabric.NetworkNotificationArgs(
                emails=[
                    "example@equinix.com",
                    "test1@equinix.com",
                ],
                type="ALL",
            )],
            project=equinix.fabric.NetworkProjectArgs(
                project_id="776847000642406",
            ),
            scope="GLOBAL",
            type="EVPLAN")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['NetworkLocationArgs']] location: Fabric Network location
        :param pulumi.Input[str] name: Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkNotificationArgs']]]] notifications: Preferences for notifications on Fabric Network configuration or status changes
        :param pulumi.Input[pulumi.InputType['NetworkProjectArgs']] project: Fabric Network project
        :param pulumi.Input[str] scope: Fabric Network scope
        :param pulumi.Input[str] type: Supported Network types - EVPLAN, EPLAN, IPWAN
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Fabric V4 API compatible resource allows creation and management of Equinix Fabric Network

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        new_network = equinix.fabric.Network("newNetwork",
            notifications=[equinix.fabric.NetworkNotificationArgs(
                emails=[
                    "example@equinix.com",
                    "test1@equinix.com",
                ],
                type="ALL",
            )],
            project=equinix.fabric.NetworkProjectArgs(
                project_id="776847000642406",
            ),
            scope="GLOBAL",
            type="EVPLAN")
        ```

        :param str resource_name: The name of the resource.
        :param NetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[pulumi.InputType['NetworkLocationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkNotificationArgs']]]]] = None,
                 project: Optional[pulumi.Input[pulumi.InputType['NetworkProjectArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkArgs.__new__(NetworkArgs)

            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if notifications is None and not opts.urn:
                raise TypeError("Missing required property 'notifications'")
            __props__.__dict__["notifications"] = notifications
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if scope is None and not opts.urn:
                raise TypeError("Missing required property 'scope'")
            __props__.__dict__["scope"] = scope
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["change"] = None
            __props__.__dict__["change_log"] = None
            __props__.__dict__["connections_count"] = None
            __props__.__dict__["href"] = None
            __props__.__dict__["operation"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uuid"] = None
        super(Network, __self__).__init__(
            'equinix:fabric/network:Network',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            change: Optional[pulumi.Input[pulumi.InputType['NetworkChangeArgs']]] = None,
            change_log: Optional[pulumi.Input[pulumi.InputType['NetworkChangeLogArgs']]] = None,
            connections_count: Optional[pulumi.Input[int]] = None,
            href: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[pulumi.InputType['NetworkLocationArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkNotificationArgs']]]]] = None,
            operation: Optional[pulumi.Input[pulumi.InputType['NetworkOperationArgs']]] = None,
            project: Optional[pulumi.Input[pulumi.InputType['NetworkProjectArgs']]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'Network':
        """
        Get an existing Network resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['NetworkChangeArgs']] change: Information on asset change operation
        :param pulumi.Input[pulumi.InputType['NetworkChangeLogArgs']] change_log: A permanent record of asset creation, modification, or deletion
        :param pulumi.Input[int] connections_count: Number of connections associated with this network
        :param pulumi.Input[str] href: Fabric Network URI information
        :param pulumi.Input[pulumi.InputType['NetworkLocationArgs']] location: Fabric Network location
        :param pulumi.Input[str] name: Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkNotificationArgs']]]] notifications: Preferences for notifications on Fabric Network configuration or status changes
        :param pulumi.Input[pulumi.InputType['NetworkOperationArgs']] operation: Network operation information that is associated with this Fabric Network
        :param pulumi.Input[pulumi.InputType['NetworkProjectArgs']] project: Fabric Network project
        :param pulumi.Input[str] scope: Fabric Network scope
        :param pulumi.Input[str] state: Fabric Network overall state
        :param pulumi.Input[str] type: Supported Network types - EVPLAN, EPLAN, IPWAN
        :param pulumi.Input[str] uuid: Equinix-assigned network identifier
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkState.__new__(_NetworkState)

        __props__.__dict__["change"] = change
        __props__.__dict__["change_log"] = change_log
        __props__.__dict__["connections_count"] = connections_count
        __props__.__dict__["href"] = href
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["notifications"] = notifications
        __props__.__dict__["operation"] = operation
        __props__.__dict__["project"] = project
        __props__.__dict__["scope"] = scope
        __props__.__dict__["state"] = state
        __props__.__dict__["type"] = type
        __props__.__dict__["uuid"] = uuid
        return Network(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def change(self) -> pulumi.Output['outputs.NetworkChange']:
        """
        Information on asset change operation
        """
        return pulumi.get(self, "change")

    @property
    @pulumi.getter(name="changeLog")
    def change_log(self) -> pulumi.Output['outputs.NetworkChangeLog']:
        """
        A permanent record of asset creation, modification, or deletion
        """
        return pulumi.get(self, "change_log")

    @property
    @pulumi.getter(name="connectionsCount")
    def connections_count(self) -> pulumi.Output[int]:
        """
        Number of connections associated with this network
        """
        return pulumi.get(self, "connections_count")

    @property
    @pulumi.getter
    def href(self) -> pulumi.Output[str]:
        """
        Fabric Network URI information
        """
        return pulumi.get(self, "href")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output['outputs.NetworkLocation']:
        """
        Fabric Network location
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> pulumi.Output[Sequence['outputs.NetworkNotification']]:
        """
        Preferences for notifications on Fabric Network configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def operation(self) -> pulumi.Output['outputs.NetworkOperation']:
        """
        Network operation information that is associated with this Fabric Network
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output['outputs.NetworkProject']:
        """
        Fabric Network project
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[str]:
        """
        Fabric Network scope
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Fabric Network overall state
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Supported Network types - EVPLAN, EPLAN, IPWAN
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        Equinix-assigned network identifier
        """
        return pulumi.get(self, "uuid")

