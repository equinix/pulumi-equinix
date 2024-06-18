// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Fabric Cloud Router for a given UUID
//
// Additional documentation:
// * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks>
// * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers>
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
//			cloudRouterDataName, err := fabric.LookupCloudRouter(ctx, &fabric.LookupCloudRouterArgs{
//				Uuid: "<uuid_of_cloud_router>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", cloudRouterDataName.Id)
//			ctx.Export("name", cloudRouterDataName.Name)
//			ctx.Export("accountNumber", cloudRouterDataName.Accounts[0].AccountNumber)
//			ctx.Export("equinixAsn", cloudRouterDataName.EquinixAsn)
//			ctx.Export("metroCode", cloudRouterDataName.Locations[0].MetroCode)
//			ctx.Export("metroName", cloudRouterDataName.Locations[0].MetroName)
//			ctx.Export("region", cloudRouterDataName.Locations[0].Region)
//			ctx.Export("packageCode", cloudRouterDataName.Packages[0].Code)
//			ctx.Export("projectId", cloudRouterDataName.Projects[0].ProjectId)
//			ctx.Export("type", cloudRouterDataName.Type)
//			return nil
//		})
//	}
//
// ```
func LookupCloudRouter(ctx *pulumi.Context, args *LookupCloudRouterArgs, opts ...pulumi.InvokeOption) (*LookupCloudRouterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudRouterResult
	err := ctx.Invoke("equinix:fabric/getCloudRouter:getCloudRouter", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudRouter.
type LookupCloudRouterArgs struct {
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getCloudRouter.
type LookupCloudRouterResult struct {
	// Customer account information that is associated with this Fabric Cloud Router
	Accounts []GetCloudRouterAccount `pulumi:"accounts"`
	// Number of IPv4 BGP routes in use (including non-distinct prefixes)
	BgpIpv4RoutesCount int `pulumi:"bgpIpv4RoutesCount"`
	// Number of IPv6 BGP routes in use (including non-distinct prefixes)
	BgpIpv6RoutesCount int `pulumi:"bgpIpv6RoutesCount"`
	// Captures Fabric Cloud Router lifecycle change information
	ChangeLogs []GetCloudRouterChangeLog `pulumi:"changeLogs"`
	// Number of connections associated with this Fabric Cloud Router instance
	ConnectionsCount int `pulumi:"connectionsCount"`
	// Customer-provided Fabric Cloud Router description
	Description string `pulumi:"description"`
	// Number of distinct IPv4 routes
	DistinctIpv4PrefixesCount int `pulumi:"distinctIpv4PrefixesCount"`
	// Number of distinct IPv6 routes
	DistinctIpv6PrefixesCount int `pulumi:"distinctIpv6PrefixesCount"`
	// Equinix ASN
	EquinixAsn int `pulumi:"equinixAsn"`
	// Fabric Cloud Router URI information
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Fabric Cloud Router location
	Locations []GetCloudRouterLocation `pulumi:"locations"`
	// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name string `pulumi:"name"`
	// Preferences for notifications on Fabric Cloud Router configuration or status changes
	Notifications []GetCloudRouterNotification `pulumi:"notifications"`
	// Order information related to this Fabric Cloud Router
	Orders []GetCloudRouterOrder `pulumi:"orders"`
	// Fabric Cloud Router Package Type
	Packages []GetCloudRouterPackage `pulumi:"packages"`
	// Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
	Projects []GetCloudRouterProject `pulumi:"projects"`
	// Fabric Cloud Router overall state
	State string `pulumi:"state"`
	// Defines the FCR type like; XF_ROUTER
	Type string `pulumi:"type"`
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid string `pulumi:"uuid"`
}

func LookupCloudRouterOutput(ctx *pulumi.Context, args LookupCloudRouterOutputArgs, opts ...pulumi.InvokeOption) LookupCloudRouterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCloudRouterResult, error) {
			args := v.(LookupCloudRouterArgs)
			r, err := LookupCloudRouter(ctx, &args, opts...)
			var s LookupCloudRouterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCloudRouterResultOutput)
}

// A collection of arguments for invoking getCloudRouter.
type LookupCloudRouterOutputArgs struct {
	// Equinix-assigned Fabric Cloud Router identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (LookupCloudRouterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudRouterArgs)(nil)).Elem()
}

// A collection of values returned by getCloudRouter.
type LookupCloudRouterResultOutput struct{ *pulumi.OutputState }

func (LookupCloudRouterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudRouterResult)(nil)).Elem()
}

