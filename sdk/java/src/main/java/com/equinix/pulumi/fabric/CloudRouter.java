// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.CloudRouterArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterState;
import com.equinix.pulumi.fabric.outputs.CloudRouterAccount;
import com.equinix.pulumi.fabric.outputs.CloudRouterChangeLog;
import com.equinix.pulumi.fabric.outputs.CloudRouterLocation;
import com.equinix.pulumi.fabric.outputs.CloudRouterNotification;
import com.equinix.pulumi.fabric.outputs.CloudRouterOrder;
import com.equinix.pulumi.fabric.outputs.CloudRouterPackage;
import com.equinix.pulumi.fabric.outputs.CloudRouterProject;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.fabric.CloudRouter;
 * import com.pulumi.equinix.fabric.CloudRouterArgs;
 * import com.pulumi.equinix.fabric.inputs.CloudRouterLocationArgs;
 * import com.pulumi.equinix.fabric.inputs.CloudRouterPackageArgs;
 * import com.pulumi.equinix.fabric.inputs.CloudRouterNotificationArgs;
 * import com.pulumi.equinix.fabric.inputs.CloudRouterAccountArgs;
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
 *         final var metro = config.get(&#34;metro&#34;).orElse(&#34;FR&#34;);
 *         final var accountNum = config.get(&#34;accountNum&#34;);
 *         var router = new CloudRouter(&#34;router&#34;, CloudRouterArgs.builder()        
 *             .name(&#34;My-Fabric-Cloud-Router&#34;)
 *             .type(&#34;XF_ROUTER&#34;)
 *             .location(CloudRouterLocationArgs.builder()
 *                 .metroCode(metro)
 *                 .build())
 *             .package_(CloudRouterPackageArgs.builder()
 *                 .code(&#34;BASIC&#34;)
 *                 .build())
 *             .notifications(CloudRouterNotificationArgs.builder()
 *                 .type(&#34;ALL&#34;)
 *                 .emails(&#34;example@equinix.com&#34;)
 *                 .build())
 *             .account(CloudRouterAccountArgs.builder()
 *                 .accountNumber(272010)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;routerId&#34;, router.id());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:fabric/cloudRouter:CloudRouter")
public class CloudRouter extends com.pulumi.resources.CustomResource {
    /**
     * Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    @Export(name="account", refs={CloudRouterAccount.class}, tree="[0]")
    private Output</* @Nullable */ CloudRouterAccount> account;

    /**
     * @return Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    public Output<Optional<CloudRouterAccount>> account() {
        return Codegen.optional(this.account);
    }
    /**
     * Captures Fabric Cloud Router lifecycle change information
     * 
     */
    @Export(name="changeLogs", refs={List.class,CloudRouterChangeLog.class}, tree="[0,1]")
    private Output<List<CloudRouterChangeLog>> changeLogs;

    /**
     * @return Captures Fabric Cloud Router lifecycle change information
     * 
     */
    public Output<List<CloudRouterChangeLog>> changeLogs() {
        return this.changeLogs;
    }
    /**
     * Customer-provided Fabric Cloud Router description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Customer-provided Fabric Cloud Router description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Equinix ASN
     * 
     */
    @Export(name="equinixAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> equinixAsn;

    /**
     * @return Equinix ASN
     * 
     */
    public Output<Integer> equinixAsn() {
        return this.equinixAsn;
    }
    /**
     * Unique Resource URL
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Unique Resource URL
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Fabric Cloud Router location
     * 
     */
    @Export(name="location", refs={CloudRouterLocation.class}, tree="[0]")
    private Output<CloudRouterLocation> location;

    /**
     * @return Fabric Cloud Router location
     * 
     */
    public Output<CloudRouterLocation> location() {
        return this.location;
    }
    /**
     * Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferences for notifications on Fabric Cloud Router configuration or status changes
     * 
     */
    @Export(name="notifications", refs={List.class,CloudRouterNotification.class}, tree="[0,1]")
    private Output<List<CloudRouterNotification>> notifications;

    /**
     * @return Preferences for notifications on Fabric Cloud Router configuration or status changes
     * 
     */
    public Output<List<CloudRouterNotification>> notifications() {
        return this.notifications;
    }
    /**
     * Order information related to this Fabric Cloud Router
     * 
     */
    @Export(name="order", refs={CloudRouterOrder.class}, tree="[0]")
    private Output</* @Nullable */ CloudRouterOrder> order;

    /**
     * @return Order information related to this Fabric Cloud Router
     * 
     */
    public Output<Optional<CloudRouterOrder>> order() {
        return Codegen.optional(this.order);
    }
    /**
     * Fabric Cloud Router package
     * 
     */
    @Export(name="package", refs={CloudRouterPackage.class}, tree="[0]")
    private Output<CloudRouterPackage> package_;

    /**
     * @return Fabric Cloud Router package
     * 
     */
    public Output<CloudRouterPackage> package_() {
        return this.package_;
    }
    /**
     * Fabric Cloud Router project
     * 
     */
    @Export(name="project", refs={CloudRouterProject.class}, tree="[0]")
    private Output</* @Nullable */ CloudRouterProject> project;

    /**
     * @return Fabric Cloud Router project
     * 
     */
    public Output<Optional<CloudRouterProject>> project() {
        return Codegen.optional(this.project);
    }
    /**
     * Fabric Cloud Router overall state
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Fabric Cloud Router overall state
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudRouter(String name) {
        this(name, CloudRouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudRouter(String name, CloudRouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudRouter(String name, CloudRouterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/cloudRouter:CloudRouter", name, args == null ? CloudRouterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudRouter(String name, Output<String> id, @Nullable CloudRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/cloudRouter:CloudRouter", name, state, makeResourceOptions(options, id));
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
    public static CloudRouter get(String name, Output<String> id, @Nullable CloudRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudRouter(name, id, state, options);
    }
}
