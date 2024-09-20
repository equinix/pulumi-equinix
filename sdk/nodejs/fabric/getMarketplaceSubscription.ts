// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Marketplace Subscription detail for a given UUID
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const subscription-test = equinix.fabric.getMarketplaceSubscription({
 *     uuid: "<uuid_of_marketplace_subscription>",
 * });
 * export const id = subscription_test.then(subscription_test => subscription_test.id);
 * export const status = subscription_test.then(subscription_test => subscription_test.status);
 * export const marketplace = subscription_test.then(subscription_test => subscription_test.marketplace);
 * export const offerType = subscription_test.then(subscription_test => subscription_test.offerType);
 * export const isAutoRenew = subscription_test.then(subscription_test => subscription_test.isAutoRenew);
 * ```
 */
export function getMarketplaceSubscription(args: GetMarketplaceSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetMarketplaceSubscriptionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getMarketplaceSubscription:getMarketplaceSubscription", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getMarketplaceSubscription.
 */
export interface GetMarketplaceSubscriptionArgs {
    /**
     * Equinix-assigned marketplace identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getMarketplaceSubscription.
 */
export interface GetMarketplaceSubscriptionResult {
    /**
     * Subscription entitlements
     */
    readonly entitlements: outputs.fabric.GetMarketplaceSubscriptionEntitlement[];
    /**
     * Subscription URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Information about subscription auto renewal
     */
    readonly isAutoRenew: boolean;
    /**
     * Marketplace like; AWS, GCP, AZURE, REDHAT
     */
    readonly marketplace: string;
    /**
     * Marketplace Offer Type like; PUBLIC, PRIVATE_OFFER
     */
    readonly offerType: string;
    /**
     * Subscription Status like; ACTIVE, EXPIRED, CANCELLED, GRACE_PERIOD
     */
    readonly status: string;
    /**
     * Subscription Trial
     */
    readonly trial: outputs.fabric.GetMarketplaceSubscriptionTrial;
    /**
     * Equinix-assigned marketplace identifier
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Marketplace Subscription detail for a given UUID
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const subscription-test = equinix.fabric.getMarketplaceSubscription({
 *     uuid: "<uuid_of_marketplace_subscription>",
 * });
 * export const id = subscription_test.then(subscription_test => subscription_test.id);
 * export const status = subscription_test.then(subscription_test => subscription_test.status);
 * export const marketplace = subscription_test.then(subscription_test => subscription_test.marketplace);
 * export const offerType = subscription_test.then(subscription_test => subscription_test.offerType);
 * export const isAutoRenew = subscription_test.then(subscription_test => subscription_test.isAutoRenew);
 * ```
 */
export function getMarketplaceSubscriptionOutput(args: GetMarketplaceSubscriptionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMarketplaceSubscriptionResult> {
    return pulumi.output(args).apply((a: any) => getMarketplaceSubscription(a, opts))
}

/**
 * A collection of arguments for invoking getMarketplaceSubscription.
 */
export interface GetMarketplaceSubscriptionOutputArgs {
    /**
     * Equinix-assigned marketplace identifier
     */
    uuid: pulumi.Input<string>;
}
