// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface {
    /**
     * @return id
     * 
     */
    private Integer id;
    /**
     * @return Interface type
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    private String uuid;

    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface() {}
    /**
     * @return id
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Interface type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface build() {
            final var _resultValue = new GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface();
            _resultValue.id = id;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
