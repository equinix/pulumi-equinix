import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const profile = new equinix.fabric.ServiceProfile("profile", {
    name: "Example Cloud Provider",
    description: "50 to 500 Mbps Hosted Connection to Example Cloud",
    type: equinix.fabric.ProfileType.L2Profile,
    accessPointTypeConfigs: [{
        type: equinix.fabric.ProfileAccessPointType.Colo,
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
            integrationId: "Example-Connect-01",
            bandwidthFromApi: false,
        },
        connectionLabel: "Virtual Circuit Name",
        authenticationKey: {
            required: true,
            label: "Example ACCOUNT ID",
        },
    }],
    metros: undefined,
    visibility: equinix.fabric.ProfileVisibility.Public,
    marketingInfo: {
        promotion: true,
    },
});
export const profileId = profile.id;
