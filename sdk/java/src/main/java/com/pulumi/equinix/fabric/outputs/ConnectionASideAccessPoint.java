// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointAccount;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointGateway;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointInterface;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointLocation;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointPort;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointRoutingProtocol;
import com.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointVirtualDevice;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPoint {
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    private @Nullable List<ConnectionASideAccessPointAccount> accounts;
    private @Nullable String authenticationKey;
    private @Nullable List<ConnectionASideAccessPointGateway> gateways;
    private @Nullable List<ConnectionASideAccessPointInterface> interfaces;
    private @Nullable String linkProtocols;
    private @Nullable List<ConnectionASideAccessPointLocation> locations;
    private @Nullable String peeringType;
    private @Nullable List<ConnectionASideAccessPointPort> ports;
    private @Nullable String profiles;
    private @Nullable String providerConnectionId;
    private @Nullable List<ConnectionASideAccessPointRoutingProtocol> routingProtocols;
    private @Nullable String sellerRegion;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private @Nullable String type;
    private @Nullable List<ConnectionASideAccessPointVirtualDevice> virtualDevices;

    private ConnectionASideAccessPoint() {}
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public List<ConnectionASideAccessPointAccount> accounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    public Optional<String> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    public List<ConnectionASideAccessPointGateway> gateways() {
        return this.gateways == null ? List.of() : this.gateways;
    }
    public List<ConnectionASideAccessPointInterface> interfaces() {
        return this.interfaces == null ? List.of() : this.interfaces;
    }
    public Optional<String> linkProtocols() {
        return Optional.ofNullable(this.linkProtocols);
    }
    public List<ConnectionASideAccessPointLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public Optional<String> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }
    public List<ConnectionASideAccessPointPort> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    public Optional<String> profiles() {
        return Optional.ofNullable(this.profiles);
    }
    public Optional<String> providerConnectionId() {
        return Optional.ofNullable(this.providerConnectionId);
    }
    public List<ConnectionASideAccessPointRoutingProtocol> routingProtocols() {
        return this.routingProtocols == null ? List.of() : this.routingProtocols;
    }
    public Optional<String> sellerRegion() {
        return Optional.ofNullable(this.sellerRegion);
    }
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public List<ConnectionASideAccessPointVirtualDevice> virtualDevices() {
        return this.virtualDevices == null ? List.of() : this.virtualDevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionASideAccessPointAccount> accounts;
        private @Nullable String authenticationKey;
        private @Nullable List<ConnectionASideAccessPointGateway> gateways;
        private @Nullable List<ConnectionASideAccessPointInterface> interfaces;
        private @Nullable String linkProtocols;
        private @Nullable List<ConnectionASideAccessPointLocation> locations;
        private @Nullable String peeringType;
        private @Nullable List<ConnectionASideAccessPointPort> ports;
        private @Nullable String profiles;
        private @Nullable String providerConnectionId;
        private @Nullable List<ConnectionASideAccessPointRoutingProtocol> routingProtocols;
        private @Nullable String sellerRegion;
        private @Nullable String type;
        private @Nullable List<ConnectionASideAccessPointVirtualDevice> virtualDevices;
        public Builder() {}
        public Builder(ConnectionASideAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.authenticationKey = defaults.authenticationKey;
    	      this.gateways = defaults.gateways;
    	      this.interfaces = defaults.interfaces;
    	      this.linkProtocols = defaults.linkProtocols;
    	      this.locations = defaults.locations;
    	      this.peeringType = defaults.peeringType;
    	      this.ports = defaults.ports;
    	      this.profiles = defaults.profiles;
    	      this.providerConnectionId = defaults.providerConnectionId;
    	      this.routingProtocols = defaults.routingProtocols;
    	      this.sellerRegion = defaults.sellerRegion;
    	      this.type = defaults.type;
    	      this.virtualDevices = defaults.virtualDevices;
        }

        @CustomType.Setter
        public Builder accounts(@Nullable List<ConnectionASideAccessPointAccount> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(ConnectionASideAccessPointAccount... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder authenticationKey(@Nullable String authenticationKey) {
            this.authenticationKey = authenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder gateways(@Nullable List<ConnectionASideAccessPointGateway> gateways) {
            this.gateways = gateways;
            return this;
        }
        public Builder gateways(ConnectionASideAccessPointGateway... gateways) {
            return gateways(List.of(gateways));
        }
        @CustomType.Setter
        public Builder interfaces(@Nullable List<ConnectionASideAccessPointInterface> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(ConnectionASideAccessPointInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder linkProtocols(@Nullable String linkProtocols) {
            this.linkProtocols = linkProtocols;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<ConnectionASideAccessPointLocation> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(ConnectionASideAccessPointLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder peeringType(@Nullable String peeringType) {
            this.peeringType = peeringType;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<ConnectionASideAccessPointPort> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(ConnectionASideAccessPointPort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder profiles(@Nullable String profiles) {
            this.profiles = profiles;
            return this;
        }
        @CustomType.Setter
        public Builder providerConnectionId(@Nullable String providerConnectionId) {
            this.providerConnectionId = providerConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder routingProtocols(@Nullable List<ConnectionASideAccessPointRoutingProtocol> routingProtocols) {
            this.routingProtocols = routingProtocols;
            return this;
        }
        public Builder routingProtocols(ConnectionASideAccessPointRoutingProtocol... routingProtocols) {
            return routingProtocols(List.of(routingProtocols));
        }
        @CustomType.Setter
        public Builder sellerRegion(@Nullable String sellerRegion) {
            this.sellerRegion = sellerRegion;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder virtualDevices(@Nullable List<ConnectionASideAccessPointVirtualDevice> virtualDevices) {
            this.virtualDevices = virtualDevices;
            return this;
        }
        public Builder virtualDevices(ConnectionASideAccessPointVirtualDevice... virtualDevices) {
            return virtualDevices(List.of(virtualDevices));
        }
        public ConnectionASideAccessPoint build() {
            final var o = new ConnectionASideAccessPoint();
            o.accounts = accounts;
            o.authenticationKey = authenticationKey;
            o.gateways = gateways;
            o.interfaces = interfaces;
            o.linkProtocols = linkProtocols;
            o.locations = locations;
            o.peeringType = peeringType;
            o.ports = ports;
            o.profiles = profiles;
            o.providerConnectionId = providerConnectionId;
            o.routingProtocols = routingProtocols;
            o.sellerRegion = sellerRegion;
            o.type = type;
            o.virtualDevices = virtualDevices;
            return o;
        }
    }
}
