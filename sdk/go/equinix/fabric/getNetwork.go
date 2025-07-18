// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
//
// Additional documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
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
//			networkDataName, err := fabric.LookupNetwork(ctx, &fabric.LookupNetworkArgs{
//				Uuid: "<uuid_of_network>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", networkDataName.Id)
//			ctx.Export("name", networkDataName.Name)
//			ctx.Export("scope", networkDataName.Scope)
//			ctx.Export("type", networkDataName.Type)
//			ctx.Export("region", pulumi.StringArray("TODO: For expression"))
//			return nil
//		})
//	}
//
// ```
func LookupNetwork(ctx *pulumi.Context, args *LookupNetworkArgs, opts ...pulumi.InvokeOption) (*LookupNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkResult
	err := ctx.Invoke("equinix:fabric/getNetwork:getNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkArgs struct {
	// Equinix-assigned network identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getNetwork.
type LookupNetworkResult struct {
	// Information on asset change operation
	Change GetNetworkChange `pulumi:"change"`
	// A permanent record of asset creation, modification, or deletion
	ChangeLog GetNetworkChangeLog `pulumi:"changeLog"`
	// Number of connections associated with this network
	ConnectionsCount int `pulumi:"connectionsCount"`
	// Fabric Network URI information
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Fabric Network location
	Locations []GetNetworkLocation `pulumi:"locations"`
	// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name string `pulumi:"name"`
	// Preferences for notifications on Fabric Network configuration or status changes
	Notifications []GetNetworkNotification `pulumi:"notifications"`
	// Network operation information that is associated with this Fabric Network
	Operation GetNetworkOperation `pulumi:"operation"`
	// Fabric Network project
	Project GetNetworkProject `pulumi:"project"`
	// Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
	Scope string `pulumi:"scope"`
	// Fabric Network overall state
	State string `pulumi:"state"`
	// Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
	Type string `pulumi:"type"`
	// Equinix-assigned network identifier
	Uuid string `pulumi:"uuid"`
}

func LookupNetworkOutput(ctx *pulumi.Context, args LookupNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkResultOutput, error) {
			args := v.(LookupNetworkArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getNetwork:getNetwork", args, LookupNetworkResultOutput{}, options).(LookupNetworkResultOutput), nil
		}).(LookupNetworkResultOutput)
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkOutputArgs struct {
	// Equinix-assigned network identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (LookupNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getNetwork.
type LookupNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkResult)(nil)).Elem()
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutput() LookupNetworkResultOutput {
	return o
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutputWithContext(ctx context.Context) LookupNetworkResultOutput {
	return o
}

// Information on asset change operation
func (o LookupNetworkResultOutput) Change() GetNetworkChangeOutput {
	return o.ApplyT(func(v LookupNetworkResult) GetNetworkChange { return v.Change }).(GetNetworkChangeOutput)
}

// A permanent record of asset creation, modification, or deletion
func (o LookupNetworkResultOutput) ChangeLog() GetNetworkChangeLogOutput {
	return o.ApplyT(func(v LookupNetworkResult) GetNetworkChangeLog { return v.ChangeLog }).(GetNetworkChangeLogOutput)
}

// Number of connections associated with this network
func (o LookupNetworkResultOutput) ConnectionsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNetworkResult) int { return v.ConnectionsCount }).(pulumi.IntOutput)
}

// Fabric Network URI information
func (o LookupNetworkResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// Fabric Network location
func (o LookupNetworkResultOutput) Locations() GetNetworkLocationArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkLocation { return v.Locations }).(GetNetworkLocationArrayOutput)
}

// Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o LookupNetworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on Fabric Network configuration or status changes
func (o LookupNetworkResultOutput) Notifications() GetNetworkNotificationArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkNotification { return v.Notifications }).(GetNetworkNotificationArrayOutput)
}

// Network operation information that is associated with this Fabric Network
func (o LookupNetworkResultOutput) Operation() GetNetworkOperationOutput {
	return o.ApplyT(func(v LookupNetworkResult) GetNetworkOperation { return v.Operation }).(GetNetworkOperationOutput)
}

// Fabric Network project
func (o LookupNetworkResultOutput) Project() GetNetworkProjectOutput {
	return o.ApplyT(func(v LookupNetworkResult) GetNetworkProject { return v.Project }).(GetNetworkProjectOutput)
}

// Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
func (o LookupNetworkResultOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Scope }).(pulumi.StringOutput)
}

// Fabric Network overall state
func (o LookupNetworkResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.State }).(pulumi.StringOutput)
}

// Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
func (o LookupNetworkResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned network identifier
func (o LookupNetworkResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkResultOutput{})
}
