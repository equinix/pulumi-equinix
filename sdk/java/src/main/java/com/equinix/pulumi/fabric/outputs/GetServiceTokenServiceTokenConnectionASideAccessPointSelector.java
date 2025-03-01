// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocol;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorPort;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceTokenServiceTokenConnectionASideAccessPointSelector {
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface interface_;
    /**
     * @return Link protocol Configuration
     * 
     */
    private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocol linkProtocol;
    /**
     * @return Network Configuration
     * 
     */
    private GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork network;
    /**
     * @return Port Configuration
     * 
     */
    private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorPort port;
    /**
     * @return Type of Access point; COLO, VD, NETWORK
     * 
     */
    private String type;
    /**
     * @return Virtual Device Configuration
     * 
     */
    private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDevice virtualDevice;

    private GetServiceTokenServiceTokenConnectionASideAccessPointSelector() {}
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    public Optional<GetServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * @return Link protocol Configuration
     * 
     */
    public Optional<GetServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocol> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }
    /**
     * @return Network Configuration
     * 
     */
    public GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork network() {
        return this.network;
    }
    /**
     * @return Port Configuration
     * 
     */
    public Optional<GetServiceTokenServiceTokenConnectionASideAccessPointSelectorPort> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Type of Access point; COLO, VD, NETWORK
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Virtual Device Configuration
     * 
     */
    public Optional<GetServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDevice> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokenServiceTokenConnectionASideAccessPointSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface interface_;
        private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocol linkProtocol;
        private GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork network;
        private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorPort port;
        private String type;
        private @Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDevice virtualDevice;
        public Builder() {}
        public Builder(GetServiceTokenServiceTokenConnectionASideAccessPointSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
    	      this.linkProtocol = defaults.linkProtocol;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.virtualDevice = defaults.virtualDevice;
        }

        @CustomType.Setter("interface")
        public Builder interface_(@Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface interface_) {

            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocol(@Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocol linkProtocol) {

            this.linkProtocol = linkProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionASideAccessPointSelector", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorPort port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionASideAccessPointSelector", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder virtualDevice(@Nullable GetServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDevice virtualDevice) {

            this.virtualDevice = virtualDevice;
            return this;
        }
        public GetServiceTokenServiceTokenConnectionASideAccessPointSelector build() {
            final var _resultValue = new GetServiceTokenServiceTokenConnectionASideAccessPointSelector();
            _resultValue.interface_ = interface_;
            _resultValue.linkProtocol = linkProtocol;
            _resultValue.network = network;
            _resultValue.port = port;
            _resultValue.type = type;
            _resultValue.virtualDevice = virtualDevice;
            return _resultValue;
        }
    }
}
