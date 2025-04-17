// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Route Aggregation
//
// Additional Documentation:
// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
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
//			raRule, err := fabric.NewRouteAggregationRule(ctx, "raRule", &fabric.RouteAggregationRuleArgs{
//				RouteAggregationId: pulumi.String("<route_aggregation_id>"),
//				Description:        pulumi.String("Route aggregation rule"),
//				Prefix:             pulumi.String("192.168.0.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("routeAggregationRuleName", raRule.Name)
//			ctx.Export("routeAggregationRuleDescription", raRule.Description)
//			ctx.Export("routeAggregationRuleType", raRule.Type)
//			ctx.Export("routeAggregationRulePrefix", raRule.Prefix)
//			ctx.Export("routeAggregationRuleState", raRule.State)
//			return nil
//		})
//	}
//
// ```
type RouteAggregationRule struct {
	pulumi.CustomResourceState

	// Current state of latest route aggregation rule change
	Change RouteAggregationRuleChangeOutput `pulumi:"change"`
	// Details of the last change on the stream resource
	ChangeLog RouteAggregationRuleChangeLogOutput `pulumi:"changeLog"`
	// Customer-provided route aggregation rule description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Equinix auto generated URI to the route aggregation rule resource
	Href pulumi.StringOutput `pulumi:"href"`
	// Customer provided name of the route aggregation rule
	Name pulumi.StringOutput `pulumi:"name"`
	// Customer-provided route aggregation rule prefix
	Prefix pulumi.StringOutput `pulumi:"prefix"`
	// UUID of the Route Aggregation to apply this Rule to
	RouteAggregationId pulumi.StringOutput `pulumi:"routeAggregationId"`
	// Value representing provisioning status for the route aggregation rule resource
	State    pulumi.StringOutput                   `pulumi:"state"`
	Timeouts RouteAggregationRuleTimeoutsPtrOutput `pulumi:"timeouts"`
	// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix-assigned unique id for the route aggregation rule resource
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewRouteAggregationRule registers a new resource with the given unique name, arguments, and options.
func NewRouteAggregationRule(ctx *pulumi.Context,
	name string, args *RouteAggregationRuleArgs, opts ...pulumi.ResourceOption) (*RouteAggregationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Prefix == nil {
		return nil, errors.New("invalid value for required argument 'Prefix'")
	}
	if args.RouteAggregationId == nil {
		return nil, errors.New("invalid value for required argument 'RouteAggregationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouteAggregationRule
	err := ctx.RegisterResource("equinix:fabric/routeAggregationRule:RouteAggregationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteAggregationRule gets an existing RouteAggregationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteAggregationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteAggregationRuleState, opts ...pulumi.ResourceOption) (*RouteAggregationRule, error) {
	var resource RouteAggregationRule
	err := ctx.ReadResource("equinix:fabric/routeAggregationRule:RouteAggregationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteAggregationRule resources.
type routeAggregationRuleState struct {
	// Current state of latest route aggregation rule change
	Change *RouteAggregationRuleChange `pulumi:"change"`
	// Details of the last change on the stream resource
	ChangeLog *RouteAggregationRuleChangeLog `pulumi:"changeLog"`
	// Customer-provided route aggregation rule description
	Description *string `pulumi:"description"`
	// Equinix auto generated URI to the route aggregation rule resource
	Href *string `pulumi:"href"`
	// Customer provided name of the route aggregation rule
	Name *string `pulumi:"name"`
	// Customer-provided route aggregation rule prefix
	Prefix *string `pulumi:"prefix"`
	// UUID of the Route Aggregation to apply this Rule to
	RouteAggregationId *string `pulumi:"routeAggregationId"`
	// Value representing provisioning status for the route aggregation rule resource
	State    *string                       `pulumi:"state"`
	Timeouts *RouteAggregationRuleTimeouts `pulumi:"timeouts"`
	// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
	Type *string `pulumi:"type"`
	// Equinix-assigned unique id for the route aggregation rule resource
	Uuid *string `pulumi:"uuid"`
}

type RouteAggregationRuleState struct {
	// Current state of latest route aggregation rule change
	Change RouteAggregationRuleChangePtrInput
	// Details of the last change on the stream resource
	ChangeLog RouteAggregationRuleChangeLogPtrInput
	// Customer-provided route aggregation rule description
	Description pulumi.StringPtrInput
	// Equinix auto generated URI to the route aggregation rule resource
	Href pulumi.StringPtrInput
	// Customer provided name of the route aggregation rule
	Name pulumi.StringPtrInput
	// Customer-provided route aggregation rule prefix
	Prefix pulumi.StringPtrInput
	// UUID of the Route Aggregation to apply this Rule to
	RouteAggregationId pulumi.StringPtrInput
	// Value representing provisioning status for the route aggregation rule resource
	State    pulumi.StringPtrInput
	Timeouts RouteAggregationRuleTimeoutsPtrInput
	// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
	Type pulumi.StringPtrInput
	// Equinix-assigned unique id for the route aggregation rule resource
	Uuid pulumi.StringPtrInput
}

func (RouteAggregationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeAggregationRuleState)(nil)).Elem()
}

type routeAggregationRuleArgs struct {
	// Customer-provided route aggregation rule description
	Description *string `pulumi:"description"`
	// Customer provided name of the route aggregation rule
	Name *string `pulumi:"name"`
	// Customer-provided route aggregation rule prefix
	Prefix string `pulumi:"prefix"`
	// UUID of the Route Aggregation to apply this Rule to
	RouteAggregationId string                        `pulumi:"routeAggregationId"`
	Timeouts           *RouteAggregationRuleTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a RouteAggregationRule resource.
type RouteAggregationRuleArgs struct {
	// Customer-provided route aggregation rule description
	Description pulumi.StringPtrInput
	// Customer provided name of the route aggregation rule
	Name pulumi.StringPtrInput
	// Customer-provided route aggregation rule prefix
	Prefix pulumi.StringInput
	// UUID of the Route Aggregation to apply this Rule to
	RouteAggregationId pulumi.StringInput
	Timeouts           RouteAggregationRuleTimeoutsPtrInput
}

func (RouteAggregationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeAggregationRuleArgs)(nil)).Elem()
}

type RouteAggregationRuleInput interface {
	pulumi.Input

	ToRouteAggregationRuleOutput() RouteAggregationRuleOutput
	ToRouteAggregationRuleOutputWithContext(ctx context.Context) RouteAggregationRuleOutput
}

func (*RouteAggregationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteAggregationRule)(nil)).Elem()
}

func (i *RouteAggregationRule) ToRouteAggregationRuleOutput() RouteAggregationRuleOutput {
	return i.ToRouteAggregationRuleOutputWithContext(context.Background())
}

func (i *RouteAggregationRule) ToRouteAggregationRuleOutputWithContext(ctx context.Context) RouteAggregationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteAggregationRuleOutput)
}

