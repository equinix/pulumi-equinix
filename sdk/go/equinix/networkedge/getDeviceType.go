// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkedge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get Equinix Network Edge device type details. For further details, check supported
// [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkedge.GetDeviceType(ctx, &networkedge.GetDeviceTypeArgs{
//				Category: pulumi.StringRef("Router"),
//				MetroCodes: []string{
//					"DC",
//					"SV",
//				},
//				Vendor: pulumi.StringRef("Cisco"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDeviceType(ctx *pulumi.Context, args *GetDeviceTypeArgs, opts ...pulumi.InvokeOption) (*GetDeviceTypeResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetDeviceTypeResult
	err := ctx.Invoke("equinix:networkedge/getDeviceType:getDeviceType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDeviceType.
type GetDeviceTypeArgs struct {
	// Device type category. One of: `Router`, `Firewall`, `SDWAN`.
	Category *string `pulumi:"category"`
	// List of metro codes where device type has to be available
	MetroCodes []string `pulumi:"metroCodes"`
	// Device type name.
	Name *string `pulumi:"name"`
	// Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
	Vendor *string `pulumi:"vendor"`
}

// A collection of values returned by getDeviceType.
type GetDeviceTypeResult struct {
	Category string `pulumi:"category"`
	// Device type short code, unique identifier of a network device type
	Code string `pulumi:"code"`
	// Device type textual description
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	MetroCodes []string `pulumi:"metroCodes"`
	Name       string   `pulumi:"name"`
	Vendor     string   `pulumi:"vendor"`
}

func GetDeviceTypeOutput(ctx *pulumi.Context, args GetDeviceTypeOutputArgs, opts ...pulumi.InvokeOption) GetDeviceTypeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDeviceTypeResult, error) {
			args := v.(GetDeviceTypeArgs)
			r, err := GetDeviceType(ctx, &args, opts...)
			var s GetDeviceTypeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDeviceTypeResultOutput)
}

// A collection of arguments for invoking getDeviceType.
type GetDeviceTypeOutputArgs struct {
	// Device type category. One of: `Router`, `Firewall`, `SDWAN`.
	Category pulumi.StringPtrInput `pulumi:"category"`
	// List of metro codes where device type has to be available
	MetroCodes pulumi.StringArrayInput `pulumi:"metroCodes"`
	// Device type name.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
	Vendor pulumi.StringPtrInput `pulumi:"vendor"`
}

func (GetDeviceTypeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeviceTypeArgs)(nil)).Elem()
}

// A collection of values returned by getDeviceType.
type GetDeviceTypeResultOutput struct{ *pulumi.OutputState }

func (GetDeviceTypeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeviceTypeResult)(nil)).Elem()
}

func (o GetDeviceTypeResultOutput) ToGetDeviceTypeResultOutput() GetDeviceTypeResultOutput {
	return o
}

func (o GetDeviceTypeResultOutput) ToGetDeviceTypeResultOutputWithContext(ctx context.Context) GetDeviceTypeResultOutput {
	return o
}

func (o GetDeviceTypeResultOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Category }).(pulumi.StringOutput)
}

// Device type short code, unique identifier of a network device type
func (o GetDeviceTypeResultOutput) Code() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Code }).(pulumi.StringOutput)
}

// Device type textual description
func (o GetDeviceTypeResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDeviceTypeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDeviceTypeResultOutput) MetroCodes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) []string { return v.MetroCodes }).(pulumi.StringArrayOutput)
}

func (o GetDeviceTypeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetDeviceTypeResultOutput) Vendor() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeviceTypeResult) string { return v.Vendor }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDeviceTypeResultOutput{})
}
