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

// Provides a resource to attach device ports to VLANs.
//
// Device and VLAN must be in the same metro.
//
// If you need this resource to add the port back to bond on removal, set `forceBond = true`.
//
// # To learn more about Layer 2 networking in Equinix Metal, refer to
//
// * https://metal.equinix.com/developers/docs/networking/layer2/
// * https://metal.equinix.com/developers/docs/networking/layer2-configs/
//
// ## Attribute Referece
//
// In addition to all arguments above, the following attributes are exported:
//
// * `id` - UUID of device port used in the assignment.
// * `vlanId` - UUID of VLAN API resource.
// * `portId` - UUID of device port.
//
// ## Example Usage
// ### example 1
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
//			test, err := metal.NewVlan(ctx, "test", &metal.VlanArgs{
//				Description: pulumi.String("VLAN in New York"),
//				Metro:       pulumi.String("ny"),
//				ProjectId:   pulumi.Any(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			testDevice, err := metal.NewDevice(ctx, "testDevice", &metal.DeviceArgs{
//				Hostname:        pulumi.String("test"),
//				Plan:            pulumi.String(metal.PlanC3SmallX86),
//				Metro:           pulumi.String("ny"),
//				OperatingSystem: pulumi.String("ubuntu_24_04"),
//				BillingCycle:    pulumi.String(metal.BillingCycleHourly),
//				ProjectId:       pulumi.Any(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
//				DeviceId: testDevice.ID(),
//				Type:     pulumi.String("hybrid"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = metal.NewPortVlanAttachment(ctx, "testPortVlanAttachment", &metal.PortVlanAttachmentArgs{
//				DeviceId: testDeviceNetworkType.ID(),
//				PortName: pulumi.String("eth1"),
//				VlanVnid: test.Vxlan,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### example 2
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
//			test, err := metal.NewDevice(ctx, "test", &metal.DeviceArgs{
//				Hostname:        pulumi.String("test"),
//				Plan:            pulumi.String(metal.PlanC3SmallX86),
//				Metro:           pulumi.String("ny"),
//				OperatingSystem: pulumi.String("ubuntu_24_04"),
//				BillingCycle:    pulumi.String(metal.BillingCycleHourly),
//				ProjectId:       pulumi.Any(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
//				DeviceId: test.ID(),
//				Type:     pulumi.String("layer2-individual"),
//			})
//			if err != nil {
//				return err
//			}
//			test1, err := metal.NewVlan(ctx, "test1", &metal.VlanArgs{
//				Description: pulumi.String("VLAN in New York"),
//				Metro:       pulumi.String("ny"),
//				ProjectId:   pulumi.Any(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			test2, err := metal.NewVlan(ctx, "test2", &metal.VlanArgs{
//				Description: pulumi.String("VLAN in New Jersey"),
//				Metro:       pulumi.String("ny"),
//				ProjectId:   pulumi.Any(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			test1PortVlanAttachment, err := metal.NewPortVlanAttachment(ctx, "test1PortVlanAttachment", &metal.PortVlanAttachmentArgs{
//				DeviceId: testDeviceNetworkType.ID(),
//				VlanVnid: test1.Vxlan,
//				PortName: pulumi.String("eth1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = metal.NewPortVlanAttachment(ctx, "test2PortVlanAttachment", &metal.PortVlanAttachmentArgs{
//				DeviceId: testDeviceNetworkType.ID(),
//				VlanVnid: test2.Vxlan,
//				PortName: pulumi.String("eth1"),
//				Native:   pulumi.Bool(true),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				test1PortVlanAttachment,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type PortVlanAttachment struct {
	pulumi.CustomResourceState

	// ID of device to be assigned to the VLAN.
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// Add port back to the bond when this resource is removed. Default is `false`.
	ForceBond pulumi.BoolPtrOutput `pulumi:"forceBond"`
	// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
	Native pulumi.BoolPtrOutput `pulumi:"native"`
	// UUID of device port
	PortId pulumi.StringOutput `pulumi:"portId"`
	// Name of network port to be assigned to the VLAN.
	PortName pulumi.StringOutput `pulumi:"portName"`
	// UUID of VLAN API resource
	VlanId pulumi.StringOutput `pulumi:"vlanId"`
	// VXLAN Network Identifier.
	VlanVnid pulumi.IntOutput `pulumi:"vlanVnid"`
}

