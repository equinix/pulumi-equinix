// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Equinix Metal project resource to allow you manage devices
// in your projects.
//
// > **NOTE:** Keep in mind that Equinix Metal invoicing is per project, so creating many
// `metal.Project` resources will affect the rendered invoice. If you want to keep your
// Equinix Metal bill simple and easy to review, please re-use your existing projects.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			organizationId := cfg.Require("organizationId")
//			name := "Default Project"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			projectResource, err := metal.NewProject(ctx, "project", &metal.ProjectArgs{
//				Name:           pulumi.String(name),
//				OrganizationId: pulumi.String(organizationId),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("projectId", projectResource.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing project ID:
//
// ```sh
// $ pulumi import equinix:metal/project:Project equinix_metal_project {existing_project_id}
// ```
type Project struct {
	pulumi.CustomResourceState

	// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
	BackendTransfer pulumi.BoolOutput `pulumi:"backendTransfer"`
	// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
	//
	// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
	// the Equinix Metal API). It can be updated.
	BgpConfig ProjectBgpConfigPtrOutput `pulumi:"bgpConfig"`
	// The timestamp for when the project was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The name of the project.  The maximum length is 80 characters
	Name pulumi.StringOutput `pulumi:"name"`
	// The UUID of organization under which you want to create the project. If you
	// leave it out, the project will be created under your the default organization of your account.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// The UUID of payment method for this project. The payment method and the
	// project need to belong to the same organization (passed with `organizationId`, or default).
	PaymentMethodId pulumi.StringOutput `pulumi:"paymentMethodId"`
	// The timestamp for the last time the project was updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		args = &ProjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("equinix:metal/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("equinix:metal/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
	BackendTransfer *bool `pulumi:"backendTransfer"`
	// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
	//
	// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
	// the Equinix Metal API). It can be updated.
	BgpConfig *ProjectBgpConfig `pulumi:"bgpConfig"`
	// The timestamp for when the project was created.
	Created *string `pulumi:"created"`
	// The name of the project.  The maximum length is 80 characters
	Name *string `pulumi:"name"`
	// The UUID of organization under which you want to create the project. If you
	// leave it out, the project will be created under your the default organization of your account.
	OrganizationId *string `pulumi:"organizationId"`
	// The UUID of payment method for this project. The payment method and the
	// project need to belong to the same organization (passed with `organizationId`, or default).
	PaymentMethodId *string `pulumi:"paymentMethodId"`
	// The timestamp for the last time the project was updated.
	Updated *string `pulumi:"updated"`
}

type ProjectState struct {
	// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
	BackendTransfer pulumi.BoolPtrInput
	// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
	//
	// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
	// the Equinix Metal API). It can be updated.
	BgpConfig ProjectBgpConfigPtrInput
	// The timestamp for when the project was created.
	Created pulumi.StringPtrInput
	// The name of the project.  The maximum length is 80 characters
	Name pulumi.StringPtrInput
	// The UUID of organization under which you want to create the project. If you
	// leave it out, the project will be created under your the default organization of your account.
	OrganizationId pulumi.StringPtrInput
	// The UUID of payment method for this project. The payment method and the
	// project need to belong to the same organization (passed with `organizationId`, or default).
	PaymentMethodId pulumi.StringPtrInput
	// The timestamp for the last time the project was updated.
	Updated pulumi.StringPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
	BackendTransfer *bool `pulumi:"backendTransfer"`
	// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
	//
	// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
	// the Equinix Metal API). It can be updated.
	BgpConfig *ProjectBgpConfig `pulumi:"bgpConfig"`
	// The name of the project.  The maximum length is 80 characters
	Name *string `pulumi:"name"`
	// The UUID of organization under which you want to create the project. If you
	// leave it out, the project will be created under your the default organization of your account.
	OrganizationId *string `pulumi:"organizationId"`
	// The UUID of payment method for this project. The payment method and the
	// project need to belong to the same organization (passed with `organizationId`, or default).
	PaymentMethodId *string `pulumi:"paymentMethodId"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
	BackendTransfer pulumi.BoolPtrInput
	// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
	//
	// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
	// the Equinix Metal API). It can be updated.
	BgpConfig ProjectBgpConfigPtrInput
	// The name of the project.  The maximum length is 80 characters
	Name pulumi.StringPtrInput
	// The UUID of organization under which you want to create the project. If you
	// leave it out, the project will be created under your the default organization of your account.
	OrganizationId pulumi.StringPtrInput
	// The UUID of payment method for this project. The payment method and the
	// project need to belong to the same organization (passed with `organizationId`, or default).
	PaymentMethodId pulumi.StringPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
func (o ProjectOutput) BackendTransfer() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.BackendTransfer }).(pulumi.BoolOutput)
}

// Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
//
// > **NOTE:** Once you set the BGP config in a project, it can't be removed (due to a limitation in
// the Equinix Metal API). It can be updated.
func (o ProjectOutput) BgpConfig() ProjectBgpConfigPtrOutput {
	return o.ApplyT(func(v *Project) ProjectBgpConfigPtrOutput { return v.BgpConfig }).(ProjectBgpConfigPtrOutput)
}

// The timestamp for when the project was created.
func (o ProjectOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The name of the project.  The maximum length is 80 characters
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The UUID of organization under which you want to create the project. If you
// leave it out, the project will be created under your the default organization of your account.
func (o ProjectOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// The UUID of payment method for this project. The payment method and the
// project need to belong to the same organization (passed with `organizationId`, or default).
func (o ProjectOutput) PaymentMethodId() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.PaymentMethodId }).(pulumi.StringOutput)
}

// The timestamp for the last time the project was updated.
func (o ProjectOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
