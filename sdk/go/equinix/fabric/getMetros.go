// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			metros, err := fabric.GetMetros(ctx, &fabric.GetMetrosArgs{
//				Pagination: fabric.GetMetrosPagination{
//					Limit:  pulumi.IntRef(12),
//					Offset: pulumi.IntRef(6),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("numberOfReturnedMetros", pulumi.Int(len(metros.Datas)))
//			ctx.Export("firstMetroType", metros.Datas[0].Type)
//			ctx.Export("firstMetroCode", metros.Datas[0].Code)
//			ctx.Export("firstMetroRegion", metros.Datas[0].Region)
//			ctx.Export("firstMetroName", metros.Datas[0].Name)
//			ctx.Export("firstMetroEquinixAsn", metros.Datas[0].EquinixAsn)
//			ctx.Export("firstMetroLocalVcBandwidthMax", metros.Datas[0].LocalVcBandwidthMax)
//			ctx.Export("firstMetroGeoCoordinates", metros.Datas[0].GeoCoordinates)
//			ctx.Export("firstMetroConnectedMetros", metros.Datas[0].ConnectedMetros)
//			ctx.Export("firstMetroGeoScopes", metros.Datas[0].GeoScopes)
//			return nil
//		})
//	}
//
// ```
func GetMetros(ctx *pulumi.Context, args *GetMetrosArgs, opts ...pulumi.InvokeOption) (*GetMetrosResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMetrosResult
	err := ctx.Invoke("equinix:fabric/getMetros:getMetros", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMetros.
type GetMetrosArgs struct {
	// Pagination details for the returned metro list
	Pagination GetMetrosPagination `pulumi:"pagination"`
	// User On Boarded Metros based on Fabric resource availability
	Presence *string `pulumi:"presence"`
}

// A collection of values returned by getMetros.
type GetMetrosResult struct {
	// Returned list of metro objects
	Datas []GetMetrosData `pulumi:"datas"`
	// The unique identifier of the resource
	Id string `pulumi:"id"`
	// Pagination details for the returned metro list
	Pagination GetMetrosPagination `pulumi:"pagination"`
	// User On Boarded Metros based on Fabric resource availability
	Presence *string `pulumi:"presence"`
}

func GetMetrosOutput(ctx *pulumi.Context, args GetMetrosOutputArgs, opts ...pulumi.InvokeOption) GetMetrosResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMetrosResultOutput, error) {
			args := v.(GetMetrosArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getMetros:getMetros", args, GetMetrosResultOutput{}, options).(GetMetrosResultOutput), nil
		}).(GetMetrosResultOutput)
}

// A collection of arguments for invoking getMetros.
type GetMetrosOutputArgs struct {
	// Pagination details for the returned metro list
	Pagination GetMetrosPaginationInput `pulumi:"pagination"`
	// User On Boarded Metros based on Fabric resource availability
	Presence pulumi.StringPtrInput `pulumi:"presence"`
}

func (GetMetrosOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetrosArgs)(nil)).Elem()
}

// A collection of values returned by getMetros.
type GetMetrosResultOutput struct{ *pulumi.OutputState }

func (GetMetrosResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetrosResult)(nil)).Elem()
}

func (o GetMetrosResultOutput) ToGetMetrosResultOutput() GetMetrosResultOutput {
	return o
}

func (o GetMetrosResultOutput) ToGetMetrosResultOutputWithContext(ctx context.Context) GetMetrosResultOutput {
	return o
}

// Returned list of metro objects
func (o GetMetrosResultOutput) Datas() GetMetrosDataArrayOutput {
	return o.ApplyT(func(v GetMetrosResult) []GetMetrosData { return v.Datas }).(GetMetrosDataArrayOutput)
}

// The unique identifier of the resource
func (o GetMetrosResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetrosResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the returned metro list
func (o GetMetrosResultOutput) Pagination() GetMetrosPaginationOutput {
	return o.ApplyT(func(v GetMetrosResult) GetMetrosPagination { return v.Pagination }).(GetMetrosPaginationOutput)
}

// User On Boarded Metros based on Fabric resource availability
func (o GetMetrosResultOutput) Presence() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetrosResult) *string { return v.Presence }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMetrosResultOutput{})
}
