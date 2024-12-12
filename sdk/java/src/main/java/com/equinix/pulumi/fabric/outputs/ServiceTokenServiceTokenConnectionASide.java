// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ServiceTokenServiceTokenConnectionASideAccessPointSelector;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceTokenServiceTokenConnectionASide {
    /**
     * @return List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    private List<ServiceTokenServiceTokenConnectionASideAccessPointSelector> accessPointSelectors;

    private ServiceTokenServiceTokenConnectionASide() {}
    /**
     * @return List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    public List<ServiceTokenServiceTokenConnectionASideAccessPointSelector> accessPointSelectors() {
        return this.accessPointSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTokenServiceTokenConnectionASide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceTokenServiceTokenConnectionASideAccessPointSelector> accessPointSelectors;
        public Builder() {}
        public Builder(ServiceTokenServiceTokenConnectionASide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointSelectors = defaults.accessPointSelectors;
        }

        @CustomType.Setter
        public Builder accessPointSelectors(List<ServiceTokenServiceTokenConnectionASideAccessPointSelector> accessPointSelectors) {
            if (accessPointSelectors == null) {
              throw new MissingRequiredPropertyException("ServiceTokenServiceTokenConnectionASide", "accessPointSelectors");
            }
            this.accessPointSelectors = accessPointSelectors;
            return this;
        }
        public Builder accessPointSelectors(ServiceTokenServiceTokenConnectionASideAccessPointSelector... accessPointSelectors) {
            return accessPointSelectors(List.of(accessPointSelectors));
        }
        public ServiceTokenServiceTokenConnectionASide build() {
            final var _resultValue = new ServiceTokenServiceTokenConnectionASide();
            _resultValue.accessPointSelectors = accessPointSelectors;
            return _resultValue;
        }
    }
}
