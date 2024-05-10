// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Deprecated** Use `metal.getMetro` instead.  For more information, refer to the facility to metro migration guide.
//
// Provides an Equinix Metal facility datasource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ny5, err := metal.GetFacility(ctx, &metal.GetFacilityArgs{
//				Code: "ny5",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", ny5.Id)
//			return nil
//		})
//	}
//
// ```
func GetFacility(ctx *pulumi.Context, args *GetFacilityArgs, opts ...pulumi.InvokeOption) (*GetFacilityResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFacilityResult
	err := ctx.Invoke("equinix:metal/getFacility:getFacility", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFacility.
type GetFacilityArgs struct {
	// One or more device plans for which the facility must have capacity.
	Capacities []GetFacilityCapacity `pulumi:"capacities"`
	// The facility code to search for facilities.
	Code string `pulumi:"code"`
	// Set of feature strings that the facility must have. Some
	// possible values are `baremetal`, `ibx`, `storage`, `globalIpv4`, `backendTransfer`, `layer2`.
	FeaturesRequireds []string `pulumi:"featuresRequireds"`
}

// A collection of values returned by getFacility.
type GetFacilityResult struct {
	Capacities []GetFacilityCapacity `pulumi:"capacities"`
	Code       string                `pulumi:"code"`
	// The features of the facility.
	Features          []string `pulumi:"features"`
	FeaturesRequireds []string `pulumi:"featuresRequireds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The metro code the facility is part of.
	Metro string `pulumi:"metro"`
	// The name of the facility.
	Name string `pulumi:"name"`
}

func GetFacilityOutput(ctx *pulumi.Context, args GetFacilityOutputArgs, opts ...pulumi.InvokeOption) GetFacilityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFacilityResult, error) {
			args := v.(GetFacilityArgs)
			r, err := GetFacility(ctx, &args, opts...)
			var s GetFacilityResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFacilityResultOutput)
}

// A collection of arguments for invoking getFacility.
type GetFacilityOutputArgs struct {
	// One or more device plans for which the facility must have capacity.
	Capacities GetFacilityCapacityArrayInput `pulumi:"capacities"`
	// The facility code to search for facilities.
	Code pulumi.StringInput `pulumi:"code"`
	// Set of feature strings that the facility must have. Some
	// possible values are `baremetal`, `ibx`, `storage`, `globalIpv4`, `backendTransfer`, `layer2`.
	FeaturesRequireds pulumi.StringArrayInput `pulumi:"featuresRequireds"`
}

func (GetFacilityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFacilityArgs)(nil)).Elem()
}

// A collection of values returned by getFacility.
type GetFacilityResultOutput struct{ *pulumi.OutputState }

func (GetFacilityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFacilityResult)(nil)).Elem()
}

func (o GetFacilityResultOutput) ToGetFacilityResultOutput() GetFacilityResultOutput {
	return o
}

func (o GetFacilityResultOutput) ToGetFacilityResultOutputWithContext(ctx context.Context) GetFacilityResultOutput {
	return o
}

func (o GetFacilityResultOutput) Capacities() GetFacilityCapacityArrayOutput {
	return o.ApplyT(func(v GetFacilityResult) []GetFacilityCapacity { return v.Capacities }).(GetFacilityCapacityArrayOutput)
}

func (o GetFacilityResultOutput) Code() pulumi.StringOutput {
	return o.ApplyT(func(v GetFacilityResult) string { return v.Code }).(pulumi.StringOutput)
}

// The features of the facility.
func (o GetFacilityResultOutput) Features() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFacilityResult) []string { return v.Features }).(pulumi.StringArrayOutput)
}

func (o GetFacilityResultOutput) FeaturesRequireds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFacilityResult) []string { return v.FeaturesRequireds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFacilityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFacilityResult) string { return v.Id }).(pulumi.StringOutput)
}

// The metro code the facility is part of.
func (o GetFacilityResultOutput) Metro() pulumi.StringOutput {
	return o.ApplyT(func(v GetFacilityResult) string { return v.Metro }).(pulumi.StringOutput)
}

// The name of the facility.
func (o GetFacilityResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetFacilityResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFacilityResultOutput{})
}
