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
public final class GetVlanResult {
    /**
     * @return List of device ID to which this VLAN is assigned.
     * 
     */
    private List<String> assignedDevicesIds;
    /**
     * @return Description text of the VLAN resource.
     * 
     */
    private String description;
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    private String facility;
    private String id;
    private String metro;
    private String projectId;
    private String vlanId;
    private Integer vxlan;

    private GetVlanResult() {}
    /**
     * @return List of device ID to which this VLAN is assigned.
     * 
     */
    public List<String> assignedDevicesIds() {
        return this.assignedDevicesIds;
    }
    /**
     * @return Description text of the VLAN resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public String facility() {
        return this.facility;
    }
    public String id() {
        return this.id;
    }
    public String metro() {
        return this.metro;
    }
    public String projectId() {
        return this.projectId;
    }
    public String vlanId() {
        return this.vlanId;
    }
    public Integer vxlan() {
        return this.vxlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> assignedDevicesIds;
        private String description;
        private String facility;
        private String id;
        private String metro;
        private String projectId;
        private String vlanId;
        private Integer vxlan;
        public Builder() {}
        public Builder(GetVlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedDevicesIds = defaults.assignedDevicesIds;
    	      this.description = defaults.description;
    	      this.facility = defaults.facility;
    	      this.id = defaults.id;
    	      this.metro = defaults.metro;
    	      this.projectId = defaults.projectId;
    	      this.vlanId = defaults.vlanId;
    	      this.vxlan = defaults.vxlan;
        }

        @CustomType.Setter
        public Builder assignedDevicesIds(List<String> assignedDevicesIds) {
            if (assignedDevicesIds == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "assignedDevicesIds");
            }
            this.assignedDevicesIds = assignedDevicesIds;
            return this;
        }
        public Builder assignedDevicesIds(String... assignedDevicesIds) {
            return assignedDevicesIds(List.of(assignedDevicesIds));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder facility(String facility) {
            if (facility == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "facility");
            }
            this.facility = facility;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metro(String metro) {
            if (metro == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "metro");
            }
            this.metro = metro;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(String vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        @CustomType.Setter
        public Builder vxlan(Integer vxlan) {
            if (vxlan == null) {
              throw new MissingRequiredPropertyException("GetVlanResult", "vxlan");
            }
            this.vxlan = vxlan;
            return this;
        }
        public GetVlanResult build() {
            final var _resultValue = new GetVlanResult();
            _resultValue.assignedDevicesIds = assignedDevicesIds;
            _resultValue.description = description;
            _resultValue.facility = facility;
            _resultValue.id = id;
            _resultValue.metro = metro;
            _resultValue.projectId = projectId;
            _resultValue.vlanId = vlanId;
            _resultValue.vxlan = vxlan;
            return _resultValue;
        }
    }
}
