// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface {
    /**
     * @return id
     * 
     */
    private @Nullable Integer id;
    /**
     * @return Interface type
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    private @Nullable String uuid;

    private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface() {}
    /**
     * @return id
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
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
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer id;
        private String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface build() {
            final var _resultValue = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface();
            _resultValue.id = id;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}