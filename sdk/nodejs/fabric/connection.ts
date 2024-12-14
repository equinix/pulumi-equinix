// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### example fcr to azure
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const fcr2Azure = new equinix.fabric.Connection("fcr2azure", {
 *     name: "ConnectionName",
 *     type: "IP_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "CLOUD_ROUTER",
 *             router: {
 *                 uuid: "<cloud_router_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
 *             peeringType: equinix.fabric.AccessPointPeeringType.Private,
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<Azure_Service_Profile_UUID>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example fcr to metal
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const fcr2Metal = new equinix.fabric.Connection("fcr2metal", {
 *     name: "ConnectionName",
 *     type: "IP_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "CLOUD_ROUTER",
 *             router: {
 *                 uuid: "<cloud_router_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: "METAL_NETWORK",
 *             authenticationKey: "<metal_authorization_code>",
 *         },
 *     },
 * });
 * ```
 * ### example fcr to network
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const fcr2Network = new equinix.fabric.Connection("fcr2network", {
 *     name: "ConnectionName",
 *     type: "IPWAN_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "CLOUD_ROUTER",
 *             router: {
 *                 uuid: "<cloud_router_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Network,
 *             network: {
 *                 uuid: "<network_uuid>",
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example fcr to port
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const fcr2Port = new equinix.fabric.Connection("fcr2port", {
 *     name: "ConnectionName",
 *     type: "IP_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "CLOUD_ROUTER",
 *             router: {
 *                 uuid: "<cloud_router_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanTag: 2711,
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example metal to aws
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const metal2Aws = new equinix.fabric.Connection("metal2aws", {
 *     name: "ConnectionName",
 *     type: "EVPLAN_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "METAL_NETWORK",
 *             authenticationKey: "<metal_authorization_code>",
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<aws_account_id>",
 *             sellerRegion: "us-west-1",
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<service_profile_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to alibaba
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const port2Alibaba = new equinix.fabric.Connection("port2alibaba", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     redundancy: {
 *         priority: "PRIMARY",
 *     },
 *     order: {
 *         purchaseOrderNumber: "1-323929",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanTag: 2019,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<alibaba_account_id>",
 *             sellerRegion: "us-west-1",
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<service_profile_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to aws
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const port2Aws = new equinix.fabric.Connection("port2aws", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     redundancy: {
 *         priority: "PRIMARY",
 *     },
 *     order: {
 *         purchaseOrderNumber: "1-323929",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
 *                 vlanSTag: 2019,
 *                 vlanCTag: 2112,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<aws_account_id>",
 *             sellerRegion: "us-west-1",
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<service_profile_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 *     additionalInfo: [
 *         {
 *             key: "accessKey",
 *             value: "<aws_access_key>",
 *         },
 *         {
 *             key: "secretKey",
 *             value: "<aws_secret_key>",
 *         },
 *     ],
 * });
 * ```
 * ### example port to network eplan
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const eplan = new equinix.fabric.Connection("eplan", {
 *     name: "ConnectionName",
 *     type: "EPLAN_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Network,
 *             network: {
 *                 uuid: "<network_uuid>",
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to network evplan
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const evplan = new equinix.fabric.Connection("evplan", {
 *     name: "ConnectionName",
 *     type: "EVPLAN_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanSTag: 1976,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Network,
 *             network: {
 *                 uuid: "<network_uuid>",
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to port
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const port2Port = new equinix.fabric.Connection("port2port", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
 *                 vlanSTag: 1976,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<zside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
 *                 vlanSTag: 3711,
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to port access epl
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const accessEplVc = new equinix.fabric.Connection("accessEplVc", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.AccessEPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
 *                 vlanSTag: 1976,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<zside_port_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to port epl
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const epl = new equinix.fabric.Connection("epl", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<aside_port_uuid>",
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<zside_port_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example port to vd
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const vd2Port = new equinix.fabric.Connection("vd2port", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "NETWORK",
 *                 id: 7,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: "<zside_port_uuid>",
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanSTag: 3711,
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example token to aws
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const token2Aws = new equinix.fabric.Connection("token2aws", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         serviceToken: {
 *             uuid: "<service_token_uuid>",
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<aws_account_id>",
 *             sellerRegion: "us-west-1",
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<service_profile_uuid>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example vd to azure
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const vd2Azure = new equinix.fabric.Connection("vd2azure", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "CLOUD",
 *                 id: 7,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
 *             peeringType: equinix.fabric.AccessPointPeeringType.Private,
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<Azure_Service_Profile_UUID>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example vd to azure redundant
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const vd2AzurePrimary = new equinix.fabric.Connection("vd2azurePrimary", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     redundancy: {
 *         priority: "PRIMARY",
 *     },
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "CLOUD",
 *                 id: 7,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
 *             peeringType: equinix.fabric.AccessPointPeeringType.Private,
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<Azure_Service_Profile_UUID>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * const vd2AzureSecondary = new equinix.fabric.Connection("vd2azureSecondary", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     redundancy: {
 *         priority: "SECONDARY",
 *         group: vd2AzurePrimary.redundancy.apply(redundancy => redundancy?.group),
 *     },
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "CLOUD",
 *                 id: 5,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.SP,
 *             authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
 *             peeringType: equinix.fabric.AccessPointPeeringType.Private,
 *             profile: {
 *                 type: equinix.fabric.ProfileType.L2Profile,
 *                 uuid: "<Azure_Service_Profile_UUID>",
 *             },
 *             location: {
 *                 metroCode: equinix.index.Metro.SiliconValley,
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example vd to network
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const vd2Network = new equinix.fabric.Connection("vd2network", {
 *     name: "ConnectionName",
 *     type: "EVPLAN_VC",
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "CLOUD",
 *                 id: 7,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Network,
 *             network: {
 *                 uuid: "<network_uuid>",
 *             },
 *         },
 *     },
 * });
 * ```
 * ### example vd to token
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const vd2Token = new equinix.fabric.Connection("vd2token", {
 *     name: "ConnectionName",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: [
 *             "example@equinix.com",
 *             "test1@equinix.com",
 *         ],
 *     }],
 *     bandwidth: 50,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: "<device_uuid>",
 *             },
 *             "interface": {
 *                 type: "NETWORK",
 *                 id: 7,
 *             },
 *         },
 *     },
 *     zSide: {
 *         serviceToken: {
 *             uuid: "<service_token_uuid>",
 *         },
 *     },
 * });
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    public readonly aSide!: pulumi.Output<outputs.fabric.ConnectionASide>;
    /**
     * Customer account information that is associated with this connection
     */
    public /*out*/ readonly account!: pulumi.Output<outputs.fabric.ConnectionAccount>;
    /**
     * Connection additional information
     */
    public readonly additionalInfo!: pulumi.Output<{[key: string]: string}[] | undefined>;
    /**
     * Connection bandwidth in Mbps
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * Captures connection lifecycle change information
     */
    public /*out*/ readonly changeLog!: pulumi.Output<outputs.fabric.ConnectionChangeLog>;
    /**
     * Customer-provided connection description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Connection directionality from the requester point of view
     */
    public /*out*/ readonly direction!: pulumi.Output<string>;
    /**
     * Connection URI information
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Connection property derived from access point locations
     */
    public /*out*/ readonly isRemote!: pulumi.Output<boolean>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    public readonly notifications!: pulumi.Output<outputs.fabric.ConnectionNotification[]>;
    /**
     * Connection type-specific operational data
     */
    public /*out*/ readonly operation!: pulumi.Output<outputs.fabric.ConnectionOperation>;
    /**
     * Order details
     */
    public readonly order!: pulumi.Output<outputs.fabric.ConnectionOrder>;
    /**
     * Project information
     */
    public readonly project!: pulumi.Output<outputs.fabric.ConnectionProject>;
    /**
     * Connection Redundancy Configuration
     */
    public readonly redundancy!: pulumi.Output<outputs.fabric.ConnectionRedundancy | undefined>;
    /**
     * Connection overall state
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Equinix-assigned connection identifier
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    public readonly zSide!: pulumi.Output<outputs.fabric.ConnectionZSide>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["aSide"] = state ? state.aSide : undefined;
            resourceInputs["account"] = state ? state.account : undefined;
            resourceInputs["additionalInfo"] = state ? state.additionalInfo : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["changeLog"] = state ? state.changeLog : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["isRemote"] = state ? state.isRemote : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["operation"] = state ? state.operation : undefined;
            resourceInputs["order"] = state ? state.order : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["redundancy"] = state ? state.redundancy : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["zSide"] = state ? state.zSide : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.aSide === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aSide'");
            }
            if ((!args || args.bandwidth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if ((!args || args.notifications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notifications'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.zSide === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zSide'");
            }
            resourceInputs["aSide"] = args ? args.aSide : undefined;
            resourceInputs["additionalInfo"] = args ? args.additionalInfo : undefined;
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["order"] = args ? args.order : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["redundancy"] = args ? args.redundancy : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zSide"] = args ? args.zSide : undefined;
            resourceInputs["account"] = undefined /*out*/;
            resourceInputs["changeLog"] = undefined /*out*/;
            resourceInputs["direction"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["isRemote"] = undefined /*out*/;
            resourceInputs["operation"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    aSide?: pulumi.Input<inputs.fabric.ConnectionASide>;
    /**
     * Customer account information that is associated with this connection
     */
    account?: pulumi.Input<inputs.fabric.ConnectionAccount>;
    /**
     * Connection additional information
     */
    additionalInfo?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
    /**
     * Connection bandwidth in Mbps
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * Captures connection lifecycle change information
     */
    changeLog?: pulumi.Input<inputs.fabric.ConnectionChangeLog>;
    /**
     * Customer-provided connection description
     */
    description?: pulumi.Input<string>;
    /**
     * Connection directionality from the requester point of view
     */
    direction?: pulumi.Input<string>;
    /**
     * Connection URI information
     */
    href?: pulumi.Input<string>;
    /**
     * Connection property derived from access point locations
     */
    isRemote?: pulumi.Input<boolean>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionNotification>[]>;
    /**
     * Connection type-specific operational data
     */
    operation?: pulumi.Input<inputs.fabric.ConnectionOperation>;
    /**
     * Order details
     */
    order?: pulumi.Input<inputs.fabric.ConnectionOrder>;
    /**
     * Project information
     */
    project?: pulumi.Input<inputs.fabric.ConnectionProject>;
    /**
     * Connection Redundancy Configuration
     */
    redundancy?: pulumi.Input<inputs.fabric.ConnectionRedundancy>;
    /**
     * Connection overall state
     */
    state?: pulumi.Input<string>;
    /**
     * Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
     */
    type?: pulumi.Input<string | enums.fabric.ConnectionType>;
    /**
     * Equinix-assigned connection identifier
     */
    uuid?: pulumi.Input<string>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    zSide?: pulumi.Input<inputs.fabric.ConnectionZSide>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    aSide: pulumi.Input<inputs.fabric.ConnectionASide>;
    /**
     * Connection additional information
     */
    additionalInfo?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
    /**
     * Connection bandwidth in Mbps
     */
    bandwidth: pulumi.Input<number>;
    /**
     * Customer-provided connection description
     */
    description?: pulumi.Input<string>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionNotification>[]>;
    /**
     * Order details
     */
    order?: pulumi.Input<inputs.fabric.ConnectionOrder>;
    /**
     * Project information
     */
    project?: pulumi.Input<inputs.fabric.ConnectionProject>;
    /**
     * Connection Redundancy Configuration
     */
    redundancy?: pulumi.Input<inputs.fabric.ConnectionRedundancy>;
    /**
     * Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
     */
    type: pulumi.Input<string | enums.fabric.ConnectionType>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    zSide: pulumi.Input<inputs.fabric.ConnectionZSide>;
}
