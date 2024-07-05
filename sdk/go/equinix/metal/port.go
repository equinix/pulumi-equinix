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
//			portId := cfg.Require("portId")
//			_, err := metal.NewPort(ctx, "org", &metal.PortArgs{
//				PortId: pulumi.String(portId),
//				Bonded: pulumi.Bool(true),
//				Layer2: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("portType", port.Type)
//			ctx.Export("portBondedNetworkType", port.NetworkType)
//			return nil
//		})
//	}
//
// ```
type Port struct {
	pulumi.CustomResourceState

	// UUID of the bond port.
	BondId pulumi.StringOutput `pulumi:"bondId"`
	// Name of the bond port.
	BondName pulumi.StringOutput `pulumi:"bondName"`
	// Whether the port should be bonded.
	Bonded pulumi.BoolOutput `pulumi:"bonded"`
	// Flag indicating whether the port can be removed from a bond.
	DisbondSupported pulumi.BoolOutput `pulumi:"disbondSupported"`
	// Whether to put the port to Layer 2 mode, valid only for bond ports.
	Layer2 pulumi.BoolPtrOutput `pulumi:"layer2"`
	// MAC address of the port.
	Mac pulumi.StringOutput `pulumi:"mac"`
	// Name of the port, e.g. `bond0` or `eth0`.
	Name pulumi.StringOutput `pulumi:"name"`
	// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
	NativeVlanId pulumi.StringPtrOutput `pulumi:"nativeVlanId"`
	// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
	NetworkType pulumi.StringOutput `pulumi:"networkType"`
	// ID of the port to read.
	PortId pulumi.StringOutput `pulumi:"portId"`
	// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
	ResetOnDelete pulumi.BoolPtrOutput `pulumi:"resetOnDelete"`
	// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
	Type pulumi.StringOutput `pulumi:"type"`
	// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
	VlanIds pulumi.StringArrayOutput `pulumi:"vlanIds"`
	// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
	VxlanIds pulumi.IntArrayOutput `pulumi:"vxlanIds"`
}

