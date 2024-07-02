import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const metro = config.get("metro") || "FR";
const speedInMbps = config.getNumber("speedInMbps") || 50;
const fabricPortName = config.require("fabricPortName");
const awsRegion = config.get("awsRegion") || "eu-central-1";
const awsAccountId = config.require("awsAccountId");
const serviceProfileId = equinix.fabric.getServiceProfilesOutput({
    filter: {
        property: "/name",
        operator: "=",
        values: ["AWS Direct Connect"],
    },
}).apply(invoke => invoke.data?.[0]?.uuid);
const portId = equinix.fabric.getPortsOutput({
    filter: {
        name: fabricPortName,
    },
}).apply(invoke => invoke.data?.[0]?.uuid);
const colo2Aws = new equinix.fabric.Connection("colo2Aws", {
    name: "Pulumi-colo2Aws",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["example@equinix.com"],
    }],
    bandwidth: speedInMbps,
    redundancy: {
        priority: "PRIMARY",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: portId,
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 1234,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: awsAccountId,
            sellerRegion: awsRegion,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
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
