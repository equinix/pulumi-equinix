import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
read_only = config.get_bool("readOnly")
if read_only is None:
    read_only = False
api_key = equinix.metal.ProjectApiKey("apiKey",
    project_id=project_id,
    description="A project level API Key",
    read_only=read_only)
pulumi.export("apiKeyToken", api_key.token)
