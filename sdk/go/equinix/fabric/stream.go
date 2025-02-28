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

// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Stream
//
// Additional Documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
// * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
type Stream struct {
	pulumi.CustomResourceState

	// Count of the streaming assets attached to the stream resource
	AssetsCount pulumi.Float64Output `pulumi:"assetsCount"`
	// Details of the last change on the stream resource
	ChangeLog StreamChangeLogOutput `pulumi:"changeLog"`
	// Customer-provided description of the stream resource
	Description pulumi.StringOutput `pulumi:"description"`
	// Equinix auto generated URI to the stream resource in Equinix Portal
	Href pulumi.StringOutput `pulumi:"href"`
	// Customer-provided name of the stream resource
	Name pulumi.StringOutput `pulumi:"name"`
	// Equinix Project attribute object
	Project StreamProjectOutput `pulumi:"project"`
	// Value representing provisioning status for the stream resource
	State pulumi.StringOutput `pulumi:"state"`
	// Count of the client subscriptions on the stream resource
	StreamSubscriptionsCount pulumi.Float64Output    `pulumi:"streamSubscriptionsCount"`
	Timeouts                 StreamTimeoutsPtrOutput `pulumi:"timeouts"`
	// Equinix defined Streaming Type
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix-assigned unique id for the stream resource
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewStream registers a new resource with the given unique name, arguments, and options.
func NewStream(ctx *pulumi.Context,
	name string, args *StreamArgs, opts ...pulumi.ResourceOption) (*Stream, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Stream
	err := ctx.RegisterResource("equinix:fabric/stream:Stream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStream gets an existing Stream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamState, opts ...pulumi.ResourceOption) (*Stream, error) {
	var resource Stream
	err := ctx.ReadResource("equinix:fabric/stream:Stream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stream resources.
type streamState struct {
	// Count of the streaming assets attached to the stream resource
	AssetsCount *float64 `pulumi:"assetsCount"`
	// Details of the last change on the stream resource
	ChangeLog *StreamChangeLog `pulumi:"changeLog"`
	// Customer-provided description of the stream resource
	Description *string `pulumi:"description"`
	// Equinix auto generated URI to the stream resource in Equinix Portal
	Href *string `pulumi:"href"`
	// Customer-provided name of the stream resource
	Name *string `pulumi:"name"`
	// Equinix Project attribute object
	Project *StreamProject `pulumi:"project"`
	// Value representing provisioning status for the stream resource
	State *string `pulumi:"state"`
	// Count of the client subscriptions on the stream resource
	StreamSubscriptionsCount *float64        `pulumi:"streamSubscriptionsCount"`
	Timeouts                 *StreamTimeouts `pulumi:"timeouts"`
	// Equinix defined Streaming Type
	Type *string `pulumi:"type"`
	// Equinix-assigned unique id for the stream resource
	Uuid *string `pulumi:"uuid"`
}

type StreamState struct {
	// Count of the streaming assets attached to the stream resource
	AssetsCount pulumi.Float64PtrInput
	// Details of the last change on the stream resource
	ChangeLog StreamChangeLogPtrInput
	// Customer-provided description of the stream resource
	Description pulumi.StringPtrInput
	// Equinix auto generated URI to the stream resource in Equinix Portal
	Href pulumi.StringPtrInput
	// Customer-provided name of the stream resource
	Name pulumi.StringPtrInput
	// Equinix Project attribute object
	Project StreamProjectPtrInput
	// Value representing provisioning status for the stream resource
	State pulumi.StringPtrInput
	// Count of the client subscriptions on the stream resource
	StreamSubscriptionsCount pulumi.Float64PtrInput
	Timeouts                 StreamTimeoutsPtrInput
	// Equinix defined Streaming Type
	Type pulumi.StringPtrInput
	// Equinix-assigned unique id for the stream resource
	Uuid pulumi.StringPtrInput
}

func (StreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamState)(nil)).Elem()
}

type streamArgs struct {
	// Customer-provided description of the stream resource
	Description string `pulumi:"description"`
	// Customer-provided name of the stream resource
	Name *string `pulumi:"name"`
	// Equinix Project attribute object
	Project  *StreamProject  `pulumi:"project"`
	Timeouts *StreamTimeouts `pulumi:"timeouts"`
	// Equinix defined Streaming Type
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Stream resource.
type StreamArgs struct {
	// Customer-provided description of the stream resource
	Description pulumi.StringInput
	// Customer-provided name of the stream resource
	Name pulumi.StringPtrInput
	// Equinix Project attribute object
	Project  StreamProjectPtrInput
	Timeouts StreamTimeoutsPtrInput
	// Equinix defined Streaming Type
	Type pulumi.StringInput
}

func (StreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamArgs)(nil)).Elem()
}

type StreamInput interface {
	pulumi.Input

	ToStreamOutput() StreamOutput
	ToStreamOutputWithContext(ctx context.Context) StreamOutput
}

func (*Stream) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (i *Stream) ToStreamOutput() StreamOutput {
	return i.ToStreamOutputWithContext(context.Background())
}

func (i *Stream) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamOutput)
}

