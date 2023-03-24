import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const metro = config.get("metro") || "FR";
const speedInMbps = config.getNumber("speedInMbps") || 50;
const fabricPortName = config.require("fabricPortName");
const awsRegion = config.get("awsRegion") || "eu-central-1";
const awsAccountId = config.require("awsAccountId");
const serviceProfileId = equinix.fabric.getServiceProfiles({
    filter: {
        property: "/name",
        operator: "=",
        values: ["AWS Direct Connect"],
    },
}).then(invoke => invoke.data?.[0]?.uuid);
const portId = equinix.fabric.getPorts({
    filter: {
        name: fabricPortName,
    },
}).then(invoke => invoke.data?.[0]?.uuid);
const colo2Aws = new equinix.fabric.Connection("colo2Aws", {
    name: "Pulumi-colo2Aws",
    type: "EVPL_VC",
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
    bandwidth: speedInMbps,
    redundancy: {
        priority: "PRIMARY",
    },
    aSide: {
        accessPoint: {
            type: "COLO",
            port: {
                uuid: portId,
            },
            linkProtocol: {
                type: "DOT1Q",
                vlanTag: 1234,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: "SP",
            authenticationKey: awsAccountId,
            sellerRegion: awsRegion,
            profile: {
                type: "L2_PROFILE",
                uuid: serviceProfileId,
            },
            location: {
                metroCode: metro,
            },
        },
    },
});
export const connectionId = colo2Aws.id;
export const connectionStatus = colo2Aws.operation.apply(operation => operation.equinixStatus);
export const connectionProviderStatus = colo2Aws.operation.apply(operation => operation.providerStatus);
export const awsDirectConnectId = colo2Aws.zSide.apply(zSide => zSide.accessPoint?.providerConnectionId);
