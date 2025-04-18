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

// Use this resource to associate VLAN with a Dedicated Port from [Equinix Fabric - software-defined interconnections](https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/#associating-a-vlan-with-a-dedicated-port).
//
// See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
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
//			projectId := "52000fb2-ee46-4673-93a8-de2c2bdba33c"
//			connId := "73f12f29-3e19-43a0-8e90-ae81580db1e0"
//			test := metal.LookupInterconnectionOutput(ctx, metal.GetInterconnectionOutputArgs{
//				ConnectionId: pulumi.String(connId),
//			}, nil)
//			testVlan, err := metal.NewVlan(ctx, "testVlan", &metal.VlanArgs{
//				ProjectId: pulumi.String(projectId),
//				Metro: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
//					return &test.Metro, nil
//				}).(pulumi.StringPtrOutput)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = metal.NewVirtualCircuit(ctx, "testVirtualCircuit", &metal.VirtualCircuitArgs{
//				ConnectionId: pulumi.String(connId),
//				ProjectId:    pulumi.String(projectId),
//				PortId: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
//					return &test.Ports[0].Id, nil
//				}).(pulumi.StringPtrOutput)),
//				VlanId:  testVlan.ID(),
//				NniVlan: pulumi.Int(1056),
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
// ```sh
// $ pulumi import equinix:metal/virtualCircuit:VirtualCircuit equinix_metal_virtual_circuit {existing_id}
// ```
type VirtualCircuit struct {
	pulumi.CustomResourceState

	// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
	CustomerIp pulumi.StringOutput `pulumi:"customerIp"`
	// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
	CustomerIpv6 pulumi.StringOutput `pulumi:"customerIpv6"`
	// Description of the Virtual Circuit resource
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The password that can be set for the VRF BGP peer
	Md5 pulumi.StringPtrOutput `pulumi:"md5"`
	// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
	MetalIp pulumi.StringOutput `pulumi:"metalIp"`
	// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
	MetalIpv6 pulumi.StringOutput `pulumi:"metalIpv6"`
	// Name of the Virtual Circuit resource
	Name pulumi.StringOutput `pulumi:"name"`
	// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
	NniVlan pulumi.IntOutput `pulumi:"nniVlan"`
	// Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	NniVnid pulumi.IntOutput `pulumi:"nniVnid"`
	// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
	PeerAsn pulumi.IntPtrOutput `pulumi:"peerAsn"`
	// UUID of the Connection Port where the VC is scoped to
	PortId pulumi.StringOutput `pulumi:"portId"`
	// UUID of the Project where the VC is scoped to
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
	Speed pulumi.StringOutput `pulumi:"speed"`
	// Status of the virtual circuit resource
	Status pulumi.StringOutput `pulumi:"status"`
	// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
	// 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	Subnet pulumi.StringPtrOutput `pulumi:"subnet"`
	// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
	// 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	SubnetIpv6 pulumi.StringPtrOutput `pulumi:"subnetIpv6"`
	// Tags attached to the virtual circuit
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
	VirtualCircuitId pulumi.StringPtrOutput `pulumi:"virtualCircuitId"`
	// UUID of the VLAN to associate
	VlanId pulumi.StringPtrOutput `pulumi:"vlanId"`
	// VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	Vnid pulumi.IntOutput `pulumi:"vnid"`
	// UUID of the VRF to associate
	VrfId pulumi.StringPtrOutput `pulumi:"vrfId"`
}

