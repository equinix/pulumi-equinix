// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs;
import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs Empty = new ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs();

    /**
     * Virtual Device Interface Configuration
     * 
     */
    @Import(name="interface")
    private @Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs> interface_;

    /**
     * @return Virtual Device Interface Configuration
     * 
     */
    public Optional<Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * Link protocol Configuration
     * 
     */
    @Import(name="linkProtocol")
    private @Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs> linkProtocol;

    /**
     * @return Link protocol Configuration
     * 
     */
    public Optional<Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs>> linkProtocol() {
        return Optional.ofNullable(this.linkProtocol);
    }

    /**
     * Network Configuration
     * 
     */
    @Import(name="network")
    private @Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs> network;

    /**
     * @return Network Configuration
     * 
     */
    public Optional<Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Port Configuration
     * 
     */
    @Import(name="port")
    private @Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs> port;

    /**
     * @return Port Configuration
     * 
     */
    public Optional<Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Type of Access point; COLO, VD, NETWORK
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of Access point; COLO, VD, NETWORK
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Virtual Device Configuration
     * 
     */
    @Import(name="virtualDevice")
    private @Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs> virtualDevice;

    /**
     * @return Virtual Device Configuration
     * 
     */
    public Optional<Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs>> virtualDevice() {
        return Optional.ofNullable(this.virtualDevice);
    }

    private ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs() {}

    private ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs $) {
        this.interface_ = $.interface_;
        this.linkProtocol = $.linkProtocol;
        this.network = $.network;
        this.port = $.port;
        this.type = $.type;
        this.virtualDevice = $.virtualDevice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs $;

        public Builder() {
            $ = new ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs();
        }

        public Builder(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs defaults) {
            $ = new ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interface_ Virtual Device Interface Configuration
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ Virtual Device Interface Configuration
         * 
         * @return builder
         * 
         */
        public Builder interface_(ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param linkProtocol Link protocol Configuration
         * 
         * @return builder
         * 
         */
        public Builder linkProtocol(@Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs> linkProtocol) {
            $.linkProtocol = linkProtocol;
            return this;
        }

        /**
         * @param linkProtocol Link protocol Configuration
         * 
         * @return builder
         * 
         */
        public Builder linkProtocol(ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs linkProtocol) {
            return linkProtocol(Output.of(linkProtocol));
        }

        /**
         * @param network Network Configuration
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network Configuration
         * 
         * @return builder
         * 
         */
        public Builder network(ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param port Port Configuration
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port Configuration
         * 
         * @return builder
         * 
         */
        public Builder port(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs port) {
            return port(Output.of(port));
        }

        /**
         * @param type Type of Access point; COLO, VD, NETWORK
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Access point; COLO, VD, NETWORK
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param virtualDevice Virtual Device Configuration
         * 
         * @return builder
         * 
         */
        public Builder virtualDevice(@Nullable Output<ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs> virtualDevice) {
            $.virtualDevice = virtualDevice;
            return this;
        }

        /**
         * @param virtualDevice Virtual Device Configuration
         * 
         * @return builder
         * 
         */
        public Builder virtualDevice(ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs virtualDevice) {
            return virtualDevice(Output.of(virtualDevice));
        }

        public ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs build() {
            return $;
        }
    }

}