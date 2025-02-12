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
    'GetRoutingProtocolResult',
    'AwaitableGetRoutingProtocolResult',
    'get_routing_protocol',
    'get_routing_protocol_output',
]

@pulumi.output_type
class GetRoutingProtocolResult:
    """
    A collection of values returned by getRoutingProtocol.
    """
    def __init__(__self__, as_override_enabled=None, bfd=None, bgp_auth_key=None, bgp_ipv4=None, bgp_ipv6=None, change_logs=None, changes=None, connection_uuid=None, customer_asn=None, description=None, direct_ipv4=None, direct_ipv6=None, equinix_asn=None, href=None, id=None, name=None, operations=None, state=None, type=None, uuid=None):
        if as_override_enabled and not isinstance(as_override_enabled, bool):
            raise TypeError("Expected argument 'as_override_enabled' to be a bool")
        pulumi.set(__self__, "as_override_enabled", as_override_enabled)
        if bfd and not isinstance(bfd, dict):
            raise TypeError("Expected argument 'bfd' to be a dict")
        pulumi.set(__self__, "bfd", bfd)
        if bgp_auth_key and not isinstance(bgp_auth_key, str):
            raise TypeError("Expected argument 'bgp_auth_key' to be a str")
        pulumi.set(__self__, "bgp_auth_key", bgp_auth_key)
        if bgp_ipv4 and not isinstance(bgp_ipv4, dict):
            raise TypeError("Expected argument 'bgp_ipv4' to be a dict")
        pulumi.set(__self__, "bgp_ipv4", bgp_ipv4)
        if bgp_ipv6 and not isinstance(bgp_ipv6, dict):
            raise TypeError("Expected argument 'bgp_ipv6' to be a dict")
        pulumi.set(__self__, "bgp_ipv6", bgp_ipv6)
        if change_logs and not isinstance(change_logs, list):
            raise TypeError("Expected argument 'change_logs' to be a list")
        pulumi.set(__self__, "change_logs", change_logs)
        if changes and not isinstance(changes, list):
            raise TypeError("Expected argument 'changes' to be a list")
        pulumi.set(__self__, "changes", changes)
        if connection_uuid and not isinstance(connection_uuid, str):
            raise TypeError("Expected argument 'connection_uuid' to be a str")
        pulumi.set(__self__, "connection_uuid", connection_uuid)
        if customer_asn and not isinstance(customer_asn, int):
            raise TypeError("Expected argument 'customer_asn' to be a int")
        pulumi.set(__self__, "customer_asn", customer_asn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if direct_ipv4 and not isinstance(direct_ipv4, dict):
            raise TypeError("Expected argument 'direct_ipv4' to be a dict")
        pulumi.set(__self__, "direct_ipv4", direct_ipv4)
        if direct_ipv6 and not isinstance(direct_ipv6, dict):
            raise TypeError("Expected argument 'direct_ipv6' to be a dict")
        pulumi.set(__self__, "direct_ipv6", direct_ipv6)
        if equinix_asn and not isinstance(equinix_asn, int):
            raise TypeError("Expected argument 'equinix_asn' to be a int")
        pulumi.set(__self__, "equinix_asn", equinix_asn)
        if href and not isinstance(href, str):
            raise TypeError("Expected argument 'href' to be a str")
        pulumi.set(__self__, "href", href)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if operations and not isinstance(operations, list):
            raise TypeError("Expected argument 'operations' to be a list")
        pulumi.set(__self__, "operations", operations)
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
    @pulumi.getter(name="asOverrideEnabled")
    def as_override_enabled(self) -> bool:
        """
        Enable AS number override
        """
        return pulumi.get(self, "as_override_enabled")

    @property
    @pulumi.getter
    def bfd(self) -> 'outputs.GetRoutingProtocolBfdResult':
        """
        Bidirectional Forwarding Detection
        """
        return pulumi.get(self, "bfd")

    @property
    @pulumi.getter(name="bgpAuthKey")
    def bgp_auth_key(self) -> str:
        """
        BGP authorization key
        """
        return pulumi.get(self, "bgp_auth_key")

    @property
    @pulumi.getter(name="bgpIpv4")
    def bgp_ipv4(self) -> 'outputs.GetRoutingProtocolBgpIpv4Result':
        """
        Routing Protocol BGP IPv4
        """
        return pulumi.get(self, "bgp_ipv4")

    @property
    @pulumi.getter(name="bgpIpv6")
    def bgp_ipv6(self) -> 'outputs.GetRoutingProtocolBgpIpv6Result':
        """
        Routing Protocol BGP IPv6
        """
        return pulumi.get(self, "bgp_ipv6")

    @property
    @pulumi.getter(name="changeLogs")
    def change_logs(self) -> Sequence['outputs.GetRoutingProtocolChangeLogResult']:
        """
        Captures Routing Protocol lifecycle change information
        """
        return pulumi.get(self, "change_logs")

    @property
    @pulumi.getter
    def changes(self) -> Sequence['outputs.GetRoutingProtocolChangeResult']:
        """
        Routing Protocol configuration Changes
        """
        return pulumi.get(self, "changes")

    @property
    @pulumi.getter(name="connectionUuid")
    def connection_uuid(self) -> str:
        """
        Connection URI associated with Routing Protocol
        """
        return pulumi.get(self, "connection_uuid")

    @property
    @pulumi.getter(name="customerAsn")
    def customer_asn(self) -> int:
        """
        Customer-provided ASN
        """
        return pulumi.get(self, "customer_asn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Customer-provided Fabric Routing Protocol description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="directIpv4")
    def direct_ipv4(self) -> 'outputs.GetRoutingProtocolDirectIpv4Result':
        """
        Routing Protocol Direct IPv4
        """
        return pulumi.get(self, "direct_ipv4")

    @property
    @pulumi.getter(name="directIpv6")
    def direct_ipv6(self) -> 'outputs.GetRoutingProtocolDirectIpv6Result':
        """
        Routing Protocol Direct IPv6
        """
        return pulumi.get(self, "direct_ipv6")

    @property
    @pulumi.getter(name="equinixAsn")
    def equinix_asn(self) -> int:
        """
        Equinix ASN
        """
        return pulumi.get(self, "equinix_asn")

    @property
    @pulumi.getter
    def href(self) -> str:
        """
        Routing Protocol URI information
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
    def name(self) -> str:
        """
        Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def operations(self) -> Sequence['outputs.GetRoutingProtocolOperationResult']:
        """
        Routing Protocol type-specific operational data
        """
        return pulumi.get(self, "operations")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Routing Protocol overall state
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Defines the routing protocol type like BGP or DIRECT
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        Equinix-assigned routing protocol identifier
        """
        return pulumi.get(self, "uuid")


class AwaitableGetRoutingProtocolResult(GetRoutingProtocolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoutingProtocolResult(
            as_override_enabled=self.as_override_enabled,
            bfd=self.bfd,
            bgp_auth_key=self.bgp_auth_key,
            bgp_ipv4=self.bgp_ipv4,
            bgp_ipv6=self.bgp_ipv6,
            change_logs=self.change_logs,
            changes=self.changes,
            connection_uuid=self.connection_uuid,
            customer_asn=self.customer_asn,
            description=self.description,
            direct_ipv4=self.direct_ipv4,
            direct_ipv6=self.direct_ipv6,
            equinix_asn=self.equinix_asn,
            href=self.href,
            id=self.id,
            name=self.name,
            operations=self.operations,
            state=self.state,
            type=self.type,
            uuid=self.uuid)


def get_routing_protocol(connection_uuid: Optional[str] = None,
                         uuid: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoutingProtocolResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch routing protocol for a given UUID

    API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    routing_protocol_data_name = equinix.fabric.get_routing_protocol(connection_uuid="<uuid_of_connection_routing_protocol_is_applied_to>",
        uuid="<uuid_of_routing_protocol>")
    pulumi.export("id", routing_protocol_data_name.id)
    pulumi.export("name", routing_protocol_data_name.name)
    pulumi.export("type", routing_protocol_data_name.type)
    pulumi.export("directIpv4", routing_protocol_data_name.direct_ipv4.equinix_iface_ip)
    pulumi.export("directIpv6", routing_protocol_data_name.direct_ipv6.equinix_iface_ip)
    pulumi.export("bgpIpv4CustomerPeerIp", routing_protocol_data_name.bgp_ipv4.customer_peer_ip)
    pulumi.export("bgpIpv4EquinixPeerIp", routing_protocol_data_name.bgp_ipv4.equinix_peer_ip)
    pulumi.export("bgpIpv4Enabled", routing_protocol_data_name.bgp_ipv4.enabled)
    pulumi.export("bgpIpv6CustomerPeerIp", routing_protocol_data_name.bgp_ipv6.customer_peer_ip)
    pulumi.export("bgpIpv6EquinixPeerIp", routing_protocol_data_name.bgp_ipv6.equinix_peer_ip)
    pulumi.export("bgpIpv6Enabled", routing_protocol_data_name.bgp_ipv6.enabled)
    pulumi.export("customerAsn", routing_protocol_data_name.customer_asn)
    ```


    :param str connection_uuid: Connection URI associated with Routing Protocol
    :param str uuid: Equinix-assigned routing protocol identifier
    """
    __args__ = dict()
    __args__['connectionUuid'] = connection_uuid
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getRoutingProtocol:getRoutingProtocol', __args__, opts=opts, typ=GetRoutingProtocolResult).value

    return AwaitableGetRoutingProtocolResult(
        as_override_enabled=pulumi.get(__ret__, 'as_override_enabled'),
        bfd=pulumi.get(__ret__, 'bfd'),
        bgp_auth_key=pulumi.get(__ret__, 'bgp_auth_key'),
        bgp_ipv4=pulumi.get(__ret__, 'bgp_ipv4'),
        bgp_ipv6=pulumi.get(__ret__, 'bgp_ipv6'),
        change_logs=pulumi.get(__ret__, 'change_logs'),
        changes=pulumi.get(__ret__, 'changes'),
        connection_uuid=pulumi.get(__ret__, 'connection_uuid'),
        customer_asn=pulumi.get(__ret__, 'customer_asn'),
        description=pulumi.get(__ret__, 'description'),
        direct_ipv4=pulumi.get(__ret__, 'direct_ipv4'),
        direct_ipv6=pulumi.get(__ret__, 'direct_ipv6'),
        equinix_asn=pulumi.get(__ret__, 'equinix_asn'),
        href=pulumi.get(__ret__, 'href'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        operations=pulumi.get(__ret__, 'operations'),
        state=pulumi.get(__ret__, 'state'),
        type=pulumi.get(__ret__, 'type'),
        uuid=pulumi.get(__ret__, 'uuid'))
def get_routing_protocol_output(connection_uuid: Optional[pulumi.Input[str]] = None,
                                uuid: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRoutingProtocolResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch routing protocol for a given UUID

    API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    routing_protocol_data_name = equinix.fabric.get_routing_protocol(connection_uuid="<uuid_of_connection_routing_protocol_is_applied_to>",
        uuid="<uuid_of_routing_protocol>")
    pulumi.export("id", routing_protocol_data_name.id)
    pulumi.export("name", routing_protocol_data_name.name)
    pulumi.export("type", routing_protocol_data_name.type)
    pulumi.export("directIpv4", routing_protocol_data_name.direct_ipv4.equinix_iface_ip)
    pulumi.export("directIpv6", routing_protocol_data_name.direct_ipv6.equinix_iface_ip)
    pulumi.export("bgpIpv4CustomerPeerIp", routing_protocol_data_name.bgp_ipv4.customer_peer_ip)
    pulumi.export("bgpIpv4EquinixPeerIp", routing_protocol_data_name.bgp_ipv4.equinix_peer_ip)
    pulumi.export("bgpIpv4Enabled", routing_protocol_data_name.bgp_ipv4.enabled)
    pulumi.export("bgpIpv6CustomerPeerIp", routing_protocol_data_name.bgp_ipv6.customer_peer_ip)
    pulumi.export("bgpIpv6EquinixPeerIp", routing_protocol_data_name.bgp_ipv6.equinix_peer_ip)
    pulumi.export("bgpIpv6Enabled", routing_protocol_data_name.bgp_ipv6.enabled)
    pulumi.export("customerAsn", routing_protocol_data_name.customer_asn)
    ```


    :param str connection_uuid: Connection URI associated with Routing Protocol
    :param str uuid: Equinix-assigned routing protocol identifier
    """
    __args__ = dict()
    __args__['connectionUuid'] = connection_uuid
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getRoutingProtocol:getRoutingProtocol', __args__, opts=opts, typ=GetRoutingProtocolResult)
    return __ret__.apply(lambda __response__: GetRoutingProtocolResult(
        as_override_enabled=pulumi.get(__response__, 'as_override_enabled'),
        bfd=pulumi.get(__response__, 'bfd'),
        bgp_auth_key=pulumi.get(__response__, 'bgp_auth_key'),
        bgp_ipv4=pulumi.get(__response__, 'bgp_ipv4'),
        bgp_ipv6=pulumi.get(__response__, 'bgp_ipv6'),
        change_logs=pulumi.get(__response__, 'change_logs'),
        changes=pulumi.get(__response__, 'changes'),
        connection_uuid=pulumi.get(__response__, 'connection_uuid'),
        customer_asn=pulumi.get(__response__, 'customer_asn'),
        description=pulumi.get(__response__, 'description'),
        direct_ipv4=pulumi.get(__response__, 'direct_ipv4'),
        direct_ipv6=pulumi.get(__response__, 'direct_ipv6'),
        equinix_asn=pulumi.get(__response__, 'equinix_asn'),
        href=pulumi.get(__response__, 'href'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        operations=pulumi.get(__response__, 'operations'),
        state=pulumi.get(__response__, 'state'),
        type=pulumi.get(__response__, 'type'),
        uuid=pulumi.get(__response__, 'uuid')))
