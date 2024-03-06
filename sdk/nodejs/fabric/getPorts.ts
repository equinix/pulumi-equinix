// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch port by name
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const portsDataName = equinix.fabric.getPorts({
 *     filter: {
 *         name: "<name_of_port||port_prefix>",
 *     },
 * });
 * ```
 */
export function getPorts(args: GetPortsArgs, opts?: pulumi.InvokeOptions): Promise<GetPortsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getPorts:getPorts", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getPorts.
 */
export interface GetPortsArgs {
    /**
     * name
     */
    filter: inputs.fabric.GetPortsFilter;
}

/**
 * A collection of values returned by getPorts.
 */
export interface GetPortsResult {
    /**
     * List of Ports
     */
    readonly data: outputs.fabric.GetPortsDatum[];
    /**
     * name
     */
    readonly filter: outputs.fabric.GetPortsFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch port by name
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const portsDataName = equinix.fabric.getPorts({
 *     filter: {
 *         name: "<name_of_port||port_prefix>",
 *     },
 * });
 * ```
 */
export function getPortsOutput(args: GetPortsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPortsResult> {
    return pulumi.output(args).apply((a: any) => getPorts(a, opts))
}

/**
 * A collection of arguments for invoking getPorts.
 */
export interface GetPortsOutputArgs {
    /**
     * name
     */
    filter: pulumi.Input<inputs.fabric.GetPortsFilterArgs>;
}
