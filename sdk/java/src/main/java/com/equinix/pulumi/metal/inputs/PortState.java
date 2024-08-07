// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PortState extends com.pulumi.resources.ResourceArgs {

    public static final PortState Empty = new PortState();

    /**
     * UUID of the bond port.
     * 
     */
    @Import(name="bondId")
    private @Nullable Output<String> bondId;

    /**
     * @return UUID of the bond port.
     * 
     */
    public Optional<Output<String>> bondId() {
        return Optional.ofNullable(this.bondId);
    }

    /**
     * Name of the bond port.
     * 
     */
    @Import(name="bondName")
    private @Nullable Output<String> bondName;

    /**
     * @return Name of the bond port.
     * 
     */
    public Optional<Output<String>> bondName() {
        return Optional.ofNullable(this.bondName);
    }

    /**
     * Whether the port should be bonded.
     * 
     */
    @Import(name="bonded")
    private @Nullable Output<Boolean> bonded;

    /**
     * @return Whether the port should be bonded.
     * 
     */
    public Optional<Output<Boolean>> bonded() {
        return Optional.ofNullable(this.bonded);
    }

    /**
     * Flag indicating whether the port can be removed from a bond.
     * 
     */
    @Import(name="disbondSupported")
    private @Nullable Output<Boolean> disbondSupported;

    /**
     * @return Flag indicating whether the port can be removed from a bond.
     * 
     */
    public Optional<Output<Boolean>> disbondSupported() {
        return Optional.ofNullable(this.disbondSupported);
    }

    /**
     * Whether to put the port to Layer 2 mode, valid only for bond ports.
     * 
     */
    @Import(name="layer2")
    private @Nullable Output<Boolean> layer2;

    /**
     * @return Whether to put the port to Layer 2 mode, valid only for bond ports.
     * 
     */
    public Optional<Output<Boolean>> layer2() {
        return Optional.ofNullable(this.layer2);
    }

    /**
     * MAC address of the port.
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return MAC address of the port.
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * Name of the port, e.g. `bond0` or `eth0`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the port, e.g. `bond0` or `eth0`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlan_ids` parameter).
     * 
     */
    @Import(name="nativeVlanId")
    private @Nullable Output<String> nativeVlanId;

    /**
     * @return UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlan_ids` parameter).
     * 
     */
    public Optional<Output<String>> nativeVlanId() {
        return Optional.ofNullable(this.nativeVlanId);
    }

    /**
     * One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
     * 
     */
    @Import(name="networkType")
    private @Nullable Output<String> networkType;

    /**
     * @return One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
     * 
     */
    public Optional<Output<String>> networkType() {
        return Optional.ofNullable(this.networkType);
    }

    /**
     * ID of the port to read.
     * 
     */
    @Import(name="portId")
    private @Nullable Output<String> portId;

    /**
     * @return ID of the port to read.
     * 
     */
    public Optional<Output<String>> portId() {
        return Optional.ofNullable(this.portId);
    }

    /**
     * Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
     * 
     */
    @Import(name="resetOnDelete")
    private @Nullable Output<Boolean> resetOnDelete;

    /**
     * @return Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
     * 
     */
    public Optional<Output<Boolean>> resetOnDelete() {
        return Optional.ofNullable(this.resetOnDelete);
    }

    /**
     * Type is either &#34;NetworkBondPort&#34; for bond ports or &#34;NetworkPort&#34; for bondable ethernet ports.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type is either &#34;NetworkBondPort&#34; for bond ports or &#34;NetworkPort&#34; for bondable ethernet ports.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
     * 
     */
    @Import(name="vlanIds")
    private @Nullable Output<List<String>> vlanIds;

    /**
     * @return List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
     * 
     */
    public Optional<Output<List<String>>> vlanIds() {
        return Optional.ofNullable(this.vlanIds);
    }

    /**
     * List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
     * 
     */
    @Import(name="vxlanIds")
    private @Nullable Output<List<Integer>> vxlanIds;

    /**
     * @return List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
     * 
     */
    public Optional<Output<List<Integer>>> vxlanIds() {
        return Optional.ofNullable(this.vxlanIds);
    }

    private PortState() {}

    private PortState(PortState $) {
        this.bondId = $.bondId;
        this.bondName = $.bondName;
        this.bonded = $.bonded;
        this.disbondSupported = $.disbondSupported;
        this.layer2 = $.layer2;
        this.mac = $.mac;
        this.name = $.name;
        this.nativeVlanId = $.nativeVlanId;
        this.networkType = $.networkType;
        this.portId = $.portId;
        this.resetOnDelete = $.resetOnDelete;
        this.type = $.type;
        this.vlanIds = $.vlanIds;
        this.vxlanIds = $.vxlanIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortState $;

        public Builder() {
            $ = new PortState();
        }

        public Builder(PortState defaults) {
            $ = new PortState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bondId UUID of the bond port.
         * 
         * @return builder
         * 
         */
        public Builder bondId(@Nullable Output<String> bondId) {
            $.bondId = bondId;
            return this;
        }

        /**
         * @param bondId UUID of the bond port.
         * 
         * @return builder
         * 
         */
        public Builder bondId(String bondId) {
            return bondId(Output.of(bondId));
        }

        /**
         * @param bondName Name of the bond port.
         * 
         * @return builder
         * 
         */
        public Builder bondName(@Nullable Output<String> bondName) {
            $.bondName = bondName;
            return this;
        }

        /**
         * @param bondName Name of the bond port.
         * 
         * @return builder
         * 
         */
        public Builder bondName(String bondName) {
            return bondName(Output.of(bondName));
        }

        /**
         * @param bonded Whether the port should be bonded.
         * 
         * @return builder
         * 
         */
        public Builder bonded(@Nullable Output<Boolean> bonded) {
            $.bonded = bonded;
            return this;
        }

        /**
         * @param bonded Whether the port should be bonded.
         * 
         * @return builder
         * 
         */
        public Builder bonded(Boolean bonded) {
            return bonded(Output.of(bonded));
        }

        /**
         * @param disbondSupported Flag indicating whether the port can be removed from a bond.
         * 
         * @return builder
         * 
         */
        public Builder disbondSupported(@Nullable Output<Boolean> disbondSupported) {
            $.disbondSupported = disbondSupported;
            return this;
        }

        /**
         * @param disbondSupported Flag indicating whether the port can be removed from a bond.
         * 
         * @return builder
         * 
         */
        public Builder disbondSupported(Boolean disbondSupported) {
            return disbondSupported(Output.of(disbondSupported));
        }

        /**
         * @param layer2 Whether to put the port to Layer 2 mode, valid only for bond ports.
         * 
         * @return builder
         * 
         */
        public Builder layer2(@Nullable Output<Boolean> layer2) {
            $.layer2 = layer2;
            return this;
        }

        /**
         * @param layer2 Whether to put the port to Layer 2 mode, valid only for bond ports.
         * 
         * @return builder
         * 
         */
        public Builder layer2(Boolean layer2) {
            return layer2(Output.of(layer2));
        }

        /**
         * @param mac MAC address of the port.
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac MAC address of the port.
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param name Name of the port, e.g. `bond0` or `eth0`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the port, e.g. `bond0` or `eth0`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nativeVlanId UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlan_ids` parameter).
         * 
         * @return builder
         * 
         */
        public Builder nativeVlanId(@Nullable Output<String> nativeVlanId) {
            $.nativeVlanId = nativeVlanId;
            return this;
        }

        /**
         * @param nativeVlanId UUID of a VLAN to assign as a native VLAN. It must be one of attached VLANs (from `vlan_ids` parameter).
         * 
         * @return builder
         * 
         */
        public Builder nativeVlanId(String nativeVlanId) {
            return nativeVlanId(Output.of(nativeVlanId));
        }

        /**
         * @param networkType One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
         * 
         * @return builder
         * 
         */
        public Builder networkType(@Nullable Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType One of layer2-bonded, layer2-individual, layer3, hybrid and hybrid-bonded. This attribute is only set on bond ports.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param portId ID of the port to read.
         * 
         * @return builder
         * 
         */
        public Builder portId(@Nullable Output<String> portId) {
            $.portId = portId;
            return this;
        }

        /**
         * @param portId ID of the port to read.
         * 
         * @return builder
         * 
         */
        public Builder portId(String portId) {
            return portId(Output.of(portId));
        }

        /**
         * @param resetOnDelete Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
         * 
         * @return builder
         * 
         */
        public Builder resetOnDelete(@Nullable Output<Boolean> resetOnDelete) {
            $.resetOnDelete = resetOnDelete;
            return this;
        }

        /**
         * @param resetOnDelete Behavioral setting to reset the port to default settings (layer3 bonded mode without any vlan attached) before delete/destroy.
         * 
         * @return builder
         * 
         */
        public Builder resetOnDelete(Boolean resetOnDelete) {
            return resetOnDelete(Output.of(resetOnDelete));
        }

        /**
         * @param type Type is either &#34;NetworkBondPort&#34; for bond ports or &#34;NetworkPort&#34; for bondable ethernet ports.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type is either &#34;NetworkBondPort&#34; for bond ports or &#34;NetworkPort&#34; for bondable ethernet ports.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vlanIds List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vlanIds(@Nullable Output<List<String>> vlanIds) {
            $.vlanIds = vlanIds;
            return this;
        }

        /**
         * @param vlanIds List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vlanIds(List<String> vlanIds) {
            return vlanIds(Output.of(vlanIds));
        }

        /**
         * @param vlanIds List of VLAN UUIDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vlanIds(String... vlanIds) {
            return vlanIds(List.of(vlanIds));
        }

        /**
         * @param vxlanIds List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vxlanIds(@Nullable Output<List<Integer>> vxlanIds) {
            $.vxlanIds = vxlanIds;
            return this;
        }

        /**
         * @param vxlanIds List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vxlanIds(List<Integer> vxlanIds) {
            return vxlanIds(Output.of(vxlanIds));
        }

        /**
         * @param vxlanIds List of VXLAN IDs to attach to the port, valid only for L2 and Hybrid ports.
         * 
         * @return builder
         * 
         */
        public Builder vxlanIds(Integer... vxlanIds) {
            return vxlanIds(List.of(vxlanIds));
        }

        public PortState build() {
            return $;
        }
    }

}
