// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAccount {
    private @Nullable String accountName;
    private @Nullable Integer accountNumber;
    private @Nullable String globalCustId;
    private @Nullable String globalOrgId;
    private @Nullable String globalOrganizationName;
    private @Nullable Integer orgId;
    private @Nullable String organizationName;

    private ConnectionAccount() {}
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    public Optional<Integer> accountNumber() {
        return Optional.ofNullable(this.accountNumber);
    }
    public Optional<String> globalCustId() {
        return Optional.ofNullable(this.globalCustId);
    }
    public Optional<String> globalOrgId() {
        return Optional.ofNullable(this.globalOrgId);
    }
    public Optional<String> globalOrganizationName() {
        return Optional.ofNullable(this.globalOrganizationName);
    }
    public Optional<Integer> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public Optional<String> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable Integer accountNumber;
        private @Nullable String globalCustId;
        private @Nullable String globalOrgId;
        private @Nullable String globalOrganizationName;
        private @Nullable Integer orgId;
        private @Nullable String organizationName;
        public Builder() {}
        public Builder(ConnectionAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.accountNumber = defaults.accountNumber;
    	      this.globalCustId = defaults.globalCustId;
    	      this.globalOrgId = defaults.globalOrgId;
    	      this.globalOrganizationName = defaults.globalOrganizationName;
    	      this.orgId = defaults.orgId;
    	      this.organizationName = defaults.organizationName;
        }

        @CustomType.Setter
        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder accountNumber(@Nullable Integer accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }
        @CustomType.Setter
        public Builder globalCustId(@Nullable String globalCustId) {
            this.globalCustId = globalCustId;
            return this;
        }
        @CustomType.Setter
        public Builder globalOrgId(@Nullable String globalOrgId) {
            this.globalOrgId = globalOrgId;
            return this;
        }
        @CustomType.Setter
        public Builder globalOrganizationName(@Nullable String globalOrganizationName) {
            this.globalOrganizationName = globalOrganizationName;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder organizationName(@Nullable String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public ConnectionAccount build() {
            final var _resultValue = new ConnectionAccount();
            _resultValue.accountName = accountName;
            _resultValue.accountNumber = accountNumber;
            _resultValue.globalCustId = globalCustId;
            _resultValue.globalOrgId = globalOrgId;
            _resultValue.globalOrganizationName = globalOrganizationName;
            _resultValue.orgId = orgId;
            _resultValue.organizationName = organizationName;
            return _resultValue;
        }
    }
}
