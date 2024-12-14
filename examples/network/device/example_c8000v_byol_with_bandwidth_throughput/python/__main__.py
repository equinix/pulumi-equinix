import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c8000_v_byol_throughput = equinix.networkedge.Device("c8000v-byol-throughput",
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="VM100",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    throughput=100,
    throughput_unit=equinix.networkedge.ThroughputUnit.MBPS,
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
