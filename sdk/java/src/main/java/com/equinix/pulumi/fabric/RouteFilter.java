// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.RouteFilterArgs;
import com.equinix.pulumi.fabric.inputs.RouteFilterState;
import com.equinix.pulumi.fabric.outputs.RouteFilterChange;
import com.equinix.pulumi.fabric.outputs.RouteFilterChangeLog;
import com.equinix.pulumi.fabric.outputs.RouteFilterProject;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Route Filter Policy
 * 
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
 * 
 */
@ResourceType(type="equinix:fabric/routeFilter:RouteFilter")
public class RouteFilter extends com.pulumi.resources.CustomResource {
    @Export(name="changeLogs", refs={List.class,RouteFilterChangeLog.class}, tree="[0,1]")
    private Output<List<RouteFilterChangeLog>> changeLogs;

    public Output<List<RouteFilterChangeLog>> changeLogs() {
        return this.changeLogs;
    }
    /**
     * An object with the details of the previous change applied on the Route Filter
     * 
     */
    @Export(name="changes", refs={List.class,RouteFilterChange.class}, tree="[0,1]")
    private Output<List<RouteFilterChange>> changes;

    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    public Output<List<RouteFilterChange>> changes() {
        return this.changes;
    }
    /**
     * The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    @Export(name="connectionsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> connectionsCount;

    /**
     * @return The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    public Output<Integer> connectionsCount() {
        return this.connectionsCount;
    }
    /**
     * Optional description to add to the Route Filter you will be creating
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Route filter URI
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Route filter URI
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Name of the Route Filter
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Route Filter
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    @Export(name="notMatchedRuleAction", refs={String.class}, tree="[0]")
    private Output<String> notMatchedRuleAction;

    /**
     * @return The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    public Output<String> notMatchedRuleAction() {
        return this.notMatchedRuleAction;
    }
    /**
     * The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    @Export(name="project", refs={RouteFilterProject.class}, tree="[0]")
    private Output<RouteFilterProject> project;

    /**
     * @return The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    public Output<RouteFilterProject> project() {
        return this.project;
    }
    /**
     * The number of Route Filter Rules attached to this Route Filter
     * 
     */
    @Export(name="rulesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> rulesCount;

    /**
     * @return The number of Route Filter Rules attached to this Route Filter
     * 
     */
    public Output<Integer> rulesCount() {
        return this.rulesCount;
    }
    /**
     * State of the Route Filter in its lifecycle
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the Route Filter in its lifecycle
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix Assigned ID for Route Filter
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix Assigned ID for Route Filter
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteFilter(java.lang.String name) {
        this(name, RouteFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteFilter(java.lang.String name, RouteFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteFilter(java.lang.String name, RouteFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/routeFilter:RouteFilter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouteFilter(java.lang.String name, Output<java.lang.String> id, @Nullable RouteFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/routeFilter:RouteFilter", name, state, makeResourceOptions(options, id), false);
    }

    private static RouteFilterArgs makeArgs(RouteFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouteFilterArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static RouteFilter get(java.lang.String name, Output<java.lang.String> id, @Nullable RouteFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteFilter(name, id, state, options);
    }
}