// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortsDatumEncapsulation {
    /**
     * @return Port encapsulation Tag Protocol Identifier
     * 
     */
    private String tagProtocolId;
    /**
     * @return Port encapsulation protocol type
     * 
     */
    private String type;

    private GetPortsDatumEncapsulation() {}
    /**
     * @return Port encapsulation Tag Protocol Identifier
     * 
     */
    public String tagProtocolId() {
        return this.tagProtocolId;
    }
    /**
     * @return Port encapsulation protocol type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatumEncapsulation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tagProtocolId;
        private String type;
        public Builder() {}
        public Builder(GetPortsDatumEncapsulation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagProtocolId = defaults.tagProtocolId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder tagProtocolId(String tagProtocolId) {
            if (tagProtocolId == null) {
              throw new MissingRequiredPropertyException("GetPortsDatumEncapsulation", "tagProtocolId");
            }
            this.tagProtocolId = tagProtocolId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPortsDatumEncapsulation", "type");
            }
            this.type = type;
            return this;
        }
        public GetPortsDatumEncapsulation build() {
            final var _resultValue = new GetPortsDatumEncapsulation();
            _resultValue.tagProtocolId = tagProtocolId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
