// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Equinix Metal Spot Market Request resource to allow you to
// manage spot market requests on your account. For more detail on Spot Market,
// see [this article in Equinix Metal documentation](https://metal.equinix.com/developers/docs/deploy/spot-market/).
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			projectId := cfg.Require("projectId")
//			metro := "FR"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			request, err := metal.NewSpotMarketRequest(ctx, "request", &metal.SpotMarketRequestArgs{
//				ProjectId:   pulumi.String(projectId),
//				Metro:       pulumi.String(metro),
//				MaxBidPrice: pulumi.Float64(0.75),
//				DevicesMin:  pulumi.Int(1),
//				DevicesMax:  pulumi.Int(1),
//				InstanceParameters: &metal.SpotMarketRequestInstanceParametersArgs{
//					Hostname:        pulumi.String("testspot"),
//					BillingCycle:    pulumi.String("hourly"),
//					OperatingSystem: pulumi.String("ubuntu_20_04"),
//					Plan:            pulumi.String("c3.small.x86"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("requestId", request.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing spot market request ID: <break><break>```sh<break> $ pulumi import equinix:metal/spotMarketRequest:SpotMarketRequest equinix_metal_spot_market_request {existing_spot_market_request_id} <break>```<break><break>
type SpotMarketRequest struct {
	pulumi.CustomResourceState

	// Maximum number devices to be created.
	DevicesMax pulumi.IntOutput `pulumi:"devicesMax"`
	// Miniumum number devices to be created.
	DevicesMin pulumi.IntOutput `pulumi:"devicesMin"`
	// Facility IDs where devices should be created.
	Facilities pulumi.StringArrayOutput `pulumi:"facilities"`
	// Key/Value pairs of parameters for devices provisioned from
	// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
	// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
	// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
	// description in metal.Device docs.
	InstanceParameters SpotMarketRequestInstanceParametersOutput `pulumi:"instanceParameters"`
	// Maximum price user is willing to pay per hour per device.
	MaxBidPrice pulumi.Float64Output `pulumi:"maxBidPrice"`
	// Metro where devices should be created.
	Metro pulumi.StringPtrOutput `pulumi:"metro"`
	// Project ID.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// On resource creation wait until all desired devices are active.
	// On resource destruction wait until devices are removed.
	WaitForDevices pulumi.BoolPtrOutput `pulumi:"waitForDevices"`
}

