// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.equinix.pulumi.metal.inputs.GetMetroCapacity;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetroPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetroPlainArgs Empty = new GetMetroPlainArgs();

    /**
     * One or more device plans for which the metro must have capacity.
     * 
     */
    @Import(name="capacities")
    private @Nullable List<GetMetroCapacity> capacities;

    /**
     * @return One or more device plans for which the metro must have capacity.
     * 
     */
    public Optional<List<GetMetroCapacity>> capacities() {
        return Optional.ofNullable(this.capacities);
    }

    /**
     * The metro code to search for.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return The metro code to search for.
     * 
     */
    public String code() {
        return this.code;
    }

    private GetMetroPlainArgs() {}

    private GetMetroPlainArgs(GetMetroPlainArgs $) {
        this.capacities = $.capacities;
        this.code = $.code;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetroPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetroPlainArgs $;

        public Builder() {
            $ = new GetMetroPlainArgs();
        }

        public Builder(GetMetroPlainArgs defaults) {
            $ = new GetMetroPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacities One or more device plans for which the metro must have capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacities(@Nullable List<GetMetroCapacity> capacities) {
            $.capacities = capacities;
            return this;
        }

        /**
         * @param capacities One or more device plans for which the metro must have capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacities(GetMetroCapacity... capacities) {
            return capacities(List.of(capacities));
        }

        /**
         * @param code The metro code to search for.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public GetMetroPlainArgs build() {
            if ($.code == null) {
                throw new MissingRequiredPropertyException("GetMetroPlainArgs", "code");
            }
            return $;
        }
    }

}
