// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.RouteFilterChangeArgs;
import com.equinix.pulumi.fabric.inputs.RouteFilterChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.RouteFilterProjectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteFilterState extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterState Empty = new RouteFilterState();

    @Import(name="changeLogs")
    private @Nullable Output<List<RouteFilterChangeLogArgs>> changeLogs;

    public Optional<Output<List<RouteFilterChangeLogArgs>>> changeLogs() {
        return Optional.ofNullable(this.changeLogs);
    }

    /**
     * An object with the details of the previous change applied on the Route Filter
     * 
     */
    @Import(name="changes")
    private @Nullable Output<List<RouteFilterChangeArgs>> changes;

    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    public Optional<Output<List<RouteFilterChangeArgs>>> changes() {
        return Optional.ofNullable(this.changes);
    }

    /**
     * The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    @Import(name="connectionsCount")
    private @Nullable Output<Integer> connectionsCount;

    /**
     * @return The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    public Optional<Output<Integer>> connectionsCount() {
        return Optional.ofNullable(this.connectionsCount);
    }

    /**
     * Optional description to add to the Route Filter you will be creating
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Route filter URI
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Route filter URI
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Name of the Route Filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Route Filter
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    @Import(name="notMatchedRuleAction")
    private @Nullable Output<String> notMatchedRuleAction;

    /**
     * @return The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    public Optional<Output<String>> notMatchedRuleAction() {
        return Optional.ofNullable(this.notMatchedRuleAction);
    }

    /**
     * The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    @Import(name="project")
    private @Nullable Output<RouteFilterProjectArgs> project;

    /**
     * @return The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    public Optional<Output<RouteFilterProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The number of Route Filter Rules attached to this Route Filter
     * 
     */
    @Import(name="rulesCount")
    private @Nullable Output<Integer> rulesCount;

    /**
     * @return The number of Route Filter Rules attached to this Route Filter
     * 
     */
    public Optional<Output<Integer>> rulesCount() {
        return Optional.ofNullable(this.rulesCount);
    }

    /**
     * State of the Route Filter in its lifecycle
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the Route Filter in its lifecycle
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix Assigned ID for Route Filter
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix Assigned ID for Route Filter
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private RouteFilterState() {}

    private RouteFilterState(RouteFilterState $) {
        this.changeLogs = $.changeLogs;
        this.changes = $.changes;
        this.connectionsCount = $.connectionsCount;
        this.description = $.description;
        this.href = $.href;
        this.name = $.name;
        this.notMatchedRuleAction = $.notMatchedRuleAction;
        this.project = $.project;
        this.rulesCount = $.rulesCount;
        this.state = $.state;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterState $;

        public Builder() {
            $ = new RouteFilterState();
        }

        public Builder(RouteFilterState defaults) {
            $ = new RouteFilterState(Objects.requireNonNull(defaults));
        }

        public Builder changeLogs(@Nullable Output<List<RouteFilterChangeLogArgs>> changeLogs) {
            $.changeLogs = changeLogs;
            return this;
        }

        public Builder changeLogs(List<RouteFilterChangeLogArgs> changeLogs) {
            return changeLogs(Output.of(changeLogs));
        }

        public Builder changeLogs(RouteFilterChangeLogArgs... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }

        /**
         * @param changes An object with the details of the previous change applied on the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder changes(@Nullable Output<List<RouteFilterChangeArgs>> changes) {
            $.changes = changes;
            return this;
        }

        /**
         * @param changes An object with the details of the previous change applied on the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder changes(List<RouteFilterChangeArgs> changes) {
            return changes(Output.of(changes));
        }

        /**
         * @param changes An object with the details of the previous change applied on the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder changes(RouteFilterChangeArgs... changes) {
            return changes(List.of(changes));
        }

        /**
         * @param connectionsCount The number of Fabric Connections that this Route Filter is attached to
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(@Nullable Output<Integer> connectionsCount) {
            $.connectionsCount = connectionsCount;
            return this;
        }

        /**
         * @param connectionsCount The number of Fabric Connections that this Route Filter is attached to
         * 
         * @return builder
         * 
         */
        public Builder connectionsCount(Integer connectionsCount) {
            return connectionsCount(Output.of(connectionsCount));
        }

        /**
         * @param description Optional description to add to the Route Filter you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional description to add to the Route Filter you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param href Route filter URI
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Route filter URI
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Name of the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notMatchedRuleAction The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder notMatchedRuleAction(@Nullable Output<String> notMatchedRuleAction) {
            $.notMatchedRuleAction = notMatchedRuleAction;
            return this;
        }

        /**
         * @param notMatchedRuleAction The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder notMatchedRuleAction(String notMatchedRuleAction) {
            return notMatchedRuleAction(Output.of(notMatchedRuleAction));
        }

        /**
         * @param project The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<RouteFilterProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
         * 
         * @return builder
         * 
         */
        public Builder project(RouteFilterProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param rulesCount The number of Route Filter Rules attached to this Route Filter
         * 
         * @return builder
         * 
         */
        public Builder rulesCount(@Nullable Output<Integer> rulesCount) {
            $.rulesCount = rulesCount;
            return this;
        }

        /**
         * @param rulesCount The number of Route Filter Rules attached to this Route Filter
         * 
         * @return builder
         * 
         */
        public Builder rulesCount(Integer rulesCount) {
            return rulesCount(Output.of(rulesCount));
        }

        /**
         * @param state State of the Route Filter in its lifecycle
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the Route Filter in its lifecycle
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix Assigned ID for Route Filter
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix Assigned ID for Route Filter
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public RouteFilterState build() {
            return $;
        }
    }

}
