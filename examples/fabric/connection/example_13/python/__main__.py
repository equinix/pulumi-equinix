import pulumi
import pulumi_equinix as equinix

vd2_token = equinix.fabric.Connection("vd2token",
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
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="CLOUD",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.NETWORK,
            network=equinix.fabric.ConnectionZSideAccessPointNetworkArgs(
                uuid="<network_uuid>",
            ),
        ),
    ))
