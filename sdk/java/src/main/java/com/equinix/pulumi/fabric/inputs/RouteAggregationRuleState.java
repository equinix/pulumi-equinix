// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.RouteAggregationRuleChangeArgs;
import com.equinix.pulumi.fabric.inputs.RouteAggregationRuleChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.RouteAggregationRuleTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteAggregationRuleState extends com.pulumi.resources.ResourceArgs {

    public static final RouteAggregationRuleState Empty = new RouteAggregationRuleState();

    /**
     * Current state of latest route aggregation rule change
     * 
     */
    @Import(name="change")
    private @Nullable Output<RouteAggregationRuleChangeArgs> change;

    /**
     * @return Current state of latest route aggregation rule change
     * 
     */
    public Optional<Output<RouteAggregationRuleChangeArgs>> change() {
        return Optional.ofNullable(this.change);
    }

    /**
     * Details of the last change on the stream resource
     * 
     */
    @Import(name="changeLog")
    private @Nullable Output<RouteAggregationRuleChangeLogArgs> changeLog;

    /**
     * @return Details of the last change on the stream resource
     * 
     */
    public Optional<Output<RouteAggregationRuleChangeLogArgs>> changeLog() {
        return Optional.ofNullable(this.changeLog);
    }

    /**
     * Customer-provided route aggregation rule description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Customer-provided route aggregation rule description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Equinix auto generated URI to the route aggregation rule resource
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Equinix auto generated URI to the route aggregation rule resource
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Customer provided name of the route aggregation rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Customer provided name of the route aggregation rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Customer-provided route aggregation rule prefix
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Customer-provided route aggregation rule prefix
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * UUID of the Route Aggregation to apply this Rule to
     * 
     */
    @Import(name="routeAggregationId")
    private @Nullable Output<String> routeAggregationId;

    /**
     * @return UUID of the Route Aggregation to apply this Rule to
     * 
     */
    public Optional<Output<String>> routeAggregationId() {
        return Optional.ofNullable(this.routeAggregationId);
    }

    /**
     * Value representing provisioning status for the route aggregation rule resource
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Value representing provisioning status for the route aggregation rule resource
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="timeouts")
    private @Nullable Output<RouteAggregationRuleTimeoutsArgs> timeouts;

    public Optional<Output<RouteAggregationRuleTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix-assigned unique id for the route aggregation rule resource
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix-assigned unique id for the route aggregation rule resource
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private RouteAggregationRuleState() {}

    private RouteAggregationRuleState(RouteAggregationRuleState $) {
        this.change = $.change;
        this.changeLog = $.changeLog;
        this.description = $.description;
        this.href = $.href;
        this.name = $.name;
        this.prefix = $.prefix;
        this.routeAggregationId = $.routeAggregationId;
        this.state = $.state;
        this.timeouts = $.timeouts;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteAggregationRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteAggregationRuleState $;

        public Builder() {
            $ = new RouteAggregationRuleState();
        }

        public Builder(RouteAggregationRuleState defaults) {
            $ = new RouteAggregationRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param change Current state of latest route aggregation rule change
         * 
         * @return builder
         * 
         */
        public Builder change(@Nullable Output<RouteAggregationRuleChangeArgs> change) {
            $.change = change;
            return this;
        }

        /**
         * @param change Current state of latest route aggregation rule change
         * 
         * @return builder
         * 
         */
        public Builder change(RouteAggregationRuleChangeArgs change) {
            return change(Output.of(change));
        }

        /**
         * @param changeLog Details of the last change on the stream resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(@Nullable Output<RouteAggregationRuleChangeLogArgs> changeLog) {
            $.changeLog = changeLog;
            return this;
        }

        /**
         * @param changeLog Details of the last change on the stream resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(RouteAggregationRuleChangeLogArgs changeLog) {
            return changeLog(Output.of(changeLog));
        }

        /**
         * @param description Customer-provided route aggregation rule description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided route aggregation rule description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param href Equinix auto generated URI to the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Equinix auto generated URI to the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Customer provided name of the route aggregation rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Customer provided name of the route aggregation rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param prefix Customer-provided route aggregation rule prefix
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Customer-provided route aggregation rule prefix
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param routeAggregationId UUID of the Route Aggregation to apply this Rule to
         * 
         * @return builder
         * 
         */
        public Builder routeAggregationId(@Nullable Output<String> routeAggregationId) {
            $.routeAggregationId = routeAggregationId;
            return this;
        }

        /**
         * @param routeAggregationId UUID of the Route Aggregation to apply this Rule to
         * 
         * @return builder
         * 
         */
        public Builder routeAggregationId(String routeAggregationId) {
            return routeAggregationId(Output.of(routeAggregationId));
        }

        /**
         * @param state Value representing provisioning status for the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Value representing provisioning status for the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder timeouts(@Nullable Output<RouteAggregationRuleTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(RouteAggregationRuleTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param type Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix-assigned unique id for the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned unique id for the route aggregation rule resource
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public RouteAggregationRuleState build() {
            return $;
        }
    }

}
