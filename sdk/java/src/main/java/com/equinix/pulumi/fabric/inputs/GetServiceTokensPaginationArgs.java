// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTokensPaginationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetServiceTokensPaginationArgs Empty = new GetServiceTokensPaginationArgs();

    /**
     * Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    @Import(name="limit", required=true)
    private Output<Integer> limit;

    /**
     * @return Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
     * 
     */
    public Output<Integer> limit() {
        return this.limit;
    }

    /**
     * URL relative to the last item in the response.
     * 
     */
    @Import(name="next", required=true)
    private Output<String> next;

    /**
     * @return URL relative to the last item in the response.
     * 
     */
    public Output<String> next() {
        return this.next;
    }

    /**
     * The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    @Import(name="offset", required=true)
    private Output<Integer> offset;

    /**
     * @return The page offset for the pagination request. Index of the first element. Default is 0.
     * 
     */
    public Output<Integer> offset() {
        return this.offset;
    }

    /**
     * URL relative to the first item in the response.
     * 
     */
    @Import(name="previous", required=true)
    private Output<String> previous;

    /**
     * @return URL relative to the first item in the response.
     * 
     */
    public Output<String> previous() {
        return this.previous;
    }

    /**
     * Total number of elements returned.
     * 
     */
    @Import(name="total", required=true)
    private Output<Integer> total;

    /**
     * @return Total number of elements returned.
     * 
     */
    public Output<Integer> total() {
        return this.total;
    }

    private GetServiceTokensPaginationArgs() {}

    private GetServiceTokensPaginationArgs(GetServiceTokensPaginationArgs $) {
        this.limit = $.limit;
        this.next = $.next;
        this.offset = $.offset;
        this.previous = $.previous;
        this.total = $.total;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTokensPaginationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTokensPaginationArgs $;

        public Builder() {
            $ = new GetServiceTokensPaginationArgs();
        }

        public Builder(GetServiceTokensPaginationArgs defaults) {
            $ = new GetServiceTokensPaginationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Number of elements to be requested per page. Number must be between 1 and 100. Default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(Output<Integer> limit) {
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
         * @param next URL relative to the last item in the response.
         * 
         * @return builder
         * 
         */
        public Builder next(Output<String> next) {
            $.next = next;
            return this;
        }

        /**
         * @param next URL relative to the last item in the response.
         * 
         * @return builder
         * 
         */
        public Builder next(String next) {
            return next(Output.of(next));
        }

        /**
         * @param offset The page offset for the pagination request. Index of the first element. Default is 0.
         * 
         * @return builder
         * 
         */
        public Builder offset(Output<Integer> offset) {
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

        /**
         * @param previous URL relative to the first item in the response.
         * 
         * @return builder
         * 
         */
        public Builder previous(Output<String> previous) {
            $.previous = previous;
            return this;
        }

        /**
         * @param previous URL relative to the first item in the response.
         * 
         * @return builder
         * 
         */
        public Builder previous(String previous) {
            return previous(Output.of(previous));
        }

        /**
         * @param total Total number of elements returned.
         * 
         * @return builder
         * 
         */
        public Builder total(Output<Integer> total) {
            $.total = total;
            return this;
        }

        /**
         * @param total Total number of elements returned.
         * 
         * @return builder
         * 
         */
        public Builder total(Integer total) {
            return total(Output.of(total));
        }

        public GetServiceTokensPaginationArgs build() {
            if ($.limit == null) {
                throw new MissingRequiredPropertyException("GetServiceTokensPaginationArgs", "limit");
            }
            if ($.next == null) {
                throw new MissingRequiredPropertyException("GetServiceTokensPaginationArgs", "next");
            }
            if ($.offset == null) {
                throw new MissingRequiredPropertyException("GetServiceTokensPaginationArgs", "offset");
            }
            if ($.previous == null) {
                throw new MissingRequiredPropertyException("GetServiceTokensPaginationArgs", "previous");
            }
            if ($.total == null) {
                throw new MissingRequiredPropertyException("GetServiceTokensPaginationArgs", "total");
            }
            return $;
        }
    }

}