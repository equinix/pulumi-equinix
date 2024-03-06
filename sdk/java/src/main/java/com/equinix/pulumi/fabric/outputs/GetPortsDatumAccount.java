// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortsDatumAccount {
    /**
     * @return Legal name of the accountholder.
     * 
     */
    private String accountName;
    /**
     * @return Equinix-assigned account number.
     * 
     */
    private Integer accountNumber;
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    private String globalCustId;
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    private String globalOrgId;
    /**
     * @return Equinix-assigned name of the subscriber&#39;s parent organization.
     * 
     */
    private String globalOrganizationName;
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s organization.
     * 
     */
    private Integer orgId;
    /**
     * @return Equinix-assigned name of the subscriber&#39;s organization.
     * 
     */
    private String organizationName;
    /**
     * @return Enterprise datastore id
     * 
     */
    private String ucmId;

    private GetPortsDatumAccount() {}
    /**
     * @return Legal name of the accountholder.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return Equinix-assigned account number.
     * 
     */
    public Integer accountNumber() {
        return this.accountNumber;
    }
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    public String globalCustId() {
        return this.globalCustId;
    }
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    public String globalOrgId() {
        return this.globalOrgId;
    }
    /**
     * @return Equinix-assigned name of the subscriber&#39;s parent organization.
     * 
     */
    public String globalOrganizationName() {
        return this.globalOrganizationName;
    }
    /**
     * @return Equinix-assigned ID of the subscriber&#39;s organization.
     * 
     */
    public Integer orgId() {
        return this.orgId;
    }
    /**
     * @return Equinix-assigned name of the subscriber&#39;s organization.
     * 
     */
    public String organizationName() {
        return this.organizationName;
    }
    /**
     * @return Enterprise datastore id
     * 
     */
    public String ucmId() {
        return this.ucmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatumAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private Integer accountNumber;
        private String globalCustId;
        private String globalOrgId;
        private String globalOrganizationName;
        private Integer orgId;
        private String organizationName;
        private String ucmId;
        public Builder() {}
        public Builder(GetPortsDatumAccount defaults) {
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
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder accountNumber(Integer accountNumber) {
            this.accountNumber = Objects.requireNonNull(accountNumber);
            return this;
        }
        @CustomType.Setter
        public Builder globalCustId(String globalCustId) {
            this.globalCustId = Objects.requireNonNull(globalCustId);
            return this;
        }
        @CustomType.Setter
        public Builder globalOrgId(String globalOrgId) {
            this.globalOrgId = Objects.requireNonNull(globalOrgId);
            return this;
        }
        @CustomType.Setter
        public Builder globalOrganizationName(String globalOrganizationName) {
            this.globalOrganizationName = Objects.requireNonNull(globalOrganizationName);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(Integer orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder organizationName(String organizationName) {
            this.organizationName = Objects.requireNonNull(organizationName);
            return this;
        }
        @CustomType.Setter
        public Builder ucmId(String ucmId) {
            this.ucmId = Objects.requireNonNull(ucmId);
            return this;
        }
        public GetPortsDatumAccount build() {
            final var _resultValue = new GetPortsDatumAccount();
            _resultValue.accountName = accountName;
            _resultValue.accountNumber = accountNumber;
            _resultValue.globalCustId = globalCustId;
            _resultValue.globalOrgId = globalOrgId;
            _resultValue.globalOrganizationName = globalOrganizationName;
            _resultValue.orgId = orgId;
            _resultValue.organizationName = organizationName;
            _resultValue.ucmId = ucmId;
            return _resultValue;
        }
    }
}