// NewVirtualCircuit registers a new resource with the given unique name, arguments, and options.
func NewVirtualCircuit(ctx *pulumi.Context,
	name string, args *VirtualCircuitArgs, opts ...pulumi.ResourceOption) (*VirtualCircuit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PortId == nil {
		return nil, errors.New("invalid value for required argument 'PortId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Md5 != nil {
		args.Md5 = pulumi.ToSecret(args.Md5).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"md5",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualCircuit
	err := ctx.RegisterResource("equinix:metal/virtualCircuit:VirtualCircuit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualCircuit gets an existing VirtualCircuit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualCircuit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualCircuitState, opts ...pulumi.ResourceOption) (*VirtualCircuit, error) {
	var resource VirtualCircuit
	err := ctx.ReadResource("equinix:metal/virtualCircuit:VirtualCircuit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualCircuit resources.
type virtualCircuitState struct {
	// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
	ConnectionId *string `pulumi:"connectionId"`
	// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
	CustomerIp *string `pulumi:"customerIp"`
	// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
	CustomerIpv6 *string `pulumi:"customerIpv6"`
	// Description of the Virtual Circuit resource
	Description *string `pulumi:"description"`
	// The password that can be set for the VRF BGP peer
	Md5 *string `pulumi:"md5"`
	// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
	MetalIp *string `pulumi:"metalIp"`
	// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
	MetalIpv6 *string `pulumi:"metalIpv6"`
	// Name of the Virtual Circuit resource
	Name *string `pulumi:"name"`
	// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
	NniVlan *int `pulumi:"nniVlan"`
	// Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	NniVnid *int `pulumi:"nniVnid"`
	// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
	PeerAsn *int `pulumi:"peerAsn"`
	// UUID of the Connection Port where the VC is scoped to
	PortId *string `pulumi:"portId"`
	// UUID of the Project where the VC is scoped to
	ProjectId *string `pulumi:"projectId"`
	// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
	Speed *string `pulumi:"speed"`
	// Status of the virtual circuit resource
	Status *string `pulumi:"status"`
	// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
	// 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	Subnet *string `pulumi:"subnet"`
	// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
	// 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	SubnetIpv6 *string `pulumi:"subnetIpv6"`
	// Tags attached to the virtual circuit
	Tags []string `pulumi:"tags"`
	// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
	VirtualCircuitId *string `pulumi:"virtualCircuitId"`
	// UUID of the VLAN to associate
	VlanId *string `pulumi:"vlanId"`
	// VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	Vnid *int `pulumi:"vnid"`
	// UUID of the VRF to associate
	VrfId *string `pulumi:"vrfId"`
}

type VirtualCircuitState struct {
	// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
	ConnectionId pulumi.StringPtrInput
	// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
	CustomerIp pulumi.StringPtrInput
	// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
	CustomerIpv6 pulumi.StringPtrInput
	// Description of the Virtual Circuit resource
	Description pulumi.StringPtrInput
	// The password that can be set for the VRF BGP peer
	Md5 pulumi.StringPtrInput
	// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
	MetalIp pulumi.StringPtrInput
	// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
	MetalIpv6 pulumi.StringPtrInput
	// Name of the Virtual Circuit resource
	Name pulumi.StringPtrInput
	// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
	NniVlan pulumi.IntPtrInput
	// Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	NniVnid pulumi.IntPtrInput
	// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
	PeerAsn pulumi.IntPtrInput
	// UUID of the Connection Port where the VC is scoped to
	PortId pulumi.StringPtrInput
	// UUID of the Project where the VC is scoped to
	ProjectId pulumi.StringPtrInput
	// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
	Speed pulumi.StringPtrInput
	// Status of the virtual circuit resource
	Status pulumi.StringPtrInput
	// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
	// 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	Subnet pulumi.StringPtrInput
	// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
	// 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	SubnetIpv6 pulumi.StringPtrInput
	// Tags attached to the virtual circuit
	Tags pulumi.StringArrayInput
	// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
	VirtualCircuitId pulumi.StringPtrInput
	// UUID of the VLAN to associate
	VlanId pulumi.StringPtrInput
	// VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
	Vnid pulumi.IntPtrInput
	// UUID of the VRF to associate
	VrfId pulumi.StringPtrInput
}

func (VirtualCircuitState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualCircuitState)(nil)).Elem()
}

type virtualCircuitArgs struct {
	// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
	ConnectionId *string `pulumi:"connectionId"`
	// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
	CustomerIp *string `pulumi:"customerIp"`
	// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
	CustomerIpv6 *string `pulumi:"customerIpv6"`
	// Description of the Virtual Circuit resource
	Description *string `pulumi:"description"`
	// The password that can be set for the VRF BGP peer
	Md5 *string `pulumi:"md5"`
	// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
	MetalIp *string `pulumi:"metalIp"`
	// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
	MetalIpv6 *string `pulumi:"metalIpv6"`
	// Name of the Virtual Circuit resource
	Name *string `pulumi:"name"`
	// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
	NniVlan *int `pulumi:"nniVlan"`
	// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
	PeerAsn *int `pulumi:"peerAsn"`
	// UUID of the Connection Port where the VC is scoped to
	PortId string `pulumi:"portId"`
	// UUID of the Project where the VC is scoped to
	ProjectId string `pulumi:"projectId"`
	// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
	Speed *string `pulumi:"speed"`
	// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
	// 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	Subnet *string `pulumi:"subnet"`
	// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
	// 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	SubnetIpv6 *string `pulumi:"subnetIpv6"`
	// Tags attached to the virtual circuit
	Tags []string `pulumi:"tags"`
	// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
	VirtualCircuitId *string `pulumi:"virtualCircuitId"`
	// UUID of the VLAN to associate
	VlanId *string `pulumi:"vlanId"`
	// UUID of the VRF to associate
	VrfId *string `pulumi:"vrfId"`
}

// The set of arguments for constructing a VirtualCircuit resource.
type VirtualCircuitArgs struct {
	// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
	ConnectionId pulumi.StringPtrInput
	// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
	CustomerIp pulumi.StringPtrInput
	// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
	CustomerIpv6 pulumi.StringPtrInput
	// Description of the Virtual Circuit resource
	Description pulumi.StringPtrInput
	// The password that can be set for the VRF BGP peer
	Md5 pulumi.StringPtrInput
	// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
	MetalIp pulumi.StringPtrInput
	// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
	MetalIpv6 pulumi.StringPtrInput
	// Name of the Virtual Circuit resource
	Name pulumi.StringPtrInput
	// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
	NniVlan pulumi.IntPtrInput
	// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
	PeerAsn pulumi.IntPtrInput
	// UUID of the Connection Port where the VC is scoped to
	PortId pulumi.StringInput
	// UUID of the Project where the VC is scoped to
	ProjectId pulumi.StringInput
	// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
	Speed pulumi.StringPtrInput
	// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
	// 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	Subnet pulumi.StringPtrInput
	// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
	// 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
	// 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
	SubnetIpv6 pulumi.StringPtrInput
	// Tags attached to the virtual circuit
	Tags pulumi.StringArrayInput
	// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
	VirtualCircuitId pulumi.StringPtrInput
	// UUID of the VLAN to associate
	VlanId pulumi.StringPtrInput
	// UUID of the VRF to associate
	VrfId pulumi.StringPtrInput
}

func (VirtualCircuitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualCircuitArgs)(nil)).Elem()
}

type VirtualCircuitInput interface {
	pulumi.Input

	ToVirtualCircuitOutput() VirtualCircuitOutput
	ToVirtualCircuitOutputWithContext(ctx context.Context) VirtualCircuitOutput
}

func (*VirtualCircuit) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualCircuit)(nil)).Elem()
}

