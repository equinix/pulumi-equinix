// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * > **Deprecated** Use `equinix.metal.getMetro` instead. For more information, refer to the facility to metro migration guide.
 *
 * Provides an Equinix Metal facility datasource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ny5 = equinix.metal.getFacility({
 *     code: "ny5",
 * });
 * export const id = ny5.then(ny5 => ny5.id);
 * ```
 */
export function getFacility(args: GetFacilityArgs, opts?: pulumi.InvokeOptions): Promise<GetFacilityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getFacility:getFacility", {
        "capacities": args.capacities,
        "code": args.code,
        "featuresRequireds": args.featuresRequireds,
    }, opts);
}

/**
 * A collection of arguments for invoking getFacility.
 */
export interface GetFacilityArgs {
    /**
     * One or more device plans for which the facility must have capacity.
     */
    capacities?: inputs.metal.GetFacilityCapacity[];
    /**
     * The facility code to search for facilities.
     */
    code: string;
    /**
     * Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `globalIpv4`, `backendTransfer`, `layer2`.
     */
    featuresRequireds?: string[];
}

/**
 * A collection of values returned by getFacility.
 */
export interface GetFacilityResult {
    readonly capacities?: outputs.metal.GetFacilityCapacity[];
    readonly code: string;
    /**
     * The features of the facility.
     */
    readonly features: string[];
    readonly featuresRequireds?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The metro code the facility is part of.
     */
    readonly metro: string;
    /**
     * The name of the facility.
     */
    readonly name: string;
}
/**
 * > **Deprecated** Use `equinix.metal.getMetro` instead. For more information, refer to the facility to metro migration guide.
 *
 * Provides an Equinix Metal facility datasource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ny5 = equinix.metal.getFacility({
 *     code: "ny5",
 * });
 * export const id = ny5.then(ny5 => ny5.id);
 * ```
 */
export function getFacilityOutput(args: GetFacilityOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFacilityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:metal/getFacility:getFacility", {
        "capacities": args.capacities,
        "code": args.code,
        "featuresRequireds": args.featuresRequireds,
    }, opts);
}

/**
 * A collection of arguments for invoking getFacility.
 */
export interface GetFacilityOutputArgs {
    /**
     * One or more device plans for which the facility must have capacity.
     */
    capacities?: pulumi.Input<pulumi.Input<inputs.metal.GetFacilityCapacityArgs>[]>;
    /**
     * The facility code to search for facilities.
     */
    code: pulumi.Input<string>;
    /**
     * Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `globalIpv4`, `backendTransfer`, `layer2`.
     */
    featuresRequireds?: pulumi.Input<pulumi.Input<string>[]>;
}
