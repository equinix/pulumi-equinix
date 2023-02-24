// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.equinix.fabric.outputs.ConnectionZSideAccessPoint;
import com.pulumi.equinix.fabric.outputs.ConnectionZSideAdditionalInfo;
import com.pulumi.equinix.fabric.outputs.ConnectionZSideServiceToken;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionZSide {
    /**
     * @return Point of access details
     * 
     */
    private @Nullable List<ConnectionZSideAccessPoint> accessPoints;
    /**
     * @return Connection side additional information
     * 
     */
    private @Nullable List<ConnectionZSideAdditionalInfo> additionalInfos;
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    private @Nullable List<ConnectionZSideServiceToken> serviceTokens;

    private ConnectionZSide() {}
    /**
     * @return Point of access details
     * 
     */
    public List<ConnectionZSideAccessPoint> accessPoints() {
        return this.accessPoints == null ? List.of() : this.accessPoints;
    }
    /**
     * @return Connection side additional information
     * 
     */
    public List<ConnectionZSideAdditionalInfo> additionalInfos() {
        return this.additionalInfos == null ? List.of() : this.additionalInfos;
    }
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    public List<ConnectionZSideServiceToken> serviceTokens() {
        return this.serviceTokens == null ? List.of() : this.serviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionZSide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionZSideAccessPoint> accessPoints;
        private @Nullable List<ConnectionZSideAdditionalInfo> additionalInfos;
        private @Nullable List<ConnectionZSideServiceToken> serviceTokens;
        public Builder() {}
        public Builder(ConnectionZSide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPoints = defaults.accessPoints;
    	      this.additionalInfos = defaults.additionalInfos;
    	      this.serviceTokens = defaults.serviceTokens;
        }

        @CustomType.Setter
        public Builder accessPoints(@Nullable List<ConnectionZSideAccessPoint> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }
        public Builder accessPoints(ConnectionZSideAccessPoint... accessPoints) {
            return accessPoints(List.of(accessPoints));
        }
        @CustomType.Setter
        public Builder additionalInfos(@Nullable List<ConnectionZSideAdditionalInfo> additionalInfos) {
            this.additionalInfos = additionalInfos;
            return this;
        }
        public Builder additionalInfos(ConnectionZSideAdditionalInfo... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
        }
        @CustomType.Setter
        public Builder serviceTokens(@Nullable List<ConnectionZSideServiceToken> serviceTokens) {
            this.serviceTokens = serviceTokens;
            return this;
        }
        public Builder serviceTokens(ConnectionZSideServiceToken... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }
        public ConnectionZSide build() {
            final var o = new ConnectionZSide();
            o.accessPoints = accessPoints;
            o.additionalInfos = additionalInfos;
            o.serviceTokens = serviceTokens;
            return o;
        }
    }
}
