// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			metro, err := fabric.GetMetro(ctx, &fabric.GetMetroArgs{
//				MetroCode: "<metro_code>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("type", metro.Type)
//			ctx.Export("metroCode", metro.MetroCode)
//			ctx.Export("region", metro.Region)
//			ctx.Export("name", metro.Name)
//			ctx.Export("equinixAsn", metro.EquinixAsn)
//			ctx.Export("localVcBandwidthMax", metro.LocalVcBandwidthMax)
//			ctx.Export("geoCoordinates", metro.GeoCoordinates)
//			ctx.Export("connectedMetros", metro.ConnectedMetros)
//			ctx.Export("geoScopes", metro.GeoScopes)
//			return nil
//		})
//	}
//
// ```
func GetMetro(ctx *pulumi.Context, args *GetMetroArgs, opts ...pulumi.InvokeOption) (*GetMetroResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMetroResult
	err := ctx.Invoke("equinix:fabric/getMetro:getMetro", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMetro.
type GetMetroArgs struct {
	// The metro code this data source should retrieve
	MetroCode string `pulumi:"metroCode"`
}

// A collection of values returned by getMetro.
type GetMetroResult struct {
	// Code assigned to an Equinix IBX data center in a specified metropolitan area
	Code string `pulumi:"code"`
	// Arrays of objects containing latency data for the specified metro
	ConnectedMetros []GetMetroConnectedMetro `pulumi:"connectedMetros"`
	// Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
	EquinixAsn int `pulumi:"equinixAsn"`
	// Geographic location data of Fabric Metro
	GeoCoordinates GetMetroGeoCoordinates `pulumi:"geoCoordinates"`
	// List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
	GeoScopes []string `pulumi:"geoScopes"`
	// The canonical URL at which the resource resides
	Href string `pulumi:"href"`
	// The unique identifier of the resource
	Id string `pulumi:"id"`
	// This field holds Max Connection speed within the metro.
	LocalVcBandwidthMax int `pulumi:"localVcBandwidthMax"`
	// The metro code this data source should retrieve
	MetroCode string `pulumi:"metroCode"`
	// Name of the region in which the data center is located
	Name string `pulumi:"name"`
	// Board geographical area in which the data center is located
	Region string `pulumi:"region"`
	// Indicator of a fabric metro
	Type string `pulumi:"type"`
}

func GetMetroOutput(ctx *pulumi.Context, args GetMetroOutputArgs, opts ...pulumi.InvokeOption) GetMetroResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMetroResultOutput, error) {
			args := v.(GetMetroArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("equinix:fabric/getMetro:getMetro", args, GetMetroResultOutput{}, options).(GetMetroResultOutput), nil
		}).(GetMetroResultOutput)
}

// A collection of arguments for invoking getMetro.
type GetMetroOutputArgs struct {
	// The metro code this data source should retrieve
	MetroCode pulumi.StringInput `pulumi:"metroCode"`
}

func (GetMetroOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetroArgs)(nil)).Elem()
}

// A collection of values returned by getMetro.
type GetMetroResultOutput struct{ *pulumi.OutputState }

func (GetMetroResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetroResult)(nil)).Elem()
}

func (o GetMetroResultOutput) ToGetMetroResultOutput() GetMetroResultOutput {
	return o
}

func (o GetMetroResultOutput) ToGetMetroResultOutputWithContext(ctx context.Context) GetMetroResultOutput {
	return o
}

// Code assigned to an Equinix IBX data center in a specified metropolitan area
func (o GetMetroResultOutput) Code() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Code }).(pulumi.StringOutput)
}

// Arrays of objects containing latency data for the specified metro
func (o GetMetroResultOutput) ConnectedMetros() GetMetroConnectedMetroArrayOutput {
	return o.ApplyT(func(v GetMetroResult) []GetMetroConnectedMetro { return v.ConnectedMetros }).(GetMetroConnectedMetroArrayOutput)
}

// Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
func (o GetMetroResultOutput) EquinixAsn() pulumi.IntOutput {
	return o.ApplyT(func(v GetMetroResult) int { return v.EquinixAsn }).(pulumi.IntOutput)
}

// Geographic location data of Fabric Metro
func (o GetMetroResultOutput) GeoCoordinates() GetMetroGeoCoordinatesOutput {
	return o.ApplyT(func(v GetMetroResult) GetMetroGeoCoordinates { return v.GeoCoordinates }).(GetMetroGeoCoordinatesOutput)
}

// List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
func (o GetMetroResultOutput) GeoScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMetroResult) []string { return v.GeoScopes }).(pulumi.StringArrayOutput)
}

// The canonical URL at which the resource resides
func (o GetMetroResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Href }).(pulumi.StringOutput)
}

// The unique identifier of the resource
func (o GetMetroResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Id }).(pulumi.StringOutput)
}

// This field holds Max Connection speed within the metro.
func (o GetMetroResultOutput) LocalVcBandwidthMax() pulumi.IntOutput {
	return o.ApplyT(func(v GetMetroResult) int { return v.LocalVcBandwidthMax }).(pulumi.IntOutput)
}

// The metro code this data source should retrieve
func (o GetMetroResultOutput) MetroCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.MetroCode }).(pulumi.StringOutput)
}

// Name of the region in which the data center is located
func (o GetMetroResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Name }).(pulumi.StringOutput)
}

// Board geographical area in which the data center is located
func (o GetMetroResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Region }).(pulumi.StringOutput)
}

// Indicator of a fabric metro
func (o GetMetroResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetroResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMetroResultOutput{})
}
