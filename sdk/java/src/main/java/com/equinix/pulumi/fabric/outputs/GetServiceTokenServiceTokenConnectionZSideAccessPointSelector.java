// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocol;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort;
import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceTokenServiceTokenConnectionZSideAccessPointSelector {
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface interface_;
    /**
     * @return Link protocol Configuration
     * 
     */
    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol;
    /**
     * @return Network Configuration
     * 
     */
    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork network;
    /**
     * @return Port Configuration
     * 
     */
    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort port;
    /**
     * @return Type of Access point; COLO, VD, NETWORK
     * 
     */
    private String type;
    /**
     * @return Virtual Device Configuration
     * 
     */
    private @Nullable GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice;

    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelector() {}
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface interface_() {
        return this.interface_;
    }
    /**
     * @return Link protocol Configuration
     * 
     */
    public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol() {
        return this.linkProtocol;
    }
    /**
     * @return Network Configuration
     * 
     */
    public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork network() {
        return this.network;
    }
    /**
     * @return Port Configuration
     * 
     */
    public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort port() {
        return this.port;
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
    public Optional<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDevice> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface interface_;
        private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol;
        private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork network;
        private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort port;
        private String type;
        private @Nullable GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice;
        public Builder() {}
        public Builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
    	      this.linkProtocol = defaults.linkProtocol;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.virtualDevice = defaults.virtualDevice;
        }

        @CustomType.Setter("interface")
        public Builder interface_(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterface interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelector", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocol(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol) {
            if (linkProtocol == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelector", "linkProtocol");
            }
            this.linkProtocol = linkProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelector", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder port(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelector", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelector", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder virtualDevice(@Nullable GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice) {

            this.virtualDevice = virtualDevice;
            return this;
        }
        public GetServiceTokenServiceTokenConnectionZSideAccessPointSelector build() {
            final var _resultValue = new GetServiceTokenServiceTokenConnectionZSideAccessPointSelector();
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