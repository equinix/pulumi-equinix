// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointAccount;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointGateway;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointInterface;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointLinkProtocol;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointLocation;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointNetwork;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointPort;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointProfile;
import com.equinix.pulumi.fabric.outputs.ConnectionZSideAccessPointRouter;
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
     * @return Account
     * 
     */
    private @Nullable ConnectionZSideAccessPointAccount account;
    /**
     * @return Authentication key for provider based connections
     * 
     */
    private @Nullable String authenticationKey;
    /**
     * @deprecated
     * use router attribute instead; gateway is no longer a part of the supported backend
     * 
     */
    @Deprecated /* use router attribute instead; gateway is no longer a part of the supported backend */
    private @Nullable ConnectionZSideAccessPointGateway gateway;
    /**
     * @return Virtual device interface
     * 
     */
    private @Nullable ConnectionZSideAccessPointInterface interface_;
    /**
     * @return Connection link protocol
     * 
     */
    private @Nullable ConnectionZSideAccessPointLinkProtocol linkProtocol;
    /**
     * @return Access point location
     * 
     */
    private @Nullable ConnectionZSideAccessPointLocation location;
    private @Nullable ConnectionZSideAccessPointNetwork network;
    /**
     * @return Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
     * 
     */
    private @Nullable String peeringType;
    /**
     * @return Port access point information
     * 
     */
    private @Nullable ConnectionZSideAccessPointPort port;
    /**
     * @return Service Profile
     * 
     */
    private @Nullable ConnectionZSideAccessPointProfile profile;
    /**
     * @return Provider assigned Connection Id
     * 
     */
    private @Nullable String providerConnectionId;
    /**
     * @return Cloud Router access point information that replaces `gateway` (refers to below for nested schema)
     * 
     */
    private @Nullable ConnectionZSideAccessPointRouter router;
    /**
     * @return Access point routing protocols configuration
     * 
     */
    private @Nullable List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols;
    /**
     * @return Access point seller region
     * 
     */
    private @Nullable String sellerRegion;
    /**
     * @return Interface type
     * 
     */
    private @Nullable String type;
    /**
     * @return Virtual device
     * 
     */
    private @Nullable ConnectionZSideAccessPointVirtualDevice virtualDevice;

    private ConnectionZSideAccessPoint() {}
    /**
     * @return Account
     * 
     */
    public Optional<ConnectionZSideAccessPointAccount> account() {
        return Optional.ofNullable(this.account);
    }
    /**
     * @return Authentication key for provider based connections
     * 
     */
    public Optional<String> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    /**
     * @deprecated
     * use router attribute instead; gateway is no longer a part of the supported backend
     * 
     */
    @Deprecated /* use router attribute instead; gateway is no longer a part of the supported backend */
    public Optional<ConnectionZSideAccessPointGateway> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return Virtual device interface
     * 
     */
    public Optional<ConnectionZSideAccessPointInterface> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * @return Connection link protocol
     * 
     */
    public Optional<ConnectionZSideAccessPointLinkProtocol> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }
    /**
     * @return Access point location
     * 
     */
    public Optional<ConnectionZSideAccessPointLocation> location() {
        return Optional.ofNullable(this.location);
    }
    public Optional<ConnectionZSideAccessPointNetwork> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
     * 
     */
    public Optional<String> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }
    /**
     * @return Port access point information
     * 
     */
    public Optional<ConnectionZSideAccessPointPort> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Service Profile
     * 
     */
    public Optional<ConnectionZSideAccessPointProfile> profile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * @return Provider assigned Connection Id
     * 
     */
    public Optional<String> providerConnectionId() {
        return Optional.ofNullable(this.providerConnectionId);
    }
    /**
     * @return Cloud Router access point information that replaces `gateway` (refers to below for nested schema)
     * 
     */
    public Optional<ConnectionZSideAccessPointRouter> router() {
        return Optional.ofNullable(this.router);
    }
    /**
     * @return Access point routing protocols configuration
     * 
     */
    public List<ConnectionZSideAccessPointRoutingProtocol> routingProtocols() {
        return this.routingProtocols == null ? List.of() : this.routingProtocols;
    }
    /**
     * @return Access point seller region
     * 
     */
    public Optional<String> sellerRegion() {
        return Optional.ofNullable(this.sellerRegion);
    }
    /**
     * @return Interface type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Virtual device
     * 
     */
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
        private @Nullable ConnectionZSideAccessPointNetwork network;
        private @Nullable String peeringType;
        private @Nullable ConnectionZSideAccessPointPort port;
        private @Nullable ConnectionZSideAccessPointProfile profile;
        private @Nullable String providerConnectionId;
        private @Nullable ConnectionZSideAccessPointRouter router;
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
    	      this.network = defaults.network;
    	      this.peeringType = defaults.peeringType;
    	      this.port = defaults.port;
    	      this.profile = defaults.profile;
    	      this.providerConnectionId = defaults.providerConnectionId;
    	      this.router = defaults.router;
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
        public Builder network(@Nullable ConnectionZSideAccessPointNetwork network) {
            this.network = network;
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
        public Builder router(@Nullable ConnectionZSideAccessPointRouter router) {
            this.router = router;
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
            o.network = network;
            o.peeringType = peeringType;
            o.port = port;
            o.profile = profile;
            o.providerConnectionId = providerConnectionId;
            o.router = router;
            o.routingProtocols = routingProtocols;
            o.sellerRegion = sellerRegion;
            o.type = type;
            o.virtualDevice = virtualDevice;
            return o;
        }
    }
}