// NewSpotMarketRequest registers a new resource with the given unique name, arguments, and options.
func NewSpotMarketRequest(ctx *pulumi.Context,
	name string, args *SpotMarketRequestArgs, opts ...pulumi.ResourceOption) (*SpotMarketRequest, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DevicesMax == nil {
		return nil, errors.New("invalid value for required argument 'DevicesMax'")
	}
	if args.DevicesMin == nil {
		return nil, errors.New("invalid value for required argument 'DevicesMin'")
	}
	if args.InstanceParameters == nil {
		return nil, errors.New("invalid value for required argument 'InstanceParameters'")
	}
	if args.MaxBidPrice == nil {
		return nil, errors.New("invalid value for required argument 'MaxBidPrice'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SpotMarketRequest
	err := ctx.RegisterResource("equinix:metal/spotMarketRequest:SpotMarketRequest", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpotMarketRequest gets an existing SpotMarketRequest resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpotMarketRequest(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpotMarketRequestState, opts ...pulumi.ResourceOption) (*SpotMarketRequest, error) {
	var resource SpotMarketRequest
	err := ctx.ReadResource("equinix:metal/spotMarketRequest:SpotMarketRequest", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpotMarketRequest resources.
type spotMarketRequestState struct {
	// Maximum number devices to be created.
	DevicesMax *int `pulumi:"devicesMax"`
	// Miniumum number devices to be created.
	DevicesMin *int `pulumi:"devicesMin"`
	// Facility IDs where devices should be created.
	Facilities []string `pulumi:"facilities"`
	// Key/Value pairs of parameters for devices provisioned from
	// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
	// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
	// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
	// description in metal.Device docs.
	InstanceParameters *SpotMarketRequestInstanceParameters `pulumi:"instanceParameters"`
	// Maximum price user is willing to pay per hour per device.
	MaxBidPrice *float64 `pulumi:"maxBidPrice"`
	// Metro where devices should be created.
	Metro *string `pulumi:"metro"`
	// Project ID.
	ProjectId *string `pulumi:"projectId"`
	// On resource creation wait until all desired devices are active.
	// On resource destruction wait until devices are removed.
	WaitForDevices *bool `pulumi:"waitForDevices"`
}

type SpotMarketRequestState struct {
	// Maximum number devices to be created.
	DevicesMax pulumi.IntPtrInput
	// Miniumum number devices to be created.
	DevicesMin pulumi.IntPtrInput
	// Facility IDs where devices should be created.
	Facilities pulumi.StringArrayInput
	// Key/Value pairs of parameters for devices provisioned from
	// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
	// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
	// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
	// description in metal.Device docs.
	InstanceParameters SpotMarketRequestInstanceParametersPtrInput
	// Maximum price user is willing to pay per hour per device.
	MaxBidPrice pulumi.Float64PtrInput
	// Metro where devices should be created.
	Metro pulumi.StringPtrInput
	// Project ID.
	ProjectId pulumi.StringPtrInput
	// On resource creation wait until all desired devices are active.
	// On resource destruction wait until devices are removed.
	WaitForDevices pulumi.BoolPtrInput
}

func (SpotMarketRequestState) ElementType() reflect.Type {
	return reflect.TypeOf((*spotMarketRequestState)(nil)).Elem()
}

type spotMarketRequestArgs struct {
	// Maximum number devices to be created.
	DevicesMax int `pulumi:"devicesMax"`
	// Miniumum number devices to be created.
	DevicesMin int `pulumi:"devicesMin"`
	// Facility IDs where devices should be created.
	Facilities []string `pulumi:"facilities"`
	// Key/Value pairs of parameters for devices provisioned from
	// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
	// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
	// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
	// description in metal.Device docs.
	InstanceParameters SpotMarketRequestInstanceParameters `pulumi:"instanceParameters"`
	// Maximum price user is willing to pay per hour per device.
	MaxBidPrice float64 `pulumi:"maxBidPrice"`
	// Metro where devices should be created.
	Metro *string `pulumi:"metro"`
	// Project ID.
	ProjectId string `pulumi:"projectId"`
	// On resource creation wait until all desired devices are active.
	// On resource destruction wait until devices are removed.
	WaitForDevices *bool `pulumi:"waitForDevices"`
}

// The set of arguments for constructing a SpotMarketRequest resource.
type SpotMarketRequestArgs struct {
	// Maximum number devices to be created.
	DevicesMax pulumi.IntInput
	// Miniumum number devices to be created.
	DevicesMin pulumi.IntInput
	// Facility IDs where devices should be created.
	Facilities pulumi.StringArrayInput
	// Key/Value pairs of parameters for devices provisioned from
	// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
	// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
	// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
	// description in metal.Device docs.
	InstanceParameters SpotMarketRequestInstanceParametersInput
	// Maximum price user is willing to pay per hour per device.
	MaxBidPrice pulumi.Float64Input
	// Metro where devices should be created.
	Metro pulumi.StringPtrInput
	// Project ID.
	ProjectId pulumi.StringInput
	// On resource creation wait until all desired devices are active.
	// On resource destruction wait until devices are removed.
	WaitForDevices pulumi.BoolPtrInput
}

func (SpotMarketRequestArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spotMarketRequestArgs)(nil)).Elem()
}

type SpotMarketRequestInput interface {
	pulumi.Input

	ToSpotMarketRequestOutput() SpotMarketRequestOutput
	ToSpotMarketRequestOutputWithContext(ctx context.Context) SpotMarketRequestOutput
}

func (*SpotMarketRequest) ElementType() reflect.Type {
	return reflect.TypeOf((**SpotMarketRequest)(nil)).Elem()
}

func (i *SpotMarketRequest) ToSpotMarketRequestOutput() SpotMarketRequestOutput {
	return i.ToSpotMarketRequestOutputWithContext(context.Background())
}

func (i *SpotMarketRequest) ToSpotMarketRequestOutputWithContext(ctx context.Context) SpotMarketRequestOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotMarketRequestOutput)
}

// SpotMarketRequestArrayInput is an input type that accepts SpotMarketRequestArray and SpotMarketRequestArrayOutput values.
// You can construct a concrete instance of `SpotMarketRequestArrayInput` via:
//
//	SpotMarketRequestArray{ SpotMarketRequestArgs{...} }
type SpotMarketRequestArrayInput interface {
	pulumi.Input

	ToSpotMarketRequestArrayOutput() SpotMarketRequestArrayOutput
	ToSpotMarketRequestArrayOutputWithContext(context.Context) SpotMarketRequestArrayOutput
}

type SpotMarketRequestArray []SpotMarketRequestInput

func (SpotMarketRequestArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpotMarketRequest)(nil)).Elem()
}

func (i SpotMarketRequestArray) ToSpotMarketRequestArrayOutput() SpotMarketRequestArrayOutput {
	return i.ToSpotMarketRequestArrayOutputWithContext(context.Background())
}

func (i SpotMarketRequestArray) ToSpotMarketRequestArrayOutputWithContext(ctx context.Context) SpotMarketRequestArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotMarketRequestArrayOutput)
}

// SpotMarketRequestMapInput is an input type that accepts SpotMarketRequestMap and SpotMarketRequestMapOutput values.
// You can construct a concrete instance of `SpotMarketRequestMapInput` via:
//
//	SpotMarketRequestMap{ "key": SpotMarketRequestArgs{...} }
type SpotMarketRequestMapInput interface {
	pulumi.Input

	ToSpotMarketRequestMapOutput() SpotMarketRequestMapOutput
	ToSpotMarketRequestMapOutputWithContext(context.Context) SpotMarketRequestMapOutput
}

