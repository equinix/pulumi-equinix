// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.NetworkArgs;
import com.equinix.pulumi.fabric.inputs.NetworkState;
import com.equinix.pulumi.fabric.outputs.NetworkChange;
import com.equinix.pulumi.fabric.outputs.NetworkChangeLog;
import com.equinix.pulumi.fabric.outputs.NetworkLocation;
import com.equinix.pulumi.fabric.outputs.NetworkNotification;
import com.equinix.pulumi.fabric.outputs.NetworkOperation;
import com.equinix.pulumi.fabric.outputs.NetworkProject;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Network
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.fabric.Network;
 * import com.pulumi.equinix.fabric.NetworkArgs;
 * import com.pulumi.equinix.fabric.inputs.NetworkNotificationArgs;
 * import com.pulumi.equinix.fabric.inputs.NetworkProjectArgs;
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
 *         var newNetwork = new Network(&#34;newNetwork&#34;, NetworkArgs.builder()        
 *             .notifications(NetworkNotificationArgs.builder()
 *                 .emails(                
 *                     &#34;example@equinix.com&#34;,
 *                     &#34;test1@equinix.com&#34;)
 *                 .type(&#34;ALL&#34;)
 *                 .build())
 *             .project(NetworkProjectArgs.builder()
 *                 .projectId(&#34;776847000642406&#34;)
 *                 .build())
 *             .scope(&#34;GLOBAL&#34;)
 *             .type(&#34;EVPLAN&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="equinix:fabric/network:Network")
public class Network extends com.pulumi.resources.CustomResource {
    /**
     * Information on asset change operation
     * 
     */
    @Export(name="change", refs={NetworkChange.class}, tree="[0]")
    private Output<NetworkChange> change;

    /**
     * @return Information on asset change operation
     * 
     */
    public Output<NetworkChange> change() {
        return this.change;
    }
    /**
     * A permanent record of asset creation, modification, or deletion
     * 
     */
    @Export(name="changeLog", refs={NetworkChangeLog.class}, tree="[0]")
    private Output<NetworkChangeLog> changeLog;

    /**
     * @return A permanent record of asset creation, modification, or deletion
     * 
     */
    public Output<NetworkChangeLog> changeLog() {
        return this.changeLog;
    }
    /**
     * Number of connections associated with this network
     * 
     */
    @Export(name="connectionsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> connectionsCount;

    /**
     * @return Number of connections associated with this network
     * 
     */
    public Output<Integer> connectionsCount() {
        return this.connectionsCount;
    }
    /**
     * Fabric Network URI information
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Fabric Network URI information
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Fabric Network location
     * 
     */
    @Export(name="location", refs={NetworkLocation.class}, tree="[0]")
    private Output<NetworkLocation> location;

    /**
     * @return Fabric Network location
     * 
     */
    public Output<NetworkLocation> location() {
        return this.location;
    }
    /**
     * Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferences for notifications on Fabric Network configuration or status changes
     * 
     */
    @Export(name="notifications", refs={List.class,NetworkNotification.class}, tree="[0,1]")
    private Output<List<NetworkNotification>> notifications;

    /**
     * @return Preferences for notifications on Fabric Network configuration or status changes
     * 
     */
    public Output<List<NetworkNotification>> notifications() {
        return this.notifications;
    }
    /**
     * Network operation information that is associated with this Fabric Network
     * 
     */
    @Export(name="operation", refs={NetworkOperation.class}, tree="[0]")
    private Output<NetworkOperation> operation;

    /**
     * @return Network operation information that is associated with this Fabric Network
     * 
     */
    public Output<NetworkOperation> operation() {
        return this.operation;
    }
    /**
     * Fabric Network project
     * 
     */
    @Export(name="project", refs={NetworkProject.class}, tree="[0]")
    private Output<NetworkProject> project;

    /**
     * @return Fabric Network project
     * 
     */
    public Output<NetworkProject> project() {
        return this.project;
    }
    /**
     * Fabric Network scope
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return Fabric Network scope
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Fabric Network overall state
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Fabric Network overall state
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Supported Network types - EVPLAN, EPLAN, IPWAN
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Supported Network types - EVPLAN, EPLAN, IPWAN
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix-assigned network identifier
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix-assigned network identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(String name, NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(String name, NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/network:Network", name, args == null ? NetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Network(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/network:Network", name, state, makeResourceOptions(options, id));
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
    public static Network get(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, state, options);
    }
}
