import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 50
profile = equinix.fabric.ServiceProfile("profile",
    name="FOO Cloud",
    description="50 to 500 Mbps Hosted Connection to Foo Cloud",
    type="L2_PROFILE",
    access_point_type_configs=[equinix.fabric.ServiceProfileAccessPointTypeConfigArgs(
        type="COLO",
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
            integration_id="Foo-Connect-01",
            bandwidth_from_api=False,
        ),
        connection_label="Virtual Circuit Name",
        authentication_key=equinix.fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(
            required=True,
            label="FOO ACCOUNT ID",
        ),
    )],
    account=equinix.fabric.ServiceProfileAccountArgs(
        organization_name="Foo",
        global_organization_name="Foo Global",
    ),
    metros=None,
    visibility="PUBLIC",
    marketing_info=equinix.fabric.ServiceProfileMarketingInfoArgs(
        promotion=True,
    ))
pulumi.export("profileId", profile.id)
