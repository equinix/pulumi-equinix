// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"errors"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			metro := "FR"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			accountNum := cfg.RequireInt("accountNum")
//			router, err := fabric.NewCloudRouter(ctx, "router", &fabric.CloudRouterArgs{
//				Name: pulumi.String("My-Fabric-Cloud-Router"),
//				Type: pulumi.String("XF_ROUTER"),
//				Location: &fabric.CloudRouterLocationArgs{
//					MetroCode: pulumi.String(metro),
//				},
//				Package: &fabric.CloudRouterPackageArgs{
//					Code: pulumi.String("BASIC"),
//				},
//				Notifications: fabric.CloudRouterNotificationArray{
//					&fabric.CloudRouterNotificationArgs{
//						Type: pulumi.String("ALL"),
//						Emails: pulumi.StringArray{
//							pulumi.String("example@equinix.com"),
//						},
//					},
//				},
//				Account: &fabric.CloudRouterAccountArgs{
//					AccountNumber: pulumi.Int(272010),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("routerId", router.ID())
//			return nil
//		})
//	}
//
// ```
type CloudRouter struct {
	pulumi.CustomResourceState

	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccountPtrOutput `pulumi:"account"`
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs CloudRouterChangeLogArrayOutput `pulumi:"changeLogs"`
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Equinix ASN
	EquinixAsn pulumi.IntOutput `pulumi:"equinixAsn"`
	// Unique Resource URL
	Href pulumi.StringOutput `pulumi:"href"`
	// Fabric Cloud Router location
	Location CloudRouterLocationOutput `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayOutput `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderPtrOutput `pulumi:"order"`
	// Fabric Cloud Router package
	Package CloudRouterPackageOutput `pulumi:"package"`
	// Fabric Cloud Router project
	Project CloudRouterProjectPtrOutput `pulumi:"project"`
	// Fabric Cloud Router overall state
	State pulumi.StringOutput `pulumi:"state"`
	// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewCloudRouter registers a new resource with the given unique name, arguments, and options.
func NewCloudRouter(ctx *pulumi.Context,
	name string, args *CloudRouterArgs, opts ...pulumi.ResourceOption) (*CloudRouter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Notifications == nil {
		return nil, errors.New("invalid value for required argument 'Notifications'")
	}
	if args.Package == nil {
		return nil, errors.New("invalid value for required argument 'Package'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudRouter
	err := ctx.RegisterResource("equinix:fabric/cloudRouter:CloudRouter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudRouter gets an existing CloudRouter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudRouter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudRouterState, opts ...pulumi.ResourceOption) (*CloudRouter, error) {
	var resource CloudRouter
	err := ctx.ReadResource("equinix:fabric/cloudRouter:CloudRouter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudRouter resources.
type cloudRouterState struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account *CloudRouterAccount `pulumi:"account"`
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs []CloudRouterChangeLog `pulumi:"changeLogs"`
	// Customer-provided Fabric Cloud Router description
	Description *string `pulumi:"description"`
	// Equinix ASN
	EquinixAsn *int `pulumi:"equinixAsn"`
	// Unique Resource URL
	Href *string `pulumi:"href"`
	// Fabric Cloud Router location
	Location *CloudRouterLocation `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications []CloudRouterNotification `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order *CloudRouterOrder `pulumi:"order"`
	// Fabric Cloud Router package
	Package *CloudRouterPackage `pulumi:"package"`
	// Fabric Cloud Router project
	Project *CloudRouterProject `pulumi:"project"`
	// Fabric Cloud Router overall state
	State *string `pulumi:"state"`
	// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
	Type *string `pulumi:"type"`
}

type CloudRouterState struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccountPtrInput
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs CloudRouterChangeLogArrayInput
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrInput
	// Equinix ASN
	EquinixAsn pulumi.IntPtrInput
	// Unique Resource URL
	Href pulumi.StringPtrInput
	// Fabric Cloud Router location
	Location CloudRouterLocationPtrInput
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayInput
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderPtrInput
	// Fabric Cloud Router package
	Package CloudRouterPackagePtrInput
	// Fabric Cloud Router project
	Project CloudRouterProjectPtrInput
	// Fabric Cloud Router overall state
	State pulumi.StringPtrInput
	// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
	Type pulumi.StringPtrInput
}

func (CloudRouterState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudRouterState)(nil)).Elem()
}

type cloudRouterArgs struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account *CloudRouterAccount `pulumi:"account"`
	// Customer-provided Fabric Cloud Router description
	Description *string `pulumi:"description"`
	// Fabric Cloud Router location
	Location CloudRouterLocation `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications []CloudRouterNotification `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order *CloudRouterOrder `pulumi:"order"`
	// Fabric Cloud Router package
	Package CloudRouterPackage `pulumi:"package"`
	// Fabric Cloud Router project
	Project *CloudRouterProject `pulumi:"project"`
	// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a CloudRouter resource.
type CloudRouterArgs struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccountPtrInput
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrInput
	// Fabric Cloud Router location
	Location CloudRouterLocationInput
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayInput
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderPtrInput
	// Fabric Cloud Router package
	Package CloudRouterPackageInput
	// Fabric Cloud Router project
	Project CloudRouterProjectPtrInput
	// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
	Type pulumi.StringInput
}

func (CloudRouterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudRouterArgs)(nil)).Elem()
}

