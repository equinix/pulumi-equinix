import pulumi
import pulumi_equinix as equinix

access_epl_vc = equinix.fabric.Connection("accessEplVc",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.ACCESS_EPL,
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
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                vlan_s_tag=1976,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<zside_port_uuid>",
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