func (i *VirtualCircuit) ToVirtualCircuitOutput() VirtualCircuitOutput {
	return i.ToVirtualCircuitOutputWithContext(context.Background())
}

func (i *VirtualCircuit) ToVirtualCircuitOutputWithContext(ctx context.Context) VirtualCircuitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualCircuitOutput)
}

// VirtualCircuitArrayInput is an input type that accepts VirtualCircuitArray and VirtualCircuitArrayOutput values.
// You can construct a concrete instance of `VirtualCircuitArrayInput` via:
//
//	VirtualCircuitArray{ VirtualCircuitArgs{...} }
type VirtualCircuitArrayInput interface {
	pulumi.Input

	ToVirtualCircuitArrayOutput() VirtualCircuitArrayOutput
	ToVirtualCircuitArrayOutputWithContext(context.Context) VirtualCircuitArrayOutput
}

type VirtualCircuitArray []VirtualCircuitInput

func (VirtualCircuitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualCircuit)(nil)).Elem()
}

func (i VirtualCircuitArray) ToVirtualCircuitArrayOutput() VirtualCircuitArrayOutput {
	return i.ToVirtualCircuitArrayOutputWithContext(context.Background())
}

func (i VirtualCircuitArray) ToVirtualCircuitArrayOutputWithContext(ctx context.Context) VirtualCircuitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualCircuitArrayOutput)
}

// VirtualCircuitMapInput is an input type that accepts VirtualCircuitMap and VirtualCircuitMapOutput values.
// You can construct a concrete instance of `VirtualCircuitMapInput` via:
//
//	VirtualCircuitMap{ "key": VirtualCircuitArgs{...} }
type VirtualCircuitMapInput interface {
	pulumi.Input

	ToVirtualCircuitMapOutput() VirtualCircuitMapOutput
	ToVirtualCircuitMapOutputWithContext(context.Context) VirtualCircuitMapOutput
}

type VirtualCircuitMap map[string]VirtualCircuitInput

func (VirtualCircuitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualCircuit)(nil)).Elem()
}

func (i VirtualCircuitMap) ToVirtualCircuitMapOutput() VirtualCircuitMapOutput {
	return i.ToVirtualCircuitMapOutputWithContext(context.Background())
}

func (i VirtualCircuitMap) ToVirtualCircuitMapOutputWithContext(ctx context.Context) VirtualCircuitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualCircuitMapOutput)
}

type VirtualCircuitOutput struct{ *pulumi.OutputState }

func (VirtualCircuitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualCircuit)(nil)).Elem()
}

func (o VirtualCircuitOutput) ToVirtualCircuitOutput() VirtualCircuitOutput {
	return o
}

func (o VirtualCircuitOutput) ToVirtualCircuitOutputWithContext(ctx context.Context) VirtualCircuitOutput {
	return o
}

// UUID of Connection where the VC is scoped to.  Only used for dedicated connections
func (o VirtualCircuitOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
func (o VirtualCircuitOutput) CustomerIp() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.CustomerIp }).(pulumi.StringOutput)
}

