import pulumi
import pulumi_equinix as equinix

new_service_profile = equinix.fabric.ServiceProfile("newServiceProfile",
    description="Service Profile for Receiving Connections",
    name="Name Of Business + Use Case Tag",
    type=equinix.fabric.ProfileType.L2_PROFILE,
    visibility=equinix.fabric.ProfileVisibility.PUBLIC,
    notifications=[equinix.fabric.ServiceProfileNotificationArgs(
        emails=["someone@sample.com"],
        type="BANDWIDTH_ALERT",
    )],
    allowed_emails=[
        "test@equinix.com",
        "testagain@equinix.com",
    ],
    ports=[equinix.fabric.ServiceProfilePortArgs(
        uuid="c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
        type="XF_PORT",
    )],
    access_point_type_configs=[equinix.fabric.ServiceProfileAccessPointTypeConfigArgs(
        type=equinix.fabric.ProfileAccessPointType.COLO,
        allow_remote_connections=True,
        allow_custom_bandwidth=True,
        allow_bandwidth_auto_approval=False,
        connection_redundancy_required=False,
        connection_label="Service Profile Tag1",
        bandwidth_alert_threshold=10,
        supported_bandwidths=[
            100,
            500,
        ],
    )])
