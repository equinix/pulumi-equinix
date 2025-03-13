// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.ServiceProfileArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileState;
import com.equinix.pulumi.fabric.outputs.ServiceProfileAccessPointTypeConfig;
import com.equinix.pulumi.fabric.outputs.ServiceProfileAccount;
import com.equinix.pulumi.fabric.outputs.ServiceProfileChangeLog;
import com.equinix.pulumi.fabric.outputs.ServiceProfileCustomField;
import com.equinix.pulumi.fabric.outputs.ServiceProfileMarketingInfo;
import com.equinix.pulumi.fabric.outputs.ServiceProfileMetro;
import com.equinix.pulumi.fabric.outputs.ServiceProfileNotification;
import com.equinix.pulumi.fabric.outputs.ServiceProfilePort;
import com.equinix.pulumi.fabric.outputs.ServiceProfileProject;
import com.equinix.pulumi.fabric.outputs.ServiceProfileVirtualDevice;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Service Profile
 * 
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.fabric.ServiceProfile;
 * import com.pulumi.equinix.fabric.ServiceProfileArgs;
 * import com.pulumi.equinix.fabric.inputs.ServiceProfileNotificationArgs;
 * import com.pulumi.equinix.fabric.inputs.ServiceProfilePortArgs;
 * import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var newServiceProfile = new ServiceProfile("newServiceProfile", ServiceProfileArgs.builder()
 *             .description("Service Profile for Receiving Connections")
 *             .name("Name Of Business + Use Case Tag")
 *             .type("L2_PROFILE")
 *             .visibility("PUBLIC")
 *             .notifications(ServiceProfileNotificationArgs.builder()
 *                 .emails("someone}{@literal @}{@code sample.com")
 *                 .type("BANDWIDTH_ALERT")
 *                 .build())
 *             .allowedEmails(            
 *                 "test}{@literal @}{@code equinix.com",
 *                 "testagain}{@literal @}{@code equinix.com")
 *             .ports(ServiceProfilePortArgs.builder()
 *                 .uuid("c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee")
 *                 .type("XF_PORT")
 *                 .build())
 *             .accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs.builder()
 *                 .type("COLO")
 *                 .allowRemoteConnections(true)
 *                 .allowCustomBandwidth(true)
 *                 .allowBandwidthAutoApproval(false)
 *                 .connectionRedundancyRequired(false)
 *                 .connectionLabel("Service Profile Tag1")
 *                 .bandwidthAlertThreshold(10.0)
 *                 .supportedBandwidths(                
 *                     100,
 *                     500)
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:fabric/serviceProfile:ServiceProfile")
public class ServiceProfile extends com.pulumi.resources.CustomResource {
    /**
     * Access point config information
     * 
     */
    @Export(name="accessPointTypeConfigs", refs={List.class,ServiceProfileAccessPointTypeConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfileAccessPointTypeConfig>> accessPointTypeConfigs;

    /**
     * @return Access point config information
     * 
     */
    public Output<Optional<List<ServiceProfileAccessPointTypeConfig>>> accessPointTypeConfigs() {
        return Codegen.optional(this.accessPointTypeConfigs);
    }
    /**
     * Service Profile Owner Account Information
     * 
     */
    @Export(name="account", refs={ServiceProfileAccount.class}, tree="[0]")
    private Output<ServiceProfileAccount> account;

    /**
     * @return Service Profile Owner Account Information
     * 
     */
    public Output<ServiceProfileAccount> account() {
        return this.account;
    }
    /**
     * Array of contact emails
     * 
     */
    @Export(name="allowedEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedEmails;

    /**
     * @return Array of contact emails
     * 
     */
    public Output<Optional<List<String>>> allowedEmails() {
        return Codegen.optional(this.allowedEmails);
    }
    /**
     * Captures connection lifecycle change information
     * 
     */
    @Export(name="changeLog", refs={ServiceProfileChangeLog.class}, tree="[0]")
    private Output<ServiceProfileChangeLog> changeLog;

    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public Output<ServiceProfileChangeLog> changeLog() {
        return this.changeLog;
    }
    /**
     * Custom Fields
     * 
     */
    @Export(name="customFields", refs={List.class,ServiceProfileCustomField.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfileCustomField>> customFields;

    /**
     * @return Custom Fields
     * 
     */
    public Output<Optional<List<ServiceProfileCustomField>>> customFields() {
        return Codegen.optional(this.customFields);
    }
    /**
     * User-provided service description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return User-provided service description
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Service Profile URI response attribute
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Service Profile URI response attribute
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Marketing Info
     * 
     */
    @Export(name="marketingInfo", refs={ServiceProfileMarketingInfo.class}, tree="[0]")
    private Output</* @Nullable */ ServiceProfileMarketingInfo> marketingInfo;

    /**
     * @return Marketing Info
     * 
     */
    public Output<Optional<ServiceProfileMarketingInfo>> marketingInfo() {
        return Codegen.optional(this.marketingInfo);
    }
    /**
     * Access point config information
     * 
     */
    @Export(name="metros", refs={List.class,ServiceProfileMetro.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfileMetro>> metros;

    /**
     * @return Access point config information
     * 
     */
    public Output<Optional<List<ServiceProfileMetro>>> metros() {
        return Codegen.optional(this.metros);
    }
    /**
     * Customer-assigned service profile name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Customer-assigned service profile name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferences for notifications on connection configuration or status changes
     * 
     */
    @Export(name="notifications", refs={List.class,ServiceProfileNotification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfileNotification>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Output<Optional<List<ServiceProfileNotification>>> notifications() {
        return Codegen.optional(this.notifications);
    }
    /**
     * Ports
     * 
     */
    @Export(name="ports", refs={List.class,ServiceProfilePort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfilePort>> ports;

    /**
     * @return Ports
     * 
     */
    public Output<Optional<List<ServiceProfilePort>>> ports() {
        return Codegen.optional(this.ports);
    }
    /**
     * Project information
     * 
     */
    @Export(name="project", refs={ServiceProfileProject.class}, tree="[0]")
    private Output</* @Nullable */ ServiceProfileProject> project;

    /**
     * @return Project information
     * 
     */
    public Output<Optional<ServiceProfileProject>> project() {
        return Codegen.optional(this.project);
    }
    /**
     * Self Profile indicating if the profile is created for customer&#39;s  self use
     * 
     */
    @Export(name="selfProfile", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> selfProfile;

    /**
     * @return Self Profile indicating if the profile is created for customer&#39;s  self use
     * 
     */
    public Output<Optional<Boolean>> selfProfile() {
        return Codegen.optional(this.selfProfile);
    }
    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> state;

    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public Output<Optional<String>> state() {
        return Codegen.optional(this.state);
    }
    /**
     * Tags attached to the connection
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags attached to the connection
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix assigned service profile identifier
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     * 
     */
    @Export(name="viewPoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> viewPoint;

    /**
     * @return Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     * 
     */
    public Output<Optional<String>> viewPoint() {
        return Codegen.optional(this.viewPoint);
    }
    /**
     * Virtual Devices
     * 
     */
    @Export(name="virtualDevices", refs={List.class,ServiceProfileVirtualDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceProfileVirtualDevice>> virtualDevices;

    /**
     * @return Virtual Devices
     * 
     */
    public Output<Optional<List<ServiceProfileVirtualDevice>>> virtualDevices() {
        return Codegen.optional(this.virtualDevices);
    }
    /**
     * Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    @Export(name="visibility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> visibility;

    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    public Output<Optional<String>> visibility() {
        return Codegen.optional(this.visibility);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceProfile(java.lang.String name) {
        this(name, ServiceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceProfile(java.lang.String name, ServiceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceProfile(java.lang.String name, ServiceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/serviceProfile:ServiceProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceProfile(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/serviceProfile:ServiceProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceProfileArgs makeArgs(ServiceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/equinix")
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
    public static ServiceProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceProfile(name, id, state, options);
    }
}