// NewPortVlanAttachment registers a new resource with the given unique name, arguments, and options.
func NewPortVlanAttachment(ctx *pulumi.Context,
	name string, args *PortVlanAttachmentArgs, opts ...pulumi.ResourceOption) (*PortVlanAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.PortName == nil {
		return nil, errors.New("invalid value for required argument 'PortName'")
	}
	if args.VlanVnid == nil {
		return nil, errors.New("invalid value for required argument 'VlanVnid'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PortVlanAttachment
	err := ctx.RegisterResource("equinix:metal/portVlanAttachment:PortVlanAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPortVlanAttachment gets an existing PortVlanAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPortVlanAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PortVlanAttachmentState, opts ...pulumi.ResourceOption) (*PortVlanAttachment, error) {
	var resource PortVlanAttachment
	err := ctx.ReadResource("equinix:metal/portVlanAttachment:PortVlanAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PortVlanAttachment resources.
type portVlanAttachmentState struct {
	// ID of device to be assigned to the VLAN.
	DeviceId *string `pulumi:"deviceId"`
	// Add port back to the bond when this resource is removed. Default is `false`.
	ForceBond *bool `pulumi:"forceBond"`
	// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
	Native *bool `pulumi:"native"`
	// UUID of device port
	PortId *string `pulumi:"portId"`
	// Name of network port to be assigned to the VLAN.
	PortName *string `pulumi:"portName"`
	// UUID of VLAN API resource
	VlanId *string `pulumi:"vlanId"`
	// VXLAN Network Identifier.
	VlanVnid *int `pulumi:"vlanVnid"`
}

type PortVlanAttachmentState struct {
	// ID of device to be assigned to the VLAN.
	DeviceId pulumi.StringPtrInput
	// Add port back to the bond when this resource is removed. Default is `false`.
	ForceBond pulumi.BoolPtrInput
	// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
	Native pulumi.BoolPtrInput
	// UUID of device port
	PortId pulumi.StringPtrInput
	// Name of network port to be assigned to the VLAN.
	PortName pulumi.StringPtrInput
	// UUID of VLAN API resource
	VlanId pulumi.StringPtrInput
	// VXLAN Network Identifier.
	VlanVnid pulumi.IntPtrInput
}

func (PortVlanAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*portVlanAttachmentState)(nil)).Elem()
}

type portVlanAttachmentArgs struct {
	// ID of device to be assigned to the VLAN.
	DeviceId string `pulumi:"deviceId"`
	// Add port back to the bond when this resource is removed. Default is `false`.
	ForceBond *bool `pulumi:"forceBond"`
	// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
	Native *bool `pulumi:"native"`
	// Name of network port to be assigned to the VLAN.
	PortName string `pulumi:"portName"`
	// VXLAN Network Identifier.
	VlanVnid int `pulumi:"vlanVnid"`
}

// The set of arguments for constructing a PortVlanAttachment resource.
type PortVlanAttachmentArgs struct {
	// ID of device to be assigned to the VLAN.
	DeviceId pulumi.StringInput
	// Add port back to the bond when this resource is removed. Default is `false`.
	ForceBond pulumi.BoolPtrInput
	// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
	Native pulumi.BoolPtrInput
	// Name of network port to be assigned to the VLAN.
	PortName pulumi.StringInput
	// VXLAN Network Identifier.
	VlanVnid pulumi.IntInput
}

func (PortVlanAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*portVlanAttachmentArgs)(nil)).Elem()
}

type PortVlanAttachmentInput interface {
	pulumi.Input

	ToPortVlanAttachmentOutput() PortVlanAttachmentOutput
	ToPortVlanAttachmentOutputWithContext(ctx context.Context) PortVlanAttachmentOutput
}

func (*PortVlanAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**PortVlanAttachment)(nil)).Elem()
}

func (i *PortVlanAttachment) ToPortVlanAttachmentOutput() PortVlanAttachmentOutput {
	return i.ToPortVlanAttachmentOutputWithContext(context.Background())
}

func (i *PortVlanAttachment) ToPortVlanAttachmentOutputWithContext(ctx context.Context) PortVlanAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortVlanAttachmentOutput)
}

// PortVlanAttachmentArrayInput is an input type that accepts PortVlanAttachmentArray and PortVlanAttachmentArrayOutput values.
// You can construct a concrete instance of `PortVlanAttachmentArrayInput` via:
//
//	PortVlanAttachmentArray{ PortVlanAttachmentArgs{...} }
type PortVlanAttachmentArrayInput interface {
	pulumi.Input

	ToPortVlanAttachmentArrayOutput() PortVlanAttachmentArrayOutput
	ToPortVlanAttachmentArrayOutputWithContext(context.Context) PortVlanAttachmentArrayOutput
}

type PortVlanAttachmentArray []PortVlanAttachmentInput

func (PortVlanAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PortVlanAttachment)(nil)).Elem()
}

func (i PortVlanAttachmentArray) ToPortVlanAttachmentArrayOutput() PortVlanAttachmentArrayOutput {
	return i.ToPortVlanAttachmentArrayOutputWithContext(context.Background())
}

func (i PortVlanAttachmentArray) ToPortVlanAttachmentArrayOutputWithContext(ctx context.Context) PortVlanAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortVlanAttachmentArrayOutput)
}

