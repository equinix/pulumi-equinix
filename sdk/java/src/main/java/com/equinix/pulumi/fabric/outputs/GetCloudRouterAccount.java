// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetCloudRouterAccount {
    /**
     * @return Account Number
     * 
     */
    private Integer accountNumber;

    private GetCloudRouterAccount() {}
    /**
     * @return Account Number
     * 
     */
    public Integer accountNumber() {
        return this.accountNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudRouterAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accountNumber;
        public Builder() {}
        public Builder(GetCloudRouterAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
        }

        @CustomType.Setter
        public Builder accountNumber(Integer accountNumber) {
            if (accountNumber == null) {
              throw new MissingRequiredPropertyException("GetCloudRouterAccount", "accountNumber");
            }
            this.accountNumber = accountNumber;
            return this;
        }
        public GetCloudRouterAccount build() {
            final var _resultValue = new GetCloudRouterAccount();
            _resultValue.accountNumber = accountNumber;
            return _resultValue;
        }
    }
}
