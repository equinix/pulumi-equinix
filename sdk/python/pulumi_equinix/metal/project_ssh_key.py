# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProjectSshKeyArgs', 'ProjectSshKey']

@pulumi.input_type
class ProjectSshKeyArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 public_key: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ProjectSshKey resource.
        :param pulumi.Input[str] project_id: The ID of parent project.
        :param pulumi.Input[str] public_key: The public key. If this is a file, it can be read using the file interpolation function.
        :param pulumi.Input[str] name: The name of the SSH key for identification.
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "public_key", public_key)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The ID of parent project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Input[str]:
        """
        The public key. If this is a file, it can be read using the file interpolation function.
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SSH key for identification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ProjectSshKeyState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 fingerprint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectSshKey resources.
        :param pulumi.Input[str] created: The timestamp for when the SSH key was created.
        :param pulumi.Input[str] fingerprint: The fingerprint of the SSH key.
        :param pulumi.Input[str] name: The name of the SSH key for identification.
        :param pulumi.Input[str] owner_id: The ID of parent project (same as project_id).
        :param pulumi.Input[str] project_id: The ID of parent project.
        :param pulumi.Input[str] public_key: The public key. If this is a file, it can be read using the file interpolation function.
        :param pulumi.Input[str] updated: The timestamp for the last time the SSH key was updated.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if public_key is not None:
            pulumi.set(__self__, "public_key", public_key)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for when the SSH key was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        The fingerprint of the SSH key.
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fingerprint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SSH key for identification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of parent project (same as project_id).
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of parent project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        """
        The public key. If this is a file, it can be read using the file interpolation function.
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for the last time the SSH key was updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class ProjectSshKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Equinix Metal project SSH key resource to manage project-specific SSH keys.
        Project SSH keys will only be populated onto servers that belong to that project, in contrast to
        User SSH Keys.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        ssh_key = equinix.metal.ProjectSshKey("sshKey",
            project_id=project_id,
            name="johnKent",
            public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
        pulumi.export("sshKeyId", ssh_key.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the SSH key for identification.
        :param pulumi.Input[str] project_id: The ID of parent project.
        :param pulumi.Input[str] public_key: The public key. If this is a file, it can be read using the file interpolation function.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectSshKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Equinix Metal project SSH key resource to manage project-specific SSH keys.
        Project SSH keys will only be populated onto servers that belong to that project, in contrast to
        User SSH Keys.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        project_id = config.require("projectId")
        ssh_key = equinix.metal.ProjectSshKey("sshKey",
            project_id=project_id,
            name="johnKent",
            public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
        pulumi.export("sshKeyId", ssh_key.id)
        ```

        :param str resource_name: The name of the resource.
        :param ProjectSshKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectSshKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectSshKeyArgs.__new__(ProjectSshKeyArgs)

            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if public_key is None and not opts.urn:
                raise TypeError("Missing required property 'public_key'")
            __props__.__dict__["public_key"] = public_key
            __props__.__dict__["created"] = None
            __props__.__dict__["fingerprint"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["updated"] = None
        super(ProjectSshKey, __self__).__init__(
            'equinix:metal/projectSshKey:ProjectSshKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            fingerprint: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'ProjectSshKey':
        """
        Get an existing ProjectSshKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: The timestamp for when the SSH key was created.
        :param pulumi.Input[str] fingerprint: The fingerprint of the SSH key.
        :param pulumi.Input[str] name: The name of the SSH key for identification.
        :param pulumi.Input[str] owner_id: The ID of parent project (same as project_id).
        :param pulumi.Input[str] project_id: The ID of parent project.
        :param pulumi.Input[str] public_key: The public key. If this is a file, it can be read using the file interpolation function.
        :param pulumi.Input[str] updated: The timestamp for the last time the SSH key was updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectSshKeyState.__new__(_ProjectSshKeyState)

        __props__.__dict__["created"] = created
        __props__.__dict__["fingerprint"] = fingerprint
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["public_key"] = public_key
        __props__.__dict__["updated"] = updated
        return ProjectSshKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The timestamp for when the SSH key was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[str]:
        """
        The fingerprint of the SSH key.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the SSH key for identification.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of parent project (same as project_id).
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The ID of parent project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        """
        The public key. If this is a file, it can be read using the file interpolation function.
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        The timestamp for the last time the SSH key was updated.
        """
        return pulumi.get(self, "updated")

