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

// Provides a resource to allow users to manage Virtual Networks in their projects.
//
// # To learn more about Layer 2 networking in Equinix Metal, refer to
//
// * https://metal.equinix.com/developers/docs/networking/layer2/
// * https://metal.equinix.com/developers/docs/networking/layer2-configs/
//
// ## Example Usage
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
//			_, err := metal.NewVlan(ctx, "vlan1", &metal.VlanArgs{
//				Description: pulumi.String("VLAN in New Jersey"),
//				Metro:       pulumi.String("sv"),
//				ProjectId:   pulumi.Any(projectId),
//				Vxlan:       pulumi.Int(1040),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing VLAN ID (UUID):
//
// ```sh
// $ pulumi import equinix:metal/vlan:Vlan equinix_metal_vlan {existing_vlan_id}
// ```
type Vlan struct {
	pulumi.CustomResourceState

	// Description string.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility pulumi.StringOutput `pulumi:"facility"`
	// Metro in which to create the VLAN
	Metro pulumi.StringOutput `pulumi:"metro"`
	// ID of parent project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// VLAN ID, must be unique in metro.
	Vxlan pulumi.IntOutput `pulumi:"vxlan"`
}

// NewVlan registers a new resource with the given unique name, arguments, and options.
func NewVlan(ctx *pulumi.Context,
	name string, args *VlanArgs, opts ...pulumi.ResourceOption) (*Vlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Vlan
	err := ctx.RegisterResource("equinix:metal/vlan:Vlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVlan gets an existing Vlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VlanState, opts ...pulumi.ResourceOption) (*Vlan, error) {
	var resource Vlan
	err := ctx.ReadResource("equinix:metal/vlan:Vlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vlan resources.
type vlanState struct {
	// Description string.
	Description *string `pulumi:"description"`
	// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility *string `pulumi:"facility"`
	// Metro in which to create the VLAN
	Metro *string `pulumi:"metro"`
	// ID of parent project.
	ProjectId *string `pulumi:"projectId"`
	// VLAN ID, must be unique in metro.
	Vxlan *int `pulumi:"vxlan"`
}

type VlanState struct {
	// Description string.
	Description pulumi.StringPtrInput
	// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility pulumi.StringPtrInput
	// Metro in which to create the VLAN
	Metro pulumi.StringPtrInput
	// ID of parent project.
	ProjectId pulumi.StringPtrInput
	// VLAN ID, must be unique in metro.
	Vxlan pulumi.IntPtrInput
}

func (VlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanState)(nil)).Elem()
}

type vlanArgs struct {
	// Description string.
	Description *string `pulumi:"description"`
	// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility *string `pulumi:"facility"`
	// Metro in which to create the VLAN
	Metro *string `pulumi:"metro"`
	// ID of parent project.
	ProjectId string `pulumi:"projectId"`
	// VLAN ID, must be unique in metro.
	Vxlan *int `pulumi:"vxlan"`
}

// The set of arguments for constructing a Vlan resource.
type VlanArgs struct {
	// Description string.
	Description pulumi.StringPtrInput
	// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
	Facility pulumi.StringPtrInput
	// Metro in which to create the VLAN
	Metro pulumi.StringPtrInput
	// ID of parent project.
	ProjectId pulumi.StringInput
	// VLAN ID, must be unique in metro.
	Vxlan pulumi.IntPtrInput
}

func (VlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanArgs)(nil)).Elem()
}

type VlanInput interface {
	pulumi.Input

	ToVlanOutput() VlanOutput
	ToVlanOutputWithContext(ctx context.Context) VlanOutput
}

func (*Vlan) ElementType() reflect.Type {
	return reflect.TypeOf((**Vlan)(nil)).Elem()
}

func (i *Vlan) ToVlanOutput() VlanOutput {
	return i.ToVlanOutputWithContext(context.Background())
}

func (i *Vlan) ToVlanOutputWithContext(ctx context.Context) VlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanOutput)
}

