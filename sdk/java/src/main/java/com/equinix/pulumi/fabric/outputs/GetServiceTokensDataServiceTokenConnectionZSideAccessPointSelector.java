// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterface;
import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol;
import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetwork;
import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPort;
import com.equinix.pulumi.fabric.outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector {
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterface interface_;
    /**
     * @return Link protocol Configuration
     * 
     */
    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol;
    /**
     * @return Network Configuration
     * 
     */
    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetwork network;
    /**
     * @return Port Configuration
     * 
     */
    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPort port;
    /**
     * @return Type of Access point; COLO, VD, NETWORK
     * 
     */
    private String type;
    /**
     * @return Virtual Device Configuration
     * 
     */
    private @Nullable GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice;

    private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector() {}
    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterface interface_() {
        return this.interface_;
    }
    /**
     * @return Link protocol Configuration
     * 
     */
    public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol() {
        return this.linkProtocol;
    }
    /**
     * @return Network Configuration
     * 
     */
    public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetwork network() {
        return this.network;
    }
    /**
     * @return Port Configuration
     * 
     */
    public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPort port() {
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
    public Optional<GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDevice> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterface interface_;
        private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol;
        private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetwork network;
        private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPort port;
        private String type;
        private @Nullable GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice;
        public Builder() {}
        public Builder(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
    	      this.linkProtocol = defaults.linkProtocol;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.virtualDevice = defaults.virtualDevice;
        }

        @CustomType.Setter("interface")
        public Builder interface_(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterface interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocol(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocol linkProtocol) {
            if (linkProtocol == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector", "linkProtocol");
            }
            this.linkProtocol = linkProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder port(GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPort port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder virtualDevice(@Nullable GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDevice virtualDevice) {

            this.virtualDevice = virtualDevice;
            return this;
        }
        public GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector build() {
            final var _resultValue = new GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelector();
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
