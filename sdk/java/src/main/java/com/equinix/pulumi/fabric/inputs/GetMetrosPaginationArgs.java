// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetrosPaginationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetMetrosPaginationArgs Empty = new GetMetrosPaginationArgs();

    /**
     * Maximum number of search results returned per page.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Maximum number of search results returned per page.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * URL relative to the next item in the response.
     * 
     */
    @Import(name="next", required=true)
    private Output<String> next;

    /**
     * @return URL relative to the next item in the response.
     * 
     */
    public Output<String> next() {
        return this.next;
    }

    /**
     * Index of the first item returned in the response.
     * 
     */
    @Import(name="offset")
    private @Nullable Output<Integer> offset;

    /**
     * @return Index of the first item returned in the response.
     * 
     */
    public Optional<Output<Integer>> offset() {
        return Optional.ofNullable(this.offset);
    }

    /**
     * URL relative to the previous item in the response.
     * 
     */
    @Import(name="previous", required=true)
    private Output<String> previous;

    /**
     * @return URL relative to the previous item in the response.
     * 
     */
    public Output<String> previous() {
        return this.previous;
    }

    /**
     * The total number of metro returned
     * 
     */
    @Import(name="total", required=true)
    private Output<Integer> total;

    /**
     * @return The total number of metro returned
     * 
     */
    public Output<Integer> total() {
        return this.total;
    }

    private GetMetrosPaginationArgs() {}

    private GetMetrosPaginationArgs(GetMetrosPaginationArgs $) {
        this.limit = $.limit;
        this.next = $.next;
        this.offset = $.offset;
        this.previous = $.previous;
        this.total = $.total;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetrosPaginationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetrosPaginationArgs $;

        public Builder() {
            $ = new GetMetrosPaginationArgs();
        }

        public Builder(GetMetrosPaginationArgs defaults) {
            $ = new GetMetrosPaginationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit Maximum number of search results returned per page.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Maximum number of search results returned per page.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param next URL relative to the next item in the response.
         * 
         * @return builder
         * 
         */
        public Builder next(Output<String> next) {
            $.next = next;
            return this;
        }

        /**
         * @param next URL relative to the next item in the response.
         * 
         * @return builder
         * 
         */
        public Builder next(String next) {
            return next(Output.of(next));
        }

        /**
         * @param offset Index of the first item returned in the response.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<Integer> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset Index of the first item returned in the response.
         * 
         * @return builder
         * 
         */
        public Builder offset(Integer offset) {
            return offset(Output.of(offset));
        }

        /**
         * @param previous URL relative to the previous item in the response.
         * 
         * @return builder
         * 
         */
        public Builder previous(Output<String> previous) {
            $.previous = previous;
            return this;
        }

        /**
         * @param previous URL relative to the previous item in the response.
         * 
         * @return builder
         * 
         */
        public Builder previous(String previous) {
            return previous(Output.of(previous));
        }

        /**
         * @param total The total number of metro returned
         * 
         * @return builder
         * 
         */
        public Builder total(Output<Integer> total) {
            $.total = total;
            return this;
        }

        /**
         * @param total The total number of metro returned
         * 
         * @return builder
         * 
         */
        public Builder total(Integer total) {
            return total(Output.of(total));
        }

        public GetMetrosPaginationArgs build() {
            if ($.next == null) {
                throw new MissingRequiredPropertyException("GetMetrosPaginationArgs", "next");
            }
            if ($.previous == null) {
                throw new MissingRequiredPropertyException("GetMetrosPaginationArgs", "previous");
            }
            if ($.total == null) {
                throw new MissingRequiredPropertyException("GetMetrosPaginationArgs", "total");
            }
            return $;
        }
    }

}
