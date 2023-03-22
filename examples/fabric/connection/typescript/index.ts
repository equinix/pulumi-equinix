import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const speedInMbps = config.getNumber("speedInMbps") || 50;
const linkProtocolType = config.get("linkProtocolType") || "QINQ";
const linkProtocolStag = config.getNumber("linkProtocolStag") || 2019;
const linkProtocolCtag = config.getNumber("linkProtocolCtag") || 2112;
const portName = config.require("portName");
const serviceProfileName = config.get("serviceProfileName") || "AWS Direct Connect";
const serviceProfileRegion = config.get("serviceProfileRegion") || "us-west-1";
const serviceProfileMetro = config.get("serviceProfileMetro") || "SV";
const serviceProfileAuthKey = config.require("serviceProfileAuthKey");
const serviceProfileId = equinix.fabric.getServiceProfiles({
    filter: {
        property: "/name",
        operator: "=",
        values: [serviceProfileName],
    },
}).then(invoke => invoke.data?.uuid);
const portId = equinix.fabric.getPorts({
    filters: [{
        name: portName,
    }],
}).then(invoke => invoke.data?.uuid);
const colo2Aws = new equinix.fabric.Connection("colo2Aws", {
    name: "colo2Aws",
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
                type: linkProtocolType,
                vlanSTag: linkProtocolStag,
                vlanTag: linkProtocolCtag,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: "SP",
            authenticationKey: serviceProfileAuthKey,
            sellerRegion: serviceProfileRegion,
            profile: {
                type: "L2_PROFILE",
                uuid: serviceProfileId,
            },
            location: {
                metroCode: serviceProfileMetro,
            },
        },
    },
});
export const connectionId = pulumi.interpolate`http://${colo2Aws.id}`;
