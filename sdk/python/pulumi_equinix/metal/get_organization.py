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

__all__ = [
    'GetOrganizationResult',
    'AwaitableGetOrganizationResult',
    'get_organization',
    'get_organization_output',
]

@pulumi.output_type
class GetOrganizationResult:
    """
    A collection of values returned by getOrganization.
    """
    def __init__(__self__, address=None, description=None, id=None, logo=None, name=None, organization_id=None, project_ids=None, twitter=None, website=None):
        if address and not isinstance(address, dict):
            raise TypeError("Expected argument 'address' to be a dict")
        pulumi.set(__self__, "address", address)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logo and not isinstance(logo, str):
            raise TypeError("Expected argument 'logo' to be a str")
        pulumi.set(__self__, "logo", logo)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if project_ids and not isinstance(project_ids, list):
            raise TypeError("Expected argument 'project_ids' to be a list")
        pulumi.set(__self__, "project_ids", project_ids)
        if twitter and not isinstance(twitter, str):
            raise TypeError("Expected argument 'twitter' to be a str")
        pulumi.set(__self__, "twitter", twitter)
        if website and not isinstance(website, str):
            raise TypeError("Expected argument 'website' to be a str")
        pulumi.set(__self__, "website", website)

    @property
    @pulumi.getter
    def address(self) -> 'outputs.GetOrganizationAddressResult':
        """
        Postal address.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description string.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Empty string is the only valid value. Support for this field has been removed from the API""")
    def logo(self) -> str:
        """
        (Deprecated) Logo URL.
        """
        return pulumi.get(self, "logo")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="projectIds")
    def project_ids(self) -> Sequence[str]:
        """
        UUIDs of project resources which belong to this organization.
        """
        return pulumi.get(self, "project_ids")

    @property
    @pulumi.getter
    def twitter(self) -> str:
        """
        Twitter handle.
        """
        return pulumi.get(self, "twitter")

    @property
    @pulumi.getter
    def website(self) -> str:
        """
        Website link.
        """
        return pulumi.get(self, "website")


class AwaitableGetOrganizationResult(GetOrganizationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationResult(
            address=self.address,
            description=self.description,
            id=self.id,
            logo=self.logo,
            name=self.name,
            organization_id=self.organization_id,
            project_ids=self.project_ids,
            twitter=self.twitter,
            website=self.website)


def get_organization(description: Optional[str] = None,
                     name: Optional[str] = None,
                     organization_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationResult:
    """
    Provides an Equinix Metal organization datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    test = equinix.metal.get_organization(organization_id=local["org_id"])
    pulumi.export("projectsInTheOrg", test.project_ids)
    ```


    :param str description: Description string.
    :param str name: The organization name.
    :param str organization_id: The UUID of the organization resource.
           
           Exactly one of `name` or `organization_id` must be given.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getOrganization:getOrganization', __args__, opts=opts, typ=GetOrganizationResult).value

    return AwaitableGetOrganizationResult(
        address=pulumi.get(__ret__, 'address'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        logo=pulumi.get(__ret__, 'logo'),
        name=pulumi.get(__ret__, 'name'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        project_ids=pulumi.get(__ret__, 'project_ids'),
        twitter=pulumi.get(__ret__, 'twitter'),
        website=pulumi.get(__ret__, 'website'))
def get_organization_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                            name: Optional[pulumi.Input[Optional[str]]] = None,
                            organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetOrganizationResult]:
    """
    Provides an Equinix Metal organization datasource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    test = equinix.metal.get_organization(organization_id=local["org_id"])
    pulumi.export("projectsInTheOrg", test.project_ids)
    ```


    :param str description: Description string.
    :param str name: The organization name.
    :param str organization_id: The UUID of the organization resource.
           
           Exactly one of `name` or `organization_id` must be given.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:metal/getOrganization:getOrganization', __args__, opts=opts, typ=GetOrganizationResult)
    return __ret__.apply(lambda __response__: GetOrganizationResult(
        address=pulumi.get(__response__, 'address'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        logo=pulumi.get(__response__, 'logo'),
        name=pulumi.get(__response__, 'name'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        project_ids=pulumi.get(__response__, 'project_ids'),
        twitter=pulumi.get(__response__, 'twitter'),
        website=pulumi.get(__response__, 'website')))
