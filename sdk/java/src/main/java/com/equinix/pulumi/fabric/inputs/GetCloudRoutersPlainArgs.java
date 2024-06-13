// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.GetCloudRoutersFilter;
import com.equinix.pulumi.fabric.inputs.GetCloudRoutersPagination;
import com.equinix.pulumi.fabric.inputs.GetCloudRoutersSort;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudRoutersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudRoutersPlainArgs Empty = new GetCloudRoutersPlainArgs();

    /**
     * Filters for the Data Source Search Request. Maximum of 8 total filters.
     * 
     */
    @Import(name="filters", required=true)
    private List<GetCloudRoutersFilter> filters;

    /**
     * @return Filters for the Data Source Search Request. Maximum of 8 total filters.
     * 
     */
    public List<GetCloudRoutersFilter> filters() {
        return this.filters;
    }

    /**
     * Pagination details for the Data Source Search Request
     * 
     */
    @Import(name="pagination")
    private @Nullable GetCloudRoutersPagination pagination;

    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    public Optional<GetCloudRoutersPagination> pagination() {
        return Optional.ofNullable(this.pagination);
    }

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="sort")
    private @Nullable GetCloudRoutersSort sort;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Optional<GetCloudRoutersSort> sort() {
        return Optional.ofNullable(this.sort);
    }

    private GetCloudRoutersPlainArgs() {}

    private GetCloudRoutersPlainArgs(GetCloudRoutersPlainArgs $) {
        this.filters = $.filters;
        this.pagination = $.pagination;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudRoutersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudRoutersPlainArgs $;

        public Builder() {
            $ = new GetCloudRoutersPlainArgs();
        }

        public Builder(GetCloudRoutersPlainArgs defaults) {
            $ = new GetCloudRoutersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filters for the Data Source Search Request. Maximum of 8 total filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetCloudRoutersFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters for the Data Source Search Request. Maximum of 8 total filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetCloudRoutersFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param pagination Pagination details for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder pagination(@Nullable GetCloudRoutersPagination pagination) {
            $.pagination = pagination;
            return this;
        }

        /**
         * @param sort Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable GetCloudRoutersSort sort) {
            $.sort = sort;
            return this;
        }

        public GetCloudRoutersPlainArgs build() {
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            return $;
        }
    }

}
