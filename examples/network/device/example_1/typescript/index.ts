import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const dc = equinix.networkedge.getAccountOutput({
    metroCode: "DC",
});
const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const csr1000VHa = new equinix.networkedge.Device("csr1000vHa", {
    name: "tf-csr1000v-p",
    throughput: 500,
    throughputUnit: equinix.networkedge.ThroughputUnit.Mbps,
    metroCode: dc.apply(dc => dc.metroCode),
    typeCode: "CSR1000V",
    selfManaged: false,
    connectivity: "INTERNET-ACCESS",
    byol: false,
    packageCode: "SEC",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    hostname: "csr1000v-p",
    termLength: 12,
    accountNumber: dc.apply(dc => dc.number),
    version: "16.09.05",
    coreCount: 2,
    secondaryDevice: {
        name: "tf-csr1000v-s",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr1000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
    },
});
