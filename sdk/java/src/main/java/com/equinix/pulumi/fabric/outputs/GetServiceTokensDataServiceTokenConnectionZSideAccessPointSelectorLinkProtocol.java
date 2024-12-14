// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol {
    /**
     * @return Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
     * 
     */
    private String type;
    /**
     * @return Vlan Customer Tag information, vlanCTag value specified for QINQ connections
     * 
     */
    private Integer vlanCTag;
    /**
     * @return Vlan Provider Tag information, vlanSTag value specified for QINQ connections
     * 
     */
    private Integer vlanSTag;
    /**
     * @return Vlan Tag information, vlanTag value specified for DOT1Q connections
     * 
     */
    private Integer vlanTag;

    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol() {}
    /**
     * @return Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Vlan Customer Tag information, vlanCTag value specified for QINQ connections
     * 
     */
    public Integer vlanCTag() {
        return this.vlanCTag;
    }
    /**
     * @return Vlan Provider Tag information, vlanSTag value specified for QINQ connections
     * 
     */
    public Integer vlanSTag() {
        return this.vlanSTag;
    }
    /**
     * @return Vlan Tag information, vlanTag value specified for DOT1Q connections
     * 
     */
    public Integer vlanTag() {
        return this.vlanTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private Integer vlanCTag;
        private Integer vlanSTag;
        private Integer vlanTag;
        public Builder() {}
        public Builder(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.vlanCTag = defaults.vlanCTag;
    	      this.vlanSTag = defaults.vlanSTag;
    	      this.vlanTag = defaults.vlanTag;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vlanCTag(Integer vlanCTag) {
            if (vlanCTag == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol", "vlanCTag");
            }
            this.vlanCTag = vlanCTag;
            return this;
        }
        @CustomType.Setter
        public Builder vlanSTag(Integer vlanSTag) {
            if (vlanSTag == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol", "vlanSTag");
            }
            this.vlanSTag = vlanSTag;
            return this;
        }
        @CustomType.Setter
        public Builder vlanTag(Integer vlanTag) {
            if (vlanTag == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol", "vlanTag");
            }
            this.vlanTag = vlanTag;
            return this;
        }
        public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol build() {
            final var _resultValue = new GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol();
            _resultValue.type = type;
            _resultValue.vlanCTag = vlanCTag;
            _resultValue.vlanSTag = vlanSTag;
            _resultValue.vlanTag = vlanTag;
            return _resultValue;
        }
    }
}
