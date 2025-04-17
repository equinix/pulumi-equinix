// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation Rules with pagination details
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
//			raRules, err := fabric.GetRouteAggregationRules(ctx, &fabric.GetRouteAggregationRulesArgs{
//				RouteAggregationId: "<route_aggregation_id>",
//				Pagination: fabric.GetRouteAggregationRulesPagination{
//					Limit:  2,
//					Offset: 1,
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("routeAggregationRuleName", raRules.Datas[0].Name)
//			ctx.Export("routeAggregationRuleDescription", raRules.Datas[0].Description)
//			ctx.Export("routeAggregationRulePrefix", raRules.Datas[0].Prefix)
//			ctx.Export("routeAggregationRuleState", raRules.Datas[0].State)
//			return nil
//		})
//	}
//
// ```
func GetRouteAggregationRules(ctx *pulumi.Context, args *GetRouteAggregationRulesArgs, opts ...pulumi.InvokeOption) (*GetRouteAggregationRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRouteAggregationRulesResult
	err := ctx.Invoke("equinix:fabric/getRouteAggregationRules:getRouteAggregationRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteAggregationRules.
type GetRouteAggregationRulesArgs struct {
	// Pagination details for the returned route aggregation rules list
	Pagination *GetRouteAggregationRulesPagination `pulumi:"pagination"`
	// The uuid of the route aggregation rule this data source should retrieve
	RouteAggregationId string `pulumi:"routeAggregationId"`
}

// A collection of values returned by getRouteAggregationRules.
type GetRouteAggregationRulesResult struct {
	// Returned list of route aggregation rule objects
	Datas []GetRouteAggregationRulesData `pulumi:"datas"`
	// The unique identifier of the resource
	Id string `pulumi:"id"`
	// Pagination details for the returned route aggregation rules list
	Pagination *GetRouteAggregationRulesPagination `pulumi:"pagination"`
	// The uuid of the route aggregation rule this data source should retrieve
	RouteAggregationId string `pulumi:"routeAggregationId"`
}

func GetRouteAggregationRulesOutput(ctx *pulumi.Context, args GetRouteAggregationRulesOutputArgs, opts ...pulumi.InvokeOption) GetRouteAggregationRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRouteAggregationRulesResultOutput, error) {
			args := v.(GetRouteAggregationRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getRouteAggregationRules:getRouteAggregationRules", args, GetRouteAggregationRulesResultOutput{}, options).(GetRouteAggregationRulesResultOutput), nil
		}).(GetRouteAggregationRulesResultOutput)
}

// A collection of arguments for invoking getRouteAggregationRules.
type GetRouteAggregationRulesOutputArgs struct {
	// Pagination details for the returned route aggregation rules list
	Pagination GetRouteAggregationRulesPaginationPtrInput `pulumi:"pagination"`
	// The uuid of the route aggregation rule this data source should retrieve
	RouteAggregationId pulumi.StringInput `pulumi:"routeAggregationId"`
}

func (GetRouteAggregationRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteAggregationRulesArgs)(nil)).Elem()
}

// A collection of values returned by getRouteAggregationRules.
type GetRouteAggregationRulesResultOutput struct{ *pulumi.OutputState }

func (GetRouteAggregationRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteAggregationRulesResult)(nil)).Elem()
}

func (o GetRouteAggregationRulesResultOutput) ToGetRouteAggregationRulesResultOutput() GetRouteAggregationRulesResultOutput {
	return o
}

func (o GetRouteAggregationRulesResultOutput) ToGetRouteAggregationRulesResultOutputWithContext(ctx context.Context) GetRouteAggregationRulesResultOutput {
	return o
}

// Returned list of route aggregation rule objects
func (o GetRouteAggregationRulesResultOutput) Datas() GetRouteAggregationRulesDataArrayOutput {
	return o.ApplyT(func(v GetRouteAggregationRulesResult) []GetRouteAggregationRulesData { return v.Datas }).(GetRouteAggregationRulesDataArrayOutput)
}

// The unique identifier of the resource
func (o GetRouteAggregationRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteAggregationRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the returned route aggregation rules list
func (o GetRouteAggregationRulesResultOutput) Pagination() GetRouteAggregationRulesPaginationPtrOutput {
	return o.ApplyT(func(v GetRouteAggregationRulesResult) *GetRouteAggregationRulesPagination { return v.Pagination }).(GetRouteAggregationRulesPaginationPtrOutput)
}

// The uuid of the route aggregation rule this data source should retrieve
func (o GetRouteAggregationRulesResultOutput) RouteAggregationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteAggregationRulesResult) string { return v.RouteAggregationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteAggregationRulesResultOutput{})
}
