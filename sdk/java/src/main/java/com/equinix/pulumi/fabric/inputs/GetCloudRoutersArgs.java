// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.GetCloudRoutersFilterArgs;
import com.equinix.pulumi.fabric.inputs.GetCloudRoutersPaginationArgs;
import com.equinix.pulumi.fabric.inputs.GetCloudRoutersSortArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudRoutersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudRoutersArgs Empty = new GetCloudRoutersArgs();

    /**
     * Filters for the Data Source Search Request. Maximum of 8 total filters.
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<GetCloudRoutersFilterArgs>> filters;

    /**
     * @return Filters for the Data Source Search Request. Maximum of 8 total filters.
     * 
     */
    public Output<List<GetCloudRoutersFilterArgs>> filters() {
        return this.filters;
    }

    /**
     * Pagination details for the Data Source Search Request
     * 
     */
    @Import(name="pagination")
    private @Nullable Output<GetCloudRoutersPaginationArgs> pagination;

    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    public Optional<Output<GetCloudRoutersPaginationArgs>> pagination() {
        return Optional.ofNullable(this.pagination);
    }

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="sort")
    private @Nullable Output<GetCloudRoutersSortArgs> sort;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Optional<Output<GetCloudRoutersSortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private GetCloudRoutersArgs() {}

    private GetCloudRoutersArgs(GetCloudRoutersArgs $) {
        this.filters = $.filters;
        this.pagination = $.pagination;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudRoutersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudRoutersArgs $;

        public Builder() {
            $ = new GetCloudRoutersArgs();
        }

        public Builder(GetCloudRoutersArgs defaults) {
            $ = new GetCloudRoutersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filters for the Data Source Search Request. Maximum of 8 total filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(Output<List<GetCloudRoutersFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters for the Data Source Search Request. Maximum of 8 total filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetCloudRoutersFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filters for the Data Source Search Request. Maximum of 8 total filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetCloudRoutersFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param pagination Pagination details for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder pagination(@Nullable Output<GetCloudRoutersPaginationArgs> pagination) {
            $.pagination = pagination;
            return this;
        }

        /**
         * @param pagination Pagination details for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder pagination(GetCloudRoutersPaginationArgs pagination) {
            return pagination(Output.of(pagination));
        }

        /**
         * @param sort Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<GetCloudRoutersSortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sort(GetCloudRoutersSortArgs sort) {
            return sort(Output.of(sort));
        }

        public GetCloudRoutersArgs build() {
            if ($.filters == null) {
                throw new MissingRequiredPropertyException("GetCloudRoutersArgs", "filters");
            }
            return $;
        }
    }

}