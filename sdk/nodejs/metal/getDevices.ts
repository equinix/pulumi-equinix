// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The datasource can be used to find a list of devices which meet filter criteria.
 *
 * If you need to fetch a single device by ID or by project ID and hostname, use the equinix.metal.Device datasource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getDevices({
 *     projectId: local.project_id,
 *     filters: [
 *         {
 *             attribute: "plan",
 *             values: ["c3.small.x86"],
 *         },
 *         {
 *             attribute: "metro",
 *             values: [
 *                 "da",
 *                 "sv",
 *             ],
 *         },
 *     ],
 * });
 * export const devices = example.then(example => example.devices);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getDevices({
 *     search: "database",
 * });
 * export const devices = example.then(example => example.devices);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## search vs filter
 *
 * The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
 */
export function getDevices(args?: GetDevicesArgs, opts?: pulumi.InvokeOptions): Promise<GetDevicesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getDevices:getDevices", {
        "filters": args.filters,
        "organizationId": args.organizationId,
        "projectId": args.projectId,
        "search": args.search,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevices.
 */
export interface GetDevicesArgs {
    /**
     * One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `equinix.metal.Device` datasource.
     */
    filters?: inputs.metal.GetDevicesFilter[];
    /**
     * ID of organization containing the devices.
     */
    organizationId?: string;
    /**
     * ID of project containing the devices. Exactly one of `projectId` and `organizationId` must be set.
     */
    projectId?: string;
    /**
     * Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
     */
    search?: string;
    sorts?: inputs.metal.GetDevicesSort[];
}

/**
 * A collection of values returned by getDevices.
 */
export interface GetDevicesResult {
    /**
     * list of resources with attributes like in the equninixMetalDevice datasources.
     */
    readonly devices: outputs.metal.GetDevicesDevice[];
    readonly filters?: outputs.metal.GetDevicesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly organizationId?: string;
    readonly projectId?: string;
    readonly search?: string;
    readonly sorts?: outputs.metal.GetDevicesSort[];
}
/**
 * The datasource can be used to find a list of devices which meet filter criteria.
 *
 * If you need to fetch a single device by ID or by project ID and hostname, use the equinix.metal.Device datasource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getDevices({
 *     projectId: local.project_id,
 *     filters: [
 *         {
 *             attribute: "plan",
 *             values: ["c3.small.x86"],
 *         },
 *         {
 *             attribute: "metro",
 *             values: [
 *                 "da",
 *                 "sv",
 *             ],
 *         },
 *     ],
 * });
 * export const devices = example.then(example => example.devices);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = equinix.metal.getDevices({
 *     search: "database",
 * });
 * export const devices = example.then(example => example.devices);
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## search vs filter
 *
 * The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
 */
export function getDevicesOutput(args?: GetDevicesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDevicesResult> {
    return pulumi.output(args).apply((a: any) => getDevices(a, opts))
}

/**
 * A collection of arguments for invoking getDevices.
 */
export interface GetDevicesOutputArgs {
    /**
     * One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `equinix.metal.Device` datasource.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.metal.GetDevicesFilterArgs>[]>;
    /**
     * ID of organization containing the devices.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * ID of project containing the devices. Exactly one of `projectId` and `organizationId` must be set.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
     */
    search?: pulumi.Input<string>;
    sorts?: pulumi.Input<pulumi.Input<inputs.metal.GetDevicesSortArgs>[]>;
}
