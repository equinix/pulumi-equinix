import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
metro = config.get("metro")
if metro is None:
    metro = "FR"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 50
fabric_port_name = config.require("fabricPortName")
aws_region = config.get("awsRegion")
if aws_region is None:
    aws_region = "eu-central-1"
aws_account_id = config.require("awsAccountId")
service_profile_id = equinix.fabric.get_service_profiles(filter=equinix.fabric.GetServiceProfilesFilterArgs(
    property="/name",
    operator="=",
    values=["AWS Direct Connect"],
)).data[0].uuid
port_id = equinix.fabric.get_ports(filter=equinix.fabric.GetPortsFilterArgs(
    name=fabric_port_name,
)).data[0].uuid
colo2_aws = equinix.fabric.Connection("colo2Aws",
    name="Pulumi-colo2Aws",
    type="EVPL_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type="ALL",
        emails=["example@equinix.com"],
    )],
    bandwidth=speed_in_mbps,
    redundancy=equinix.fabric.ConnectionRedundancyArgs(
        priority="PRIMARY",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="COLO",
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid=port_id,
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type="DOT1Q",
                vlan_tag=1234,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type="SP",
            authentication_key=aws_account_id,
            seller_region=aws_region,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type="L2_PROFILE",
                uuid=service_profile_id,
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=metro,
            ),
        ),
    ))
pulumi.export("connectionId", colo2_aws.id)
pulumi.export("connectionStatus", colo2_aws.operation.equinix_status)
pulumi.export("connectionProviderStatus", colo2_aws.operation.provider_status)
pulumi.export("awsDirectConnectId", colo2_aws.z_side.access_point.provider_connection_id)
