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

__all__ = ['ProjectArgs', 'Project']

@pulumi.input_type
class ProjectArgs:
    def __init__(__self__, *,
                 backend_transfer: Optional[pulumi.Input[bool]] = None,
                 bgp_config: Optional[pulumi.Input['ProjectBgpConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 payment_method_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Project resource.
        :param pulumi.Input[bool] backend_transfer: Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        :param pulumi.Input['ProjectBgpConfigArgs'] bgp_config: Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
               
               > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
               the Equinix Metal API). It can be updated.
        :param pulumi.Input[str] name: The name of the project.  The maximum length is 80 characters
        :param pulumi.Input[str] organization_id: The UUID of organization under which you want to create the project. If you
               leave it out, the project will be created under your the default organization of your account.
        :param pulumi.Input[str] payment_method_id: The UUID of payment method for this project. The payment method and the
               project need to belong to the same organization (passed with `organization_id`, or default).
        """
        if backend_transfer is not None:
            pulumi.set(__self__, "backend_transfer", backend_transfer)
        if bgp_config is not None:
            pulumi.set(__self__, "bgp_config", bgp_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if payment_method_id is not None:
            pulumi.set(__self__, "payment_method_id", payment_method_id)

    @property
    @pulumi.getter(name="backendTransfer")
    def backend_transfer(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        """
        return pulumi.get(self, "backend_transfer")

    @backend_transfer.setter
    def backend_transfer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "backend_transfer", value)

    @property
    @pulumi.getter(name="bgpConfig")
    def bgp_config(self) -> Optional[pulumi.Input['ProjectBgpConfigArgs']]:
        """
        Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).

        > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
        the Equinix Metal API). It can be updated.
        """
        return pulumi.get(self, "bgp_config")

    @bgp_config.setter
    def bgp_config(self, value: Optional[pulumi.Input['ProjectBgpConfigArgs']]):
        pulumi.set(self, "bgp_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the project.  The maximum length is 80 characters
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of organization under which you want to create the project. If you
        leave it out, the project will be created under your the default organization of your account.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="paymentMethodId")
    def payment_method_id(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of payment method for this project. The payment method and the
        project need to belong to the same organization (passed with `organization_id`, or default).
        """
        return pulumi.get(self, "payment_method_id")

    @payment_method_id.setter
    def payment_method_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payment_method_id", value)


@pulumi.input_type
class _ProjectState:
    def __init__(__self__, *,
                 backend_transfer: Optional[pulumi.Input[bool]] = None,
                 bgp_config: Optional[pulumi.Input['ProjectBgpConfigArgs']] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 payment_method_id: Optional[pulumi.Input[str]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Project resources.
        :param pulumi.Input[bool] backend_transfer: Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        :param pulumi.Input['ProjectBgpConfigArgs'] bgp_config: Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
               
               > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
               the Equinix Metal API). It can be updated.
        :param pulumi.Input[str] created: The timestamp for when the project was created.
        :param pulumi.Input[str] name: The name of the project.  The maximum length is 80 characters
        :param pulumi.Input[str] organization_id: The UUID of organization under which you want to create the project. If you
               leave it out, the project will be created under your the default organization of your account.
        :param pulumi.Input[str] payment_method_id: The UUID of payment method for this project. The payment method and the
               project need to belong to the same organization (passed with `organization_id`, or default).
        :param pulumi.Input[str] updated: The timestamp for the last time the project was updated.
        """
        if backend_transfer is not None:
            pulumi.set(__self__, "backend_transfer", backend_transfer)
        if bgp_config is not None:
            pulumi.set(__self__, "bgp_config", bgp_config)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if payment_method_id is not None:
            pulumi.set(__self__, "payment_method_id", payment_method_id)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="backendTransfer")
    def backend_transfer(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        """
        return pulumi.get(self, "backend_transfer")

    @backend_transfer.setter
    def backend_transfer(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "backend_transfer", value)

    @property
    @pulumi.getter(name="bgpConfig")
    def bgp_config(self) -> Optional[pulumi.Input['ProjectBgpConfigArgs']]:
        """
        Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).

        > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
        the Equinix Metal API). It can be updated.
        """
        return pulumi.get(self, "bgp_config")

    @bgp_config.setter
    def bgp_config(self, value: Optional[pulumi.Input['ProjectBgpConfigArgs']]):
        pulumi.set(self, "bgp_config", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for when the project was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the project.  The maximum length is 80 characters
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of organization under which you want to create the project. If you
        leave it out, the project will be created under your the default organization of your account.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="paymentMethodId")
    def payment_method_id(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of payment method for this project. The payment method and the
        project need to belong to the same organization (passed with `organization_id`, or default).
        """
        return pulumi.get(self, "payment_method_id")

    @payment_method_id.setter
    def payment_method_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payment_method_id", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp for the last time the project was updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class Project(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_transfer: Optional[pulumi.Input[bool]] = None,
                 bgp_config: Optional[pulumi.Input[pulumi.InputType['ProjectBgpConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 payment_method_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Equinix Metal project resource to allow you manage devices
        in your projects.

        > **NOTE:** Keep in mind that Equinix Metal invoicing is per project, so creating many
        `metal.Project` resources will affect the rendered invoice. If you want to keep your
        Equinix Metal bill simple and easy to review, please re-use your existing projects.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        organization_id = config.require("organizationId")
        name = config.get("name")
        if name is None:
            name = "Default Project"
        project_resource = equinix.metal.Project("project",
            name=name,
            organization_id=organization_id)
        pulumi.export("projectId", project_resource.id)
        ```

        ## Import

        This resource can be imported using an existing project ID:

        ```sh
        $ pulumi import equinix:metal/project:Project equinix_metal_project {existing_project_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] backend_transfer: Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        :param pulumi.Input[pulumi.InputType['ProjectBgpConfigArgs']] bgp_config: Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
               
               > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
               the Equinix Metal API). It can be updated.
        :param pulumi.Input[str] name: The name of the project.  The maximum length is 80 characters
        :param pulumi.Input[str] organization_id: The UUID of organization under which you want to create the project. If you
               leave it out, the project will be created under your the default organization of your account.
        :param pulumi.Input[str] payment_method_id: The UUID of payment method for this project. The payment method and the
               project need to belong to the same organization (passed with `organization_id`, or default).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProjectArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Equinix Metal project resource to allow you manage devices
        in your projects.

        > **NOTE:** Keep in mind that Equinix Metal invoicing is per project, so creating many
        `metal.Project` resources will affect the rendered invoice. If you want to keep your
        Equinix Metal bill simple and easy to review, please re-use your existing projects.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        organization_id = config.require("organizationId")
        name = config.get("name")
        if name is None:
            name = "Default Project"
        project_resource = equinix.metal.Project("project",
            name=name,
            organization_id=organization_id)
        pulumi.export("projectId", project_resource.id)
        ```

        ## Import

        This resource can be imported using an existing project ID:

        ```sh
        $ pulumi import equinix:metal/project:Project equinix_metal_project {existing_project_id}
        ```

        :param str resource_name: The name of the resource.
        :param ProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_transfer: Optional[pulumi.Input[bool]] = None,
                 bgp_config: Optional[pulumi.Input[pulumi.InputType['ProjectBgpConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 payment_method_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectArgs.__new__(ProjectArgs)

            __props__.__dict__["backend_transfer"] = backend_transfer
            __props__.__dict__["bgp_config"] = bgp_config
            __props__.__dict__["name"] = name
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["payment_method_id"] = payment_method_id
            __props__.__dict__["created"] = None
            __props__.__dict__["updated"] = None
        super(Project, __self__).__init__(
            'equinix:metal/project:Project',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend_transfer: Optional[pulumi.Input[bool]] = None,
            bgp_config: Optional[pulumi.Input[pulumi.InputType['ProjectBgpConfigArgs']]] = None,
            created: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            payment_method_id: Optional[pulumi.Input[str]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'Project':
        """
        Get an existing Project resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] backend_transfer: Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        :param pulumi.Input[pulumi.InputType['ProjectBgpConfigArgs']] bgp_config: Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
               
               > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
               the Equinix Metal API). It can be updated.
        :param pulumi.Input[str] created: The timestamp for when the project was created.
        :param pulumi.Input[str] name: The name of the project.  The maximum length is 80 characters
        :param pulumi.Input[str] organization_id: The UUID of organization under which you want to create the project. If you
               leave it out, the project will be created under your the default organization of your account.
        :param pulumi.Input[str] payment_method_id: The UUID of payment method for this project. The payment method and the
               project need to belong to the same organization (passed with `organization_id`, or default).
        :param pulumi.Input[str] updated: The timestamp for the last time the project was updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectState.__new__(_ProjectState)

        __props__.__dict__["backend_transfer"] = backend_transfer
        __props__.__dict__["bgp_config"] = bgp_config
        __props__.__dict__["created"] = created
        __props__.__dict__["name"] = name
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["payment_method_id"] = payment_method_id
        __props__.__dict__["updated"] = updated
        return Project(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backendTransfer")
    def backend_transfer(self) -> pulumi.Output[bool]:
        """
        Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
        """
        return pulumi.get(self, "backend_transfer")

    @property
    @pulumi.getter(name="bgpConfig")
    def bgp_config(self) -> pulumi.Output[Optional['outputs.ProjectBgpConfig']]:
        """
        Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).

        > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
        the Equinix Metal API). It can be updated.
        """
        return pulumi.get(self, "bgp_config")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The timestamp for when the project was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the project.  The maximum length is 80 characters
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The UUID of organization under which you want to create the project. If you
        leave it out, the project will be created under your the default organization of your account.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="paymentMethodId")
    def payment_method_id(self) -> pulumi.Output[str]:
        """
        The UUID of payment method for this project. The payment method and the
        project need to belong to the same organization (passed with `organization_id`, or default).
        """
        return pulumi.get(self, "payment_method_id")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        The timestamp for the last time the project was updated.
        """
        return pulumi.get(self, "updated")

