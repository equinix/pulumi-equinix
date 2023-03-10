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

__all__ = [
    'GetConnectionResult',
    'AwaitableGetConnectionResult',
    'get_connection',
    'get_connection_output',
]

@pulumi.output_type
class GetConnectionResult:
    """
    A collection of values returned by getConnection.
    """
    def __init__(__self__, a_sides=None, accounts=None, additional_infos=None, bandwidth=None, change_logs=None, description=None, direction=None, href=None, id=None, is_remote=None, name=None, notifications=None, operations=None, orders=None, projects=None, redundancies=None, state=None, type=None, uuid=None, z_sides=None):
        if a_sides and not isinstance(a_sides, list):
            raise TypeError("Expected argument 'a_sides' to be a list")
        pulumi.set(__self__, "a_sides", a_sides)
        if accounts and not isinstance(accounts, list):
            raise TypeError("Expected argument 'accounts' to be a list")
        pulumi.set(__self__, "accounts", accounts)
        if additional_infos and not isinstance(additional_infos, list):
            raise TypeError("Expected argument 'additional_infos' to be a list")
        pulumi.set(__self__, "additional_infos", additional_infos)
        if bandwidth and not isinstance(bandwidth, int):
            raise TypeError("Expected argument 'bandwidth' to be a int")
        pulumi.set(__self__, "bandwidth", bandwidth)
        if change_logs and not isinstance(change_logs, list):
            raise TypeError("Expected argument 'change_logs' to be a list")
        pulumi.set(__self__, "change_logs", change_logs)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if href and not isinstance(href, str):
            raise TypeError("Expected argument 'href' to be a str")
        pulumi.set(__self__, "href", href)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_remote and not isinstance(is_remote, bool):
            raise TypeError("Expected argument 'is_remote' to be a bool")
        pulumi.set(__self__, "is_remote", is_remote)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if operations and not isinstance(operations, list):
            raise TypeError("Expected argument 'operations' to be a list")
        pulumi.set(__self__, "operations", operations)
        if orders and not isinstance(orders, list):
            raise TypeError("Expected argument 'orders' to be a list")
        pulumi.set(__self__, "orders", orders)
        if projects and not isinstance(projects, list):
            raise TypeError("Expected argument 'projects' to be a list")
        pulumi.set(__self__, "projects", projects)
        if redundancies and not isinstance(redundancies, list):
            raise TypeError("Expected argument 'redundancies' to be a list")
        pulumi.set(__self__, "redundancies", redundancies)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)
        if z_sides and not isinstance(z_sides, list):
            raise TypeError("Expected argument 'z_sides' to be a list")
        pulumi.set(__self__, "z_sides", z_sides)

    @property
    @pulumi.getter(name="aSides")
    def a_sides(self) -> Sequence['outputs.GetConnectionASideResult']:
        """
        Requester or Customer side connection configuration object of the multi-segment connection
        """
        return pulumi.get(self, "a_sides")

    @property
    @pulumi.getter
    def accounts(self) -> Sequence['outputs.GetConnectionAccountResult']:
        """
        Customer account information that is associated with this connection
        """
        return pulumi.get(self, "accounts")

    @property
    @pulumi.getter(name="additionalInfos")
    def additional_infos(self) -> Sequence['outputs.GetConnectionAdditionalInfoResult']:
        """
        Connection additional information
        """
        return pulumi.get(self, "additional_infos")

    @property
    @pulumi.getter
    def bandwidth(self) -> int:
        """
        Connection bandwidth in Mbps
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="changeLogs")
    def change_logs(self) -> Sequence['outputs.GetConnectionChangeLogResult']:
        """
        Captures connection lifecycle change information
        """
        return pulumi.get(self, "change_logs")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Customer-provided connection description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def direction(self) -> str:
        """
        Connection directionality from the requester point of view
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter
    def href(self) -> str:
        """
        Connection URI information
        """
        return pulumi.get(self, "href")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isRemote")
    def is_remote(self) -> bool:
        """
        Connection property derived from access point locations
        """
        return pulumi.get(self, "is_remote")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetConnectionNotificationResult']:
        """
        Preferences for notifications on connection configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def operations(self) -> Sequence['outputs.GetConnectionOperationResult']:
        """
        Connection specific operational data
        """
        return pulumi.get(self, "operations")

    @property
    @pulumi.getter
    def orders(self) -> Sequence['outputs.GetConnectionOrderResult']:
        """
        Order related to this connection information
        """
        return pulumi.get(self, "orders")

    @property
    @pulumi.getter
    def projects(self) -> Optional[Sequence['outputs.GetConnectionProjectResult']]:
        """
        Project information
        """
        return pulumi.get(self, "projects")

    @property
    @pulumi.getter
    def redundancies(self) -> Sequence['outputs.GetConnectionRedundancyResult']:
        """
        Redundancy Information
        """
        return pulumi.get(self, "redundancies")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Connection overall state
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> Optional[str]:
        """
        Equinix-assigned connection identifier
        """
        return pulumi.get(self, "uuid")

    @property
    @pulumi.getter(name="zSides")
    def z_sides(self) -> Sequence['outputs.GetConnectionZSideResult']:
        """
        Destination or Provider side connection configuration object of the multi-segment connection
        """
        return pulumi.get(self, "z_sides")


class AwaitableGetConnectionResult(GetConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectionResult(
            a_sides=self.a_sides,
            accounts=self.accounts,
            additional_infos=self.additional_infos,
            bandwidth=self.bandwidth,
            change_logs=self.change_logs,
            description=self.description,
            direction=self.direction,
            href=self.href,
            id=self.id,
            is_remote=self.is_remote,
            name=self.name,
            notifications=self.notifications,
            operations=self.operations,
            orders=self.orders,
            projects=self.projects,
            redundancies=self.redundancies,
            state=self.state,
            type=self.type,
            uuid=self.uuid,
            z_sides=self.z_sides)


def get_connection(projects: Optional[Sequence[pulumi.InputType['GetConnectionProjectArgs']]] = None,
                   uuid: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectionResult:
    """
    Use this data source to access information about an existing resource.

    :param Sequence[pulumi.InputType['GetConnectionProjectArgs']] projects: Project information
    :param str uuid: Equinix-assigned connection identifier
    """
    __args__ = dict()
    __args__['projects'] = projects
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getConnection:getConnection', __args__, opts=opts, typ=GetConnectionResult).value

    return AwaitableGetConnectionResult(
        a_sides=__ret__.a_sides,
        accounts=__ret__.accounts,
        additional_infos=__ret__.additional_infos,
        bandwidth=__ret__.bandwidth,
        change_logs=__ret__.change_logs,
        description=__ret__.description,
        direction=__ret__.direction,
        href=__ret__.href,
        id=__ret__.id,
        is_remote=__ret__.is_remote,
        name=__ret__.name,
        notifications=__ret__.notifications,
        operations=__ret__.operations,
        orders=__ret__.orders,
        projects=__ret__.projects,
        redundancies=__ret__.redundancies,
        state=__ret__.state,
        type=__ret__.type,
        uuid=__ret__.uuid,
        z_sides=__ret__.z_sides)


@_utilities.lift_output_func(get_connection)
def get_connection_output(projects: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetConnectionProjectArgs']]]]] = None,
                          uuid: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectionResult]:
    """
    Use this data source to access information about an existing resource.

    :param Sequence[pulumi.InputType['GetConnectionProjectArgs']] projects: Project information
    :param str uuid: Equinix-assigned connection identifier
    """
    ...
