// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.fabric.enums.ProfileState;
import com.equinix.pulumi.fabric.enums.ProfileType;
import com.equinix.pulumi.fabric.enums.ProfileVisibility;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccountArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileCustomFieldArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileMarketingInfoArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileMetroArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileNotificationArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfilePortArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileProjectArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileVirtualDeviceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileArgs Empty = new ServiceProfileArgs();

    /**
     * Access point config information
     * 
     */
    @Import(name="accessPointTypeConfigs")
    private @Nullable Output<List<ServiceProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs;

    /**
     * @return Access point config information
     * 
     */
    public Optional<Output<List<ServiceProfileAccessPointTypeConfigArgs>>> accessPointTypeConfigs() {
        return Optional.ofNullable(this.accessPointTypeConfigs);
    }

    /**
     * Account
     * 
     */
    @Import(name="account")
    private @Nullable Output<ServiceProfileAccountArgs> account;

    /**
     * @return Account
     * 
     */
    public Optional<Output<ServiceProfileAccountArgs>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Array of contact emails
     * 
     */
    @Import(name="allowedEmails")
    private @Nullable Output<List<String>> allowedEmails;

    /**
     * @return Array of contact emails
     * 
     */
    public Optional<Output<List<String>>> allowedEmails() {
        return Optional.ofNullable(this.allowedEmails);
    }

    /**
     * Custom Fields
     * 
     */
    @Import(name="customFields")
    private @Nullable Output<List<ServiceProfileCustomFieldArgs>> customFields;

    /**
     * @return Custom Fields
     * 
     */
    public Optional<Output<List<ServiceProfileCustomFieldArgs>>> customFields() {
        return Optional.ofNullable(this.customFields);
    }

    /**
     * Description
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Marketing Info
     * 
     */
    @Import(name="marketingInfo")
    private @Nullable Output<ServiceProfileMarketingInfoArgs> marketingInfo;

    /**
     * @return Marketing Info
     * 
     */
    public Optional<Output<ServiceProfileMarketingInfoArgs>> marketingInfo() {
        return Optional.ofNullable(this.marketingInfo);
    }

    /**
     * Access point config information
     * 
     */
    @Import(name="metros")
    private @Nullable Output<List<ServiceProfileMetroArgs>> metros;

    /**
     * @return Access point config information
     * 
     */
    public Optional<Output<List<ServiceProfileMetroArgs>>> metros() {
        return Optional.ofNullable(this.metros);
    }

    /**
     * Metro Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Metro Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferences for notifications on connection configuration or status changes
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<ServiceProfileNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Optional<Output<List<ServiceProfileNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Ports
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<ServiceProfilePortArgs>> ports;

    /**
     * @return Ports
     * 
     */
    public Optional<Output<List<ServiceProfilePortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * Project information
     * 
     */
    @Import(name="project")
    private @Nullable Output<ServiceProfileProjectArgs> project;

    /**
     * @return Project information
     * 
     */
    public Optional<Output<ServiceProfileProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Self Profile
     * 
     */
    @Import(name="selfProfile")
    private @Nullable Output<Boolean> selfProfile;

    /**
     * @return Self Profile
     * 
     */
    public Optional<Output<Boolean>> selfProfile() {
        return Optional.ofNullable(this.selfProfile);
    }

    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,ProfileState>> state;

    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public Optional<Output<Either<String,ProfileState>>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Tags attached to the connection
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags attached to the connection
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Type of access point type config - VD, COLO
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ProfileType>> type;

    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    public Output<Either<String,ProfileType>> type() {
        return this.type;
    }

    /**
     * Virtual Devices
     * 
     */
    @Import(name="virtualDevices")
    private @Nullable Output<List<ServiceProfileVirtualDeviceArgs>> virtualDevices;

    /**
     * @return Virtual Devices
     * 
     */
    public Optional<Output<List<ServiceProfileVirtualDeviceArgs>>> virtualDevices() {
        return Optional.ofNullable(this.virtualDevices);
    }

    /**
     * Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<Either<String,ProfileVisibility>> visibility;

    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    public Optional<Output<Either<String,ProfileVisibility>>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private ServiceProfileArgs() {}

    private ServiceProfileArgs(ServiceProfileArgs $) {
        this.accessPointTypeConfigs = $.accessPointTypeConfigs;
        this.account = $.account;
        this.allowedEmails = $.allowedEmails;
        this.customFields = $.customFields;
        this.description = $.description;
        this.marketingInfo = $.marketingInfo;
        this.metros = $.metros;
        this.name = $.name;
        this.notifications = $.notifications;
        this.ports = $.ports;
        this.project = $.project;
        this.selfProfile = $.selfProfile;
        this.state = $.state;
        this.tags = $.tags;
        this.type = $.type;
        this.virtualDevices = $.virtualDevices;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileArgs $;

        public Builder() {
            $ = new ServiceProfileArgs();
        }

        public Builder(ServiceProfileArgs defaults) {
            $ = new ServiceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(@Nullable Output<List<ServiceProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs) {
            $.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(List<ServiceProfileAccessPointTypeConfigArgs> accessPointTypeConfigs) {
            return accessPointTypeConfigs(Output.of(accessPointTypeConfigs));
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }

        /**
         * @param account Account
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<ServiceProfileAccountArgs> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Account
         * 
         * @return builder
         * 
         */
        public Builder account(ServiceProfileAccountArgs account) {
            return account(Output.of(account));
        }

        /**
         * @param allowedEmails Array of contact emails
         * 
         * @return builder
         * 
         */
        public Builder allowedEmails(@Nullable Output<List<String>> allowedEmails) {
            $.allowedEmails = allowedEmails;
            return this;
        }

        /**
         * @param allowedEmails Array of contact emails
         * 
         * @return builder
         * 
         */
        public Builder allowedEmails(List<String> allowedEmails) {
            return allowedEmails(Output.of(allowedEmails));
        }

        /**
         * @param allowedEmails Array of contact emails
         * 
         * @return builder
         * 
         */
        public Builder allowedEmails(String... allowedEmails) {
            return allowedEmails(List.of(allowedEmails));
        }

        /**
         * @param customFields Custom Fields
         * 
         * @return builder
         * 
         */
        public Builder customFields(@Nullable Output<List<ServiceProfileCustomFieldArgs>> customFields) {
            $.customFields = customFields;
            return this;
        }

        /**
         * @param customFields Custom Fields
         * 
         * @return builder
         * 
         */
        public Builder customFields(List<ServiceProfileCustomFieldArgs> customFields) {
            return customFields(Output.of(customFields));
        }

        /**
         * @param customFields Custom Fields
         * 
         * @return builder
         * 
         */
        public Builder customFields(ServiceProfileCustomFieldArgs... customFields) {
            return customFields(List.of(customFields));
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param marketingInfo Marketing Info
         * 
         * @return builder
         * 
         */
        public Builder marketingInfo(@Nullable Output<ServiceProfileMarketingInfoArgs> marketingInfo) {
            $.marketingInfo = marketingInfo;
            return this;
        }

        /**
         * @param marketingInfo Marketing Info
         * 
         * @return builder
         * 
         */
        public Builder marketingInfo(ServiceProfileMarketingInfoArgs marketingInfo) {
            return marketingInfo(Output.of(marketingInfo));
        }

        /**
         * @param metros Access point config information
         * 
         * @return builder
         * 
         */
        public Builder metros(@Nullable Output<List<ServiceProfileMetroArgs>> metros) {
            $.metros = metros;
            return this;
        }

        /**
         * @param metros Access point config information
         * 
         * @return builder
         * 
         */
        public Builder metros(List<ServiceProfileMetroArgs> metros) {
            return metros(Output.of(metros));
        }

        /**
         * @param metros Access point config information
         * 
         * @return builder
         * 
         */
        public Builder metros(ServiceProfileMetroArgs... metros) {
            return metros(List.of(metros));
        }

        /**
         * @param name Metro Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Metro Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<ServiceProfileNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<ServiceProfileNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(ServiceProfileNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param ports Ports
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<ServiceProfilePortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports Ports
         * 
         * @return builder
         * 
         */
        public Builder ports(List<ServiceProfilePortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports Ports
         * 
         * @return builder
         * 
         */
        public Builder ports(ServiceProfilePortArgs... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<ServiceProfileProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(ServiceProfileProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param selfProfile Self Profile
         * 
         * @return builder
         * 
         */
        public Builder selfProfile(@Nullable Output<Boolean> selfProfile) {
            $.selfProfile = selfProfile;
            return this;
        }

        /**
         * @param selfProfile Self Profile
         * 
         * @return builder
         * 
         */
        public Builder selfProfile(Boolean selfProfile) {
            return selfProfile(Output.of(selfProfile));
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,ProfileState>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,ProfileState> state) {
            return state(Output.of(state));
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(ProfileState state) {
            return state(Either.ofRight(state));
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ProfileType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ProfileType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(ProfileType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param virtualDevices Virtual Devices
         * 
         * @return builder
         * 
         */
        public Builder virtualDevices(@Nullable Output<List<ServiceProfileVirtualDeviceArgs>> virtualDevices) {
            $.virtualDevices = virtualDevices;
            return this;
        }

        /**
         * @param virtualDevices Virtual Devices
         * 
         * @return builder
         * 
         */
        public Builder virtualDevices(List<ServiceProfileVirtualDeviceArgs> virtualDevices) {
            return virtualDevices(Output.of(virtualDevices));
        }

        /**
         * @param virtualDevices Virtual Devices
         * 
         * @return builder
         * 
         */
        public Builder virtualDevices(ServiceProfileVirtualDeviceArgs... virtualDevices) {
            return virtualDevices(List.of(virtualDevices));
        }

        /**
         * @param visibility Service profile visibility - PUBLIC, PRIVATE
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<Either<String,ProfileVisibility>> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility Service profile visibility - PUBLIC, PRIVATE
         * 
         * @return builder
         * 
         */
        public Builder visibility(Either<String,ProfileVisibility> visibility) {
            return visibility(Output.of(visibility));
        }

        /**
         * @param visibility Service profile visibility - PUBLIC, PRIVATE
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Either.ofLeft(visibility));
        }

        /**
         * @param visibility Service profile visibility - PUBLIC, PRIVATE
         * 
         * @return builder
         * 
         */
        public Builder visibility(ProfileVisibility visibility) {
            return visibility(Either.ofRight(visibility));
        }

        public ServiceProfileArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
