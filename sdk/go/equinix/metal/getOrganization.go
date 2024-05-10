// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Equinix Metal organization datasource.
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
//			test, err := metal.LookupOrganization(ctx, &metal.LookupOrganizationArgs{
//				OrganizationId: pulumi.StringRef(local.Org_id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("projectsInTheOrg", test.ProjectIds)
//			return nil
//		})
//	}
//
// ```
func LookupOrganization(ctx *pulumi.Context, args *LookupOrganizationArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOrganizationResult
	err := ctx.Invoke("equinix:metal/getOrganization:getOrganization", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationArgs struct {
	// Description string.
	Description *string `pulumi:"description"`
	// The organization name.
	Name *string `pulumi:"name"`
	// The UUID of the organization resource.
	//
	// Exactly one of `name` or `organizationId` must be given.
	OrganizationId *string `pulumi:"organizationId"`
}

// A collection of values returned by getOrganization.
type LookupOrganizationResult struct {
	// Postal address.
	Address GetOrganizationAddress `pulumi:"address"`
	// Description string.
	Description *string `pulumi:"description"`
	Id          string  `pulumi:"id"`
	// Logo URL.
	Logo           string `pulumi:"logo"`
	Name           string `pulumi:"name"`
	OrganizationId string `pulumi:"organizationId"`
	// UUIDs of project resources which belong to this organization.
	ProjectIds []string `pulumi:"projectIds"`
	// Twitter handle.
	Twitter string `pulumi:"twitter"`
	// Website link.
	Website string `pulumi:"website"`
}

func LookupOrganizationOutput(ctx *pulumi.Context, args LookupOrganizationOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationResult, error) {
			args := v.(LookupOrganizationArgs)
			r, err := LookupOrganization(ctx, &args, opts...)
			var s LookupOrganizationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationResultOutput)
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationOutputArgs struct {
	// Description string.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The organization name.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The UUID of the organization resource.
	//
	// Exactly one of `name` or `organizationId` must be given.
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
}

func (LookupOrganizationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationArgs)(nil)).Elem()
}

// A collection of values returned by getOrganization.
type LookupOrganizationResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationResult)(nil)).Elem()
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutput() LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutputWithContext(ctx context.Context) LookupOrganizationResultOutput {
	return o
}

// Postal address.
func (o LookupOrganizationResultOutput) Address() GetOrganizationAddressOutput {
	return o.ApplyT(func(v LookupOrganizationResult) GetOrganizationAddress { return v.Address }).(GetOrganizationAddressOutput)
}

// Description string.
func (o LookupOrganizationResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOrganizationResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o LookupOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Logo URL.
func (o LookupOrganizationResultOutput) Logo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Logo }).(pulumi.StringOutput)
}

func (o LookupOrganizationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupOrganizationResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// UUIDs of project resources which belong to this organization.
func (o LookupOrganizationResultOutput) ProjectIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []string { return v.ProjectIds }).(pulumi.StringArrayOutput)
}

// Twitter handle.
func (o LookupOrganizationResultOutput) Twitter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Twitter }).(pulumi.StringOutput)
}

// Website link.
func (o LookupOrganizationResultOutput) Website() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Website }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationResultOutput{})
}
