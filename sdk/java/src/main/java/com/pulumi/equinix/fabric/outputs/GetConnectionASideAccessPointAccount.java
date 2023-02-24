// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointAccount {
    private String accountName;
    private Integer accountNumber;
    private String globalCustId;
    private String globalOrgId;
    private String globalOrganizationName;
    private Integer orgId;
    private String organizationName;

    private GetConnectionASideAccessPointAccount() {}
    public String accountName() {
        return this.accountName;
    }
    public Integer accountNumber() {
        return this.accountNumber;
    }
    public String globalCustId() {
        return this.globalCustId;
    }
    public String globalOrgId() {
        return this.globalOrgId;
    }
    public String globalOrganizationName() {
        return this.globalOrganizationName;
    }
    public Integer orgId() {
        return this.orgId;
    }
    public String organizationName() {
        return this.organizationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointAccount defaults) {
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
        public Builder() {}
        public Builder(GetConnectionASideAccessPointAccount defaults) {
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
        public GetConnectionASideAccessPointAccount build() {
            final var o = new GetConnectionASideAccessPointAccount();
            o.accountName = accountName;
            o.accountNumber = accountNumber;
            o.globalCustId = globalCustId;
            o.globalOrgId = globalOrgId;
            o.globalOrganizationName = globalOrganizationName;
            o.orgId = orgId;
            o.organizationName = organizationName;
            return o;
        }
    }
}
