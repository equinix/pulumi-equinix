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
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports
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
 * export const id = data.equinix_fabric_port.ports_data_name.data[0].id;
 * export const name = data.equinix_fabric_port.ports_data_name.data[0].name;
 * export const state = data.equinix_fabric_port.ports_data_name.data[0].state;
 * export const accountName = data.equinix_fabric_port.ports_data_name.data[0].account[0].account_name;
 * export const type = data.equinix_fabric_port.ports_data_name.data[0].type;
 * export const bandwidth = data.equinix_fabric_port.ports_data_name.data[0].bandwidth;
 * export const usedBandwidth = data.equinix_fabric_port.ports_data_name.data[0].used_bandwidth;
 * export const encapsulationType = data.equinix_fabric_port.ports_data_name.data[0].encapsulation[0].type;
 * export const ibx = data.equinix_fabric_port.ports_data_name.data[0].location[0].ibx;
 * export const metroCode = data.equinix_fabric_port.ports_data_name.data[0].location[0].metro_code;
 * export const metroName = data.equinix_fabric_port.ports_data_name.data[0].location[0].metro_name;
 * export const region = data.equinix_fabric_port.ports_data_name.data[0].location[0].region;
 * export const deviceRedundancyEnabled = data.equinix_fabric_port.ports_data_name.data[0].device[0].redundancy[0].enabled;
 * export const deviceRedundancyPriority = data.equinix_fabric_port.ports_data_name.data[0].device[0].redundancy[0].priority;
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
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports
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
 * export const id = data.equinix_fabric_port.ports_data_name.data[0].id;
 * export const name = data.equinix_fabric_port.ports_data_name.data[0].name;
 * export const state = data.equinix_fabric_port.ports_data_name.data[0].state;
 * export const accountName = data.equinix_fabric_port.ports_data_name.data[0].account[0].account_name;
 * export const type = data.equinix_fabric_port.ports_data_name.data[0].type;
 * export const bandwidth = data.equinix_fabric_port.ports_data_name.data[0].bandwidth;
 * export const usedBandwidth = data.equinix_fabric_port.ports_data_name.data[0].used_bandwidth;
 * export const encapsulationType = data.equinix_fabric_port.ports_data_name.data[0].encapsulation[0].type;
 * export const ibx = data.equinix_fabric_port.ports_data_name.data[0].location[0].ibx;
 * export const metroCode = data.equinix_fabric_port.ports_data_name.data[0].location[0].metro_code;
 * export const metroName = data.equinix_fabric_port.ports_data_name.data[0].location[0].metro_name;
 * export const region = data.equinix_fabric_port.ports_data_name.data[0].location[0].region;
 * export const deviceRedundancyEnabled = data.equinix_fabric_port.ports_data_name.data[0].device[0].redundancy[0].enabled;
 * export const deviceRedundancyPriority = data.equinix_fabric_port.ports_data_name.data[0].device[0].redundancy[0].priority;
 * ```
 */
export function getPortsOutput(args: GetPortsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPortsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getPorts:getPorts", {
        "filter": args.filter,
    }, opts);
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
