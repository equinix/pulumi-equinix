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

// Resource `networkedge.SshKey` allows creation and management of Equinix Network Edge SSH keys.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//			sshKey, err := networkedge.NewSshKey(ctx, "sshKey", &networkedge.SshKeyArgs{
//				Name:      pulumi.String("johnKent"),
//				PublicKey: readFileOrPanic("/Users/John/.ssh/ne_rsa.pub"),
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
//
// ## Import
//
// This resource can be imported using an existing ID:
//
// ```sh
// $ pulumi import equinix:networkedge/sshKey:SshKey example {existing_id}
// ```
type SshKey struct {
	pulumi.CustomResourceState

	// The name of SSH key used for identification.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique Identifier for the project resource where the SSH key is scoped to.If you
	// leave it out, the ssh key will be created under the default project id of your organization.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The SSH public key. If this is a file, it can be read using the file
	// interpolation function.
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// The type of SSH key: `RSA` (default) or `DSA`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The unique identifier of the key
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewSshKey registers a new resource with the given unique name, arguments, and options.
func NewSshKey(ctx *pulumi.Context,
	name string, args *SshKeyArgs, opts ...pulumi.ResourceOption) (*SshKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PublicKey == nil {
		return nil, errors.New("invalid value for required argument 'PublicKey'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SshKey
	err := ctx.RegisterResource("equinix:networkedge/sshKey:SshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshKey gets an existing SshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshKeyState, opts ...pulumi.ResourceOption) (*SshKey, error) {
	var resource SshKey
	err := ctx.ReadResource("equinix:networkedge/sshKey:SshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshKey resources.
type sshKeyState struct {
	// The name of SSH key used for identification.
	Name *string `pulumi:"name"`
	// Unique Identifier for the project resource where the SSH key is scoped to.If you
	// leave it out, the ssh key will be created under the default project id of your organization.
	ProjectId *string `pulumi:"projectId"`
	// The SSH public key. If this is a file, it can be read using the file
	// interpolation function.
	PublicKey *string `pulumi:"publicKey"`
	// The type of SSH key: `RSA` (default) or `DSA`.
	Type *string `pulumi:"type"`
	// The unique identifier of the key
	Uuid *string `pulumi:"uuid"`
}

type SshKeyState struct {
	// The name of SSH key used for identification.
	Name pulumi.StringPtrInput
	// Unique Identifier for the project resource where the SSH key is scoped to.If you
	// leave it out, the ssh key will be created under the default project id of your organization.
	ProjectId pulumi.StringPtrInput
	// The SSH public key. If this is a file, it can be read using the file
	// interpolation function.
	PublicKey pulumi.StringPtrInput
	// The type of SSH key: `RSA` (default) or `DSA`.
	Type pulumi.StringPtrInput
	// The unique identifier of the key
	Uuid pulumi.StringPtrInput
}

func (SshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyState)(nil)).Elem()
}

type sshKeyArgs struct {
	// The name of SSH key used for identification.
	Name *string `pulumi:"name"`
	// Unique Identifier for the project resource where the SSH key is scoped to.If you
	// leave it out, the ssh key will be created under the default project id of your organization.
	ProjectId *string `pulumi:"projectId"`
	// The SSH public key. If this is a file, it can be read using the file
	// interpolation function.
	PublicKey string `pulumi:"publicKey"`
	// The type of SSH key: `RSA` (default) or `DSA`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// The name of SSH key used for identification.
	Name pulumi.StringPtrInput
	// Unique Identifier for the project resource where the SSH key is scoped to.If you
	// leave it out, the ssh key will be created under the default project id of your organization.
	ProjectId pulumi.StringPtrInput
	// The SSH public key. If this is a file, it can be read using the file
	// interpolation function.
	PublicKey pulumi.StringInput
	// The type of SSH key: `RSA` (default) or `DSA`.
	Type pulumi.StringPtrInput
}

func (SshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyArgs)(nil)).Elem()
}

type SshKeyInput interface {
	pulumi.Input

	ToSshKeyOutput() SshKeyOutput
	ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput
}

func (*SshKey) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (i *SshKey) ToSshKeyOutput() SshKeyOutput {
	return i.ToSshKeyOutputWithContext(context.Background())
}

func (i *SshKey) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyOutput)
}

// SshKeyArrayInput is an input type that accepts SshKeyArray and SshKeyArrayOutput values.
// You can construct a concrete instance of `SshKeyArrayInput` via:
//
//	SshKeyArray{ SshKeyArgs{...} }
type SshKeyArrayInput interface {
	pulumi.Input

	ToSshKeyArrayOutput() SshKeyArrayOutput
	ToSshKeyArrayOutputWithContext(context.Context) SshKeyArrayOutput
}

type SshKeyArray []SshKeyInput

func (SshKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
}

func (i SshKeyArray) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return i.ToSshKeyArrayOutputWithContext(context.Background())
}

func (i SshKeyArray) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyArrayOutput)
}

// SshKeyMapInput is an input type that accepts SshKeyMap and SshKeyMapOutput values.
// You can construct a concrete instance of `SshKeyMapInput` via:
//
//	SshKeyMap{ "key": SshKeyArgs{...} }
type SshKeyMapInput interface {
	pulumi.Input

	ToSshKeyMapOutput() SshKeyMapOutput
	ToSshKeyMapOutputWithContext(context.Context) SshKeyMapOutput
}

type SshKeyMap map[string]SshKeyInput

func (SshKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (i SshKeyMap) ToSshKeyMapOutput() SshKeyMapOutput {
	return i.ToSshKeyMapOutputWithContext(context.Background())
}

func (i SshKeyMap) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyMapOutput)
}

type SshKeyOutput struct{ *pulumi.OutputState }

func (SshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (o SshKeyOutput) ToSshKeyOutput() SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return o
}

// The name of SSH key used for identification.
func (o SshKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique Identifier for the project resource where the SSH key is scoped to.If you
// leave it out, the ssh key will be created under the default project id of your organization.
func (o SshKeyOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The SSH public key. If this is a file, it can be read using the file
// interpolation function.
func (o SshKeyOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

// The type of SSH key: `RSA` (default) or `DSA`.
func (o SshKeyOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The unique identifier of the key
func (o SshKeyOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type SshKeyArrayOutput struct{ *pulumi.OutputState }

func (SshKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) Index(i pulumi.IntInput) SshKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].([]*SshKey)[vs[1].(int)]
	}).(SshKeyOutput)
}

type SshKeyMapOutput struct{ *pulumi.OutputState }

func (SshKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (o SshKeyMapOutput) ToSshKeyMapOutput() SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) MapIndex(k pulumi.StringInput) SshKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].(map[string]*SshKey)[vs[1].(string)]
	}).(SshKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyInput)(nil)).Elem(), &SshKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyArrayInput)(nil)).Elem(), SshKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyMapInput)(nil)).Elem(), SshKeyMap{})
	pulumi.RegisterOutputType(SshKeyOutput{})
	pulumi.RegisterOutputType(SshKeyArrayOutput{})
	pulumi.RegisterOutputType(SshKeyMapOutput{})
}
