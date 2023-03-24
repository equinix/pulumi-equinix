// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkedge

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource `networkedge.DeviceLink` allows creation and management of Equinix
// Network Edge virtual network device links.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			accountName := cfg.Require("accountName")
//			accountMetro := cfg.Require("accountMetro")
//			device1Id := cfg.Require("device1Id")
//			device2Id := cfg.Require("device2Id")
//			accountfNum := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
//				Name:      pulumi.StringRef(accountName),
//				MetroCode: accountMetro,
//			}, nil).Number
//			device1Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
//				Uuid: pulumi.StringRef(device1Id),
//			}, nil).MetroCode
//			device2Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
//				Uuid: pulumi.StringRef(device2Id),
//			}, nil).MetroCode
//			deviceLink, err := networkedge.NewDeviceLink(ctx, "deviceLink", &networkedge.DeviceLinkArgs{
//				Name:   pulumi.String("test-link"),
//				Subnet: pulumi.String("192.168.40.64/27"),
//				Devices: networkedge.DeviceLinkDeviceArray{
//					&networkedge.DeviceLinkDeviceArgs{
//						Id:          pulumi.String("device1Id"),
//						Asn:         pulumi.Int(22111),
//						InterfaceId: pulumi.Int(6),
//					},
//					&networkedge.DeviceLinkDeviceArgs{
//						Id:          pulumi.String("device2Id"),
//						Asn:         pulumi.Int(22333),
//						InterfaceId: pulumi.Int(7),
//					},
//				},
//				Links: networkedge.DeviceLinkLinkArray{
//					&networkedge.DeviceLinkLinkArgs{
//						AccountNumber:  *pulumi.String(accountfNum),
//						SrcMetroCode:   *pulumi.String(device1Metro),
//						DstMetroCode:   *pulumi.String(device2Metro),
//						Throughput:     pulumi.String("50"),
//						ThroughputUnit: pulumi.String("Mbps"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("status", deviceLink.Status)
//			ctx.Export("devices", deviceLink.Devices)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing ID: <break><break>```sh<break> $ pulumi import equinix:networkedge/deviceLink:DeviceLink example {existing_id} <break>```<break><break>
type DeviceLink struct {
	pulumi.CustomResourceState

	// definition of one or more devices belonging to the
	// device link. See Device section below for more details.
	Devices DeviceLinkDeviceArrayOutput `pulumi:"devices"`
	// definition of one or more, inter metro, connections belonging
	// to the device link. See Link section below for more details.
	Links DeviceLinkLinkArrayOutput `pulumi:"links"`
	// device link name.
	Name pulumi.StringOutput `pulumi:"name"`
	// device link provisioning status on a given device. One of `PROVISIONING`,
	// `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
	Status pulumi.StringOutput `pulumi:"status"`
	// device link subnet in CIDR format. Not required for link
	// between self configured devices.
	Subnet pulumi.StringPtrOutput `pulumi:"subnet"`
	// Device link unique identifier.
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewDeviceLink registers a new resource with the given unique name, arguments, and options.
func NewDeviceLink(ctx *pulumi.Context,
	name string, args *DeviceLinkArgs, opts ...pulumi.ResourceOption) (*DeviceLink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Devices == nil {
		return nil, errors.New("invalid value for required argument 'Devices'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DeviceLink
	err := ctx.RegisterResource("equinix:networkedge/deviceLink:DeviceLink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceLink gets an existing DeviceLink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceLink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceLinkState, opts ...pulumi.ResourceOption) (*DeviceLink, error) {
	var resource DeviceLink
	err := ctx.ReadResource("equinix:networkedge/deviceLink:DeviceLink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceLink resources.
type deviceLinkState struct {
	// definition of one or more devices belonging to the
	// device link. See Device section below for more details.
	Devices []DeviceLinkDevice `pulumi:"devices"`
	// definition of one or more, inter metro, connections belonging
	// to the device link. See Link section below for more details.
	Links []DeviceLinkLink `pulumi:"links"`
	// device link name.
	Name *string `pulumi:"name"`
	// device link provisioning status on a given device. One of `PROVISIONING`,
	// `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
	Status *string `pulumi:"status"`
	// device link subnet in CIDR format. Not required for link
	// between self configured devices.
	Subnet *string `pulumi:"subnet"`
	// Device link unique identifier.
	Uuid *string `pulumi:"uuid"`
}

type DeviceLinkState struct {
	// definition of one or more devices belonging to the
	// device link. See Device section below for more details.
	Devices DeviceLinkDeviceArrayInput
	// definition of one or more, inter metro, connections belonging
	// to the device link. See Link section below for more details.
	Links DeviceLinkLinkArrayInput
	// device link name.
	Name pulumi.StringPtrInput
	// device link provisioning status on a given device. One of `PROVISIONING`,
	// `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
	Status pulumi.StringPtrInput
	// device link subnet in CIDR format. Not required for link
	// between self configured devices.
	Subnet pulumi.StringPtrInput
	// Device link unique identifier.
	Uuid pulumi.StringPtrInput
}

func (DeviceLinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceLinkState)(nil)).Elem()
}

type deviceLinkArgs struct {
	// definition of one or more devices belonging to the
	// device link. See Device section below for more details.
	Devices []DeviceLinkDevice `pulumi:"devices"`
	// definition of one or more, inter metro, connections belonging
	// to the device link. See Link section below for more details.
	Links []DeviceLinkLink `pulumi:"links"`
	// device link name.
	Name *string `pulumi:"name"`
	// device link subnet in CIDR format. Not required for link
	// between self configured devices.
	Subnet *string `pulumi:"subnet"`
}

// The set of arguments for constructing a DeviceLink resource.
type DeviceLinkArgs struct {
	// definition of one or more devices belonging to the
	// device link. See Device section below for more details.
	Devices DeviceLinkDeviceArrayInput
	// definition of one or more, inter metro, connections belonging
	// to the device link. See Link section below for more details.
	Links DeviceLinkLinkArrayInput
	// device link name.
	Name pulumi.StringPtrInput
	// device link subnet in CIDR format. Not required for link
	// between self configured devices.
	Subnet pulumi.StringPtrInput
}

func (DeviceLinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceLinkArgs)(nil)).Elem()
}

type DeviceLinkInput interface {
	pulumi.Input

	ToDeviceLinkOutput() DeviceLinkOutput
	ToDeviceLinkOutputWithContext(ctx context.Context) DeviceLinkOutput
}

func (*DeviceLink) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceLink)(nil)).Elem()
}

