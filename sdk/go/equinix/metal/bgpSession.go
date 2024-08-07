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

// Provides a resource to manage BGP sessions in Equinix Metal Host. Refer to [Equinix Metal BGP documentation](https://metal.equinix.com/developers/docs/networking/local-global-bgp/) for more details.
//
// You need to have BGP config enabled in your project.
//
// BGP session must be linked to a device running [BIRD](https://bird.network.cz) or other BGP routing daemon which will control route advertisements via the session to Equinix Metal's upstream routers.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi-null/sdk/go/null"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			bgpPassword := "955dB0b81Ef"
//			projectId := "<UUID_of_your_project>"
//			addr, err := metal.NewReservedIpBlock(ctx, "addr", &metal.ReservedIpBlockArgs{
//				ProjectId: pulumi.String(projectId),
//				Metro:     pulumi.String("ny"),
//				Quantity:  pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			interfaceLo0 := pulumi.All(addr.Address, addr.Netmask).ApplyT(func(_args []interface{}) (string, error) {
//				address := _args[0].(string)
//				netmask := _args[1].(string)
//				return fmt.Sprintf("auto lo:0\niface lo:0 inet static\n   address %v\n   netmask %v\n", address, netmask), nil
//			}).(pulumi.StringOutput)
//			test, err := metal.NewDevice(ctx, "test", &metal.DeviceArgs{
//				Hostname:        pulumi.String("terraform-test-bgp-sesh"),
//				Plan:            pulumi.String(metal.PlanC3SmallX86),
//				Metro:           pulumi.String("ny"),
//				OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
//				BillingCycle:    pulumi.String(metal.BillingCycleHourly),
//				ProjectId:       pulumi.String(projectId),
//			})
//			if err != nil {
//				return err
//			}
//			birdConf := pulumi.All(addr.Address, addr.Cidr, test.Network, test.Network).ApplyT(func(_args []interface{}) (string, error) {
//				address := _args[0].(string)
//				cidr := _args[1].(int)
//				testNetwork := _args[2].([]metal.DeviceNetwork)
//				testNetwork1 := _args[3].([]metal.DeviceNetwork)
//				return fmt.Sprintf(`filter equinix_metal_bgp {
//	    if net = %v/%v then accept;
//	}
//
// router id %v;
//
//	protocol direct {
//	    interface "lo";
//	}
//
//	protocol kernel {
//	    scan time 10;
//	    persist;
//	    import all;
//	    export all;
//	}
//
//	protocol device {
//	    scan time 10;
//	}
//
//	protocol bgp {
//	    export filter equinix_metal_bgp;
//	    local as 65000;
//	    neighbor %v as 65530;
//	    password "%v";
//	}
//
// `, address, cidr, testNetwork[2].Address, testNetwork1[2].Gateway, bgpPassword), nil
//
//			}).(pulumi.StringOutput)
//			_, err = metal.NewBgpSession(ctx, "testBgpSession", &metal.BgpSessionArgs{
//				DeviceId:      test.ID(),
//				AddressFamily: pulumi.String("ipv4"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = null.NewResource(ctx, "configureBird", &null.ResourceArgs{
//				Triggers: pulumi.StringMap{
//					"bird_conf": pulumi.String(birdConf),
//					"interface": pulumi.String(interfaceLo0),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type BgpSession struct {
	pulumi.CustomResourceState

	// `ipv4` or `ipv6`.
	AddressFamily pulumi.StringOutput `pulumi:"addressFamily"`
	// Boolean flag to set the default route policy. False by default.
	DefaultRoute pulumi.BoolPtrOutput `pulumi:"defaultRoute"`
	// ID of device.
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// Status of the session - `up` or `down`
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewBgpSession registers a new resource with the given unique name, arguments, and options.
func NewBgpSession(ctx *pulumi.Context,
	name string, args *BgpSessionArgs, opts ...pulumi.ResourceOption) (*BgpSession, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AddressFamily == nil {
		return nil, errors.New("invalid value for required argument 'AddressFamily'")
	}
	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BgpSession
	err := ctx.RegisterResource("equinix:metal/bgpSession:BgpSession", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBgpSession gets an existing BgpSession resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBgpSession(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BgpSessionState, opts ...pulumi.ResourceOption) (*BgpSession, error) {
	var resource BgpSession
	err := ctx.ReadResource("equinix:metal/bgpSession:BgpSession", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BgpSession resources.
type bgpSessionState struct {
	// `ipv4` or `ipv6`.
	AddressFamily *string `pulumi:"addressFamily"`
	// Boolean flag to set the default route policy. False by default.
	DefaultRoute *bool `pulumi:"defaultRoute"`
	// ID of device.
	DeviceId *string `pulumi:"deviceId"`
	// Status of the session - `up` or `down`
	Status *string `pulumi:"status"`
}

type BgpSessionState struct {
	// `ipv4` or `ipv6`.
	AddressFamily pulumi.StringPtrInput
	// Boolean flag to set the default route policy. False by default.
	DefaultRoute pulumi.BoolPtrInput
	// ID of device.
	DeviceId pulumi.StringPtrInput
	// Status of the session - `up` or `down`
	Status pulumi.StringPtrInput
}

func (BgpSessionState) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpSessionState)(nil)).Elem()
}

type bgpSessionArgs struct {
	// `ipv4` or `ipv6`.
	AddressFamily string `pulumi:"addressFamily"`
	// Boolean flag to set the default route policy. False by default.
	DefaultRoute *bool `pulumi:"defaultRoute"`
	// ID of device.
	DeviceId string `pulumi:"deviceId"`
}

// The set of arguments for constructing a BgpSession resource.
type BgpSessionArgs struct {
	// `ipv4` or `ipv6`.
	AddressFamily pulumi.StringInput
	// Boolean flag to set the default route policy. False by default.
	DefaultRoute pulumi.BoolPtrInput
	// ID of device.
	DeviceId pulumi.StringInput
}

func (BgpSessionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpSessionArgs)(nil)).Elem()
}

