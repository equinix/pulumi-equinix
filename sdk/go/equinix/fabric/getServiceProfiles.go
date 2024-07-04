// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Service Profile by name filter criteria
//
// Additional documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles
func GetServiceProfiles(ctx *pulumi.Context, args *GetServiceProfilesArgs, opts ...pulumi.InvokeOption) (*GetServiceProfilesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceProfilesResult
	err := ctx.Invoke("equinix:fabric/getServiceProfiles:getServiceProfiles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceProfiles.
type GetServiceProfilesArgs struct {
	// Optional boolean flag to indicate if the filters will be AND'd together. Defaults to false
	AndFilters *bool `pulumi:"andFilters"`
	// Filters for the Data Source Search Request (If andFilters is not set to true you cannot provide more than one filter block)
	Filter GetServiceProfilesFilter `pulumi:"filter"`
	// Pagination details for the Data Source Search Request
	Pagination *GetServiceProfilesPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort []GetServiceProfilesSort `pulumi:"sort"`
	// flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
	ViewPoint *string `pulumi:"viewPoint"`
}

// A collection of values returned by getServiceProfiles.
type GetServiceProfilesResult struct {
	// Optional boolean flag to indicate if the filters will be AND'd together. Defaults to false
	AndFilters *bool `pulumi:"andFilters"`
	// List of Service Profiles
	Data []GetServiceProfilesDatum `pulumi:"data"`
	// Filters for the Data Source Search Request (If andFilters is not set to true you cannot provide more than one filter block)
	Filter GetServiceProfilesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Pagination details for the Data Source Search Request
	Pagination *GetServiceProfilesPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort []GetServiceProfilesSort `pulumi:"sort"`
	// flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
	ViewPoint *string `pulumi:"viewPoint"`
}

func GetServiceProfilesOutput(ctx *pulumi.Context, args GetServiceProfilesOutputArgs, opts ...pulumi.InvokeOption) GetServiceProfilesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceProfilesResult, error) {
			args := v.(GetServiceProfilesArgs)
			r, err := GetServiceProfiles(ctx, &args, opts...)
			var s GetServiceProfilesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceProfilesResultOutput)
}

// A collection of arguments for invoking getServiceProfiles.
type GetServiceProfilesOutputArgs struct {
	// Optional boolean flag to indicate if the filters will be AND'd together. Defaults to false
	AndFilters pulumi.BoolPtrInput `pulumi:"andFilters"`
	// Filters for the Data Source Search Request (If andFilters is not set to true you cannot provide more than one filter block)
	Filter GetServiceProfilesFilterInput `pulumi:"filter"`
	// Pagination details for the Data Source Search Request
	Pagination GetServiceProfilesPaginationPtrInput `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort GetServiceProfilesSortArrayInput `pulumi:"sort"`
	// flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
	ViewPoint pulumi.StringPtrInput `pulumi:"viewPoint"`
}

func (GetServiceProfilesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceProfilesArgs)(nil)).Elem()
}

// A collection of values returned by getServiceProfiles.
type GetServiceProfilesResultOutput struct{ *pulumi.OutputState }

func (GetServiceProfilesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceProfilesResult)(nil)).Elem()
}

func (o GetServiceProfilesResultOutput) ToGetServiceProfilesResultOutput() GetServiceProfilesResultOutput {
	return o
}

func (o GetServiceProfilesResultOutput) ToGetServiceProfilesResultOutputWithContext(ctx context.Context) GetServiceProfilesResultOutput {
	return o
}

// Optional boolean flag to indicate if the filters will be AND'd together. Defaults to false
func (o GetServiceProfilesResultOutput) AndFilters() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) *bool { return v.AndFilters }).(pulumi.BoolPtrOutput)
}

// List of Service Profiles
func (o GetServiceProfilesResultOutput) Data() GetServiceProfilesDatumArrayOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) []GetServiceProfilesDatum { return v.Data }).(GetServiceProfilesDatumArrayOutput)
}

// Filters for the Data Source Search Request (If andFilters is not set to true you cannot provide more than one filter block)
func (o GetServiceProfilesResultOutput) Filter() GetServiceProfilesFilterOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) GetServiceProfilesFilter { return v.Filter }).(GetServiceProfilesFilterOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceProfilesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the Data Source Search Request
func (o GetServiceProfilesResultOutput) Pagination() GetServiceProfilesPaginationPtrOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) *GetServiceProfilesPagination { return v.Pagination }).(GetServiceProfilesPaginationPtrOutput)
}

// Filters for the Data Source Search Request
func (o GetServiceProfilesResultOutput) Sort() GetServiceProfilesSortArrayOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) []GetServiceProfilesSort { return v.Sort }).(GetServiceProfilesSortArrayOutput)
}

// flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
func (o GetServiceProfilesResultOutput) ViewPoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceProfilesResult) *string { return v.ViewPoint }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceProfilesResultOutput{})
}
