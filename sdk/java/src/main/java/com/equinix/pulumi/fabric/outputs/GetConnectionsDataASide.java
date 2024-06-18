// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPoint;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAdditionalInfo;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideServiceToken;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsDataASide {
    /**
     * @return Point of access details
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPoint accessPoint;
    /**
     * @return Connection side additional information
     * 
     */
    private @Nullable List<GetConnectionsDataASideAdditionalInfo> additionalInfos;
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    private @Nullable GetConnectionsDataASideServiceToken serviceToken;

    private GetConnectionsDataASide() {}
    /**
     * @return Point of access details
     * 
     */
    public Optional<GetConnectionsDataASideAccessPoint> accessPoint() {
        return Optional.ofNullable(this.accessPoint);
    }
    /**
     * @return Connection side additional information
     * 
     */
    public List<GetConnectionsDataASideAdditionalInfo> additionalInfos() {
        return this.additionalInfos == null ? List.of() : this.additionalInfos;
    }
    /**
     * @return For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
     * 
     */
    public Optional<GetConnectionsDataASideServiceToken> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataASide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetConnectionsDataASideAccessPoint accessPoint;
        private @Nullable List<GetConnectionsDataASideAdditionalInfo> additionalInfos;
        private @Nullable GetConnectionsDataASideServiceToken serviceToken;
        public Builder() {}
        public Builder(GetConnectionsDataASide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPoint = defaults.accessPoint;
    	      this.additionalInfos = defaults.additionalInfos;
    	      this.serviceToken = defaults.serviceToken;
        }

        @CustomType.Setter
        public Builder accessPoint(@Nullable GetConnectionsDataASideAccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }
        @CustomType.Setter
        public Builder additionalInfos(@Nullable List<GetConnectionsDataASideAdditionalInfo> additionalInfos) {
            this.additionalInfos = additionalInfos;
            return this;
        }
        public Builder additionalInfos(GetConnectionsDataASideAdditionalInfo... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
        }
        @CustomType.Setter
        public Builder serviceToken(@Nullable GetConnectionsDataASideServiceToken serviceToken) {
            this.serviceToken = serviceToken;
            return this;
        }
        public GetConnectionsDataASide build() {
            final var _resultValue = new GetConnectionsDataASide();
            _resultValue.accessPoint = accessPoint;
            _resultValue.additionalInfos = additionalInfos;
            _resultValue.serviceToken = serviceToken;
            return _resultValue;
        }
    }
}
