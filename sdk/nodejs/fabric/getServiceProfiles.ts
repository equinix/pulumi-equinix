// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

export function getServiceProfiles(args?: GetServiceProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceProfilesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getServiceProfiles:getServiceProfiles", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceProfiles.
 */
export interface GetServiceProfilesArgs {
    /**
     * Service Profile Search Filter
     */
    filters?: inputs.fabric.GetServiceProfilesFilter[];
    /**
     * Service Profile Sort criteria for Search Request response payload
     */
    sorts?: inputs.fabric.GetServiceProfilesSort[];
}

/**
 * A collection of values returned by getServiceProfiles.
 */
export interface GetServiceProfilesResult {
    /**
     * List of  Service Profiles
     */
    readonly datas: outputs.fabric.GetServiceProfilesData[];
    /**
     * Service Profile Search Filter
     */
    readonly filters?: outputs.fabric.GetServiceProfilesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Service Profile Sort criteria for Search Request response payload
     */
    readonly sorts?: outputs.fabric.GetServiceProfilesSort[];
}
export function getServiceProfilesOutput(args?: GetServiceProfilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceProfilesResult> {
    return pulumi.output(args).apply((a: any) => getServiceProfiles(a, opts))
}

/**
 * A collection of arguments for invoking getServiceProfiles.
 */
export interface GetServiceProfilesOutputArgs {
    /**
     * Service Profile Search Filter
     */
    filters?: pulumi.Input<pulumi.Input<inputs.fabric.GetServiceProfilesFilterArgs>[]>;
    /**
     * Service Profile Sort criteria for Search Request response payload
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.fabric.GetServiceProfilesSortArgs>[]>;
}