type BgpSessionInput interface {
	pulumi.Input

	ToBgpSessionOutput() BgpSessionOutput
	ToBgpSessionOutputWithContext(ctx context.Context) BgpSessionOutput
}

func (*BgpSession) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpSession)(nil)).Elem()
}

func (i *BgpSession) ToBgpSessionOutput() BgpSessionOutput {
	return i.ToBgpSessionOutputWithContext(context.Background())
}

func (i *BgpSession) ToBgpSessionOutputWithContext(ctx context.Context) BgpSessionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpSessionOutput)
}

// BgpSessionArrayInput is an input type that accepts BgpSessionArray and BgpSessionArrayOutput values.
// You can construct a concrete instance of `BgpSessionArrayInput` via:
//
//	BgpSessionArray{ BgpSessionArgs{...} }
type BgpSessionArrayInput interface {
	pulumi.Input

	ToBgpSessionArrayOutput() BgpSessionArrayOutput
	ToBgpSessionArrayOutputWithContext(context.Context) BgpSessionArrayOutput
}

type BgpSessionArray []BgpSessionInput

func (BgpSessionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpSession)(nil)).Elem()
}

func (i BgpSessionArray) ToBgpSessionArrayOutput() BgpSessionArrayOutput {
	return i.ToBgpSessionArrayOutputWithContext(context.Background())
}

func (i BgpSessionArray) ToBgpSessionArrayOutputWithContext(ctx context.Context) BgpSessionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpSessionArrayOutput)
}

// BgpSessionMapInput is an input type that accepts BgpSessionMap and BgpSessionMapOutput values.
// You can construct a concrete instance of `BgpSessionMapInput` via:
//
//	BgpSessionMap{ "key": BgpSessionArgs{...} }
type BgpSessionMapInput interface {
	pulumi.Input

	ToBgpSessionMapOutput() BgpSessionMapOutput
	ToBgpSessionMapOutputWithContext(context.Context) BgpSessionMapOutput
}

type BgpSessionMap map[string]BgpSessionInput

func (BgpSessionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpSession)(nil)).Elem()
}

func (i BgpSessionMap) ToBgpSessionMapOutput() BgpSessionMapOutput {
	return i.ToBgpSessionMapOutputWithContext(context.Background())
}

func (i BgpSessionMap) ToBgpSessionMapOutputWithContext(ctx context.Context) BgpSessionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpSessionMapOutput)
}

type BgpSessionOutput struct{ *pulumi.OutputState }

func (BgpSessionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpSession)(nil)).Elem()
}

func (o BgpSessionOutput) ToBgpSessionOutput() BgpSessionOutput {
	return o
}

func (o BgpSessionOutput) ToBgpSessionOutputWithContext(ctx context.Context) BgpSessionOutput {
	return o
}

// `ipv4` or `ipv6`.
func (o BgpSessionOutput) AddressFamily() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpSession) pulumi.StringOutput { return v.AddressFamily }).(pulumi.StringOutput)
}

// Boolean flag to set the default route policy. False by default.
func (o BgpSessionOutput) DefaultRoute() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BgpSession) pulumi.BoolPtrOutput { return v.DefaultRoute }).(pulumi.BoolPtrOutput)
}

// ID of device.
func (o BgpSessionOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpSession) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// Status of the session - `up` or `down`
func (o BgpSessionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpSession) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type BgpSessionArrayOutput struct{ *pulumi.OutputState }

func (BgpSessionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpSession)(nil)).Elem()
}

func (o BgpSessionArrayOutput) ToBgpSessionArrayOutput() BgpSessionArrayOutput {
	return o
}

func (o BgpSessionArrayOutput) ToBgpSessionArrayOutputWithContext(ctx context.Context) BgpSessionArrayOutput {
	return o
}

func (o BgpSessionArrayOutput) Index(i pulumi.IntInput) BgpSessionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BgpSession {
		return vs[0].([]*BgpSession)[vs[1].(int)]
	}).(BgpSessionOutput)
}

type BgpSessionMapOutput struct{ *pulumi.OutputState }

func (BgpSessionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpSession)(nil)).Elem()
}

func (o BgpSessionMapOutput) ToBgpSessionMapOutput() BgpSessionMapOutput {
	return o
}

func (o BgpSessionMapOutput) ToBgpSessionMapOutputWithContext(ctx context.Context) BgpSessionMapOutput {
	return o
}

func (o BgpSessionMapOutput) MapIndex(k pulumi.StringInput) BgpSessionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BgpSession {
		return vs[0].(map[string]*BgpSession)[vs[1].(string)]
	}).(BgpSessionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BgpSessionInput)(nil)).Elem(), &BgpSession{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpSessionArrayInput)(nil)).Elem(), BgpSessionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpSessionMapInput)(nil)).Elem(), BgpSessionMap{})
	pulumi.RegisterOutputType(BgpSessionOutput{})
	pulumi.RegisterOutputType(BgpSessionArrayOutput{})
	pulumi.RegisterOutputType(BgpSessionMapOutput{})
}
