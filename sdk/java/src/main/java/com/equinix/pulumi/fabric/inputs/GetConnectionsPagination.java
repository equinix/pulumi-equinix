// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionsPagination extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionsPagination Empty = new GetConnectionsPagination();

    /**
     * Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    @Import(name="limit")
    private @Nullable Integer limit;

    /**
     * @return Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    @Import(name="offset")
    private @Nullable Integer offset;

    /**
     * @return The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }

    private GetConnectionsPagination() {}

    private GetConnectionsPagination(GetConnectionsPagination $) {
        this.limit = $.limit;
        this.offset = $.offset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionsPagination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionsPagination $;

        public Builder() {
            $ = new GetConnectionsPagination();
        }

        public Builder(GetConnectionsPagination defaults) {
            $ = new GetConnectionsPagination(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param offset The page offset for the pagination request. Index of the first element. Default is 0.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Integer offset) {
            $.offset = offset;
            return this;
        }

        public GetConnectionsPagination build() {
            return $;
        }
    }

}
