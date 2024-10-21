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

__all__ = ['BgpArgs', 'Bgp']

@pulumi.input_type
class BgpArgs:
    def __init__(__self__, *,
                 connection_id: pulumi.Input[str],
                 local_asn: pulumi.Input[int],
                 local_ip_address: pulumi.Input[str],
                 remote_asn: pulumi.Input[int],
                 remote_ip_address: pulumi.Input[str],
                 authentication_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Bgp resource.
        :param pulumi.Input[str] connection_id: identifier of a connection established between. network device and remote service provider that will be used for peering.
        :param pulumi.Input[int] local_asn: Local ASN number.
        :param pulumi.Input[str] local_ip_address: IP address in CIDR format of a local device.
        :param pulumi.Input[int] remote_asn: Remote ASN number.
        :param pulumi.Input[str] remote_ip_address: IP address of remote peer.
        :param pulumi.Input[str] authentication_key: shared key used for BGP peer authentication.
        """
        pulumi.set(__self__, "connection_id", connection_id)
        pulumi.set(__self__, "local_asn", local_asn)
        pulumi.set(__self__, "local_ip_address", local_ip_address)
        pulumi.set(__self__, "remote_asn", remote_asn)
        pulumi.set(__self__, "remote_ip_address", remote_ip_address)
        if authentication_key is not None:
            pulumi.set(__self__, "authentication_key", authentication_key)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[str]:
        """
        identifier of a connection established between. network device and remote service provider that will be used for peering.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> pulumi.Input[int]:
        """
        Local ASN number.
        """
        return pulumi.get(self, "local_asn")

    @local_asn.setter
    def local_asn(self, value: pulumi.Input[int]):
        pulumi.set(self, "local_asn", value)

    @property
    @pulumi.getter(name="localIpAddress")
    def local_ip_address(self) -> pulumi.Input[str]:
        """
        IP address in CIDR format of a local device.
        """
        return pulumi.get(self, "local_ip_address")

    @local_ip_address.setter
    def local_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_ip_address", value)

    @property
    @pulumi.getter(name="remoteAsn")
    def remote_asn(self) -> pulumi.Input[int]:
        """
        Remote ASN number.
        """
        return pulumi.get(self, "remote_asn")

    @remote_asn.setter
    def remote_asn(self, value: pulumi.Input[int]):
        pulumi.set(self, "remote_asn", value)

    @property
    @pulumi.getter(name="remoteIpAddress")
    def remote_ip_address(self) -> pulumi.Input[str]:
        """
        IP address of remote peer.
        """
        return pulumi.get(self, "remote_ip_address")

    @remote_ip_address.setter
    def remote_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "remote_ip_address", value)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> Optional[pulumi.Input[str]]:
        """
        shared key used for BGP peer authentication.
        """
        return pulumi.get(self, "authentication_key")

    @authentication_key.setter
    def authentication_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_key", value)


