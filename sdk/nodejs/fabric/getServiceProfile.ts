// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const serviceProfileDataName = equinix.fabric.getServiceProfile({
 *     uuid: "<uuid_of_service_profile>",
 * });
 * export const id = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.id);
 * export const name = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.name);
 * export const type = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.type);
 * export const visibility = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.visibility);
 * export const orgName = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.account?.organizationName);
 * export const accessPointTypeConfigsType = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.type);
 * export const allowRemoteConnections = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.allowRemoteConnections);
 * export const supportedBandwidth0 = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.supportedBandwidths?.[0]);
 * export const supportedBandwidth1 = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.supportedBandwidths?.[1]);
 * export const redundandyRequired = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.connectionRedundancyRequired);
 * export const allowOverSubscription = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.apiConfig?.allowOverSubscription);
 * ```
 */
export function getServiceProfile(args: GetServiceProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getServiceProfile:getServiceProfile", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceProfile.
 */
export interface GetServiceProfileArgs {
    /**
     * Equinix assigned service profile identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getServiceProfile.
 */
export interface GetServiceProfileResult {
    /**
     * Access point config information
     */
    readonly accessPointTypeConfigs: outputs.fabric.GetServiceProfileAccessPointTypeConfig[];
    /**
     * Service Profile Owner Account Information
     */
    readonly account: outputs.fabric.GetServiceProfileAccount;
    /**
     * Array of contact emails
     */
    readonly allowedEmails: string[];
    /**
     * Captures connection lifecycle change information
     */
    readonly changeLog: outputs.fabric.GetServiceProfileChangeLog;
    /**
     * Custom Fields
     */
    readonly customFields: outputs.fabric.GetServiceProfileCustomField[];
    /**
     * User-provided service description
     */
    readonly description: string;
    /**
     * Service Profile URI response attribute
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Marketing Info
     */
    readonly marketingInfo: outputs.fabric.GetServiceProfileMarketingInfo;
    /**
     * Access point config information
     */
    readonly metros: outputs.fabric.GetServiceProfileMetro[];
    /**
     * Customer-assigned service profile name
     */
    readonly name: string;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    readonly notifications: outputs.fabric.GetServiceProfileNotification[];
    /**
     * Ports
     */
    readonly ports: outputs.fabric.GetServiceProfilePort[];
    /**
     * Project information
     */
    readonly project: outputs.fabric.GetServiceProfileProject;
    /**
     * Self Profile indicating if the profile is created for customer's  self use
     */
    readonly selfProfile: boolean;
    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     */
    readonly state: string;
    /**
     * Tags attached to the connection
     */
    readonly tags: string[];
    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
     */
    readonly type: string;
    /**
     * Equinix assigned service profile identifier
     */
    readonly uuid: string;
    /**
     * Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     */
    readonly viewPoint: string;
    /**
     * Virtual Devices
     */
    readonly virtualDevices: outputs.fabric.GetServiceProfileVirtualDevice[];
    /**
     * Service profile visibility - PUBLIC, PRIVATE
     */
    readonly visibility: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const serviceProfileDataName = equinix.fabric.getServiceProfile({
 *     uuid: "<uuid_of_service_profile>",
 * });
 * export const id = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.id);
 * export const name = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.name);
 * export const type = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.type);
 * export const visibility = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.visibility);
 * export const orgName = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.account?.organizationName);
 * export const accessPointTypeConfigsType = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.type);
 * export const allowRemoteConnections = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.allowRemoteConnections);
 * export const supportedBandwidth0 = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.supportedBandwidths?.[0]);
 * export const supportedBandwidth1 = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.supportedBandwidths?.[1]);
 * export const redundandyRequired = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.connectionRedundancyRequired);
 * export const allowOverSubscription = serviceProfileDataName.then(serviceProfileDataName => serviceProfileDataName.accessPointTypeConfigs?.[0]?.apiConfig?.allowOverSubscription);
 * ```
 */
export function getServiceProfileOutput(args: GetServiceProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getServiceProfile:getServiceProfile", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceProfile.
 */
export interface GetServiceProfileOutputArgs {
    /**
     * Equinix assigned service profile identifier
     */
    uuid: pulumi.Input<string>;
}
