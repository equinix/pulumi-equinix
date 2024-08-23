# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DeviceNetworkTypeArgs', 'DeviceNetworkType']

@pulumi.input_type
class DeviceNetworkTypeArgs:
    def __init__(__self__, *,
                 device_id: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        The set of arguments for constructing a DeviceNetworkType resource.
        :param pulumi.Input[str] device_id: The ID of the device on which the network type should be set.
        :param pulumi.Input[str] type: Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        pulumi.set(__self__, "device_id", device_id)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Input[str]:
        """
        The ID of the device on which the network type should be set.
        """
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _DeviceNetworkTypeState:
    def __init__(__self__, *,
                 device_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DeviceNetworkType resources.
        :param pulumi.Input[str] device_id: The ID of the device on which the network type should be set.
        :param pulumi.Input[str] type: Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        if device_id is not None:
            pulumi.set(__self__, "device_id", device_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the device on which the network type should be set.
        """
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DeviceNetworkType(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        device_id = config.require("deviceId")
        network_type = config.get("networkType")
        if network_type is None:
            network_type = "hybrid"
        device_network = equinix.metal.DeviceNetworkType("deviceNetwork",
            device_id=device_id,
            type=network_type)
        pulumi.export("deviceNetworkId", device_network.id)
        ```

        ## Import

        This resource can also be imported using existing device ID:

        ```sh
        $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device_id: The ID of the device on which the network type should be set.
        :param pulumi.Input[str] type: Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeviceNetworkTypeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        device_id = config.require("deviceId")
        network_type = config.get("networkType")
        if network_type is None:
            network_type = "hybrid"
        device_network = equinix.metal.DeviceNetworkType("deviceNetwork",
            device_id=device_id,
            type=network_type)
        pulumi.export("deviceNetworkId", device_network.id)
        ```

        ## Import

        This resource can also be imported using existing device ID:

        ```sh
        $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id}
        ```

        :param str resource_name: The name of the resource.
        :param DeviceNetworkTypeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeviceNetworkTypeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeviceNetworkTypeArgs.__new__(DeviceNetworkTypeArgs)

            if device_id is None and not opts.urn:
                raise TypeError("Missing required property 'device_id'")
            __props__.__dict__["device_id"] = device_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(DeviceNetworkType, __self__).__init__(
            'equinix:metal/deviceNetworkType:DeviceNetworkType',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DeviceNetworkType':
        """
        Get an existing DeviceNetworkType resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device_id: The ID of the device on which the network type should be set.
        :param pulumi.Input[str] type: Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeviceNetworkTypeState.__new__(_DeviceNetworkTypeState)

        __props__.__dict__["device_id"] = device_id
        __props__.__dict__["type"] = type
        return DeviceNetworkType(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Output[str]:
        """
        The ID of the device on which the network type should be set.
        """
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual` and `layer2-bonded`.
        """
        return pulumi.get(self, "type")
