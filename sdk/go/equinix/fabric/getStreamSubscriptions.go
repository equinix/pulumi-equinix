// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data source that allows user to fetch Equinix Fabric Stream Subscriptions with pagination
//
// Additional Documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
// * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Subscriptions
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
//			_, err := fabric.GetStreamSubscriptions(ctx, &fabric.GetStreamSubscriptionsArgs{
//				Pagination: fabric.GetStreamSubscriptionsPagination{
//					Limit:  10,
//					Offset: 0,
//				},
//				StreamId: "<stream_id>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetStreamSubscriptions(ctx *pulumi.Context, args *GetStreamSubscriptionsArgs, opts ...pulumi.InvokeOption) (*GetStreamSubscriptionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStreamSubscriptionsResult
	err := ctx.Invoke("equinix:fabric/getStreamSubscriptions:getStreamSubscriptions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamSubscriptions.
type GetStreamSubscriptionsArgs struct {
	// Pagination details for the returned streams list
	Pagination GetStreamSubscriptionsPagination `pulumi:"pagination"`
	// The uuid of the stream that is the target of the stream subscription
	StreamId string `pulumi:"streamId"`
}

// A collection of values returned by getStreamSubscriptions.
type GetStreamSubscriptionsResult struct {
	// Returned list of stream objects
	Datas []GetStreamSubscriptionsData `pulumi:"datas"`
	// The unique identifier of the resource
	Id string `pulumi:"id"`
	// Pagination details for the returned streams list
	Pagination GetStreamSubscriptionsPagination `pulumi:"pagination"`
	// The uuid of the stream that is the target of the stream subscription
	StreamId string `pulumi:"streamId"`
}

func GetStreamSubscriptionsOutput(ctx *pulumi.Context, args GetStreamSubscriptionsOutputArgs, opts ...pulumi.InvokeOption) GetStreamSubscriptionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetStreamSubscriptionsResultOutput, error) {
			args := v.(GetStreamSubscriptionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getStreamSubscriptions:getStreamSubscriptions", args, GetStreamSubscriptionsResultOutput{}, options).(GetStreamSubscriptionsResultOutput), nil
		}).(GetStreamSubscriptionsResultOutput)
}

// A collection of arguments for invoking getStreamSubscriptions.
type GetStreamSubscriptionsOutputArgs struct {
	// Pagination details for the returned streams list
	Pagination GetStreamSubscriptionsPaginationInput `pulumi:"pagination"`
	// The uuid of the stream that is the target of the stream subscription
	StreamId pulumi.StringInput `pulumi:"streamId"`
}

func (GetStreamSubscriptionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamSubscriptionsArgs)(nil)).Elem()
}

// A collection of values returned by getStreamSubscriptions.
type GetStreamSubscriptionsResultOutput struct{ *pulumi.OutputState }

func (GetStreamSubscriptionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStreamSubscriptionsResult)(nil)).Elem()
}

func (o GetStreamSubscriptionsResultOutput) ToGetStreamSubscriptionsResultOutput() GetStreamSubscriptionsResultOutput {
	return o
}

func (o GetStreamSubscriptionsResultOutput) ToGetStreamSubscriptionsResultOutputWithContext(ctx context.Context) GetStreamSubscriptionsResultOutput {
	return o
}

// Returned list of stream objects
func (o GetStreamSubscriptionsResultOutput) Datas() GetStreamSubscriptionsDataArrayOutput {
	return o.ApplyT(func(v GetStreamSubscriptionsResult) []GetStreamSubscriptionsData { return v.Datas }).(GetStreamSubscriptionsDataArrayOutput)
}

// The unique identifier of the resource
func (o GetStreamSubscriptionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStreamSubscriptionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Pagination details for the returned streams list
func (o GetStreamSubscriptionsResultOutput) Pagination() GetStreamSubscriptionsPaginationOutput {
	return o.ApplyT(func(v GetStreamSubscriptionsResult) GetStreamSubscriptionsPagination { return v.Pagination }).(GetStreamSubscriptionsPaginationOutput)
}

// The uuid of the stream that is the target of the stream subscription
func (o GetStreamSubscriptionsResultOutput) StreamId() pulumi.StringOutput {
	return o.ApplyT(func(v GetStreamSubscriptionsResult) string { return v.StreamId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStreamSubscriptionsResultOutput{})
}
