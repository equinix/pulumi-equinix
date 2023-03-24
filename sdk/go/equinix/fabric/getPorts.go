// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetPorts(ctx *pulumi.Context, args *GetPortsArgs, opts ...pulumi.InvokeOption) (*GetPortsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetPortsResult
	err := ctx.Invoke("equinix:fabric/getPorts:getPorts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPorts.
type GetPortsArgs struct {
	// name
	Filter *GetPortsFilter `pulumi:"filter"`
}

// A collection of values returned by getPorts.
type GetPortsResult struct {
	// List of  Ports
	Data []GetPortsDatum `pulumi:"data"`
	// name
	Filter *GetPortsFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetPortsOutput(ctx *pulumi.Context, args GetPortsOutputArgs, opts ...pulumi.InvokeOption) GetPortsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPortsResult, error) {
			args := v.(GetPortsArgs)
			r, err := GetPorts(ctx, &args, opts...)
			var s GetPortsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPortsResultOutput)
}

// A collection of arguments for invoking getPorts.
type GetPortsOutputArgs struct {
	// name
	Filter GetPortsFilterPtrInput `pulumi:"filter"`
}

func (GetPortsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortsArgs)(nil)).Elem()
}

// A collection of values returned by getPorts.
type GetPortsResultOutput struct{ *pulumi.OutputState }

func (GetPortsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortsResult)(nil)).Elem()
}

func (o GetPortsResultOutput) ToGetPortsResultOutput() GetPortsResultOutput {
	return o
}

func (o GetPortsResultOutput) ToGetPortsResultOutputWithContext(ctx context.Context) GetPortsResultOutput {
	return o
}

// List of  Ports
func (o GetPortsResultOutput) Data() GetPortsDatumArrayOutput {
	return o.ApplyT(func(v GetPortsResult) []GetPortsDatum { return v.Data }).(GetPortsDatumArrayOutput)
}

// name
func (o GetPortsResultOutput) Filter() GetPortsFilterPtrOutput {
	return o.ApplyT(func(v GetPortsResult) *GetPortsFilter { return v.Filter }).(GetPortsFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPortsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPortsResultOutput{})
}
