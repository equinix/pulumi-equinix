// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch service token for a given UUID
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
 * * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const service-token = equinix.fabric.getServiceToken({
 *     uuid: "<uuid_of_service_token>",
 * });
 * export const id = service_token.then(service_token => service_token.id);
 * export const type = service_token.then(service_token => service_token.type);
 * export const expirationDateTime = service_token.then(service_token => service_token.expirationDateTime);
 * export const supportedBandwidths = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.supportedBandwidths);
 * export const virtualDeviceType = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.virtualDevice?.type);
 * export const virtualDeviceUuid = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.virtualDevice?.uuid);
 * export const interfaceType = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.["interface"]?.type);
 * export const interfaceUuid = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.["interface"]?.id);
 * ```
 */
export function getServiceToken(args: GetServiceTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getServiceToken:getServiceToken", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceToken.
 */
export interface GetServiceTokenArgs {
    /**
     * Equinix-assigned service token identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getServiceToken.
 */
export interface GetServiceTokenResult {
    /**
     * Customer account information that is associated with this service token
     */
    readonly accounts: outputs.fabric.GetServiceTokenAccount[];
    /**
     * Captures connection lifecycle change information
     */
    readonly changeLogs: outputs.fabric.GetServiceTokenChangeLog[];
    /**
     * Optional Description to the Service Token you will be creating
     */
    readonly description: string;
    /**
     * Expiration date and time of the service token; 2020-11-06T07:00:00Z
     */
    readonly expirationDateTime: string;
    /**
     * An absolute URL that is the subject of the link's context.
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Information about token side; ASIDE, ZSIDE
     */
    readonly issuerSide: string;
    /**
     * Name of the Service Token
     */
    readonly name: string;
    /**
     * Preferences for notifications on Service Token configuration or status changes
     */
    readonly notifications: outputs.fabric.GetServiceTokenNotification[];
    /**
     * Project information
     */
    readonly projects: outputs.fabric.GetServiceTokenProject[];
    /**
     * Service Token Connection Type Information
     */
    readonly serviceTokenConnections: outputs.fabric.GetServiceTokenServiceTokenConnection[];
    /**
     * Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
     */
    readonly state: string;
    /**
     * Service Token Type; VC*TOKEN,EPL*TOKEN
     */
    readonly type: string;
    /**
     * Equinix-assigned service token identifier
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch service token for a given UUID
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
 * * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const service-token = equinix.fabric.getServiceToken({
 *     uuid: "<uuid_of_service_token>",
 * });
 * export const id = service_token.then(service_token => service_token.id);
 * export const type = service_token.then(service_token => service_token.type);
 * export const expirationDateTime = service_token.then(service_token => service_token.expirationDateTime);
 * export const supportedBandwidths = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.supportedBandwidths);
 * export const virtualDeviceType = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.virtualDevice?.type);
 * export const virtualDeviceUuid = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.virtualDevice?.uuid);
 * export const interfaceType = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.["interface"]?.type);
 * export const interfaceUuid = service_token.then(service_token => service_token.serviceTokenConnections?.[0]?.zSides?.[0]?.accessPointSelectors?.[0]?.["interface"]?.id);
 * ```
 */
export function getServiceTokenOutput(args: GetServiceTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getServiceToken:getServiceToken", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceToken.
 */
export interface GetServiceTokenOutputArgs {
    /**
     * Equinix-assigned service token identifier
     */
    uuid: pulumi.Input<string>;
}