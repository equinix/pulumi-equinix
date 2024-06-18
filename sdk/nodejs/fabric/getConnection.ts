// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch connection for a given UUID
 *
 * Additional documentation:
 * * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-connections-implement.htm>
 * * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#connections>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const connectionDataName = equinix.fabric.getConnection({
 *     uuid: "<uuid_of_connection>",
 * });
 * export const id = connectionDataName.then(connectionDataName => connectionDataName.id);
 * export const name = connectionDataName.then(connectionDataName => connectionDataName.bandwidth);
 * export const accountNumber = connectionDataName.then(connectionDataName => connectionDataName.account?.accountNumber);
 * export const bandwidth = connectionDataName.then(connectionDataName => connectionDataName.bandwidth);
 * export const projectId = connectionDataName.then(connectionDataName => connectionDataName.project?.projectId);
 * export const redundancyGroup = connectionDataName.then(connectionDataName => connectionDataName.redundancy?.group);
 * export const redundancyPriority = connectionDataName.then(connectionDataName => connectionDataName.redundancy?.priority);
 * export const state = connectionDataName.then(connectionDataName => connectionDataName.state);
 * export const type = connectionDataName.then(connectionDataName => connectionDataName.type);
 * export const accessPointType = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.type);
 * export const accessPointLinkProtocolType = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.type);
 * export const accessPointLinkProtocolVlanTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanTag);
 * export const accessPointLinkProtocolVlanCTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanCTag);
 * export const accessPointLinkProtocolVlanSTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanSTag);
 * export const accessPointProviderConnectionId = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.providerConnectionId);
 * ```
 */
export function getConnection(args: GetConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getConnection:getConnection", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionArgs {
    /**
     * Equinix-assigned connection identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getConnection.
 */
export interface GetConnectionResult {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    readonly aSide: outputs.fabric.GetConnectionASide;
    /**
     * Customer account information that is associated with this connection
     */
    readonly account: outputs.fabric.GetConnectionAccount;
    /**
     * Connection additional information
     */
    readonly additionalInfo: {[key: string]: any}[];
    /**
     * Connection bandwidth in Mbps
     */
    readonly bandwidth: number;
    /**
     * Captures connection lifecycle change information
     */
    readonly changeLog: outputs.fabric.GetConnectionChangeLog;
    /**
     * Customer-provided connection description
     */
    readonly description: string;
    /**
     * Connection directionality from the requester point of view
     */
    readonly direction: string;
    /**
     * Connection URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Connection property derived from access point locations
     */
    readonly isRemote: boolean;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    readonly name: string;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    readonly notifications: outputs.fabric.GetConnectionNotification[];
    /**
     * Connection type-specific operational data
     */
    readonly operation: outputs.fabric.GetConnectionOperation;
    /**
     * Order details
     */
    readonly order: outputs.fabric.GetConnectionOrder;
    /**
     * Project information
     */
    readonly project: outputs.fabric.GetConnectionProject;
    /**
     * Connection Redundancy Configuration
     */
    readonly redundancy: outputs.fabric.GetConnectionRedundancy;
    /**
     * Connection overall state
     */
    readonly state: string;
    /**
     * Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
     */
    readonly type: string;
    /**
     * Equinix-assigned connection identifier
     */
    readonly uuid: string;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    readonly zSide: outputs.fabric.GetConnectionZSide;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch connection for a given UUID
 *
 * Additional documentation:
 * * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-connections-implement.htm>
 * * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#connections>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const connectionDataName = equinix.fabric.getConnection({
 *     uuid: "<uuid_of_connection>",
 * });
 * export const id = connectionDataName.then(connectionDataName => connectionDataName.id);
 * export const name = connectionDataName.then(connectionDataName => connectionDataName.bandwidth);
 * export const accountNumber = connectionDataName.then(connectionDataName => connectionDataName.account?.accountNumber);
 * export const bandwidth = connectionDataName.then(connectionDataName => connectionDataName.bandwidth);
 * export const projectId = connectionDataName.then(connectionDataName => connectionDataName.project?.projectId);
 * export const redundancyGroup = connectionDataName.then(connectionDataName => connectionDataName.redundancy?.group);
 * export const redundancyPriority = connectionDataName.then(connectionDataName => connectionDataName.redundancy?.priority);
 * export const state = connectionDataName.then(connectionDataName => connectionDataName.state);
 * export const type = connectionDataName.then(connectionDataName => connectionDataName.type);
 * export const accessPointType = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.type);
 * export const accessPointLinkProtocolType = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.type);
 * export const accessPointLinkProtocolVlanTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanTag);
 * export const accessPointLinkProtocolVlanCTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanCTag);
 * export const accessPointLinkProtocolVlanSTag = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.linkProtocol?.vlanSTag);
 * export const accessPointProviderConnectionId = connectionDataName.then(connectionDataName => connectionDataName.aSide?.accessPoint?.providerConnectionId);
 * ```
 */
export function getConnectionOutput(args: GetConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionResult> {
    return pulumi.output(args).apply((a: any) => getConnection(a, opts))
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionOutputArgs {
    /**
     * Equinix-assigned connection identifier
     */
    uuid: pulumi.Input<string>;
}
