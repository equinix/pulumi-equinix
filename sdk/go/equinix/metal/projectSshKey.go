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

// Provides an Equinix Metal project SSH key resource to manage project-specific SSH keys. Project SSH keys will only be populated onto servers that belong to that project, in contrast to User SSH Keys.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			projectId := cfg.Require("projectId")
//			sshKey, err := metal.NewProjectSshKey(ctx, "sshKey", &metal.ProjectSshKeyArgs{
//				ProjectId: pulumi.String(projectId),
//				Name:      pulumi.String("johnKent"),
//				PublicKey: readFileOrPanic("/Users/John/.ssh/metal_rsa.pub"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("sshKeyId", sshKey.ID())
//			return nil
//		})
//	}
//
// ```
type ProjectSshKey struct {
	pulumi.CustomResourceState

	// The timestamp for when the SSH key was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The fingerprint of the SSH key.
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// The name of the SSH key for identification.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of parent project (same as project_id).
	OwnerId pulumi.StringOutput `pulumi:"ownerId"`
	// The ID of parent project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The public key. If this is a file, it can be read using the file interpolation function.
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// The timestamp for the last time the SSH key was updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewProjectSshKey registers a new resource with the given unique name, arguments, and options.
func NewProjectSshKey(ctx *pulumi.Context,
	name string, args *ProjectSshKeyArgs, opts ...pulumi.ResourceOption) (*ProjectSshKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.PublicKey == nil {
		return nil, errors.New("invalid value for required argument 'PublicKey'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectSshKey
	err := ctx.RegisterResource("equinix:metal/projectSshKey:ProjectSshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectSshKey gets an existing ProjectSshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectSshKeyState, opts ...pulumi.ResourceOption) (*ProjectSshKey, error) {
	var resource ProjectSshKey
	err := ctx.ReadResource("equinix:metal/projectSshKey:ProjectSshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectSshKey resources.
type projectSshKeyState struct {
	// The timestamp for when the SSH key was created.
	Created *string `pulumi:"created"`
	// The fingerprint of the SSH key.
	Fingerprint *string `pulumi:"fingerprint"`
	// The name of the SSH key for identification.
	Name *string `pulumi:"name"`
	// The ID of parent project (same as project_id).
	OwnerId *string `pulumi:"ownerId"`
	// The ID of parent project.
	ProjectId *string `pulumi:"projectId"`
	// The public key. If this is a file, it can be read using the file interpolation function.
	PublicKey *string `pulumi:"publicKey"`
	// The timestamp for the last time the SSH key was updated.
	Updated *string `pulumi:"updated"`
}

type ProjectSshKeyState struct {
	// The timestamp for when the SSH key was created.
	Created pulumi.StringPtrInput
	// The fingerprint of the SSH key.
	Fingerprint pulumi.StringPtrInput
	// The name of the SSH key for identification.
	Name pulumi.StringPtrInput
	// The ID of parent project (same as project_id).
	OwnerId pulumi.StringPtrInput
	// The ID of parent project.
	ProjectId pulumi.StringPtrInput
	// The public key. If this is a file, it can be read using the file interpolation function.
	PublicKey pulumi.StringPtrInput
	// The timestamp for the last time the SSH key was updated.
	Updated pulumi.StringPtrInput
}

func (ProjectSshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectSshKeyState)(nil)).Elem()
}

type projectSshKeyArgs struct {
	// The name of the SSH key for identification.
	Name *string `pulumi:"name"`
	// The ID of parent project.
	ProjectId string `pulumi:"projectId"`
	// The public key. If this is a file, it can be read using the file interpolation function.
	PublicKey string `pulumi:"publicKey"`
}

// The set of arguments for constructing a ProjectSshKey resource.
type ProjectSshKeyArgs struct {
	// The name of the SSH key for identification.
	Name pulumi.StringPtrInput
	// The ID of parent project.
	ProjectId pulumi.StringInput
	// The public key. If this is a file, it can be read using the file interpolation function.
	PublicKey pulumi.StringInput
}

func (ProjectSshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectSshKeyArgs)(nil)).Elem()
}

type ProjectSshKeyInput interface {
	pulumi.Input

	ToProjectSshKeyOutput() ProjectSshKeyOutput
	ToProjectSshKeyOutputWithContext(ctx context.Context) ProjectSshKeyOutput
}

func (*ProjectSshKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectSshKey)(nil)).Elem()
}

func (i *ProjectSshKey) ToProjectSshKeyOutput() ProjectSshKeyOutput {
	return i.ToProjectSshKeyOutputWithContext(context.Background())
}

func (i *ProjectSshKey) ToProjectSshKeyOutputWithContext(ctx context.Context) ProjectSshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSshKeyOutput)
}

