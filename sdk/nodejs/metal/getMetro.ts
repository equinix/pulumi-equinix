// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Equinix Metal metro datasource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const sv = equinix.metal.getMetro({
 *     code: "sv",
 * });
 * export const id = sv.then(sv => sv.id);
 * ```
 */
export function getMetro(args: GetMetroArgs, opts?: pulumi.InvokeOptions): Promise<GetMetroResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getMetro:getMetro", {
        "capacities": args.capacities,
        "code": args.code,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetro.
 */
export interface GetMetroArgs {
    /**
     * One or more device plans for which the metro must have capacity.
     */
    capacities?: inputs.metal.GetMetroCapacity[];
    /**
     * The metro code to search for.
     */
    code: string;
}

/**
 * A collection of values returned by getMetro.
 */
export interface GetMetroResult {
    readonly capacities?: outputs.metal.GetMetroCapacity[];
    readonly code: string;
    /**
     * The country of the metro.
     */
    readonly country: string;
    /**
     * The ID of the metro.
     */
    readonly id: string;
    /**
     * The name of the metro.
     */
    readonly name: string;
}
/**
 * Provides an Equinix Metal metro datasource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const sv = equinix.metal.getMetro({
 *     code: "sv",
 * });
 * export const id = sv.then(sv => sv.id);
 * ```
 */
export function getMetroOutput(args: GetMetroOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMetroResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:metal/getMetro:getMetro", {
        "capacities": args.capacities,
        "code": args.code,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetro.
 */
export interface GetMetroOutputArgs {
    /**
     * One or more device plans for which the metro must have capacity.
     */
    capacities?: pulumi.Input<pulumi.Input<inputs.metal.GetMetroCapacityArgs>[]>;
    /**
     * The metro code to search for.
     */
    code: pulumi.Input<string>;
}
