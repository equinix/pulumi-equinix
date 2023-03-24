import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
description = config.get("description")
if description is None:
    description = "An user level API Key"
read_only = config.get_bool("readOnly")
if read_only is None:
    read_only = False
api_key = equinix.metal.UserApiKey("apiKey",
    description=description,
    read_only=read_only)
pulumi.export("apiKeyToken", api_key.token)
