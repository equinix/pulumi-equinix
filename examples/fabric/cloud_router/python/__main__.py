import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
metro = config.get("metro")
if metro is None:
    metro = "FR"
account_num = config.require_int("accountNum")
router = equinix.fabric.CloudRouter("router",
    name="My-Fabric-Cloud-Router",
    type="XF_ROUTER",
    location=equinix.fabric.CloudRouterLocationArgs(
        metro_code=metro,
    ),
    package=equinix.fabric.CloudRouterPackageArgs(
        code="BASIC",
    ),
    notifications=[equinix.fabric.CloudRouterNotificationArgs(
        type="ALL",
        emails=["example@equinix.com"],
    )],
    account=equinix.fabric.CloudRouterAccountArgs(
        account_number=272010,
    ))
pulumi.export("routerId", router.id)
