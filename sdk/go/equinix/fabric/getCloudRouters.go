// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Fabric Cloud Routers matching custom search criteria
//
// Additional documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers
func GetCloudRouters(ctx *pulumi.Context, args *GetCloudRoutersArgs, opts ...pulumi.InvokeOption) (*GetCloudRoutersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCloudRoutersResult
	err := ctx.Invoke("equinix:fabric/getCloudRouters:getCloudRouters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudRouters.
type GetCloudRoutersArgs struct {
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters []GetCloudRoutersFilter `pulumi:"filters"`
	// Pagination details for the Data Source Search Request
	Pagination *GetCloudRoutersPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort *GetCloudRoutersSort `pulumi:"sort"`
}

// A collection of values returned by getCloudRouters.
type GetCloudRoutersResult struct {
	// List of Cloud Routers
	Datas []GetCloudRoutersData `pulumi:"datas"`
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters []GetCloudRoutersFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Pagination details for the Data Source Search Request
	Pagination *GetCloudRoutersPagination `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort *GetCloudRoutersSort `pulumi:"sort"`
}

func GetCloudRoutersOutput(ctx *pulumi.Context, args GetCloudRoutersOutputArgs, opts ...pulumi.InvokeOption) GetCloudRoutersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCloudRoutersResultOutput, error) {
			args := v.(GetCloudRoutersArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetCloudRoutersResult
			secret, err := ctx.InvokePackageRaw("equinix:fabric/getCloudRouters:getCloudRouters", args, &rv, "", opts...)
			if err != nil {
				return GetCloudRoutersResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetCloudRoutersResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetCloudRoutersResultOutput), nil
			}
			return output, nil
		}).(GetCloudRoutersResultOutput)
}

// A collection of arguments for invoking getCloudRouters.
type GetCloudRoutersOutputArgs struct {
	// Filters for the Data Source Search Request. Maximum of 8 total filters.
	Filters GetCloudRoutersFilterArrayInput `pulumi:"filters"`
	// Pagination details for the Data Source Search Request
	Pagination GetCloudRoutersPaginationPtrInput `pulumi:"pagination"`
	// Filters for the Data Source Search Request
	Sort GetCloudRoutersSortPtrInput `pulumi:"sort"`
}

func (GetCloudRoutersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCloudRoutersArgs)(nil)).Elem()
}

// A collection of values returned by getCloudRouters.
type GetCloudRoutersResultOutput struct{ *pulumi.OutputState }

func (GetCloudRoutersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCloudRoutersResult)(nil)).Elem()
}

func (o GetCloudRoutersResultOutput) ToGetCloudRoutersResultOutput() GetCloudRoutersResultOutput {
	return o
}

func (o GetCloudRoutersResultOutput) ToGetCloudRoutersResultOutputWithContext(ctx context.Context) GetCloudRoutersResultOutput {
	return o
}

// List of Cloud Routers
func (o GetCloudRoutersResultOutput) Datas() GetCloudRoutersDataArrayOutput {
	return o.ApplyT(func(v GetCloudRoutersResult) []GetCloudRoutersData { return v.Datas }).(GetCloudRoutersDataArrayOutput)
}

// Filters for the Data Source Search Request. Maximum of 8 total filters.
func (o GetCloudRoutersResultOutput) Filters() GetCloudRoutersFilterArrayOutput {
	return o.ApplyT(func(v GetCloudRoutersResult) []GetCloudRoutersFilter { return v.Filters }).(GetCloudRoutersFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCloudRoutersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCloudRoutersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the Data Source Search Request
func (o GetCloudRoutersResultOutput) Pagination() GetCloudRoutersPaginationPtrOutput {
	return o.ApplyT(func(v GetCloudRoutersResult) *GetCloudRoutersPagination { return v.Pagination }).(GetCloudRoutersPaginationPtrOutput)
}

// Filters for the Data Source Search Request
func (o GetCloudRoutersResultOutput) Sort() GetCloudRoutersSortPtrOutput {
	return o.ApplyT(func(v GetCloudRoutersResult) *GetCloudRoutersSort { return v.Sort }).(GetCloudRoutersSortPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCloudRoutersResultOutput{})
}