// VlanArrayInput is an input type that accepts VlanArray and VlanArrayOutput values.
// You can construct a concrete instance of `VlanArrayInput` via:
//
//	VlanArray{ VlanArgs{...} }
type VlanArrayInput interface {
	pulumi.Input

	ToVlanArrayOutput() VlanArrayOutput
	ToVlanArrayOutputWithContext(context.Context) VlanArrayOutput
}

type VlanArray []VlanInput

func (VlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vlan)(nil)).Elem()
}

func (i VlanArray) ToVlanArrayOutput() VlanArrayOutput {
	return i.ToVlanArrayOutputWithContext(context.Background())
}

func (i VlanArray) ToVlanArrayOutputWithContext(ctx context.Context) VlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanArrayOutput)
}

// VlanMapInput is an input type that accepts VlanMap and VlanMapOutput values.
// You can construct a concrete instance of `VlanMapInput` via:
//
//	VlanMap{ "key": VlanArgs{...} }
type VlanMapInput interface {
	pulumi.Input

	ToVlanMapOutput() VlanMapOutput
	ToVlanMapOutputWithContext(context.Context) VlanMapOutput
}

type VlanMap map[string]VlanInput

func (VlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vlan)(nil)).Elem()
}

func (i VlanMap) ToVlanMapOutput() VlanMapOutput {
	return i.ToVlanMapOutputWithContext(context.Background())
}

func (i VlanMap) ToVlanMapOutputWithContext(ctx context.Context) VlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanMapOutput)
}

type VlanOutput struct{ *pulumi.OutputState }

func (VlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Vlan)(nil)).Elem()
}

func (o VlanOutput) ToVlanOutput() VlanOutput {
	return o
}

func (o VlanOutput) ToVlanOutputWithContext(ctx context.Context) VlanOutput {
	return o
}

// Description string.
func (o VlanOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Vlan) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
//
// Deprecated: Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
func (o VlanOutput) Facility() pulumi.StringOutput {
	return o.ApplyT(func(v *Vlan) pulumi.StringOutput { return v.Facility }).(pulumi.StringOutput)
}

// Metro in which to create the VLAN
func (o VlanOutput) Metro() pulumi.StringOutput {
	return o.ApplyT(func(v *Vlan) pulumi.StringOutput { return v.Metro }).(pulumi.StringOutput)
}

// ID of parent project.
func (o VlanOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *Vlan) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// VLAN ID, must be unique in metro.
func (o VlanOutput) Vxlan() pulumi.IntOutput {
	return o.ApplyT(func(v *Vlan) pulumi.IntOutput { return v.Vxlan }).(pulumi.IntOutput)
}

type VlanArrayOutput struct{ *pulumi.OutputState }

func (VlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vlan)(nil)).Elem()
}

func (o VlanArrayOutput) ToVlanArrayOutput() VlanArrayOutput {
	return o
}

func (o VlanArrayOutput) ToVlanArrayOutputWithContext(ctx context.Context) VlanArrayOutput {
	return o
}

func (o VlanArrayOutput) Index(i pulumi.IntInput) VlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vlan {
		return vs[0].([]*Vlan)[vs[1].(int)]
	}).(VlanOutput)
}

type VlanMapOutput struct{ *pulumi.OutputState }

func (VlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vlan)(nil)).Elem()
}

func (o VlanMapOutput) ToVlanMapOutput() VlanMapOutput {
	return o
}

func (o VlanMapOutput) ToVlanMapOutputWithContext(ctx context.Context) VlanMapOutput {
	return o
}

func (o VlanMapOutput) MapIndex(k pulumi.StringInput) VlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vlan {
		return vs[0].(map[string]*Vlan)[vs[1].(string)]
	}).(VlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VlanInput)(nil)).Elem(), &Vlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanArrayInput)(nil)).Elem(), VlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanMapInput)(nil)).Elem(), VlanMap{})
	pulumi.RegisterOutputType(VlanOutput{})
	pulumi.RegisterOutputType(VlanArrayOutput{})
	pulumi.RegisterOutputType(VlanMapOutput{})
}