// RouteAggregationRuleArrayInput is an input type that accepts RouteAggregationRuleArray and RouteAggregationRuleArrayOutput values.
// You can construct a concrete instance of `RouteAggregationRuleArrayInput` via:
//
//	RouteAggregationRuleArray{ RouteAggregationRuleArgs{...} }
type RouteAggregationRuleArrayInput interface {
	pulumi.Input

	ToRouteAggregationRuleArrayOutput() RouteAggregationRuleArrayOutput
	ToRouteAggregationRuleArrayOutputWithContext(context.Context) RouteAggregationRuleArrayOutput
}

type RouteAggregationRuleArray []RouteAggregationRuleInput

func (RouteAggregationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteAggregationRule)(nil)).Elem()
}

func (i RouteAggregationRuleArray) ToRouteAggregationRuleArrayOutput() RouteAggregationRuleArrayOutput {
	return i.ToRouteAggregationRuleArrayOutputWithContext(context.Background())
}

func (i RouteAggregationRuleArray) ToRouteAggregationRuleArrayOutputWithContext(ctx context.Context) RouteAggregationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteAggregationRuleArrayOutput)
}

// RouteAggregationRuleMapInput is an input type that accepts RouteAggregationRuleMap and RouteAggregationRuleMapOutput values.
// You can construct a concrete instance of `RouteAggregationRuleMapInput` via:
//
//	RouteAggregationRuleMap{ "key": RouteAggregationRuleArgs{...} }
type RouteAggregationRuleMapInput interface {
	pulumi.Input

	ToRouteAggregationRuleMapOutput() RouteAggregationRuleMapOutput
	ToRouteAggregationRuleMapOutputWithContext(context.Context) RouteAggregationRuleMapOutput
}

type RouteAggregationRuleMap map[string]RouteAggregationRuleInput

func (RouteAggregationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteAggregationRule)(nil)).Elem()
}

func (i RouteAggregationRuleMap) ToRouteAggregationRuleMapOutput() RouteAggregationRuleMapOutput {
	return i.ToRouteAggregationRuleMapOutputWithContext(context.Background())
}

