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
    'GetAccountResult',
    'AwaitableGetAccountResult',
    'get_account',
    'get_account_output',
]

@pulumi.output_type
class GetAccountResult:
    """
    A collection of values returned by getAccount.
    """
    def __init__(__self__, id=None, metro_code=None, name=None, number=None, project_id=None, status=None, ucm_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metro_code and not isinstance(metro_code, str):
            raise TypeError("Expected argument 'metro_code' to be a str")
        pulumi.set(__self__, "metro_code", metro_code)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if number and not isinstance(number, str):
            raise TypeError("Expected argument 'number' to be a str")
        pulumi.set(__self__, "number", number)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if ucm_id and not isinstance(ucm_id, str):
            raise TypeError("Expected argument 'ucm_id' to be a str")
        pulumi.set(__self__, "ucm_id", ucm_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> str:
        return pulumi.get(self, "metro_code")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def number(self) -> str:
        """
        Account unique number.
        """
        return pulumi.get(self, "number")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="ucmId")
    def ucm_id(self) -> str:
        """
        Account unique identifier.
        """
        return pulumi.get(self, "ucm_id")


class AwaitableGetAccountResult(GetAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountResult(
            id=self.id,
            metro_code=self.metro_code,
            name=self.name,
            number=self.number,
            project_id=self.project_id,
            status=self.status,
            ucm_id=self.ucm_id)


def get_account(metro_code: Optional[str] = None,
                name: Optional[str] = None,
                project_id: Optional[str] = None,
                status: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountResult:
    """
    Use this data source to get number and identifier of Equinix Network Edge billing account in a given metro location.

    Billing account reference is required to create Network Edge virtual device in corresponding metro location.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    dc = equinix.networkedge.get_account(metro_code="DC",
        status="Active",
        project_id="a86d7112-d740-4758-9c9c-31e66373746b")
    pulumi.export("number", dc.number)
    ```


    :param str metro_code: Account location metro code.
    :param str name: Account name for filtering.
    :param str project_id: Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
    :param str status: Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
    """
    __args__ = dict()
    __args__['metroCode'] = metro_code
    __args__['name'] = name
    __args__['projectId'] = project_id
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:networkedge/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult).value

    return AwaitableGetAccountResult(
        id=pulumi.get(__ret__, 'id'),
        metro_code=pulumi.get(__ret__, 'metro_code'),
        name=pulumi.get(__ret__, 'name'),
        number=pulumi.get(__ret__, 'number'),
        project_id=pulumi.get(__ret__, 'project_id'),
        status=pulumi.get(__ret__, 'status'),
        ucm_id=pulumi.get(__ret__, 'ucm_id'))


@_utilities.lift_output_func(get_account)
def get_account_output(metro_code: Optional[pulumi.Input[str]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       project_id: Optional[pulumi.Input[Optional[str]]] = None,
                       status: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountResult]:
    """
    Use this data source to get number and identifier of Equinix Network Edge billing account in a given metro location.

    Billing account reference is required to create Network Edge virtual device in corresponding metro location.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    dc = equinix.networkedge.get_account(metro_code="DC",
        status="Active",
        project_id="a86d7112-d740-4758-9c9c-31e66373746b")
    pulumi.export("number", dc.number)
    ```


    :param str metro_code: Account location metro code.
    :param str name: Account name for filtering.
    :param str project_id: Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
    :param str status: Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
    """
    ...
