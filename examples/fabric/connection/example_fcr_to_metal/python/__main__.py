import pulumi
import pulumi_equinix as equinix

fcr2_metal = equinix.fabric.Connection("fcr2metal",
    name="ConnectionName",
    type="IP_VC",
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
            type="CLOUD_ROUTER",
            router=equinix.fabric.ConnectionASideAccessPointRouterArgs(
                uuid="<cloud_router_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type="METAL_NETWORK",
            authentication_key="<metal_authorization_code>",
        ),
    ))
