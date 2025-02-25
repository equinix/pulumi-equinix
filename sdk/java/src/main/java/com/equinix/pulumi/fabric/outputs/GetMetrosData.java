// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetMetrosDataConnectedMetro;
import com.equinix.pulumi.fabric.outputs.GetMetrosDataGeoCoordinates;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMetrosData {
    /**
     * @return Code assigned to an Equinix IBX data center in a specified metropolitan area
     * 
     */
    private String code;
    /**
     * @return Arrays of objects containing latency data for the specified metro
     * 
     */
    private List<GetMetrosDataConnectedMetro> connectedMetros;
    /**
     * @return Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
     * 
     */
    private Integer equinixAsn;
    /**
     * @return Geographic location data of Fabric Metro
     * 
     */
    private GetMetrosDataGeoCoordinates geoCoordinates;
    /**
     * @return List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
     * 
     */
    private List<String> geoScopes;
    /**
     * @return The canonical URL at which the resource resides
     * 
     */
    private String href;
    /**
     * @return This field holds Max Connection speed within the metro.
     * 
     */
    private Integer localVcBandwidthMax;
    /**
     * @return Name of the region in which the data center is located
     * 
     */
    private String name;
    /**
     * @return Board geographical area in which the data center is located
     * 
     */
    private String region;
    /**
     * @return Indicator of a fabric metro
     * 
     */
    private String type;

    private GetMetrosData() {}
    /**
     * @return Code assigned to an Equinix IBX data center in a specified metropolitan area
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Arrays of objects containing latency data for the specified metro
     * 
     */
    public List<GetMetrosDataConnectedMetro> connectedMetros() {
        return this.connectedMetros;
    }
    /**
     * @return Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
     * 
     */
    public Integer equinixAsn() {
        return this.equinixAsn;
    }
    /**
     * @return Geographic location data of Fabric Metro
     * 
     */
    public GetMetrosDataGeoCoordinates geoCoordinates() {
        return this.geoCoordinates;
    }
    /**
     * @return List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
     * 
     */
    public List<String> geoScopes() {
        return this.geoScopes;
    }
    /**
     * @return The canonical URL at which the resource resides
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return This field holds Max Connection speed within the metro.
     * 
     */
    public Integer localVcBandwidthMax() {
        return this.localVcBandwidthMax;
    }
    /**
     * @return Name of the region in which the data center is located
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Board geographical area in which the data center is located
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Indicator of a fabric metro
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetrosData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private List<GetMetrosDataConnectedMetro> connectedMetros;
        private Integer equinixAsn;
        private GetMetrosDataGeoCoordinates geoCoordinates;
        private List<String> geoScopes;
        private String href;
        private Integer localVcBandwidthMax;
        private String name;
        private String region;
        private String type;
        public Builder() {}
        public Builder(GetMetrosData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.connectedMetros = defaults.connectedMetros;
    	      this.equinixAsn = defaults.equinixAsn;
    	      this.geoCoordinates = defaults.geoCoordinates;
    	      this.geoScopes = defaults.geoScopes;
    	      this.href = defaults.href;
    	      this.localVcBandwidthMax = defaults.localVcBandwidthMax;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder connectedMetros(List<GetMetrosDataConnectedMetro> connectedMetros) {
            if (connectedMetros == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "connectedMetros");
            }
            this.connectedMetros = connectedMetros;
            return this;
        }
        public Builder connectedMetros(GetMetrosDataConnectedMetro... connectedMetros) {
            return connectedMetros(List.of(connectedMetros));
        }
        @CustomType.Setter
        public Builder equinixAsn(Integer equinixAsn) {
            if (equinixAsn == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "equinixAsn");
            }
            this.equinixAsn = equinixAsn;
            return this;
        }
        @CustomType.Setter
        public Builder geoCoordinates(GetMetrosDataGeoCoordinates geoCoordinates) {
            if (geoCoordinates == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "geoCoordinates");
            }
            this.geoCoordinates = geoCoordinates;
            return this;
        }
        @CustomType.Setter
        public Builder geoScopes(List<String> geoScopes) {
            if (geoScopes == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "geoScopes");
            }
            this.geoScopes = geoScopes;
            return this;
        }
        public Builder geoScopes(String... geoScopes) {
            return geoScopes(List.of(geoScopes));
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder localVcBandwidthMax(Integer localVcBandwidthMax) {
            if (localVcBandwidthMax == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "localVcBandwidthMax");
            }
            this.localVcBandwidthMax = localVcBandwidthMax;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetMetrosData", "type");
            }
            this.type = type;
            return this;
        }
        public GetMetrosData build() {
            final var _resultValue = new GetMetrosData();
            _resultValue.code = code;
            _resultValue.connectedMetros = connectedMetros;
            _resultValue.equinixAsn = equinixAsn;
            _resultValue.geoCoordinates = geoCoordinates;
            _resultValue.geoScopes = geoScopes;
            _resultValue.href = href;
            _resultValue.localVcBandwidthMax = localVcBandwidthMax;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
