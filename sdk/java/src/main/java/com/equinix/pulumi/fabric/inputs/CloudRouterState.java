// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.CloudRouterAccountArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterLocationArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterNotificationArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterOrderArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterPackageArgs;
import com.equinix.pulumi.fabric.inputs.CloudRouterProjectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudRouterState extends com.pulumi.resources.ResourceArgs {

    public static final CloudRouterState Empty = new CloudRouterState();

    /**
     * Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    @Import(name="account")
    private @Nullable Output<CloudRouterAccountArgs> account;

    /**
     * @return Customer account information that is associated with this Fabric Cloud Router
     * 
     */
    public Optional<Output<CloudRouterAccountArgs>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Number of IPv4 BGP routes in use (including non-distinct prefixes)
     * 
     */
    @Import(name="bgpIpv4RoutesCount")
    private @Nullable Output<Integer> bgpIpv4RoutesCount;

    /**
     * @return Number of IPv4 BGP routes in use (including non-distinct prefixes)
     * 
     */
    public Optional<Output<Integer>> bgpIpv4RoutesCount() {
        return Optional.ofNullable(this.bgpIpv4RoutesCount);
    }

    /**
     * Number of IPv6 BGP routes in use (including non-distinct prefixes)
     * 
     */
    @Import(name="bgpIpv6RoutesCount")
    private @Nullable Output<Integer> bgpIpv6RoutesCount;

    /**
     * @return Number of IPv6 BGP routes in use (including non-distinct prefixes)
     * 
     */
    public Optional<Output<Integer>> bgpIpv6RoutesCount() {
        return Optional.ofNullable(this.bgpIpv6RoutesCount);
    }

    /**
     * Captures Fabric Cloud Router lifecycle change information
     * 
     */
    @Import(name="changeLogs")
    private @Nullable Output<List<CloudRouterChangeLogArgs>> changeLogs;

    /**
     * @return Captures Fabric Cloud Router lifecycle change information
     * 
     */
    public Optional<Output<List<CloudRouterChangeLogArgs>>> changeLogs() {
        return Optional.ofNullable(this.changeLogs);
    }

    /**
     * Number of connections associated with this Fabric Cloud Router instance
     * 
     */
    @Import(name="connectionsCount")
    private @Nullable Output<Integer> connectionsCount;

    /**
     * @return Number of connections associated with this Fabric Cloud Router instance
     * 
     */
    public Optional<Output<Integer>> connectionsCount() {
        return Optional.ofNullable(this.connectionsCount);
    }

    /**
     * Customer-provided Fabric Cloud Router description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Customer-provided Fabric Cloud Router description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Number of distinct IPv4 routes
     * 
     */
    @Import(name="distinctIpv4PrefixesCount")
    private @Nullable Output<Integer> distinctIpv4PrefixesCount;

    /**
     * @return Number of distinct IPv4 routes
     * 
     */
    public Optional<Output<Integer>> distinctIpv4PrefixesCount() {
        return Optional.ofNullable(this.distinctIpv4PrefixesCount);
    }

    /**
     * Number of distinct IPv6 routes
     * 
     */
    @Import(name="distinctIpv6PrefixesCount")
    private @Nullable Output<Integer> distinctIpv6PrefixesCount;

    /**
     * @return Number of distinct IPv6 routes
     * 
     */
    public Optional<Output<Integer>> distinctIpv6PrefixesCount() {
        return Optional.ofNullable(this.distinctIpv6PrefixesCount);
    }

    /**
     * Equinix ASN
     * 
     */
    @Import(name="equinixAsn")
    private @Nullable Output<Integer> equinixAsn;

    /**
     * @return Equinix ASN
     * 
     */
    public Optional<Output<Integer>> equinixAsn() {
        return Optional.ofNullable(this.equinixAsn);
    }

    /**
     * Unique Resource URL
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Unique Resource URL
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Fabric Cloud Router location
     * 
     */
    @Import(name="location")
    private @Nullable Output<CloudRouterLocationArgs> location;

    /**
     * @return Fabric Cloud Router location
     * 
     */
    public Optional<Output<CloudRouterLocationArgs>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferences for notifications on Fabric Cloud Router configuration or status changes
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<CloudRouterNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on Fabric Cloud Router configuration or status changes
     * 
     */
    public Optional<Output<List<CloudRouterNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Order information related to this Fabric Cloud Router
     * 
     */
    @Import(name="order")
    private @Nullable Output<CloudRouterOrderArgs> order;

    /**
     * @return Order information related to this Fabric Cloud Router
     * 
     */
    public Optional<Output<CloudRouterOrderArgs>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Fabric Cloud Router Package Type
     * 
     */
    @Import(name="package")
    private @Nullable Output<CloudRouterPackageArgs> package_;

    /**
     * @return Fabric Cloud Router Package Type
     * 
     */
    public Optional<Output<CloudRouterPackageArgs>> package_() {
        return Optional.ofNullable(this.package_);
    }

    /**
     * Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
     * 
     */
    @Import(name="project")
    private @Nullable Output<CloudRouterProjectArgs> project;

    /**
     * @return Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
     * 
     */
    public Optional<Output<CloudRouterProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Fabric Cloud Router overall state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Fabric Cloud Router overall state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private CloudRouterState() {}

    private CloudRouterState(CloudRouterState $) {
        this.account = $.account;
        this.bgpIpv4RoutesCount = $.bgpIpv4RoutesCount;
        this.bgpIpv6RoutesCount = $.bgpIpv6RoutesCount;
        this.changeLogs = $.changeLogs;
        this.connectionsCount = $.connectionsCount;
        this.description = $.description;
        this.distinctIpv4PrefixesCount = $.distinctIpv4PrefixesCount;
        this.distinctIpv6PrefixesCount = $.distinctIpv6PrefixesCount;
        this.equinixAsn = $.equinixAsn;
        this.href = $.href;
        this.location = $.location;
        this.name = $.name;
        this.notifications = $.notifications;
        this.order = $.order;
        this.package_ = $.package_;
        this.project = $.project;
        this.state = $.state;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudRouterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRouterState $;

        public Builder() {
            $ = new CloudRouterState();
        }

        public Builder(CloudRouterState defaults) {
            $ = new CloudRouterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Customer account information that is associated with this Fabric Cloud Router
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<CloudRouterAccountArgs> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Customer account information that is associated with this Fabric Cloud Router
         * 
         * @return builder
         * 
         */
        public Builder account(CloudRouterAccountArgs account) {
            return account(Output.of(account));
        }

        /**
         * @param bgpIpv4RoutesCount Number of IPv4 BGP routes in use (including non-distinct prefixes)
         * 
         * @return builder
         * 
         */
        public Builder bgpIpv4RoutesCount(@Nullable Output<Integer> bgpIpv4RoutesCount) {
            $.bgpIpv4RoutesCount = bgpIpv4RoutesCount;
            return this;
        }

        /**
         * @param bgpIpv4RoutesCount Number of IPv4 BGP routes in use (including non-distinct prefixes)
         * 
         * @return builder
         * 
         */
        public Builder bgpIpv4RoutesCount(Integer bgpIpv4RoutesCount) {
            return bgpIpv4RoutesCount(Output.of(bgpIpv4RoutesCount));
        }

        /**
         * @param bgpIpv6RoutesCount Number of IPv6 BGP routes in use (including non-distinct prefixes)
         * 
         * @return builder
         * 
         */
        public Builder bgpIpv6RoutesCount(@Nullable Output<Integer> bgpIpv6RoutesCount) {
            $.bgpIpv6RoutesCount = bgpIpv6RoutesCount;
            return this;
        }

        /**
         * @param bgpIpv6RoutesCount Number of IPv6 BGP routes in use (including non-distinct prefixes)
         * 
         * @return builder
         * 
         */
        public Builder bgpIpv6RoutesCount(Integer bgpIpv6RoutesCount) {
            return bgpIpv6RoutesCount(Output.of(bgpIpv6RoutesCount));
        }

        /**
         * @param changeLogs Captures Fabric Cloud Router lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(@Nullable Output<List<CloudRouterChangeLogArgs>> changeLogs) {
            $.changeLogs = changeLogs;
            return this;
        }

        /**
         * @param changeLogs Captures Fabric Cloud Router lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(List<CloudRouterChangeLogArgs> changeLogs) {
            return changeLogs(Output.of(changeLogs));
        }

        /**
         * @param changeLogs Captures Fabric Cloud Router lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(CloudRouterChangeLogArgs... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }

        /**
         * @param connectionsCount Number of connections associated with this Fabric Cloud Router instance
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(@Nullable Output<Integer> connectionsCount) {
            $.connectionsCount = connectionsCount;
            return this;
        }

        /**
         * @param connectionsCount Number of connections associated with this Fabric Cloud Router instance
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(Integer connectionsCount) {
            return connectionsCount(Output.of(connectionsCount));
        }

        /**
         * @param description Customer-provided Fabric Cloud Router description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided Fabric Cloud Router description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param distinctIpv4PrefixesCount Number of distinct IPv4 routes
         * 
         * @return builder
         * 
         */
        public Builder distinctIpv4PrefixesCount(@Nullable Output<Integer> distinctIpv4PrefixesCount) {
            $.distinctIpv4PrefixesCount = distinctIpv4PrefixesCount;
            return this;
        }

        /**
         * @param distinctIpv4PrefixesCount Number of distinct IPv4 routes
         * 
         * @return builder
         * 
         */
        public Builder distinctIpv4PrefixesCount(Integer distinctIpv4PrefixesCount) {
            return distinctIpv4PrefixesCount(Output.of(distinctIpv4PrefixesCount));
        }

        /**
         * @param distinctIpv6PrefixesCount Number of distinct IPv6 routes
         * 
         * @return builder
         * 
         */
        public Builder distinctIpv6PrefixesCount(@Nullable Output<Integer> distinctIpv6PrefixesCount) {
            $.distinctIpv6PrefixesCount = distinctIpv6PrefixesCount;
            return this;
        }

        /**
         * @param distinctIpv6PrefixesCount Number of distinct IPv6 routes
         * 
         * @return builder
         * 
         */
        public Builder distinctIpv6PrefixesCount(Integer distinctIpv6PrefixesCount) {
            return distinctIpv6PrefixesCount(Output.of(distinctIpv6PrefixesCount));
        }

        /**
         * @param equinixAsn Equinix ASN
         * 
         * @return builder
         * 
         */
        public Builder equinixAsn(@Nullable Output<Integer> equinixAsn) {
            $.equinixAsn = equinixAsn;
            return this;
        }

        /**
         * @param equinixAsn Equinix ASN
         * 
         * @return builder
         * 
         */
        public Builder equinixAsn(Integer equinixAsn) {
            return equinixAsn(Output.of(equinixAsn));
        }

        /**
         * @param href Unique Resource URL
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Unique Resource URL
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param location Fabric Cloud Router location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<CloudRouterLocationArgs> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Fabric Cloud Router location
         * 
         * @return builder
         * 
         */
        public Builder location(CloudRouterLocationArgs location) {
            return location(Output.of(location));
        }

        /**
         * @param name Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Preferences for notifications on Fabric Cloud Router configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<CloudRouterNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Preferences for notifications on Fabric Cloud Router configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<CloudRouterNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Preferences for notifications on Fabric Cloud Router configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(CloudRouterNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param order Order information related to this Fabric Cloud Router
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<CloudRouterOrderArgs> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order information related to this Fabric Cloud Router
         * 
         * @return builder
         * 
         */
        public Builder order(CloudRouterOrderArgs order) {
            return order(Output.of(order));
        }

        /**
         * @param package_ Fabric Cloud Router Package Type
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<CloudRouterPackageArgs> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ Fabric Cloud Router Package Type
         * 
         * @return builder
         * 
         */
        public Builder package_(CloudRouterPackageArgs package_) {
            return package_(Output.of(package_));
        }

        /**
         * @param project Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<CloudRouterProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
         * 
         * @return builder
         * 
         */
        public Builder project(CloudRouterProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param state Fabric Cloud Router overall state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Fabric Cloud Router overall state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix-assigned Fabric Cloud Router identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned Fabric Cloud Router identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public CloudRouterState build() {
            return $;
        }
    }

}