// NewPort registers a new resource with the given unique name, arguments, and options.
func NewPort(ctx *pulumi.Context,
	name string, args *PortArgs, opts ...pulumi.ResourceOption) (*Port, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bonded == nil {
		return nil, errors.New("invalid value for required argument 'Bonded'")
	}
	if args.PortId == nil {
		return nil, errors.New("invalid value for required argument 'PortId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Port
	err := ctx.RegisterResource("equinix:metal/port:Port", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPort gets an existing Port resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPort(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PortState, opts ...pulumi.ResourceOption) (*Port, error) {
	var resource Port
	err := ctx.ReadResource("equinix:metal/port:Port", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Port resources.
type portState struct {
	// UUID of the bond port.
	BondId *string `pulumi:"bondId"`
	// Name of the bond port.
	BondName *string `pulumi:"bondName"`
	// Whether the port should be bonded.
	Bonded *bool `pulumi:"bonded"`
	// Flag indicating whether the port can be removed from a bond.
	DisbondSupported *bool `pulumi:"disbondSupported"`
	// Whether to put the port to Layer 2 mode, valid only for bond ports.
	Layer2 *bool `pulumi:"layer2"`
	// MAC address of the port.
	Mac *string `pulumi:"mac"`
	// Name of the port, e.g. `bond0` or `eth0`.
	Name *string `pulumi:"name"`
	// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
	NativeVlanId *string `pulumi:"nativeVlanId"`
	// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
	NetworkType *string `pulumi:"networkType"`
	// ID of the port to read.
	PortId *string `pulumi:"portId"`
	// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
	ResetOnDelete *bool `pulumi:"resetOnDelete"`
	// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
	Type *string `pulumi:"type"`
	// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
	VlanIds []string `pulumi:"vlanIds"`
	// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
	VxlanIds []int `pulumi:"vxlanIds"`
}

type PortState struct {
	// UUID of the bond port.
	BondId pulumi.StringPtrInput
	// Name of the bond port.
	BondName pulumi.StringPtrInput
	// Whether the port should be bonded.
	Bonded pulumi.BoolPtrInput
	// Flag indicating whether the port can be removed from a bond.
	DisbondSupported pulumi.BoolPtrInput
	// Whether to put the port to Layer 2 mode, valid only for bond ports.
	Layer2 pulumi.BoolPtrInput
	// MAC address of the port.
	Mac pulumi.StringPtrInput
	// Name of the port, e.g. `bond0` or `eth0`.
	Name pulumi.StringPtrInput
	// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
	NativeVlanId pulumi.StringPtrInput
	// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
	NetworkType pulumi.StringPtrInput
	// ID of the port to read.
	PortId pulumi.StringPtrInput
	// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
	ResetOnDelete pulumi.BoolPtrInput
	// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
	Type pulumi.StringPtrInput
	// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
	VlanIds pulumi.StringArrayInput
	// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
	VxlanIds pulumi.IntArrayInput
}

func (PortState) ElementType() reflect.Type {
	return reflect.TypeOf((*portState)(nil)).Elem()
}

type portArgs struct {
	// Whether the port should be bonded.
	Bonded bool `pulumi:"bonded"`
	// Whether to put the port to Layer 2 mode, valid only for bond ports.
	Layer2 *bool `pulumi:"layer2"`
	// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
	NativeVlanId *string `pulumi:"nativeVlanId"`
	// ID of the port to read.
	PortId string `pulumi:"portId"`
	// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
	ResetOnDelete *bool `pulumi:"resetOnDelete"`
	// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
	VlanIds []string `pulumi:"vlanIds"`
	// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
	VxlanIds []int `pulumi:"vxlanIds"`
}

// The set of arguments for constructing a Port resource.
type PortArgs struct {
	// Whether the port should be bonded.
	Bonded pulumi.BoolInput
	// Whether to put the port to Layer 2 mode, valid only for bond ports.
	Layer2 pulumi.BoolPtrInput
	// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
	NativeVlanId pulumi.StringPtrInput
	// ID of the port to read.
	PortId pulumi.StringInput
	// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
	ResetOnDelete pulumi.BoolPtrInput
	// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
	VlanIds pulumi.StringArrayInput
	// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
	VxlanIds pulumi.IntArrayInput
}

func (PortArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*portArgs)(nil)).Elem()
}

type PortInput interface {
	pulumi.Input

	ToPortOutput() PortOutput
	ToPortOutputWithContext(ctx context.Context) PortOutput
}

func (*Port) ElementType() reflect.Type {
	return reflect.TypeOf((**Port)(nil)).Elem()
}

func (i *Port) ToPortOutput() PortOutput {
	return i.ToPortOutputWithContext(context.Background())
}

func (i *Port) ToPortOutputWithContext(ctx context.Context) PortOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortOutput)
}

// PortArrayInput is an input type that accepts PortArray and PortArrayOutput values.
// You can construct a concrete instance of `PortArrayInput` via:
//
//	PortArray{ PortArgs{...} }
type PortArrayInput interface {
	pulumi.Input

	ToPortArrayOutput() PortArrayOutput
	ToPortArrayOutputWithContext(context.Context) PortArrayOutput
}

type PortArray []PortInput

func (PortArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Port)(nil)).Elem()
}

func (i PortArray) ToPortArrayOutput() PortArrayOutput {
	return i.ToPortArrayOutputWithContext(context.Background())
}

func (i PortArray) ToPortArrayOutputWithContext(ctx context.Context) PortArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortArrayOutput)
}

// PortMapInput is an input type that accepts PortMap and PortMapOutput values.
// You can construct a concrete instance of `PortMapInput` via:
//
//	PortMap{ "key": PortArgs{...} }
type PortMapInput interface {
	pulumi.Input

	ToPortMapOutput() PortMapOutput
	ToPortMapOutputWithContext(context.Context) PortMapOutput
}

type PortMap map[string]PortInput

func (PortMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Port)(nil)).Elem()
}

