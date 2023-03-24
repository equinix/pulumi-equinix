// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal;

import com.equinix.pulumi.equinix.Utilities;
import com.equinix.pulumi.equinix.metal.OrganizationMemberArgs;
import com.equinix.pulumi.equinix.metal.inputs.OrganizationMemberState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage the membership of existing and new invitees within an Equinix Metal organization and its projects.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.OrganizationMember;
 * import com.pulumi.equinix.metal.OrganizationMemberArgs;
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
 *         final var config = ctx.config();
 *         final var organizationId = config.get(&#34;organizationId&#34;);
 *         final var projectId = config.get(&#34;projectId&#34;);
 *         final var userEmailAddress = config.get(&#34;userEmailAddress&#34;);
 *         var member = new OrganizationMember(&#34;member&#34;, OrganizationMemberArgs.builder()        
 *             .invitee(userEmailAddress)
 *             .roles(&#34;limited_collaborator&#34;)
 *             .projectsIds(projectId)
 *             .organizationId(organizationId)
 *             .build());
 * 
 *         ctx.export(&#34;memberId&#34;, member.id());
 *         ctx.export(&#34;memberState&#34;, member.state());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using the `invitee` and `organization_id` as colon separated arguments: &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import equinix:metal/organizationMember:OrganizationMember resource_name {invitee}:{organization_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
 * 
 */
@ResourceType(type="equinix:metal/organizationMember:OrganizationMember")
public class OrganizationMember extends com.pulumi.resources.CustomResource {
    /**
     * When the invitation was created (only known in the invitation stage)
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When the invitation was created (only known in the invitation stage)
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The user_id of the user that sent the invitation (only known in the invitation stage)
     * 
     */
    @Export(name="invitedBy", refs={String.class}, tree="[0]")
    private Output<String> invitedBy;

    /**
     * @return The user_id of the user that sent the invitation (only known in the invitation stage)
     * 
     */
    public Output<String> invitedBy() {
        return this.invitedBy;
    }
    /**
     * The email address of the user to invite
     * 
     */
    @Export(name="invitee", refs={String.class}, tree="[0]")
    private Output<String> invitee;

    /**
     * @return The email address of the user to invite
     * 
     */
    public Output<String> invitee() {
        return this.invitee;
    }
    /**
     * A message to include in the emailed invitation.
     * 
     */
    @Export(name="message", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> message;

    /**
     * @return A message to include in the emailed invitation.
     * 
     */
    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }
    /**
     * The nonce for the invitation (only known in the invitation stage)
     * 
     */
    @Export(name="nonce", refs={String.class}, tree="[0]")
    private Output<String> nonce;

    /**
     * @return The nonce for the invitation (only known in the invitation stage)
     * 
     */
    public Output<String> nonce() {
        return this.nonce;
    }
    /**
     * The organization to invite the user to
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization to invite the user to
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Project IDs the member has access to within the organization. If the member is an &#39;admin&#39;, the projects list should be empty.
     * 
     */
    @Export(name="projectsIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> projectsIds;

    /**
     * @return Project IDs the member has access to within the organization. If the member is an &#39;admin&#39;, the projects list should be empty.
     * 
     */
    public Output<List<String>> projectsIds() {
        return this.projectsIds;
    }
    /**
     * Organization roles (admin, collaborator, limited_collaborator, billing)
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return Organization roles (admin, collaborator, limited_collaborator, billing)
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The state of the membership (&#39;invited&#39; when an invitation is open, &#39;active&#39; when the user is an organization member)
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the membership (&#39;invited&#39; when an invitation is open, &#39;active&#39; when the user is an organization member)
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * When the invitation was updated (only known in the invitation stage)
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return When the invitation was updated (only known in the invitation stage)
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationMember(String name) {
        this(name, OrganizationMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationMember(String name, OrganizationMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationMember(String name, OrganizationMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/organizationMember:OrganizationMember", name, args == null ? OrganizationMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationMember(String name, Output<String> id, @Nullable OrganizationMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/organizationMember:OrganizationMember", name, state, makeResourceOptions(options, id));
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
    public static OrganizationMember get(String name, Output<String> id, @Nullable OrganizationMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationMember(name, id, state, options);
    }
}
