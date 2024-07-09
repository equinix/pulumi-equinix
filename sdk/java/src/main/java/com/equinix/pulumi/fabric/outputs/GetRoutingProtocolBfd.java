// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoutingProtocolBfd {
    /**
     * @return Bidirectional Forwarding Detection enablement
     * 
     */
    private Boolean enabled;
    /**
     * @return Interval range between the received BFD control packets
     * 
     */
    private @Nullable String interval;

    private GetRoutingProtocolBfd() {}
    /**
     * @return Bidirectional Forwarding Detection enablement
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Interval range between the received BFD control packets
     * 
     */
    public Optional<String> interval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingProtocolBfd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String interval;
        public Builder() {}
        public Builder(GetRoutingProtocolBfd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBfd", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable String interval) {

            this.interval = interval;
            return this;
        }
        public GetRoutingProtocolBfd build() {
            final var _resultValue = new GetRoutingProtocolBfd();
            _resultValue.enabled = enabled;
            _resultValue.interval = interval;
            return _resultValue;
        }
    }
}