func (i *DeviceLink) ToDeviceLinkOutput() DeviceLinkOutput {
	return i.ToDeviceLinkOutputWithContext(context.Background())
}

func (i *DeviceLink) ToDeviceLinkOutputWithContext(ctx context.Context) DeviceLinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceLinkOutput)
}

// DeviceLinkArrayInput is an input type that accepts DeviceLinkArray and DeviceLinkArrayOutput values.
// You can construct a concrete instance of `DeviceLinkArrayInput` via:
//
//	DeviceLinkArray{ DeviceLinkArgs{...} }
type DeviceLinkArrayInput interface {
	pulumi.Input

	ToDeviceLinkArrayOutput() DeviceLinkArrayOutput
	ToDeviceLinkArrayOutputWithContext(context.Context) DeviceLinkArrayOutput
}

type DeviceLinkArray []DeviceLinkInput

func (DeviceLinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceLink)(nil)).Elem()
}

func (i DeviceLinkArray) ToDeviceLinkArrayOutput() DeviceLinkArrayOutput {
	return i.ToDeviceLinkArrayOutputWithContext(context.Background())
}

func (i DeviceLinkArray) ToDeviceLinkArrayOutputWithContext(ctx context.Context) DeviceLinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceLinkArrayOutput)
}

// DeviceLinkMapInput is an input type that accepts DeviceLinkMap and DeviceLinkMapOutput values.
// You can construct a concrete instance of `DeviceLinkMapInput` via:
//
//	DeviceLinkMap{ "key": DeviceLinkArgs{...} }
type DeviceLinkMapInput interface {
	pulumi.Input

	ToDeviceLinkMapOutput() DeviceLinkMapOutput
	ToDeviceLinkMapOutputWithContext(context.Context) DeviceLinkMapOutput
}

