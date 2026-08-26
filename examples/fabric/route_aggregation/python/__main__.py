import pulumi
import pulumi_equinix as equinix

new_ra = equinix.fabric.RouteAggregation("new-ra",
    type="BGP_IPv4_PREFIX_AGGREGATION",
    name="new-ra",
    description="Test aggregation",
    project={
        "project_id": "776847000642406",
    })
