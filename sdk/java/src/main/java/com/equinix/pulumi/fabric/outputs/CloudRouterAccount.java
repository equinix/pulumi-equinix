// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudRouterAccount {
    /**
     * @return Account Number
     * 
     */
    private @Nullable Integer accountNumber;

    private CloudRouterAccount() {}
    /**
     * @return Account Number
     * 
     */
    public Optional<Integer> accountNumber() {
        return Optional.ofNullable(this.accountNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRouterAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer accountNumber;
        public Builder() {}
        public Builder(CloudRouterAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
        }

        @CustomType.Setter
        public Builder accountNumber(@Nullable Integer accountNumber) {

            this.accountNumber = accountNumber;
            return this;
        }
        public CloudRouterAccount build() {
            final var _resultValue = new CloudRouterAccount();
            _resultValue.accountNumber = accountNumber;
            return _resultValue;
        }
    }
}