func (i RouteAggregationRuleMap) ToRouteAggregationRuleMapOutputWithContext(ctx context.Context) RouteAggregationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteAggregationRuleMapOutput)
}

type RouteAggregationRuleOutput struct{ *pulumi.OutputState }

func (RouteAggregationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteAggregationRule)(nil)).Elem()
}

func (o RouteAggregationRuleOutput) ToRouteAggregationRuleOutput() RouteAggregationRuleOutput {
	return o
}

func (o RouteAggregationRuleOutput) ToRouteAggregationRuleOutputWithContext(ctx context.Context) RouteAggregationRuleOutput {
	return o
}

// Current state of latest route aggregation rule change
func (o RouteAggregationRuleOutput) Change() RouteAggregationRuleChangeOutput {
	return o.ApplyT(func(v *RouteAggregationRule) RouteAggregationRuleChangeOutput { return v.Change }).(RouteAggregationRuleChangeOutput)
}

// Details of the last change on the stream resource
func (o RouteAggregationRuleOutput) ChangeLog() RouteAggregationRuleChangeLogOutput {
	return o.ApplyT(func(v *RouteAggregationRule) RouteAggregationRuleChangeLogOutput { return v.ChangeLog }).(RouteAggregationRuleChangeLogOutput)
}

// Customer-provided route aggregation rule description
func (o RouteAggregationRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Equinix auto generated URI to the route aggregation rule resource
func (o RouteAggregationRuleOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Customer provided name of the route aggregation rule
func (o RouteAggregationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Customer-provided route aggregation rule prefix
func (o RouteAggregationRuleOutput) Prefix() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.Prefix }).(pulumi.StringOutput)
}

// UUID of the Route Aggregation to apply this Rule to
func (o RouteAggregationRuleOutput) RouteAggregationId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.RouteAggregationId }).(pulumi.StringOutput)
}

// Value representing provisioning status for the route aggregation rule resource
func (o RouteAggregationRuleOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

func (o RouteAggregationRuleOutput) Timeouts() RouteAggregationRuleTimeoutsPtrOutput {
	return o.ApplyT(func(v *RouteAggregationRule) RouteAggregationRuleTimeoutsPtrOutput { return v.Timeouts }).(RouteAggregationRuleTimeoutsPtrOutput)
}

// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
func (o RouteAggregationRuleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned unique id for the route aggregation rule resource
func (o RouteAggregationRuleOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteAggregationRule) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type RouteAggregationRuleArrayOutput struct{ *pulumi.OutputState }

func (RouteAggregationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteAggregationRule)(nil)).Elem()
}

func (o RouteAggregationRuleArrayOutput) ToRouteAggregationRuleArrayOutput() RouteAggregationRuleArrayOutput {
	return o
}

func (o RouteAggregationRuleArrayOutput) ToRouteAggregationRuleArrayOutputWithContext(ctx context.Context) RouteAggregationRuleArrayOutput {
	return o
}

func (o RouteAggregationRuleArrayOutput) Index(i pulumi.IntInput) RouteAggregationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouteAggregationRule {
		return vs[0].([]*RouteAggregationRule)[vs[1].(int)]
	}).(RouteAggregationRuleOutput)
}

type RouteAggregationRuleMapOutput struct{ *pulumi.OutputState }

func (RouteAggregationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteAggregationRule)(nil)).Elem()
}

func (o RouteAggregationRuleMapOutput) ToRouteAggregationRuleMapOutput() RouteAggregationRuleMapOutput {
	return o
}

func (o RouteAggregationRuleMapOutput) ToRouteAggregationRuleMapOutputWithContext(ctx context.Context) RouteAggregationRuleMapOutput {
	return o
}

func (o RouteAggregationRuleMapOutput) MapIndex(k pulumi.StringInput) RouteAggregationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouteAggregationRule {
		return vs[0].(map[string]*RouteAggregationRule)[vs[1].(string)]
	}).(RouteAggregationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteAggregationRuleInput)(nil)).Elem(), &RouteAggregationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteAggregationRuleArrayInput)(nil)).Elem(), RouteAggregationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteAggregationRuleMapInput)(nil)).Elem(), RouteAggregationRuleMap{})
	pulumi.RegisterOutputType(RouteAggregationRuleOutput{})
	pulumi.RegisterOutputType(RouteAggregationRuleArrayOutput{})
	pulumi.RegisterOutputType(RouteAggregationRuleMapOutput{})
}