@pulumi.input_type
class _BgpState:
    def __init__(__self__, *,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 local_ip_address: Optional[pulumi.Input[str]] = None,
                 provisioning_status: Optional[pulumi.Input[str]] = None,
                 remote_asn: Optional[pulumi.Input[int]] = None,
                 remote_ip_address: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Bgp resources.
        :param pulumi.Input[str] authentication_key: shared key used for BGP peer authentication.
        :param pulumi.Input[str] connection_id: identifier of a connection established between. network device and remote service provider that will be used for peering.
        :param pulumi.Input[str] device_id: unique identifier of a network device that is a local peer in a given BGP peering configuration.
        :param pulumi.Input[int] local_asn: Local ASN number.
        :param pulumi.Input[str] local_ip_address: IP address in CIDR format of a local device.
        :param pulumi.Input[str] provisioning_status: BGP peering configuration provisioning status, one of `PROVISIONING`, `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        :param pulumi.Input[int] remote_asn: Remote ASN number.
        :param pulumi.Input[str] remote_ip_address: IP address of remote peer.
        :param pulumi.Input[str] state: BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`, `Established`.
        :param pulumi.Input[str] uuid: BGP peering configuration unique identifier.
        """
        if authentication_key is not None:
            pulumi.set(__self__, "authentication_key", authentication_key)
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if device_id is not None:
            pulumi.set(__self__, "device_id", device_id)
        if local_asn is not None:
            pulumi.set(__self__, "local_asn", local_asn)
        if local_ip_address is not None:
            pulumi.set(__self__, "local_ip_address", local_ip_address)
        if provisioning_status is not None:
            pulumi.set(__self__, "provisioning_status", provisioning_status)
        if remote_asn is not None:
            pulumi.set(__self__, "remote_asn", remote_asn)
        if remote_ip_address is not None:
            pulumi.set(__self__, "remote_ip_address", remote_ip_address)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> Optional[pulumi.Input[str]]:
        """
        shared key used for BGP peer authentication.
        """
        return pulumi.get(self, "authentication_key")

    @authentication_key.setter
    def authentication_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_key", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        identifier of a connection established between. network device and remote service provider that will be used for peering.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[pulumi.Input[str]]:
        """
        unique identifier of a network device that is a local peer in a given BGP peering configuration.
        """
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> Optional[pulumi.Input[int]]:
        """
        Local ASN number.
        """
        return pulumi.get(self, "local_asn")

    @local_asn.setter
    def local_asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "local_asn", value)

    @property
    @pulumi.getter(name="localIpAddress")
    def local_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        IP address in CIDR format of a local device.
        """
        return pulumi.get(self, "local_ip_address")

    @local_ip_address.setter
    def local_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_ip_address", value)

    @property
    @pulumi.getter(name="provisioningStatus")
    def provisioning_status(self) -> Optional[pulumi.Input[str]]:
        """
        BGP peering configuration provisioning status, one of `PROVISIONING`, `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        """
        return pulumi.get(self, "provisioning_status")

    @provisioning_status.setter
    def provisioning_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provisioning_status", value)

    @property
    @pulumi.getter(name="remoteAsn")
    def remote_asn(self) -> Optional[pulumi.Input[int]]:
        """
        Remote ASN number.
        """
        return pulumi.get(self, "remote_asn")

    @remote_asn.setter
    def remote_asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "remote_asn", value)

    @property
    @pulumi.getter(name="remoteIpAddress")
    def remote_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        IP address of remote peer.
        """
        return pulumi.get(self, "remote_ip_address")

    @remote_ip_address.setter
    def remote_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remote_ip_address", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`, `Established`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        BGP peering configuration unique identifier.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class Bgp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 local_ip_address: Optional[pulumi.Input[str]] = None,
                 remote_asn: Optional[pulumi.Input[int]] = None,
                 remote_ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource `networkedge.Bgp` allows creation and management of Equinix Network Edge BGP peering configurations.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.networkedge.Bgp("test",
            connection_id="54014acf-9730-4b55-a791-459283d05fb1",
            local_ip_address="10.1.1.1/30",
            local_asn=12345,
            remote_ip_address="10.1.1.2",
            remote_asn=66123,
            authentication_key="secret")
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/bgp:Bgp example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_key: shared key used for BGP peer authentication.
        :param pulumi.Input[str] connection_id: identifier of a connection established between. network device and remote service provider that will be used for peering.
        :param pulumi.Input[int] local_asn: Local ASN number.
        :param pulumi.Input[str] local_ip_address: IP address in CIDR format of a local device.
        :param pulumi.Input[int] remote_asn: Remote ASN number.
        :param pulumi.Input[str] remote_ip_address: IP address of remote peer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource `networkedge.Bgp` allows creation and management of Equinix Network Edge BGP peering configurations.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        test = equinix.networkedge.Bgp("test",
            connection_id="54014acf-9730-4b55-a791-459283d05fb1",
            local_ip_address="10.1.1.1/30",
            local_asn=12345,
            remote_ip_address="10.1.1.2",
            remote_asn=66123,
            authentication_key="secret")
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/bgp:Bgp example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param BgpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_key: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 local_asn: Optional[pulumi.Input[int]] = None,
                 local_ip_address: Optional[pulumi.Input[str]] = None,
                 remote_asn: Optional[pulumi.Input[int]] = None,
                 remote_ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpArgs.__new__(BgpArgs)

            __props__.__dict__["authentication_key"] = None if authentication_key is None else pulumi.Output.secret(authentication_key)
            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            if local_asn is None and not opts.urn:
                raise TypeError("Missing required property 'local_asn'")
            __props__.__dict__["local_asn"] = local_asn
            if local_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'local_ip_address'")
            __props__.__dict__["local_ip_address"] = local_ip_address
            if remote_asn is None and not opts.urn:
                raise TypeError("Missing required property 'remote_asn'")
            __props__.__dict__["remote_asn"] = remote_asn
            if remote_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'remote_ip_address'")
            __props__.__dict__["remote_ip_address"] = remote_ip_address
            __props__.__dict__["device_id"] = None
            __props__.__dict__["provisioning_status"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uuid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["authenticationKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Bgp, __self__).__init__(
            'equinix:networkedge/bgp:Bgp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_key: Optional[pulumi.Input[str]] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            device_id: Optional[pulumi.Input[str]] = None,
            local_asn: Optional[pulumi.Input[int]] = None,
            local_ip_address: Optional[pulumi.Input[str]] = None,
            provisioning_status: Optional[pulumi.Input[str]] = None,
            remote_asn: Optional[pulumi.Input[int]] = None,
            remote_ip_address: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'Bgp':
        """
        Get an existing Bgp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_key: shared key used for BGP peer authentication.
        :param pulumi.Input[str] connection_id: identifier of a connection established between. network device and remote service provider that will be used for peering.
        :param pulumi.Input[str] device_id: unique identifier of a network device that is a local peer in a given BGP peering configuration.
        :param pulumi.Input[int] local_asn: Local ASN number.
        :param pulumi.Input[str] local_ip_address: IP address in CIDR format of a local device.
        :param pulumi.Input[str] provisioning_status: BGP peering configuration provisioning status, one of `PROVISIONING`, `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        :param pulumi.Input[int] remote_asn: Remote ASN number.
        :param pulumi.Input[str] remote_ip_address: IP address of remote peer.
        :param pulumi.Input[str] state: BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`, `Established`.
        :param pulumi.Input[str] uuid: BGP peering configuration unique identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpState.__new__(_BgpState)

        __props__.__dict__["authentication_key"] = authentication_key
        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["device_id"] = device_id
        __props__.__dict__["local_asn"] = local_asn
        __props__.__dict__["local_ip_address"] = local_ip_address
        __props__.__dict__["provisioning_status"] = provisioning_status
        __props__.__dict__["remote_asn"] = remote_asn
        __props__.__dict__["remote_ip_address"] = remote_ip_address
        __props__.__dict__["state"] = state
        __props__.__dict__["uuid"] = uuid
        return Bgp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticationKey")
    def authentication_key(self) -> pulumi.Output[Optional[str]]:
        """
        shared key used for BGP peer authentication.
        """
        return pulumi.get(self, "authentication_key")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        identifier of a connection established between. network device and remote service provider that will be used for peering.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Output[str]:
        """
        unique identifier of a network device that is a local peer in a given BGP peering configuration.
        """
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter(name="localAsn")
    def local_asn(self) -> pulumi.Output[int]:
        """
        Local ASN number.
        """
        return pulumi.get(self, "local_asn")

    @property
    @pulumi.getter(name="localIpAddress")
    def local_ip_address(self) -> pulumi.Output[str]:
        """
        IP address in CIDR format of a local device.
        """
        return pulumi.get(self, "local_ip_address")

    @property
    @pulumi.getter(name="provisioningStatus")
    def provisioning_status(self) -> pulumi.Output[str]:
        """
        BGP peering configuration provisioning status, one of `PROVISIONING`, `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
        """
        return pulumi.get(self, "provisioning_status")

    @property
    @pulumi.getter(name="remoteAsn")
    def remote_asn(self) -> pulumi.Output[int]:
        """
        Remote ASN number.
        """
        return pulumi.get(self, "remote_asn")

    @property
    @pulumi.getter(name="remoteIpAddress")
    def remote_ip_address(self) -> pulumi.Output[str]:
        """
        IP address of remote peer.
        """
        return pulumi.get(self, "remote_ip_address")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`, `Established`.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        BGP peering configuration unique identifier.
        """
        return pulumi.get(self, "uuid")

