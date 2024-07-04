// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create and manage blocks of reserved IP addresses in a project.
//
// When a user provisions first device in a metro, Equinix Metal API automatically allocates IPv6/56 and private IPv4/25 blocks. The new device then gets IPv6 and private IPv4 addresses from those block. It also gets a public IPv4/31 address. Every new device in the project and metro will automatically get IPv6 and private IPv4 addresses from these pre-allocated blocks. The IPv6 and private IPv4 blocks can't be created, only imported. With this resource, it's possible to create either public IPv4 blocks or global IPv4 blocks.
//
// Public blocks are allocated in a metro. Addresses from public blocks can only be assigned to devices in the metro. Public blocks can have mask from /24 (256 addresses) to /32 (1 address). If you create public block with this resource, you must fill the metro argument.
//
// Addresses from global blocks can be assigned in any metro. Global blocks can have mask from /30 (4 addresses), to /32 (1 address). If you create global block with this resource, you must specify type = "globalIpv4" and you must omit the metro argument.
//
// Once IP block is allocated or imported, an address from it can be assigned to device with the `metal.IpAttachment` resource.
//
// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
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
//			_type := "public_ipv4"
//			if param := cfg.Get("type"); param != "" {
//				_type = param
//			}
//			quantity := 1
//			if param := cfg.GetInt("quantity"); param != 0 {
//				quantity = param
//			}
//			ipBlock, err := metal.NewReservedIpBlock(ctx, "ipBlock", &metal.ReservedIpBlockArgs{
//				ProjectId: pulumi.String(projectId),
//				Type:      pulumi.String("public_ipv4"),
//				Quantity:  pulumi.Int(quantity),
//				Metro:     pulumi.String(metro),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("ipBlockId", ipBlock.ID())
//			ctx.Export("ipBlockSubent", ipBlock.CidrNotation)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing IP reservation ID:
//
// ```sh
// $ pulumi import equinix:metal/reservedIpBlock:ReservedIpBlock equinix_metal_reserved_ip_block {existing_ip_reservation_id}
// ```
type ReservedIpBlock struct {
	pulumi.CustomResourceState

	Address pulumi.StringOutput `pulumi:"address"`
	// Address family as integer. One of `4` or `6`.
	AddressFamily pulumi.IntOutput `pulumi:"addressFamily"`
	// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
	Cidr pulumi.IntOutput `pulumi:"cidr"`
	// Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
	CidrNotation pulumi.StringOutput    `pulumi:"cidrNotation"`
	CustomData   pulumi.StringPtrOutput `pulumi:"customData"`
	// Arbitrary description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
	Facility pulumi.StringPtrOutput `pulumi:"facility"`
	Gateway  pulumi.StringOutput    `pulumi:"gateway"`
	// Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
	Global     pulumi.BoolOutput `pulumi:"global"`
	Manageable pulumi.BoolOutput `pulumi:"manageable"`
	Management pulumi.BoolOutput `pulumi:"management"`
	// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
	Metro pulumi.StringPtrOutput `pulumi:"metro"`
	// Mask in decimal notation, e.g. `255.255.255.0`.
	Netmask pulumi.StringOutput `pulumi:"netmask"`
	// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
	Network pulumi.StringOutput `pulumi:"network"`
	// The metal project ID where to allocate the address block.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Boolean flag whether addresses from a block are public.
	Public pulumi.BoolOutput `pulumi:"public"`
	// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
	Quantity pulumi.IntOutput `pulumi:"quantity"`
	// String list of tags.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
	VrfId pulumi.StringPtrOutput `pulumi:"vrfId"`
	// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
	WaitForState pulumi.StringPtrOutput `pulumi:"waitForState"`
}

