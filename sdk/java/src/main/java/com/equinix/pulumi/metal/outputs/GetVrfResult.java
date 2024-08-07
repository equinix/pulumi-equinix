// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVrfResult {
    /**
     * @return Description of the VRF.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
     * 
     */
    private List<String> ipRanges;
    /**
     * @return The 4-byte ASN set on the VRF.
     * 
     */
    private Integer localAsn;
    /**
     * @return Metro ID or Code where the VRF will be deployed.
     * 
     */
    private String metro;
    /**
     * @return User-supplied name of the VRF, unique to the project
     * 
     */
    private String name;
    /**
     * @return Project ID where the VRF will be deployed.
     * 
     */
    private String projectId;
    private String vrfId;

    private GetVrfResult() {}
    /**
     * @return Description of the VRF.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return All IPv4 and IPv6 Ranges that will be available to BGP Peers. IPv4 addresses must be /8 or smaller with a minimum size of /29. IPv6 must be /56 or smaller with a minimum size of /64. Ranges must not overlap other ranges within the VRF.
     * 
     */
    public List<String> ipRanges() {
        return this.ipRanges;
    }
    /**
     * @return The 4-byte ASN set on the VRF.
     * 
     */
    public Integer localAsn() {
        return this.localAsn;
    }
    /**
     * @return Metro ID or Code where the VRF will be deployed.
     * 
     */
    public String metro() {
        return this.metro;
    }
    /**
     * @return User-supplied name of the VRF, unique to the project
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Project ID where the VRF will be deployed.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public String vrfId() {
        return this.vrfId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVrfResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private List<String> ipRanges;
        private Integer localAsn;
        private String metro;
        private String name;
        private String projectId;
        private String vrfId;
        public Builder() {}
        public Builder(GetVrfResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipRanges = defaults.ipRanges;
    	      this.localAsn = defaults.localAsn;
    	      this.metro = defaults.metro;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.vrfId = defaults.vrfId;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipRanges(List<String> ipRanges) {
            if (ipRanges == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "ipRanges");
            }
            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        @CustomType.Setter
        public Builder localAsn(Integer localAsn) {
            if (localAsn == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "localAsn");
            }
            this.localAsn = localAsn;
            return this;
        }
        @CustomType.Setter
        public Builder metro(String metro) {
            if (metro == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "metro");
            }
            this.metro = metro;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder vrfId(String vrfId) {
            if (vrfId == null) {
              throw new MissingRequiredPropertyException("GetVrfResult", "vrfId");
            }
            this.vrfId = vrfId;
            return this;
        }
        public GetVrfResult build() {
            final var _resultValue = new GetVrfResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ipRanges = ipRanges;
            _resultValue.localAsn = localAsn;
            _resultValue.metro = metro;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.vrfId = vrfId;
            return _resultValue;
        }
    }
}
