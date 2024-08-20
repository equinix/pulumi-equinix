import pulumi
import pulumi_equinix as equinix

fcr2_port = equinix.fabric.Connection("fcr2port",
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
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionZSideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                vlan_tag=2711,
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
