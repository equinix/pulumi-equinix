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
    'GetDeviceResult',
    'AwaitableGetDeviceResult',
    'get_device',
    'get_device_output',
]

@pulumi.output_type
class GetDeviceResult:
    """
    A collection of values returned by getDevice.
    """
    def __init__(__self__, account_number=None, acl_template_id=None, additional_bandwidth=None, asn=None, byol=None, cluster_details=None, connectivity=None, core_count=None, diverse_device_id=None, diverse_device_name=None, hostname=None, ibx=None, id=None, interface_count=None, interfaces=None, license_file=None, license_file_id=None, license_status=None, license_token=None, metro_code=None, mgmt_acl_template_uuid=None, name=None, notifications=None, order_reference=None, package_code=None, project_id=None, purchase_order_number=None, redundancy_type=None, redundant_id=None, region=None, secondary_devices=None, self_managed=None, ssh_ip_address=None, ssh_ip_fqdn=None, ssh_keys=None, status=None, term_length=None, throughput=None, throughput_unit=None, type_code=None, uuid=None, valid_status_list=None, vendor_configuration=None, version=None, wan_interface_id=None, zone_code=None):
        if account_number and not isinstance(account_number, str):
            raise TypeError("Expected argument 'account_number' to be a str")
        pulumi.set(__self__, "account_number", account_number)
        if acl_template_id and not isinstance(acl_template_id, str):
            raise TypeError("Expected argument 'acl_template_id' to be a str")
        pulumi.set(__self__, "acl_template_id", acl_template_id)
        if additional_bandwidth and not isinstance(additional_bandwidth, int):
            raise TypeError("Expected argument 'additional_bandwidth' to be a int")
        pulumi.set(__self__, "additional_bandwidth", additional_bandwidth)
        if asn and not isinstance(asn, int):
            raise TypeError("Expected argument 'asn' to be a int")
        pulumi.set(__self__, "asn", asn)
        if byol and not isinstance(byol, bool):
            raise TypeError("Expected argument 'byol' to be a bool")
        pulumi.set(__self__, "byol", byol)
        if cluster_details and not isinstance(cluster_details, list):
            raise TypeError("Expected argument 'cluster_details' to be a list")
        pulumi.set(__self__, "cluster_details", cluster_details)
        if connectivity and not isinstance(connectivity, str):
            raise TypeError("Expected argument 'connectivity' to be a str")
        pulumi.set(__self__, "connectivity", connectivity)
        if core_count and not isinstance(core_count, int):
            raise TypeError("Expected argument 'core_count' to be a int")
        pulumi.set(__self__, "core_count", core_count)
        if diverse_device_id and not isinstance(diverse_device_id, str):
            raise TypeError("Expected argument 'diverse_device_id' to be a str")
        pulumi.set(__self__, "diverse_device_id", diverse_device_id)
        if diverse_device_name and not isinstance(diverse_device_name, str):
            raise TypeError("Expected argument 'diverse_device_name' to be a str")
        pulumi.set(__self__, "diverse_device_name", diverse_device_name)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if ibx and not isinstance(ibx, str):
            raise TypeError("Expected argument 'ibx' to be a str")
        pulumi.set(__self__, "ibx", ibx)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interface_count and not isinstance(interface_count, int):
            raise TypeError("Expected argument 'interface_count' to be a int")
        pulumi.set(__self__, "interface_count", interface_count)
        if interfaces and not isinstance(interfaces, list):
            raise TypeError("Expected argument 'interfaces' to be a list")
        pulumi.set(__self__, "interfaces", interfaces)
        if license_file and not isinstance(license_file, str):
            raise TypeError("Expected argument 'license_file' to be a str")
        pulumi.set(__self__, "license_file", license_file)
        if license_file_id and not isinstance(license_file_id, str):
            raise TypeError("Expected argument 'license_file_id' to be a str")
        pulumi.set(__self__, "license_file_id", license_file_id)
        if license_status and not isinstance(license_status, str):
            raise TypeError("Expected argument 'license_status' to be a str")
        pulumi.set(__self__, "license_status", license_status)
        if license_token and not isinstance(license_token, str):
            raise TypeError("Expected argument 'license_token' to be a str")
        pulumi.set(__self__, "license_token", license_token)
        if metro_code and not isinstance(metro_code, str):
            raise TypeError("Expected argument 'metro_code' to be a str")
        pulumi.set(__self__, "metro_code", metro_code)
        if mgmt_acl_template_uuid and not isinstance(mgmt_acl_template_uuid, str):
            raise TypeError("Expected argument 'mgmt_acl_template_uuid' to be a str")
        pulumi.set(__self__, "mgmt_acl_template_uuid", mgmt_acl_template_uuid)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if order_reference and not isinstance(order_reference, str):
            raise TypeError("Expected argument 'order_reference' to be a str")
        pulumi.set(__self__, "order_reference", order_reference)
        if package_code and not isinstance(package_code, str):
            raise TypeError("Expected argument 'package_code' to be a str")
        pulumi.set(__self__, "package_code", package_code)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if purchase_order_number and not isinstance(purchase_order_number, str):
            raise TypeError("Expected argument 'purchase_order_number' to be a str")
        pulumi.set(__self__, "purchase_order_number", purchase_order_number)
        if redundancy_type and not isinstance(redundancy_type, str):
            raise TypeError("Expected argument 'redundancy_type' to be a str")
        pulumi.set(__self__, "redundancy_type", redundancy_type)
        if redundant_id and not isinstance(redundant_id, str):
            raise TypeError("Expected argument 'redundant_id' to be a str")
        pulumi.set(__self__, "redundant_id", redundant_id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if secondary_devices and not isinstance(secondary_devices, list):
            raise TypeError("Expected argument 'secondary_devices' to be a list")
        pulumi.set(__self__, "secondary_devices", secondary_devices)
        if self_managed and not isinstance(self_managed, bool):
            raise TypeError("Expected argument 'self_managed' to be a bool")
        pulumi.set(__self__, "self_managed", self_managed)
        if ssh_ip_address and not isinstance(ssh_ip_address, str):
            raise TypeError("Expected argument 'ssh_ip_address' to be a str")
        pulumi.set(__self__, "ssh_ip_address", ssh_ip_address)
        if ssh_ip_fqdn and not isinstance(ssh_ip_fqdn, str):
            raise TypeError("Expected argument 'ssh_ip_fqdn' to be a str")
        pulumi.set(__self__, "ssh_ip_fqdn", ssh_ip_fqdn)
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        pulumi.set(__self__, "ssh_keys", ssh_keys)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if term_length and not isinstance(term_length, int):
            raise TypeError("Expected argument 'term_length' to be a int")
        pulumi.set(__self__, "term_length", term_length)
        if throughput and not isinstance(throughput, int):
            raise TypeError("Expected argument 'throughput' to be a int")
        pulumi.set(__self__, "throughput", throughput)
        if throughput_unit and not isinstance(throughput_unit, str):
            raise TypeError("Expected argument 'throughput_unit' to be a str")
        pulumi.set(__self__, "throughput_unit", throughput_unit)
        if type_code and not isinstance(type_code, str):
            raise TypeError("Expected argument 'type_code' to be a str")
        pulumi.set(__self__, "type_code", type_code)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)
        if valid_status_list and not isinstance(valid_status_list, str):
            raise TypeError("Expected argument 'valid_status_list' to be a str")
        pulumi.set(__self__, "valid_status_list", valid_status_list)
        if vendor_configuration and not isinstance(vendor_configuration, dict):
            raise TypeError("Expected argument 'vendor_configuration' to be a dict")
        pulumi.set(__self__, "vendor_configuration", vendor_configuration)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if wan_interface_id and not isinstance(wan_interface_id, str):
            raise TypeError("Expected argument 'wan_interface_id' to be a str")
        pulumi.set(__self__, "wan_interface_id", wan_interface_id)
        if zone_code and not isinstance(zone_code, str):
            raise TypeError("Expected argument 'zone_code' to be a str")
        pulumi.set(__self__, "zone_code", zone_code)

    @property
    @pulumi.getter(name="accountNumber")
    def account_number(self) -> str:
        return pulumi.get(self, "account_number")

    @property
    @pulumi.getter(name="aclTemplateId")
    def acl_template_id(self) -> str:
        """
        Unique identifier of applied ACL template
        """
        return pulumi.get(self, "acl_template_id")

    @property
    @pulumi.getter(name="additionalBandwidth")
    def additional_bandwidth(self) -> int:
        return pulumi.get(self, "additional_bandwidth")

    @property
    @pulumi.getter
    def asn(self) -> int:
        """
        Autonomous system number
        """
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter
    def byol(self) -> bool:
        return pulumi.get(self, "byol")

    @property
    @pulumi.getter(name="clusterDetails")
    def cluster_details(self) -> Sequence['outputs.GetDeviceClusterDetailResult']:
        return pulumi.get(self, "cluster_details")

    @property
    @pulumi.getter
    def connectivity(self) -> str:
        """
        Device accessibility (INTERNET-ACCESS or PRIVATE or INTERNET-ACCESS-WITH-PRVT-MGMT)
        """
        return pulumi.get(self, "connectivity")

    @property
    @pulumi.getter(name="coreCount")
    def core_count(self) -> int:
        return pulumi.get(self, "core_count")

    @property
    @pulumi.getter(name="diverseDeviceId")
    def diverse_device_id(self) -> str:
        """
        diverse device uuid
        """
        return pulumi.get(self, "diverse_device_id")

    @property
    @pulumi.getter(name="diverseDeviceName")
    def diverse_device_name(self) -> str:
        """
        Name of the device with diverse device UUID
        """
        return pulumi.get(self, "diverse_device_name")

    @property
    @pulumi.getter
    def hostname(self) -> str:
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def ibx(self) -> str:
        """
        Device location Equinix Business Exchange name
        """
        return pulumi.get(self, "ibx")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="interfaceCount")
    def interface_count(self) -> int:
        return pulumi.get(self, "interface_count")

    @property
    @pulumi.getter
    def interfaces(self) -> Sequence['outputs.GetDeviceInterfaceResult']:
        """
        List of device interfaces
        * `interface.#.id` - interface identifier
        * `interface.#.name` - interface name
        * `interface.#.status` -  interface status (AVAILABLE, RESERVED, ASSIGNED)
        * `interface.#.operational_status` - interface operational status (up or down)
        * `interface.#.mac_address` - interface MAC address
        * `interface.#.ip_address` - interface IP address
        * `interface.#.assigned_type` - interface management type (Equinix Managed or empty)
        * `interface.#.type` - interface type
        """
        return pulumi.get(self, "interfaces")

    @property
    @pulumi.getter(name="licenseFile")
    def license_file(self) -> str:
        return pulumi.get(self, "license_file")

    @property
    @pulumi.getter(name="licenseFileId")
    def license_file_id(self) -> str:
        """
        Unique identifier of applied license file
        """
        return pulumi.get(self, "license_file_id")

    @property
    @pulumi.getter(name="licenseStatus")
    def license_status(self) -> str:
        """
        Device license registration status
        * APPLYING_LICENSE
        * REGISTERED
        * APPLIED
        * WAITING_FOR_CLUSTER_SETUP
        * REGISTRATION_FAILED
        * NA
        """
        return pulumi.get(self, "license_status")

    @property
    @pulumi.getter(name="licenseToken")
    def license_token(self) -> str:
        return pulumi.get(self, "license_token")

    @property
    @pulumi.getter(name="metroCode")
    def metro_code(self) -> str:
        return pulumi.get(self, "metro_code")

    @property
    @pulumi.getter(name="mgmtAclTemplateUuid")
    def mgmt_acl_template_uuid(self) -> str:
        return pulumi.get(self, "mgmt_acl_template_uuid")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence[str]:
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter(name="orderReference")
    def order_reference(self) -> str:
        return pulumi.get(self, "order_reference")

    @property
    @pulumi.getter(name="packageCode")
    def package_code(self) -> str:
        return pulumi.get(self, "package_code")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="purchaseOrderNumber")
    def purchase_order_number(self) -> str:
        return pulumi.get(self, "purchase_order_number")

    @property
    @pulumi.getter(name="redundancyType")
    def redundancy_type(self) -> str:
        """
        Device redundancy type applicable for HA devices, either
        primary or secondary
        """
        return pulumi.get(self, "redundancy_type")

    @property
    @pulumi.getter(name="redundantId")
    def redundant_id(self) -> str:
        """
        Unique identifier for a redundant device applicable for HA devices
        """
        return pulumi.get(self, "redundant_id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Device location region
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secondaryDevices")
    def secondary_devices(self) -> Sequence['outputs.GetDeviceSecondaryDeviceResult']:
        return pulumi.get(self, "secondary_devices")

    @property
    @pulumi.getter(name="selfManaged")
    def self_managed(self) -> bool:
        return pulumi.get(self, "self_managed")

    @property
    @pulumi.getter(name="sshIpAddress")
    def ssh_ip_address(self) -> str:
        """
        IP address of SSH enabled interface on the device
        """
        return pulumi.get(self, "ssh_ip_address")

    @property
    @pulumi.getter(name="sshIpFqdn")
    def ssh_ip_fqdn(self) -> str:
        """
        FQDN of SSH enabled interface on the device
        """
        return pulumi.get(self, "ssh_ip_fqdn")

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Sequence['outputs.GetDeviceSshKeyResult']:
        return pulumi.get(self, "ssh_keys")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Device provisioning status
        * INITIALIZING
        * PROVISIONING
        * PROVISIONED  (**NOTE: By default data source will only return devices in this state.  To include other states see `valid_state_list`**)
        * WAITING_FOR_PRIMARY
        * WAITING_FOR_SECONDARY
        * WAITING_FOR_REPLICA_CLUSTER_NODES
        * CLUSTER_SETUP_IN_PROGRESS
        * FAILED
        * DEPROVISIONING
        * DEPROVISIONED
        * RESOURCE_UPGRADE_IN_PROGRESS
        * RESOURCE_UPGRADE_FAILED
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="termLength")
    def term_length(self) -> int:
        return pulumi.get(self, "term_length")

    @property
    @pulumi.getter
    def throughput(self) -> int:
        return pulumi.get(self, "throughput")

    @property
    @pulumi.getter(name="throughputUnit")
    def throughput_unit(self) -> str:
        return pulumi.get(self, "throughput_unit")

    @property
    @pulumi.getter(name="typeCode")
    def type_code(self) -> str:
        return pulumi.get(self, "type_code")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        Device unique identifier
        """
        return pulumi.get(self, "uuid")

    @property
    @pulumi.getter(name="validStatusList")
    def valid_status_list(self) -> Optional[str]:
        """
        Comma separated list of device states (from see `status` for full list) to be considered valid. Default is 'PROVISIONED'.  Case insensitive.
        """
        return pulumi.get(self, "valid_status_list")

    @property
    @pulumi.getter(name="vendorConfiguration")
    def vendor_configuration(self) -> Mapping[str, str]:
        return pulumi.get(self, "vendor_configuration")

    @property
    @pulumi.getter
    def version(self) -> str:
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="wanInterfaceId")
    def wan_interface_id(self) -> str:
        return pulumi.get(self, "wan_interface_id")

    @property
    @pulumi.getter(name="zoneCode")
    def zone_code(self) -> str:
        """
        Device location zone code
        """
        return pulumi.get(self, "zone_code")


class AwaitableGetDeviceResult(GetDeviceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceResult(
            account_number=self.account_number,
            acl_template_id=self.acl_template_id,
            additional_bandwidth=self.additional_bandwidth,
            asn=self.asn,
            byol=self.byol,
            cluster_details=self.cluster_details,
            connectivity=self.connectivity,
            core_count=self.core_count,
            diverse_device_id=self.diverse_device_id,
            diverse_device_name=self.diverse_device_name,
            hostname=self.hostname,
            ibx=self.ibx,
            id=self.id,
            interface_count=self.interface_count,
            interfaces=self.interfaces,
            license_file=self.license_file,
            license_file_id=self.license_file_id,
            license_status=self.license_status,
            license_token=self.license_token,
            metro_code=self.metro_code,
            mgmt_acl_template_uuid=self.mgmt_acl_template_uuid,
            name=self.name,
            notifications=self.notifications,
            order_reference=self.order_reference,
            package_code=self.package_code,
            project_id=self.project_id,
            purchase_order_number=self.purchase_order_number,
            redundancy_type=self.redundancy_type,
            redundant_id=self.redundant_id,
            region=self.region,
            secondary_devices=self.secondary_devices,
            self_managed=self.self_managed,
            ssh_ip_address=self.ssh_ip_address,
            ssh_ip_fqdn=self.ssh_ip_fqdn,
            ssh_keys=self.ssh_keys,
            status=self.status,
            term_length=self.term_length,
            throughput=self.throughput,
            throughput_unit=self.throughput_unit,
            type_code=self.type_code,
            uuid=self.uuid,
            valid_status_list=self.valid_status_list,
            vendor_configuration=self.vendor_configuration,
            version=self.version,
            wan_interface_id=self.wan_interface_id,
            zone_code=self.zone_code)


def get_device(name: Optional[str] = None,
               uuid: Optional[str] = None,
               valid_status_list: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceResult:
    """
    Use this data source to get Equinix Network Edge device details.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    by_uuid = equinix.networkedge.get_device(uuid="f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee")
    by_name = equinix.networkedge.get_device(name="Arcus-Gateway-A1")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of an existing Equinix Network Edge device
    :param str uuid: UUID of an existing Equinix Network Edge device
    :param str valid_status_list: Device states to be considered valid when searching for a device by name
           
           NOTE: Exactly one of either `uuid` or `name` must be specified.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['uuid'] = uuid
    __args__['validStatusList'] = valid_status_list
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('equinix:networkedge/getDevice:getDevice', __args__, opts=opts, typ=GetDeviceResult).value

    return AwaitableGetDeviceResult(
        account_number=pulumi.get(__ret__, 'account_number'),
        acl_template_id=pulumi.get(__ret__, 'acl_template_id'),
        additional_bandwidth=pulumi.get(__ret__, 'additional_bandwidth'),
        asn=pulumi.get(__ret__, 'asn'),
        byol=pulumi.get(__ret__, 'byol'),
        cluster_details=pulumi.get(__ret__, 'cluster_details'),
        connectivity=pulumi.get(__ret__, 'connectivity'),
        core_count=pulumi.get(__ret__, 'core_count'),
        diverse_device_id=pulumi.get(__ret__, 'diverse_device_id'),
        diverse_device_name=pulumi.get(__ret__, 'diverse_device_name'),
        hostname=pulumi.get(__ret__, 'hostname'),
        ibx=pulumi.get(__ret__, 'ibx'),
        id=pulumi.get(__ret__, 'id'),
        interface_count=pulumi.get(__ret__, 'interface_count'),
        interfaces=pulumi.get(__ret__, 'interfaces'),
        license_file=pulumi.get(__ret__, 'license_file'),
        license_file_id=pulumi.get(__ret__, 'license_file_id'),
        license_status=pulumi.get(__ret__, 'license_status'),
        license_token=pulumi.get(__ret__, 'license_token'),
        metro_code=pulumi.get(__ret__, 'metro_code'),
        mgmt_acl_template_uuid=pulumi.get(__ret__, 'mgmt_acl_template_uuid'),
        name=pulumi.get(__ret__, 'name'),
        notifications=pulumi.get(__ret__, 'notifications'),
        order_reference=pulumi.get(__ret__, 'order_reference'),
        package_code=pulumi.get(__ret__, 'package_code'),
        project_id=pulumi.get(__ret__, 'project_id'),
        purchase_order_number=pulumi.get(__ret__, 'purchase_order_number'),
        redundancy_type=pulumi.get(__ret__, 'redundancy_type'),
        redundant_id=pulumi.get(__ret__, 'redundant_id'),
        region=pulumi.get(__ret__, 'region'),
        secondary_devices=pulumi.get(__ret__, 'secondary_devices'),
        self_managed=pulumi.get(__ret__, 'self_managed'),
        ssh_ip_address=pulumi.get(__ret__, 'ssh_ip_address'),
        ssh_ip_fqdn=pulumi.get(__ret__, 'ssh_ip_fqdn'),
        ssh_keys=pulumi.get(__ret__, 'ssh_keys'),
        status=pulumi.get(__ret__, 'status'),
        term_length=pulumi.get(__ret__, 'term_length'),
        throughput=pulumi.get(__ret__, 'throughput'),
        throughput_unit=pulumi.get(__ret__, 'throughput_unit'),
        type_code=pulumi.get(__ret__, 'type_code'),
        uuid=pulumi.get(__ret__, 'uuid'),
        valid_status_list=pulumi.get(__ret__, 'valid_status_list'),
        vendor_configuration=pulumi.get(__ret__, 'vendor_configuration'),
        version=pulumi.get(__ret__, 'version'),
        wan_interface_id=pulumi.get(__ret__, 'wan_interface_id'),
        zone_code=pulumi.get(__ret__, 'zone_code'))


@_utilities.lift_output_func(get_device)
def get_device_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                      uuid: Optional[pulumi.Input[Optional[str]]] = None,
                      valid_status_list: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeviceResult]:
    """
    Use this data source to get Equinix Network Edge device details.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_equinix as equinix

    by_uuid = equinix.networkedge.get_device(uuid="f0b5c553-cdeb-4bc3-95b8-23db9ccfd5ee")
    by_name = equinix.networkedge.get_device(name="Arcus-Gateway-A1")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of an existing Equinix Network Edge device
    :param str uuid: UUID of an existing Equinix Network Edge device
    :param str valid_status_list: Device states to be considered valid when searching for a device by name
           
           NOTE: Exactly one of either `uuid` or `name` must be specified.
    """
    ...
