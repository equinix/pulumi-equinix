// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const networkDataName = equinix.fabric.getNetwork({
 *     uuid: "<uuid_of_network>",
 * });
 * ```
 */
export function getNetwork(args: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getNetwork:getNetwork", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkArgs {
    uuid: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * Information on asset change operation
     */
    readonly change: outputs.fabric.GetNetworkChange;
    /**
     * A permanent record of asset creation, modification, or deletion
     */
    readonly changeLog: outputs.fabric.GetNetworkChangeLog;
    /**
     * Number of connections associated with this network
     */
    readonly connectionsCount: number;
    /**
     * Fabric Network URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Fabric Network location
     */
    readonly locations: outputs.fabric.GetNetworkLocation[];
    /**
     * Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    readonly name: string;
    /**
     * Preferences for notifications on Fabric Network configuration or status changes
     */
    readonly notifications: outputs.fabric.GetNetworkNotification[];
    /**
     * Network operation information that is associated with this Fabric Network
     */
    readonly operation: outputs.fabric.GetNetworkOperation;
    /**
     * Fabric Network project
     */
    readonly project: outputs.fabric.GetNetworkProject;
    /**
     * Fabric Network scope
     */
    readonly scope: string;
    /**
     * Fabric Network overall state
     */
    readonly state: string;
    /**
     * Supported Network types - EVPLAN, EPLAN, IPWAN
     */
    readonly type: string;
    /**
     * Equinix-assigned network identifier
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const networkDataName = equinix.fabric.getNetwork({
 *     uuid: "<uuid_of_network>",
 * });
 * ```
 */
export function getNetworkOutput(args: GetNetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkResult> {
    return pulumi.output(args).apply((a: any) => getNetwork(a, opts))
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkOutputArgs {
    uuid: pulumi.Input<string>;
}
