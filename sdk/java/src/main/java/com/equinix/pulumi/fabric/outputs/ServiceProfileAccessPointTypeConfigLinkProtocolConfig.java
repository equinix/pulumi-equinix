// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileAccessPointTypeConfigLinkProtocolConfig {
    /**
     * @return Data frames encapsulation standard.UNTAGGED - Untagged encapsulation for EPL connections. DOT1Q - DOT1Q encapsulation standard. QINQ - QINQ encapsulation standard.
     * 
     */
    private @Nullable String encapsulation;
    /**
     * @return Additional tagging information required by the seller profile.
     * 
     */
    private @Nullable String encapsulationStrategy;
    /**
     * @return Automatically accept subsequent DOT1Q to QINQ connections that use the same authentication key. These connections will have the same VLAN S-tag assigned as the initial connection.
     * 
     */
    private @Nullable Boolean reuseVlanSTag;

    private ServiceProfileAccessPointTypeConfigLinkProtocolConfig() {}
    /**
     * @return Data frames encapsulation standard.UNTAGGED - Untagged encapsulation for EPL connections. DOT1Q - DOT1Q encapsulation standard. QINQ - QINQ encapsulation standard.
     * 
     */
    public Optional<String> encapsulation() {
        return Optional.ofNullable(this.encapsulation);
    }
    /**
     * @return Additional tagging information required by the seller profile.
     * 
     */
    public Optional<String> encapsulationStrategy() {
        return Optional.ofNullable(this.encapsulationStrategy);
    }
    /**
     * @return Automatically accept subsequent DOT1Q to QINQ connections that use the same authentication key. These connections will have the same VLAN S-tag assigned as the initial connection.
     * 
     */
    public Optional<Boolean> reuseVlanSTag() {
        return Optional.ofNullable(this.reuseVlanSTag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileAccessPointTypeConfigLinkProtocolConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String encapsulation;
        private @Nullable String encapsulationStrategy;
        private @Nullable Boolean reuseVlanSTag;
        public Builder() {}
        public Builder(ServiceProfileAccessPointTypeConfigLinkProtocolConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encapsulation = defaults.encapsulation;
    	      this.encapsulationStrategy = defaults.encapsulationStrategy;
    	      this.reuseVlanSTag = defaults.reuseVlanSTag;
        }

        @CustomType.Setter
        public Builder encapsulation(@Nullable String encapsulation) {

            this.encapsulation = encapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder encapsulationStrategy(@Nullable String encapsulationStrategy) {

            this.encapsulationStrategy = encapsulationStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder reuseVlanSTag(@Nullable Boolean reuseVlanSTag) {

            this.reuseVlanSTag = reuseVlanSTag;
            return this;
        }
        public ServiceProfileAccessPointTypeConfigLinkProtocolConfig build() {
            final var _resultValue = new ServiceProfileAccessPointTypeConfigLinkProtocolConfig();
            _resultValue.encapsulation = encapsulation;
            _resultValue.encapsulationStrategy = encapsulationStrategy;
            _resultValue.reuseVlanSTag = reuseVlanSTag;
            return _resultValue;
        }
    }
}
