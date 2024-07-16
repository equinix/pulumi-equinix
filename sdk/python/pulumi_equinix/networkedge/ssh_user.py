# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SshUserArgs', 'SshUser']

@pulumi.input_type
class SshUserArgs:
    def __init__(__self__, *,
                 device_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 password: pulumi.Input[str],
                 username: pulumi.Input[str]):
        """
        The set of arguments for constructing a SshUser resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] device_ids: list of device identifiers to which user will have access.
        :param pulumi.Input[str] password: SSH user password.
        :param pulumi.Input[str] username: SSH user login name.
        """
        pulumi.set(__self__, "device_ids", device_ids)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="deviceIds")
    def device_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        list of device identifiers to which user will have access.
        """
        return pulumi.get(self, "device_ids")

    @device_ids.setter
    def device_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "device_ids", value)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        SSH user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        SSH user login name.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class _SshUserState:
    def __init__(__self__, *,
                 device_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SshUser resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] device_ids: list of device identifiers to which user will have access.
        :param pulumi.Input[str] password: SSH user password.
        :param pulumi.Input[str] username: SSH user login name.
        :param pulumi.Input[str] uuid: SSH user unique identifier.
        """
        if device_ids is not None:
            pulumi.set(__self__, "device_ids", device_ids)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="deviceIds")
    def device_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        list of device identifiers to which user will have access.
        """
        return pulumi.get(self, "device_ids")

    @device_ids.setter
    def device_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "device_ids", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        SSH user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        SSH user login name.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        SSH user unique identifier.
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class SshUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource `networkedge.SshUser` allows creation and management of Equinix Network Edge SSH users.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        john = equinix.networkedge.SshUser("john",
            username="john",
            password="secret",
            device_ids=[
                "csr1000v-ha-uuid",
                "csr1000v-ha-redundant-uuid",
            ])
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] device_ids: list of device identifiers to which user will have access.
        :param pulumi.Input[str] password: SSH user password.
        :param pulumi.Input[str] username: SSH user login name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SshUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource `networkedge.SshUser` allows creation and management of Equinix Network Edge SSH users.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        john = equinix.networkedge.SshUser("john",
            username="john",
            password="secret",
            device_ids=[
                "csr1000v-ha-uuid",
                "csr1000v-ha-redundant-uuid",
            ])
        ```

        ## Import

        This resource can be imported using an existing ID:

        ```sh
        $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id}
        ```

        :param str resource_name: The name of the resource.
        :param SshUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SshUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SshUserArgs.__new__(SshUserArgs)

            if device_ids is None and not opts.urn:
                raise TypeError("Missing required property 'device_ids'")
            __props__.__dict__["device_ids"] = device_ids
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["uuid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SshUser, __self__).__init__(
            'equinix:networkedge/sshUser:SshUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            password: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'SshUser':
        """
        Get an existing SshUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] device_ids: list of device identifiers to which user will have access.
        :param pulumi.Input[str] password: SSH user password.
        :param pulumi.Input[str] username: SSH user login name.
        :param pulumi.Input[str] uuid: SSH user unique identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SshUserState.__new__(_SshUserState)

        __props__.__dict__["device_ids"] = device_ids
        __props__.__dict__["password"] = password
        __props__.__dict__["username"] = username
        __props__.__dict__["uuid"] = uuid
        return SshUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deviceIds")
    def device_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        list of device identifiers to which user will have access.
        """
        return pulumi.get(self, "device_ids")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        SSH user password.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        SSH user login name.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        SSH user unique identifier.
        """
        return pulumi.get(self, "uuid")

