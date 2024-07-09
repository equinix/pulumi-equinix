// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    /**
     * Account location metro code.
     * 
     */
    @Import(name="metroCode", required=true)
    private Output<String> metroCode;

    /**
     * @return Account location metro code.
     * 
     */
    public Output<String> metroCode() {
        return this.metroCode;
    }

    /**
     * Account name for filtering.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Account name for filtering.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAccountArgs() {}

    private GetAccountArgs(GetAccountArgs $) {
        this.metroCode = $.metroCode;
        this.name = $.name;
        this.projectId = $.projectId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountArgs $;

        public Builder() {
            $ = new GetAccountArgs();
        }

        public Builder(GetAccountArgs defaults) {
            $ = new GetAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metroCode Account location metro code.
         * 
         * @return builder
         * 
         */
        public Builder metroCode(Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param metroCode Account location metro code.
         * 
         * @return builder
         * 
         */
        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        /**
         * @param name Account name for filtering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Account name for filtering.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique Identifier for the project resource where the account is scoped to.If you leave it out, all the billing accounts under all projects in your organization will be returned and it may return more than one account.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param status Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Account status for filtering. Possible values are: `Active`, `Processing`, `Submitted`, `Staged`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetAccountArgs build() {
            if ($.metroCode == null) {
                throw new MissingRequiredPropertyException("GetAccountArgs", "metroCode");
            }
            return $;
        }
    }

}
