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
    'GetNetworkResult',
    'AwaitableGetNetworkResult',
    'get_network',
    'get_network_output',
]

@pulumi.output_type
class GetNetworkResult:
    """
    A collection of values returned by getNetwork.
    """
    def __init__(__self__, change=None, change_log=None, connections_count=None, href=None, id=None, locations=None, name=None, notifications=None, operation=None, project=None, scope=None, state=None, type=None, uuid=None):
        if change and not isinstance(change, dict):
            raise TypeError("Expected argument 'change' to be a dict")
        pulumi.set(__self__, "change", change)
        if change_log and not isinstance(change_log, dict):
            raise TypeError("Expected argument 'change_log' to be a dict")
        pulumi.set(__self__, "change_log", change_log)
        if connections_count and not isinstance(connections_count, int):
            raise TypeError("Expected argument 'connections_count' to be a int")
        pulumi.set(__self__, "connections_count", connections_count)
        if href and not isinstance(href, str):
            raise TypeError("Expected argument 'href' to be a str")
        pulumi.set(__self__, "href", href)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if locations and not isinstance(locations, list):
            raise TypeError("Expected argument 'locations' to be a list")
        pulumi.set(__self__, "locations", locations)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if operation and not isinstance(operation, dict):
            raise TypeError("Expected argument 'operation' to be a dict")
        pulumi.set(__self__, "operation", operation)
        if project and not isinstance(project, dict):
            raise TypeError("Expected argument 'project' to be a dict")
        pulumi.set(__self__, "project", project)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def change(self) -> 'outputs.GetNetworkChangeResult':
        """
        Information on asset change operation
        """
        return pulumi.get(self, "change")

    @property
    @pulumi.getter(name="changeLog")
    def change_log(self) -> 'outputs.GetNetworkChangeLogResult':
        """
        A permanent record of asset creation, modification, or deletion
        """
        return pulumi.get(self, "change_log")

    @property
    @pulumi.getter(name="connectionsCount")
    def connections_count(self) -> int:
        """
        Number of connections associated with this network
        """
        return pulumi.get(self, "connections_count")

    @property
    @pulumi.getter
    def href(self) -> str:
        """
        Fabric Network URI information
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
    @pulumi.getter
    def locations(self) -> Sequence['outputs.GetNetworkLocationResult']:
        """
        Fabric Network location
        """
        return pulumi.get(self, "locations")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetNetworkNotificationResult']:
        """
        Preferences for notifications on Fabric Network configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def operation(self) -> 'outputs.GetNetworkOperationResult':
        """
        Network operation information that is associated with this Fabric Network
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter
    def project(self) -> 'outputs.GetNetworkProjectResult':
        """
        Fabric Network project
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def scope(self) -> str:
        """
        Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Fabric Network overall state
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        Equinix-assigned network identifier
        """
        return pulumi.get(self, "uuid")


class AwaitableGetNetworkResult(GetNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkResult(
            change=self.change,
            change_log=self.change_log,
            connections_count=self.connections_count,
            href=self.href,
            id=self.id,
            locations=self.locations,
            name=self.name,
            notifications=self.notifications,
            operation=self.operation,
            project=self.project,
            scope=self.scope,
            state=self.state,
            type=self.type,
            uuid=self.uuid)


def get_network(uuid: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    network_data_name = equinix.fabric.get_network(uuid="<uuid_of_network>")
    pulumi.export("id", network_data_name.id)
    pulumi.export("name", network_data_name.name)
    pulumi.export("scope", network_data_name.scope)
    pulumi.export("type", network_data_name.type)
    pulumi.export("region", [location.region for location in network_data_name.locations])
    ```


    :param str uuid: Equinix-assigned network identifier
    """
    __args__ = dict()
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getNetwork:getNetwork', __args__, opts=opts, typ=GetNetworkResult).value

    return AwaitableGetNetworkResult(
        change=pulumi.get(__ret__, 'change'),
        change_log=pulumi.get(__ret__, 'change_log'),
        connections_count=pulumi.get(__ret__, 'connections_count'),
        href=pulumi.get(__ret__, 'href'),
        id=pulumi.get(__ret__, 'id'),
        locations=pulumi.get(__ret__, 'locations'),
        name=pulumi.get(__ret__, 'name'),
        notifications=pulumi.get(__ret__, 'notifications'),
        operation=pulumi.get(__ret__, 'operation'),
        project=pulumi.get(__ret__, 'project'),
        scope=pulumi.get(__ret__, 'scope'),
        state=pulumi.get(__ret__, 'state'),
        type=pulumi.get(__ret__, 'type'),
        uuid=pulumi.get(__ret__, 'uuid'))
def get_network_output(uuid: Optional[pulumi.Input[str]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    network_data_name = equinix.fabric.get_network(uuid="<uuid_of_network>")
    pulumi.export("id", network_data_name.id)
    pulumi.export("name", network_data_name.name)
    pulumi.export("scope", network_data_name.scope)
    pulumi.export("type", network_data_name.type)
    pulumi.export("region", [location.region for location in network_data_name.locations])
    ```


    :param str uuid: Equinix-assigned network identifier
    """
    __args__ = dict()
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getNetwork:getNetwork', __args__, opts=opts, typ=GetNetworkResult)
    return __ret__.apply(lambda __response__: GetNetworkResult(
        change=pulumi.get(__response__, 'change'),
        change_log=pulumi.get(__response__, 'change_log'),
        connections_count=pulumi.get(__response__, 'connections_count'),
        href=pulumi.get(__response__, 'href'),
        id=pulumi.get(__response__, 'id'),
        locations=pulumi.get(__response__, 'locations'),
        name=pulumi.get(__response__, 'name'),
        notifications=pulumi.get(__response__, 'notifications'),
        operation=pulumi.get(__response__, 'operation'),
        project=pulumi.get(__response__, 'project'),
        scope=pulumi.get(__response__, 'scope'),
        state=pulumi.get(__response__, 'state'),
        type=pulumi.get(__response__, 'type'),
        uuid=pulumi.get(__response__, 'uuid')))
