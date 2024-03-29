// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    /// <summary>
    /// Provides an Equinix Metal project SSH key resource to manage project-specific SSH keys.
    /// Project SSH keys will only be populated onto servers that belong to that project, in contrast to
    /// User SSH Keys.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var projectId = config.Require("projectId");
    ///     var sshKey = new Equinix.Metal.ProjectSshKey("sshKey", new()
    ///     {
    ///         ProjectId = projectId,
    ///         Name = "johnKent",
    ///         PublicKey = File.ReadAllText("/Users/John/.ssh/metal_rsa.pub"),
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["sshKeyId"] = sshKey.Id,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/projectSshKey:ProjectSshKey")]
    public partial class ProjectSshKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp for when the SSH key was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The fingerprint of the SSH key.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// The name of the SSH key for identification.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of parent project (same as project_id).
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// The ID of parent project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The public key. If this is a file, it can be read using the file interpolation function.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// The timestamp for the last time the SSH key was updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectSshKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectSshKey(string name, ProjectSshKeyArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/projectSshKey:ProjectSshKey", name, args ?? new ProjectSshKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectSshKey(string name, Input<string> id, ProjectSshKeyState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/projectSshKey:ProjectSshKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProjectSshKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectSshKey Get(string name, Input<string> id, ProjectSshKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectSshKey(name, id, state, options);
        }
    }

    public sealed class ProjectSshKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the SSH key for identification.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of parent project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The public key. If this is a file, it can be read using the file interpolation function.
        /// </summary>
        [Input("publicKey", required: true)]
        public Input<string> PublicKey { get; set; } = null!;

        public ProjectSshKeyArgs()
        {
        }
        public static new ProjectSshKeyArgs Empty => new ProjectSshKeyArgs();
    }

    public sealed class ProjectSshKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp for when the SSH key was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The fingerprint of the SSH key.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// The name of the SSH key for identification.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of parent project (same as project_id).
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// The ID of parent project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The public key. If this is a file, it can be read using the file interpolation function.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The timestamp for the last time the SSH key was updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        public ProjectSshKeyState()
        {
        }
        public static new ProjectSshKeyState Empty => new ProjectSshKeyState();
    }
}
