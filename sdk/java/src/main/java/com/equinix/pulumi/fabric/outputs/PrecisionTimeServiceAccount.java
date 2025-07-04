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
public final class PrecisionTimeServiceAccount {
    /**
     * @return Account Name
     * 
     */
    private @Nullable String accountName;
    /**
     * @return Equinix Account Number
     * 
     */
    private @Nullable Integer accountNumber;
    /**
     * @return Global Customer Id
     * 
     */
    private @Nullable String globalCustId;
    /**
     * @return Customer organization naidentifierme
     * 
     */
    private @Nullable String globalOrgId;
    /**
     * @return Global organization name
     * 
     */
    private @Nullable String globalOrganizationName;
    /**
     * @return Customer organization identifier
     * 
     */
    private @Nullable Integer orgId;
    /**
     * @return Customer organization name
     * 
     */
    private @Nullable String organizationName;
    /**
     * @return Reseller account name
     * 
     */
    private @Nullable String resellerAccountName;
    /**
     * @return Reseller account number
     * 
     */
    private @Nullable Integer resellerAccountNumber;
    /**
     * @return Reseller customer organization identifier
     * 
     */
    private @Nullable Integer resellerOrgId;
    /**
     * @return Reseller account ucmId
     * 
     */
    private @Nullable String resellerUcmId;
    /**
     * @return Global organization name
     * 
     */
    private @Nullable String ucmId;

    private PrecisionTimeServiceAccount() {}
    /**
     * @return Account Name
     * 
     */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * @return Equinix Account Number
     * 
     */
    public Optional<Integer> accountNumber() {
        return Optional.ofNullable(this.accountNumber);
    }
    /**
     * @return Global Customer Id
     * 
     */
    public Optional<String> globalCustId() {
        return Optional.ofNullable(this.globalCustId);
    }
    /**
     * @return Customer organization naidentifierme
     * 
     */
    public Optional<String> globalOrgId() {
        return Optional.ofNullable(this.globalOrgId);
    }
    /**
     * @return Global organization name
     * 
     */
    public Optional<String> globalOrganizationName() {
        return Optional.ofNullable(this.globalOrganizationName);
    }
    /**
     * @return Customer organization identifier
     * 
     */
    public Optional<Integer> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Customer organization name
     * 
     */
    public Optional<String> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }
    /**
     * @return Reseller account name
     * 
     */
    public Optional<String> resellerAccountName() {
        return Optional.ofNullable(this.resellerAccountName);
    }
    /**
     * @return Reseller account number
     * 
     */
    public Optional<Integer> resellerAccountNumber() {
        return Optional.ofNullable(this.resellerAccountNumber);
    }
    /**
     * @return Reseller customer organization identifier
     * 
     */
    public Optional<Integer> resellerOrgId() {
        return Optional.ofNullable(this.resellerOrgId);
    }
    /**
     * @return Reseller account ucmId
     * 
     */
    public Optional<String> resellerUcmId() {
        return Optional.ofNullable(this.resellerUcmId);
    }
    /**
     * @return Global organization name
     * 
     */
    public Optional<String> ucmId() {
        return Optional.ofNullable(this.ucmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrecisionTimeServiceAccount defaults) {
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
        private @Nullable String resellerAccountName;
        private @Nullable Integer resellerAccountNumber;
        private @Nullable Integer resellerOrgId;
        private @Nullable String resellerUcmId;
        private @Nullable String ucmId;
        public Builder() {}
        public Builder(PrecisionTimeServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.accountNumber = defaults.accountNumber;
    	      this.globalCustId = defaults.globalCustId;
    	      this.globalOrgId = defaults.globalOrgId;
    	      this.globalOrganizationName = defaults.globalOrganizationName;
    	      this.orgId = defaults.orgId;
    	      this.organizationName = defaults.organizationName;
    	      this.resellerAccountName = defaults.resellerAccountName;
    	      this.resellerAccountNumber = defaults.resellerAccountNumber;
    	      this.resellerOrgId = defaults.resellerOrgId;
    	      this.resellerUcmId = defaults.resellerUcmId;
    	      this.ucmId = defaults.ucmId;
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
        @CustomType.Setter
        public Builder resellerAccountName(@Nullable String resellerAccountName) {

            this.resellerAccountName = resellerAccountName;
            return this;
        }
        @CustomType.Setter
        public Builder resellerAccountNumber(@Nullable Integer resellerAccountNumber) {

            this.resellerAccountNumber = resellerAccountNumber;
            return this;
        }
        @CustomType.Setter
        public Builder resellerOrgId(@Nullable Integer resellerOrgId) {

            this.resellerOrgId = resellerOrgId;
            return this;
        }
        @CustomType.Setter
        public Builder resellerUcmId(@Nullable String resellerUcmId) {

            this.resellerUcmId = resellerUcmId;
            return this;
        }
        @CustomType.Setter
        public Builder ucmId(@Nullable String ucmId) {

            this.ucmId = ucmId;
            return this;
        }
        public PrecisionTimeServiceAccount build() {
            final var _resultValue = new PrecisionTimeServiceAccount();
            _resultValue.accountName = accountName;
            _resultValue.accountNumber = accountNumber;
            _resultValue.globalCustId = globalCustId;
            _resultValue.globalOrgId = globalOrgId;
            _resultValue.globalOrganizationName = globalOrganizationName;
            _resultValue.orgId = orgId;
            _resultValue.organizationName = organizationName;
            _resultValue.resellerAccountName = resellerAccountName;
            _resultValue.resellerAccountNumber = resellerAccountNumber;
            _resultValue.resellerOrgId = resellerOrgId;
            _resultValue.resellerUcmId = resellerUcmId;
            _resultValue.ucmId = ucmId;
            return _resultValue;
        }
    }
}
