# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetProjectSshKeyResult',
    'AwaitableGetProjectSshKeyResult',
    'get_project_ssh_key',
    'get_project_ssh_key_output',
]

@pulumi.output_type
class GetProjectSshKeyResult:
    """
    A collection of values returned by getProjectSshKey.
    """
    def __init__(__self__, created=None, fingerprint=None, id=None, name=None, owner_id=None, project_id=None, public_key=None, search=None, updated=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if fingerprint and not isinstance(fingerprint, str):
            raise TypeError("Expected argument 'fingerprint' to be a str")
        pulumi.set(__self__, "fingerprint", fingerprint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if public_key and not isinstance(public_key, str):
            raise TypeError("Expected argument 'public_key' to be a str")
        pulumi.set(__self__, "public_key", public_key)
        if search and not isinstance(search, str):
            raise TypeError("Expected argument 'search' to be a str")
        pulumi.set(__self__, "search", search)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The timestamp for when the SSH key was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        """
        The fingerprint of the SSH key.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of the key.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the SSH key.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        The ID of parent project (same as project_id).
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        The ID of parent project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> str:
        """
        The text of the public key.
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter
    def search(self) -> Optional[str]:
        return pulumi.get(self, "search")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        The timestamp for the last time the SSH key was updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetProjectSshKeyResult(GetProjectSshKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectSshKeyResult(
            created=self.created,
            fingerprint=self.fingerprint,
            id=self.id,
            name=self.name,
            owner_id=self.owner_id,
            project_id=self.project_id,
            public_key=self.public_key,
            search=self.search,
            updated=self.updated)


def get_project_ssh_key(id: Optional[str] = None,
                        project_id: Optional[str] = None,
                        search: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectSshKeyResult:
    """
    Use this datasource to retrieve attributes of a Project SSH Key API resource.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    my_key = equinix.metal.get_project_ssh_key(search="username@hostname",
        project_id=local["project_id"])
    ```
    <!--End PulumiCodeChooser -->


    :param str id: The id of the SSH Key to search for in the Equinix Metal project.
    :param str project_id: The Equinix Metal project id of the Equinix Metal SSH Key.
           
           > **NOTE:** One of either `search` or `id` must be provided along with `project_id`.
    :param str search: The name, fingerprint, or public_key of the SSH Key to search for
           in the Equinix Metal project.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['projectId'] = project_id
    __args__['search'] = search
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getProjectSshKey:getProjectSshKey', __args__, opts=opts, typ=GetProjectSshKeyResult).value

    return AwaitableGetProjectSshKeyResult(
        created=pulumi.get(__ret__, 'created'),
        fingerprint=pulumi.get(__ret__, 'fingerprint'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        public_key=pulumi.get(__ret__, 'public_key'),
        search=pulumi.get(__ret__, 'search'),
        updated=pulumi.get(__ret__, 'updated'))


@_utilities.lift_output_func(get_project_ssh_key)
def get_project_ssh_key_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                               project_id: Optional[pulumi.Input[str]] = None,
                               search: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectSshKeyResult]:
    """
    Use this datasource to retrieve attributes of a Project SSH Key API resource.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    my_key = equinix.metal.get_project_ssh_key(search="username@hostname",
        project_id=local["project_id"])
    ```
    <!--End PulumiCodeChooser -->


    :param str id: The id of the SSH Key to search for in the Equinix Metal project.
    :param str project_id: The Equinix Metal project id of the Equinix Metal SSH Key.
           
           > **NOTE:** One of either `search` or `id` must be provided along with `project_id`.
    :param str search: The name, fingerprint, or public_key of the SSH Key to search for
           in the Equinix Metal project.
    """
    ...
