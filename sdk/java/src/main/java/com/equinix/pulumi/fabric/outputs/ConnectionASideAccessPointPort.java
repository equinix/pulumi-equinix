// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ConnectionASideAccessPointPortRedundancy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointPort {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Port name
     * 
     */
    private @Nullable String name;
    /**
     * @return Redundancy Information
     * 
     */
    private @Nullable ConnectionASideAccessPointPortRedundancy redundancy;
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    private @Nullable String uuid;

    private ConnectionASideAccessPointPort() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Port name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Redundancy Information
     * 
     */
    public Optional<ConnectionASideAccessPointPortRedundancy> redundancy() {
        return Optional.ofNullable(this.redundancy);
    }
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPointPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private @Nullable String name;
        private @Nullable ConnectionASideAccessPointPortRedundancy redundancy;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.redundancy = defaults.redundancy;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(@Nullable String href) {

            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder redundancy(@Nullable ConnectionASideAccessPointPortRedundancy redundancy) {

            this.redundancy = redundancy;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public ConnectionASideAccessPointPort build() {
            final var _resultValue = new ConnectionASideAccessPointPort();
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.redundancy = redundancy;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
