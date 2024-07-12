// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudRoutersPaginationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudRoutersPaginationArgs Empty = new GetCloudRoutersPaginationArgs();

    /**
     * Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    @Import(name="offset")
    private @Nullable Output<Integer> offset;

    /**
     * @return The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    public Optional<Output<Integer>> offset() {
        return Optional.ofNullable(this.offset);
    }

    private GetCloudRoutersPaginationArgs() {}

    private GetCloudRoutersPaginationArgs(GetCloudRoutersPaginationArgs $) {
        this.limit = $.limit;
        this.offset = $.offset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudRoutersPaginationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudRoutersPaginationArgs $;

        public Builder() {
            $ = new GetCloudRoutersPaginationArgs();
        }

        public Builder(GetCloudRoutersPaginationArgs defaults) {
            $ = new GetCloudRoutersPaginationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param offset The page offset for the pagination request. Index of the first element. Default is 0.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<Integer> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset The page offset for the pagination request. Index of the first element. Default is 0.
         * 
         * @return builder
         * 
         */
        public Builder offset(Integer offset) {
            return offset(Output.of(offset));
        }

        public GetCloudRoutersPaginationArgs build() {
            return $;
        }
    }

}
