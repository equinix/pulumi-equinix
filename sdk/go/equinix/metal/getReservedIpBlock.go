// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to find IP address blocks in Equinix Metal. You can use IP address or a block ID for lookup.
//
// > For backward compatibility, this data source can be also used for precreated (management) IP blocks.
//
// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
func LookupReservedIpBlock(ctx *pulumi.Context, args *LookupReservedIpBlockArgs, opts ...pulumi.InvokeOption) (*LookupReservedIpBlockResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupReservedIpBlockResult
	err := ctx.Invoke("equinix:metal/getReservedIpBlock:getReservedIpBlock", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReservedIpBlock.
type LookupReservedIpBlockArgs struct {
	// UUID of the IP address block to look up.
	Id *string `pulumi:"id"`
	// Block containing this IP address will be returned.
	//
	// > **NOTE:** You should pass either `id`, or both `projectId` and `ipAddress`.
	IpAddress *string `pulumi:"ipAddress"`
	// UUID of the project where the searched block should be.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getReservedIpBlock.
type LookupReservedIpBlockResult struct {
	Address       string `pulumi:"address"`
	AddressFamily int    `pulumi:"addressFamily"`
	Cidr          int    `pulumi:"cidr"`
	CidrNotation  string `pulumi:"cidrNotation"`
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility   string  `pulumi:"facility"`
	Gateway    string  `pulumi:"gateway"`
	Global     bool    `pulumi:"global"`
	Id         string  `pulumi:"id"`
	IpAddress  *string `pulumi:"ipAddress"`
	Manageable bool    `pulumi:"manageable"`
	Management bool    `pulumi:"management"`
	Metro      string  `pulumi:"metro"`
	Netmask    string  `pulumi:"netmask"`
	Network    string  `pulumi:"network"`
	ProjectId  string  `pulumi:"projectId"`
	Public     bool    `pulumi:"public"`
	Quantity   int     `pulumi:"quantity"`
	// One of `globalIpv4`, `publicIpv4`, `privateIpv4`, `publicIpv6`,or `vrf`
	Type  string `pulumi:"type"`
	VrfId int    `pulumi:"vrfId"`
}

func LookupReservedIpBlockOutput(ctx *pulumi.Context, args LookupReservedIpBlockOutputArgs, opts ...pulumi.InvokeOption) LookupReservedIpBlockResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupReservedIpBlockResultOutput, error) {
			args := v.(LookupReservedIpBlockArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:metal/getReservedIpBlock:getReservedIpBlock", args, LookupReservedIpBlockResultOutput{}, options).(LookupReservedIpBlockResultOutput), nil
		}).(LookupReservedIpBlockResultOutput)
}

// A collection of arguments for invoking getReservedIpBlock.
type LookupReservedIpBlockOutputArgs struct {
	// UUID of the IP address block to look up.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Block containing this IP address will be returned.
	//
	// > **NOTE:** You should pass either `id`, or both `projectId` and `ipAddress`.
	IpAddress pulumi.StringPtrInput `pulumi:"ipAddress"`
	// UUID of the project where the searched block should be.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupReservedIpBlockOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReservedIpBlockArgs)(nil)).Elem()
}

// A collection of values returned by getReservedIpBlock.
type LookupReservedIpBlockResultOutput struct{ *pulumi.OutputState }

func (LookupReservedIpBlockResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReservedIpBlockResult)(nil)).Elem()
}

func (o LookupReservedIpBlockResultOutput) ToLookupReservedIpBlockResultOutput() LookupReservedIpBlockResultOutput {
	return o
}

func (o LookupReservedIpBlockResultOutput) ToLookupReservedIpBlockResultOutputWithContext(ctx context.Context) LookupReservedIpBlockResultOutput {
	return o
}

func (o LookupReservedIpBlockResultOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Address }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) AddressFamily() pulumi.IntOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) int { return v.AddressFamily }).(pulumi.IntOutput)
}

func (o LookupReservedIpBlockResultOutput) Cidr() pulumi.IntOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) int { return v.Cidr }).(pulumi.IntOutput)
}

func (o LookupReservedIpBlockResultOutput) CidrNotation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.CidrNotation }).(pulumi.StringOutput)
}

// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
func (o LookupReservedIpBlockResultOutput) Facility() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Facility }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) Gateway() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Gateway }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) Global() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) bool { return v.Global }).(pulumi.BoolOutput)
}

func (o LookupReservedIpBlockResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) IpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) *string { return v.IpAddress }).(pulumi.StringPtrOutput)
}

func (o LookupReservedIpBlockResultOutput) Manageable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) bool { return v.Manageable }).(pulumi.BoolOutput)
}

func (o LookupReservedIpBlockResultOutput) Management() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) bool { return v.Management }).(pulumi.BoolOutput)
}

func (o LookupReservedIpBlockResultOutput) Metro() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Metro }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) Netmask() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Netmask }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Network }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) Public() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) bool { return v.Public }).(pulumi.BoolOutput)
}

func (o LookupReservedIpBlockResultOutput) Quantity() pulumi.IntOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) int { return v.Quantity }).(pulumi.IntOutput)
}

// One of `globalIpv4`, `publicIpv4`, `privateIpv4`, `publicIpv6`,or `vrf`
func (o LookupReservedIpBlockResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupReservedIpBlockResultOutput) VrfId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupReservedIpBlockResult) int { return v.VrfId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupReservedIpBlockResultOutput{})
}
