// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Streams with pagination details
//
// Additional Documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
// * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
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
//			dataStreams, err := fabric.GetStreams(ctx, &fabric.GetStreamsArgs{
//				Pagination: fabric.GetStreamsPagination{
//					Limit:  2,
//					Offset: 1,
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("numberOfReturnedStreams", pulumi.Int(len(dataStreams.Datas)))
//			return nil
//		})
//	}
//
// ```
func GetStreams(ctx *pulumi.Context, args *GetStreamsArgs, opts ...pulumi.InvokeOption) (*GetStreamsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStreamsResult
	err := ctx.Invoke("equinix:fabric/getStreams:getStreams", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreams.
type GetStreamsArgs struct {
	// Pagination details for the returned streams list
	Pagination GetStreamsPagination `pulumi:"pagination"`
}

// A collection of values returned by getStreams.
type GetStreamsResult struct {
	// Returned list of stream objects
	Datas []GetStreamsData `pulumi:"datas"`
	// The unique identifier of the resource
	Id string `pulumi:"id"`
	// Pagination details for the returned streams list
	Pagination GetStreamsPagination `pulumi:"pagination"`
}

func GetStreamsOutput(ctx *pulumi.Context, args GetStreamsOutputArgs, opts ...pulumi.InvokeOption) GetStreamsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetStreamsResultOutput, error) {
			args := v.(GetStreamsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getStreams:getStreams", args, GetStreamsResultOutput{}, options).(GetStreamsResultOutput), nil
		}).(GetStreamsResultOutput)
}

// A collection of arguments for invoking getStreams.
type GetStreamsOutputArgs struct {
	// Pagination details for the returned streams list
	Pagination GetStreamsPaginationInput `pulumi:"pagination"`
}

func (GetStreamsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamsArgs)(nil)).Elem()
}

// A collection of values returned by getStreams.
type GetStreamsResultOutput struct{ *pulumi.OutputState }

func (GetStreamsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamsResult)(nil)).Elem()
}

func (o GetStreamsResultOutput) ToGetStreamsResultOutput() GetStreamsResultOutput {
	return o
}

func (o GetStreamsResultOutput) ToGetStreamsResultOutputWithContext(ctx context.Context) GetStreamsResultOutput {
	return o
}

// Returned list of stream objects
func (o GetStreamsResultOutput) Datas() GetStreamsDataArrayOutput {
	return o.ApplyT(func(v GetStreamsResult) []GetStreamsData { return v.Datas }).(GetStreamsDataArrayOutput)
}

// The unique identifier of the resource
func (o GetStreamsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStreamsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the returned streams list
func (o GetStreamsResultOutput) Pagination() GetStreamsPaginationOutput {
	return o.ApplyT(func(v GetStreamsResult) GetStreamsPagination { return v.Pagination }).(GetStreamsPaginationOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStreamsResultOutput{})
}
