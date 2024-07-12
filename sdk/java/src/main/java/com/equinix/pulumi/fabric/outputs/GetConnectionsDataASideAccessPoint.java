// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointAccount;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointGateway;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointInterface;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointLinkProtocol;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointLocation;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointNetwork;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointPort;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointProfile;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointRouter;
import com.equinix.pulumi.fabric.outputs.GetConnectionsDataASideAccessPointVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsDataASideAccessPoint {
    /**
     * @return Account
     * 
     */
    private List<GetConnectionsDataASideAccessPointAccount> accounts;
    /**
     * @return Authentication key for provider based connections
     * 
     */
    private @Nullable String authenticationKey;
    /**
     * @return **Deprecated** `gateway` Use `router` attribute instead
     * 
     * @deprecated
     * use router attribute instead; gateway is no longer a part of the supported backend
     * 
     */
    @Deprecated /* use router attribute instead; gateway is no longer a part of the supported backend */
    private @Nullable GetConnectionsDataASideAccessPointGateway gateway;
    /**
     * @return Virtual device interface
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointInterface interface_;
    /**
     * @return Connection link protocol
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointLinkProtocol linkProtocol;
    /**
     * @return Access point location
     * 
     */
    private GetConnectionsDataASideAccessPointLocation location;
    /**
     * @return network access point information
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointNetwork network;
    /**
     * @return Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
     * 
     */
    private @Nullable String peeringType;
    /**
     * @return Port access point information
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointPort port;
    /**
     * @return Service Profile
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointProfile profile;
    /**
     * @return Provider assigned Connection Id
     * 
     */
    private String providerConnectionId;
    /**
     * @return Cloud Router access point information that replaces `gateway`
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointRouter router;
    /**
     * @return Access point seller region
     * 
     */
    private @Nullable String sellerRegion;
    /**
     * @return Access point type - COLO, VD, VG, SP, IGW, SUBNET, CLOUD_ROUTER, NETWORK
     * 
     */
    private @Nullable String type;
    /**
     * @return Virtual device
     * 
     */
    private @Nullable GetConnectionsDataASideAccessPointVirtualDevice virtualDevice;

    private GetConnectionsDataASideAccessPoint() {}
    /**
     * @return Account
     * 
     */
    public List<GetConnectionsDataASideAccessPointAccount> accounts() {
        return this.accounts;
    }
    /**
     * @return Authentication key for provider based connections
     * 
     */
    public Optional<String> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    /**
     * @return **Deprecated** `gateway` Use `router` attribute instead
     * 
     * @deprecated
     * use router attribute instead; gateway is no longer a part of the supported backend
     * 
     */
    @Deprecated /* use router attribute instead; gateway is no longer a part of the supported backend */
    public Optional<GetConnectionsDataASideAccessPointGateway> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return Virtual device interface
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointInterface> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * @return Connection link protocol
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointLinkProtocol> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }
    /**
     * @return Access point location
     * 
     */
    public GetConnectionsDataASideAccessPointLocation location() {
        return this.location;
    }
    /**
     * @return network access point information
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointNetwork> network() {
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
    public Optional<GetConnectionsDataASideAccessPointPort> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Service Profile
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointProfile> profile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * @return Provider assigned Connection Id
     * 
     */
    public String providerConnectionId() {
        return this.providerConnectionId;
    }
    /**
     * @return Cloud Router access point information that replaces `gateway`
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointRouter> router() {
        return Optional.ofNullable(this.router);
    }
    /**
     * @return Access point seller region
     * 
     */
    public Optional<String> sellerRegion() {
        return Optional.ofNullable(this.sellerRegion);
    }
    /**
     * @return Access point type - COLO, VD, VG, SP, IGW, SUBNET, CLOUD_ROUTER, NETWORK
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Virtual device
     * 
     */
    public Optional<GetConnectionsDataASideAccessPointVirtualDevice> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataASideAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectionsDataASideAccessPointAccount> accounts;
        private @Nullable String authenticationKey;
        private @Nullable GetConnectionsDataASideAccessPointGateway gateway;
        private @Nullable GetConnectionsDataASideAccessPointInterface interface_;
        private @Nullable GetConnectionsDataASideAccessPointLinkProtocol linkProtocol;
        private GetConnectionsDataASideAccessPointLocation location;
        private @Nullable GetConnectionsDataASideAccessPointNetwork network;
        private @Nullable String peeringType;
        private @Nullable GetConnectionsDataASideAccessPointPort port;
        private @Nullable GetConnectionsDataASideAccessPointProfile profile;
        private String providerConnectionId;
        private @Nullable GetConnectionsDataASideAccessPointRouter router;
        private @Nullable String sellerRegion;
        private @Nullable String type;
        private @Nullable GetConnectionsDataASideAccessPointVirtualDevice virtualDevice;
        public Builder() {}
        public Builder(GetConnectionsDataASideAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
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
    	      this.sellerRegion = defaults.sellerRegion;
    	      this.type = defaults.type;
    	      this.virtualDevice = defaults.virtualDevice;
        }

        @CustomType.Setter
        public Builder accounts(List<GetConnectionsDataASideAccessPointAccount> accounts) {
            if (accounts == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPoint", "accounts");
            }
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(GetConnectionsDataASideAccessPointAccount... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder authenticationKey(@Nullable String authenticationKey) {

            this.authenticationKey = authenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable GetConnectionsDataASideAccessPointGateway gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable GetConnectionsDataASideAccessPointInterface interface_) {

            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocol(@Nullable GetConnectionsDataASideAccessPointLinkProtocol linkProtocol) {

            this.linkProtocol = linkProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder location(GetConnectionsDataASideAccessPointLocation location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPoint", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable GetConnectionsDataASideAccessPointNetwork network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder peeringType(@Nullable String peeringType) {

            this.peeringType = peeringType;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable GetConnectionsDataASideAccessPointPort port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder profile(@Nullable GetConnectionsDataASideAccessPointProfile profile) {

            this.profile = profile;
            return this;
        }
        @CustomType.Setter
        public Builder providerConnectionId(String providerConnectionId) {
            if (providerConnectionId == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPoint", "providerConnectionId");
            }
            this.providerConnectionId = providerConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder router(@Nullable GetConnectionsDataASideAccessPointRouter router) {

            this.router = router;
            return this;
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
        public Builder virtualDevice(@Nullable GetConnectionsDataASideAccessPointVirtualDevice virtualDevice) {

            this.virtualDevice = virtualDevice;
            return this;
        }
        public GetConnectionsDataASideAccessPoint build() {
            final var _resultValue = new GetConnectionsDataASideAccessPoint();
            _resultValue.accounts = accounts;
            _resultValue.authenticationKey = authenticationKey;
            _resultValue.gateway = gateway;
            _resultValue.interface_ = interface_;
            _resultValue.linkProtocol = linkProtocol;
            _resultValue.location = location;
            _resultValue.network = network;
            _resultValue.peeringType = peeringType;
            _resultValue.port = port;
            _resultValue.profile = profile;
            _resultValue.providerConnectionId = providerConnectionId;
            _resultValue.router = router;
            _resultValue.sellerRegion = sellerRegion;
            _resultValue.type = type;
            _resultValue.virtualDevice = virtualDevice;
            return _resultValue;
        }
    }
}
