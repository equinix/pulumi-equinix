// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.GetNetworksFilterArgs;
import com.equinix.pulumi.fabric.inputs.GetNetworksPaginationArgs;
import com.equinix.pulumi.fabric.inputs.GetNetworksSortArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksArgs Empty = new GetNetworksArgs();

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<GetNetworksFilterArgs>> filters;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Output<List<GetNetworksFilterArgs>> filters() {
        return this.filters;
    }

    /**
     * Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     * 
     */
    @Import(name="outerOperator", required=true)
    private Output<String> outerOperator;

    /**
     * @return Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     * 
     */
    public Output<String> outerOperator() {
        return this.outerOperator;
    }

    /**
     * Pagination details for the Data Source Search Request
     * 
     */
    @Import(name="pagination")
    private @Nullable Output<GetNetworksPaginationArgs> pagination;

    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    public Optional<Output<GetNetworksPaginationArgs>> pagination() {
        return Optional.ofNullable(this.pagination);
    }

    /**
     * Filters for the Data Source Search Request
     * 
     */
    @Import(name="sorts")
    private @Nullable Output<List<GetNetworksSortArgs>> sorts;

    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public Optional<Output<List<GetNetworksSortArgs>>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetNetworksArgs() {}

    private GetNetworksArgs(GetNetworksArgs $) {
        this.filters = $.filters;
        this.outerOperator = $.outerOperator;
        this.pagination = $.pagination;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksArgs $;

        public Builder() {
            $ = new GetNetworksArgs();
        }

        public Builder(GetNetworksArgs defaults) {
            $ = new GetNetworksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder filters(Output<List<GetNetworksFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetNetworksFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder filters(GetNetworksFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param outerOperator Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
         * 
         * @return builder
         * 
         */
        public Builder outerOperator(Output<String> outerOperator) {
            $.outerOperator = outerOperator;
            return this;
        }

        /**
         * @param outerOperator Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
         * 
         * @return builder
         * 
         */
        public Builder outerOperator(String outerOperator) {
            return outerOperator(Output.of(outerOperator));
        }

        /**
         * @param pagination Pagination details for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder pagination(@Nullable Output<GetNetworksPaginationArgs> pagination) {
            $.pagination = pagination;
            return this;
        }

        /**
         * @param pagination Pagination details for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder pagination(GetNetworksPaginationArgs pagination) {
            return pagination(Output.of(pagination));
        }

        /**
         * @param sorts Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable Output<List<GetNetworksSortArgs>> sorts) {
            $.sorts = sorts;
            return this;
        }

        /**
         * @param sorts Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sorts(List<GetNetworksSortArgs> sorts) {
            return sorts(Output.of(sorts));
        }

        /**
         * @param sorts Filters for the Data Source Search Request
         * 
         * @return builder
         * 
         */
        public Builder sorts(GetNetworksSortArgs... sorts) {
            return sorts(List.of(sorts));
        }

        public GetNetworksArgs build() {
            if ($.filters == null) {
                throw new MissingRequiredPropertyException("GetNetworksArgs", "filters");
            }
            if ($.outerOperator == null) {
                throw new MissingRequiredPropertyException("GetNetworksArgs", "outerOperator");
            }
            return $;
        }
    }

}
