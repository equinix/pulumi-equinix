// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The datasource can be used to find a list of devices which meet filter criteria.
//
// If you need to fetch a single device by ID or by project ID and hostname, use the metal.Device datasource.
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
//			example, err := metal.GetDevices(ctx, &metal.GetDevicesArgs{
//				ProjectId: pulumi.StringRef(local.Project_id),
//				Filters: []metal.GetDevicesFilter{
//					{
//						Attribute: "plan",
//						Values: []string{
//							"c3.small.x86",
//						},
//					},
//					{
//						Attribute: "metro",
//						Values: []string{
//							"da",
//							"sv",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("devices", example.Devices)
//			return nil
//		})
//	}
//
// ```
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
//			example, err := metal.GetDevices(ctx, &metal.GetDevicesArgs{
//				Search: pulumi.StringRef("database"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("devices", example.Devices)
//			return nil
//		})
//	}
//
// ```
//
// ## search vs filter
//
// The difference between `search` and `filter` is that `search` is an API parameter, interpreted by the Equinix Metal service. The "filter" arguments will reduce the API list (or search) results by applying client-side filtering, within this provider.
func GetDevices(ctx *pulumi.Context, args *GetDevicesArgs, opts ...pulumi.InvokeOption) (*GetDevicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDevicesResult
	err := ctx.Invoke("equinix:metal/getDevices:getDevices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevices.
type GetDevicesArgs struct {
	// One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `metal.Device` datasource.
	Filters []GetDevicesFilter `pulumi:"filters"`
	// ID of organization containing the devices.
	OrganizationId *string `pulumi:"organizationId"`
	// ID of project containing the devices. Exactly one of `projectId` and `organizationId` must be set.
	ProjectId *string `pulumi:"projectId"`
	// Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
	Search *string          `pulumi:"search"`
	Sorts  []GetDevicesSort `pulumi:"sorts"`
}

// A collection of values returned by getDevices.
type GetDevicesResult struct {
	// list of resources with attributes like in the equninixMetalDevice datasources.
	Devices []GetDevicesDevice `pulumi:"devices"`
	Filters []GetDevicesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id             string           `pulumi:"id"`
	OrganizationId *string          `pulumi:"organizationId"`
	ProjectId      *string          `pulumi:"projectId"`
	Search         *string          `pulumi:"search"`
	Sorts          []GetDevicesSort `pulumi:"sorts"`
}

func GetDevicesOutput(ctx *pulumi.Context, args GetDevicesOutputArgs, opts ...pulumi.InvokeOption) GetDevicesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDevicesResultOutput, error) {
			args := v.(GetDevicesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetDevicesResult
			secret, err := ctx.InvokePackageRaw("equinix:metal/getDevices:getDevices", args, &rv, "", opts...)
			if err != nil {
				return GetDevicesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetDevicesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetDevicesResultOutput), nil
			}
			return output, nil
		}).(GetDevicesResultOutput)
}

// A collection of arguments for invoking getDevices.
type GetDevicesOutputArgs struct {
	// One or more attribute/values pairs to filter. List of atributes to filter can be found in the attribute reference of the `metal.Device` datasource.
	Filters GetDevicesFilterArrayInput `pulumi:"filters"`
	// ID of organization containing the devices.
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
	// ID of project containing the devices. Exactly one of `projectId` and `organizationId` must be set.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Search string to filter devices by hostname, description, short_id, reservation short_id, tags, plan name, plan slug, facility code, facility name, operating system name, operating system slug, IP addresses.
	Search pulumi.StringPtrInput    `pulumi:"search"`
	Sorts  GetDevicesSortArrayInput `pulumi:"sorts"`
}

func (GetDevicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesArgs)(nil)).Elem()
}

// A collection of values returned by getDevices.
type GetDevicesResultOutput struct{ *pulumi.OutputState }

func (GetDevicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesResult)(nil)).Elem()
}

func (o GetDevicesResultOutput) ToGetDevicesResultOutput() GetDevicesResultOutput {
	return o
}

func (o GetDevicesResultOutput) ToGetDevicesResultOutputWithContext(ctx context.Context) GetDevicesResultOutput {
	return o
}

// list of resources with attributes like in the equninixMetalDevice datasources.
func (o GetDevicesResultOutput) Devices() GetDevicesDeviceArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []GetDevicesDevice { return v.Devices }).(GetDevicesDeviceArrayOutput)
}

func (o GetDevicesResultOutput) Filters() GetDevicesFilterArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []GetDevicesFilter { return v.Filters }).(GetDevicesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDevicesResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func (o GetDevicesResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func (o GetDevicesResultOutput) Search() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.Search }).(pulumi.StringPtrOutput)
}

func (o GetDevicesResultOutput) Sorts() GetDevicesSortArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []GetDevicesSort { return v.Sorts }).(GetDevicesSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicesResultOutput{})
}
