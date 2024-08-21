import pulumi
import pulumi_equinix as equinix

dc = equinix.networkedge.get_account_output(metro_code="DC")
sv = equinix.networkedge.get_account_output(metro_code="SV")
csr1000_v_ha = equinix.networkedge.Device("csr1000vHa",
    name="tf-csr1000v-p",
    throughput=500,
    throughput_unit=equinix.networkedge.ThroughputUnit.MBPS,
    metro_code=dc.metro_code,
    type_code="CSR1000V",
    self_managed=False,
    connectivity="INTERNET-ACCESS",
    byol=False,
    package_code="SEC",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    hostname="csr1000v-p",
    term_length=12,
    account_number=dc.number,
    version="16.09.05",
    core_count=2,
    secondary_device={
        "name": "tf-csr1000v-s",
        "metro_code": sv.metro_code,
        "hostname": "csr1000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
    })
