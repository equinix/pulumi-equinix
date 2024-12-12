// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort {
    /**
     * @return Account Name
     * 
     */
    private String accountName;
    /**
     * @return Port Bandwidth
     * 
     */
    private Integer bandwidth;
    /**
     * @return Customer virtual port Id
     * 
     */
    private Integer cvpId;
    /**
     * @return Port Encapsulation
     * 
     */
    private String encapsulationProtocolType;
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Port Location
     * 
     */
    private List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> locations;
    /**
     * @return Port Name
     * 
     */
    private String portName;
    /**
     * @return Port Priority
     * 
     */
    private String priority;
    /**
     * @return Type of Port
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    private String uuid;

    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort() {}
    /**
     * @return Account Name
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return Port Bandwidth
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Customer virtual port Id
     * 
     */
    public Integer cvpId() {
        return this.cvpId;
    }
    /**
     * @return Port Encapsulation
     * 
     */
    public String encapsulationProtocolType() {
        return this.encapsulationProtocolType;
    }
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Port Location
     * 
     */
    public List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> locations() {
        return this.locations;
    }
    /**
     * @return Port Name
     * 
     */
    public String portName() {
        return this.portName;
    }
    /**
     * @return Port Priority
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return Type of Port
     * 
     */
    public String type() {
        return this.type;
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

    public static Builder builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private Integer bandwidth;
        private Integer cvpId;
        private String encapsulationProtocolType;
        private String href;
        private List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> locations;
        private String portName;
        private String priority;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort defaults) {
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
        public Builder accountName(String accountName) {
            if (accountName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder cvpId(Integer cvpId) {
            if (cvpId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "cvpId");
            }
            this.cvpId = cvpId;
            return this;
        }
        @CustomType.Setter
        public Builder encapsulationProtocolType(String encapsulationProtocolType) {
            if (encapsulationProtocolType == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "encapsulationProtocolType");
            }
            this.encapsulationProtocolType = encapsulationProtocolType;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> locations) {
            if (locations == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "locations");
            }
            this.locations = locations;
            return this;
        }
        public Builder locations(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder portName(String portName) {
            if (portName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "portName");
            }
            this.portName = portName;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort build() {
            final var _resultValue = new GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort();
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
