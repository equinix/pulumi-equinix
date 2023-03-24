import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
account_name = config.require("accountName")
license_token = config.require("licenseToken")
ssh_user_name = config.require("sshUserName")
ssh_key_name = config.require("sshKeyName")
acl_template_id = config.require("aclTemplateId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
device_package_code = config.get("devicePackageCode")
if device_package_code is None:
    device_package_code = "network-essentials"
device_version = config.get("deviceVersion")
if device_version is None:
    device_version = "17.06.01a"
size_in_cores = config.get_int("sizeInCores")
if size_in_cores is None:
    size_in_cores = 2
term_length = config.get_int("termLength")
if term_length is None:
    term_length = 6
additional_bandwidth = config.get_int("additionalBandwidth")
if additional_bandwidth is None:
    additional_bandwidth = 5
account_num = equinix.networkedge.get_account(name=account_name,
    metro_code=metro).number
c8_k_router = equinix.networkedge.Device("c8kRouter",
    name="catalystRouter",
    metro_code=metro,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code=device_package_code,
    notifications=["example@equinix.com"],
    hostname="C8KV",
    account_number=account_num,
    version=version,
    core_count=size_in_cores,
    term_length=term_length,
    license_token=license_token,
    additional_bandwidth=additional_bandwidth,
    ssh_key=equinix.networkedge.DeviceSshKeyArgs(
        username=ssh_user_name,
        key_name=ssh_key_name,
    ),
    acl_template_id=acl_template_id)
pulumi.export("routerId", c8_k_router.id)
pulumi.export("provisionStatus", c8_k_router.status)
pulumi.export("licenseStatus", c8_k_router.license_status)
pulumi.export("sshIpAddress", c8_k_router.ssh_ip_address)
