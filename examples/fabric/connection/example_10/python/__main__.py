import pulumi
import pulumi_equinix as equinix

vd2_azure = equinix.fabric.Connection("vd2azure",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
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
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<Azure_ExpressRouter_Auth_Key>",
            peering_type=equinix.fabric.AccessPointPeeringType.PRIVATE,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<Azure_Service_Profile_UUID>",
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
