// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.fabric.inputs.StreamSubscriptionEventSelectorArgs;
import com.equinix.pulumi.fabric.inputs.StreamSubscriptionMetricSelectorArgs;
import com.equinix.pulumi.fabric.inputs.StreamSubscriptionSinkArgs;
import com.equinix.pulumi.fabric.inputs.StreamSubscriptionTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSubscriptionArgs Empty = new StreamSubscriptionArgs();

    /**
     * Customer-provided stream subscription description
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Customer-provided stream subscription description
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Stream subscription enabled status
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Stream subscription enabled status
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Lists of events to be included/excluded on the stream subscription
     * 
     */
    @Import(name="eventSelector")
    private @Nullable Output<StreamSubscriptionEventSelectorArgs> eventSelector;

    /**
     * @return Lists of events to be included/excluded on the stream subscription
     * 
     */
    public Optional<Output<StreamSubscriptionEventSelectorArgs>> eventSelector() {
        return Optional.ofNullable(this.eventSelector);
    }

    /**
     * Lists of metrics to be included/excluded on the stream subscription
     * 
     */
    @Import(name="metricSelector")
    private @Nullable Output<StreamSubscriptionMetricSelectorArgs> metricSelector;

    /**
     * @return Lists of metrics to be included/excluded on the stream subscription
     * 
     */
    public Optional<Output<StreamSubscriptionMetricSelectorArgs>> metricSelector() {
        return Optional.ofNullable(this.metricSelector);
    }

    /**
     * Customer-provided stream subscription name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Customer-provided stream subscription name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The details of the subscriber to the Equinix Stream
     * 
     */
    @Import(name="sink", required=true)
    private Output<StreamSubscriptionSinkArgs> sink;

    /**
     * @return The details of the subscriber to the Equinix Stream
     * 
     */
    public Output<StreamSubscriptionSinkArgs> sink() {
        return this.sink;
    }

    /**
     * The uuid of the stream that is the target of the stream subscription
     * 
     */
    @Import(name="streamId", required=true)
    private Output<String> streamId;

    /**
     * @return The uuid of the stream that is the target of the stream subscription
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }

    @Import(name="timeouts")
    private @Nullable Output<StreamSubscriptionTimeoutsArgs> timeouts;

    public Optional<Output<StreamSubscriptionTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Type of the stream subscription request
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the stream subscription request
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StreamSubscriptionArgs() {}

    private StreamSubscriptionArgs(StreamSubscriptionArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.eventSelector = $.eventSelector;
        this.metricSelector = $.metricSelector;
        this.name = $.name;
        this.sink = $.sink;
        this.streamId = $.streamId;
        this.timeouts = $.timeouts;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSubscriptionArgs $;

        public Builder() {
            $ = new StreamSubscriptionArgs();
        }

        public Builder(StreamSubscriptionArgs defaults) {
            $ = new StreamSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Customer-provided stream subscription description
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided stream subscription description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Stream subscription enabled status
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Stream subscription enabled status
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventSelector Lists of events to be included/excluded on the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder eventSelector(@Nullable Output<StreamSubscriptionEventSelectorArgs> eventSelector) {
            $.eventSelector = eventSelector;
            return this;
        }

        /**
         * @param eventSelector Lists of events to be included/excluded on the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder eventSelector(StreamSubscriptionEventSelectorArgs eventSelector) {
            return eventSelector(Output.of(eventSelector));
        }

        /**
         * @param metricSelector Lists of metrics to be included/excluded on the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder metricSelector(@Nullable Output<StreamSubscriptionMetricSelectorArgs> metricSelector) {
            $.metricSelector = metricSelector;
            return this;
        }

        /**
         * @param metricSelector Lists of metrics to be included/excluded on the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder metricSelector(StreamSubscriptionMetricSelectorArgs metricSelector) {
            return metricSelector(Output.of(metricSelector));
        }

        /**
         * @param name Customer-provided stream subscription name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Customer-provided stream subscription name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sink The details of the subscriber to the Equinix Stream
         * 
         * @return builder
         * 
         */
        public Builder sink(Output<StreamSubscriptionSinkArgs> sink) {
            $.sink = sink;
            return this;
        }

        /**
         * @param sink The details of the subscriber to the Equinix Stream
         * 
         * @return builder
         * 
         */
        public Builder sink(StreamSubscriptionSinkArgs sink) {
            return sink(Output.of(sink));
        }

        /**
         * @param streamId The uuid of the stream that is the target of the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder streamId(Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId The uuid of the stream that is the target of the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        public Builder timeouts(@Nullable Output<StreamSubscriptionTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(StreamSubscriptionTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param type Type of the stream subscription request
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the stream subscription request
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StreamSubscriptionArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionArgs", "description");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionArgs", "enabled");
            }
            if ($.sink == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionArgs", "sink");
            }
            if ($.streamId == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionArgs", "streamId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionArgs", "type");
            }
            return $;
        }
    }

}
