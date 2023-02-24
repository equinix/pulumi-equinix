// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileAccount {
    /**
     * @return Account Name
     * 
     */
    private @Nullable String accountName;
    /**
     * @return Account Number
     * 
     */
    private @Nullable Integer accountNumber;
    /**
     * @return Global Customer organization identifier
     * 
     */
    private @Nullable String globalCustId;
    /**
     * @return Global organization identifier
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
     * @return Enterprise datastore id
     * 
     */
    private @Nullable String ucmId;

    private ServiceProfileAccount() {}
    /**
     * @return Account Name
     * 
     */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * @return Account Number
     * 
     */
    public Optional<Integer> accountNumber() {
        return Optional.ofNullable(this.accountNumber);
    }
    /**
     * @return Global Customer organization identifier
     * 
     */
    public Optional<String> globalCustId() {
        return Optional.ofNullable(this.globalCustId);
    }
    /**
     * @return Global organization identifier
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
     * @return Enterprise datastore id
     * 
     */
    public Optional<String> ucmId() {
        return Optional.ofNullable(this.ucmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileAccount defaults) {
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
        private @Nullable String ucmId;
        public Builder() {}
        public Builder(ServiceProfileAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.accountNumber = defaults.accountNumber;
    	      this.globalCustId = defaults.globalCustId;
    	      this.globalOrgId = defaults.globalOrgId;
    	      this.globalOrganizationName = defaults.globalOrganizationName;
    	      this.orgId = defaults.orgId;
    	      this.organizationName = defaults.organizationName;
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
        public Builder ucmId(@Nullable String ucmId) {
            this.ucmId = ucmId;
            return this;
        }
        public ServiceProfileAccount build() {
            final var o = new ServiceProfileAccount();
            o.accountName = accountName;
            o.accountNumber = accountNumber;
            o.globalCustId = globalCustId;
            o.globalOrgId = globalOrgId;
            o.globalOrganizationName = globalOrganizationName;
            o.orgId = orgId;
            o.organizationName = organizationName;
            o.ucmId = ucmId;
            return o;
        }
    }
}