// The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
func (o VirtualCircuitOutput) CustomerIpv6() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.CustomerIpv6 }).(pulumi.StringOutput)
}

// Description of the Virtual Circuit resource
func (o VirtualCircuitOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The password that can be set for the VRF BGP peer
func (o VirtualCircuitOutput) Md5() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.Md5 }).(pulumi.StringPtrOutput)
}

// The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
func (o VirtualCircuitOutput) MetalIp() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.MetalIp }).(pulumi.StringOutput)
}

// The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
func (o VirtualCircuitOutput) MetalIpv6() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.MetalIpv6 }).(pulumi.StringOutput)
}

// Name of the Virtual Circuit resource
func (o VirtualCircuitOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Equinix Metal network-to-network VLAN ID (optional when the connection has mode=tunnel)
func (o VirtualCircuitOutput) NniVlan() pulumi.IntOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.IntOutput { return v.NniVlan }).(pulumi.IntOutput)
}

// Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
func (o VirtualCircuitOutput) NniVnid() pulumi.IntOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.IntOutput { return v.NniVnid }).(pulumi.IntOutput)
}

// The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
func (o VirtualCircuitOutput) PeerAsn() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.IntPtrOutput { return v.PeerAsn }).(pulumi.IntPtrOutput)
}

// UUID of the Connection Port where the VC is scoped to
func (o VirtualCircuitOutput) PortId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.PortId }).(pulumi.StringOutput)
}

// UUID of the Project where the VC is scoped to
func (o VirtualCircuitOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
func (o VirtualCircuitOutput) Speed() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.Speed }).(pulumi.StringOutput)
}

// Status of the virtual circuit resource
func (o VirtualCircuitOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
//   - For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
//   - For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
func (o VirtualCircuitOutput) Subnet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.Subnet }).(pulumi.StringPtrOutput)
}

// A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
//   - For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
//   - For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
func (o VirtualCircuitOutput) SubnetIpv6() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.SubnetIpv6 }).(pulumi.StringPtrOutput)
}

// Tags attached to the virtual circuit
func (o VirtualCircuitOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// UUID of an existing VC to configure. Used in the case of shared interconnections where the VC has already been created.
func (o VirtualCircuitOutput) VirtualCircuitId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.VirtualCircuitId }).(pulumi.StringPtrOutput)
}

// UUID of the VLAN to associate
func (o VirtualCircuitOutput) VlanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.VlanId }).(pulumi.StringPtrOutput)
}

// VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
func (o VirtualCircuitOutput) Vnid() pulumi.IntOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.IntOutput { return v.Vnid }).(pulumi.IntOutput)
}

// UUID of the VRF to associate
func (o VirtualCircuitOutput) VrfId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualCircuit) pulumi.StringPtrOutput { return v.VrfId }).(pulumi.StringPtrOutput)
}

type VirtualCircuitArrayOutput struct{ *pulumi.OutputState }

func (VirtualCircuitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualCircuit)(nil)).Elem()
}

func (o VirtualCircuitArrayOutput) ToVirtualCircuitArrayOutput() VirtualCircuitArrayOutput {
	return o
}

func (o VirtualCircuitArrayOutput) ToVirtualCircuitArrayOutputWithContext(ctx context.Context) VirtualCircuitArrayOutput {
	return o
}

func (o VirtualCircuitArrayOutput) Index(i pulumi.IntInput) VirtualCircuitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualCircuit {
		return vs[0].([]*VirtualCircuit)[vs[1].(int)]
	}).(VirtualCircuitOutput)
}

type VirtualCircuitMapOutput struct{ *pulumi.OutputState }

func (VirtualCircuitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualCircuit)(nil)).Elem()
}

func (o VirtualCircuitMapOutput) ToVirtualCircuitMapOutput() VirtualCircuitMapOutput {
	return o
}

func (o VirtualCircuitMapOutput) ToVirtualCircuitMapOutputWithContext(ctx context.Context) VirtualCircuitMapOutput {
	return o
}

func (o VirtualCircuitMapOutput) MapIndex(k pulumi.StringInput) VirtualCircuitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualCircuit {
		return vs[0].(map[string]*VirtualCircuit)[vs[1].(string)]
	}).(VirtualCircuitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualCircuitInput)(nil)).Elem(), &VirtualCircuit{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualCircuitArrayInput)(nil)).Elem(), VirtualCircuitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualCircuitMapInput)(nil)).Elem(), VirtualCircuitMap{})
	pulumi.RegisterOutputType(VirtualCircuitOutput{})
	pulumi.RegisterOutputType(VirtualCircuitArrayOutput{})
	pulumi.RegisterOutputType(VirtualCircuitMapOutput{})
}
