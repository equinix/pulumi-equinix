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

// Fabric V4 API compatible resource allows creation and management of [Equinix Fabric Cloud Router](https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks).
//
// Additional documentation:
// * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks>
// * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers>
//
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
//				Project: &fabric.CloudRouterProjectArgs{
//					ProjectId: pulumi.String("995072000433550"),
//	            },
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
	Account CloudRouterAccountOutput `pulumi:"account"`
	// Number of IPv4 BGP routes in use (including non-distinct prefixes)
	BgpIpv4RoutesCount pulumi.IntOutput `pulumi:"bgpIpv4RoutesCount"`
	// Number of IPv6 BGP routes in use (including non-distinct prefixes)
	BgpIpv6RoutesCount pulumi.IntOutput `pulumi:"bgpIpv6RoutesCount"`
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs CloudRouterChangeLogArrayOutput `pulumi:"changeLogs"`
	// Number of connections associated with this Fabric Cloud Router instance
	ConnectionsCount pulumi.IntOutput `pulumi:"connectionsCount"`
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Number of distinct IPv4 routes
	DistinctIpv4PrefixesCount pulumi.IntOutput `pulumi:"distinctIpv4PrefixesCount"`
	// Number of distinct IPv6 routes
	DistinctIpv6PrefixesCount pulumi.IntOutput `pulumi:"distinctIpv6PrefixesCount"`
	// Equinix ASN
	EquinixAsn pulumi.IntOutput `pulumi:"equinixAsn"`
	// Fabric Cloud Router URI information
	Href pulumi.StringOutput `pulumi:"href"`
	// Fabric Cloud Router location
	Location CloudRouterLocationOutput `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayOutput `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderOutput `pulumi:"order"`
	// Fabric Cloud Router Package Type
	Package CloudRouterPackageOutput `pulumi:"package"`
	// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Project CloudRouterProjectOutput `pulumi:"project"`
	// Fabric Cloud Router overall state
	State pulumi.StringOutput `pulumi:"state"`
	// Defines the FCR type like; XF_ROUTER
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewCloudRouter registers a new resource with the given unique name, arguments, and options.
func NewCloudRouter(ctx *pulumi.Context,
	name string, args *CloudRouterArgs, opts ...pulumi.ResourceOption) (*CloudRouter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Account == nil {
		return nil, errors.New("invalid value for required argument 'Account'")
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
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
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
	// Number of IPv4 BGP routes in use (including non-distinct prefixes)
	BgpIpv4RoutesCount *int `pulumi:"bgpIpv4RoutesCount"`
	// Number of IPv6 BGP routes in use (including non-distinct prefixes)
	BgpIpv6RoutesCount *int `pulumi:"bgpIpv6RoutesCount"`
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs []CloudRouterChangeLog `pulumi:"changeLogs"`
	// Number of connections associated with this Fabric Cloud Router instance
	ConnectionsCount *int `pulumi:"connectionsCount"`
	// Customer-provided Fabric Cloud Router description
	Description *string `pulumi:"description"`
	// Number of distinct IPv4 routes
	DistinctIpv4PrefixesCount *int `pulumi:"distinctIpv4PrefixesCount"`
	// Number of distinct IPv6 routes
	DistinctIpv6PrefixesCount *int `pulumi:"distinctIpv6PrefixesCount"`
	// Equinix ASN
	EquinixAsn *int `pulumi:"equinixAsn"`
	// Fabric Cloud Router URI information
	Href *string `pulumi:"href"`
	// Fabric Cloud Router location
	Location *CloudRouterLocation `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications []CloudRouterNotification `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order *CloudRouterOrder `pulumi:"order"`
	// Fabric Cloud Router Package Type
	Package *CloudRouterPackage `pulumi:"package"`
	// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Project *CloudRouterProject `pulumi:"project"`
	// Fabric Cloud Router overall state
	State *string `pulumi:"state"`
	// Defines the FCR type like; XF_ROUTER
	Type *string `pulumi:"type"`
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid *string `pulumi:"uuid"`
}

type CloudRouterState struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccountPtrInput
	// Number of IPv4 BGP routes in use (including non-distinct prefixes)
	BgpIpv4RoutesCount pulumi.IntPtrInput
	// Number of IPv6 BGP routes in use (including non-distinct prefixes)
	BgpIpv6RoutesCount pulumi.IntPtrInput
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs CloudRouterChangeLogArrayInput
	// Number of connections associated with this Fabric Cloud Router instance
	ConnectionsCount pulumi.IntPtrInput
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrInput
	// Number of distinct IPv4 routes
	DistinctIpv4PrefixesCount pulumi.IntPtrInput
	// Number of distinct IPv6 routes
	DistinctIpv6PrefixesCount pulumi.IntPtrInput
	// Equinix ASN
	EquinixAsn pulumi.IntPtrInput
	// Fabric Cloud Router URI information
	Href pulumi.StringPtrInput
	// Fabric Cloud Router location
	Location CloudRouterLocationPtrInput
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayInput
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderPtrInput
	// Fabric Cloud Router Package Type
	Package CloudRouterPackagePtrInput
	// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Project CloudRouterProjectPtrInput
	// Fabric Cloud Router overall state
	State pulumi.StringPtrInput
	// Defines the FCR type like; XF_ROUTER
	Type pulumi.StringPtrInput
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid pulumi.StringPtrInput
}

