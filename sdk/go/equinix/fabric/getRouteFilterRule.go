// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch route filter for a given UUID
//
// Additional Documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
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
//			rfRule, err := fabric.LookupRouteFilterRule(ctx, &fabric.LookupRouteFilterRuleArgs{
//				RouteFilterId: "<route_filter_policy_id>",
//				Uuid:          "<route_filter_rule_uuid>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("routeFilterRuleName", rfRule.Name)
//			ctx.Export("routeFilterRuleDescription", rfRule.Description)
//			ctx.Export("routeFilterRulePrefix", rfRule.Prefix)
//			ctx.Export("routeFilterRulePrefixMatch", rfRule.PrefixMatch)
//			return nil
//		})
//	}
//
// ```
func LookupRouteFilterRule(ctx *pulumi.Context, args *LookupRouteFilterRuleArgs, opts ...pulumi.InvokeOption) (*LookupRouteFilterRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRouteFilterRuleResult
	err := ctx.Invoke("equinix:fabric/getRouteFilterRule:getRouteFilterRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteFilterRule.
type LookupRouteFilterRuleArgs struct {
	// UUID of the Route Filter Policy the rule is attached to
	RouteFilterId string `pulumi:"routeFilterId"`
	// Equinix Assigned ID for Route Filter Rule to retrieve data for
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getRouteFilterRule.
type LookupRouteFilterRuleResult struct {
	// Action that will be taken on IP Addresses matching the rule
	Action     string                        `pulumi:"action"`
	ChangeLogs []GetRouteFilterRuleChangeLog `pulumi:"changeLogs"`
	// An object with the details of the previous change applied on the Route Filter
	Changes []GetRouteFilterRuleChange `pulumi:"changes"`
	// Optional description to add to the Route Filter you will be creating
	Description string `pulumi:"description"`
	// Route filter rules URI
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the Route Filter
	Name string `pulumi:"name"`
	// IP Address Prefix to Filter on
	Prefix string `pulumi:"prefix"`
	// Prefix matching operator. One of [ orlonger, exact ] Default: "orlonger"
	PrefixMatch string `pulumi:"prefixMatch"`
	// UUID of the Route Filter Policy the rule is attached to
	RouteFilterId string `pulumi:"routeFilterId"`
	// State of the Route Filter Rule in its lifecycle
	State string `pulumi:"state"`
	// Route Filter Type. One of [ BGP*IPv4*PREFIX*FILTER*RULE, BGP*IPv6*PREFIX*FILTER*RULE ]
	Type string `pulumi:"type"`
	// Equinix Assigned ID for Route Filter Rule to retrieve data for
	Uuid string `pulumi:"uuid"`
}

func LookupRouteFilterRuleOutput(ctx *pulumi.Context, args LookupRouteFilterRuleOutputArgs, opts ...pulumi.InvokeOption) LookupRouteFilterRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRouteFilterRuleResultOutput, error) {
			args := v.(LookupRouteFilterRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getRouteFilterRule:getRouteFilterRule", args, LookupRouteFilterRuleResultOutput{}, options).(LookupRouteFilterRuleResultOutput), nil
		}).(LookupRouteFilterRuleResultOutput)
}

// A collection of arguments for invoking getRouteFilterRule.
type LookupRouteFilterRuleOutputArgs struct {
	// UUID of the Route Filter Policy the rule is attached to
	RouteFilterId pulumi.StringInput `pulumi:"routeFilterId"`
	// Equinix Assigned ID for Route Filter Rule to retrieve data for
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (LookupRouteFilterRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRouteFilterRuleArgs)(nil)).Elem()
}

// A collection of values returned by getRouteFilterRule.
type LookupRouteFilterRuleResultOutput struct{ *pulumi.OutputState }

func (LookupRouteFilterRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRouteFilterRuleResult)(nil)).Elem()
}

func (o LookupRouteFilterRuleResultOutput) ToLookupRouteFilterRuleResultOutput() LookupRouteFilterRuleResultOutput {
	return o
}

func (o LookupRouteFilterRuleResultOutput) ToLookupRouteFilterRuleResultOutputWithContext(ctx context.Context) LookupRouteFilterRuleResultOutput {
	return o
}

// Action that will be taken on IP Addresses matching the rule
func (o LookupRouteFilterRuleResultOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Action }).(pulumi.StringOutput)
}

func (o LookupRouteFilterRuleResultOutput) ChangeLogs() GetRouteFilterRuleChangeLogArrayOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) []GetRouteFilterRuleChangeLog { return v.ChangeLogs }).(GetRouteFilterRuleChangeLogArrayOutput)
}

// An object with the details of the previous change applied on the Route Filter
func (o LookupRouteFilterRuleResultOutput) Changes() GetRouteFilterRuleChangeArrayOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) []GetRouteFilterRuleChange { return v.Changes }).(GetRouteFilterRuleChangeArrayOutput)
}

// Optional description to add to the Route Filter you will be creating
func (o LookupRouteFilterRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

// Route filter rules URI
func (o LookupRouteFilterRuleResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRouteFilterRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the Route Filter
func (o LookupRouteFilterRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// IP Address Prefix to Filter on
func (o LookupRouteFilterRuleResultOutput) Prefix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Prefix }).(pulumi.StringOutput)
}

// Prefix matching operator. One of [ orlonger, exact ] Default: "orlonger"
func (o LookupRouteFilterRuleResultOutput) PrefixMatch() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.PrefixMatch }).(pulumi.StringOutput)
}

// UUID of the Route Filter Policy the rule is attached to
func (o LookupRouteFilterRuleResultOutput) RouteFilterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.RouteFilterId }).(pulumi.StringOutput)
}

// State of the Route Filter Rule in its lifecycle
func (o LookupRouteFilterRuleResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.State }).(pulumi.StringOutput)
}

// Route Filter Type. One of [ BGP*IPv4*PREFIX*FILTER*RULE, BGP*IPv6*PREFIX*FILTER*RULE ]
func (o LookupRouteFilterRuleResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Type }).(pulumi.StringOutput)
}

// Equinix Assigned ID for Route Filter Rule to retrieve data for
func (o LookupRouteFilterRuleResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRouteFilterRuleResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRouteFilterRuleResultOutput{})
}
