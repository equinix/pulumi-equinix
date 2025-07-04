// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetRouteAggregationRulesPagination extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteAggregationRulesPagination Empty = new GetRouteAggregationRulesPagination();

    /**
     * Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
     * 
     */
    @Import(name="limit", required=true)
    private Integer limit;

    /**
     * @return Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
     * 
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * The URL relative to the next item in the response
     * 
     */
    @Import(name="next", required=true)
    private String next;

    /**
     * @return The URL relative to the next item in the response
     * 
     */
    public String next() {
        return this.next;
    }

    /**
     * Index of the first item returned in the response. The default is 0
     * 
     */
    @Import(name="offset", required=true)
    private Integer offset;

    /**
     * @return Index of the first item returned in the response. The default is 0
     * 
     */
    public Integer offset() {
        return this.offset;
    }

    /**
     * The URL relative to the previous item in the response
     * 
     */
    @Import(name="previous", required=true)
    private String previous;

    /**
     * @return The URL relative to the previous item in the response
     * 
     */
    public String previous() {
        return this.previous;
    }

    /**
     * The total number of route agrgegation rules available to the user making the request
     * 
     */
    @Import(name="total", required=true)
    private Integer total;

    /**
     * @return The total number of route agrgegation rules available to the user making the request
     * 
     */
    public Integer total() {
        return this.total;
    }

    private GetRouteAggregationRulesPagination() {}

    private GetRouteAggregationRulesPagination(GetRouteAggregationRulesPagination $) {
        this.limit = $.limit;
        this.next = $.next;
        this.offset = $.offset;
        this.previous = $.previous;
        this.total = $.total;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteAggregationRulesPagination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteAggregationRulesPagination $;

        public Builder() {
            $ = new GetRouteAggregationRulesPagination();
        }

        public Builder(GetRouteAggregationRulesPagination defaults) {
            $ = new GetRouteAggregationRulesPagination(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param next The URL relative to the next item in the response
         * 
         * @return builder
         * 
         */
        public Builder next(String next) {
            $.next = next;
            return this;
        }

        /**
         * @param offset Index of the first item returned in the response. The default is 0
         * 
         * @return builder
         * 
         */
        public Builder offset(Integer offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param previous The URL relative to the previous item in the response
         * 
         * @return builder
         * 
         */
        public Builder previous(String previous) {
            $.previous = previous;
            return this;
        }

        /**
         * @param total The total number of route agrgegation rules available to the user making the request
         * 
         * @return builder
         * 
         */
        public Builder total(Integer total) {
            $.total = total;
            return this;
        }

        public GetRouteAggregationRulesPagination build() {
            if ($.limit == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationRulesPagination", "limit");
            }
            if ($.next == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationRulesPagination", "next");
            }
            if ($.offset == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationRulesPagination", "offset");
            }
            if ($.previous == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationRulesPagination", "previous");
            }
            if ($.total == null) {
                throw new MissingRequiredPropertyException("GetRouteAggregationRulesPagination", "total");
            }
            return $;
        }
    }

}
