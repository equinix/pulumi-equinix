// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort {
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
    private List<GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation> locations;
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

    private GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort() {}
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
    public List<GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation> locations() {
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

    public static Builder builder(GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private Integer bandwidth;
        private Integer cvpId;
        private String encapsulationProtocolType;
        private String href;
        private List<GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation> locations;
        private String portName;
        private String priority;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort defaults) {
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
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder cvpId(Integer cvpId) {
            if (cvpId == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "cvpId");
            }
            this.cvpId = cvpId;
            return this;
        }
        @CustomType.Setter
        public Builder encapsulationProtocolType(String encapsulationProtocolType) {
            if (encapsulationProtocolType == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "encapsulationProtocolType");
            }
            this.encapsulationProtocolType = encapsulationProtocolType;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation> locations) {
            if (locations == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "locations");
            }
            this.locations = locations;
            return this;
        }
        public Builder locations(GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder portName(String portName) {
            if (portName == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "portName");
            }
            this.portName = portName;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort build() {
            final var _resultValue = new GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPort();
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