// NewReservedIpBlock registers a new resource with the given unique name, arguments, and options.
func NewReservedIpBlock(ctx *pulumi.Context,
	name string, args *ReservedIpBlockArgs, opts ...pulumi.ResourceOption) (*ReservedIpBlock, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReservedIpBlock
	err := ctx.RegisterResource("equinix:metal/reservedIpBlock:ReservedIpBlock", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservedIpBlock gets an existing ReservedIpBlock resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservedIpBlock(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservedIpBlockState, opts ...pulumi.ResourceOption) (*ReservedIpBlock, error) {
	var resource ReservedIpBlock
	err := ctx.ReadResource("equinix:metal/reservedIpBlock:ReservedIpBlock", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReservedIpBlock resources.
type reservedIpBlockState struct {
	Address *string `pulumi:"address"`
	// Address family as integer. One of `4` or `6`.
	AddressFamily *int `pulumi:"addressFamily"`
	// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
	Cidr *int `pulumi:"cidr"`
	// Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
	CidrNotation *string `pulumi:"cidrNotation"`
	CustomData   *string `pulumi:"customData"`
	// Arbitrary description.
	Description *string `pulumi:"description"`
	// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
	Facility *string `pulumi:"facility"`
	Gateway  *string `pulumi:"gateway"`
	// Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
	Global     *bool `pulumi:"global"`
	Manageable *bool `pulumi:"manageable"`
	Management *bool `pulumi:"management"`
	// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
	Metro *string `pulumi:"metro"`
	// Mask in decimal notation, e.g. `255.255.255.0`.
	Netmask *string `pulumi:"netmask"`
	// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
	Network *string `pulumi:"network"`
	// The metal project ID where to allocate the address block.
	ProjectId *string `pulumi:"projectId"`
	// Boolean flag whether addresses from a block are public.
	Public *bool `pulumi:"public"`
	// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
	Quantity *int `pulumi:"quantity"`
	// String list of tags.
	Tags []string `pulumi:"tags"`
	// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
	Type *string `pulumi:"type"`
	// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
	VrfId *string `pulumi:"vrfId"`
	// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
	WaitForState *string `pulumi:"waitForState"`
}

type ReservedIpBlockState struct {
	Address pulumi.StringPtrInput
	// Address family as integer. One of `4` or `6`.
	AddressFamily pulumi.IntPtrInput
	// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
	Cidr pulumi.IntPtrInput
	// Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
	CidrNotation pulumi.StringPtrInput
	CustomData   pulumi.StringPtrInput
	// Arbitrary description.
	Description pulumi.StringPtrInput
	// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
	Facility pulumi.StringPtrInput
	Gateway  pulumi.StringPtrInput
	// Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
	Global     pulumi.BoolPtrInput
	Manageable pulumi.BoolPtrInput
	Management pulumi.BoolPtrInput
	// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
	Metro pulumi.StringPtrInput
	// Mask in decimal notation, e.g. `255.255.255.0`.
	Netmask pulumi.StringPtrInput
	// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
	Network pulumi.StringPtrInput
	// The metal project ID where to allocate the address block.
	ProjectId pulumi.StringPtrInput
	// Boolean flag whether addresses from a block are public.
	Public pulumi.BoolPtrInput
	// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
	Quantity pulumi.IntPtrInput
	// String list of tags.
	Tags pulumi.StringArrayInput
	// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
	Type pulumi.StringPtrInput
	// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
	VrfId pulumi.StringPtrInput
	// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
	WaitForState pulumi.StringPtrInput
}

func (ReservedIpBlockState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpBlockState)(nil)).Elem()
}

type reservedIpBlockArgs struct {
	// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
	Cidr       *int    `pulumi:"cidr"`
	CustomData *string `pulumi:"customData"`
	// Arbitrary description.
	Description *string `pulumi:"description"`
	// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
	Facility *string `pulumi:"facility"`
	// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
	Metro *string `pulumi:"metro"`
	// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
	Network *string `pulumi:"network"`
	// The metal project ID where to allocate the address block.
	ProjectId string `pulumi:"projectId"`
	// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
	Quantity *int `pulumi:"quantity"`
	// String list of tags.
	Tags []string `pulumi:"tags"`
	// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
	Type *string `pulumi:"type"`
	// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
	VrfId *string `pulumi:"vrfId"`
	// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
	WaitForState *string `pulumi:"waitForState"`
}

// The set of arguments for constructing a ReservedIpBlock resource.
type ReservedIpBlockArgs struct {
	// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
	Cidr       pulumi.IntPtrInput
	CustomData pulumi.StringPtrInput
	// Arbitrary description.
	Description pulumi.StringPtrInput
	// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
	Facility pulumi.StringPtrInput
	// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
	Metro pulumi.StringPtrInput
	// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
	Network pulumi.StringPtrInput
	// The metal project ID where to allocate the address block.
	ProjectId pulumi.StringInput
	// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
	Quantity pulumi.IntPtrInput
	// String list of tags.
	Tags pulumi.StringArrayInput
	// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
	Type pulumi.StringPtrInput
	// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
	VrfId pulumi.StringPtrInput
	// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
	WaitForState pulumi.StringPtrInput
}

func (ReservedIpBlockArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpBlockArgs)(nil)).Elem()
}

