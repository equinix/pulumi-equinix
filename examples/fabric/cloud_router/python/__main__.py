import pulumi
import pulumi_equinix as equinix

new_cloud_router = equinix.fabric.CloudRouter("newCloudRouter",
    name="Router-SV",
    type="XF_ROUTER",
    notifications=[equinix.fabric.CloudRouterNotificationArgs(
        type="ALL",
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    order=equinix.fabric.CloudRouterOrderArgs(
        purchase_order_number="1-323292",
    ),
    location=equinix.fabric.CloudRouterLocationArgs(
        metro_code="SV",
    ),
    package=equinix.fabric.CloudRouterPackageArgs(
        code="STANDARD",
    ),
    project=equinix.fabric.CloudRouterProjectArgs(
        project_id="776847000642406",
    ),
    account=equinix.fabric.CloudRouterAccountArgs(
        account_number=203612,
    ))
