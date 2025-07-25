// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.StreamAlertRuleChangeLogArgs;
import com.equinix.pulumi.fabric.inputs.StreamAlertRuleResourceSelectorArgs;
import com.equinix.pulumi.fabric.inputs.StreamAlertRuleTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamAlertRuleState extends com.pulumi.resources.ResourceArgs {

    public static final StreamAlertRuleState Empty = new StreamAlertRuleState();

    /**
     * Details of the last change on the stream resource
     * 
     */
    @Import(name="changeLog")
    private @Nullable Output<StreamAlertRuleChangeLogArgs> changeLog;

    /**
     * @return Details of the last change on the stream resource
     * 
     */
    public Optional<Output<StreamAlertRuleChangeLogArgs>> changeLog() {
        return Optional.ofNullable(this.changeLog);
    }

    /**
     * Stream alert rule metric critical threshold
     * 
     */
    @Import(name="criticalThreshold")
    private @Nullable Output<String> criticalThreshold;

    /**
     * @return Stream alert rule metric critical threshold
     * 
     */
    public Optional<Output<String>> criticalThreshold() {
        return Optional.ofNullable(this.criticalThreshold);
    }

    /**
     * Customer-provided stream alert rule description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Customer-provided stream alert rule description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Stream alert rule enabled status
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Stream alert rule enabled status
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Equinix assigned URI of the stream alert rule
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Equinix assigned URI of the stream alert rule
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Stream alert rule metric name
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return Stream alert rule metric name
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * Customer-provided stream alert rule name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Customer-provided stream alert rule name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Stream alert rule metric operand
     * 
     */
    @Import(name="operand")
    private @Nullable Output<String> operand;

    /**
     * @return Stream alert rule metric operand
     * 
     */
    public Optional<Output<String>> operand() {
        return Optional.ofNullable(this.operand);
    }

    /**
     * Resource selector for the stream alert rule
     * 
     */
    @Import(name="resourceSelector")
    private @Nullable Output<StreamAlertRuleResourceSelectorArgs> resourceSelector;

    /**
     * @return Resource selector for the stream alert rule
     * 
     */
    public Optional<Output<StreamAlertRuleResourceSelectorArgs>> resourceSelector() {
        return Optional.ofNullable(this.resourceSelector);
    }

    /**
     * Value representing provisioning status for the stream alert rule
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Value representing provisioning status for the stream alert rule
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The stream UUID that contains this alert rule
     * 
     */
    @Import(name="streamId")
    private @Nullable Output<String> streamId;

    /**
     * @return The stream UUID that contains this alert rule
     * 
     */
    public Optional<Output<String>> streamId() {
        return Optional.ofNullable(this.streamId);
    }

    @Import(name="timeouts")
    private @Nullable Output<StreamAlertRuleTimeoutsArgs> timeouts;

    public Optional<Output<StreamAlertRuleTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Type of the stream alert rule
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the stream alert rule
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix assigned unique identifier for the stream alert rule
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix assigned unique identifier for the stream alert rule
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * Stream alert rule metric warning threshold
     * 
     */
    @Import(name="warningThreshold")
    private @Nullable Output<String> warningThreshold;

    /**
     * @return Stream alert rule metric warning threshold
     * 
     */
    public Optional<Output<String>> warningThreshold() {
        return Optional.ofNullable(this.warningThreshold);
    }

    /**
     * Stream alert rule metric window size
     * 
     */
    @Import(name="windowSize")
    private @Nullable Output<String> windowSize;

    /**
     * @return Stream alert rule metric window size
     * 
     */
    public Optional<Output<String>> windowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    private StreamAlertRuleState() {}

    private StreamAlertRuleState(StreamAlertRuleState $) {
        this.changeLog = $.changeLog;
        this.criticalThreshold = $.criticalThreshold;
        this.description = $.description;
        this.enabled = $.enabled;
        this.href = $.href;
        this.metricName = $.metricName;
        this.name = $.name;
        this.operand = $.operand;
        this.resourceSelector = $.resourceSelector;
        this.state = $.state;
        this.streamId = $.streamId;
        this.timeouts = $.timeouts;
        this.type = $.type;
        this.uuid = $.uuid;
        this.warningThreshold = $.warningThreshold;
        this.windowSize = $.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamAlertRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamAlertRuleState $;

        public Builder() {
            $ = new StreamAlertRuleState();
        }

        public Builder(StreamAlertRuleState defaults) {
            $ = new StreamAlertRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeLog Details of the last change on the stream resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(@Nullable Output<StreamAlertRuleChangeLogArgs> changeLog) {
            $.changeLog = changeLog;
            return this;
        }

        /**
         * @param changeLog Details of the last change on the stream resource
         * 
         * @return builder
         * 
         */
        public Builder changeLog(StreamAlertRuleChangeLogArgs changeLog) {
            return changeLog(Output.of(changeLog));
        }

        /**
         * @param criticalThreshold Stream alert rule metric critical threshold
         * 
         * @return builder
         * 
         */
        public Builder criticalThreshold(@Nullable Output<String> criticalThreshold) {
            $.criticalThreshold = criticalThreshold;
            return this;
        }

        /**
         * @param criticalThreshold Stream alert rule metric critical threshold
         * 
         * @return builder
         * 
         */
        public Builder criticalThreshold(String criticalThreshold) {
            return criticalThreshold(Output.of(criticalThreshold));
        }

        /**
         * @param description Customer-provided stream alert rule description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided stream alert rule description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Stream alert rule enabled status
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Stream alert rule enabled status
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param href Equinix assigned URI of the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Equinix assigned URI of the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param metricName Stream alert rule metric name
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName Stream alert rule metric name
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param name Customer-provided stream alert rule name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Customer-provided stream alert rule name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operand Stream alert rule metric operand
         * 
         * @return builder
         * 
         */
        public Builder operand(@Nullable Output<String> operand) {
            $.operand = operand;
            return this;
        }

        /**
         * @param operand Stream alert rule metric operand
         * 
         * @return builder
         * 
         */
        public Builder operand(String operand) {
            return operand(Output.of(operand));
        }

        /**
         * @param resourceSelector Resource selector for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder resourceSelector(@Nullable Output<StreamAlertRuleResourceSelectorArgs> resourceSelector) {
            $.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * @param resourceSelector Resource selector for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder resourceSelector(StreamAlertRuleResourceSelectorArgs resourceSelector) {
            return resourceSelector(Output.of(resourceSelector));
        }

        /**
         * @param state Value representing provisioning status for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Value representing provisioning status for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param streamId The stream UUID that contains this alert rule
         * 
         * @return builder
         * 
         */
        public Builder streamId(@Nullable Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId The stream UUID that contains this alert rule
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        public Builder timeouts(@Nullable Output<StreamAlertRuleTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(StreamAlertRuleTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param type Type of the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix assigned unique identifier for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix assigned unique identifier for the stream alert rule
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param warningThreshold Stream alert rule metric warning threshold
         * 
         * @return builder
         * 
         */
        public Builder warningThreshold(@Nullable Output<String> warningThreshold) {
            $.warningThreshold = warningThreshold;
            return this;
        }

        /**
         * @param warningThreshold Stream alert rule metric warning threshold
         * 
         * @return builder
         * 
         */
        public Builder warningThreshold(String warningThreshold) {
            return warningThreshold(Output.of(warningThreshold));
        }

        /**
         * @param windowSize Stream alert rule metric window size
         * 
         * @return builder
         * 
         */
        public Builder windowSize(@Nullable Output<String> windowSize) {
            $.windowSize = windowSize;
            return this;
        }

        /**
         * @param windowSize Stream alert rule metric window size
         * 
         * @return builder
         * 
         */
        public Builder windowSize(String windowSize) {
            return windowSize(Output.of(windowSize));
        }

        public StreamAlertRuleState build() {
            return $;
        }
    }

}
