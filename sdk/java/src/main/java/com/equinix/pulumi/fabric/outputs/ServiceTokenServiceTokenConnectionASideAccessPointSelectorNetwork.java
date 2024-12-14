// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Location
     * 
     */
    private @Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation> locations;
    /**
     * @return Network Name
     * 
     */
    private @Nullable String name;
    /**
     * @return Scope of Network
     * 
     */
    private @Nullable String scope;
    /**
     * @return Type of Network
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    private @Nullable String uuid;

    private ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Location
     * 
     */
    public List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * @return Network Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Scope of Network
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Type of Network
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private @Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation> locations;
        private @Nullable String name;
        private @Nullable String scope;
        private @Nullable String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(@Nullable String href) {

            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation> locations) {

            this.locations = locations;
            return this;
        }
        public Builder locations(ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
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
        public ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork build() {
            final var _resultValue = new ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork();
            _resultValue.href = href;
            _resultValue.locations = locations;
            _resultValue.name = name;
            _resultValue.scope = scope;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
