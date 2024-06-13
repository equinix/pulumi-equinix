// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch routing protocol for a given UUID
//
// API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
//
// Additional documentation:
// * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal>
// * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols>
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
//			routingProtocolDataName, err := fabric.LookupRoutingProtocol(ctx, &fabric.LookupRoutingProtocolArgs{
//				ConnectionUuid: "<uuid_of_connection_routing_protocol_is_applied_to>",
//				Uuid:           "<uuid_of_routing_protocol>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", routingProtocolDataName.Id)
//			ctx.Export("name", routingProtocolDataName.Name)
//			ctx.Export("type", routingProtocolDataName.Type)
//			ctx.Export("directIpv4", routingProtocolDataName.DirectIpv4.EquinixIfaceIp)
//			ctx.Export("directIpv6", routingProtocolDataName.DirectIpv6.EquinixIfaceIp)
//			ctx.Export("bgpIpv4CustomerPeerIp", routingProtocolDataName.BgpIpv4.CustomerPeerIp)
//			ctx.Export("bgpIpv4EquinixPeerIp", routingProtocolDataName.BgpIpv4.EquinixPeerIp)
//			ctx.Export("bgpIpv4Enabled", routingProtocolDataName.BgpIpv4.Enabled)
//			ctx.Export("bgpIpv6CustomerPeerIp", routingProtocolDataName.BgpIpv6.CustomerPeerIp)
//			ctx.Export("bgpIpv6EquinixPeerIp", routingProtocolDataName.BgpIpv6.EquinixPeerIp)
//			ctx.Export("bgpIpv6Enabled", routingProtocolDataName.BgpIpv6.Enabled)
//			ctx.Export("customerAsn", routingProtocolDataName.CustomerAsn)
//			return nil
//		})
//	}
//
// ```
func LookupRoutingProtocol(ctx *pulumi.Context, args *LookupRoutingProtocolArgs, opts ...pulumi.InvokeOption) (*LookupRoutingProtocolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRoutingProtocolResult
	err := ctx.Invoke("equinix:fabric/getRoutingProtocol:getRoutingProtocol", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoutingProtocol.
type LookupRoutingProtocolArgs struct {
	// Connection URI associated with Routing Protocol
	ConnectionUuid string `pulumi:"connectionUuid"`
	// Equinix-assigned routing protocol identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getRoutingProtocol.
type LookupRoutingProtocolResult struct {
	// Bidirectional Forwarding Detection
	Bfd GetRoutingProtocolBfd `pulumi:"bfd"`
	// BGP authorization key
	BgpAuthKey string `pulumi:"bgpAuthKey"`
	// Routing Protocol BGP IPv4
	BgpIpv4 GetRoutingProtocolBgpIpv4 `pulumi:"bgpIpv4"`
	// Routing Protocol BGP IPv6
	BgpIpv6 GetRoutingProtocolBgpIpv6 `pulumi:"bgpIpv6"`
	// Captures Routing Protocol lifecycle change information
	ChangeLogs []GetRoutingProtocolChangeLog `pulumi:"changeLogs"`
	// Routing Protocol configuration Changes
	Changes []GetRoutingProtocolChange `pulumi:"changes"`
	// Connection URI associated with Routing Protocol
	ConnectionUuid string `pulumi:"connectionUuid"`
	// Customer-provided ASN
	CustomerAsn int `pulumi:"customerAsn"`
	// Customer-provided Fabric Routing Protocol description
	Description string `pulumi:"description"`
	// Routing Protocol Direct IPv4
	DirectIpv4 GetRoutingProtocolDirectIpv4 `pulumi:"directIpv4"`
	// Routing Protocol Direct IPv6
	DirectIpv6 GetRoutingProtocolDirectIpv6 `pulumi:"directIpv6"`
	// Equinix ASN
	EquinixAsn int `pulumi:"equinixAsn"`
	// Routing Protocol URI information
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name string `pulumi:"name"`
	// Routing Protocol type-specific operational data
	Operations []GetRoutingProtocolOperation `pulumi:"operations"`
	// Routing Protocol overall state
	State string `pulumi:"state"`
	// Defines the routing protocol type like BGP or DIRECT
	Type string `pulumi:"type"`
	// Equinix-assigned routing protocol identifier
	Uuid string `pulumi:"uuid"`
}

func LookupRoutingProtocolOutput(ctx *pulumi.Context, args LookupRoutingProtocolOutputArgs, opts ...pulumi.InvokeOption) LookupRoutingProtocolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRoutingProtocolResult, error) {
			args := v.(LookupRoutingProtocolArgs)
			r, err := LookupRoutingProtocol(ctx, &args, opts...)
			var s LookupRoutingProtocolResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRoutingProtocolResultOutput)
}

// A collection of arguments for invoking getRoutingProtocol.
type LookupRoutingProtocolOutputArgs struct {
	// Connection URI associated with Routing Protocol
	ConnectionUuid pulumi.StringInput `pulumi:"connectionUuid"`
	// Equinix-assigned routing protocol identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (LookupRoutingProtocolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoutingProtocolArgs)(nil)).Elem()
}

// A collection of values returned by getRoutingProtocol.
type LookupRoutingProtocolResultOutput struct{ *pulumi.OutputState }

func (LookupRoutingProtocolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoutingProtocolResult)(nil)).Elem()
}

