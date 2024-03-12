// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch port by uuid
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := fabric.GetPort(ctx, &fabric.GetPortArgs{
//				Uuid: "<uuid_of_port>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetPort(ctx *pulumi.Context, args *GetPortArgs, opts ...pulumi.InvokeOption) (*GetPortResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPortResult
	err := ctx.Invoke("equinix:fabric/getPort:getPort", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPort.
type GetPortArgs struct {
	// Equinix-assigned port identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getPort.
type GetPortResult struct {
	// Customer account information that is associated with this port
	Account GetPortAccount `pulumi:"account"`
	// Port available bandwidth in Mbps
	AvailableBandwidth int `pulumi:"availableBandwidth"`
	// Port bandwidth in Mbps
	Bandwidth int `pulumi:"bandwidth"`
	// Captures port lifecycle change information
	ChangeLog GetPortChangeLog `pulumi:"changeLog"`
	// Port description
	Description string `pulumi:"description"`
	// Port device
	Device GetPortDevice `pulumi:"device"`
	// Port encapsulation protocol
	Encapsulation GetPortEncapsulation `pulumi:"encapsulation"`
	// Port URI information
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Port Lag
	LagEnabled bool `pulumi:"lagEnabled"`
	// Port location information
	Location GetPortLocation `pulumi:"location"`
	// Port name
	Name string `pulumi:"name"`
	// Port specific operational data
	Operation GetPortOperation `pulumi:"operation"`
	// Port redundancy information
	Redundancy GetPortRedundancy `pulumi:"redundancy"`
	// Port service type
	ServiceType string `pulumi:"serviceType"`
	// Port state
	State string `pulumi:"state"`
	// Port type
	Type string `pulumi:"type"`
	// Port used bandwidth in Mbps
	UsedBandwidth int `pulumi:"usedBandwidth"`
	// Equinix-assigned port identifier
	Uuid string `pulumi:"uuid"`
}

func GetPortOutput(ctx *pulumi.Context, args GetPortOutputArgs, opts ...pulumi.InvokeOption) GetPortResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPortResult, error) {
			args := v.(GetPortArgs)
			r, err := GetPort(ctx, &args, opts...)
			var s GetPortResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPortResultOutput)
}

// A collection of arguments for invoking getPort.
type GetPortOutputArgs struct {
	// Equinix-assigned port identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (GetPortOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortArgs)(nil)).Elem()
}

// A collection of values returned by getPort.
type GetPortResultOutput struct{ *pulumi.OutputState }

func (GetPortResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortResult)(nil)).Elem()
}

func (o GetPortResultOutput) ToGetPortResultOutput() GetPortResultOutput {
	return o
}

func (o GetPortResultOutput) ToGetPortResultOutputWithContext(ctx context.Context) GetPortResultOutput {
	return o
}

// Customer account information that is associated with this port
func (o GetPortResultOutput) Account() GetPortAccountOutput {
	return o.ApplyT(func(v GetPortResult) GetPortAccount { return v.Account }).(GetPortAccountOutput)
}

// Port available bandwidth in Mbps
func (o GetPortResultOutput) AvailableBandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v GetPortResult) int { return v.AvailableBandwidth }).(pulumi.IntOutput)
}

// Port bandwidth in Mbps
func (o GetPortResultOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v GetPortResult) int { return v.Bandwidth }).(pulumi.IntOutput)
}

// Captures port lifecycle change information
func (o GetPortResultOutput) ChangeLog() GetPortChangeLogOutput {
	return o.ApplyT(func(v GetPortResult) GetPortChangeLog { return v.ChangeLog }).(GetPortChangeLogOutput)
}

// Port description
func (o GetPortResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Description }).(pulumi.StringOutput)
}

// Port device
func (o GetPortResultOutput) Device() GetPortDeviceOutput {
	return o.ApplyT(func(v GetPortResult) GetPortDevice { return v.Device }).(GetPortDeviceOutput)
}

// Port encapsulation protocol
func (o GetPortResultOutput) Encapsulation() GetPortEncapsulationOutput {
	return o.ApplyT(func(v GetPortResult) GetPortEncapsulation { return v.Encapsulation }).(GetPortEncapsulationOutput)
}

// Port URI information
func (o GetPortResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPortResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Id }).(pulumi.StringOutput)
}

// Port Lag
func (o GetPortResultOutput) LagEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetPortResult) bool { return v.LagEnabled }).(pulumi.BoolOutput)
}

// Port location information
func (o GetPortResultOutput) Location() GetPortLocationOutput {
	return o.ApplyT(func(v GetPortResult) GetPortLocation { return v.Location }).(GetPortLocationOutput)
}

// Port name
func (o GetPortResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Name }).(pulumi.StringOutput)
}

// Port specific operational data
func (o GetPortResultOutput) Operation() GetPortOperationOutput {
	return o.ApplyT(func(v GetPortResult) GetPortOperation { return v.Operation }).(GetPortOperationOutput)
}

// Port redundancy information
func (o GetPortResultOutput) Redundancy() GetPortRedundancyOutput {
	return o.ApplyT(func(v GetPortResult) GetPortRedundancy { return v.Redundancy }).(GetPortRedundancyOutput)
}

// Port service type
func (o GetPortResultOutput) ServiceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.ServiceType }).(pulumi.StringOutput)
}

// Port state
func (o GetPortResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.State }).(pulumi.StringOutput)
}

// Port type
func (o GetPortResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Type }).(pulumi.StringOutput)
}

// Port used bandwidth in Mbps
func (o GetPortResultOutput) UsedBandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v GetPortResult) int { return v.UsedBandwidth }).(pulumi.IntOutput)
}

// Equinix-assigned port identifier
func (o GetPortResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPortResultOutput{})
}