// StreamArrayInput is an input type that accepts StreamArray and StreamArrayOutput values.
// You can construct a concrete instance of `StreamArrayInput` via:
//
//	StreamArray{ StreamArgs{...} }
type StreamArrayInput interface {
	pulumi.Input

	ToStreamArrayOutput() StreamArrayOutput
	ToStreamArrayOutputWithContext(context.Context) StreamArrayOutput
}

type StreamArray []StreamInput

func (StreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (i StreamArray) ToStreamArrayOutput() StreamArrayOutput {
	return i.ToStreamArrayOutputWithContext(context.Background())
}

func (i StreamArray) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamArrayOutput)
}

// StreamMapInput is an input type that accepts StreamMap and StreamMapOutput values.
// You can construct a concrete instance of `StreamMapInput` via:
//
//	StreamMap{ "key": StreamArgs{...} }
type StreamMapInput interface {
	pulumi.Input

	ToStreamMapOutput() StreamMapOutput
	ToStreamMapOutputWithContext(context.Context) StreamMapOutput
}

type StreamMap map[string]StreamInput

func (StreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (i StreamMap) ToStreamMapOutput() StreamMapOutput {
	return i.ToStreamMapOutputWithContext(context.Background())
}

func (i StreamMap) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamMapOutput)
}

type StreamOutput struct{ *pulumi.OutputState }

func (StreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stream)(nil)).Elem()
}

func (o StreamOutput) ToStreamOutput() StreamOutput {
	return o
}

func (o StreamOutput) ToStreamOutputWithContext(ctx context.Context) StreamOutput {
	return o
}

// Count of the streaming assets attached to the stream resource
func (o StreamOutput) AssetsCount() pulumi.Float64Output {
	return o.ApplyT(func(v *Stream) pulumi.Float64Output { return v.AssetsCount }).(pulumi.Float64Output)
}

// Details of the last change on the stream resource
func (o StreamOutput) ChangeLog() StreamChangeLogOutput {
	return o.ApplyT(func(v *Stream) StreamChangeLogOutput { return v.ChangeLog }).(StreamChangeLogOutput)
}

// Customer-provided description of the stream resource
func (o StreamOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Equinix auto generated URI to the stream resource in Equinix Portal
func (o StreamOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Customer-provided name of the stream resource
func (o StreamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Equinix Project attribute object
func (o StreamOutput) Project() StreamProjectOutput {
	return o.ApplyT(func(v *Stream) StreamProjectOutput { return v.Project }).(StreamProjectOutput)
}

// Value representing provisioning status for the stream resource
func (o StreamOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Count of the client subscriptions on the stream resource
func (o StreamOutput) StreamSubscriptionsCount() pulumi.Float64Output {
	return o.ApplyT(func(v *Stream) pulumi.Float64Output { return v.StreamSubscriptionsCount }).(pulumi.Float64Output)
}

func (o StreamOutput) Timeouts() StreamTimeoutsPtrOutput {
	return o.ApplyT(func(v *Stream) StreamTimeoutsPtrOutput { return v.Timeouts }).(StreamTimeoutsPtrOutput)
}

// Equinix defined Streaming Type
func (o StreamOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned unique id for the stream resource
func (o StreamOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Stream) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type StreamArrayOutput struct{ *pulumi.OutputState }

func (StreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stream)(nil)).Elem()
}

func (o StreamArrayOutput) ToStreamArrayOutput() StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) ToStreamArrayOutputWithContext(ctx context.Context) StreamArrayOutput {
	return o
}

func (o StreamArrayOutput) Index(i pulumi.IntInput) StreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].([]*Stream)[vs[1].(int)]
	}).(StreamOutput)
}

type StreamMapOutput struct{ *pulumi.OutputState }

func (StreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stream)(nil)).Elem()
}

func (o StreamMapOutput) ToStreamMapOutput() StreamMapOutput {
	return o
}

func (o StreamMapOutput) ToStreamMapOutputWithContext(ctx context.Context) StreamMapOutput {
	return o
}

func (o StreamMapOutput) MapIndex(k pulumi.StringInput) StreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stream {
		return vs[0].(map[string]*Stream)[vs[1].(string)]
	}).(StreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInput)(nil)).Elem(), &Stream{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamArrayInput)(nil)).Elem(), StreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamMapInput)(nil)).Elem(), StreamMap{})
	pulumi.RegisterOutputType(StreamOutput{})
	pulumi.RegisterOutputType(StreamArrayOutput{})
	pulumi.RegisterOutputType(StreamMapOutput{})
}
