// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set
//
// Additional Documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
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
//			rfPolicies, err := fabric.GetRouteFilters(ctx, &fabric.GetRouteFiltersArgs{
//				Filters: []fabric.GetRouteFiltersFilter{
//					{
//						Property: "/type",
//						Operator: "=",
//						Values: []string{
//							"BGP_IPv4_PREFIX_FILTER",
//						},
//					},
//					{
//						Property: "/state",
//						Operator: "=",
//						Values: []string{
//							"PROVISIONED",
//						},
//					},
//					{
//						Property: "/project/projectId",
//						Operator: "=",
//						Values: []string{
//							"<project_id>",
//						},
//					},
//				},
//				Pagination: fabric.GetRouteFiltersPagination{
//					Offset: 0,
//					Limit:  5,
//					Total:  25,
//				},
//				Sorts: []fabric.GetRouteFiltersSort{
//					{
//						Direction: pulumi.StringRef("ASC"),
//						Property:  pulumi.StringRef("/name"),
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstRfUuid", rfPolicies.Datas[0].Uuid)
//			ctx.Export("type", rfPolicies.Datas[0].Type)
//			ctx.Export("state", rfPolicies.Datas[0].State)
//			ctx.Export("notMatchedRuleAction", rfPolicies.Datas[0].NotMatchedRuleAction)
//			ctx.Export("connectionsCount", rfPolicies.Datas[0].ConnectionsCount)
//			ctx.Export("rulesCount", rfPolicies.Datas[0].RulesCount)
//			return nil
//		})
//	}
//
// ```
func GetRouteFilters(ctx *pulumi.Context, args *GetRouteFiltersArgs, opts ...pulumi.InvokeOption) (*GetRouteFiltersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRouteFiltersResult
	err := ctx.Invoke("equinix:fabric/getRouteFilters:getRouteFilters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteFilters.
type GetRouteFiltersArgs struct {
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters []GetRouteFiltersFilter `pulumi:"filters"`
	// Pagination details for the Data Source Search Request
	Pagination *GetRouteFiltersPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts []GetRouteFiltersSort `pulumi:"sorts"`
}

// A collection of values returned by getRouteFilters.
type GetRouteFiltersResult struct {
	// List of Route Filters
	Datas []GetRouteFiltersData `pulumi:"datas"`
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters []GetRouteFiltersFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Pagination details for the Data Source Search Request
	Pagination *GetRouteFiltersPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts []GetRouteFiltersSort `pulumi:"sorts"`
}

func GetRouteFiltersOutput(ctx *pulumi.Context, args GetRouteFiltersOutputArgs, opts ...pulumi.InvokeOption) GetRouteFiltersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRouteFiltersResultOutput, error) {
			args := v.(GetRouteFiltersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getRouteFilters:getRouteFilters", args, GetRouteFiltersResultOutput{}, options).(GetRouteFiltersResultOutput), nil
		}).(GetRouteFiltersResultOutput)
}

// A collection of arguments for invoking getRouteFilters.
type GetRouteFiltersOutputArgs struct {
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters GetRouteFiltersFilterArrayInput `pulumi:"filters"`
	// Pagination details for the Data Source Search Request
	Pagination GetRouteFiltersPaginationPtrInput `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts GetRouteFiltersSortArrayInput `pulumi:"sorts"`
}

func (GetRouteFiltersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteFiltersArgs)(nil)).Elem()
}

// A collection of values returned by getRouteFilters.
type GetRouteFiltersResultOutput struct{ *pulumi.OutputState }

func (GetRouteFiltersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteFiltersResult)(nil)).Elem()
}

func (o GetRouteFiltersResultOutput) ToGetRouteFiltersResultOutput() GetRouteFiltersResultOutput {
	return o
}

func (o GetRouteFiltersResultOutput) ToGetRouteFiltersResultOutputWithContext(ctx context.Context) GetRouteFiltersResultOutput {
	return o
}

// List of Route Filters
func (o GetRouteFiltersResultOutput) Datas() GetRouteFiltersDataArrayOutput {
	return o.ApplyT(func(v GetRouteFiltersResult) []GetRouteFiltersData { return v.Datas }).(GetRouteFiltersDataArrayOutput)
}

// Filters for the Data Source Search Request. Maximum of 8 total filters.
func (o GetRouteFiltersResultOutput) Filters() GetRouteFiltersFilterArrayOutput {
	return o.ApplyT(func(v GetRouteFiltersResult) []GetRouteFiltersFilter { return v.Filters }).(GetRouteFiltersFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteFiltersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteFiltersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the Data Source Search Request
func (o GetRouteFiltersResultOutput) Pagination() GetRouteFiltersPaginationPtrOutput {
	return o.ApplyT(func(v GetRouteFiltersResult) *GetRouteFiltersPagination { return v.Pagination }).(GetRouteFiltersPaginationPtrOutput)
}

// Filters for the Data Source Search Request
func (o GetRouteFiltersResultOutput) Sorts() GetRouteFiltersSortArrayOutput {
	return o.ApplyT(func(v GetRouteFiltersResult) []GetRouteFiltersSort { return v.Sorts }).(GetRouteFiltersSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteFiltersResultOutput{})
}
