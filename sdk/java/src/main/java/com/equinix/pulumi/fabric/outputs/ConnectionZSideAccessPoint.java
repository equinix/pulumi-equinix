// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointAccount;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointGateway;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointInterface;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointLinkProtocol;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointLocation;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointPort;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointProfile;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointRoutingProtocol;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionZSideAccessPoint {
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    private @Nullable ConnectionZSideAccessPointAccount account;
    private @Nullable String authenticationKey;
    private @Nullable ConnectionZSideAccessPointGateway gateway;
    private @Nullable ConnectionZSideAccessPointInterface interface_;
    private @Nullable ConnectionZSideAccessPointLinkProtocol linkProtocol;
    private @Nullable ConnectionZSideAccessPointLocation location;
    private @Nullable String peeringType;
    private @Nullable ConnectionZSideAccessPointPort port;
    private @Nullable ConnectionZSideAccessPointProfile profile;
    private @Nullable String providerConnectionId;
    private @Nullable List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols;
    private @Nullable String sellerRegion;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private @Nullable String type;
    private @Nullable ConnectionZSideAccessPointVirtualDevice virtualDevice;

    private ConnectionZSideAccessPoint() {}
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public Optional<ConnectionZSideAccessPointAccount> account() {
        return Optional.ofNullable(this.account);
    }
    public Optional<String> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    public Optional<ConnectionZSideAccessPointGateway> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<ConnectionZSideAccessPointInterface> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    public Optional<ConnectionZSideAccessPointLinkProtocol> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }
    public Optional<ConnectionZSideAccessPointLocation> location() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }
    public Optional<ConnectionZSideAccessPointPort> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<ConnectionZSideAccessPointProfile> profile() {
        return Optional.ofNullable(this.profile);
    }
    public Optional<String> providerConnectionId() {
        return Optional.ofNullable(this.providerConnectionId);
    }
    public List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols() {
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
    public Optional<ConnectionZSideAccessPointVirtualDevice> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionZSideAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectionZSideAccessPointAccount account;
        private @Nullable String authenticationKey;
        private @Nullable ConnectionZSideAccessPointGateway gateway;
        private @Nullable ConnectionZSideAccessPointInterface interface_;
        private @Nullable ConnectionZSideAccessPointLinkProtocol linkProtocol;
        private @Nullable ConnectionZSideAccessPointLocation location;
        private @Nullable String peeringType;
        private @Nullable ConnectionZSideAccessPointPort port;
        private @Nullable ConnectionZSideAccessPointProfile profile;
        private @Nullable String providerConnectionId;
        private @Nullable List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols;
        private @Nullable String sellerRegion;
        private @Nullable String type;
        private @Nullable ConnectionZSideAccessPointVirtualDevice virtualDevice;
        public Builder() {}
        public Builder(ConnectionZSideAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.authenticationKey = defaults.authenticationKey;
    	      this.gateway = defaults.gateway;
    	      this.interface_ = defaults.interface_;
    	      this.linkProtocol = defaults.linkProtocol;
    	      this.location = defaults.location;
    	      this.peeringType = defaults.peeringType;
    	      this.port = defaults.port;
    	      this.profile = defaults.profile;
    	      this.providerConnectionId = defaults.providerConnectionId;
    	      this.routingProtocols = defaults.routingProtocols;
    	      this.sellerRegion = defaults.sellerRegion;
    	      this.type = defaults.type;
    	      this.virtualDevice = defaults.virtualDevice;
        }

        @CustomType.Setter
        public Builder account(@Nullable ConnectionZSideAccessPointAccount account) {
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationKey(@Nullable String authenticationKey) {
            this.authenticationKey = authenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable ConnectionZSideAccessPointGateway gateway) {
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable ConnectionZSideAccessPointInterface interface_) {
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocol(@Nullable ConnectionZSideAccessPointLinkProtocol linkProtocol) {
            this.linkProtocol = linkProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable ConnectionZSideAccessPointLocation location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder peeringType(@Nullable String peeringType) {
            this.peeringType = peeringType;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable ConnectionZSideAccessPointPort port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder profile(@Nullable ConnectionZSideAccessPointProfile profile) {
            this.profile = profile;
            return this;
        }
        @CustomType.Setter
        public Builder providerConnectionId(@Nullable String providerConnectionId) {
            this.providerConnectionId = providerConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder routingProtocols(@Nullable List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols) {
            this.routingProtocols = routingProtocols;
            return this;
        }
        public Builder routingProtocols(ConnectionZSideAccessPointRoutingProtocol... routingProtocols) {
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
        public Builder virtualDevice(@Nullable ConnectionZSideAccessPointVirtualDevice virtualDevice) {
            this.virtualDevice = virtualDevice;
            return this;
        }
        public ConnectionZSideAccessPoint build() {
            final var o = new ConnectionZSideAccessPoint();
            o.account = account;
            o.authenticationKey = authenticationKey;
            o.gateway = gateway;
            o.interface_ = interface_;
            o.linkProtocol = linkProtocol;
            o.location = location;
            o.peeringType = peeringType;
            o.port = port;
            o.profile = profile;
            o.providerConnectionId = providerConnectionId;
            o.routingProtocols = routingProtocols;
            o.sellerRegion = sellerRegion;
            o.type = type;
            o.virtualDevice = virtualDevice;
            return o;
        }
    }
}