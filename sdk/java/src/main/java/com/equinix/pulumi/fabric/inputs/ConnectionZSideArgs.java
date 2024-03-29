// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideAdditionalInfoArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideServiceTokenArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionZSideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionZSideArgs Empty = new ConnectionZSideArgs();

    /**
     * Point of access details
     * 
     */
    @Import(name="accessPoint")
    private @Nullable Output<ConnectionZSideAccessPointArgs> accessPoint;

    /**
     * @return Point of access details
     * 
     */
    public Optional<Output<ConnectionZSideAccessPointArgs>> accessPoint() {
        return Optional.ofNullable(this.accessPoint);
    }

    /**
     * Connection side additional information
     * 
     */
    @Import(name="additionalInfo")
    private @Nullable Output<List<ConnectionZSideAdditionalInfoArgs>> additionalInfo;

    /**
     * @return Connection side additional information
     * 
     */
    public Optional<Output<List<ConnectionZSideAdditionalInfoArgs>>> additionalInfo() {
        return Optional.ofNullable(this.additionalInfo);
    }

    /**
     * For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    @Import(name="serviceToken")
    private @Nullable Output<ConnectionZSideServiceTokenArgs> serviceToken;

    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    public Optional<Output<ConnectionZSideServiceTokenArgs>> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    private ConnectionZSideArgs() {}

    private ConnectionZSideArgs(ConnectionZSideArgs $) {
        this.accessPoint = $.accessPoint;
        this.additionalInfo = $.additionalInfo;
        this.serviceToken = $.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionZSideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionZSideArgs $;

        public Builder() {
            $ = new ConnectionZSideArgs();
        }

        public Builder(ConnectionZSideArgs defaults) {
            $ = new ConnectionZSideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPoint Point of access details
         * 
         * @return builder
         * 
         */
        public Builder accessPoint(@Nullable Output<ConnectionZSideAccessPointArgs> accessPoint) {
            $.accessPoint = accessPoint;
            return this;
        }

        /**
         * @param accessPoint Point of access details
         * 
         * @return builder
         * 
         */
        public Builder accessPoint(ConnectionZSideAccessPointArgs accessPoint) {
            return accessPoint(Output.of(accessPoint));
        }

        /**
         * @param additionalInfo Connection side additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(@Nullable Output<List<ConnectionZSideAdditionalInfoArgs>> additionalInfo) {
            $.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * @param additionalInfo Connection side additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(List<ConnectionZSideAdditionalInfoArgs> additionalInfo) {
            return additionalInfo(Output.of(additionalInfo));
        }

        /**
         * @param additionalInfo Connection side additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(ConnectionZSideAdditionalInfoArgs... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }

        /**
         * @param serviceToken For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
         * 
         * @return builder
         * 
         */
        public Builder serviceToken(@Nullable Output<ConnectionZSideServiceTokenArgs> serviceToken) {
            $.serviceToken = serviceToken;
            return this;
        }

        /**
         * @param serviceToken For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
         * 
         * @return builder
         * 
         */
        public Builder serviceToken(ConnectionZSideServiceTokenArgs serviceToken) {
            return serviceToken(Output.of(serviceToken));
        }

        public ConnectionZSideArgs build() {
            return $;
        }
    }

}
