// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch port by uuid
 *
 * Additional documentation:
 * * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm>
 * * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const portDataName = equinix.fabric.getPort({
 *     uuid: "<uuid_of_port>",
 * });
 * export const id = portDataName.then(portDataName => portDataName.id);
 * export const name = portDataName.then(portDataName => portDataName.name);
 * export const state = portDataName.then(portDataName => portDataName.state);
 * export const accountName = portDataName.then(portDataName => portDataName.account?.accountName);
 * export const type = portDataName.then(portDataName => portDataName.type);
 * export const bandwidth = portDataName.then(portDataName => portDataName.bandwidth);
 * export const usedBandwidth = portDataName.then(portDataName => portDataName.usedBandwidth);
 * export const encapsulationType = portDataName.then(portDataName => portDataName.encapsulation?.type);
 * export const ibx = portDataName.then(portDataName => portDataName.location?.ibx);
 * export const metroCode = portDataName.then(portDataName => portDataName.location?.metroCode);
 * export const metroName = portDataName.then(portDataName => portDataName.location?.metroName);
 * export const region = portDataName.then(portDataName => portDataName.location?.region);
 * export const deviceRedundancyEnabled = portDataName.then(portDataName => portDataName.device?.redundancies?.[0]?.enabled);
 * export const deviceRedundancyPriority = portDataName.then(portDataName => portDataName.device?.redundancies?.[0]?.priority);
 * ```
 */
export function getPort(args: GetPortArgs, opts?: pulumi.InvokeOptions): Promise<GetPortResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getPort:getPort", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getPort.
 */
export interface GetPortArgs {
    /**
     * Equinix-assigned port identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getPort.
 */
export interface GetPortResult {
    /**
     * Customer account information that is associated with this port
     */
    readonly account: outputs.fabric.GetPortAccount;
    /**
     * Port available bandwidth in Mbps
     */
    readonly availableBandwidth: number;
    /**
     * Port bandwidth in Mbps
     */
    readonly bandwidth: number;
    /**
     * Captures port lifecycle change information
     */
    readonly changeLog: outputs.fabric.GetPortChangeLog;
    /**
     * Port description
     */
    readonly description: string;
    /**
     * Port device
     */
    readonly device: outputs.fabric.GetPortDevice;
    /**
     * Port encapsulation protocol
     */
    readonly encapsulation: outputs.fabric.GetPortEncapsulation;
    /**
     * Port URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Port Lag
     */
    readonly lagEnabled: boolean;
    /**
     * Port location information
     */
    readonly location: outputs.fabric.GetPortLocation;
    /**
     * Port name
     */
    readonly name: string;
    /**
     * Port specific operational data
     */
    readonly operation: outputs.fabric.GetPortOperation;
    /**
     * Port redundancy information
     */
    readonly redundancy: outputs.fabric.GetPortRedundancy;
    /**
     * Port service type
     */
    readonly serviceType: string;
    /**
     * Port state
     */
    readonly state: string;
    /**
     * Port type
     */
    readonly type: string;
    /**
     * Port used bandwidth in Mbps
     */
    readonly usedBandwidth: number;
    /**
     * Equinix-assigned port identifier
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch port by uuid
 *
 * Additional documentation:
 * * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm>
 * * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const portDataName = equinix.fabric.getPort({
 *     uuid: "<uuid_of_port>",
 * });
 * export const id = portDataName.then(portDataName => portDataName.id);
 * export const name = portDataName.then(portDataName => portDataName.name);
 * export const state = portDataName.then(portDataName => portDataName.state);
 * export const accountName = portDataName.then(portDataName => portDataName.account?.accountName);
 * export const type = portDataName.then(portDataName => portDataName.type);
 * export const bandwidth = portDataName.then(portDataName => portDataName.bandwidth);
 * export const usedBandwidth = portDataName.then(portDataName => portDataName.usedBandwidth);
 * export const encapsulationType = portDataName.then(portDataName => portDataName.encapsulation?.type);
 * export const ibx = portDataName.then(portDataName => portDataName.location?.ibx);
 * export const metroCode = portDataName.then(portDataName => portDataName.location?.metroCode);
 * export const metroName = portDataName.then(portDataName => portDataName.location?.metroName);
 * export const region = portDataName.then(portDataName => portDataName.location?.region);
 * export const deviceRedundancyEnabled = portDataName.then(portDataName => portDataName.device?.redundancies?.[0]?.enabled);
 * export const deviceRedundancyPriority = portDataName.then(portDataName => portDataName.device?.redundancies?.[0]?.priority);
 * ```
 */
export function getPortOutput(args: GetPortOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPortResult> {
    return pulumi.output(args).apply((a: any) => getPort(a, opts))
}

/**
 * A collection of arguments for invoking getPort.
 */
export interface GetPortOutputArgs {
    /**
     * Equinix-assigned port identifier
     */
    uuid: pulumi.Input<string>;
}
