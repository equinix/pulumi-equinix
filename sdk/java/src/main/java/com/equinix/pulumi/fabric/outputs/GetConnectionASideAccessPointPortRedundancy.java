// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointPortRedundancy {
    private String priority;

    private GetConnectionASideAccessPointPortRedundancy() {}
    public String priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointPortRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String priority;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointPortRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public GetConnectionASideAccessPointPortRedundancy build() {
            final var _resultValue = new GetConnectionASideAccessPointPortRedundancy();
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}
