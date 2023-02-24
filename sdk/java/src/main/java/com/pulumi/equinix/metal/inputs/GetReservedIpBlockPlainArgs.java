// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservedIpBlockPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservedIpBlockPlainArgs Empty = new GetReservedIpBlockPlainArgs();

    /**
     * UUID of the IP address block to look up.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return UUID of the IP address block to look up.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Block containing this IP address will be returned.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return Block containing this IP address will be returned.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * UUID of the project where the searched block should be.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return UUID of the project where the searched block should be.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetReservedIpBlockPlainArgs() {}

    private GetReservedIpBlockPlainArgs(GetReservedIpBlockPlainArgs $) {
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservedIpBlockPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservedIpBlockPlainArgs $;

        public Builder() {
            $ = new GetReservedIpBlockPlainArgs();
        }

        public Builder(GetReservedIpBlockPlainArgs defaults) {
            $ = new GetReservedIpBlockPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id UUID of the IP address block to look up.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param ipAddress Block containing this IP address will be returned.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param projectId UUID of the project where the searched block should be.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetReservedIpBlockPlainArgs build() {
            return $;
        }
    }

}
