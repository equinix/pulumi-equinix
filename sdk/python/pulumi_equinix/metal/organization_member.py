# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OrganizationMemberArgs', 'OrganizationMember']

@pulumi.input_type
class OrganizationMemberArgs:
    def __init__(__self__, *,
                 invitee: pulumi.Input[str],
                 organization_id: pulumi.Input[str],
                 projects_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 message: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OrganizationMember resource.
        :param pulumi.Input[str] invitee: The email address of the user to invite
        :param pulumi.Input[str] organization_id: The organization to invite the user to
        :param pulumi.Input[Sequence[pulumi.Input[str]]] projects_ids: Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Organization roles (admin, collaborator, limited_collaborator, billing)
        :param pulumi.Input[str] message: A message to include in the emailed invitation.
        """
        pulumi.set(__self__, "invitee", invitee)
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "projects_ids", projects_ids)
        pulumi.set(__self__, "roles", roles)
        if message is not None:
            pulumi.set(__self__, "message", message)

    @property
    @pulumi.getter
    def invitee(self) -> pulumi.Input[str]:
        """
        The email address of the user to invite
        """
        return pulumi.get(self, "invitee")

    @invitee.setter
    def invitee(self, value: pulumi.Input[str]):
        pulumi.set(self, "invitee", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        The organization to invite the user to
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="projectsIds")
    def projects_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        """
        return pulumi.get(self, "projects_ids")

    @projects_ids.setter
    def projects_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "projects_ids", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Organization roles (admin, collaborator, limited_collaborator, billing)
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        A message to include in the emailed invitation.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)


