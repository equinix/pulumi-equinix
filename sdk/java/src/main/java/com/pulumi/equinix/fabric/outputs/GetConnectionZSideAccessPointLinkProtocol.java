// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionZSideAccessPointLinkProtocol {
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private String type;
    private Integer vlanCTag;
    private Integer vlanSTag;
    private Integer vlanTag;

    private GetConnectionZSideAccessPointLinkProtocol() {}
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public String type() {
        return this.type;
    }
    public Integer vlanCTag() {
        return this.vlanCTag;
    }
    public Integer vlanSTag() {
        return this.vlanSTag;
    }
    public Integer vlanTag() {
        return this.vlanTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionZSideAccessPointLinkProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private Integer vlanCTag;
        private Integer vlanSTag;
        private Integer vlanTag;
        public Builder() {}
        public Builder(GetConnectionZSideAccessPointLinkProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.vlanCTag = defaults.vlanCTag;
    	      this.vlanSTag = defaults.vlanSTag;
    	      this.vlanTag = defaults.vlanTag;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder vlanCTag(Integer vlanCTag) {
            this.vlanCTag = Objects.requireNonNull(vlanCTag);
            return this;
        }
        @CustomType.Setter
        public Builder vlanSTag(Integer vlanSTag) {
            this.vlanSTag = Objects.requireNonNull(vlanSTag);
            return this;
        }
        @CustomType.Setter
        public Builder vlanTag(Integer vlanTag) {
            this.vlanTag = Objects.requireNonNull(vlanTag);
            return this;
        }
        public GetConnectionZSideAccessPointLinkProtocol build() {
            final var o = new GetConnectionZSideAccessPointLinkProtocol();
            o.type = type;
            o.vlanCTag = vlanCTag;
            o.vlanSTag = vlanSTag;
            o.vlanTag = vlanTag;
            return o;
        }
    }
}
