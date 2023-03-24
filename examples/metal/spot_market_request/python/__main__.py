import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "FR"
request = equinix.metal.SpotMarketRequest("request",
    project_id=project_id,
    metro=metro,
    max_bid_price=0.75,
    devices_min=1,
    devices_max=1,
    instance_parameters=equinix.metal.SpotMarketRequestInstanceParametersArgs(
        hostname="testspot",
        billing_cycle="hourly",
        operating_system="ubuntu_20_04",
        plan="c3.small.x86",
    ))
pulumi.export("requestId", request.id)
