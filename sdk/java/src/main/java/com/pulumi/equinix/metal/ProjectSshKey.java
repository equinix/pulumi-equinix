// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.equinix.Utilities;
import com.pulumi.equinix.metal.ProjectSshKeyArgs;
import com.pulumi.equinix.metal.inputs.ProjectSshKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Equinix Metal project SSH key resource to manage project-specific SSH keys.
 * Project SSH keys will only be populated onto servers that belong to that project, in contrast to
 * User SSH Keys.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.ProjectSshKey;
 * import com.pulumi.equinix.metal.ProjectSshKeyArgs;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var projectId = &#34;&lt;UUID_of_your_project&gt;&#34;;
 * 
 *         var testProjectSshKey = new ProjectSshKey(&#34;testProjectSshKey&#34;, ProjectSshKeyArgs.builder()        
 *             .publicKey(&#34;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2&#34;)
 *             .projectId(projectId)
 *             .build());
 * 
 *         var testDevice = new Device(&#34;testDevice&#34;, DeviceArgs.builder()        
 *             .hostname(&#34;test&#34;)
 *             .plan(&#34;c3.medium.x86&#34;)
 *             .facilities(&#34;ny5&#34;)
 *             .operatingSystem(&#34;ubuntu_20_04&#34;)
 *             .billingCycle(&#34;hourly&#34;)
 *             .projectSshKeyIds(testProjectSshKey.id())
 *             .projectId(projectId)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:metal/projectSshKey:ProjectSshKey")
public class ProjectSshKey extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp for when the SSH key was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The timestamp for when the SSH key was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The fingerprint of the SSH key.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the SSH key.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the SSH key for identification.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the SSH key for identification.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of parent project (same as project_id).
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The ID of parent project (same as project_id).
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The ID of parent project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of parent project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The public key. If this is a file, it can be read using the file interpolation function.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it can be read using the file interpolation function.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The timestamp for the last time the SSH key was updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The timestamp for the last time the SSH key was updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectSshKey(String name) {
        this(name, ProjectSshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectSshKey(String name, ProjectSshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectSshKey(String name, ProjectSshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/projectSshKey:ProjectSshKey", name, args == null ? ProjectSshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectSshKey(String name, Output<String> id, @Nullable ProjectSshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/projectSshKey:ProjectSshKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProjectSshKey get(String name, Output<String> id, @Nullable ProjectSshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectSshKey(name, id, state, options);
    }
}
