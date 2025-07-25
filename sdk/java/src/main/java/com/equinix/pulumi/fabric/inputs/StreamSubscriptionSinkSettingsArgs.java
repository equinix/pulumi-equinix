// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSubscriptionSinkSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSubscriptionSinkSettingsArgs Empty = new StreamSubscriptionSinkSettingsArgs();

    @Import(name="applicationKey")
    private @Nullable Output<String> applicationKey;

    public Optional<Output<String>> applicationKey() {
        return Optional.ofNullable(this.applicationKey);
    }

    @Import(name="eventIndex")
    private @Nullable Output<String> eventIndex;

    public Optional<Output<String>> eventIndex() {
        return Optional.ofNullable(this.eventIndex);
    }

    @Import(name="eventUri")
    private @Nullable Output<String> eventUri;

    public Optional<Output<String>> eventUri() {
        return Optional.ofNullable(this.eventUri);
    }

    @Import(name="metricIndex")
    private @Nullable Output<String> metricIndex;

    public Optional<Output<String>> metricIndex() {
        return Optional.ofNullable(this.metricIndex);
    }

    @Import(name="metricUri")
    private @Nullable Output<String> metricUri;

    public Optional<Output<String>> metricUri() {
        return Optional.ofNullable(this.metricUri);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private StreamSubscriptionSinkSettingsArgs() {}

    private StreamSubscriptionSinkSettingsArgs(StreamSubscriptionSinkSettingsArgs $) {
        this.applicationKey = $.applicationKey;
        this.eventIndex = $.eventIndex;
        this.eventUri = $.eventUri;
        this.metricIndex = $.metricIndex;
        this.metricUri = $.metricUri;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSubscriptionSinkSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSubscriptionSinkSettingsArgs $;

        public Builder() {
            $ = new StreamSubscriptionSinkSettingsArgs();
        }

        public Builder(StreamSubscriptionSinkSettingsArgs defaults) {
            $ = new StreamSubscriptionSinkSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationKey(@Nullable Output<String> applicationKey) {
            $.applicationKey = applicationKey;
            return this;
        }

        public Builder applicationKey(String applicationKey) {
            return applicationKey(Output.of(applicationKey));
        }

        public Builder eventIndex(@Nullable Output<String> eventIndex) {
            $.eventIndex = eventIndex;
            return this;
        }

        public Builder eventIndex(String eventIndex) {
            return eventIndex(Output.of(eventIndex));
        }

        public Builder eventUri(@Nullable Output<String> eventUri) {
            $.eventUri = eventUri;
            return this;
        }

        public Builder eventUri(String eventUri) {
            return eventUri(Output.of(eventUri));
        }

        public Builder metricIndex(@Nullable Output<String> metricIndex) {
            $.metricIndex = metricIndex;
            return this;
        }

        public Builder metricIndex(String metricIndex) {
            return metricIndex(Output.of(metricIndex));
        }

        public Builder metricUri(@Nullable Output<String> metricUri) {
            $.metricUri = metricUri;
            return this;
        }

        public Builder metricUri(String metricUri) {
            return metricUri(Output.of(metricUri));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public StreamSubscriptionSinkSettingsArgs build() {
            return $;
        }
    }

}
