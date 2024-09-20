import pulumi
import pulumi_equinix as equinix

new_cloud_router = equinix.fabric.CloudRouter("newCloudRouter",
    name="Router-SV",
    type="XF_ROUTER",
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    order={
        "purchase_order_number": "1-323292",
    },
    location={
        "metro_code": "SV",
    },
    package={
        "code": "STANDARD",
    },
    project={
        "project_id": "776847000642406",
    },
    marketplace_subscription={
        "type": "AWS_MARKETPLACE_SUBSCRIPTION",
        "uuid": "2823b8ae07-a2a2-45b4-a658-c3542bb24e9",
    })
