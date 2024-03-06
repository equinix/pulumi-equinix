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

__all__ = ['SpotMarketRequestArgs', 'SpotMarketRequest']

@pulumi.input_type
class SpotMarketRequestArgs:
    def __init__(__self__, *,
                 devices_max: pulumi.Input[int],
                 devices_min: pulumi.Input[int],
                 instance_parameters: pulumi.Input['SpotMarketRequestInstanceParametersArgs'],
                 max_bid_price: pulumi.Input[float],
                 project_id: pulumi.Input[str],
                 facilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 wait_for_devices: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SpotMarketRequest resource.
        :param pulumi.Input[int] devices_max: Maximum number devices to be created.
        :param pulumi.Input[int] devices_min: Miniumum number devices to be created.
        :param pulumi.Input['SpotMarketRequestInstanceParametersArgs'] instance_parameters: Key/Value pairs of parameters for devices provisioned from
               this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
               `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
               `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
               description in metal.Device docs.
        :param pulumi.Input[float] max_bid_price: Maximum price user is willing to pay per hour per device.
        :param pulumi.Input[str] project_id: Project ID.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] facilities: Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        :param pulumi.Input[str] metro: Metro where devices should be created.
        :param pulumi.Input[bool] wait_for_devices: On resource creation wait until all desired devices are active.
               On resource destruction wait until devices are removed.
        """
        pulumi.set(__self__, "devices_max", devices_max)
        pulumi.set(__self__, "devices_min", devices_min)
        pulumi.set(__self__, "instance_parameters", instance_parameters)
        pulumi.set(__self__, "max_bid_price", max_bid_price)
        pulumi.set(__self__, "project_id", project_id)
        if facilities is not None:
            warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
            pulumi.log.warn("""facilities is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")
        if facilities is not None:
            pulumi.set(__self__, "facilities", facilities)
        if metro is not None:
            pulumi.set(__self__, "metro", metro)
        if wait_for_devices is not None:
            pulumi.set(__self__, "wait_for_devices", wait_for_devices)

    @property
    @pulumi.getter(name="devicesMax")
    def devices_max(self) -> pulumi.Input[int]:
        """
        Maximum number devices to be created.
        """
        return pulumi.get(self, "devices_max")

    @devices_max.setter
    def devices_max(self, value: pulumi.Input[int]):
        pulumi.set(self, "devices_max", value)

    @property
    @pulumi.getter(name="devicesMin")
    def devices_min(self) -> pulumi.Input[int]:
        """
        Miniumum number devices to be created.
        """
        return pulumi.get(self, "devices_min")

    @devices_min.setter
    def devices_min(self, value: pulumi.Input[int]):
        pulumi.set(self, "devices_min", value)

    @property
    @pulumi.getter(name="instanceParameters")
    def instance_parameters(self) -> pulumi.Input['SpotMarketRequestInstanceParametersArgs']:
        """
        Key/Value pairs of parameters for devices provisioned from
        this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
        `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
        `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
        description in metal.Device docs.
        """
        return pulumi.get(self, "instance_parameters")

    @instance_parameters.setter
    def instance_parameters(self, value: pulumi.Input['SpotMarketRequestInstanceParametersArgs']):
        pulumi.set(self, "instance_parameters", value)

    @property
    @pulumi.getter(name="maxBidPrice")
    def max_bid_price(self) -> pulumi.Input[float]:
        """
        Maximum price user is willing to pay per hour per device.
        """
        return pulumi.get(self, "max_bid_price")

    @max_bid_price.setter
    def max_bid_price(self, value: pulumi.Input[float]):
        pulumi.set(self, "max_bid_price", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Project ID.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def facilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        """
        warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
        pulumi.log.warn("""facilities is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")

        return pulumi.get(self, "facilities")

    @facilities.setter
    def facilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "facilities", value)

    @property
    @pulumi.getter
    def metro(self) -> Optional[pulumi.Input[str]]:
        """
        Metro where devices should be created.
        """
        return pulumi.get(self, "metro")

    @metro.setter
    def metro(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metro", value)

    @property
    @pulumi.getter(name="waitForDevices")
    def wait_for_devices(self) -> Optional[pulumi.Input[bool]]:
        """
        On resource creation wait until all desired devices are active.
        On resource destruction wait until devices are removed.
        """
        return pulumi.get(self, "wait_for_devices")

    @wait_for_devices.setter
    def wait_for_devices(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_devices", value)


@pulumi.input_type
class _SpotMarketRequestState:
    def __init__(__self__, *,
                 devices_max: Optional[pulumi.Input[int]] = None,
                 devices_min: Optional[pulumi.Input[int]] = None,
                 facilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_parameters: Optional[pulumi.Input['SpotMarketRequestInstanceParametersArgs']] = None,
                 max_bid_price: Optional[pulumi.Input[float]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 wait_for_devices: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SpotMarketRequest resources.
        :param pulumi.Input[int] devices_max: Maximum number devices to be created.
        :param pulumi.Input[int] devices_min: Miniumum number devices to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] facilities: Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        :param pulumi.Input['SpotMarketRequestInstanceParametersArgs'] instance_parameters: Key/Value pairs of parameters for devices provisioned from
               this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
               `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
               `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
               description in metal.Device docs.
        :param pulumi.Input[float] max_bid_price: Maximum price user is willing to pay per hour per device.
        :param pulumi.Input[str] metro: Metro where devices should be created.
        :param pulumi.Input[str] project_id: Project ID.
        :param pulumi.Input[bool] wait_for_devices: On resource creation wait until all desired devices are active.
               On resource destruction wait until devices are removed.
        """
        if devices_max is not None:
            pulumi.set(__self__, "devices_max", devices_max)
        if devices_min is not None:
            pulumi.set(__self__, "devices_min", devices_min)
        if facilities is not None:
            warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
            pulumi.log.warn("""facilities is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")
        if facilities is not None:
            pulumi.set(__self__, "facilities", facilities)
        if instance_parameters is not None:
            pulumi.set(__self__, "instance_parameters", instance_parameters)
        if max_bid_price is not None:
            pulumi.set(__self__, "max_bid_price", max_bid_price)
        if metro is not None:
            pulumi.set(__self__, "metro", metro)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if wait_for_devices is not None:
            pulumi.set(__self__, "wait_for_devices", wait_for_devices)

    @property
    @pulumi.getter(name="devicesMax")
    def devices_max(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number devices to be created.
        """
        return pulumi.get(self, "devices_max")

    @devices_max.setter
    def devices_max(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "devices_max", value)

    @property
    @pulumi.getter(name="devicesMin")
    def devices_min(self) -> Optional[pulumi.Input[int]]:
        """
        Miniumum number devices to be created.
        """
        return pulumi.get(self, "devices_min")

    @devices_min.setter
    def devices_min(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "devices_min", value)

    @property
    @pulumi.getter
    def facilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        """
        warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
        pulumi.log.warn("""facilities is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")

        return pulumi.get(self, "facilities")

    @facilities.setter
    def facilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "facilities", value)

    @property
    @pulumi.getter(name="instanceParameters")
    def instance_parameters(self) -> Optional[pulumi.Input['SpotMarketRequestInstanceParametersArgs']]:
        """
        Key/Value pairs of parameters for devices provisioned from
        this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
        `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
        `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
        description in metal.Device docs.
        """
        return pulumi.get(self, "instance_parameters")

    @instance_parameters.setter
    def instance_parameters(self, value: Optional[pulumi.Input['SpotMarketRequestInstanceParametersArgs']]):
        pulumi.set(self, "instance_parameters", value)

    @property
    @pulumi.getter(name="maxBidPrice")
    def max_bid_price(self) -> Optional[pulumi.Input[float]]:
        """
        Maximum price user is willing to pay per hour per device.
        """
        return pulumi.get(self, "max_bid_price")

    @max_bid_price.setter
    def max_bid_price(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "max_bid_price", value)

    @property
    @pulumi.getter
    def metro(self) -> Optional[pulumi.Input[str]]:
        """
        Metro where devices should be created.
        """
        return pulumi.get(self, "metro")

    @metro.setter
    def metro(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metro", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project ID.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="waitForDevices")
    def wait_for_devices(self) -> Optional[pulumi.Input[bool]]:
        """
        On resource creation wait until all desired devices are active.
        On resource destruction wait until devices are removed.
        """
        return pulumi.get(self, "wait_for_devices")

    @wait_for_devices.setter
    def wait_for_devices(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_devices", value)


class SpotMarketRequest(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices_max: Optional[pulumi.Input[int]] = None,
                 devices_min: Optional[pulumi.Input[int]] = None,
                 facilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_parameters: Optional[pulumi.Input[pulumi.InputType['SpotMarketRequestInstanceParametersArgs']]] = None,
                 max_bid_price: Optional[pulumi.Input[float]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 wait_for_devices: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides an Equinix Metal Spot Market Request resource to allow you to
        manage spot market requests on your account. For more detail on Spot Market,
        see [this article in Equinix Metal documentation](https://metal.equinix.com/developers/docs/deploy/spot-market/).

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        metro = config.get("metro")
        if metro is None:
            metro = "FR"
        request = equinix.metal.SpotMarketRequest("request",
            project_id=project_id,
            metro=metro,
            max_bid_price=0.75,
            devices_min=1,
            devices_max=1,
            instance_parameters=equinix.metal.SpotMarketRequestInstanceParametersArgs(
                hostname="testspot",
                billing_cycle="hourly",
                operating_system="ubuntu_20_04",
                plan="c3.small.x86",
            ))
        pulumi.export("requestId", request.id)
        ```

        ## Import

        This resource can be imported using an existing spot market request ID:<break><break> ```sh<break> $ pulumi import equinix:metal/spotMarketRequest:SpotMarketRequest equinix_metal_spot_market_request {existing_spot_market_request_id} <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] devices_max: Maximum number devices to be created.
        :param pulumi.Input[int] devices_min: Miniumum number devices to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] facilities: Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        :param pulumi.Input[pulumi.InputType['SpotMarketRequestInstanceParametersArgs']] instance_parameters: Key/Value pairs of parameters for devices provisioned from
               this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
               `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
               `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
               description in metal.Device docs.
        :param pulumi.Input[float] max_bid_price: Maximum price user is willing to pay per hour per device.
        :param pulumi.Input[str] metro: Metro where devices should be created.
        :param pulumi.Input[str] project_id: Project ID.
        :param pulumi.Input[bool] wait_for_devices: On resource creation wait until all desired devices are active.
               On resource destruction wait until devices are removed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpotMarketRequestArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Equinix Metal Spot Market Request resource to allow you to
        manage spot market requests on your account. For more detail on Spot Market,
        see [this article in Equinix Metal documentation](https://metal.equinix.com/developers/docs/deploy/spot-market/).

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        metro = config.get("metro")
        if metro is None:
            metro = "FR"
        request = equinix.metal.SpotMarketRequest("request",
            project_id=project_id,
            metro=metro,
            max_bid_price=0.75,
            devices_min=1,
            devices_max=1,
            instance_parameters=equinix.metal.SpotMarketRequestInstanceParametersArgs(
                hostname="testspot",
                billing_cycle="hourly",
                operating_system="ubuntu_20_04",
                plan="c3.small.x86",
            ))
        pulumi.export("requestId", request.id)
        ```

        ## Import

        This resource can be imported using an existing spot market request ID:<break><break> ```sh<break> $ pulumi import equinix:metal/spotMarketRequest:SpotMarketRequest equinix_metal_spot_market_request {existing_spot_market_request_id} <break>```<break><break>

        :param str resource_name: The name of the resource.
        :param SpotMarketRequestArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpotMarketRequestArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices_max: Optional[pulumi.Input[int]] = None,
                 devices_min: Optional[pulumi.Input[int]] = None,
                 facilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_parameters: Optional[pulumi.Input[pulumi.InputType['SpotMarketRequestInstanceParametersArgs']]] = None,
                 max_bid_price: Optional[pulumi.Input[float]] = None,
                 metro: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 wait_for_devices: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpotMarketRequestArgs.__new__(SpotMarketRequestArgs)

            if devices_max is None and not opts.urn:
                raise TypeError("Missing required property 'devices_max'")
            __props__.__dict__["devices_max"] = devices_max
            if devices_min is None and not opts.urn:
                raise TypeError("Missing required property 'devices_min'")
            __props__.__dict__["devices_min"] = devices_min
            __props__.__dict__["facilities"] = facilities
            if instance_parameters is None and not opts.urn:
                raise TypeError("Missing required property 'instance_parameters'")
            __props__.__dict__["instance_parameters"] = instance_parameters
            if max_bid_price is None and not opts.urn:
                raise TypeError("Missing required property 'max_bid_price'")
            __props__.__dict__["max_bid_price"] = max_bid_price
            __props__.__dict__["metro"] = metro
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["wait_for_devices"] = wait_for_devices
        super(SpotMarketRequest, __self__).__init__(
            'equinix:metal/spotMarketRequest:SpotMarketRequest',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            devices_max: Optional[pulumi.Input[int]] = None,
            devices_min: Optional[pulumi.Input[int]] = None,
            facilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            instance_parameters: Optional[pulumi.Input[pulumi.InputType['SpotMarketRequestInstanceParametersArgs']]] = None,
            max_bid_price: Optional[pulumi.Input[float]] = None,
            metro: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            wait_for_devices: Optional[pulumi.Input[bool]] = None) -> 'SpotMarketRequest':
        """
        Get an existing SpotMarketRequest resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] devices_max: Maximum number devices to be created.
        :param pulumi.Input[int] devices_min: Miniumum number devices to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] facilities: Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        :param pulumi.Input[pulumi.InputType['SpotMarketRequestInstanceParametersArgs']] instance_parameters: Key/Value pairs of parameters for devices provisioned from
               this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
               `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
               `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
               description in metal.Device docs.
        :param pulumi.Input[float] max_bid_price: Maximum price user is willing to pay per hour per device.
        :param pulumi.Input[str] metro: Metro where devices should be created.
        :param pulumi.Input[str] project_id: Project ID.
        :param pulumi.Input[bool] wait_for_devices: On resource creation wait until all desired devices are active.
               On resource destruction wait until devices are removed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpotMarketRequestState.__new__(_SpotMarketRequestState)

        __props__.__dict__["devices_max"] = devices_max
        __props__.__dict__["devices_min"] = devices_min
        __props__.__dict__["facilities"] = facilities
        __props__.__dict__["instance_parameters"] = instance_parameters
        __props__.__dict__["max_bid_price"] = max_bid_price
        __props__.__dict__["metro"] = metro
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["wait_for_devices"] = wait_for_devices
        return SpotMarketRequest(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="devicesMax")
    def devices_max(self) -> pulumi.Output[int]:
        """
        Maximum number devices to be created.
        """
        return pulumi.get(self, "devices_max")

    @property
    @pulumi.getter(name="devicesMin")
    def devices_min(self) -> pulumi.Output[int]:
        """
        Miniumum number devices to be created.
        """
        return pulumi.get(self, "devices_min")

    @property
    @pulumi.getter
    def facilities(self) -> pulumi.Output[Sequence[str]]:
        """
        Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
        """
        warnings.warn("""Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""", DeprecationWarning)
        pulumi.log.warn("""facilities is deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices""")

        return pulumi.get(self, "facilities")

    @property
    @pulumi.getter(name="instanceParameters")
    def instance_parameters(self) -> pulumi.Output['outputs.SpotMarketRequestInstanceParameters']:
        """
        Key/Value pairs of parameters for devices provisioned from
        this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
        `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
        `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
        description in metal.Device docs.
        """
        return pulumi.get(self, "instance_parameters")

    @property
    @pulumi.getter(name="maxBidPrice")
    def max_bid_price(self) -> pulumi.Output[float]:
        """
        Maximum price user is willing to pay per hour per device.
        """
        return pulumi.get(self, "max_bid_price")

    @property
    @pulumi.getter
    def metro(self) -> pulumi.Output[Optional[str]]:
        """
        Metro where devices should be created.
        """
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Project ID.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="waitForDevices")
    def wait_for_devices(self) -> pulumi.Output[Optional[bool]]:
        """
        On resource creation wait until all desired devices are active.
        On resource destruction wait until devices are removed.
        """
        return pulumi.get(self, "wait_for_devices")