func (i PortMap) ToPortMapOutput() PortMapOutput {
	return i.ToPortMapOutputWithContext(context.Background())
}

func (i PortMap) ToPortMapOutputWithContext(ctx context.Context) PortMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortMapOutput)
}

type PortOutput struct{ *pulumi.OutputState }

func (PortOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Port)(nil)).Elem()
}

func (o PortOutput) ToPortOutput() PortOutput {
	return o
}

func (o PortOutput) ToPortOutputWithContext(ctx context.Context) PortOutput {
	return o
}

// UUID of the bond port.
func (o PortOutput) BondId() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.BondId }).(pulumi.StringOutput)
}

// Name of the bond port.
func (o PortOutput) BondName() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.BondName }).(pulumi.StringOutput)
}

// Whether the port should be bonded.
func (o PortOutput) Bonded() pulumi.BoolOutput {
	return o.ApplyT(func(v *Port) pulumi.BoolOutput { return v.Bonded }).(pulumi.BoolOutput)
}

// Flag indicating whether the port can be removed from a bond.
func (o PortOutput) DisbondSupported() pulumi.BoolOutput {
	return o.ApplyT(func(v *Port) pulumi.BoolOutput { return v.DisbondSupported }).(pulumi.BoolOutput)
}

// Whether to put the port to Layer 2 mode, valid only for bond ports.
func (o PortOutput) Layer2() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Port) pulumi.BoolPtrOutput { return v.Layer2 }).(pulumi.BoolPtrOutput)
}

// MAC address of the port.
func (o PortOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

// Name of the port, e.g. `bond0` or `eth0`.
func (o PortOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlanIds` parameter).
func (o PortOutput) NativeVlanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Port) pulumi.StringPtrOutput { return v.NativeVlanId }).(pulumi.StringPtrOutput)
}

// One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
func (o PortOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.NetworkType }).(pulumi.StringOutput)
}

// ID of the port to read.
func (o PortOutput) PortId() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.PortId }).(pulumi.StringOutput)
}

// Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
func (o PortOutput) ResetOnDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Port) pulumi.BoolPtrOutput { return v.ResetOnDelete }).(pulumi.BoolPtrOutput)
}

// Type is either "NetworkBondPort" for bond ports or "NetworkPort" for bondable ethernet ports.
func (o PortOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Port) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
func (o PortOutput) VlanIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Port) pulumi.StringArrayOutput { return v.VlanIds }).(pulumi.StringArrayOutput)
}

// List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
func (o PortOutput) VxlanIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Port) pulumi.IntArrayOutput { return v.VxlanIds }).(pulumi.IntArrayOutput)
}

type PortArrayOutput struct{ *pulumi.OutputState }

func (PortArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Port)(nil)).Elem()
}

func (o PortArrayOutput) ToPortArrayOutput() PortArrayOutput {
	return o
}

func (o PortArrayOutput) ToPortArrayOutputWithContext(ctx context.Context) PortArrayOutput {
	return o
}

func (o PortArrayOutput) Index(i pulumi.IntInput) PortOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Port {
		return vs[0].([]*Port)[vs[1].(int)]
	}).(PortOutput)
}

type PortMapOutput struct{ *pulumi.OutputState }

func (PortMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Port)(nil)).Elem()
}

func (o PortMapOutput) ToPortMapOutput() PortMapOutput {
	return o
}

func (o PortMapOutput) ToPortMapOutputWithContext(ctx context.Context) PortMapOutput {
	return o
}

func (o PortMapOutput) MapIndex(k pulumi.StringInput) PortOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Port {
		return vs[0].(map[string]*Port)[vs[1].(string)]
	}).(PortOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PortInput)(nil)).Elem(), &Port{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortArrayInput)(nil)).Elem(), PortArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortMapInput)(nil)).Elem(), PortMap{})
	pulumi.RegisterOutputType(PortOutput{})
	pulumi.RegisterOutputType(PortArrayOutput{})
	pulumi.RegisterOutputType(PortMapOutput{})
}