func (o LookupCloudRouterResultOutput) ToLookupCloudRouterResultOutput() LookupCloudRouterResultOutput {
	return o
}

func (o LookupCloudRouterResultOutput) ToLookupCloudRouterResultOutputWithContext(ctx context.Context) LookupCloudRouterResultOutput {
	return o
}

// Customer account information that is associated with this Fabric Cloud Router
func (o LookupCloudRouterResultOutput) Accounts() GetCloudRouterAccountArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterAccount { return v.Accounts }).(GetCloudRouterAccountArrayOutput)
}

// Number of IPv4 BGP routes in use (including non-distinct prefixes)
func (o LookupCloudRouterResultOutput) BgpIpv4RoutesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.BgpIpv4RoutesCount }).(pulumi.IntOutput)
}

// Number of IPv6 BGP routes in use (including non-distinct prefixes)
func (o LookupCloudRouterResultOutput) BgpIpv6RoutesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.BgpIpv6RoutesCount }).(pulumi.IntOutput)
}

// Captures Fabric Cloud Router lifecycle change information
func (o LookupCloudRouterResultOutput) ChangeLogs() GetCloudRouterChangeLogArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterChangeLog { return v.ChangeLogs }).(GetCloudRouterChangeLogArrayOutput)
}

// Number of connections associated with this Fabric Cloud Router instance
func (o LookupCloudRouterResultOutput) ConnectionsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.ConnectionsCount }).(pulumi.IntOutput)
}

// Customer-provided Fabric Cloud Router description
func (o LookupCloudRouterResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Description }).(pulumi.StringOutput)
}

// Number of distinct IPv4 routes
func (o LookupCloudRouterResultOutput) DistinctIpv4PrefixesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.DistinctIpv4PrefixesCount }).(pulumi.IntOutput)
}

// Number of distinct IPv6 routes
func (o LookupCloudRouterResultOutput) DistinctIpv6PrefixesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.DistinctIpv6PrefixesCount }).(pulumi.IntOutput)
}

// Equinix ASN
func (o LookupCloudRouterResultOutput) EquinixAsn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) int { return v.EquinixAsn }).(pulumi.IntOutput)
}

// Fabric Cloud Router URI information
func (o LookupCloudRouterResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCloudRouterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Fabric Cloud Router location
func (o LookupCloudRouterResultOutput) Locations() GetCloudRouterLocationArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterLocation { return v.Locations }).(GetCloudRouterLocationArrayOutput)
}

// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o LookupCloudRouterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on Fabric Cloud Router configuration or status changes
func (o LookupCloudRouterResultOutput) Notifications() GetCloudRouterNotificationArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterNotification { return v.Notifications }).(GetCloudRouterNotificationArrayOutput)
}

// Order information related to this Fabric Cloud Router
func (o LookupCloudRouterResultOutput) Orders() GetCloudRouterOrderArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterOrder { return v.Orders }).(GetCloudRouterOrderArrayOutput)
}

// Fabric Cloud Router Package Type
func (o LookupCloudRouterResultOutput) Packages() GetCloudRouterPackageArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterPackage { return v.Packages }).(GetCloudRouterPackageArrayOutput)
}

// Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
func (o LookupCloudRouterResultOutput) Projects() GetCloudRouterProjectArrayOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) []GetCloudRouterProject { return v.Projects }).(GetCloudRouterProjectArrayOutput)
}

// Fabric Cloud Router overall state
func (o LookupCloudRouterResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.State }).(pulumi.StringOutput)
}

// Defines the FCR type like; XF_ROUTER
func (o LookupCloudRouterResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned Fabric Cloud Router identifier
func (o LookupCloudRouterResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudRouterResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudRouterResultOutput{})
}
