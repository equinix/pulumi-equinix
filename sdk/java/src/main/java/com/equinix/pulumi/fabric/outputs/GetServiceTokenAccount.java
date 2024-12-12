// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTokenAccount {
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

    private GetServiceTokenAccount() {}
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

    public static Builder builder(GetServiceTokenAccount defaults) {
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
        public Builder(GetServiceTokenAccount defaults) {
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
            if (accountName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder accountNumber(Integer accountNumber) {
            if (accountNumber == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "accountNumber");
            }
            this.accountNumber = accountNumber;
            return this;
        }
        @CustomType.Setter
        public Builder globalCustId(String globalCustId) {
            if (globalCustId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "globalCustId");
            }
            this.globalCustId = globalCustId;
            return this;
        }
        @CustomType.Setter
        public Builder globalOrgId(String globalOrgId) {
            if (globalOrgId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "globalOrgId");
            }
            this.globalOrgId = globalOrgId;
            return this;
        }
        @CustomType.Setter
        public Builder globalOrganizationName(String globalOrganizationName) {
            if (globalOrganizationName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "globalOrganizationName");
            }
            this.globalOrganizationName = globalOrganizationName;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(Integer orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder organizationName(String organizationName) {
            if (organizationName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "organizationName");
            }
            this.organizationName = organizationName;
            return this;
        }
        @CustomType.Setter
        public Builder ucmId(String ucmId) {
            if (ucmId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenAccount", "ucmId");
            }
            this.ucmId = ucmId;
            return this;
        }
        public GetServiceTokenAccount build() {
            final var _resultValue = new GetServiceTokenAccount();
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
