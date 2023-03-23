import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 1000
connection = equinix.metal.Interconnection("connection",
    name="metal-to-cloudprovider",
    project_id=project_id,
    type="shared",
    redundancy="primary",
    metro=metro,
    speed=f"{speed_in_mbps}Mbps",
    service_token_type="a_side")
pulumi.export("connectionStatus", connection.status)
pulumi.export("connectionTokens", connection.service_tokens)
