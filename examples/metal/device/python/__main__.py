import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
web = equinix.metal.Device("web",
    hostname="webserver1",
    plan="c3.small.x86",
    operating_system="ubuntu_20_04",
    metro="sv",
    billing_cycle="hourly",
    project_id=project_id)
pulumi.export("webPublicIp", web.access_public_ipv4.apply(lambda access_public_ipv4: f"http://{access_public_ipv4}"))
