// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetStreamsPagination extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamsPagination Empty = new GetStreamsPagination();

    /**
     * Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
     * 
     */
    @Import(name="limit", required=true)
    private Double limit;

    /**
     * @return Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
     * 
     */
    public Double limit() {
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
    private Double offset;

    /**
     * @return Index of the first item returned in the response. The default is 0
     * 
     */
    public Double offset() {
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
     * The total number of streams available to the user making the request
     * 
     */
    @Import(name="total", required=true)
    private Double total;

    /**
     * @return The total number of streams available to the user making the request
     * 
     */
    public Double total() {
        return this.total;
    }

    private GetStreamsPagination() {}

    private GetStreamsPagination(GetStreamsPagination $) {
        this.limit = $.limit;
        this.next = $.next;
        this.offset = $.offset;
        this.previous = $.previous;
        this.total = $.total;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamsPagination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamsPagination $;

        public Builder() {
            $ = new GetStreamsPagination();
        }

        public Builder(GetStreamsPagination defaults) {
            $ = new GetStreamsPagination(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
         * 
         * @return builder
         * 
         */
        public Builder limit(Double limit) {
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
        public Builder offset(Double offset) {
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
         * @param total The total number of streams available to the user making the request
         * 
         * @return builder
         * 
         */
        public Builder total(Double total) {
            $.total = total;
            return this;
        }

        public GetStreamsPagination build() {
            if ($.limit == null) {
                throw new MissingRequiredPropertyException("GetStreamsPagination", "limit");
            }
            if ($.next == null) {
                throw new MissingRequiredPropertyException("GetStreamsPagination", "next");
            }
            if ($.offset == null) {
                throw new MissingRequiredPropertyException("GetStreamsPagination", "offset");
            }
            if ($.previous == null) {
                throw new MissingRequiredPropertyException("GetStreamsPagination", "previous");
            }
            if ($.total == null) {
                throw new MissingRequiredPropertyException("GetStreamsPagination", "total");
            }
            return $;
        }
    }

}
