// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetPortsDatumAccount;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumChangeLog;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumDevice;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumEncapsulation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumLocation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumOperation;
import com.equinix.pulumi.fabric.outputs.GetPortsDatumRedundancy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPortsDatum {
    /**
     * @return Customer account information that is associated with this port
     * 
     */
    private List<GetPortsDatumAccount> accounts;
    /**
     * @return Port available bandwidth in Mbps
     * 
     */
    private Integer availableBandwidth;
    /**
     * @return Port bandwidth in Mbps
     * 
     */
    private Integer bandwidth;
    /**
     * @return Captures port lifecycle change information
     * 
     */
    private List<GetPortsDatumChangeLog> changeLogs;
    /**
     * @return Port description
     * 
     */
    private String description;
    /**
     * @return Port device
     * 
     */
    private List<GetPortsDatumDevice> devices;
    /**
     * @return Port encapsulation protocol
     * 
     */
    private List<GetPortsDatumEncapsulation> encapsulations;
    /**
     * @return Port URI information
     * 
     */
    private String href;
    /**
     * @return Port Lag
     * 
     */
    private Boolean lagEnabled;
    /**
     * @return Port location information
     * 
     */
    private List<GetPortsDatumLocation> locations;
    /**
     * @return Port name
     * 
     */
    private String name;
    /**
     * @return Port specific operational data
     * 
     */
    private List<GetPortsDatumOperation> operations;
    /**
     * @return Port redundancy information
     * 
     */
    private List<GetPortsDatumRedundancy> redundancies;
    /**
     * @return Port service type
     * 
     */
    private String serviceType;
    /**
     * @return Port state
     * 
     */
    private String state;
    /**
     * @return Port type
     * 
     */
    private String type;
    /**
     * @return Port used bandwidth in Mbps
     * 
     */
    private Integer usedBandwidth;
    /**
     * @return Equinix-assigned port identifier
     * 
     */
    private String uuid;

    private GetPortsDatum() {}
    /**
     * @return Customer account information that is associated with this port
     * 
     */
    public List<GetPortsDatumAccount> accounts() {
        return this.accounts;
    }
    /**
     * @return Port available bandwidth in Mbps
     * 
     */
    public Integer availableBandwidth() {
        return this.availableBandwidth;
    }
    /**
     * @return Port bandwidth in Mbps
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Captures port lifecycle change information
     * 
     */
    public List<GetPortsDatumChangeLog> changeLogs() {
        return this.changeLogs;
    }
    /**
     * @return Port description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Port device
     * 
     */
    public List<GetPortsDatumDevice> devices() {
        return this.devices;
    }
    /**
     * @return Port encapsulation protocol
     * 
     */
    public List<GetPortsDatumEncapsulation> encapsulations() {
        return this.encapsulations;
    }
    /**
     * @return Port URI information
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Port Lag
     * 
     */
    public Boolean lagEnabled() {
        return this.lagEnabled;
    }
    /**
     * @return Port location information
     * 
     */
    public List<GetPortsDatumLocation> locations() {
        return this.locations;
    }
    /**
     * @return Port name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Port specific operational data
     * 
     */
    public List<GetPortsDatumOperation> operations() {
        return this.operations;
    }
    /**
     * @return Port redundancy information
     * 
     */
    public List<GetPortsDatumRedundancy> redundancies() {
        return this.redundancies;
    }
    /**
     * @return Port service type
     * 
     */
    public String serviceType() {
        return this.serviceType;
    }
    /**
     * @return Port state
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Port type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Port used bandwidth in Mbps
     * 
     */
    public Integer usedBandwidth() {
        return this.usedBandwidth;
    }
    /**
     * @return Equinix-assigned port identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatum defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPortsDatumAccount> accounts;
        private Integer availableBandwidth;
        private Integer bandwidth;
        private List<GetPortsDatumChangeLog> changeLogs;
        private String description;
        private List<GetPortsDatumDevice> devices;
        private List<GetPortsDatumEncapsulation> encapsulations;
        private String href;
        private Boolean lagEnabled;
        private List<GetPortsDatumLocation> locations;
        private String name;
        private List<GetPortsDatumOperation> operations;
        private List<GetPortsDatumRedundancy> redundancies;
        private String serviceType;
        private String state;
        private String type;
        private Integer usedBandwidth;
        private String uuid;
        public Builder() {}
        public Builder(GetPortsDatum defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.availableBandwidth = defaults.availableBandwidth;
    	      this.bandwidth = defaults.bandwidth;
    	      this.changeLogs = defaults.changeLogs;
    	      this.description = defaults.description;
    	      this.devices = defaults.devices;
    	      this.encapsulations = defaults.encapsulations;
    	      this.href = defaults.href;
    	      this.lagEnabled = defaults.lagEnabled;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.operations = defaults.operations;
    	      this.redundancies = defaults.redundancies;
    	      this.serviceType = defaults.serviceType;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.usedBandwidth = defaults.usedBandwidth;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accounts(List<GetPortsDatumAccount> accounts) {
            if (accounts == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "accounts");
            }
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(GetPortsDatumAccount... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder availableBandwidth(Integer availableBandwidth) {
            if (availableBandwidth == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "availableBandwidth");
            }
            this.availableBandwidth = availableBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder changeLogs(List<GetPortsDatumChangeLog> changeLogs) {
            if (changeLogs == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "changeLogs");
            }
            this.changeLogs = changeLogs;
            return this;
        }
        public Builder changeLogs(GetPortsDatumChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder devices(List<GetPortsDatumDevice> devices) {
            if (devices == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "devices");
            }
            this.devices = devices;
            return this;
        }
        public Builder devices(GetPortsDatumDevice... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder encapsulations(List<GetPortsDatumEncapsulation> encapsulations) {
            if (encapsulations == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "encapsulations");
            }
            this.encapsulations = encapsulations;
            return this;
        }
        public Builder encapsulations(GetPortsDatumEncapsulation... encapsulations) {
            return encapsulations(List.of(encapsulations));
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder lagEnabled(Boolean lagEnabled) {
            if (lagEnabled == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "lagEnabled");
            }
            this.lagEnabled = lagEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetPortsDatumLocation> locations) {
            if (locations == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "locations");
            }
            this.locations = locations;
            return this;
        }
        public Builder locations(GetPortsDatumLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operations(List<GetPortsDatumOperation> operations) {
            if (operations == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "operations");
            }
            this.operations = operations;
            return this;
        }
        public Builder operations(GetPortsDatumOperation... operations) {
            return operations(List.of(operations));
        }
        @CustomType.Setter
        public Builder redundancies(List<GetPortsDatumRedundancy> redundancies) {
            if (redundancies == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "redundancies");
            }
            this.redundancies = redundancies;
            return this;
        }
        public Builder redundancies(GetPortsDatumRedundancy... redundancies) {
            return redundancies(List.of(redundancies));
        }
        @CustomType.Setter
        public Builder serviceType(String serviceType) {
            if (serviceType == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "serviceType");
            }
            this.serviceType = serviceType;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder usedBandwidth(Integer usedBandwidth) {
            if (usedBandwidth == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "usedBandwidth");
            }
            this.usedBandwidth = usedBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetPortsDatum", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetPortsDatum build() {
            final var _resultValue = new GetPortsDatum();
            _resultValue.accounts = accounts;
            _resultValue.availableBandwidth = availableBandwidth;
            _resultValue.bandwidth = bandwidth;
            _resultValue.changeLogs = changeLogs;
            _resultValue.description = description;
            _resultValue.devices = devices;
            _resultValue.encapsulations = encapsulations;
            _resultValue.href = href;
            _resultValue.lagEnabled = lagEnabled;
            _resultValue.locations = locations;
            _resultValue.name = name;
            _resultValue.operations = operations;
            _resultValue.redundancies = redundancies;
            _resultValue.serviceType = serviceType;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.usedBandwidth = usedBandwidth;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
