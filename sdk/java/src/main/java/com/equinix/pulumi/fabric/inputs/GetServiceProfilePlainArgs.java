// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceProfilePlainArgs Empty = new GetServiceProfilePlainArgs();

    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="uuid", required=true)
    private String uuid;

    public String uuid() {
        return this.uuid;
    }

    private GetServiceProfilePlainArgs() {}

    private GetServiceProfilePlainArgs(GetServiceProfilePlainArgs $) {
        this.state = $.state;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceProfilePlainArgs $;

        public Builder() {
            $ = new GetServiceProfilePlainArgs();
        }

        public Builder(GetServiceProfilePlainArgs defaults) {
            $ = new GetServiceProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param state Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public Builder uuid(String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetServiceProfilePlainArgs build() {
            $.uuid = Objects.requireNonNull($.uuid, "expected parameter 'uuid' to be non-null");
            return $;
        }
    }

}
