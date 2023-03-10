// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.equinix.pulumi.equinix.fabric.outputs.ConnectionASideAccessPoint;
import com.equinix.pulumi.equinix.fabric.outputs.ConnectionASideAdditionalInfo;
import com.equinix.pulumi.equinix.fabric.outputs.ConnectionASideServiceToken;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASide {
    /**
     * @return Point of access details
     * 
     */
    private @Nullable List<ConnectionASideAccessPoint> accessPoints;
    /**
     * @return Connection side additional information
     * 
     */
    private @Nullable List<ConnectionASideAdditionalInfo> additionalInfos;
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    private @Nullable List<ConnectionASideServiceToken> serviceTokens;

    private ConnectionASide() {}
    /**
     * @return Point of access details
     * 
     */
    public List<ConnectionASideAccessPoint> accessPoints() {
        return this.accessPoints == null ? List.of() : this.accessPoints;
    }
    /**
     * @return Connection side additional information
     * 
     */
    public List<ConnectionASideAdditionalInfo> additionalInfos() {
        return this.additionalInfos == null ? List.of() : this.additionalInfos;
    }
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    public List<ConnectionASideServiceToken> serviceTokens() {
        return this.serviceTokens == null ? List.of() : this.serviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionASideAccessPoint> accessPoints;
        private @Nullable List<ConnectionASideAdditionalInfo> additionalInfos;
        private @Nullable List<ConnectionASideServiceToken> serviceTokens;
        public Builder() {}
        public Builder(ConnectionASide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPoints = defaults.accessPoints;
    	      this.additionalInfos = defaults.additionalInfos;
    	      this.serviceTokens = defaults.serviceTokens;
        }

        @CustomType.Setter
        public Builder accessPoints(@Nullable List<ConnectionASideAccessPoint> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }
        public Builder accessPoints(ConnectionASideAccessPoint... accessPoints) {
            return accessPoints(List.of(accessPoints));
        }
        @CustomType.Setter
        public Builder additionalInfos(@Nullable List<ConnectionASideAdditionalInfo> additionalInfos) {
            this.additionalInfos = additionalInfos;
            return this;
        }
        public Builder additionalInfos(ConnectionASideAdditionalInfo... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
        }
        @CustomType.Setter
        public Builder serviceTokens(@Nullable List<ConnectionASideServiceToken> serviceTokens) {
            this.serviceTokens = serviceTokens;
            return this;
        }
        public Builder serviceTokens(ConnectionASideServiceToken... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }
        public ConnectionASide build() {
            final var o = new ConnectionASide();
            o.accessPoints = accessPoints;
            o.additionalInfos = additionalInfos;
            o.serviceTokens = serviceTokens;
            return o;
        }
    }
}
