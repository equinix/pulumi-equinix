// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
//
// Additional documentation:
// * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm>
// * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks>
func GetNetworks(ctx *pulumi.Context, args *GetNetworksArgs, opts ...pulumi.InvokeOption) (*GetNetworksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworksResult
	err := ctx.Invoke("equinix:fabric/getNetworks:getNetworks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworks.
type GetNetworksArgs struct {
	// Filters for the Data Source Search Request
	Filters []GetNetworksFilter `pulumi:"filters"`
	// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
	OuterOperator string `pulumi:"outerOperator"`
	// Pagination details for the Data Source Search Request
	Pagination *GetNetworksPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts []GetNetworksSort `pulumi:"sorts"`
}

// A collection of values returned by getNetworks.
type GetNetworksResult struct {
	// List of Cloud Routers
	Datas []GetNetworksData `pulumi:"datas"`
	// Filters for the Data Source Search Request
	Filters []GetNetworksFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
	OuterOperator string `pulumi:"outerOperator"`
	// Pagination details for the Data Source Search Request
	Pagination *GetNetworksPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts []GetNetworksSort `pulumi:"sorts"`
}

func GetNetworksOutput(ctx *pulumi.Context, args GetNetworksOutputArgs, opts ...pulumi.InvokeOption) GetNetworksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworksResult, error) {
			args := v.(GetNetworksArgs)
			r, err := GetNetworks(ctx, &args, opts...)
			var s GetNetworksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworksResultOutput)
}

// A collection of arguments for invoking getNetworks.
type GetNetworksOutputArgs struct {
	// Filters for the Data Source Search Request
	Filters GetNetworksFilterArrayInput `pulumi:"filters"`
	// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
	OuterOperator pulumi.StringInput `pulumi:"outerOperator"`
	// Pagination details for the Data Source Search Request
	Pagination GetNetworksPaginationPtrInput `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sorts GetNetworksSortArrayInput `pulumi:"sorts"`
}

func (GetNetworksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksArgs)(nil)).Elem()
}

// A collection of values returned by getNetworks.
type GetNetworksResultOutput struct{ *pulumi.OutputState }

func (GetNetworksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksResult)(nil)).Elem()
}

func (o GetNetworksResultOutput) ToGetNetworksResultOutput() GetNetworksResultOutput {
	return o
}

func (o GetNetworksResultOutput) ToGetNetworksResultOutputWithContext(ctx context.Context) GetNetworksResultOutput {
	return o
}

// List of Cloud Routers
func (o GetNetworksResultOutput) Datas() GetNetworksDataArrayOutput {
	return o.ApplyT(func(v GetNetworksResult) []GetNetworksData { return v.Datas }).(GetNetworksDataArrayOutput)
}

// Filters for the Data Source Search Request
func (o GetNetworksResultOutput) Filters() GetNetworksFilterArrayOutput {
	return o.ApplyT(func(v GetNetworksResult) []GetNetworksFilter { return v.Filters }).(GetNetworksFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksResult) string { return v.Id }).(pulumi.StringOutput)
}

// Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
func (o GetNetworksResultOutput) OuterOperator() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksResult) string { return v.OuterOperator }).(pulumi.StringOutput)
}

// Pagination details for the Data Source Search Request
func (o GetNetworksResultOutput) Pagination() GetNetworksPaginationPtrOutput {
	return o.ApplyT(func(v GetNetworksResult) *GetNetworksPagination { return v.Pagination }).(GetNetworksPaginationPtrOutput)
}

// Filters for the Data Source Search Request
func (o GetNetworksResultOutput) Sorts() GetNetworksSortArrayOutput {
	return o.ApplyT(func(v GetNetworksResult) []GetNetworksSort { return v.Sorts }).(GetNetworksSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworksResultOutput{})
}