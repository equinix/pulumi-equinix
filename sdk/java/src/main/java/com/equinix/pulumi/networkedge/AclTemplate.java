// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.networkedge.AclTemplateArgs;
import com.equinix.pulumi.networkedge.inputs.AclTemplateState;
import com.equinix.pulumi.networkedge.outputs.AclTemplateDeviceDetail;
import com.equinix.pulumi.networkedge.outputs.AclTemplateInboundRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource `equinix.networkedge.AclTemplate` allows creation and management of Equinix Network Edge device Access Control List templates.
 * 
 * Device ACL templates give possibility to define set of rules will allowed inbound traffic. Templates can be assigned to the network devices.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.equinix.pulumi.networkedge.AclTemplate;
 * import com.equinix.pulumi.networkedge.AclTemplateArgs;
 * import com.equinix.pulumi.networkedge.inputs.AclTemplateInboundRuleArgs;
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
 *         var aclTemplate = new AclTemplate(&#34;aclTemplate&#34;, AclTemplateArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .description(&#34;Test ACL template&#34;)
 *             .inboundRules(            
 *                 AclTemplateInboundRuleArgs.builder()
 *                     .subnet(&#34;1.1.1.1/32&#34;)
 *                     .protocol(&#34;IP&#34;)
 *                     .srcPort(&#34;any&#34;)
 *                     .dstPort(&#34;any&#34;)
 *                     .description(&#34;inbound rule description&#34;)
 *                     .build(),
 *                 AclTemplateInboundRuleArgs.builder()
 *                     .subnet(&#34;2.2.2.2/28&#34;)
 *                     .protocol(&#34;TCP&#34;)
 *                     .srcPort(&#34;any&#34;)
 *                     .dstPort(&#34;any&#34;)
 *                     .description(&#34;inbound rule description&#34;)
 *                     .build())
 *             .build());
 * 
 *         ctx.export(&#34;templateId&#34;, aclTemplate.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing ID:
 * 
 * ```sh
 * $ pulumi import equinix:networkedge/aclTemplate:AclTemplate example {existing_id}
 * ```
 * 
 */
@ResourceType(type="equinix:networkedge/aclTemplate:AclTemplate")
public class AclTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Inbound rule description, up to 200 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Inbound rule description, up to 200 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    @Export(name="deviceAclStatus", refs={String.class}, tree="[0]")
    private Output<String> deviceAclStatus;

    /**
     * @return Status of ACL template provisioning process, where template was applied. One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    public Output<String> deviceAclStatus() {
        return this.deviceAclStatus;
    }
    /**
     * List of the devices where the ACL template is applied.
     * 
     */
    @Export(name="deviceDetails", refs={List.class,AclTemplateDeviceDetail.class}, tree="[0,1]")
    private Output<List<AclTemplateDeviceDetail>> deviceDetails;

    /**
     * @return List of the devices where the ACL template is applied.
     * 
     */
    public Output<List<AclTemplateDeviceDetail>> deviceDetails() {
        return this.deviceDetails;
    }
    /**
     * (Deprecated) Identifier of a network device where template was applied.
     * 
     * @deprecated
     * Refer to device details get device information
     * 
     */
    @Deprecated /* Refer to device details get device information */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return (Deprecated) Identifier of a network device where template was applied.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    @Export(name="inboundRules", refs={List.class,AclTemplateInboundRule.class}, tree="[0,1]")
    private Output<List<AclTemplateInboundRule>> inboundRules;

    /**
     * @return One or more rules to specify allowed inbound traffic. Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    public Output<List<AclTemplateInboundRule>> inboundRules() {
        return this.inboundRules;
    }
    /**
     * ACL template location metro code.
     * 
     * @deprecated
     * Metro Code is no longer required
     * 
     */
    @Deprecated /* Metro Code is no longer required */
    @Export(name="metroCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metroCode;

    /**
     * @return ACL template location metro code.
     * 
     */
    public Output<Optional<String>> metroCode() {
        return Codegen.optional(this.metroCode);
    }
    /**
     * ACL template name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return ACL template name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique Identifier for the project resource where the acl template is scoped to.If you leave it out, the ACL template will be created under the default project id of your organization.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Device uuid.
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Device uuid.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AclTemplate(String name) {
        this(name, AclTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AclTemplate(String name, AclTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AclTemplate(String name, AclTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/aclTemplate:AclTemplate", name, args == null ? AclTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AclTemplate(String name, Output<String> id, @Nullable AclTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/aclTemplate:AclTemplate", name, state, makeResourceOptions(options, id));
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
    public static AclTemplate get(String name, Output<String> id, @Nullable AclTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AclTemplate(name, id, state, options);
    }
}
