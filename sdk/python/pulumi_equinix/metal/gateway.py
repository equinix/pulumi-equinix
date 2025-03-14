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

__all__ = ['GatewayArgs', 'Gateway']

@pulumi.input_type
class GatewayArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 vlan_id: pulumi.Input[str],
                 ip_reservation_id: Optional[pulumi.Input[str]] = None,
                 private_ipv4_subnet_size: Optional[pulumi.Input[int]] = None,
                 timeouts: Optional[pulumi.Input['GatewayTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a Gateway resource.
        :param pulumi.Input[str] project_id: UUID of the project where the gateway is scoped to.
        :param pulumi.Input[str] vlan_id: UUID of the VLAN where the gateway is scoped to.
        :param pulumi.Input[str] ip_reservation_id: UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        :param pulumi.Input[int] private_ipv4_subnet_size: Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "vlan_id", vlan_id)
        if ip_reservation_id is not None:
            pulumi.set(__self__, "ip_reservation_id", ip_reservation_id)
        if private_ipv4_subnet_size is not None:
            pulumi.set(__self__, "private_ipv4_subnet_size", private_ipv4_subnet_size)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        UUID of the project where the gateway is scoped to.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Input[str]:
        """
        UUID of the VLAN where the gateway is scoped to.
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vlan_id", value)

    @property
    @pulumi.getter(name="ipReservationId")
    def ip_reservation_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        """
        return pulumi.get(self, "ip_reservation_id")

    @ip_reservation_id.setter
    def ip_reservation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_reservation_id", value)

    @property
    @pulumi.getter(name="privateIpv4SubnetSize")
    def private_ipv4_subnet_size(self) -> Optional[pulumi.Input[int]]:
        """
        Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        """
        return pulumi.get(self, "private_ipv4_subnet_size")

    @private_ipv4_subnet_size.setter
    def private_ipv4_subnet_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "private_ipv4_subnet_size", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['GatewayTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['GatewayTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _GatewayState:
    def __init__(__self__, *,
                 ip_reservation_id: Optional[pulumi.Input[str]] = None,
                 private_ipv4_subnet_size: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['GatewayTimeoutsArgs']] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 vrf_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Gateway resources.
        :param pulumi.Input[str] ip_reservation_id: UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        :param pulumi.Input[int] private_ipv4_subnet_size: Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        :param pulumi.Input[str] project_id: UUID of the project where the gateway is scoped to.
        :param pulumi.Input[str] state: Status of the gateway resource.
        :param pulumi.Input[str] vlan_id: UUID of the VLAN where the gateway is scoped to.
        :param pulumi.Input[str] vrf_id: UUID of the VRF associated with the IP Reservation
        """
        if ip_reservation_id is not None:
            pulumi.set(__self__, "ip_reservation_id", ip_reservation_id)
        if private_ipv4_subnet_size is not None:
            pulumi.set(__self__, "private_ipv4_subnet_size", private_ipv4_subnet_size)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)
        if vrf_id is not None:
            pulumi.set(__self__, "vrf_id", vrf_id)

    @property
    @pulumi.getter(name="ipReservationId")
    def ip_reservation_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        """
        return pulumi.get(self, "ip_reservation_id")

    @ip_reservation_id.setter
    def ip_reservation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_reservation_id", value)

    @property
    @pulumi.getter(name="privateIpv4SubnetSize")
    def private_ipv4_subnet_size(self) -> Optional[pulumi.Input[int]]:
        """
        Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        """
        return pulumi.get(self, "private_ipv4_subnet_size")

    @private_ipv4_subnet_size.setter
    def private_ipv4_subnet_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "private_ipv4_subnet_size", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of the project where the gateway is scoped to.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the gateway resource.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['GatewayTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['GatewayTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of the VLAN where the gateway is scoped to.
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vlan_id", value)

    @property
    @pulumi.getter(name="vrfId")
    def vrf_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of the VRF associated with the IP Reservation
        """
        return pulumi.get(self, "vrf_id")

    @vrf_id.setter
    def vrf_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vrf_id", value)


class Gateway(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_reservation_id: Optional[pulumi.Input[str]] = None,
                 private_ipv4_subnet_size: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[Union['GatewayTimeoutsArgs', 'GatewayTimeoutsArgsDict']]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create Metal Gateway resources in Equinix Metal.

        See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.

        ## Example Usage
        ### example 1
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.metal.Vlan("test",
            description="test VLAN in SV",
            metro="sv",
            project_id=project_id)
        test_gateway = equinix.metal.Gateway("testGateway",
            project_id=project_id,
            vlan_id=test.id,
            private_ipv4_subnet_size=8)
        ```
        ### example 2
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.metal.Vlan("test",
            description="test VLAN in SV",
            metro="sv",
            project_id=project_id)
        test1 = equinix.metal.ReservedIpBlock("test1",
            project_id=project_id,
            metro="sv",
            quantity=8)
        test_gateway = equinix.metal.Gateway("testGateway",
            project_id=project_id,
            vlan_id=test.id,
            ip_reservation_id=test_equinix_metal_reserved_ip_block["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip_reservation_id: UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        :param pulumi.Input[int] private_ipv4_subnet_size: Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        :param pulumi.Input[str] project_id: UUID of the project where the gateway is scoped to.
        :param pulumi.Input[str] vlan_id: UUID of the VLAN where the gateway is scoped to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create Metal Gateway resources in Equinix Metal.

        See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.

        ## Example Usage
        ### example 1
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.metal.Vlan("test",
            description="test VLAN in SV",
            metro="sv",
            project_id=project_id)
        test_gateway = equinix.metal.Gateway("testGateway",
            project_id=project_id,
            vlan_id=test.id,
            private_ipv4_subnet_size=8)
        ```
        ### example 2
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.metal.Vlan("test",
            description="test VLAN in SV",
            metro="sv",
            project_id=project_id)
        test1 = equinix.metal.ReservedIpBlock("test1",
            project_id=project_id,
            metro="sv",
            quantity=8)
        test_gateway = equinix.metal.Gateway("testGateway",
            project_id=project_id,
            vlan_id=test.id,
            ip_reservation_id=test_equinix_metal_reserved_ip_block["id"])
        ```

        :param str resource_name: The name of the resource.
        :param GatewayArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_reservation_id: Optional[pulumi.Input[str]] = None,
                 private_ipv4_subnet_size: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[Union['GatewayTimeoutsArgs', 'GatewayTimeoutsArgsDict']]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayArgs.__new__(GatewayArgs)

            __props__.__dict__["ip_reservation_id"] = ip_reservation_id
            __props__.__dict__["private_ipv4_subnet_size"] = private_ipv4_subnet_size
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["timeouts"] = timeouts
            if vlan_id is None and not opts.urn:
                raise TypeError("Missing required property 'vlan_id'")
            __props__.__dict__["vlan_id"] = vlan_id
            __props__.__dict__["state"] = None
            __props__.__dict__["vrf_id"] = None
        super(Gateway, __self__).__init__(
            'equinix:metal/gateway:Gateway',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ip_reservation_id: Optional[pulumi.Input[str]] = None,
            private_ipv4_subnet_size: Optional[pulumi.Input[int]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[Union['GatewayTimeoutsArgs', 'GatewayTimeoutsArgsDict']]] = None,
            vlan_id: Optional[pulumi.Input[str]] = None,
            vrf_id: Optional[pulumi.Input[str]] = None) -> 'Gateway':
        """
        Get an existing Gateway resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip_reservation_id: UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        :param pulumi.Input[int] private_ipv4_subnet_size: Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        :param pulumi.Input[str] project_id: UUID of the project where the gateway is scoped to.
        :param pulumi.Input[str] state: Status of the gateway resource.
        :param pulumi.Input[str] vlan_id: UUID of the VLAN where the gateway is scoped to.
        :param pulumi.Input[str] vrf_id: UUID of the VRF associated with the IP Reservation
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayState.__new__(_GatewayState)

        __props__.__dict__["ip_reservation_id"] = ip_reservation_id
        __props__.__dict__["private_ipv4_subnet_size"] = private_ipv4_subnet_size
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["state"] = state
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["vlan_id"] = vlan_id
        __props__.__dict__["vrf_id"] = vrf_id
        return Gateway(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ipReservationId")
    def ip_reservation_id(self) -> pulumi.Output[str]:
        """
        UUID of Public or VRF IP Reservation to associate with the gateway, the reservation must be in the same metro as the VLAN, conflicts with `private_ipv4_subnet_size`.
        """
        return pulumi.get(self, "ip_reservation_id")

    @property
    @pulumi.getter(name="privateIpv4SubnetSize")
    def private_ipv4_subnet_size(self) -> pulumi.Output[int]:
        """
        Size of the private IPv4 subnet to create for this metal gateway, must be one of `8`, `16`, `32`, `64`, `128`. Conflicts with `ip_reservation_id`.
        """
        return pulumi.get(self, "private_ipv4_subnet_size")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        UUID of the project where the gateway is scoped to.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Status of the gateway resource.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.GatewayTimeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[str]:
        """
        UUID of the VLAN where the gateway is scoped to.
        """
        return pulumi.get(self, "vlan_id")

    @property
    @pulumi.getter(name="vrfId")
    def vrf_id(self) -> pulumi.Output[str]:
        """
        UUID of the VRF associated with the IP Reservation
        """
        return pulumi.get(self, "vrf_id")

