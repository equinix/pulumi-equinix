// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Network
//
// Additional documentation:
// * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm>
// * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks>
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := fabric.NewNetwork(ctx, "newNetwork", &fabric.NetworkArgs{
//				Notifications: fabric.NetworkNotificationArray{
//					&fabric.NetworkNotificationArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("example@equinix.com"),
//							pulumi.String("test1@equinix.com"),
//						},
//						Type: pulumi.String("ALL"),
//					},
//				},
//				Project: &fabric.NetworkProjectArgs{
//					ProjectId: pulumi.String("776847000642406"),
//				},
//				Scope: pulumi.String("GLOBAL"),
//				Type:  pulumi.String("EVPLAN"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Network struct {
	pulumi.CustomResourceState

	// Information on asset change operation
	Change NetworkChangeOutput `pulumi:"change"`
	// A permanent record of asset creation, modification, or deletion
	ChangeLog NetworkChangeLogOutput `pulumi:"changeLog"`
	// Number of connections associated with this network
	ConnectionsCount pulumi.IntOutput `pulumi:"connectionsCount"`
	// Fabric Network URI information
	Href pulumi.StringOutput `pulumi:"href"`
	// Fabric Network location
	Location NetworkLocationOutput `pulumi:"location"`
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications NetworkNotificationArrayOutput `pulumi:"notifications"`
	// Network operation information that is associated with this Fabric Network
	Operation NetworkOperationOutput `pulumi:"operation"`
	// Fabric Network project
	Project NetworkProjectOutput `pulumi:"project"`
	// Fabric Network scope
	Scope pulumi.StringOutput `pulumi:"scope"`
	// Fabric Network overall state
	State pulumi.StringOutput `pulumi:"state"`
	// Supported Network types - EVPLAN, EPLAN, IPWAN
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix-assigned network identifier
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewNetwork registers a new resource with the given unique name, arguments, and options.
func NewNetwork(ctx *pulumi.Context,
	name string, args *NetworkArgs, opts ...pulumi.ResourceOption) (*Network, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Notifications == nil {
		return nil, errors.New("invalid value for required argument 'Notifications'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Network
	err := ctx.RegisterResource("equinix:fabric/network:Network", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetwork gets an existing Network resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkState, opts ...pulumi.ResourceOption) (*Network, error) {
	var resource Network
	err := ctx.ReadResource("equinix:fabric/network:Network", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Network resources.
type networkState struct {
	// Information on asset change operation
	Change *NetworkChange `pulumi:"change"`
	// A permanent record of asset creation, modification, or deletion
	ChangeLog *NetworkChangeLog `pulumi:"changeLog"`
	// Number of connections associated with this network
	ConnectionsCount *int `pulumi:"connectionsCount"`
	// Fabric Network URI information
	Href *string `pulumi:"href"`
	// Fabric Network location
	Location *NetworkLocation `pulumi:"location"`
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications []NetworkNotification `pulumi:"notifications"`
	// Network operation information that is associated with this Fabric Network
	Operation *NetworkOperation `pulumi:"operation"`
	// Fabric Network project
	Project *NetworkProject `pulumi:"project"`
	// Fabric Network scope
	Scope *string `pulumi:"scope"`
	// Fabric Network overall state
	State *string `pulumi:"state"`
	// Supported Network types - EVPLAN, EPLAN, IPWAN
	Type *string `pulumi:"type"`
	// Equinix-assigned network identifier
	Uuid *string `pulumi:"uuid"`
}

type NetworkState struct {
	// Information on asset change operation
	Change NetworkChangePtrInput
	// A permanent record of asset creation, modification, or deletion
	ChangeLog NetworkChangeLogPtrInput
	// Number of connections associated with this network
	ConnectionsCount pulumi.IntPtrInput
	// Fabric Network URI information
	Href pulumi.StringPtrInput
	// Fabric Network location
	Location NetworkLocationPtrInput
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications NetworkNotificationArrayInput
	// Network operation information that is associated with this Fabric Network
	Operation NetworkOperationPtrInput
	// Fabric Network project
	Project NetworkProjectPtrInput
	// Fabric Network scope
	Scope pulumi.StringPtrInput
	// Fabric Network overall state
	State pulumi.StringPtrInput
	// Supported Network types - EVPLAN, EPLAN, IPWAN
	Type pulumi.StringPtrInput
	// Equinix-assigned network identifier
	Uuid pulumi.StringPtrInput
}

func (NetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkState)(nil)).Elem()
}

type networkArgs struct {
	// Fabric Network location
	Location *NetworkLocation `pulumi:"location"`
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications []NetworkNotification `pulumi:"notifications"`
	// Fabric Network project
	Project NetworkProject `pulumi:"project"`
	// Fabric Network scope
	Scope string `pulumi:"scope"`
	// Supported Network types - EVPLAN, EPLAN, IPWAN
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Network resource.
type NetworkArgs struct {
	// Fabric Network location
	Location NetworkLocationPtrInput
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications NetworkNotificationArrayInput
	// Fabric Network project
	Project NetworkProjectInput
	// Fabric Network scope
	Scope pulumi.StringInput
	// Supported Network types - EVPLAN, EPLAN, IPWAN
	Type pulumi.StringInput
}

func (NetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkArgs)(nil)).Elem()
}

type NetworkInput interface {
	pulumi.Input

	ToNetworkOutput() NetworkOutput
	ToNetworkOutputWithContext(ctx context.Context) NetworkOutput
}

func (*Network) ElementType() reflect.Type {
	return reflect.TypeOf((**Network)(nil)).Elem()
}

func (i *Network) ToNetworkOutput() NetworkOutput {
	return i.ToNetworkOutputWithContext(context.Background())
}

func (i *Network) ToNetworkOutputWithContext(ctx context.Context) NetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkOutput)
}

// NetworkArrayInput is an input type that accepts NetworkArray and NetworkArrayOutput values.
// You can construct a concrete instance of `NetworkArrayInput` via:
//
//	NetworkArray{ NetworkArgs{...} }
type NetworkArrayInput interface {
	pulumi.Input

	ToNetworkArrayOutput() NetworkArrayOutput
	ToNetworkArrayOutputWithContext(context.Context) NetworkArrayOutput
}

type NetworkArray []NetworkInput

func (NetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Network)(nil)).Elem()
}

