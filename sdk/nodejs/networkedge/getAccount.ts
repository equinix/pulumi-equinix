// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get number and identifier of Equinix Network Edge
 * billing account in a given metro location.
 *
 * Billing account reference is required to create Network Edge virtual device
 * in corresponding metro location.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const dc = equinix.networkedge.getAccount({
 *     metroCode: "DC",
 *     status: "Active",
 *     projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
 * });
 * export const number = dc.then(dc => dc.number);
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAccount(args: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:networkedge/getAccount:getAccount", {
        "metroCode": args.metroCode,
        "name": args.name,
        "projectId": args.projectId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    /**
     * Account location metro code.
     */
    metroCode: string;
    /**
     * Account name for filtering.
     */
    name?: string;
    /**
     * Unique Identifier for the project resource where the account is scoped to.If you
     * leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     */
    projectId?: string;
    /**
     * Account status for filtering. Possible values are: `Active`, `Processing`,
     * `Submitted`, `Staged`.
     */
    status?: string;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly metroCode: string;
    readonly name: string;
    /**
     * Account unique number.
     */
    readonly number: string;
    readonly projectId: string;
    readonly status: string;
    /**
     * Account unique identifier.
     */
    readonly ucmId: string;
}
/**
 * Use this data source to get number and identifier of Equinix Network Edge
 * billing account in a given metro location.
 *
 * Billing account reference is required to create Network Edge virtual device
 * in corresponding metro location.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const dc = equinix.networkedge.getAccount({
 *     metroCode: "DC",
 *     status: "Active",
 *     projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
 * });
 * export const number = dc.then(dc => dc.number);
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAccountOutput(args: GetAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountResult> {
    return pulumi.output(args).apply((a: any) => getAccount(a, opts))
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountOutputArgs {
    /**
     * Account location metro code.
     */
    metroCode: pulumi.Input<string>;
    /**
     * Account name for filtering.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique Identifier for the project resource where the account is scoped to.If you
     * leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Account status for filtering. Possible values are: `Active`, `Processing`,
     * `Submitted`, `Staged`.
     */
    status?: pulumi.Input<string>;
}