type CloudRouterInput interface {
	pulumi.Input

	ToCloudRouterOutput() CloudRouterOutput
	ToCloudRouterOutputWithContext(ctx context.Context) CloudRouterOutput
}

func (*CloudRouter) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudRouter)(nil)).Elem()
}

func (i *CloudRouter) ToCloudRouterOutput() CloudRouterOutput {
	return i.ToCloudRouterOutputWithContext(context.Background())
}

func (i *CloudRouter) ToCloudRouterOutputWithContext(ctx context.Context) CloudRouterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudRouterOutput)
}

func (i *CloudRouter) ToOutput(ctx context.Context) pulumix.Output[*CloudRouter] {
	return pulumix.Output[*CloudRouter]{
		OutputState: i.ToCloudRouterOutputWithContext(ctx).OutputState,
	}
}

// CloudRouterArrayInput is an input type that accepts CloudRouterArray and CloudRouterArrayOutput values.
// You can construct a concrete instance of `CloudRouterArrayInput` via:
//
//	CloudRouterArray{ CloudRouterArgs{...} }
type CloudRouterArrayInput interface {
	pulumi.Input

	ToCloudRouterArrayOutput() CloudRouterArrayOutput
	ToCloudRouterArrayOutputWithContext(context.Context) CloudRouterArrayOutput
}

type CloudRouterArray []CloudRouterInput

func (CloudRouterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudRouter)(nil)).Elem()
}

func (i CloudRouterArray) ToCloudRouterArrayOutput() CloudRouterArrayOutput {
	return i.ToCloudRouterArrayOutputWithContext(context.Background())
}

func (i CloudRouterArray) ToCloudRouterArrayOutputWithContext(ctx context.Context) CloudRouterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudRouterArrayOutput)
}

func (i CloudRouterArray) ToOutput(ctx context.Context) pulumix.Output[[]*CloudRouter] {
	return pulumix.Output[[]*CloudRouter]{
		OutputState: i.ToCloudRouterArrayOutputWithContext(ctx).OutputState,
	}
}

// CloudRouterMapInput is an input type that accepts CloudRouterMap and CloudRouterMapOutput values.
// You can construct a concrete instance of `CloudRouterMapInput` via:
//
//	CloudRouterMap{ "key": CloudRouterArgs{...} }
type CloudRouterMapInput interface {
	pulumi.Input

	ToCloudRouterMapOutput() CloudRouterMapOutput
	ToCloudRouterMapOutputWithContext(context.Context) CloudRouterMapOutput
}

type CloudRouterMap map[string]CloudRouterInput

func (CloudRouterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudRouter)(nil)).Elem()
}

func (i CloudRouterMap) ToCloudRouterMapOutput() CloudRouterMapOutput {
	return i.ToCloudRouterMapOutputWithContext(context.Background())
}

func (i CloudRouterMap) ToCloudRouterMapOutputWithContext(ctx context.Context) CloudRouterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudRouterMapOutput)
}

func (i CloudRouterMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudRouter] {
	return pulumix.Output[map[string]*CloudRouter]{
		OutputState: i.ToCloudRouterMapOutputWithContext(ctx).OutputState,
	}
}

type CloudRouterOutput struct{ *pulumi.OutputState }

func (CloudRouterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudRouter)(nil)).Elem()
}

