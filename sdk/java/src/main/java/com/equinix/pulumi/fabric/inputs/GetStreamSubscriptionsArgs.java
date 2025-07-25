// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.GetStreamSubscriptionsPaginationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamSubscriptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamSubscriptionsArgs Empty = new GetStreamSubscriptionsArgs();

    /**
     * Pagination details for the returned streams list
     * 
     */
    @Import(name="pagination", required=true)
    private Output<GetStreamSubscriptionsPaginationArgs> pagination;

    /**
     * @return Pagination details for the returned streams list
     * 
     */
    public Output<GetStreamSubscriptionsPaginationArgs> pagination() {
        return this.pagination;
    }

    /**
     * The uuid of the stream that is the target of the stream subscription
     * 
     */
    @Import(name="streamId", required=true)
    private Output<String> streamId;

    /**
     * @return The uuid of the stream that is the target of the stream subscription
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }

    private GetStreamSubscriptionsArgs() {}

    private GetStreamSubscriptionsArgs(GetStreamSubscriptionsArgs $) {
        this.pagination = $.pagination;
        this.streamId = $.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamSubscriptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamSubscriptionsArgs $;

        public Builder() {
            $ = new GetStreamSubscriptionsArgs();
        }

        public Builder(GetStreamSubscriptionsArgs defaults) {
            $ = new GetStreamSubscriptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pagination Pagination details for the returned streams list
         * 
         * @return builder
         * 
         */
        public Builder pagination(Output<GetStreamSubscriptionsPaginationArgs> pagination) {
            $.pagination = pagination;
            return this;
        }

        /**
         * @param pagination Pagination details for the returned streams list
         * 
         * @return builder
         * 
         */
        public Builder pagination(GetStreamSubscriptionsPaginationArgs pagination) {
            return pagination(Output.of(pagination));
        }

        /**
         * @param streamId The uuid of the stream that is the target of the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder streamId(Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId The uuid of the stream that is the target of the stream subscription
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        public GetStreamSubscriptionsArgs build() {
            if ($.pagination == null) {
                throw new MissingRequiredPropertyException("GetStreamSubscriptionsArgs", "pagination");
            }
            if ($.streamId == null) {
                throw new MissingRequiredPropertyException("GetStreamSubscriptionsArgs", "streamId");
            }
            return $;
        }
    }

}