type SpotMarketRequestMap map[string]SpotMarketRequestInput

func (SpotMarketRequestMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpotMarketRequest)(nil)).Elem()
}

func (i SpotMarketRequestMap) ToSpotMarketRequestMapOutput() SpotMarketRequestMapOutput {
	return i.ToSpotMarketRequestMapOutputWithContext(context.Background())
}

func (i SpotMarketRequestMap) ToSpotMarketRequestMapOutputWithContext(ctx context.Context) SpotMarketRequestMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotMarketRequestMapOutput)
}

type SpotMarketRequestOutput struct{ *pulumi.OutputState }

func (SpotMarketRequestOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpotMarketRequest)(nil)).Elem()
}

func (o SpotMarketRequestOutput) ToSpotMarketRequestOutput() SpotMarketRequestOutput {
	return o
}

func (o SpotMarketRequestOutput) ToSpotMarketRequestOutputWithContext(ctx context.Context) SpotMarketRequestOutput {
	return o
}

// Maximum number devices to be created.
func (o SpotMarketRequestOutput) DevicesMax() pulumi.IntOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.IntOutput { return v.DevicesMax }).(pulumi.IntOutput)
}

// Miniumum number devices to be created.
func (o SpotMarketRequestOutput) DevicesMin() pulumi.IntOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.IntOutput { return v.DevicesMin }).(pulumi.IntOutput)
}

// Facility IDs where devices should be created.
func (o SpotMarketRequestOutput) Facilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.StringArrayOutput { return v.Facilities }).(pulumi.StringArrayOutput)
}

// Key/Value pairs of parameters for devices provisioned from
// this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
// `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
// `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
// description in metal.Device docs.
func (o SpotMarketRequestOutput) InstanceParameters() SpotMarketRequestInstanceParametersOutput {
	return o.ApplyT(func(v *SpotMarketRequest) SpotMarketRequestInstanceParametersOutput { return v.InstanceParameters }).(SpotMarketRequestInstanceParametersOutput)
}

// Maximum price user is willing to pay per hour per device.
func (o SpotMarketRequestOutput) MaxBidPrice() pulumi.Float64Output {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.Float64Output { return v.MaxBidPrice }).(pulumi.Float64Output)
}

// Metro where devices should be created.
func (o SpotMarketRequestOutput) Metro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.StringPtrOutput { return v.Metro }).(pulumi.StringPtrOutput)
}

// Project ID.
func (o SpotMarketRequestOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// On resource creation wait until all desired devices are active.
// On resource destruction wait until devices are removed.
func (o SpotMarketRequestOutput) WaitForDevices() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SpotMarketRequest) pulumi.BoolPtrOutput { return v.WaitForDevices }).(pulumi.BoolPtrOutput)
}

type SpotMarketRequestArrayOutput struct{ *pulumi.OutputState }

func (SpotMarketRequestArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpotMarketRequest)(nil)).Elem()
}

func (o SpotMarketRequestArrayOutput) ToSpotMarketRequestArrayOutput() SpotMarketRequestArrayOutput {
	return o
}

func (o SpotMarketRequestArrayOutput) ToSpotMarketRequestArrayOutputWithContext(ctx context.Context) SpotMarketRequestArrayOutput {
	return o
}

func (o SpotMarketRequestArrayOutput) Index(i pulumi.IntInput) SpotMarketRequestOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpotMarketRequest {
		return vs[0].([]*SpotMarketRequest)[vs[1].(int)]
	}).(SpotMarketRequestOutput)
}

type SpotMarketRequestMapOutput struct{ *pulumi.OutputState }

func (SpotMarketRequestMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpotMarketRequest)(nil)).Elem()
}

func (o SpotMarketRequestMapOutput) ToSpotMarketRequestMapOutput() SpotMarketRequestMapOutput {
	return o
}

func (o SpotMarketRequestMapOutput) ToSpotMarketRequestMapOutputWithContext(ctx context.Context) SpotMarketRequestMapOutput {
	return o
}

func (o SpotMarketRequestMapOutput) MapIndex(k pulumi.StringInput) SpotMarketRequestOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpotMarketRequest {
		return vs[0].(map[string]*SpotMarketRequest)[vs[1].(string)]
	}).(SpotMarketRequestOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpotMarketRequestInput)(nil)).Elem(), &SpotMarketRequest{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotMarketRequestArrayInput)(nil)).Elem(), SpotMarketRequestArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotMarketRequestMapInput)(nil)).Elem(), SpotMarketRequestMap{})
	pulumi.RegisterOutputType(SpotMarketRequestOutput{})
	pulumi.RegisterOutputType(SpotMarketRequestArrayOutput{})
	pulumi.RegisterOutputType(SpotMarketRequestMapOutput{})
}
