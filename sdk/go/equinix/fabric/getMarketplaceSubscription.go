// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Marketplace Subscription detail for a given UUID
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			subscription_test, err := fabric.GetMarketplaceSubscription(ctx, &fabric.GetMarketplaceSubscriptionArgs{
//				Uuid: "<uuid_of_marketplace_subscription>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", subscription_test.Id)
//			ctx.Export("status", subscription_test.Status)
//			ctx.Export("marketplace", subscription_test.Marketplace)
//			ctx.Export("offerType", subscription_test.OfferType)
//			ctx.Export("isAutoRenew", subscription_test.IsAutoRenew)
//			return nil
//		})
//	}
//
// ```
func GetMarketplaceSubscription(ctx *pulumi.Context, args *GetMarketplaceSubscriptionArgs, opts ...pulumi.InvokeOption) (*GetMarketplaceSubscriptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMarketplaceSubscriptionResult
	err := ctx.Invoke("equinix:fabric/getMarketplaceSubscription:getMarketplaceSubscription", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMarketplaceSubscription.
type GetMarketplaceSubscriptionArgs struct {
	// Equinix-assigned marketplace identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getMarketplaceSubscription.
type GetMarketplaceSubscriptionResult struct {
	// Subscription entitlements
	Entitlements []GetMarketplaceSubscriptionEntitlement `pulumi:"entitlements"`
	// Subscription URI information
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information about subscription auto renewal
	IsAutoRenew bool `pulumi:"isAutoRenew"`
	// Marketplace like; AWS, GCP, AZURE, REDHAT
	Marketplace string `pulumi:"marketplace"`
	// Marketplace Offer Type like; PUBLIC, PRIVATE_OFFER
	OfferType string `pulumi:"offerType"`
	// Subscription Status like; ACTIVE, EXPIRED, CANCELLED, GRACE_PERIOD
	Status string `pulumi:"status"`
	// Subscription Trial
	Trial GetMarketplaceSubscriptionTrial `pulumi:"trial"`
	// Equinix-assigned marketplace identifier
	Uuid string `pulumi:"uuid"`
}

func GetMarketplaceSubscriptionOutput(ctx *pulumi.Context, args GetMarketplaceSubscriptionOutputArgs, opts ...pulumi.InvokeOption) GetMarketplaceSubscriptionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMarketplaceSubscriptionResultOutput, error) {
			args := v.(GetMarketplaceSubscriptionArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetMarketplaceSubscriptionResult
			secret, err := ctx.InvokePackageRaw("equinix:fabric/getMarketplaceSubscription:getMarketplaceSubscription", args, &rv, "", opts...)
			if err != nil {
				return GetMarketplaceSubscriptionResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetMarketplaceSubscriptionResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetMarketplaceSubscriptionResultOutput), nil
			}
			return output, nil
		}).(GetMarketplaceSubscriptionResultOutput)
}

// A collection of arguments for invoking getMarketplaceSubscription.
type GetMarketplaceSubscriptionOutputArgs struct {
	// Equinix-assigned marketplace identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (GetMarketplaceSubscriptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMarketplaceSubscriptionArgs)(nil)).Elem()
}

// A collection of values returned by getMarketplaceSubscription.
type GetMarketplaceSubscriptionResultOutput struct{ *pulumi.OutputState }

func (GetMarketplaceSubscriptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMarketplaceSubscriptionResult)(nil)).Elem()
}

func (o GetMarketplaceSubscriptionResultOutput) ToGetMarketplaceSubscriptionResultOutput() GetMarketplaceSubscriptionResultOutput {
	return o
}

func (o GetMarketplaceSubscriptionResultOutput) ToGetMarketplaceSubscriptionResultOutputWithContext(ctx context.Context) GetMarketplaceSubscriptionResultOutput {
	return o
}

// Subscription entitlements
func (o GetMarketplaceSubscriptionResultOutput) Entitlements() GetMarketplaceSubscriptionEntitlementArrayOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) []GetMarketplaceSubscriptionEntitlement {
		return v.Entitlements
	}).(GetMarketplaceSubscriptionEntitlementArrayOutput)
}

// Subscription URI information
func (o GetMarketplaceSubscriptionResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMarketplaceSubscriptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information about subscription auto renewal
func (o GetMarketplaceSubscriptionResultOutput) IsAutoRenew() pulumi.BoolOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) bool { return v.IsAutoRenew }).(pulumi.BoolOutput)
}

// Marketplace like; AWS, GCP, AZURE, REDHAT
func (o GetMarketplaceSubscriptionResultOutput) Marketplace() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.Marketplace }).(pulumi.StringOutput)
}

// Marketplace Offer Type like; PUBLIC, PRIVATE_OFFER
func (o GetMarketplaceSubscriptionResultOutput) OfferType() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.OfferType }).(pulumi.StringOutput)
}

// Subscription Status like; ACTIVE, EXPIRED, CANCELLED, GRACE_PERIOD
func (o GetMarketplaceSubscriptionResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.Status }).(pulumi.StringOutput)
}

// Subscription Trial
func (o GetMarketplaceSubscriptionResultOutput) Trial() GetMarketplaceSubscriptionTrialOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) GetMarketplaceSubscriptionTrial { return v.Trial }).(GetMarketplaceSubscriptionTrialOutput)
}

// Equinix-assigned marketplace identifier
func (o GetMarketplaceSubscriptionResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetMarketplaceSubscriptionResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMarketplaceSubscriptionResultOutput{})
}