// PortVlanAttachmentMapInput is an input type that accepts PortVlanAttachmentMap and PortVlanAttachmentMapOutput values.
// You can construct a concrete instance of `PortVlanAttachmentMapInput` via:
//
//	PortVlanAttachmentMap{ "key": PortVlanAttachmentArgs{...} }
type PortVlanAttachmentMapInput interface {
	pulumi.Input

	ToPortVlanAttachmentMapOutput() PortVlanAttachmentMapOutput
	ToPortVlanAttachmentMapOutputWithContext(context.Context) PortVlanAttachmentMapOutput
}

type PortVlanAttachmentMap map[string]PortVlanAttachmentInput

func (PortVlanAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PortVlanAttachment)(nil)).Elem()
}

func (i PortVlanAttachmentMap) ToPortVlanAttachmentMapOutput() PortVlanAttachmentMapOutput {
	return i.ToPortVlanAttachmentMapOutputWithContext(context.Background())
}

func (i PortVlanAttachmentMap) ToPortVlanAttachmentMapOutputWithContext(ctx context.Context) PortVlanAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PortVlanAttachmentMapOutput)
}

type PortVlanAttachmentOutput struct{ *pulumi.OutputState }

func (PortVlanAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PortVlanAttachment)(nil)).Elem()
}

func (o PortVlanAttachmentOutput) ToPortVlanAttachmentOutput() PortVlanAttachmentOutput {
	return o
}

func (o PortVlanAttachmentOutput) ToPortVlanAttachmentOutputWithContext(ctx context.Context) PortVlanAttachmentOutput {
	return o
}

// ID of device to be assigned to the VLAN.
func (o PortVlanAttachmentOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// Add port back to the bond when this resource is removed. Default is `false`.
func (o PortVlanAttachmentOutput) ForceBond() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.BoolPtrOutput { return v.ForceBond }).(pulumi.BoolPtrOutput)
}

// Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `metal.PortVlanAttachment`, just like in the layer2-individual example above.
func (o PortVlanAttachmentOutput) Native() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.BoolPtrOutput { return v.Native }).(pulumi.BoolPtrOutput)
}

// UUID of device port
func (o PortVlanAttachmentOutput) PortId() pulumi.StringOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.StringOutput { return v.PortId }).(pulumi.StringOutput)
}

// Name of network port to be assigned to the VLAN.
func (o PortVlanAttachmentOutput) PortName() pulumi.StringOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.StringOutput { return v.PortName }).(pulumi.StringOutput)
}

// UUID of VLAN API resource
func (o PortVlanAttachmentOutput) VlanId() pulumi.StringOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.StringOutput { return v.VlanId }).(pulumi.StringOutput)
}

// VXLAN Network Identifier.
func (o PortVlanAttachmentOutput) VlanVnid() pulumi.IntOutput {
	return o.ApplyT(func(v *PortVlanAttachment) pulumi.IntOutput { return v.VlanVnid }).(pulumi.IntOutput)
}

type PortVlanAttachmentArrayOutput struct{ *pulumi.OutputState }

func (PortVlanAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PortVlanAttachment)(nil)).Elem()
}

func (o PortVlanAttachmentArrayOutput) ToPortVlanAttachmentArrayOutput() PortVlanAttachmentArrayOutput {
	return o
}

func (o PortVlanAttachmentArrayOutput) ToPortVlanAttachmentArrayOutputWithContext(ctx context.Context) PortVlanAttachmentArrayOutput {
	return o
}

func (o PortVlanAttachmentArrayOutput) Index(i pulumi.IntInput) PortVlanAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PortVlanAttachment {
		return vs[0].([]*PortVlanAttachment)[vs[1].(int)]
	}).(PortVlanAttachmentOutput)
}

type PortVlanAttachmentMapOutput struct{ *pulumi.OutputState }

func (PortVlanAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PortVlanAttachment)(nil)).Elem()
}

func (o PortVlanAttachmentMapOutput) ToPortVlanAttachmentMapOutput() PortVlanAttachmentMapOutput {
	return o
}

func (o PortVlanAttachmentMapOutput) ToPortVlanAttachmentMapOutputWithContext(ctx context.Context) PortVlanAttachmentMapOutput {
	return o
}

func (o PortVlanAttachmentMapOutput) MapIndex(k pulumi.StringInput) PortVlanAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PortVlanAttachment {
		return vs[0].(map[string]*PortVlanAttachment)[vs[1].(string)]
	}).(PortVlanAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PortVlanAttachmentInput)(nil)).Elem(), &PortVlanAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortVlanAttachmentArrayInput)(nil)).Elem(), PortVlanAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PortVlanAttachmentMapInput)(nil)).Elem(), PortVlanAttachmentMap{})
	pulumi.RegisterOutputType(PortVlanAttachmentOutput{})
	pulumi.RegisterOutputType(PortVlanAttachmentArrayOutput{})
	pulumi.RegisterOutputType(PortVlanAttachmentMapOutput{})
}
