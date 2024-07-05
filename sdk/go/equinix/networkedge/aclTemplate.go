// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkedge

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource `networkedge.AclTemplate` allows creation and management of Equinix Network Edge device Access Control List templates.
//
// Device ACL templates give possibility to define set of rules will allowed inbound traffic. Templates can be assigned to the network devices.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			aclTemplate, err := networkedge.NewAclTemplate(ctx, "aclTemplate", &networkedge.AclTemplateArgs{
//				Name:        pulumi.String("test"),
//				Description: pulumi.String("Test ACL template"),
//				InboundRules: networkedge.AclTemplateInboundRuleArray{
//					&networkedge.AclTemplateInboundRuleArgs{
//						Subnet:      pulumi.String("1.1.1.1/32"),
//						Protocol:    pulumi.String("IP"),
//						SrcPort:     pulumi.String("any"),
//						DstPort:     pulumi.String("any"),
//						Description: pulumi.String("inbound rule description"),
//					},
//					&networkedge.AclTemplateInboundRuleArgs{
//						Subnet:      pulumi.String("2.2.2.2/28"),
//						Protocol:    pulumi.String("TCP"),
//						SrcPort:     pulumi.String("any"),
//						DstPort:     pulumi.String("any"),
//						Description: pulumi.String("inbound rule description"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("templateId", aclTemplate.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing ID:
//
// ```sh
// $ pulumi import equinix:networkedge/aclTemplate:AclTemplate example {existing_id}
// ```
type AclTemplate struct {
	pulumi.CustomResourceState

	// Inbound rule description, up to 200 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
	DeviceAclStatus pulumi.StringOutput `pulumi:"deviceAclStatus"`
	// List of the devices where the ACL template is applied.
	DeviceDetails AclTemplateDeviceDetailArrayOutput `pulumi:"deviceDetails"`
	// (Deprecated) Identifier of a network device where template was applied.
	//
	// Deprecated: Refer to device details get device information
	DeviceId pulumi.StringOutput `pulumi:"deviceId"`
	// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
	//
	// The `inboundRule` block has below fields:
	InboundRules AclTemplateInboundRuleArrayOutput `pulumi:"inboundRules"`
	// ACL template location metro code.
	//
	// Deprecated: Metro Code is no longer required
	MetroCode pulumi.StringPtrOutput `pulumi:"metroCode"`
	// ACL template name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Device uuid.
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewAclTemplate registers a new resource with the given unique name, arguments, and options.
func NewAclTemplate(ctx *pulumi.Context,
	name string, args *AclTemplateArgs, opts ...pulumi.ResourceOption) (*AclTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InboundRules == nil {
		return nil, errors.New("invalid value for required argument 'InboundRules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AclTemplate
	err := ctx.RegisterResource("equinix:networkedge/aclTemplate:AclTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclTemplate gets an existing AclTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclTemplateState, opts ...pulumi.ResourceOption) (*AclTemplate, error) {
	var resource AclTemplate
	err := ctx.ReadResource("equinix:networkedge/aclTemplate:AclTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclTemplate resources.
type aclTemplateState struct {
	// Inbound rule description, up to 200 characters.
	Description *string `pulumi:"description"`
	// Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
	DeviceAclStatus *string `pulumi:"deviceAclStatus"`
	// List of the devices where the ACL template is applied.
	DeviceDetails []AclTemplateDeviceDetail `pulumi:"deviceDetails"`
	// (Deprecated) Identifier of a network device where template was applied.
	//
	// Deprecated: Refer to device details get device information
	DeviceId *string `pulumi:"deviceId"`
	// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
	//
	// The `inboundRule` block has below fields:
	InboundRules []AclTemplateInboundRule `pulumi:"inboundRules"`
	// ACL template location metro code.
	//
	// Deprecated: Metro Code is no longer required
	MetroCode *string `pulumi:"metroCode"`
	// ACL template name.
	Name *string `pulumi:"name"`
	// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
	ProjectId *string `pulumi:"projectId"`
	// Device uuid.
	Uuid *string `pulumi:"uuid"`
}

type AclTemplateState struct {
	// Inbound rule description, up to 200 characters.
	Description pulumi.StringPtrInput
	// Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
	DeviceAclStatus pulumi.StringPtrInput
	// List of the devices where the ACL template is applied.
	DeviceDetails AclTemplateDeviceDetailArrayInput
	// (Deprecated) Identifier of a network device where template was applied.
	//
	// Deprecated: Refer to device details get device information
	DeviceId pulumi.StringPtrInput
	// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
	//
	// The `inboundRule` block has below fields:
	InboundRules AclTemplateInboundRuleArrayInput
	// ACL template location metro code.
	//
	// Deprecated: Metro Code is no longer required
	MetroCode pulumi.StringPtrInput
	// ACL template name.
	Name pulumi.StringPtrInput
	// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
	ProjectId pulumi.StringPtrInput
	// Device uuid.
	Uuid pulumi.StringPtrInput
}

func (AclTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTemplateState)(nil)).Elem()
}

type aclTemplateArgs struct {
	// Inbound rule description, up to 200 characters.
	Description *string `pulumi:"description"`
	// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
	//
	// The `inboundRule` block has below fields:
	InboundRules []AclTemplateInboundRule `pulumi:"inboundRules"`
	// ACL template location metro code.
	//
	// Deprecated: Metro Code is no longer required
	MetroCode *string `pulumi:"metroCode"`
	// ACL template name.
	Name *string `pulumi:"name"`
	// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
	ProjectId *string `pulumi:"projectId"`
}

// The set of arguments for constructing a AclTemplate resource.
type AclTemplateArgs struct {
	// Inbound rule description, up to 200 characters.
	Description pulumi.StringPtrInput
	// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
	//
	// The `inboundRule` block has below fields:
	InboundRules AclTemplateInboundRuleArrayInput
	// ACL template location metro code.
	//
	// Deprecated: Metro Code is no longer required
	MetroCode pulumi.StringPtrInput
	// ACL template name.
	Name pulumi.StringPtrInput
	// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
	ProjectId pulumi.StringPtrInput
}

func (AclTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTemplateArgs)(nil)).Elem()
}

type AclTemplateInput interface {
	pulumi.Input

	ToAclTemplateOutput() AclTemplateOutput
	ToAclTemplateOutputWithContext(ctx context.Context) AclTemplateOutput
}

func (*AclTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTemplate)(nil)).Elem()
}

