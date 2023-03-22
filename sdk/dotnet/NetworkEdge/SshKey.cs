// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    /// <summary>
    /// Resource `equinix.networkedge.SshKey` allows creation and management of Equinix Network Edge SSH keys.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing ID
    /// 
    /// ```sh
    ///  $ pulumi import equinix:networkedge/sshKey:SshKey example {existing_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:networkedge/sshKey:SshKey")]
    public partial class SshKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of SSH key used for identification.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The SSH public key. If this is a file, it can be read using the file
        /// interpolation function.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the key
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a SshKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshKey(string name, SshKeyArgs args, CustomResourceOptions? options = null)
            : base("equinix:networkedge/sshKey:SshKey", name, args ?? new SshKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshKey(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
            : base("equinix:networkedge/sshKey:SshKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1678463449+7a8d98d9.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SshKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshKey Get(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SshKey(name, id, state, options);
        }
    }

    public sealed class SshKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of SSH key used for identification.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SSH public key. If this is a file, it can be read using the file
        /// interpolation function.
        /// </summary>
        [Input("publicKey", required: true)]
        public Input<string> PublicKey { get; set; } = null!;

        public SshKeyArgs()
        {
        }
        public static new SshKeyArgs Empty => new SshKeyArgs();
    }

    public sealed class SshKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of SSH key used for identification.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SSH public key. If this is a file, it can be read using the file
        /// interpolation function.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The unique identifier of the key
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public SshKeyState()
        {
        }
        public static new SshKeyState Empty => new SshKeyState();
    }
}