func (i NetworkArray) ToNetworkArrayOutput() NetworkArrayOutput {
	return i.ToNetworkArrayOutputWithContext(context.Background())
}

func (i NetworkArray) ToNetworkArrayOutputWithContext(ctx context.Context) NetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkArrayOutput)
}

// NetworkMapInput is an input type that accepts NetworkMap and NetworkMapOutput values.
// You can construct a concrete instance of `NetworkMapInput` via:
//
//	NetworkMap{ "key": NetworkArgs{...} }
type NetworkMapInput interface {
	pulumi.Input

	ToNetworkMapOutput() NetworkMapOutput
	ToNetworkMapOutputWithContext(context.Context) NetworkMapOutput
}

type NetworkMap map[string]NetworkInput

func (NetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Network)(nil)).Elem()
}

func (i NetworkMap) ToNetworkMapOutput() NetworkMapOutput {
	return i.ToNetworkMapOutputWithContext(context.Background())
}

func (i NetworkMap) ToNetworkMapOutputWithContext(ctx context.Context) NetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkMapOutput)
}

type NetworkOutput struct{ *pulumi.OutputState }

func (NetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Network)(nil)).Elem()
}

func (o NetworkOutput) ToNetworkOutput() NetworkOutput {
	return o
}

func (o NetworkOutput) ToNetworkOutputWithContext(ctx context.Context) NetworkOutput {
	return o
}

// Information on asset change operation
func (o NetworkOutput) Change() NetworkChangeOutput {
	return o.ApplyT(func(v *Network) NetworkChangeOutput { return v.Change }).(NetworkChangeOutput)
}

// A permanent record of asset creation, modification, or deletion
func (o NetworkOutput) ChangeLog() NetworkChangeLogOutput {
	return o.ApplyT(func(v *Network) NetworkChangeLogOutput { return v.ChangeLog }).(NetworkChangeLogOutput)
}

// Number of connections associated with this network
func (o NetworkOutput) ConnectionsCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Network) pulumi.IntOutput { return v.ConnectionsCount }).(pulumi.IntOutput)
}

// Fabric Network URI information
func (o NetworkOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Fabric Network location
func (o NetworkOutput) Location() NetworkLocationOutput {
	return o.ApplyT(func(v *Network) NetworkLocationOutput { return v.Location }).(NetworkLocationOutput)
}

// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o NetworkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on Fabric Network configuration or status changes
func (o NetworkOutput) Notifications() NetworkNotificationArrayOutput {
	return o.ApplyT(func(v *Network) NetworkNotificationArrayOutput { return v.Notifications }).(NetworkNotificationArrayOutput)
}

// Network operation information that is associated with this Fabric Network
func (o NetworkOutput) Operation() NetworkOperationOutput {
	return o.ApplyT(func(v *Network) NetworkOperationOutput { return v.Operation }).(NetworkOperationOutput)
}

// Fabric Network project
func (o NetworkOutput) Project() NetworkProjectOutput {
	return o.ApplyT(func(v *Network) NetworkProjectOutput { return v.Project }).(NetworkProjectOutput)
}

// Fabric Network scope
func (o NetworkOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// Fabric Network overall state
func (o NetworkOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Supported Network types - EVPLAN, EPLAN, IPWAN
func (o NetworkOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned network identifier
func (o NetworkOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type NetworkArrayOutput struct{ *pulumi.OutputState }

func (NetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Network)(nil)).Elem()
}

func (o NetworkArrayOutput) ToNetworkArrayOutput() NetworkArrayOutput {
	return o
}

func (o NetworkArrayOutput) ToNetworkArrayOutputWithContext(ctx context.Context) NetworkArrayOutput {
	return o
}

func (o NetworkArrayOutput) Index(i pulumi.IntInput) NetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Network {
		return vs[0].([]*Network)[vs[1].(int)]
	}).(NetworkOutput)
}

type NetworkMapOutput struct{ *pulumi.OutputState }

func (NetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Network)(nil)).Elem()
}

func (o NetworkMapOutput) ToNetworkMapOutput() NetworkMapOutput {
	return o
}

func (o NetworkMapOutput) ToNetworkMapOutputWithContext(ctx context.Context) NetworkMapOutput {
	return o
}

func (o NetworkMapOutput) MapIndex(k pulumi.StringInput) NetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Network {
		return vs[0].(map[string]*Network)[vs[1].(string)]
	}).(NetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkInput)(nil)).Elem(), &Network{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkArrayInput)(nil)).Elem(), NetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkMapInput)(nil)).Elem(), NetworkMap{})
	pulumi.RegisterOutputType(NetworkOutput{})
	pulumi.RegisterOutputType(NetworkArrayOutput{})
	pulumi.RegisterOutputType(NetworkMapOutput{})
}
