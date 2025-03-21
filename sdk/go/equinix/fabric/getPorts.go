// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch port by name
//
// Additional documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-ports-implement.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#ports
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
//			_, err := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
//				Filter: fabric.GetPortsFilter{
//					Name: "<name_of_port||port_prefix>",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", data.Equinix_fabric_port.Ports_data_name.Data[0].Id)
//			ctx.Export("name", data.Equinix_fabric_port.Ports_data_name.Data[0].Name)
//			ctx.Export("state", data.Equinix_fabric_port.Ports_data_name.Data[0].State)
//			ctx.Export("accountName", data.Equinix_fabric_port.Ports_data_name.Data[0].Account[0].Account_name)
//			ctx.Export("type", data.Equinix_fabric_port.Ports_data_name.Data[0].Type)
//			ctx.Export("bandwidth", data.Equinix_fabric_port.Ports_data_name.Data[0].Bandwidth)
//			ctx.Export("usedBandwidth", data.Equinix_fabric_port.Ports_data_name.Data[0].Used_bandwidth)
//			ctx.Export("encapsulationType", data.Equinix_fabric_port.Ports_data_name.Data[0].Encapsulation[0].Type)
//			ctx.Export("ibx", data.Equinix_fabric_port.Ports_data_name.Data[0].Location[0].Ibx)
//			ctx.Export("metroCode", data.Equinix_fabric_port.Ports_data_name.Data[0].Location[0].Metro_code)
//			ctx.Export("metroName", data.Equinix_fabric_port.Ports_data_name.Data[0].Location[0].Metro_name)
//			ctx.Export("region", data.Equinix_fabric_port.Ports_data_name.Data[0].Location[0].Region)
//			ctx.Export("deviceRedundancyEnabled", data.Equinix_fabric_port.Ports_data_name.Data[0].Device[0].Redundancy[0].Enabled)
//			ctx.Export("deviceRedundancyPriority", data.Equinix_fabric_port.Ports_data_name.Data[0].Device[0].Redundancy[0].Priority)
//			return nil
//		})
//	}
//
// ```
func GetPorts(ctx *pulumi.Context, args *GetPortsArgs, opts ...pulumi.InvokeOption) (*GetPortsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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
	Filter GetPortsFilter `pulumi:"filter"`
}

// A collection of values returned by getPorts.
type GetPortsResult struct {
	// List of Ports
	Data []GetPortsDatum `pulumi:"data"`
	// name
	Filter GetPortsFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetPortsOutput(ctx *pulumi.Context, args GetPortsOutputArgs, opts ...pulumi.InvokeOption) GetPortsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPortsResultOutput, error) {
			args := v.(GetPortsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getPorts:getPorts", args, GetPortsResultOutput{}, options).(GetPortsResultOutput), nil
		}).(GetPortsResultOutput)
}

// A collection of arguments for invoking getPorts.
type GetPortsOutputArgs struct {
	// name
	Filter GetPortsFilterInput `pulumi:"filter"`
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

// List of Ports
func (o GetPortsResultOutput) Data() GetPortsDatumArrayOutput {
	return o.ApplyT(func(v GetPortsResult) []GetPortsDatum { return v.Data }).(GetPortsDatumArrayOutput)
}

// name
func (o GetPortsResultOutput) Filter() GetPortsFilterOutput {
	return o.ApplyT(func(v GetPortsResult) GetPortsFilter { return v.Filter }).(GetPortsFilterOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPortsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPortsResultOutput{})
}