func (o CloudRouterOutput) ToCloudRouterOutput() CloudRouterOutput {
	return o
}

func (o CloudRouterOutput) ToCloudRouterOutputWithContext(ctx context.Context) CloudRouterOutput {
	return o
}

func (o CloudRouterOutput) ToOutput(ctx context.Context) pulumix.Output[*CloudRouter] {
	return pulumix.Output[*CloudRouter]{
		OutputState: o.OutputState,
	}
}

// Customer account information that is associated with this Fabric Cloud Router
func (o CloudRouterOutput) Account() CloudRouterAccountPtrOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterAccountPtrOutput { return v.Account }).(CloudRouterAccountPtrOutput)
}

// Captures Fabric Cloud Router lifecycle change information
func (o CloudRouterOutput) ChangeLogs() CloudRouterChangeLogArrayOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterChangeLogArrayOutput { return v.ChangeLogs }).(CloudRouterChangeLogArrayOutput)
}

// Customer-provided Fabric Cloud Router description
func (o CloudRouterOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Equinix ASN
func (o CloudRouterOutput) EquinixAsn() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.EquinixAsn }).(pulumi.IntOutput)
}

// Unique Resource URL
func (o CloudRouterOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Fabric Cloud Router location
func (o CloudRouterOutput) Location() CloudRouterLocationOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterLocationOutput { return v.Location }).(CloudRouterLocationOutput)
}

// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o CloudRouterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on Fabric Cloud Router configuration or status changes
func (o CloudRouterOutput) Notifications() CloudRouterNotificationArrayOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterNotificationArrayOutput { return v.Notifications }).(CloudRouterNotificationArrayOutput)
}

// Order information related to this Fabric Cloud Router
func (o CloudRouterOutput) Order() CloudRouterOrderPtrOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterOrderPtrOutput { return v.Order }).(CloudRouterOrderPtrOutput)
}

// Fabric Cloud Router package
func (o CloudRouterOutput) Package() CloudRouterPackageOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterPackageOutput { return v.Package }).(CloudRouterPackageOutput)
}

// Fabric Cloud Router project
func (o CloudRouterOutput) Project() CloudRouterProjectPtrOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterProjectPtrOutput { return v.Project }).(CloudRouterProjectPtrOutput)
}

// Fabric Cloud Router overall state
func (o CloudRouterOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
func (o CloudRouterOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type CloudRouterArrayOutput struct{ *pulumi.OutputState }

func (CloudRouterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudRouter)(nil)).Elem()
}

func (o CloudRouterArrayOutput) ToCloudRouterArrayOutput() CloudRouterArrayOutput {
	return o
}

func (o CloudRouterArrayOutput) ToCloudRouterArrayOutputWithContext(ctx context.Context) CloudRouterArrayOutput {
	return o
}

func (o CloudRouterArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CloudRouter] {
	return pulumix.Output[[]*CloudRouter]{
		OutputState: o.OutputState,
	}
}

func (o CloudRouterArrayOutput) Index(i pulumi.IntInput) CloudRouterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudRouter {
		return vs[0].([]*CloudRouter)[vs[1].(int)]
	}).(CloudRouterOutput)
}

type CloudRouterMapOutput struct{ *pulumi.OutputState }

func (CloudRouterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudRouter)(nil)).Elem()
}

func (o CloudRouterMapOutput) ToCloudRouterMapOutput() CloudRouterMapOutput {
	return o
}

func (o CloudRouterMapOutput) ToCloudRouterMapOutputWithContext(ctx context.Context) CloudRouterMapOutput {
	return o
}

func (o CloudRouterMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudRouter] {
	return pulumix.Output[map[string]*CloudRouter]{
		OutputState: o.OutputState,
	}
}

func (o CloudRouterMapOutput) MapIndex(k pulumi.StringInput) CloudRouterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudRouter {
		return vs[0].(map[string]*CloudRouter)[vs[1].(string)]
	}).(CloudRouterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudRouterInput)(nil)).Elem(), &CloudRouter{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudRouterArrayInput)(nil)).Elem(), CloudRouterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudRouterMapInput)(nil)).Elem(), CloudRouterMap{})
	pulumi.RegisterOutputType(CloudRouterOutput{})
	pulumi.RegisterOutputType(CloudRouterArrayOutput{})
	pulumi.RegisterOutputType(CloudRouterMapOutput{})
}