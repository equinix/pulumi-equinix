// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.GetRouteAggregationsFilterArgs;
import com.equinix.pulumi.fabric.inputs.GetRouteAggregationsPaginationArgs;
import com.equinix.pulumi.fabric.inputs.GetRouteAggregationsSortArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteAggregationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteAggregationsArgs Empty = new GetRouteAggregationsArgs();

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="filter", required=true)
    private Output<GetRouteAggregationsFilterArgs> filter;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Output<GetRouteAggregationsFilterArgs> filter() {
        return this.filter;
    }

    /**
     * Pagination details for the returned route aggregations list
     * 
     */
    @Import(name="pagination")
    private @Nullable Output<GetRouteAggregationsPaginationArgs> pagination;

    /**
     * @return Pagination details for the returned route aggregations list
     * 
     */
    public Optional<Output<GetRouteAggregationsPaginationArgs>> pagination() {
        return Optional.ofNullable(this.pagination);
    }

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="sort")
    private @Nullable Output<GetRouteAggregationsSortArgs> sort;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Optional<Output<GetRouteAggregationsSortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private GetRouteAggregationsArgs() {}

    private GetRouteAggregationsArgs(GetRouteAggregationsArgs $) {
        this.filter = $.filter;
        this.pagination = $.pagination;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteAggregationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteAggregationsArgs $;

        public Builder() {
            $ = new GetRouteAggregationsArgs();
        }

        public Builder(GetRouteAggregationsArgs defaults) {
            $ = new GetRouteAggregationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<GetRouteAggregationsFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder filter(GetRouteAggregationsFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param pagination Pagination details for the returned route aggregations list
         * 
         * @return builder
         * 
         */
        public Builder pagination(@Nullable Output<GetRouteAggregationsPaginationArgs> pagination) {
            $.pagination = pagination;
            return this;
        }

        /**
         * @param pagination Pagination details for the returned route aggregations list
         * 
         * @return builder
         * 
         */
        public Builder pagination(GetRouteAggregationsPaginationArgs pagination) {
            return pagination(Output.of(pagination));
        }

        /**
         * @param sort Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable Output<GetRouteAggregationsSortArgs> sort) {
            $.sort = sort;
            return this;
        }

        /**
         * @param sort Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sort(GetRouteAggregationsSortArgs sort) {
            return sort(Output.of(sort));
        }

        public GetRouteAggregationsArgs build() {
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationsArgs", "filter");
            }
            return $;
        }
    }

}
