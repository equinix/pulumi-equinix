import pulumi
import pulumi_equinix as equinix

profile = equinix.fabric.ServiceProfile("profile",
    name="Example Cloud Provider",
    description="50 to 500 Mbps Hosted Connection to Example Cloud",
    type=equinix.fabric.ProfileType.L2_PROFILE,
    access_point_type_configs=[equinix.fabric.ServiceProfileAccessPointTypeConfigArgs(
        type=equinix.fabric.ProfileAccessPointType.COLO,
        supported_bandwidths=[
            50,
            100,
            200,
            500,
        ],
        allow_remote_connections=True,
        allow_custom_bandwidth=False,
        allow_bandwidth_auto_approval=False,
        link_protocol_config=equinix.fabric.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs(
            encapsulation_strategy="CTAGED",
            reuse_vlan_s_tag=False,
            encapsulation="DOT1Q",
        ),
        enable_auto_generate_service_key="false,",
        connection_redundancy_required="false,",
        api_config=equinix.fabric.ServiceProfileAccessPointTypeConfigApiConfigArgs(
            api_available=True,
            integration_id="Example-Connect-01",
            bandwidth_from_api=False,
        ),
        connection_label="Virtual Circuit Name",
        authentication_key=equinix.fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(
            required=True,
            label="Example ACCOUNT ID",
        ),
    )],
    metros=None,
    visibility=equinix.fabric.ProfileVisibility.PUBLIC,
    marketing_info=equinix.fabric.ServiceProfileMarketingInfoArgs(
        promotion=True,
    ))
pulumi.export("profileId", profile.id)