@pulumi.input_type
class _OrganizationMemberState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 invited_by: Optional[pulumi.Input[str]] = None,
                 invitee: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 nonce: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 projects_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationMember resources.
        :param pulumi.Input[str] created: When the invitation was created (only known in the invitation stage)
        :param pulumi.Input[str] invited_by: The user_id of the user that sent the invitation (only known in the invitation stage)
        :param pulumi.Input[str] invitee: The email address of the user to invite
        :param pulumi.Input[str] message: A message to include in the emailed invitation.
        :param pulumi.Input[str] nonce: The nonce for the invitation (only known in the invitation stage)
        :param pulumi.Input[str] organization_id: The organization to invite the user to
        :param pulumi.Input[Sequence[pulumi.Input[str]]] projects_ids: Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Organization roles (admin, collaborator, limited_collaborator, billing)
        :param pulumi.Input[str] state: The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
        :param pulumi.Input[str] updated: When the invitation was updated (only known in the invitation stage)
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if invited_by is not None:
            pulumi.set(__self__, "invited_by", invited_by)
        if invitee is not None:
            pulumi.set(__self__, "invitee", invitee)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if nonce is not None:
            pulumi.set(__self__, "nonce", nonce)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if projects_ids is not None:
            pulumi.set(__self__, "projects_ids", projects_ids)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        When the invitation was created (only known in the invitation stage)
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter(name="invitedBy")
    def invited_by(self) -> Optional[pulumi.Input[str]]:
        """
        The user_id of the user that sent the invitation (only known in the invitation stage)
        """
        return pulumi.get(self, "invited_by")

    @invited_by.setter
    def invited_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invited_by", value)

    @property
    @pulumi.getter
    def invitee(self) -> Optional[pulumi.Input[str]]:
        """
        The email address of the user to invite
        """
        return pulumi.get(self, "invitee")

    @invitee.setter
    def invitee(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invitee", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        A message to include in the emailed invitation.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def nonce(self) -> Optional[pulumi.Input[str]]:
        """
        The nonce for the invitation (only known in the invitation stage)
        """
        return pulumi.get(self, "nonce")

    @nonce.setter
    def nonce(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nonce", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The organization to invite the user to
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="projectsIds")
    def projects_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        """
        return pulumi.get(self, "projects_ids")

    @projects_ids.setter
    def projects_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "projects_ids", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Organization roles (admin, collaborator, limited_collaborator, billing)
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        When the invitation was updated (only known in the invitation stage)
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class OrganizationMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 invitee: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 projects_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manage the membership of existing and new invitees within an Equinix Metal organization and its projects.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        organization_id = config.require("organizationId")
        project_id = config.require("projectId")
        user_email_address = config.require("userEmailAddress")
        member = equinix.metal.OrganizationMember("member",
            invitee=user_email_address,
            roles=["limited_collaborator"],
            projects_ids=[project_id],
            organization_id=organization_id)
        pulumi.export("memberId", member.id)
        pulumi.export("memberState", member.state)
        ```

        ## Import

        This resource can be imported using the `invitee` and `organization_id` as colon separated arguments:

        ```sh
        $ pulumi import equinix:metal/organizationMember:OrganizationMember resource_name {invitee}:{organization_id}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] invitee: The email address of the user to invite
        :param pulumi.Input[str] message: A message to include in the emailed invitation.
        :param pulumi.Input[str] organization_id: The organization to invite the user to
        :param pulumi.Input[Sequence[pulumi.Input[str]]] projects_ids: Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Organization roles (admin, collaborator, limited_collaborator, billing)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage the membership of existing and new invitees within an Equinix Metal organization and its projects.

        ## Example Usage
        ```python
        import pulumi
        import pulumi_equinix as equinix

        config = pulumi.Config()
        organization_id = config.require("organizationId")
        project_id = config.require("projectId")
        user_email_address = config.require("userEmailAddress")
        member = equinix.metal.OrganizationMember("member",
            invitee=user_email_address,
            roles=["limited_collaborator"],
            projects_ids=[project_id],
            organization_id=organization_id)
        pulumi.export("memberId", member.id)
        pulumi.export("memberState", member.state)
        ```

        ## Import

        This resource can be imported using the `invitee` and `organization_id` as colon separated arguments:

        ```sh
        $ pulumi import equinix:metal/organizationMember:OrganizationMember resource_name {invitee}:{organization_id}
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 invitee: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 projects_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationMemberArgs.__new__(OrganizationMemberArgs)

            if invitee is None and not opts.urn:
                raise TypeError("Missing required property 'invitee'")
            __props__.__dict__["invitee"] = invitee
            __props__.__dict__["message"] = message
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if projects_ids is None and not opts.urn:
                raise TypeError("Missing required property 'projects_ids'")
            __props__.__dict__["projects_ids"] = projects_ids
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            __props__.__dict__["created"] = None
            __props__.__dict__["invited_by"] = None
            __props__.__dict__["nonce"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["updated"] = None
        super(OrganizationMember, __self__).__init__(
            'equinix:metal/organizationMember:OrganizationMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            invited_by: Optional[pulumi.Input[str]] = None,
            invitee: Optional[pulumi.Input[str]] = None,
            message: Optional[pulumi.Input[str]] = None,
            nonce: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            projects_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            state: Optional[pulumi.Input[str]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'OrganizationMember':
        """
        Get an existing OrganizationMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: When the invitation was created (only known in the invitation stage)
        :param pulumi.Input[str] invited_by: The user_id of the user that sent the invitation (only known in the invitation stage)
        :param pulumi.Input[str] invitee: The email address of the user to invite
        :param pulumi.Input[str] message: A message to include in the emailed invitation.
        :param pulumi.Input[str] nonce: The nonce for the invitation (only known in the invitation stage)
        :param pulumi.Input[str] organization_id: The organization to invite the user to
        :param pulumi.Input[Sequence[pulumi.Input[str]]] projects_ids: Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Organization roles (admin, collaborator, limited_collaborator, billing)
        :param pulumi.Input[str] state: The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
        :param pulumi.Input[str] updated: When the invitation was updated (only known in the invitation stage)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationMemberState.__new__(_OrganizationMemberState)

        __props__.__dict__["created"] = created
        __props__.__dict__["invited_by"] = invited_by
        __props__.__dict__["invitee"] = invitee
        __props__.__dict__["message"] = message
        __props__.__dict__["nonce"] = nonce
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["projects_ids"] = projects_ids
        __props__.__dict__["roles"] = roles
        __props__.__dict__["state"] = state
        __props__.__dict__["updated"] = updated
        return OrganizationMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        When the invitation was created (only known in the invitation stage)
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="invitedBy")
    def invited_by(self) -> pulumi.Output[str]:
        """
        The user_id of the user that sent the invitation (only known in the invitation stage)
        """
        return pulumi.get(self, "invited_by")

    @property
    @pulumi.getter
    def invitee(self) -> pulumi.Output[str]:
        """
        The email address of the user to invite
        """
        return pulumi.get(self, "invitee")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[Optional[str]]:
        """
        A message to include in the emailed invitation.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def nonce(self) -> pulumi.Output[str]:
        """
        The nonce for the invitation (only known in the invitation stage)
        """
        return pulumi.get(self, "nonce")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The organization to invite the user to
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="projectsIds")
    def projects_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        Project IDs the member has access to within the organization. If the member is an 'admin', the projects list should be empty.
        """
        return pulumi.get(self, "projects_ids")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        Organization roles (admin, collaborator, limited_collaborator, billing)
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the membership ('invited' when an invitation is open, 'active' when the user is an organization member)
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        When the invitation was updated (only known in the invitation stage)
        """
        return pulumi.get(self, "updated")

