// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.ServiceTokenServiceTokenConnectionASide;
import com.equinix.pulumi.fabric.outputs.ServiceTokenServiceTokenConnectionZSide;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTokenServiceTokenConnection {
    /**
     * @return A-Side Connection link protocol,virtual device or network configuration
     * 
     */
    private @Nullable List<ServiceTokenServiceTokenConnectionASide> aSides;
    /**
     * @return Allow custom bandwidth value
     * 
     */
    private @Nullable Boolean allowCustomBandwidth;
    /**
     * @return Authorization to connect remotely
     * 
     */
    private @Nullable Boolean allowRemoteConnection;
    /**
     * @return Connection bandwidth limit in Mbps
     * 
     */
    private @Nullable Integer bandwidthLimit;
    /**
     * @return List of permitted bandwidths&#39;; For Port-based Service Tokens, the maximum allowable bandwidth is 50 Gbps, while for Virtual Device-based Service Tokens, it is limited to 10 Gbps
     * 
     */
    private @Nullable List<Integer> supportedBandwidths;
    /**
     * @return Type of Connection supported by Service Token you will create; EVPL*VC, EVPLAN*VC, EPLAN*VC, IPWAN*VC
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    private @Nullable String uuid;
    /**
     * @return Z-Side Connection link protocol,virtual device or network configuration
     * 
     */
    private @Nullable List<ServiceTokenServiceTokenConnectionZSide> zSides;

    private ServiceTokenServiceTokenConnection() {}
    /**
     * @return A-Side Connection link protocol,virtual device or network configuration
     * 
     */
    public List<ServiceTokenServiceTokenConnectionASide> aSides() {
        return this.aSides == null ? List.of() : this.aSides;
    }
    /**
     * @return Allow custom bandwidth value
     * 
     */
    public Optional<Boolean> allowCustomBandwidth() {
        return Optional.ofNullable(this.allowCustomBandwidth);
    }
    /**
     * @return Authorization to connect remotely
     * 
     */
    public Optional<Boolean> allowRemoteConnection() {
        return Optional.ofNullable(this.allowRemoteConnection);
    }
    /**
     * @return Connection bandwidth limit in Mbps
     * 
     */
    public Optional<Integer> bandwidthLimit() {
        return Optional.ofNullable(this.bandwidthLimit);
    }
    /**
     * @return List of permitted bandwidths&#39;; For Port-based Service Tokens, the maximum allowable bandwidth is 50 Gbps, while for Virtual Device-based Service Tokens, it is limited to 10 Gbps
     * 
     */
    public List<Integer> supportedBandwidths() {
        return this.supportedBandwidths == null ? List.of() : this.supportedBandwidths;
    }
    /**
     * @return Type of Connection supported by Service Token you will create; EVPL*VC, EVPLAN*VC, EPLAN*VC, IPWAN*VC
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return Z-Side Connection link protocol,virtual device or network configuration
     * 
     */
    public List<ServiceTokenServiceTokenConnectionZSide> zSides() {
        return this.zSides == null ? List.of() : this.zSides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTokenServiceTokenConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceTokenServiceTokenConnectionASide> aSides;
        private @Nullable Boolean allowCustomBandwidth;
        private @Nullable Boolean allowRemoteConnection;
        private @Nullable Integer bandwidthLimit;
        private @Nullable List<Integer> supportedBandwidths;
        private @Nullable String type;
        private @Nullable String uuid;
        private @Nullable List<ServiceTokenServiceTokenConnectionZSide> zSides;
        public Builder() {}
        public Builder(ServiceTokenServiceTokenConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aSides = defaults.aSides;
    	      this.allowCustomBandwidth = defaults.allowCustomBandwidth;
    	      this.allowRemoteConnection = defaults.allowRemoteConnection;
    	      this.bandwidthLimit = defaults.bandwidthLimit;
    	      this.supportedBandwidths = defaults.supportedBandwidths;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.zSides = defaults.zSides;
        }

        @CustomType.Setter
        public Builder aSides(@Nullable List<ServiceTokenServiceTokenConnectionASide> aSides) {

            this.aSides = aSides;
            return this;
        }
        public Builder aSides(ServiceTokenServiceTokenConnectionASide... aSides) {
            return aSides(List.of(aSides));
        }
        @CustomType.Setter
        public Builder allowCustomBandwidth(@Nullable Boolean allowCustomBandwidth) {

            this.allowCustomBandwidth = allowCustomBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder allowRemoteConnection(@Nullable Boolean allowRemoteConnection) {

            this.allowRemoteConnection = allowRemoteConnection;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthLimit(@Nullable Integer bandwidthLimit) {

            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        @CustomType.Setter
        public Builder supportedBandwidths(@Nullable List<Integer> supportedBandwidths) {

            this.supportedBandwidths = supportedBandwidths;
            return this;
        }
        public Builder supportedBandwidths(Integer... supportedBandwidths) {
            return supportedBandwidths(List.of(supportedBandwidths));
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
        @CustomType.Setter
        public Builder zSides(@Nullable List<ServiceTokenServiceTokenConnectionZSide> zSides) {

            this.zSides = zSides;
            return this;
        }
        public Builder zSides(ServiceTokenServiceTokenConnectionZSide... zSides) {
            return zSides(List.of(zSides));
        }
        public ServiceTokenServiceTokenConnection build() {
            final var _resultValue = new ServiceTokenServiceTokenConnection();
            _resultValue.aSides = aSides;
            _resultValue.allowCustomBandwidth = allowCustomBandwidth;
            _resultValue.allowRemoteConnection = allowRemoteConnection;
            _resultValue.bandwidthLimit = bandwidthLimit;
            _resultValue.supportedBandwidths = supportedBandwidths;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            _resultValue.zSides = zSides;
            return _resultValue;
        }
    }
}
