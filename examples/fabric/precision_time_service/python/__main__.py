import pulumi

pulumi.export("eptServiceId", ptp["id"])
pulumi.export("eptServiceName", ptp["name"])
pulumi.export("eptServiceState", ptp["state"])
pulumi.export("eptServiceType", ptp["type"])
pulumi.export("eptServiceConnection", ptp["connections"])
pulumi.export("eptServiceIpv4", ptp["ipv4"])
