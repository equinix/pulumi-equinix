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

__all__ = [
    'GetVirtualCircuitResult',
    'AwaitableGetVirtualCircuitResult',
    'get_virtual_circuit',
    'get_virtual_circuit_output',
]

@pulumi.output_type
class GetVirtualCircuitResult:
    """
    A collection of values returned by getVirtualCircuit.
    """
    def __init__(__self__, connection_id=None, customer_ip=None, customer_ipv6=None, description=None, id=None, md5=None, metal_ip=None, metal_ipv6=None, name=None, nni_vlan=None, nni_vnid=None, peer_asn=None, port_id=None, project_id=None, speed=None, status=None, subnet=None, subnet_ipv6=None, tags=None, virtual_circuit_id=None, vlan_id=None, vnid=None, vrf_id=None):
        if connection_id and not isinstance(connection_id, str):
            raise TypeError("Expected argument 'connection_id' to be a str")
        pulumi.set(__self__, "connection_id", connection_id)
        if customer_ip and not isinstance(customer_ip, str):
            raise TypeError("Expected argument 'customer_ip' to be a str")
        pulumi.set(__self__, "customer_ip", customer_ip)
        if customer_ipv6 and not isinstance(customer_ipv6, str):
            raise TypeError("Expected argument 'customer_ipv6' to be a str")
        pulumi.set(__self__, "customer_ipv6", customer_ipv6)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if md5 and not isinstance(md5, str):
            raise TypeError("Expected argument 'md5' to be a str")
        pulumi.set(__self__, "md5", md5)
        if metal_ip and not isinstance(metal_ip, str):
            raise TypeError("Expected argument 'metal_ip' to be a str")
        pulumi.set(__self__, "metal_ip", metal_ip)
        if metal_ipv6 and not isinstance(metal_ipv6, str):
            raise TypeError("Expected argument 'metal_ipv6' to be a str")
        pulumi.set(__self__, "metal_ipv6", metal_ipv6)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nni_vlan and not isinstance(nni_vlan, int):
            raise TypeError("Expected argument 'nni_vlan' to be a int")
        pulumi.set(__self__, "nni_vlan", nni_vlan)
        if nni_vnid and not isinstance(nni_vnid, int):
            raise TypeError("Expected argument 'nni_vnid' to be a int")
        pulumi.set(__self__, "nni_vnid", nni_vnid)
        if peer_asn and not isinstance(peer_asn, int):
            raise TypeError("Expected argument 'peer_asn' to be a int")
        pulumi.set(__self__, "peer_asn", peer_asn)
        if port_id and not isinstance(port_id, str):
            raise TypeError("Expected argument 'port_id' to be a str")
        pulumi.set(__self__, "port_id", port_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if speed and not isinstance(speed, str):
            raise TypeError("Expected argument 'speed' to be a str")
        pulumi.set(__self__, "speed", speed)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if subnet and not isinstance(subnet, str):
            raise TypeError("Expected argument 'subnet' to be a str")
        pulumi.set(__self__, "subnet", subnet)
        if subnet_ipv6 and not isinstance(subnet_ipv6, str):
            raise TypeError("Expected argument 'subnet_ipv6' to be a str")
        pulumi.set(__self__, "subnet_ipv6", subnet_ipv6)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if virtual_circuit_id and not isinstance(virtual_circuit_id, str):
            raise TypeError("Expected argument 'virtual_circuit_id' to be a str")
        pulumi.set(__self__, "virtual_circuit_id", virtual_circuit_id)
        if vlan_id and not isinstance(vlan_id, str):
            raise TypeError("Expected argument 'vlan_id' to be a str")
        pulumi.set(__self__, "vlan_id", vlan_id)
        if vnid and not isinstance(vnid, int):
            raise TypeError("Expected argument 'vnid' to be a int")
        pulumi.set(__self__, "vnid", vnid)
        if vrf_id and not isinstance(vrf_id, str):
            raise TypeError("Expected argument 'vrf_id' to be a str")
        pulumi.set(__self__, "vrf_id", vrf_id)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> str:
        """
        UUID of Connection where the VC is scoped to
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="customerIp")
    def customer_ip(self) -> str:
        """
        The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
        """
        return pulumi.get(self, "customer_ip")

    @property
    @pulumi.getter(name="customerIpv6")
    def customer_ipv6(self) -> Optional[str]:
        """
        The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
        """
        return pulumi.get(self, "customer_ipv6")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the virtual circuit
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def md5(self) -> str:
        """
        The password that can be set for the VRF BGP peer
        """
        return pulumi.get(self, "md5")

    @property
    @pulumi.getter(name="metalIp")
    def metal_ip(self) -> str:
        """
        The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
        """
        return pulumi.get(self, "metal_ip")

    @property
    @pulumi.getter(name="metalIpv6")
    def metal_ipv6(self) -> Optional[str]:
        """
        The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
        """
        return pulumi.get(self, "metal_ipv6")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the virtual circuit
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nniVlan")
    def nni_vlan(self) -> int:
        """
        Nni VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
        """
        return pulumi.get(self, "nni_vlan")

    @property
    @pulumi.getter(name="nniVnid")
    def nni_vnid(self) -> int:
        """
        Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
        """
        return pulumi.get(self, "nni_vnid")

    @property
    @pulumi.getter(name="peerAsn")
    def peer_asn(self) -> int:
        """
        The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the local_asn of the VRF.
        """
        return pulumi.get(self, "peer_asn")

    @property
    @pulumi.getter(name="portId")
    def port_id(self) -> str:
        """
        UUID of the Connection Port where the VC is scoped to
        """
        return pulumi.get(self, "port_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        ID of the projct to which the virtual circuit belongs
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def speed(self) -> str:
        """
        Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
        """
        return pulumi.get(self, "speed")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the virtual circuit
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def subnet(self) -> str:
        """
        A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
        			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
        			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
        """
        return pulumi.get(self, "subnet")

    @property
    @pulumi.getter(name="subnetIpv6")
    def subnet_ipv6(self) -> Optional[str]:
        """
        A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
        			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
        			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
        """
        return pulumi.get(self, "subnet_ipv6")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags attached to the virtual circuit
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="virtualCircuitId")
    def virtual_circuit_id(self) -> str:
        """
        ID of the virtual circuit to lookup
        """
        return pulumi.get(self, "virtual_circuit_id")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> str:
        """
        UUID of the associated VLAN
        """
        return pulumi.get(self, "vlan_id")

    @property
    @pulumi.getter
    def vnid(self) -> int:
        """
        VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
        """
        return pulumi.get(self, "vnid")

    @property
    @pulumi.getter(name="vrfId")
    def vrf_id(self) -> str:
        """
        UUID of the associated VRF
        """
        return pulumi.get(self, "vrf_id")


class AwaitableGetVirtualCircuitResult(GetVirtualCircuitResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVirtualCircuitResult(
            connection_id=self.connection_id,
            customer_ip=self.customer_ip,
            customer_ipv6=self.customer_ipv6,
            description=self.description,
            id=self.id,
            md5=self.md5,
            metal_ip=self.metal_ip,
            metal_ipv6=self.metal_ipv6,
            name=self.name,
            nni_vlan=self.nni_vlan,
            nni_vnid=self.nni_vnid,
            peer_asn=self.peer_asn,
            port_id=self.port_id,
            project_id=self.project_id,
            speed=self.speed,
            status=self.status,
            subnet=self.subnet,
            subnet_ipv6=self.subnet_ipv6,
            tags=self.tags,
            virtual_circuit_id=self.virtual_circuit_id,
            vlan_id=self.vlan_id,
            vnid=self.vnid,
            vrf_id=self.vrf_id)


def get_virtual_circuit(customer_ipv6: Optional[str] = None,
                        metal_ipv6: Optional[str] = None,
                        subnet_ipv6: Optional[str] = None,
                        virtual_circuit_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVirtualCircuitResult:
    """
    Use this data source to retrieve a virtual circuit resource from [Equinix Fabric - software-defined interconnections](https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/)

    See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.


    :param str customer_ipv6: The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
    :param str metal_ipv6: The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
    :param str subnet_ipv6: A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
           			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
           			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
    :param str virtual_circuit_id: ID of the virtual circuit to lookup
    """
    __args__ = dict()
    __args__['customerIpv6'] = customer_ipv6
    __args__['metalIpv6'] = metal_ipv6
    __args__['subnetIpv6'] = subnet_ipv6
    __args__['virtualCircuitId'] = virtual_circuit_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getVirtualCircuit:getVirtualCircuit', __args__, opts=opts, typ=GetVirtualCircuitResult).value

    return AwaitableGetVirtualCircuitResult(
        connection_id=pulumi.get(__ret__, 'connection_id'),
        customer_ip=pulumi.get(__ret__, 'customer_ip'),
        customer_ipv6=pulumi.get(__ret__, 'customer_ipv6'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        md5=pulumi.get(__ret__, 'md5'),
        metal_ip=pulumi.get(__ret__, 'metal_ip'),
        metal_ipv6=pulumi.get(__ret__, 'metal_ipv6'),
        name=pulumi.get(__ret__, 'name'),
        nni_vlan=pulumi.get(__ret__, 'nni_vlan'),
        nni_vnid=pulumi.get(__ret__, 'nni_vnid'),
        peer_asn=pulumi.get(__ret__, 'peer_asn'),
        port_id=pulumi.get(__ret__, 'port_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        speed=pulumi.get(__ret__, 'speed'),
        status=pulumi.get(__ret__, 'status'),
        subnet=pulumi.get(__ret__, 'subnet'),
        subnet_ipv6=pulumi.get(__ret__, 'subnet_ipv6'),
        tags=pulumi.get(__ret__, 'tags'),
        virtual_circuit_id=pulumi.get(__ret__, 'virtual_circuit_id'),
        vlan_id=pulumi.get(__ret__, 'vlan_id'),
        vnid=pulumi.get(__ret__, 'vnid'),
        vrf_id=pulumi.get(__ret__, 'vrf_id'))
def get_virtual_circuit_output(customer_ipv6: Optional[pulumi.Input[Optional[str]]] = None,
                               metal_ipv6: Optional[pulumi.Input[Optional[str]]] = None,
                               subnet_ipv6: Optional[pulumi.Input[Optional[str]]] = None,
                               virtual_circuit_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVirtualCircuitResult]:
    """
    Use this data source to retrieve a virtual circuit resource from [Equinix Fabric - software-defined interconnections](https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/)

    See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.


    :param str customer_ipv6: The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
    :param str metal_ipv6: The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
    :param str subnet_ipv6: A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
           			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
           			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
    :param str virtual_circuit_id: ID of the virtual circuit to lookup
    """
    __args__ = dict()
    __args__['customerIpv6'] = customer_ipv6
    __args__['metalIpv6'] = metal_ipv6
    __args__['subnetIpv6'] = subnet_ipv6
    __args__['virtualCircuitId'] = virtual_circuit_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:metal/getVirtualCircuit:getVirtualCircuit', __args__, opts=opts, typ=GetVirtualCircuitResult)
    return __ret__.apply(lambda __response__: GetVirtualCircuitResult(
        connection_id=pulumi.get(__response__, 'connection_id'),
        customer_ip=pulumi.get(__response__, 'customer_ip'),
        customer_ipv6=pulumi.get(__response__, 'customer_ipv6'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        md5=pulumi.get(__response__, 'md5'),
        metal_ip=pulumi.get(__response__, 'metal_ip'),
        metal_ipv6=pulumi.get(__response__, 'metal_ipv6'),
        name=pulumi.get(__response__, 'name'),
        nni_vlan=pulumi.get(__response__, 'nni_vlan'),
        nni_vnid=pulumi.get(__response__, 'nni_vnid'),
        peer_asn=pulumi.get(__response__, 'peer_asn'),
        port_id=pulumi.get(__response__, 'port_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        speed=pulumi.get(__response__, 'speed'),
        status=pulumi.get(__response__, 'status'),
        subnet=pulumi.get(__response__, 'subnet'),
        subnet_ipv6=pulumi.get(__response__, 'subnet_ipv6'),
        tags=pulumi.get(__response__, 'tags'),
        virtual_circuit_id=pulumi.get(__response__, 'virtual_circuit_id'),
        vlan_id=pulumi.get(__response__, 'vlan_id'),
        vnid=pulumi.get(__response__, 'vnid'),
        vrf_id=pulumi.get(__response__, 'vrf_id')))
