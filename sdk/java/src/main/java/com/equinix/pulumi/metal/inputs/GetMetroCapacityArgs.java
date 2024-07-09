// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetroCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetMetroCapacityArgs Empty = new GetMetroCapacityArgs();

    /**
     * Device plan that must be available in selected location.
     * 
     */
    @Import(name="plan", required=true)
    private Output<String> plan;

    /**
     * @return Device plan that must be available in selected location.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }

    /**
     * Minimum number of devices that must be available in selected location. Default is `1`.
     * 
     */
    @Import(name="quantity")
    private @Nullable Output<Integer> quantity;

    /**
     * @return Minimum number of devices that must be available in selected location. Default is `1`.
     * 
     */
    public Optional<Output<Integer>> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    private GetMetroCapacityArgs() {}

    private GetMetroCapacityArgs(GetMetroCapacityArgs $) {
        this.plan = $.plan;
        this.quantity = $.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetroCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetroCapacityArgs $;

        public Builder() {
            $ = new GetMetroCapacityArgs();
        }

        public Builder(GetMetroCapacityArgs defaults) {
            $ = new GetMetroCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param plan Device plan that must be available in selected location.
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Device plan that must be available in selected location.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param quantity Minimum number of devices that must be available in selected location. Default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder quantity(@Nullable Output<Integer> quantity) {
            $.quantity = quantity;
            return this;
        }

        /**
         * @param quantity Minimum number of devices that must be available in selected location. Default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder quantity(Integer quantity) {
            return quantity(Output.of(quantity));
        }

        public GetMetroCapacityArgs build() {
            if ($.plan == null) {
                throw new MissingRequiredPropertyException("GetMetroCapacityArgs", "plan");
            }
            return $;
        }
    }

}
