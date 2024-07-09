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
 * Fabric V4 API compatible resource allows creation and management of [Equinix Fabric Cloud Router](https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks).
 * 
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers
 * 
 * ## Example Usage
 * <pre>
 * {@code
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
 *         final var metro = config.get("metro").orElse("FR");
 *         final var accountNum = config.get("accountNum");
 *         var router = new CloudRouter("router", CloudRouterArgs.builder()        
 *             .name("My-Fabric-Cloud-Router")
 *             .type("XF_ROUTER")
 *             .location(CloudRouterLocationArgs.builder()
 *                 .metroCode(metro)
 *                 .build())
 *             .package_(CloudRouterPackageArgs.builder()
 *                 .code("BASIC")
 *                 .build())
 *             .notifications(CloudRouterNotificationArgs.builder()
 *                 .type("ALL")
 *                 .emails("example{@literal @}equinix.com")
 *                 .build())
 *             .account(CloudRouterAccountArgs.builder()
 *                 .accountNumber(272010)
 *                 .build())
 *             .project(CloudRouterProjectArgs.builder()
 *                 .projectId("995072000433550")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("routerId", router.id());
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:fabric/cloudRouter:CloudRouter")
public class CloudRouter extends com.pulumi.resources.CustomResource {
    /**
     * Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    @Export(name="account", refs={CloudRouterAccount.class}, tree="[0]")
    private Output<CloudRouterAccount> account;

    /**
     * @return Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    public Output<CloudRouterAccount> account() {
        return this.account;
    }
    /**
     * Number of IPv4 BGP routes in use (including non-distinct prefixes)
     * 
     */
    @Export(name="bgpIpv4RoutesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgpIpv4RoutesCount;

    /**
     * @return Number of IPv4 BGP routes in use (including non-distinct prefixes)
     * 
     */
    public Output<Integer> bgpIpv4RoutesCount() {
        return this.bgpIpv4RoutesCount;
    }
    /**
     * Number of IPv6 BGP routes in use (including non-distinct prefixes)
     * 
     */
    @Export(name="bgpIpv6RoutesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgpIpv6RoutesCount;

    /**
     * @return Number of IPv6 BGP routes in use (including non-distinct prefixes)
     * 
     */
    public Output<Integer> bgpIpv6RoutesCount() {
        return this.bgpIpv6RoutesCount;
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
     * Number of connections associated with this Fabric Cloud Router instance
     * 
     */
    @Export(name="connectionsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> connectionsCount;

    /**
     * @return Number of connections associated with this Fabric Cloud Router instance
     * 
     */
    public Output<Integer> connectionsCount() {
        return this.connectionsCount;
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
     * Number of distinct IPv4 routes
     * 
     */
    @Export(name="distinctIpv4PrefixesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> distinctIpv4PrefixesCount;

    /**
     * @return Number of distinct IPv4 routes
     * 
     */
    public Output<Integer> distinctIpv4PrefixesCount() {
        return this.distinctIpv4PrefixesCount;
    }
    /**
     * Number of distinct IPv6 routes
     * 
     */
    @Export(name="distinctIpv6PrefixesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> distinctIpv6PrefixesCount;

    /**
     * @return Number of distinct IPv6 routes
     * 
     */
    public Output<Integer> distinctIpv6PrefixesCount() {
        return this.distinctIpv6PrefixesCount;
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
     * Fabric Cloud Router URI information
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Fabric Cloud Router URI information
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
    private Output<CloudRouterOrder> order;

    /**
     * @return Order information related to this Fabric Cloud Router
     * 
     */
    public Output<CloudRouterOrder> order() {
        return this.order;
    }
    /**
     * Fabric Cloud Router Package Type
     * 
     */
    @Export(name="package", refs={CloudRouterPackage.class}, tree="[0]")
    private Output<CloudRouterPackage> package_;

    /**
     * @return Fabric Cloud Router Package Type
     * 
     */
    public Output<CloudRouterPackage> package_() {
        return this.package_;
    }
    /**
     * Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
     * 
     */
    @Export(name="project", refs={CloudRouterProject.class}, tree="[0]")
    private Output<CloudRouterProject> project;

    /**
     * @return Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
     * 
     */
    public Output<CloudRouterProject> project() {
        return this.project;
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
     * Defines the FCR type like; XF_ROUTER
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Defines the FCR type like; XF_ROUTER
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
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
