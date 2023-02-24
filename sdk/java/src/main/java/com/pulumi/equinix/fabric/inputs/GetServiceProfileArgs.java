// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceProfileArgs Empty = new GetServiceProfileArgs();

    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Equinix assigned service profile identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private GetServiceProfileArgs() {}

    private GetServiceProfileArgs(GetServiceProfileArgs $) {
        this.state = $.state;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceProfileArgs $;

        public Builder() {
            $ = new GetServiceProfileArgs();
        }

        public Builder(GetServiceProfileArgs defaults) {
            $ = new GetServiceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param uuid Equinix assigned service profile identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix assigned service profile identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetServiceProfileArgs build() {
            $.uuid = Objects.requireNonNull($.uuid, "expected parameter 'uuid' to be non-null");
            return $;
        }
    }

}