func (o LookupRoutingProtocolResultOutput) ToLookupRoutingProtocolResultOutput() LookupRoutingProtocolResultOutput {
	return o
}

func (o LookupRoutingProtocolResultOutput) ToLookupRoutingProtocolResultOutputWithContext(ctx context.Context) LookupRoutingProtocolResultOutput {
	return o
}

// Bidirectional Forwarding Detection
func (o LookupRoutingProtocolResultOutput) Bfd() GetRoutingProtocolBfdOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) GetRoutingProtocolBfd { return v.Bfd }).(GetRoutingProtocolBfdOutput)
}

// BGP authorization key
func (o LookupRoutingProtocolResultOutput) BgpAuthKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.BgpAuthKey }).(pulumi.StringOutput)
}

// Routing Protocol BGP IPv4
func (o LookupRoutingProtocolResultOutput) BgpIpv4() GetRoutingProtocolBgpIpv4Output {
	return o.ApplyT(func(v LookupRoutingProtocolResult) GetRoutingProtocolBgpIpv4 { return v.BgpIpv4 }).(GetRoutingProtocolBgpIpv4Output)
}

// Routing Protocol BGP IPv6
func (o LookupRoutingProtocolResultOutput) BgpIpv6() GetRoutingProtocolBgpIpv6Output {
	return o.ApplyT(func(v LookupRoutingProtocolResult) GetRoutingProtocolBgpIpv6 { return v.BgpIpv6 }).(GetRoutingProtocolBgpIpv6Output)
}

// Captures Routing Protocol lifecycle change information
func (o LookupRoutingProtocolResultOutput) ChangeLogs() GetRoutingProtocolChangeLogArrayOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) []GetRoutingProtocolChangeLog { return v.ChangeLogs }).(GetRoutingProtocolChangeLogArrayOutput)
}

// Routing Protocol configuration Changes
func (o LookupRoutingProtocolResultOutput) Changes() GetRoutingProtocolChangeArrayOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) []GetRoutingProtocolChange { return v.Changes }).(GetRoutingProtocolChangeArrayOutput)
}

// Connection URI associated with Routing Protocol
func (o LookupRoutingProtocolResultOutput) ConnectionUuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.ConnectionUuid }).(pulumi.StringOutput)
}

// Customer-provided ASN
func (o LookupRoutingProtocolResultOutput) CustomerAsn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) int { return v.CustomerAsn }).(pulumi.IntOutput)
}

// Customer-provided Fabric Routing Protocol description
func (o LookupRoutingProtocolResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Description }).(pulumi.StringOutput)
}

// Routing Protocol Direct IPv4
func (o LookupRoutingProtocolResultOutput) DirectIpv4() GetRoutingProtocolDirectIpv4Output {
	return o.ApplyT(func(v LookupRoutingProtocolResult) GetRoutingProtocolDirectIpv4 { return v.DirectIpv4 }).(GetRoutingProtocolDirectIpv4Output)
}

// Routing Protocol Direct IPv6
func (o LookupRoutingProtocolResultOutput) DirectIpv6() GetRoutingProtocolDirectIpv6Output {
	return o.ApplyT(func(v LookupRoutingProtocolResult) GetRoutingProtocolDirectIpv6 { return v.DirectIpv6 }).(GetRoutingProtocolDirectIpv6Output)
}

// Equinix ASN
func (o LookupRoutingProtocolResultOutput) EquinixAsn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) int { return v.EquinixAsn }).(pulumi.IntOutput)
}

// Routing Protocol URI information
func (o LookupRoutingProtocolResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRoutingProtocolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Id }).(pulumi.StringOutput)
}

// Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o LookupRoutingProtocolResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Name }).(pulumi.StringOutput)
}

// Routing Protocol type-specific operational data
func (o LookupRoutingProtocolResultOutput) Operations() GetRoutingProtocolOperationArrayOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) []GetRoutingProtocolOperation { return v.Operations }).(GetRoutingProtocolOperationArrayOutput)
}

// Routing Protocol overall state
func (o LookupRoutingProtocolResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.State }).(pulumi.StringOutput)
}

// Defines the routing protocol type like BGP or DIRECT
func (o LookupRoutingProtocolResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned routing protocol identifier
func (o LookupRoutingProtocolResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoutingProtocolResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRoutingProtocolResultOutput{})
}