type DeviceLinkMap map[string]DeviceLinkInput

func (DeviceLinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceLink)(nil)).Elem()
}

func (i DeviceLinkMap) ToDeviceLinkMapOutput() DeviceLinkMapOutput {
	return i.ToDeviceLinkMapOutputWithContext(context.Background())
}

func (i DeviceLinkMap) ToDeviceLinkMapOutputWithContext(ctx context.Context) DeviceLinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceLinkMapOutput)
}

type DeviceLinkOutput struct{ *pulumi.OutputState }

func (DeviceLinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceLink)(nil)).Elem()
}

func (o DeviceLinkOutput) ToDeviceLinkOutput() DeviceLinkOutput {
	return o
}

func (o DeviceLinkOutput) ToDeviceLinkOutputWithContext(ctx context.Context) DeviceLinkOutput {
	return o
}

// definition of one or more devices belonging to the
// device link. See Device section below for more details.
func (o DeviceLinkOutput) Devices() DeviceLinkDeviceArrayOutput {
	return o.ApplyT(func(v *DeviceLink) DeviceLinkDeviceArrayOutput { return v.Devices }).(DeviceLinkDeviceArrayOutput)
}

// definition of one or more, inter metro, connections belonging
// to the device link. See Link section below for more details.
func (o DeviceLinkOutput) Links() DeviceLinkLinkArrayOutput {
	return o.ApplyT(func(v *DeviceLink) DeviceLinkLinkArrayOutput { return v.Links }).(DeviceLinkLinkArrayOutput)
}

// device link name.
func (o DeviceLinkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceLink) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// device link provisioning status on a given device. One of `PROVISIONING`,
// `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
func (o DeviceLinkOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceLink) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// device link subnet in CIDR format. Not required for link
// between self configured devices.
func (o DeviceLinkOutput) Subnet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeviceLink) pulumi.StringPtrOutput { return v.Subnet }).(pulumi.StringPtrOutput)
}

// Device link unique identifier.
func (o DeviceLinkOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceLink) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type DeviceLinkArrayOutput struct{ *pulumi.OutputState }

func (DeviceLinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceLink)(nil)).Elem()
}

func (o DeviceLinkArrayOutput) ToDeviceLinkArrayOutput() DeviceLinkArrayOutput {
	return o
}

func (o DeviceLinkArrayOutput) ToDeviceLinkArrayOutputWithContext(ctx context.Context) DeviceLinkArrayOutput {
	return o
}

func (o DeviceLinkArrayOutput) Index(i pulumi.IntInput) DeviceLinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceLink {
		return vs[0].([]*DeviceLink)[vs[1].(int)]
	}).(DeviceLinkOutput)
}

type DeviceLinkMapOutput struct{ *pulumi.OutputState }

func (DeviceLinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceLink)(nil)).Elem()
}

func (o DeviceLinkMapOutput) ToDeviceLinkMapOutput() DeviceLinkMapOutput {
	return o
}

func (o DeviceLinkMapOutput) ToDeviceLinkMapOutputWithContext(ctx context.Context) DeviceLinkMapOutput {
	return o
}

func (o DeviceLinkMapOutput) MapIndex(k pulumi.StringInput) DeviceLinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceLink {
		return vs[0].(map[string]*DeviceLink)[vs[1].(string)]
	}).(DeviceLinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceLinkInput)(nil)).Elem(), &DeviceLink{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceLinkArrayInput)(nil)).Elem(), DeviceLinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceLinkMapInput)(nil)).Elem(), DeviceLinkMap{})
	pulumi.RegisterOutputType(DeviceLinkOutput{})
	pulumi.RegisterOutputType(DeviceLinkArrayOutput{})
	pulumi.RegisterOutputType(DeviceLinkMapOutput{})
}
