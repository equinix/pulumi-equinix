// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTokensDataServiceTokenConnectionZSide {
    /**
     * @return List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    private List<GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector> accessPointSelectors;

    private GetServiceTokensDataServiceTokenConnectionZSide() {}
    /**
     * @return List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    public List<GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector> accessPointSelectors() {
        return this.accessPointSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokensDataServiceTokenConnectionZSide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector> accessPointSelectors;
        public Builder() {}
        public Builder(GetServiceTokensDataServiceTokenConnectionZSide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointSelectors = defaults.accessPointSelectors;
        }

        @CustomType.Setter
        public Builder accessPointSelectors(List<GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector> accessPointSelectors) {
            if (accessPointSelectors == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSide", "accessPointSelectors");
            }
            this.accessPointSelectors = accessPointSelectors;
            return this;
        }
        public Builder accessPointSelectors(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector... accessPointSelectors) {
            return accessPointSelectors(List.of(accessPointSelectors));
        }
        public GetServiceTokensDataServiceTokenConnectionZSide build() {
            final var _resultValue = new GetServiceTokensDataServiceTokenConnectionZSide();
            _resultValue.accessPointSelectors = accessPointSelectors;
            return _resultValue;
        }
    }
}