func (CloudRouterState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudRouterState)(nil)).Elem()
}

type cloudRouterArgs struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccount `pulumi:"account"`
	// Customer-provided Fabric Cloud Router description
	Description *string `pulumi:"description"`
	// Fabric Cloud Router URI information
	Href *string `pulumi:"href"`
	// Fabric Cloud Router location
	Location CloudRouterLocation `pulumi:"location"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications []CloudRouterNotification `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Order *CloudRouterOrder `pulumi:"order"`
	// Fabric Cloud Router Package Type
	Package CloudRouterPackage `pulumi:"package"`
	// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Project CloudRouterProject `pulumi:"project"`
	// Defines the FCR type like; XF_ROUTER
	Type string `pulumi:"type"`
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid *string `pulumi:"uuid"`
}

// The set of arguments for constructing a CloudRouter resource.
type CloudRouterArgs struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Account CloudRouterAccountInput
	// Customer-provided Fabric Cloud Router description
	Description pulumi.StringPtrInput
	// Fabric Cloud Router URI information
	Href pulumi.StringPtrInput
	// Fabric Cloud Router location
	Location CloudRouterLocationInput
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications CloudRouterNotificationArrayInput
	// Order information related to this Fabric Cloud Router
	Order CloudRouterOrderPtrInput
	// Fabric Cloud Router Package Type
	Package CloudRouterPackageInput
	// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Project CloudRouterProjectInput
	// Defines the FCR type like; XF_ROUTER
	Type pulumi.StringInput
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid pulumi.StringPtrInput
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

// Customer account information that is associated with this Fabric Cloud Router
func (o CloudRouterOutput) Account() CloudRouterAccountOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterAccountOutput { return v.Account }).(CloudRouterAccountOutput)
}

// Number of IPv4 BGP routes in use (including non-distinct prefixes)
func (o CloudRouterOutput) BgpIpv4RoutesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.BgpIpv4RoutesCount }).(pulumi.IntOutput)
}

// Number of IPv6 BGP routes in use (including non-distinct prefixes)
func (o CloudRouterOutput) BgpIpv6RoutesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.BgpIpv6RoutesCount }).(pulumi.IntOutput)
}

// Captures Fabric Cloud Router lifecycle change information
func (o CloudRouterOutput) ChangeLogs() CloudRouterChangeLogArrayOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterChangeLogArrayOutput { return v.ChangeLogs }).(CloudRouterChangeLogArrayOutput)
}

// Number of connections associated with this Fabric Cloud Router instance
func (o CloudRouterOutput) ConnectionsCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.ConnectionsCount }).(pulumi.IntOutput)
}

// Customer-provided Fabric Cloud Router description
func (o CloudRouterOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Number of distinct IPv4 routes
func (o CloudRouterOutput) DistinctIpv4PrefixesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.DistinctIpv4PrefixesCount }).(pulumi.IntOutput)
}

// Number of distinct IPv6 routes
func (o CloudRouterOutput) DistinctIpv6PrefixesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.DistinctIpv6PrefixesCount }).(pulumi.IntOutput)
}

// Equinix ASN
func (o CloudRouterOutput) EquinixAsn() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.IntOutput { return v.EquinixAsn }).(pulumi.IntOutput)
}

// Fabric Cloud Router URI information
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
func (o CloudRouterOutput) Order() CloudRouterOrderOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterOrderOutput { return v.Order }).(CloudRouterOrderOutput)
}

// Fabric Cloud Router Package Type
func (o CloudRouterOutput) Package() CloudRouterPackageOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterPackageOutput { return v.Package }).(CloudRouterPackageOutput)
}

// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
func (o CloudRouterOutput) Project() CloudRouterProjectOutput {
	return o.ApplyT(func(v *CloudRouter) CloudRouterProjectOutput { return v.Project }).(CloudRouterProjectOutput)
}

// Fabric Cloud Router overall state
func (o CloudRouterOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Defines the FCR type like; XF_ROUTER
func (o CloudRouterOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned Fabric Cloud Router identifier
func (o CloudRouterOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudRouter) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
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
