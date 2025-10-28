import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
a_rubaedgeconnectam = equinix.networkedge.Device("ARUBA-EDGECONNECT-AM",
    name="TF_Aruba_Edge_Connect",
    project_id="XXXXX",
    metro_code=sv.metro_code,
    type_code="EDGECONNECT-SDWAN",
    self_managed=True,
    byol=True,
    package_code="EC-V",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.4.2.3",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    interface_count=32,
    acl_template_id="XXXXXXX",
    purchase_order_number="PO-Primary-Account-123",
    vendor_configuration={
        "accountKey": "xxxxx",
        "accountName": "xxxx",
        "applianceTag": "tests",
        "hostname": "test",
    },
    secondary_device={
        "name": "TF_CHECKPOINT",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "purchase_order_number": "PO-Secondary-Account-123",
        "acl_template_id": "XXXXXXX",
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "accountKey": "xxxxx",
            "accountName": "xxxx",
            "applianceTag": "test",
            "hostname": "test",
        },
    })
