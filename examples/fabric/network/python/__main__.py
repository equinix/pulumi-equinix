import pulumi
import pulumi_equinix as equinix

new_network = equinix.fabric.Network("newNetwork",
    name="Network-SV",
    type="EVPLAN",
    scope="GLOBAL",
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    project={
        "project_id": "776847000642406",
    })
