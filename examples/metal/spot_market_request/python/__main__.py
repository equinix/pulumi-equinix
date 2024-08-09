import pulumi
import pulumi_equinix as equinix

req = equinix.metal.SpotMarketRequest("req",
    project_id=project_id,
    max_bid_price=0.03,
    metro="ny",
    devices_min=1,
    devices_max=1,
    instance_parameters={
        "hostname": "testspot",
        "billing_cycle": "hourly",
        "operating_system": "ubuntu_20_04",
        "plan": "c3.small.x86",
    })
