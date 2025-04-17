// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.RouteAggregationChangeArgs;
import com.equinix.pulumi.fabric.inputs.RouteAggregationChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.RouteAggregationProjectArgs;
import com.equinix.pulumi.fabric.inputs.RouteAggregationTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteAggregationState extends com.pulumi.resources.ResourceArgs {

    public static final RouteAggregationState Empty = new RouteAggregationState();

    /**
     * Current state of latest Route Aggregation change
     * 
     */
    @Import(name="change")
    private @Nullable Output<RouteAggregationChangeArgs> change;

    /**
     * @return Current state of latest Route Aggregation change
     * 
     */
    public Optional<Output<RouteAggregationChangeArgs>> change() {
        return Optional.ofNullable(this.change);
    }

    /**
     * Details of the last change on the route aggregation resource
     * 
     */
    @Import(name="changeLog")
    private @Nullable Output<RouteAggregationChangeLogArgs> changeLog;

    /**
     * @return Details of the last change on the route aggregation resource
     * 
     */
    public Optional<Output<RouteAggregationChangeLogArgs>> changeLog() {
        return Optional.ofNullable(this.changeLog);
    }

    /**
     * Number of Connections attached to route aggregation
     * 
     */
    @Import(name="connectionsCount")
    private @Nullable Output<Integer> connectionsCount;

    /**
     * @return Number of Connections attached to route aggregation
     * 
     */
    public Optional<Output<Integer>> connectionsCount() {
        return Optional.ofNullable(this.connectionsCount);
    }

    /**
     * Customer-provided route aggregation description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Customer-provided route aggregation description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Equinix auto generated URI to the route aggregation resource
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Equinix auto generated URI to the route aggregation resource
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Customer provided name of the route aggregation
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Customer provided name of the route aggregation
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Equinix Project attribute object
     * 
     */
    @Import(name="project")
    private @Nullable Output<RouteAggregationProjectArgs> project;

    /**
     * @return Equinix Project attribute object
     * 
     */
    public Optional<Output<RouteAggregationProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Number of Rules attached to route aggregation
     * 
     */
    @Import(name="rulesCount")
    private @Nullable Output<Integer> rulesCount;

    /**
     * @return Number of Rules attached to route aggregation
     * 
     */
    public Optional<Output<Integer>> rulesCount() {
        return Optional.ofNullable(this.rulesCount);
    }

    /**
     * Value representing provisioning status for the route aggregation resource
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Value representing provisioning status for the route aggregation resource
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="timeouts")
    private @Nullable Output<RouteAggregationTimeoutsArgs> timeouts;

    public Optional<Output<RouteAggregationTimeoutsArgs>> timeouts() {
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
     * Equinix-assigned unique id for the route aggregation resource
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix-assigned unique id for the route aggregation resource
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private RouteAggregationState() {}

    private RouteAggregationState(RouteAggregationState $) {
        this.change = $.change;
        this.changeLog = $.changeLog;
        this.connectionsCount = $.connectionsCount;
        this.description = $.description;
        this.href = $.href;
        this.name = $.name;
        this.project = $.project;
        this.rulesCount = $.rulesCount;
        this.state = $.state;
        this.timeouts = $.timeouts;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteAggregationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteAggregationState $;

        public Builder() {
            $ = new RouteAggregationState();
        }

        public Builder(RouteAggregationState defaults) {
            $ = new RouteAggregationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param change Current state of latest Route Aggregation change
         * 
         * @return builder
         * 
         */
        public Builder change(@Nullable Output<RouteAggregationChangeArgs> change) {
            $.change = change;
            return this;
        }

        /**
         * @param change Current state of latest Route Aggregation change
         * 
         * @return builder
         * 
         */
        public Builder change(RouteAggregationChangeArgs change) {
            return change(Output.of(change));
        }

        /**
         * @param changeLog Details of the last change on the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(@Nullable Output<RouteAggregationChangeLogArgs> changeLog) {
            $.changeLog = changeLog;
            return this;
        }

        /**
         * @param changeLog Details of the last change on the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(RouteAggregationChangeLogArgs changeLog) {
            return changeLog(Output.of(changeLog));
        }

        /**
         * @param connectionsCount Number of Connections attached to route aggregation
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(@Nullable Output<Integer> connectionsCount) {
            $.connectionsCount = connectionsCount;
            return this;
        }

        /**
         * @param connectionsCount Number of Connections attached to route aggregation
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(Integer connectionsCount) {
            return connectionsCount(Output.of(connectionsCount));
        }

        /**
         * @param description Customer-provided route aggregation description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided route aggregation description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param href Equinix auto generated URI to the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Equinix auto generated URI to the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Customer provided name of the route aggregation
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Customer provided name of the route aggregation
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project Equinix Project attribute object
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<RouteAggregationProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Equinix Project attribute object
         * 
         * @return builder
         * 
         */
        public Builder project(RouteAggregationProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param rulesCount Number of Rules attached to route aggregation
         * 
         * @return builder
         * 
         */
        public Builder rulesCount(@Nullable Output<Integer> rulesCount) {
            $.rulesCount = rulesCount;
            return this;
        }

        /**
         * @param rulesCount Number of Rules attached to route aggregation
         * 
         * @return builder
         * 
         */
        public Builder rulesCount(Integer rulesCount) {
            return rulesCount(Output.of(rulesCount));
        }

        /**
         * @param state Value representing provisioning status for the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Value representing provisioning status for the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder timeouts(@Nullable Output<RouteAggregationTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(RouteAggregationTimeoutsArgs timeouts) {
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
         * @param uuid Equinix-assigned unique id for the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned unique id for the route aggregation resource
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public RouteAggregationState build() {
            return $;
        }
    }

}
