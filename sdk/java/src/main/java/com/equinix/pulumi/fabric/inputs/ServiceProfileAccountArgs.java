// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileAccountArgs Empty = new ServiceProfileAccountArgs();

    /**
     * Legal name of the accountholder.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return Legal name of the accountholder.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Equinix-assigned account number.
     * 
     */
    @Import(name="accountNumber")
    private @Nullable Output<Integer> accountNumber;

    /**
     * @return Equinix-assigned account number.
     * 
     */
    public Optional<Output<Integer>> accountNumber() {
        return Optional.ofNullable(this.accountNumber);
    }

    /**
     * Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    @Import(name="globalCustId")
    private @Nullable Output<String> globalCustId;

    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    public Optional<Output<String>> globalCustId() {
        return Optional.ofNullable(this.globalCustId);
    }

    /**
     * Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    @Import(name="globalOrgId")
    private @Nullable Output<String> globalOrgId;

    /**
     * @return Equinix-assigned ID of the subscriber&#39;s parent organization.
     * 
     */
    public Optional<Output<String>> globalOrgId() {
        return Optional.ofNullable(this.globalOrgId);
    }

    /**
     * Equinix-assigned name of the subscriber&#39;s parent organization.
     * 
     */
    @Import(name="globalOrganizationName")
    private @Nullable Output<String> globalOrganizationName;

    /**
     * @return Equinix-assigned name of the subscriber&#39;s parent organization.
     * 
     */
    public Optional<Output<String>> globalOrganizationName() {
        return Optional.ofNullable(this.globalOrganizationName);
    }

    /**
     * Equinix-assigned ID of the subscriber&#39;s organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<Integer> orgId;

    /**
     * @return Equinix-assigned ID of the subscriber&#39;s organization.
     * 
     */
    public Optional<Output<Integer>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Equinix-assigned name of the subscriber&#39;s organization.
     * 
     */
    @Import(name="organizationName")
    private @Nullable Output<String> organizationName;

    /**
     * @return Equinix-assigned name of the subscriber&#39;s organization.
     * 
     */
    public Optional<Output<String>> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }

    /**
     * Enterprise datastore id
     * 
     */
    @Import(name="ucmId")
    private @Nullable Output<String> ucmId;

    /**
     * @return Enterprise datastore id
     * 
     */
    public Optional<Output<String>> ucmId() {
        return Optional.ofNullable(this.ucmId);
    }

    private ServiceProfileAccountArgs() {}

    private ServiceProfileAccountArgs(ServiceProfileAccountArgs $) {
        this.accountName = $.accountName;
        this.accountNumber = $.accountNumber;
        this.globalCustId = $.globalCustId;
        this.globalOrgId = $.globalOrgId;
        this.globalOrganizationName = $.globalOrganizationName;
        this.orgId = $.orgId;
        this.organizationName = $.organizationName;
        this.ucmId = $.ucmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileAccountArgs $;

        public Builder() {
            $ = new ServiceProfileAccountArgs();
        }

        public Builder(ServiceProfileAccountArgs defaults) {
            $ = new ServiceProfileAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Legal name of the accountholder.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Legal name of the accountholder.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param accountNumber Equinix-assigned account number.
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(@Nullable Output<Integer> accountNumber) {
            $.accountNumber = accountNumber;
            return this;
        }

        /**
         * @param accountNumber Equinix-assigned account number.
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(Integer accountNumber) {
            return accountNumber(Output.of(accountNumber));
        }

        /**
         * @param globalCustId Equinix-assigned ID of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalCustId(@Nullable Output<String> globalCustId) {
            $.globalCustId = globalCustId;
            return this;
        }

        /**
         * @param globalCustId Equinix-assigned ID of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalCustId(String globalCustId) {
            return globalCustId(Output.of(globalCustId));
        }

        /**
         * @param globalOrgId Equinix-assigned ID of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalOrgId(@Nullable Output<String> globalOrgId) {
            $.globalOrgId = globalOrgId;
            return this;
        }

        /**
         * @param globalOrgId Equinix-assigned ID of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalOrgId(String globalOrgId) {
            return globalOrgId(Output.of(globalOrgId));
        }

        /**
         * @param globalOrganizationName Equinix-assigned name of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalOrganizationName(@Nullable Output<String> globalOrganizationName) {
            $.globalOrganizationName = globalOrganizationName;
            return this;
        }

        /**
         * @param globalOrganizationName Equinix-assigned name of the subscriber&#39;s parent organization.
         * 
         * @return builder
         * 
         */
        public Builder globalOrganizationName(String globalOrganizationName) {
            return globalOrganizationName(Output.of(globalOrganizationName));
        }

        /**
         * @param orgId Equinix-assigned ID of the subscriber&#39;s organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<Integer> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Equinix-assigned ID of the subscriber&#39;s organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Integer orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param organizationName Equinix-assigned name of the subscriber&#39;s organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(@Nullable Output<String> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName Equinix-assigned name of the subscriber&#39;s organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(String organizationName) {
            return organizationName(Output.of(organizationName));
        }

        /**
         * @param ucmId Enterprise datastore id
         * 
         * @return builder
         * 
         */
        public Builder ucmId(@Nullable Output<String> ucmId) {
            $.ucmId = ucmId;
            return this;
        }

        /**
         * @param ucmId Enterprise datastore id
         * 
         * @return builder
         * 
         */
        public Builder ucmId(String ucmId) {
            return ucmId(Output.of(ucmId));
        }

        public ServiceProfileAccountArgs build() {
            return $;
        }
    }

}
