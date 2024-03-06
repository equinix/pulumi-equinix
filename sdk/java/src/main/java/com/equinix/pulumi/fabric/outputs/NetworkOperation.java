// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkOperation {
    /**
     * @return Progress towards provisioning a given asset.
     * 
     */
    private @Nullable String equinixStatus;

    private NetworkOperation() {}
    /**
     * @return Progress towards provisioning a given asset.
     * 
     */
    public Optional<String> equinixStatus() {
        return Optional.ofNullable(this.equinixStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String equinixStatus;
        public Builder() {}
        public Builder(NetworkOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equinixStatus = defaults.equinixStatus;
        }

        @CustomType.Setter
        public Builder equinixStatus(@Nullable String equinixStatus) {
            this.equinixStatus = equinixStatus;
            return this;
        }
        public NetworkOperation build() {
            final var _resultValue = new NetworkOperation();
            _resultValue.equinixStatus = equinixStatus;
            return _resultValue;
        }
    }
}