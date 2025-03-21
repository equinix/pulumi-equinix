// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.ServiceTokenAccountArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenNotificationArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenProjectArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTokenState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTokenState Empty = new ServiceTokenState();

    /**
     * Customer account information that is associated with this service token
     * 
     */
    @Import(name="accounts")
    private @Nullable Output<List<ServiceTokenAccountArgs>> accounts;

    /**
     * @return Customer account information that is associated with this service token
     * 
     */
    public Optional<Output<List<ServiceTokenAccountArgs>>> accounts() {
        return Optional.ofNullable(this.accounts);
    }

    /**
     * Captures connection lifecycle change information
     * 
     */
    @Import(name="changeLogs")
    private @Nullable Output<List<ServiceTokenChangeLogArgs>> changeLogs;

    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public Optional<Output<List<ServiceTokenChangeLogArgs>>> changeLogs() {
        return Optional.ofNullable(this.changeLogs);
    }

    /**
     * Optional Description to the Service Token you will be creating
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional Description to the Service Token you will be creating
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Expiration date and time of the service token; 2020-11-06T07:00:00Z
     * 
     */
    @Import(name="expirationDateTime")
    private @Nullable Output<String> expirationDateTime;

    /**
     * @return Expiration date and time of the service token; 2020-11-06T07:00:00Z
     * 
     */
    public Optional<Output<String>> expirationDateTime() {
        return Optional.ofNullable(this.expirationDateTime);
    }

    /**
     * An absolute URL that is the subject of the link&#39;s context.
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return An absolute URL that is the subject of the link&#39;s context.
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Information about token side; ASIDE, ZSIDE
     * 
     */
    @Import(name="issuerSide")
    private @Nullable Output<String> issuerSide;

    /**
     * @return Information about token side; ASIDE, ZSIDE
     * 
     */
    public Optional<Output<String>> issuerSide() {
        return Optional.ofNullable(this.issuerSide);
    }

    /**
     * Name of the Service Token
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Service Token
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferences for notifications on Service Token configuration or status changes
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<ServiceTokenNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on Service Token configuration or status changes
     * 
     */
    public Optional<Output<List<ServiceTokenNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Project information
     * 
     */
    @Import(name="project")
    private @Nullable Output<ServiceTokenProjectArgs> project;

    /**
     * @return Project information
     * 
     */
    public Optional<Output<ServiceTokenProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Service Token Connection Type Information
     * 
     */
    @Import(name="serviceTokenConnections")
    private @Nullable Output<List<ServiceTokenServiceTokenConnectionArgs>> serviceTokenConnections;

    /**
     * @return Service Token Connection Type Information
     * 
     */
    public Optional<Output<List<ServiceTokenServiceTokenConnectionArgs>>> serviceTokenConnections() {
        return Optional.ofNullable(this.serviceTokenConnections);
    }

    /**
     * Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Service Token Type; VC*TOKEN,EPL*TOKEN
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Service Token Type; VC*TOKEN,EPL*TOKEN
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix-assigned service token identifier
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix-assigned service token identifier
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private ServiceTokenState() {}

    private ServiceTokenState(ServiceTokenState $) {
        this.accounts = $.accounts;
        this.changeLogs = $.changeLogs;
        this.description = $.description;
        this.expirationDateTime = $.expirationDateTime;
        this.href = $.href;
        this.issuerSide = $.issuerSide;
        this.name = $.name;
        this.notifications = $.notifications;
        this.project = $.project;
        this.serviceTokenConnections = $.serviceTokenConnections;
        this.state = $.state;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTokenState $;

        public Builder() {
            $ = new ServiceTokenState();
        }

        public Builder(ServiceTokenState defaults) {
            $ = new ServiceTokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accounts Customer account information that is associated with this service token
         * 
         * @return builder
         * 
         */
        public Builder accounts(@Nullable Output<List<ServiceTokenAccountArgs>> accounts) {
            $.accounts = accounts;
            return this;
        }

        /**
         * @param accounts Customer account information that is associated with this service token
         * 
         * @return builder
         * 
         */
        public Builder accounts(List<ServiceTokenAccountArgs> accounts) {
            return accounts(Output.of(accounts));
        }

        /**
         * @param accounts Customer account information that is associated with this service token
         * 
         * @return builder
         * 
         */
        public Builder accounts(ServiceTokenAccountArgs... accounts) {
            return accounts(List.of(accounts));
        }

        /**
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(@Nullable Output<List<ServiceTokenChangeLogArgs>> changeLogs) {
            $.changeLogs = changeLogs;
            return this;
        }

        /**
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(List<ServiceTokenChangeLogArgs> changeLogs) {
            return changeLogs(Output.of(changeLogs));
        }

        /**
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(ServiceTokenChangeLogArgs... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }

        /**
         * @param description Optional Description to the Service Token you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional Description to the Service Token you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expirationDateTime Expiration date and time of the service token; 2020-11-06T07:00:00Z
         * 
         * @return builder
         * 
         */
        public Builder expirationDateTime(@Nullable Output<String> expirationDateTime) {
            $.expirationDateTime = expirationDateTime;
            return this;
        }

        /**
         * @param expirationDateTime Expiration date and time of the service token; 2020-11-06T07:00:00Z
         * 
         * @return builder
         * 
         */
        public Builder expirationDateTime(String expirationDateTime) {
            return expirationDateTime(Output.of(expirationDateTime));
        }

        /**
         * @param href An absolute URL that is the subject of the link&#39;s context.
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href An absolute URL that is the subject of the link&#39;s context.
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param issuerSide Information about token side; ASIDE, ZSIDE
         * 
         * @return builder
         * 
         */
        public Builder issuerSide(@Nullable Output<String> issuerSide) {
            $.issuerSide = issuerSide;
            return this;
        }

        /**
         * @param issuerSide Information about token side; ASIDE, ZSIDE
         * 
         * @return builder
         * 
         */
        public Builder issuerSide(String issuerSide) {
            return issuerSide(Output.of(issuerSide));
        }

        /**
         * @param name Name of the Service Token
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Service Token
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Preferences for notifications on Service Token configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<ServiceTokenNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Preferences for notifications on Service Token configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<ServiceTokenNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Preferences for notifications on Service Token configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(ServiceTokenNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<ServiceTokenProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(ServiceTokenProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceTokenConnections Service Token Connection Type Information
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenConnections(@Nullable Output<List<ServiceTokenServiceTokenConnectionArgs>> serviceTokenConnections) {
            $.serviceTokenConnections = serviceTokenConnections;
            return this;
        }

        /**
         * @param serviceTokenConnections Service Token Connection Type Information
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenConnections(List<ServiceTokenServiceTokenConnectionArgs> serviceTokenConnections) {
            return serviceTokenConnections(Output.of(serviceTokenConnections));
        }

        /**
         * @param serviceTokenConnections Service Token Connection Type Information
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs... serviceTokenConnections) {
            return serviceTokenConnections(List.of(serviceTokenConnections));
        }

        /**
         * @param state Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type Service Token Type; VC*TOKEN,EPL*TOKEN
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Service Token Type; VC*TOKEN,EPL*TOKEN
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix-assigned service token identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned service token identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ServiceTokenState build() {
            return $;
        }
    }

}