func (i *AclTemplate) ToAclTemplateOutput() AclTemplateOutput {
	return i.ToAclTemplateOutputWithContext(context.Background())
}

func (i *AclTemplate) ToAclTemplateOutputWithContext(ctx context.Context) AclTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTemplateOutput)
}

// AclTemplateArrayInput is an input type that accepts AclTemplateArray and AclTemplateArrayOutput values.
// You can construct a concrete instance of `AclTemplateArrayInput` via:
//
//	AclTemplateArray{ AclTemplateArgs{...} }
type AclTemplateArrayInput interface {
	pulumi.Input

	ToAclTemplateArrayOutput() AclTemplateArrayOutput
	ToAclTemplateArrayOutputWithContext(context.Context) AclTemplateArrayOutput
}

type AclTemplateArray []AclTemplateInput

func (AclTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclTemplate)(nil)).Elem()
}

func (i AclTemplateArray) ToAclTemplateArrayOutput() AclTemplateArrayOutput {
	return i.ToAclTemplateArrayOutputWithContext(context.Background())
}

func (i AclTemplateArray) ToAclTemplateArrayOutputWithContext(ctx context.Context) AclTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTemplateArrayOutput)
}

// AclTemplateMapInput is an input type that accepts AclTemplateMap and AclTemplateMapOutput values.
// You can construct a concrete instance of `AclTemplateMapInput` via:
//
//	AclTemplateMap{ "key": AclTemplateArgs{...} }
type AclTemplateMapInput interface {
	pulumi.Input

	ToAclTemplateMapOutput() AclTemplateMapOutput
	ToAclTemplateMapOutputWithContext(context.Context) AclTemplateMapOutput
}

