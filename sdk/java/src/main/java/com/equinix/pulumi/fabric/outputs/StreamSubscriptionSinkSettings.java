// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamSubscriptionSinkSettings {
    private @Nullable String applicationKey;
    private @Nullable String eventIndex;
    private @Nullable String eventUri;
    private @Nullable String metricIndex;
    private @Nullable String metricUri;
    private @Nullable String source;

    private StreamSubscriptionSinkSettings() {}
    public Optional<String> applicationKey() {
        return Optional.ofNullable(this.applicationKey);
    }
    public Optional<String> eventIndex() {
        return Optional.ofNullable(this.eventIndex);
    }
    public Optional<String> eventUri() {
        return Optional.ofNullable(this.eventUri);
    }
    public Optional<String> metricIndex() {
        return Optional.ofNullable(this.metricIndex);
    }
    public Optional<String> metricUri() {
        return Optional.ofNullable(this.metricUri);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamSubscriptionSinkSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationKey;
        private @Nullable String eventIndex;
        private @Nullable String eventUri;
        private @Nullable String metricIndex;
        private @Nullable String metricUri;
        private @Nullable String source;
        public Builder() {}
        public Builder(StreamSubscriptionSinkSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationKey = defaults.applicationKey;
    	      this.eventIndex = defaults.eventIndex;
    	      this.eventUri = defaults.eventUri;
    	      this.metricIndex = defaults.metricIndex;
    	      this.metricUri = defaults.metricUri;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder applicationKey(@Nullable String applicationKey) {

            this.applicationKey = applicationKey;
            return this;
        }
        @CustomType.Setter
        public Builder eventIndex(@Nullable String eventIndex) {

            this.eventIndex = eventIndex;
            return this;
        }
        @CustomType.Setter
        public Builder eventUri(@Nullable String eventUri) {

            this.eventUri = eventUri;
            return this;
        }
        @CustomType.Setter
        public Builder metricIndex(@Nullable String metricIndex) {

            this.metricIndex = metricIndex;
            return this;
        }
        @CustomType.Setter
        public Builder metricUri(@Nullable String metricUri) {

            this.metricUri = metricUri;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        public StreamSubscriptionSinkSettings build() {
            final var _resultValue = new StreamSubscriptionSinkSettings();
            _resultValue.applicationKey = applicationKey;
            _resultValue.eventIndex = eventIndex;
            _resultValue.eventUri = eventUri;
            _resultValue.metricIndex = metricIndex;
            _resultValue.metricUri = metricUri;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
