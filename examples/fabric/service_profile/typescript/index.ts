import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const speedInMbps = config.getNumber("speedInMbps") || 50;
const profile = new equinix.fabric.ServiceProfile("profile", {
    name: "FOO Cloud",
    description: "50 to 500 Mbps Hosted Connection to Foo Cloud",
    type: "L2_PROFILE",
    accessPointTypeConfigs: [{
        type: "COLO",
        supportedBandwidths: [
            50,
            100,
            200,
            500,
        ],
        allowRemoteConnections: true,
        allowCustomBandwidth: false,
        allowBandwidthAutoApproval: false,
        linkProtocolConfig: {
            encapsulationStrategy: "CTAGED",
            reuseVlanSTag: false,
            encapsulation: "DOT1Q",
        },
        enableAutoGenerateServiceKey: "false,",
        connectionRedundancyRequired: "false,",
        apiConfig: {
            apiAvailable: true,
            integrationId: "Foo-Connect-01",
            bandwidthFromApi: false,
        },
        connectionLabel: "Virtual Circuit Name",
        authenticationKey: {
            required: true,
            label: "FOO ACCOUNT ID",
        },
    }],
    account: {
        organizationName: "Foo",
        globalOrganizationName: "Foo Global",
    },
    metros: undefined,
    visibility: "PUBLIC",
    marketingInfo: {
        promotion: true,
    },
});
export const profileId = profile.id;
