import pulumi
import pulumi_equinix as equinix

metal2_aws = equinix.fabric.Connection("metal2aws",
    name="ConnectionName",
    type="EVPLAN_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="METAL_NETWORK",
            authentication_key="<metal_authorization_code>",
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<aws_account_id>",
            seller_region="us-west-1",
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<service_profile_uuid>",
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
