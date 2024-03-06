// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionRedundancy {
    /**
     * @return Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
     * 
     */
    private @Nullable String group;
    /**
     * @return Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    private @Nullable String priority;

    private ConnectionRedundancy() {}
    /**
     * @return Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private @Nullable String priority;
        public Builder() {}
        public Builder(ConnectionRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        public ConnectionRedundancy build() {
            final var _resultValue = new ConnectionRedundancy();
            _resultValue.group = group;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}