type AclTemplateMap map[string]AclTemplateInput

func (AclTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclTemplate)(nil)).Elem()
}

func (i AclTemplateMap) ToAclTemplateMapOutput() AclTemplateMapOutput {
	return i.ToAclTemplateMapOutputWithContext(context.Background())
}

func (i AclTemplateMap) ToAclTemplateMapOutputWithContext(ctx context.Context) AclTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTemplateMapOutput)
}

type AclTemplateOutput struct{ *pulumi.OutputState }

func (AclTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTemplate)(nil)).Elem()
}

func (o AclTemplateOutput) ToAclTemplateOutput() AclTemplateOutput {
	return o
}

func (o AclTemplateOutput) ToAclTemplateOutputWithContext(ctx context.Context) AclTemplateOutput {
	return o
}

// Inbound rule description, up to 200 characters.
func (o AclTemplateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
func (o AclTemplateOutput) DeviceAclStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringOutput { return v.DeviceAclStatus }).(pulumi.StringOutput)
}

// List of the devices where the ACL template is applied.
func (o AclTemplateOutput) DeviceDetails() AclTemplateDeviceDetailArrayOutput {
	return o.ApplyT(func(v *AclTemplate) AclTemplateDeviceDetailArrayOutput { return v.DeviceDetails }).(AclTemplateDeviceDetailArrayOutput)
}

// (Deprecated) Identifier of a network device where template was applied.
//
// Deprecated: Refer to device details get device information
func (o AclTemplateOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

// One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
//
// The `inboundRule` block has below fields:
func (o AclTemplateOutput) InboundRules() AclTemplateInboundRuleArrayOutput {
	return o.ApplyT(func(v *AclTemplate) AclTemplateInboundRuleArrayOutput { return v.InboundRules }).(AclTemplateInboundRuleArrayOutput)
}

// ACL template location metro code.
//
// Deprecated: Metro Code is no longer required
func (o AclTemplateOutput) MetroCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringPtrOutput { return v.MetroCode }).(pulumi.StringPtrOutput)
}

// ACL template name.
func (o AclTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
func (o AclTemplateOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Device uuid.
func (o AclTemplateOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTemplate) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type AclTemplateArrayOutput struct{ *pulumi.OutputState }

func (AclTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclTemplate)(nil)).Elem()
}

func (o AclTemplateArrayOutput) ToAclTemplateArrayOutput() AclTemplateArrayOutput {
	return o
}

func (o AclTemplateArrayOutput) ToAclTemplateArrayOutputWithContext(ctx context.Context) AclTemplateArrayOutput {
	return o
}

func (o AclTemplateArrayOutput) Index(i pulumi.IntInput) AclTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AclTemplate {
		return vs[0].([]*AclTemplate)[vs[1].(int)]
	}).(AclTemplateOutput)
}

type AclTemplateMapOutput struct{ *pulumi.OutputState }

func (AclTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclTemplate)(nil)).Elem()
}

func (o AclTemplateMapOutput) ToAclTemplateMapOutput() AclTemplateMapOutput {
	return o
}

func (o AclTemplateMapOutput) ToAclTemplateMapOutputWithContext(ctx context.Context) AclTemplateMapOutput {
	return o
}

func (o AclTemplateMapOutput) MapIndex(k pulumi.StringInput) AclTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AclTemplate {
		return vs[0].(map[string]*AclTemplate)[vs[1].(string)]
	}).(AclTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclTemplateInput)(nil)).Elem(), &AclTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTemplateArrayInput)(nil)).Elem(), AclTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTemplateMapInput)(nil)).Elem(), AclTemplateMap{})
	pulumi.RegisterOutputType(AclTemplateOutput{})
	pulumi.RegisterOutputType(AclTemplateArrayOutput{})
	pulumi.RegisterOutputType(AclTemplateMapOutput{})
}
