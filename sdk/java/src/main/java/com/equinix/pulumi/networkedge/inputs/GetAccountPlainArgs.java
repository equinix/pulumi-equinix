// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * Account location metro code.
     * 
     */
    @Import(name="metroCode", required=true)
    private String metroCode;

    /**
     * @return Account location metro code.
     * 
     */
    public String metroCode() {
        return this.metroCode;
    }

    /**
     * Account name for filtering.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Account name for filtering.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.metroCode = $.metroCode;
        this.name = $.name;
        this.projectId = $.projectId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metroCode Account location metro code.
         * 
         * @return builder
         * 
         */
        public Builder metroCode(String metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param name Account name for filtering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param projectId Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param status Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetAccountPlainArgs build() {
            if ($.metroCode == null) {
                throw new MissingRequiredPropertyException("GetAccountPlainArgs", "metroCode");
            }
            return $;
        }
    }

}
