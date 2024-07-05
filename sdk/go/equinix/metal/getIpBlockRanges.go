// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this datasource to get CIDR expressions for allocated IP blocks of all the types in a project, optionally filtered by facility or metro.
//
// There are four types of IP blocks in Equinix: equinixMetalGlobal IPv4, public IPv4, private IPv4 and IPv6. Both global and public IPv4 are routable from the Internet. Public IPv4 blocks are allocated in a facility or metro, and addresses from it can only be assigned to devices in that location. Addresses from Global IPv4 block can be assigned to a device in any metro.
//
// The datasource has 4 list attributes: `globalIpv4`, `publicIpv4`, `privateIpv4` and `ipv6`, each listing CIDR notation (`<network>/<mask>`) of respective blocks from the project.
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
//			projectId := "<UUID_of_your_project>"
//			test, err := metal.GetIpBlockRanges(ctx, &metal.GetIpBlockRangesArgs{
//				ProjectId: projectId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("out", test)
//			return nil
//		})
//	}
//
// ```
func GetIpBlockRanges(ctx *pulumi.Context, args *GetIpBlockRangesArgs, opts ...pulumi.InvokeOption) (*GetIpBlockRangesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpBlockRangesResult
	err := ctx.Invoke("equinix:metal/getIpBlockRanges:getIpBlockRanges", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpBlockRanges.
type GetIpBlockRangesArgs struct {
	// Facility code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and metro, all the block from the project will be listed. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility *string `pulumi:"facility"`
	// Metro code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and facility, all the block from the project will be listed.
	Metro *string `pulumi:"metro"`
	// ID of the project from which to list the blocks.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getIpBlockRanges.
type GetIpBlockRangesResult struct {
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility *string `pulumi:"facility"`
	// list of CIDR expressions for Global IPv4 blocks in the project.
	GlobalIpv4s []string `pulumi:"globalIpv4s"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// list of CIDR expressions for IPv6 blocks in the project.
	Ipv6s []string `pulumi:"ipv6s"`
	Metro *string  `pulumi:"metro"`
	// list of CIDR expressions for Private IPv4 blocks in the project.
	PrivateIpv4s []string `pulumi:"privateIpv4s"`
	ProjectId    string   `pulumi:"projectId"`
	// list of CIDR expressions for Public IPv4 blocks in the project.
	PublicIpv4s []string `pulumi:"publicIpv4s"`
}

func GetIpBlockRangesOutput(ctx *pulumi.Context, args GetIpBlockRangesOutputArgs, opts ...pulumi.InvokeOption) GetIpBlockRangesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetIpBlockRangesResult, error) {
			args := v.(GetIpBlockRangesArgs)
			r, err := GetIpBlockRanges(ctx, &args, opts...)
			var s GetIpBlockRangesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetIpBlockRangesResultOutput)
}

// A collection of arguments for invoking getIpBlockRanges.
type GetIpBlockRangesOutputArgs struct {
	// Facility code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and metro, all the block from the project will be listed. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility pulumi.StringPtrInput `pulumi:"facility"`
	// Metro code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and facility, all the block from the project will be listed.
	Metro pulumi.StringPtrInput `pulumi:"metro"`
	// ID of the project from which to list the blocks.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetIpBlockRangesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpBlockRangesArgs)(nil)).Elem()
}

// A collection of values returned by getIpBlockRanges.
type GetIpBlockRangesResultOutput struct{ *pulumi.OutputState }

func (GetIpBlockRangesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpBlockRangesResult)(nil)).Elem()
}

func (o GetIpBlockRangesResultOutput) ToGetIpBlockRangesResultOutput() GetIpBlockRangesResultOutput {
	return o
}

func (o GetIpBlockRangesResultOutput) ToGetIpBlockRangesResultOutputWithContext(ctx context.Context) GetIpBlockRangesResultOutput {
	return o
}

// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
func (o GetIpBlockRangesResultOutput) Facility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) *string { return v.Facility }).(pulumi.StringPtrOutput)
}

// list of CIDR expressions for Global IPv4 blocks in the project.
func (o GetIpBlockRangesResultOutput) GlobalIpv4s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) []string { return v.GlobalIpv4s }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpBlockRangesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) string { return v.Id }).(pulumi.StringOutput)
}

// list of CIDR expressions for IPv6 blocks in the project.
func (o GetIpBlockRangesResultOutput) Ipv6s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) []string { return v.Ipv6s }).(pulumi.StringArrayOutput)
}

func (o GetIpBlockRangesResultOutput) Metro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) *string { return v.Metro }).(pulumi.StringPtrOutput)
}

// list of CIDR expressions for Private IPv4 blocks in the project.
func (o GetIpBlockRangesResultOutput) PrivateIpv4s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) []string { return v.PrivateIpv4s }).(pulumi.StringArrayOutput)
}

func (o GetIpBlockRangesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// list of CIDR expressions for Public IPv4 blocks in the project.
func (o GetIpBlockRangesResultOutput) PublicIpv4s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpBlockRangesResult) []string { return v.PublicIpv4s }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpBlockRangesResultOutput{})
}
