// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort {
    /**
     * @return Account Name
     * 
     */
    private @Nullable String accountName;
    /**
     * @return Port Bandwidth
     * 
     */
    private @Nullable Integer bandwidth;
    /**
     * @return Customer virtual port Id
     * 
     */
    private @Nullable Integer cvpId;
    /**
     * @return Port Encapsulation
     * 
     */
    private @Nullable String encapsulationProtocolType;
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Port Location
     * 
     */
    private @Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation> locations;
    /**
     * @return Port Name
     * 
     */
    private @Nullable String portName;
    /**
     * @return Port Priority
     * 
     */
    private @Nullable String priority;
    /**
     * @return Type of Port
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    private String uuid;

    private ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort() {}
    /**
     * @return Account Name
     * 
     */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * @return Port Bandwidth
     * 
     */
    public Optional<Integer> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }
    /**
     * @return Customer virtual port Id
     * 
     */
    public Optional<Integer> cvpId() {
        return Optional.ofNullable(this.cvpId);
    }
    /**
     * @return Port Encapsulation
     * 
     */
    public Optional<String> encapsulationProtocolType() {
        return Optional.ofNullable(this.encapsulationProtocolType);
    }
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Port Location
     * 
     */
    public List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * @return Port Name
     * 
     */
    public Optional<String> portName() {
        return Optional.ofNullable(this.portName);
    }
    /**
     * @return Port Priority
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Type of Port
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable Integer bandwidth;
        private @Nullable Integer cvpId;
        private @Nullable String encapsulationProtocolType;
        private @Nullable String href;
        private @Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation> locations;
        private @Nullable String portName;
        private @Nullable String priority;
        private @Nullable String type;
        private String uuid;
        public Builder() {}
        public Builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.bandwidth = defaults.bandwidth;
    	      this.cvpId = defaults.cvpId;
    	      this.encapsulationProtocolType = defaults.encapsulationProtocolType;
    	      this.href = defaults.href;
    	      this.locations = defaults.locations;
    	      this.portName = defaults.portName;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accountName(@Nullable String accountName) {

            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(@Nullable Integer bandwidth) {

            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder cvpId(@Nullable Integer cvpId) {

            this.cvpId = cvpId;
            return this;
        }
        @CustomType.Setter
        public Builder encapsulationProtocolType(@Nullable String encapsulationProtocolType) {

            this.encapsulationProtocolType = encapsulationProtocolType;
            return this;
        }
        @CustomType.Setter
        public Builder href(@Nullable String href) {

            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation> locations) {

            this.locations = locations;
            return this;
        }
        public Builder locations(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder portName(@Nullable String portName) {

            this.portName = portName;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {

            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort build() {
            final var _resultValue = new ServiceTokenServiceTokenConnectionASideAccessPointSelectorPort();
            _resultValue.accountName = accountName;
            _resultValue.bandwidth = bandwidth;
            _resultValue.cvpId = cvpId;
            _resultValue.encapsulationProtocolType = encapsulationProtocolType;
            _resultValue.href = href;
            _resultValue.locations = locations;
            _resultValue.portName = portName;
            _resultValue.priority = priority;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}