// ProjectSshKeyArrayInput is an input type that accepts ProjectSshKeyArray and ProjectSshKeyArrayOutput values.
// You can construct a concrete instance of `ProjectSshKeyArrayInput` via:
//
//	ProjectSshKeyArray{ ProjectSshKeyArgs{...} }
type ProjectSshKeyArrayInput interface {
	pulumi.Input

	ToProjectSshKeyArrayOutput() ProjectSshKeyArrayOutput
	ToProjectSshKeyArrayOutputWithContext(context.Context) ProjectSshKeyArrayOutput
}

type ProjectSshKeyArray []ProjectSshKeyInput

func (ProjectSshKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectSshKey)(nil)).Elem()
}

func (i ProjectSshKeyArray) ToProjectSshKeyArrayOutput() ProjectSshKeyArrayOutput {
	return i.ToProjectSshKeyArrayOutputWithContext(context.Background())
}

func (i ProjectSshKeyArray) ToProjectSshKeyArrayOutputWithContext(ctx context.Context) ProjectSshKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSshKeyArrayOutput)
}

// ProjectSshKeyMapInput is an input type that accepts ProjectSshKeyMap and ProjectSshKeyMapOutput values.
// You can construct a concrete instance of `ProjectSshKeyMapInput` via:
//
//	ProjectSshKeyMap{ "key": ProjectSshKeyArgs{...} }
type ProjectSshKeyMapInput interface {
	pulumi.Input

	ToProjectSshKeyMapOutput() ProjectSshKeyMapOutput
	ToProjectSshKeyMapOutputWithContext(context.Context) ProjectSshKeyMapOutput
}

type ProjectSshKeyMap map[string]ProjectSshKeyInput

func (ProjectSshKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectSshKey)(nil)).Elem()
}

func (i ProjectSshKeyMap) ToProjectSshKeyMapOutput() ProjectSshKeyMapOutput {
	return i.ToProjectSshKeyMapOutputWithContext(context.Background())
}

func (i ProjectSshKeyMap) ToProjectSshKeyMapOutputWithContext(ctx context.Context) ProjectSshKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectSshKeyMapOutput)
}

type ProjectSshKeyOutput struct{ *pulumi.OutputState }

func (ProjectSshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectSshKey)(nil)).Elem()
}

func (o ProjectSshKeyOutput) ToProjectSshKeyOutput() ProjectSshKeyOutput {
	return o
}

func (o ProjectSshKeyOutput) ToProjectSshKeyOutputWithContext(ctx context.Context) ProjectSshKeyOutput {
	return o
}

// The timestamp for when the SSH key was created.
func (o ProjectSshKeyOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The fingerprint of the SSH key.
func (o ProjectSshKeyOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// The name of the SSH key for identification.
func (o ProjectSshKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of parent project (same as project_id).
func (o ProjectSshKeyOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.OwnerId }).(pulumi.StringOutput)
}

// The ID of parent project.
func (o ProjectSshKeyOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The public key. If this is a file, it can be read using the file interpolation function.
func (o ProjectSshKeyOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

// The timestamp for the last time the SSH key was updated.
func (o ProjectSshKeyOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectSshKey) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type ProjectSshKeyArrayOutput struct{ *pulumi.OutputState }

func (ProjectSshKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectSshKey)(nil)).Elem()
}

func (o ProjectSshKeyArrayOutput) ToProjectSshKeyArrayOutput() ProjectSshKeyArrayOutput {
	return o
}

func (o ProjectSshKeyArrayOutput) ToProjectSshKeyArrayOutputWithContext(ctx context.Context) ProjectSshKeyArrayOutput {
	return o
}

func (o ProjectSshKeyArrayOutput) Index(i pulumi.IntInput) ProjectSshKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectSshKey {
		return vs[0].([]*ProjectSshKey)[vs[1].(int)]
	}).(ProjectSshKeyOutput)
}

type ProjectSshKeyMapOutput struct{ *pulumi.OutputState }

func (ProjectSshKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectSshKey)(nil)).Elem()
}

func (o ProjectSshKeyMapOutput) ToProjectSshKeyMapOutput() ProjectSshKeyMapOutput {
	return o
}

func (o ProjectSshKeyMapOutput) ToProjectSshKeyMapOutputWithContext(ctx context.Context) ProjectSshKeyMapOutput {
	return o
}

func (o ProjectSshKeyMapOutput) MapIndex(k pulumi.StringInput) ProjectSshKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectSshKey {
		return vs[0].(map[string]*ProjectSshKey)[vs[1].(string)]
	}).(ProjectSshKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSshKeyInput)(nil)).Elem(), &ProjectSshKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSshKeyArrayInput)(nil)).Elem(), ProjectSshKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectSshKeyMapInput)(nil)).Elem(), ProjectSshKeyMap{})
	pulumi.RegisterOutputType(ProjectSshKeyOutput{})
	pulumi.RegisterOutputType(ProjectSshKeyArrayOutput{})
	pulumi.RegisterOutputType(ProjectSshKeyMapOutput{})
}
