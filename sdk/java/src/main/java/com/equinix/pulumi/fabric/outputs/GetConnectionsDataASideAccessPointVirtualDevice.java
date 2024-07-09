// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsDataASideAccessPointVirtualDevice {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Customer-assigned Virtual Device Name
     * 
     */
    private @Nullable String name;
    /**
     * @return Virtual Device type
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned Virtual Device identifier
     * 
     */
    private @Nullable String uuid;

    private GetConnectionsDataASideAccessPointVirtualDevice() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Customer-assigned Virtual Device Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Virtual Device type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned Virtual Device identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataASideAccessPointVirtualDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetConnectionsDataASideAccessPointVirtualDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPointVirtualDevice", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
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
        public GetConnectionsDataASideAccessPointVirtualDevice build() {
            final var _resultValue = new GetConnectionsDataASideAccessPointVirtualDevice();
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
