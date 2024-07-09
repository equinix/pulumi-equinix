// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrecreatedIpBlockResult {
    private String address;
    private Integer addressFamily;
    private Integer cidr;
    /**
     * @return CIDR notation of the looked up block.
     * 
     */
    private String cidrNotation;
    private @Nullable String facility;
    private String gateway;
    private @Nullable Boolean global;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Boolean manageable;
    private Boolean management;
    private @Nullable String metro;
    private String netmask;
    private String network;
    private String projectId;
    private Boolean public_;
    private Integer quantity;
    private String type;
    private String vrfId;

    private GetPrecreatedIpBlockResult() {}
    public String address() {
        return this.address;
    }
    public Integer addressFamily() {
        return this.addressFamily;
    }
    public Integer cidr() {
        return this.cidr;
    }
    /**
     * @return CIDR notation of the looked up block.
     * 
     */
    public String cidrNotation() {
        return this.cidrNotation;
    }
    public Optional<String> facility() {
        return Optional.ofNullable(this.facility);
    }
    public String gateway() {
        return this.gateway;
    }
    public Optional<Boolean> global() {
        return Optional.ofNullable(this.global);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean manageable() {
        return this.manageable;
    }
    public Boolean management() {
        return this.management;
    }
    public Optional<String> metro() {
        return Optional.ofNullable(this.metro);
    }
    public String netmask() {
        return this.netmask;
    }
    public String network() {
        return this.network;
    }
    public String projectId() {
        return this.projectId;
    }
    public Boolean public_() {
        return this.public_;
    }
    public Integer quantity() {
        return this.quantity;
    }
    public String type() {
        return this.type;
    }
    public String vrfId() {
        return this.vrfId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrecreatedIpBlockResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer addressFamily;
        private Integer cidr;
        private String cidrNotation;
        private @Nullable String facility;
        private String gateway;
        private @Nullable Boolean global;
        private String id;
        private Boolean manageable;
        private Boolean management;
        private @Nullable String metro;
        private String netmask;
        private String network;
        private String projectId;
        private Boolean public_;
        private Integer quantity;
        private String type;
        private String vrfId;
        public Builder() {}
        public Builder(GetPrecreatedIpBlockResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressFamily = defaults.addressFamily;
    	      this.cidr = defaults.cidr;
    	      this.cidrNotation = defaults.cidrNotation;
    	      this.facility = defaults.facility;
    	      this.gateway = defaults.gateway;
    	      this.global = defaults.global;
    	      this.id = defaults.id;
    	      this.manageable = defaults.manageable;
    	      this.management = defaults.management;
    	      this.metro = defaults.metro;
    	      this.netmask = defaults.netmask;
    	      this.network = defaults.network;
    	      this.projectId = defaults.projectId;
    	      this.public_ = defaults.public_;
    	      this.quantity = defaults.quantity;
    	      this.type = defaults.type;
    	      this.vrfId = defaults.vrfId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressFamily(Integer addressFamily) {
            if (addressFamily == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "addressFamily");
            }
            this.addressFamily = addressFamily;
            return this;
        }
        @CustomType.Setter
        public Builder cidr(Integer cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder cidrNotation(String cidrNotation) {
            if (cidrNotation == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "cidrNotation");
            }
            this.cidrNotation = cidrNotation;
            return this;
        }
        @CustomType.Setter
        public Builder facility(@Nullable String facility) {

            this.facility = facility;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder global(@Nullable Boolean global) {

            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder manageable(Boolean manageable) {
            if (manageable == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "manageable");
            }
            this.manageable = manageable;
            return this;
        }
        @CustomType.Setter
        public Builder management(Boolean management) {
            if (management == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "management");
            }
            this.management = management;
            return this;
        }
        @CustomType.Setter
        public Builder metro(@Nullable String metro) {

            this.metro = metro;
            return this;
        }
        @CustomType.Setter
        public Builder netmask(String netmask) {
            if (netmask == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "netmask");
            }
            this.netmask = netmask;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(Boolean public_) {
            if (public_ == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "public_");
            }
            this.public_ = public_;
            return this;
        }
        @CustomType.Setter
        public Builder quantity(Integer quantity) {
            if (quantity == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "quantity");
            }
            this.quantity = quantity;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vrfId(String vrfId) {
            if (vrfId == null) {
              throw new MissingRequiredPropertyException("GetPrecreatedIpBlockResult", "vrfId");
            }
            this.vrfId = vrfId;
            return this;
        }
        public GetPrecreatedIpBlockResult build() {
            final var _resultValue = new GetPrecreatedIpBlockResult();
            _resultValue.address = address;
            _resultValue.addressFamily = addressFamily;
            _resultValue.cidr = cidr;
            _resultValue.cidrNotation = cidrNotation;
            _resultValue.facility = facility;
            _resultValue.gateway = gateway;
            _resultValue.global = global;
            _resultValue.id = id;
            _resultValue.manageable = manageable;
            _resultValue.management = management;
            _resultValue.metro = metro;
            _resultValue.netmask = netmask;
            _resultValue.network = network;
            _resultValue.projectId = projectId;
            _resultValue.public_ = public_;
            _resultValue.quantity = quantity;
            _resultValue.type = type;
            _resultValue.vrfId = vrfId;
            return _resultValue;
        }
    }
}
