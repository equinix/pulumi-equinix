import pulumi
import pulumi_equinix as equinix

new_network = equinix.fabric.Network("new_network",
    project={
        "project_id": "776847000642406",
    },
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="Network-SV",
    type="EVPLAN",
    scope="GLOBAL")
