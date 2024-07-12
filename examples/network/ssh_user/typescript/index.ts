import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const john = new equinix.networkedge.SshUser("john", {
    username: "john",
    password: "secret",
    deviceIds: [
        "csr1000v-ha-uuid",
        "csr1000v-ha-redundant-uuid",
    ],
});