type ReservedIpBlockInput interface {
	pulumi.Input

	ToReservedIpBlockOutput() ReservedIpBlockOutput
	ToReservedIpBlockOutputWithContext(ctx context.Context) ReservedIpBlockOutput
}

func (*ReservedIpBlock) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIpBlock)(nil)).Elem()
}

func (i *ReservedIpBlock) ToReservedIpBlockOutput() ReservedIpBlockOutput {
	return i.ToReservedIpBlockOutputWithContext(context.Background())
}

func (i *ReservedIpBlock) ToReservedIpBlockOutputWithContext(ctx context.Context) ReservedIpBlockOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpBlockOutput)
}

// ReservedIpBlockArrayInput is an input type that accepts ReservedIpBlockArray and ReservedIpBlockArrayOutput values.
// You can construct a concrete instance of `ReservedIpBlockArrayInput` via:
//
//	ReservedIpBlockArray{ ReservedIpBlockArgs{...} }
type ReservedIpBlockArrayInput interface {
	pulumi.Input

	ToReservedIpBlockArrayOutput() ReservedIpBlockArrayOutput
	ToReservedIpBlockArrayOutputWithContext(context.Context) ReservedIpBlockArrayOutput
}

type ReservedIpBlockArray []ReservedIpBlockInput

func (ReservedIpBlockArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIpBlock)(nil)).Elem()
}

func (i ReservedIpBlockArray) ToReservedIpBlockArrayOutput() ReservedIpBlockArrayOutput {
	return i.ToReservedIpBlockArrayOutputWithContext(context.Background())
}

func (i ReservedIpBlockArray) ToReservedIpBlockArrayOutputWithContext(ctx context.Context) ReservedIpBlockArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpBlockArrayOutput)
}

// ReservedIpBlockMapInput is an input type that accepts ReservedIpBlockMap and ReservedIpBlockMapOutput values.
// You can construct a concrete instance of `ReservedIpBlockMapInput` via:
//
//	ReservedIpBlockMap{ "key": ReservedIpBlockArgs{...} }
type ReservedIpBlockMapInput interface {
	pulumi.Input

	ToReservedIpBlockMapOutput() ReservedIpBlockMapOutput
	ToReservedIpBlockMapOutputWithContext(context.Context) ReservedIpBlockMapOutput
}

type ReservedIpBlockMap map[string]ReservedIpBlockInput

func (ReservedIpBlockMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIpBlock)(nil)).Elem()
}

func (i ReservedIpBlockMap) ToReservedIpBlockMapOutput() ReservedIpBlockMapOutput {
	return i.ToReservedIpBlockMapOutputWithContext(context.Background())
}

func (i ReservedIpBlockMap) ToReservedIpBlockMapOutputWithContext(ctx context.Context) ReservedIpBlockMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpBlockMapOutput)
}

type ReservedIpBlockOutput struct{ *pulumi.OutputState }

func (ReservedIpBlockOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIpBlock)(nil)).Elem()
}

func (o ReservedIpBlockOutput) ToReservedIpBlockOutput() ReservedIpBlockOutput {
	return o
}

func (o ReservedIpBlockOutput) ToReservedIpBlockOutputWithContext(ctx context.Context) ReservedIpBlockOutput {
	return o
}

func (o ReservedIpBlockOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Address family as integer. One of `4` or `6`.
func (o ReservedIpBlockOutput) AddressFamily() pulumi.IntOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.IntOutput { return v.AddressFamily }).(pulumi.IntOutput)
}

// Only valid as an argument and required when `type` is `vrf`. The size of the network to reserve from an existing VRF ip_range. `cidr` can only be specified with `vrfId`. Range is 22-31. Virtual Circuits require 30-31. Other VRF resources must use a CIDR in the 22-29 range.
func (o ReservedIpBlockOutput) Cidr() pulumi.IntOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.IntOutput { return v.Cidr }).(pulumi.IntOutput)
}

// Address and mask in CIDR notation, e.g. `147.229.15.30/31`.
func (o ReservedIpBlockOutput) CidrNotation() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.CidrNotation }).(pulumi.StringOutput)
}

func (o ReservedIpBlockOutput) CustomData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.CustomData }).(pulumi.StringPtrOutput)
}

// Arbitrary description.
func (o ReservedIpBlockOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Facility where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `metro`. Use metro instead; read the facility to metro migration guide
func (o ReservedIpBlockOutput) Facility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.Facility }).(pulumi.StringPtrOutput)
}

func (o ReservedIpBlockOutput) Gateway() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.Gateway }).(pulumi.StringOutput)
}

