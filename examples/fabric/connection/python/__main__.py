import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 50
link_protocol_type = config.get("linkProtocolType")
if link_protocol_type is None:
    link_protocol_type = "QINQ"
link_protocol_stag = config.get_int("linkProtocolStag")
if link_protocol_stag is None:
    link_protocol_stag = 2019
link_protocol_ctag = config.get_int("linkProtocolCtag")
if link_protocol_ctag is None:
    link_protocol_ctag = 2112
port_name = config.require("portName")
service_profile_name = config.get("serviceProfileName")
if service_profile_name is None:
    service_profile_name = "AWS Direct Connect"
service_profile_region = config.get("serviceProfileRegion")
if service_profile_region is None:
    service_profile_region = "us-west-1"
service_profile_metro = config.get("serviceProfileMetro")
if service_profile_metro is None:
    service_profile_metro = "SV"
service_profile_auth_key = config.require("serviceProfileAuthKey")
service_profile_id = equinix.fabric.get_service_profiles(filter=equinix.fabric.GetServiceProfilesFilterArgs(
    property="/name",
    operator="=",
    values=[service_profile_name],
)).data.uuid
port_id = equinix.fabric.get_ports(filters=[equinix.fabric.GetPortsFilterArgs(
    name=port_name,
)]).data.uuid
colo2_aws = equinix.fabric.Connection("colo2Aws",
    name="colo2Aws",
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
                type=link_protocol_type,
                vlan_s_tag=link_protocol_stag,
                vlan_tag=link_protocol_ctag,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type="SP",
            authentication_key=service_profile_auth_key,
            seller_region=service_profile_region,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type="L2_PROFILE",
                uuid=service_profile_id,
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=service_profile_metro,
            ),
        ),
    ))
pulumi.export("connectionId", colo2_aws.id.apply(lambda id: f"http://{id}"))
