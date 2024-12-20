// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs Empty = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs();

    /**
     * Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Vlan Customer Tag information, vlanCTag value specified for QINQ connections
     * 
     */
    @Import(name="vlanCTag")
    private @Nullable Output<Integer> vlanCTag;

    /**
     * @return Vlan Customer Tag information, vlanCTag value specified for QINQ connections
     * 
     */
    public Optional<Output<Integer>> vlanCTag() {
        return Optional.ofNullable(this.vlanCTag);
    }

    /**
     * Vlan Provider Tag information, vlanSTag value specified for QINQ connections
     * 
     */
    @Import(name="vlanSTag")
    private @Nullable Output<Integer> vlanSTag;

    /**
     * @return Vlan Provider Tag information, vlanSTag value specified for QINQ connections
     * 
     */
    public Optional<Output<Integer>> vlanSTag() {
        return Optional.ofNullable(this.vlanSTag);
    }

    /**
     * Vlan Tag information, vlanTag value specified for DOT1Q connections
     * 
     */
    @Import(name="vlanTag")
    private @Nullable Output<Integer> vlanTag;

    /**
     * @return Vlan Tag information, vlanTag value specified for DOT1Q connections
     * 
     */
    public Optional<Output<Integer>> vlanTag() {
        return Optional.ofNullable(this.vlanTag);
    }

    private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs() {}

    private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs $) {
        this.type = $.type;
        this.vlanCTag = $.vlanCTag;
        this.vlanSTag = $.vlanSTag;
        this.vlanTag = $.vlanTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs $;

        public Builder() {
            $ = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs();
        }

        public Builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs defaults) {
            $ = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vlanCTag Vlan Customer Tag information, vlanCTag value specified for QINQ connections
         * 
         * @return builder
         * 
         */
        public Builder vlanCTag(@Nullable Output<Integer> vlanCTag) {
            $.vlanCTag = vlanCTag;
            return this;
        }

        /**
         * @param vlanCTag Vlan Customer Tag information, vlanCTag value specified for QINQ connections
         * 
         * @return builder
         * 
         */
        public Builder vlanCTag(Integer vlanCTag) {
            return vlanCTag(Output.of(vlanCTag));
        }

        /**
         * @param vlanSTag Vlan Provider Tag information, vlanSTag value specified for QINQ connections
         * 
         * @return builder
         * 
         */
        public Builder vlanSTag(@Nullable Output<Integer> vlanSTag) {
            $.vlanSTag = vlanSTag;
            return this;
        }

        /**
         * @param vlanSTag Vlan Provider Tag information, vlanSTag value specified for QINQ connections
         * 
         * @return builder
         * 
         */
        public Builder vlanSTag(Integer vlanSTag) {
            return vlanSTag(Output.of(vlanSTag));
        }

        /**
         * @param vlanTag Vlan Tag information, vlanTag value specified for DOT1Q connections
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(@Nullable Output<Integer> vlanTag) {
            $.vlanTag = vlanTag;
            return this;
        }

        /**
         * @param vlanTag Vlan Tag information, vlanTag value specified for DOT1Q connections
         * 
         * @return builder
         * 
         */
        public Builder vlanTag(Integer vlanTag) {
            return vlanTag(Output.of(vlanTag));
        }

        public ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs build() {
            return $;
        }
    }

}