// Boolean flag whether addresses from a block are global (i.e. can be assigned in any metro).
func (o ReservedIpBlockOutput) Global() pulumi.BoolOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.BoolOutput { return v.Global }).(pulumi.BoolOutput)
}

func (o ReservedIpBlockOutput) Manageable() pulumi.BoolOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.BoolOutput { return v.Manageable }).(pulumi.BoolOutput)
}

func (o ReservedIpBlockOutput) Management() pulumi.BoolOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.BoolOutput { return v.Management }).(pulumi.BoolOutput)
}

// Metro where to allocate the public IP address block, makes sense only if type is `publicIpv4` and must be empty if type is `globalIpv4`. Conflicts with `facility`.
func (o ReservedIpBlockOutput) Metro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.Metro }).(pulumi.StringPtrOutput)
}

// Mask in decimal notation, e.g. `255.255.255.0`.
func (o ReservedIpBlockOutput) Netmask() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.Netmask }).(pulumi.StringOutput)
}

// Only valid as an argument and required when `type` is `vrf`. An unreserved network address from an existing `ipRange` in the specified VRF.
func (o ReservedIpBlockOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

// The metal project ID where to allocate the address block.
func (o ReservedIpBlockOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Boolean flag whether addresses from a block are public.
func (o ReservedIpBlockOutput) Public() pulumi.BoolOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.BoolOutput { return v.Public }).(pulumi.BoolOutput)
}

// The number of allocated `/32` addresses, a power of 2. Required when `type` is not `vrf`.
func (o ReservedIpBlockOutput) Quantity() pulumi.IntOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.IntOutput { return v.Quantity }).(pulumi.IntOutput)
}

// String list of tags.
func (o ReservedIpBlockOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// One of `globalIpv4`, `publicIpv4`, or `vrf`. Defaults to `publicIpv4` for backward compatibility.
func (o ReservedIpBlockOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// Only valid and required when `type` is `vrf`. VRF ID for type=vrf reservations.
func (o ReservedIpBlockOutput) VrfId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.VrfId }).(pulumi.StringPtrOutput)
}

// Wait for the IP reservation block to reach a desired state on resource creation. One of: `pending`, `created`. The `created` state is default and recommended if the addresses are needed within the configuration. An error will be returned if a timeout or the `denied` state is encountered.
func (o ReservedIpBlockOutput) WaitForState() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReservedIpBlock) pulumi.StringPtrOutput { return v.WaitForState }).(pulumi.StringPtrOutput)
}

type ReservedIpBlockArrayOutput struct{ *pulumi.OutputState }

func (ReservedIpBlockArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIpBlock)(nil)).Elem()
}

func (o ReservedIpBlockArrayOutput) ToReservedIpBlockArrayOutput() ReservedIpBlockArrayOutput {
	return o
}

func (o ReservedIpBlockArrayOutput) ToReservedIpBlockArrayOutputWithContext(ctx context.Context) ReservedIpBlockArrayOutput {
	return o
}

func (o ReservedIpBlockArrayOutput) Index(i pulumi.IntInput) ReservedIpBlockOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReservedIpBlock {
		return vs[0].([]*ReservedIpBlock)[vs[1].(int)]
	}).(ReservedIpBlockOutput)
}

type ReservedIpBlockMapOutput struct{ *pulumi.OutputState }

func (ReservedIpBlockMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIpBlock)(nil)).Elem()
}

func (o ReservedIpBlockMapOutput) ToReservedIpBlockMapOutput() ReservedIpBlockMapOutput {
	return o
}

func (o ReservedIpBlockMapOutput) ToReservedIpBlockMapOutputWithContext(ctx context.Context) ReservedIpBlockMapOutput {
	return o
}

func (o ReservedIpBlockMapOutput) MapIndex(k pulumi.StringInput) ReservedIpBlockOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReservedIpBlock {
		return vs[0].(map[string]*ReservedIpBlock)[vs[1].(string)]
	}).(ReservedIpBlockOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpBlockInput)(nil)).Elem(), &ReservedIpBlock{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpBlockArrayInput)(nil)).Elem(), ReservedIpBlockArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpBlockMapInput)(nil)).Elem(), ReservedIpBlockMap{})
	pulumi.RegisterOutputType(ReservedIpBlockOutput{})
	pulumi.RegisterOutputType(ReservedIpBlockArrayOutput{})
	pulumi.RegisterOutputType(ReservedIpBlockMapOutput{})
}
