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

__all__ = [
    'GetInterconnectionResult',
    'AwaitableGetInterconnectionResult',
    'get_interconnection',
    'get_interconnection_output',
]

@pulumi.output_type
class GetInterconnectionResult:
    """
    A collection of values returned by getInterconnection.
    """
    def __init__(__self__, authorization_code=None, connection_id=None, contact_email=None, description=None, facility=None, id=None, metro=None, mode=None, name=None, organization_id=None, ports=None, project_id=None, redundancy=None, service_token_type=None, service_tokens=None, speed=None, status=None, tags=None, token=None, type=None, vlans=None, vrfs=None):
        if authorization_code and not isinstance(authorization_code, str):
            raise TypeError("Expected argument 'authorization_code' to be a str")
        pulumi.set(__self__, "authorization_code", authorization_code)
        if connection_id and not isinstance(connection_id, str):
            raise TypeError("Expected argument 'connection_id' to be a str")
        pulumi.set(__self__, "connection_id", connection_id)
        if contact_email and not isinstance(contact_email, str):
            raise TypeError("Expected argument 'contact_email' to be a str")
        pulumi.set(__self__, "contact_email", contact_email)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if facility and not isinstance(facility, str):
            raise TypeError("Expected argument 'facility' to be a str")
        pulumi.set(__self__, "facility", facility)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metro and not isinstance(metro, str):
            raise TypeError("Expected argument 'metro' to be a str")
        pulumi.set(__self__, "metro", metro)
        if mode and not isinstance(mode, str):
            raise TypeError("Expected argument 'mode' to be a str")
        pulumi.set(__self__, "mode", mode)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if ports and not isinstance(ports, list):
            raise TypeError("Expected argument 'ports' to be a list")
        pulumi.set(__self__, "ports", ports)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if redundancy and not isinstance(redundancy, str):
            raise TypeError("Expected argument 'redundancy' to be a str")
        pulumi.set(__self__, "redundancy", redundancy)
        if service_token_type and not isinstance(service_token_type, str):
            raise TypeError("Expected argument 'service_token_type' to be a str")
        pulumi.set(__self__, "service_token_type", service_token_type)
        if service_tokens and not isinstance(service_tokens, list):
            raise TypeError("Expected argument 'service_tokens' to be a list")
        pulumi.set(__self__, "service_tokens", service_tokens)
        if speed and not isinstance(speed, str):
            raise TypeError("Expected argument 'speed' to be a str")
        pulumi.set(__self__, "speed", speed)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if token and not isinstance(token, str):
            raise TypeError("Expected argument 'token' to be a str")
        pulumi.set(__self__, "token", token)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if vlans and not isinstance(vlans, list):
            raise TypeError("Expected argument 'vlans' to be a list")
        pulumi.set(__self__, "vlans", vlans)
        if vrfs and not isinstance(vrfs, list):
            raise TypeError("Expected argument 'vrfs' to be a list")
        pulumi.set(__self__, "vrfs", vrfs)

    @property
    @pulumi.getter(name="authorizationCode")
    def authorization_code(self) -> str:
        """
        Fabric Authorization Code to configure the NIMF connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard).
        """
        return pulumi.get(self, "authorization_code")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> str:
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="contactEmail")
    def contact_email(self) -> str:
        """
        The preferred email used for communication and notifications about the Equinix Fabric interconnection.
        """
        return pulumi.get(self, "contact_email")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the connection resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use metro instead of facility. For more information, read the migration guide.""")
    def facility(self) -> str:
        """
        (**Deprecated**) Slug of a facility to which the connection belongs. Use metro instead; read the facility to metro migration guide
        """
        return pulumi.get(self, "facility")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Port UUID.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def metro(self) -> str:
        """
        Slug of a metro to which the connection belongs.
        """
        return pulumi.get(self, "metro")

    @property
    @pulumi.getter
    def mode(self) -> str:
        """
        Mode for connections in IBX facilities with the dedicated type - standard or tunnel.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Port name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        """
        ID of the organization where the connection is scoped to.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter
    def ports(self) -> Sequence['outputs.GetInterconnectionPortResult']:
        """
        List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`)
        """
        return pulumi.get(self, "ports")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        ID of project to which the connection belongs.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def redundancy(self) -> str:
        """
        Connection redundancy, reduntant or primary.
        """
        return pulumi.get(self, "redundancy")

    @property
    @pulumi.getter(name="serviceTokenType")
    def service_token_type(self) -> str:
        """
        Type of service token, a_side or z_side. One available in shared connection.
        """
        return pulumi.get(self, "service_token_type")

    @property
    @pulumi.getter(name="serviceTokens")
    def service_tokens(self) -> Sequence['outputs.GetInterconnectionServiceTokenResult']:
        """
        List of connection service tokens with attributes
        """
        return pulumi.get(self, "service_tokens")

    @property
    @pulumi.getter
    def speed(self) -> str:
        """
        Port speed in bits per second.
        """
        return pulumi.get(self, "speed")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Port status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        String list of tags.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    @_utilities.deprecated("""If your organization already has connection service tokens enabled, use `service_tokens` instead""")
    def token(self) -> str:
        """
        (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Token type, `a_side` or `z_side`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def vlans(self) -> Sequence[int]:
        """
        Attached VLANs. Only available in shared connection. One vlan for Primary/Single connection and two vlans for Redundant connection.
        """
        return pulumi.get(self, "vlans")

    @property
    @pulumi.getter
    def vrfs(self) -> Sequence[str]:
        return pulumi.get(self, "vrfs")


class AwaitableGetInterconnectionResult(GetInterconnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInterconnectionResult(
            authorization_code=self.authorization_code,
            connection_id=self.connection_id,
            contact_email=self.contact_email,
            description=self.description,
            facility=self.facility,
            id=self.id,
            metro=self.metro,
            mode=self.mode,
            name=self.name,
            organization_id=self.organization_id,
            ports=self.ports,
            project_id=self.project_id,
            redundancy=self.redundancy,
            service_token_type=self.service_token_type,
            service_tokens=self.service_tokens,
            speed=self.speed,
            status=self.status,
            tags=self.tags,
            token=self.token,
            type=self.type,
            vlans=self.vlans,
            vrfs=self.vrfs)


def get_interconnection(connection_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInterconnectionResult:
    """
    Use this data source to retrieve a [connection resource](https://metal.equinix.com/developers/docs/networking/fabric/)

    > Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_interconnection(connection_id="4347e805-eb46-4699-9eb9-5c116e6a017d")
    ```


    :param str connection_id: ID of the connection resource.
    """
    __args__ = dict()
    __args__['connectionId'] = connection_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:metal/getInterconnection:getInterconnection', __args__, opts=opts, typ=GetInterconnectionResult).value

    return AwaitableGetInterconnectionResult(
        authorization_code=pulumi.get(__ret__, 'authorization_code'),
        connection_id=pulumi.get(__ret__, 'connection_id'),
        contact_email=pulumi.get(__ret__, 'contact_email'),
        description=pulumi.get(__ret__, 'description'),
        facility=pulumi.get(__ret__, 'facility'),
        id=pulumi.get(__ret__, 'id'),
        metro=pulumi.get(__ret__, 'metro'),
        mode=pulumi.get(__ret__, 'mode'),
        name=pulumi.get(__ret__, 'name'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        ports=pulumi.get(__ret__, 'ports'),
        project_id=pulumi.get(__ret__, 'project_id'),
        redundancy=pulumi.get(__ret__, 'redundancy'),
        service_token_type=pulumi.get(__ret__, 'service_token_type'),
        service_tokens=pulumi.get(__ret__, 'service_tokens'),
        speed=pulumi.get(__ret__, 'speed'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        token=pulumi.get(__ret__, 'token'),
        type=pulumi.get(__ret__, 'type'),
        vlans=pulumi.get(__ret__, 'vlans'),
        vrfs=pulumi.get(__ret__, 'vrfs'))


@_utilities.lift_output_func(get_interconnection)
def get_interconnection_output(connection_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInterconnectionResult]:
    """
    Use this data source to retrieve a [connection resource](https://metal.equinix.com/developers/docs/networking/fabric/)

    > Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    example = equinix.metal.get_interconnection(connection_id="4347e805-eb46-4699-9eb9-5c116e6a017d")
    ```


    :param str connection_id: ID of the connection resource.
    """
    ...
