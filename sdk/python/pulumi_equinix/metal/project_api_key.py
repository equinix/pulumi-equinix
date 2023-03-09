# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProjectApiKeyArgs', 'ProjectApiKey']

@pulumi.input_type
class ProjectApiKeyArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 read_only: pulumi.Input[bool]):
        """
        The set of arguments for constructing a ProjectApiKey resource.
        :param pulumi.Input[str] description: Description string for the Project API Key resource.
               * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        :param pulumi.Input[str] project_id: UUID of the project where the API key is scoped to.
        :param pulumi.Input[bool] read_only: Flag indicating whether the API key shoud be read-only
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "read_only", read_only)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description string for the Project API Key resource.
        * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        UUID of the project where the API key is scoped to.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> pulumi.Input[bool]:
        """
        Flag indicating whether the API key shoud be read-only
        """
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: pulumi.Input[bool]):
        pulumi.set(self, "read_only", value)


@pulumi.input_type
class _ProjectApiKeyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectApiKey resources.
        :param pulumi.Input[str] description: Description string for the Project API Key resource.
               * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        :param pulumi.Input[str] project_id: UUID of the project where the API key is scoped to.
        :param pulumi.Input[bool] read_only: Flag indicating whether the API key shoud be read-only
        :param pulumi.Input[str] token: API token which can be used in Equinix Metal API clients
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)
        if token is not None:
            pulumi.set(__self__, "token", token)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description string for the Project API Key resource.
        * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of the project where the API key is scoped to.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag indicating whether the API key shoud be read-only
        """
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        """
        API token which can be used in Equinix Metal API clients
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)


class ProjectApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Use this resource to create Metal Project API Key resources in Equinix Metal. Project API keys can
        be used to create and read resources in a single project. Each API key contains a token which can
        be used for authentication in Equinix Metal HTTP API (in HTTP request header `X-Auth-Token`).

        Read-only keys only allow to list and view existing resources, read-write keys can also be used to
        create resources.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        # Create a new read-only API key in existing project
        test = equinix.metal.ProjectApiKey("test",
            project_id=local["existing_project_id"],
            description="Read-only key scoped to a projct",
            read_only=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description string for the Project API Key resource.
               * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        :param pulumi.Input[str] project_id: UUID of the project where the API key is scoped to.
        :param pulumi.Input[bool] read_only: Flag indicating whether the API key shoud be read-only
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectApiKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create Metal Project API Key resources in Equinix Metal. Project API keys can
        be used to create and read resources in a single project. Each API key contains a token which can
        be used for authentication in Equinix Metal HTTP API (in HTTP request header `X-Auth-Token`).

        Read-only keys only allow to list and view existing resources, read-write keys can also be used to
        create resources.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_equinix as equinix

        # Create a new read-only API key in existing project
        test = equinix.metal.ProjectApiKey("test",
            project_id=local["existing_project_id"],
            description="Read-only key scoped to a projct",
            read_only=True)
        ```

        :param str resource_name: The name of the resource.
        :param ProjectApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectApiKeyArgs.__new__(ProjectApiKeyArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if read_only is None and not opts.urn:
                raise TypeError("Missing required property 'read_only'")
            __props__.__dict__["read_only"] = read_only
            __props__.__dict__["token"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ProjectApiKey, __self__).__init__(
            'equinix:metal/projectApiKey:ProjectApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            read_only: Optional[pulumi.Input[bool]] = None,
            token: Optional[pulumi.Input[str]] = None) -> 'ProjectApiKey':
        """
        Get an existing ProjectApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description string for the Project API Key resource.
               * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        :param pulumi.Input[str] project_id: UUID of the project where the API key is scoped to.
        :param pulumi.Input[bool] read_only: Flag indicating whether the API key shoud be read-only
        :param pulumi.Input[str] token: API token which can be used in Equinix Metal API clients
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectApiKeyState.__new__(_ProjectApiKeyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["read_only"] = read_only
        __props__.__dict__["token"] = token
        return ProjectApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description string for the Project API Key resource.
        * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        UUID of the project where the API key is scoped to.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> pulumi.Output[bool]:
        """
        Flag indicating whether the API key shoud be read-only
        """
        return pulumi.get(self, "read_only")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        API token which can be used in Equinix Metal API clients
        """
        return pulumi.get(self, "token")

