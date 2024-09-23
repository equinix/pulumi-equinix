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
public final class GetConnectionsDataZSideAccessPointInterface {
    /**
     * @return id
     * 
     */
    private Integer id;
    /**
     * @return Interface type
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    private @Nullable String uuid;

    private GetConnectionsDataZSideAccessPointInterface() {}
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
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
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

    public static Builder builder(GetConnectionsDataZSideAccessPointInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private @Nullable String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetConnectionsDataZSideAccessPointInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointInterface", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetConnectionsDataZSideAccessPointInterface build() {
            final var _resultValue = new GetConnectionsDataZSideAccessPointInterface();
            _resultValue.id = id;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
