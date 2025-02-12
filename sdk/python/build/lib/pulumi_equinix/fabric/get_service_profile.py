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
    'GetServiceProfileResult',
    'AwaitableGetServiceProfileResult',
    'get_service_profile',
    'get_service_profile_output',
]

@pulumi.output_type
class GetServiceProfileResult:
    """
    A collection of values returned by getServiceProfile.
    """
    def __init__(__self__, access_point_type_configs=None, account=None, allowed_emails=None, change_log=None, custom_fields=None, description=None, href=None, id=None, marketing_info=None, metros=None, name=None, notifications=None, ports=None, project=None, self_profile=None, state=None, tags=None, type=None, uuid=None, view_point=None, virtual_devices=None, visibility=None):
        if access_point_type_configs and not isinstance(access_point_type_configs, list):
            raise TypeError("Expected argument 'access_point_type_configs' to be a list")
        pulumi.set(__self__, "access_point_type_configs", access_point_type_configs)
        if account and not isinstance(account, dict):
            raise TypeError("Expected argument 'account' to be a dict")
        pulumi.set(__self__, "account", account)
        if allowed_emails and not isinstance(allowed_emails, list):
            raise TypeError("Expected argument 'allowed_emails' to be a list")
        pulumi.set(__self__, "allowed_emails", allowed_emails)
        if change_log and not isinstance(change_log, dict):
            raise TypeError("Expected argument 'change_log' to be a dict")
        pulumi.set(__self__, "change_log", change_log)
        if custom_fields and not isinstance(custom_fields, list):
            raise TypeError("Expected argument 'custom_fields' to be a list")
        pulumi.set(__self__, "custom_fields", custom_fields)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if href and not isinstance(href, str):
            raise TypeError("Expected argument 'href' to be a str")
        pulumi.set(__self__, "href", href)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if marketing_info and not isinstance(marketing_info, dict):
            raise TypeError("Expected argument 'marketing_info' to be a dict")
        pulumi.set(__self__, "marketing_info", marketing_info)
        if metros and not isinstance(metros, list):
            raise TypeError("Expected argument 'metros' to be a list")
        pulumi.set(__self__, "metros", metros)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if ports and not isinstance(ports, list):
            raise TypeError("Expected argument 'ports' to be a list")
        pulumi.set(__self__, "ports", ports)
        if project and not isinstance(project, dict):
            raise TypeError("Expected argument 'project' to be a dict")
        pulumi.set(__self__, "project", project)
        if self_profile and not isinstance(self_profile, bool):
            raise TypeError("Expected argument 'self_profile' to be a bool")
        pulumi.set(__self__, "self_profile", self_profile)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)
        if view_point and not isinstance(view_point, str):
            raise TypeError("Expected argument 'view_point' to be a str")
        pulumi.set(__self__, "view_point", view_point)
        if virtual_devices and not isinstance(virtual_devices, list):
            raise TypeError("Expected argument 'virtual_devices' to be a list")
        pulumi.set(__self__, "virtual_devices", virtual_devices)
        if visibility and not isinstance(visibility, str):
            raise TypeError("Expected argument 'visibility' to be a str")
        pulumi.set(__self__, "visibility", visibility)

    @property
    @pulumi.getter(name="accessPointTypeConfigs")
    def access_point_type_configs(self) -> Sequence['outputs.GetServiceProfileAccessPointTypeConfigResult']:
        """
        Access point config information
        """
        return pulumi.get(self, "access_point_type_configs")

    @property
    @pulumi.getter
    def account(self) -> 'outputs.GetServiceProfileAccountResult':
        """
        Service Profile Owner Account Information
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter(name="allowedEmails")
    def allowed_emails(self) -> Sequence[str]:
        """
        Array of contact emails
        """
        return pulumi.get(self, "allowed_emails")

    @property
    @pulumi.getter(name="changeLog")
    def change_log(self) -> 'outputs.GetServiceProfileChangeLogResult':
        """
        Captures connection lifecycle change information
        """
        return pulumi.get(self, "change_log")

    @property
    @pulumi.getter(name="customFields")
    def custom_fields(self) -> Sequence['outputs.GetServiceProfileCustomFieldResult']:
        """
        Custom Fields
        """
        return pulumi.get(self, "custom_fields")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        User-provided service description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def href(self) -> str:
        """
        Service Profile URI response attribute
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
    @pulumi.getter(name="marketingInfo")
    def marketing_info(self) -> 'outputs.GetServiceProfileMarketingInfoResult':
        """
        Marketing Info
        """
        return pulumi.get(self, "marketing_info")

    @property
    @pulumi.getter
    def metros(self) -> Sequence['outputs.GetServiceProfileMetroResult']:
        """
        Access point config information
        """
        return pulumi.get(self, "metros")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Customer-assigned service profile name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetServiceProfileNotificationResult']:
        """
        Preferences for notifications on connection configuration or status changes
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def ports(self) -> Sequence['outputs.GetServiceProfilePortResult']:
        """
        Ports
        """
        return pulumi.get(self, "ports")

    @property
    @pulumi.getter
    def project(self) -> 'outputs.GetServiceProfileProjectResult':
        """
        Project information
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="selfProfile")
    def self_profile(self) -> bool:
        """
        Self Profile indicating if the profile is created for customer's  self use
        """
        return pulumi.get(self, "self_profile")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags attached to the connection
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        Equinix assigned service profile identifier
        """
        return pulumi.get(self, "uuid")

    @property
    @pulumi.getter(name="viewPoint")
    def view_point(self) -> str:
        """
        Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
        """
        return pulumi.get(self, "view_point")

    @property
    @pulumi.getter(name="virtualDevices")
    def virtual_devices(self) -> Sequence['outputs.GetServiceProfileVirtualDeviceResult']:
        """
        Virtual Devices
        """
        return pulumi.get(self, "virtual_devices")

    @property
    @pulumi.getter
    def visibility(self) -> str:
        """
        Service profile visibility - PUBLIC, PRIVATE
        """
        return pulumi.get(self, "visibility")


class AwaitableGetServiceProfileResult(GetServiceProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceProfileResult(
            access_point_type_configs=self.access_point_type_configs,
            account=self.account,
            allowed_emails=self.allowed_emails,
            change_log=self.change_log,
            custom_fields=self.custom_fields,
            description=self.description,
            href=self.href,
            id=self.id,
            marketing_info=self.marketing_info,
            metros=self.metros,
            name=self.name,
            notifications=self.notifications,
            ports=self.ports,
            project=self.project,
            self_profile=self.self_profile,
            state=self.state,
            tags=self.tags,
            type=self.type,
            uuid=self.uuid,
            view_point=self.view_point,
            virtual_devices=self.virtual_devices,
            visibility=self.visibility)


def get_service_profile(uuid: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceProfileResult:
    """
    Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    service_profile_data_name = equinix.fabric.get_service_profile(uuid="<uuid_of_service_profile>")
    pulumi.export("id", service_profile_data_name.id)
    pulumi.export("name", service_profile_data_name.name)
    pulumi.export("type", service_profile_data_name.type)
    pulumi.export("visibility", service_profile_data_name.visibility)
    pulumi.export("orgName", service_profile_data_name.account.organization_name)
    pulumi.export("accessPointTypeConfigsType", service_profile_data_name.access_point_type_configs[0].type)
    pulumi.export("allowRemoteConnections", service_profile_data_name.access_point_type_configs[0].allow_remote_connections)
    pulumi.export("supportedBandwidth0", service_profile_data_name.access_point_type_configs[0].supported_bandwidths[0])
    pulumi.export("supportedBandwidth1", service_profile_data_name.access_point_type_configs[0].supported_bandwidths[1])
    pulumi.export("redundandyRequired", service_profile_data_name.access_point_type_configs[0].connection_redundancy_required)
    pulumi.export("allowOverSubscription", service_profile_data_name.access_point_type_configs[0].api_config.allow_over_subscription)
    ```


    :param str uuid: Equinix assigned service profile identifier
    """
    __args__ = dict()
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:fabric/getServiceProfile:getServiceProfile', __args__, opts=opts, typ=GetServiceProfileResult).value

    return AwaitableGetServiceProfileResult(
        access_point_type_configs=pulumi.get(__ret__, 'access_point_type_configs'),
        account=pulumi.get(__ret__, 'account'),
        allowed_emails=pulumi.get(__ret__, 'allowed_emails'),
        change_log=pulumi.get(__ret__, 'change_log'),
        custom_fields=pulumi.get(__ret__, 'custom_fields'),
        description=pulumi.get(__ret__, 'description'),
        href=pulumi.get(__ret__, 'href'),
        id=pulumi.get(__ret__, 'id'),
        marketing_info=pulumi.get(__ret__, 'marketing_info'),
        metros=pulumi.get(__ret__, 'metros'),
        name=pulumi.get(__ret__, 'name'),
        notifications=pulumi.get(__ret__, 'notifications'),
        ports=pulumi.get(__ret__, 'ports'),
        project=pulumi.get(__ret__, 'project'),
        self_profile=pulumi.get(__ret__, 'self_profile'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'),
        uuid=pulumi.get(__ret__, 'uuid'),
        view_point=pulumi.get(__ret__, 'view_point'),
        virtual_devices=pulumi.get(__ret__, 'virtual_devices'),
        visibility=pulumi.get(__ret__, 'visibility'))
def get_service_profile_output(uuid: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceProfileResult]:
    """
    Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria

    Additional documentation:
    * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
    * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles

    ## Example Usage

    ```python
    import pulumi
    import pulumi_equinix as equinix

    service_profile_data_name = equinix.fabric.get_service_profile(uuid="<uuid_of_service_profile>")
    pulumi.export("id", service_profile_data_name.id)
    pulumi.export("name", service_profile_data_name.name)
    pulumi.export("type", service_profile_data_name.type)
    pulumi.export("visibility", service_profile_data_name.visibility)
    pulumi.export("orgName", service_profile_data_name.account.organization_name)
    pulumi.export("accessPointTypeConfigsType", service_profile_data_name.access_point_type_configs[0].type)
    pulumi.export("allowRemoteConnections", service_profile_data_name.access_point_type_configs[0].allow_remote_connections)
    pulumi.export("supportedBandwidth0", service_profile_data_name.access_point_type_configs[0].supported_bandwidths[0])
    pulumi.export("supportedBandwidth1", service_profile_data_name.access_point_type_configs[0].supported_bandwidths[1])
    pulumi.export("redundandyRequired", service_profile_data_name.access_point_type_configs[0].connection_redundancy_required)
    pulumi.export("allowOverSubscription", service_profile_data_name.access_point_type_configs[0].api_config.allow_over_subscription)
    ```


    :param str uuid: Equinix assigned service profile identifier
    """
    __args__ = dict()
    __args__['uuid'] = uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('equinix:fabric/getServiceProfile:getServiceProfile', __args__, opts=opts, typ=GetServiceProfileResult)
    return __ret__.apply(lambda __response__: GetServiceProfileResult(
        access_point_type_configs=pulumi.get(__response__, 'access_point_type_configs'),
        account=pulumi.get(__response__, 'account'),
        allowed_emails=pulumi.get(__response__, 'allowed_emails'),
        change_log=pulumi.get(__response__, 'change_log'),
        custom_fields=pulumi.get(__response__, 'custom_fields'),
        description=pulumi.get(__response__, 'description'),
        href=pulumi.get(__response__, 'href'),
        id=pulumi.get(__response__, 'id'),
        marketing_info=pulumi.get(__response__, 'marketing_info'),
        metros=pulumi.get(__response__, 'metros'),
        name=pulumi.get(__response__, 'name'),
        notifications=pulumi.get(__response__, 'notifications'),
        ports=pulumi.get(__response__, 'ports'),
        project=pulumi.get(__response__, 'project'),
        self_profile=pulumi.get(__response__, 'self_profile'),
        state=pulumi.get(__response__, 'state'),
        tags=pulumi.get(__response__, 'tags'),
        type=pulumi.get(__response__, 'type'),
        uuid=pulumi.get(__response__, 'uuid'),
        view_point=pulumi.get(__response__, 'view_point'),
        virtual_devices=pulumi.get(__response__, 'virtual_devices'),
        visibility=pulumi.get(__response__, 'visibility')))
