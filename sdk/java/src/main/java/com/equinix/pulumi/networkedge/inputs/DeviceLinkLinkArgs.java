// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceLinkLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceLinkLinkArgs Empty = new DeviceLinkLinkArgs();

    /**
     * billing account number to be used for connection charges
     * 
     */
    @Import(name="accountNumber", required=true)
    private Output<String> accountNumber;

    /**
     * @return billing account number to be used for connection charges
     * 
     */
    public Output<String> accountNumber() {
        return this.accountNumber;
    }

    /**
     * connection destination metro code.
     * 
     */
    @Import(name="dstMetroCode", required=true)
    private Output<String> dstMetroCode;

    /**
     * @return connection destination metro code.
     * 
     */
    public Output<String> dstMetroCode() {
        return this.dstMetroCode;
    }

    /**
     * connection destination zone code is not required.
     * 
     * @deprecated
     * DestinationZoneCode is not required
     * 
     */
    @Deprecated /* DestinationZoneCode is not required */
    @Import(name="dstZoneCode")
    private @Nullable Output<String> dstZoneCode;

    /**
     * @return connection destination zone code is not required.
     * 
     * @deprecated
     * DestinationZoneCode is not required
     * 
     */
    @Deprecated /* DestinationZoneCode is not required */
    public Optional<Output<String>> dstZoneCode() {
        return Optional.ofNullable(this.dstZoneCode);
    }

    /**
     * connection source metro code.
     * 
     */
    @Import(name="srcMetroCode", required=true)
    private Output<String> srcMetroCode;

    /**
     * @return connection source metro code.
     * 
     */
    public Output<String> srcMetroCode() {
        return this.srcMetroCode;
    }

    /**
     * connection source zone code is not required.
     * 
     * @deprecated
     * SourceZoneCode is not required
     * 
     */
    @Deprecated /* SourceZoneCode is not required */
    @Import(name="srcZoneCode")
    private @Nullable Output<String> srcZoneCode;

    /**
     * @return connection source zone code is not required.
     * 
     * @deprecated
     * SourceZoneCode is not required
     * 
     */
    @Deprecated /* SourceZoneCode is not required */
    public Optional<Output<String>> srcZoneCode() {
        return Optional.ofNullable(this.srcZoneCode);
    }

    /**
     * connection throughput.
     * 
     */
    @Import(name="throughput", required=true)
    private Output<String> throughput;

    /**
     * @return connection throughput.
     * 
     */
    public Output<String> throughput() {
        return this.throughput;
    }

    /**
     * connection throughput unit (Mbps or Gbps).
     * 
     */
    @Import(name="throughputUnit", required=true)
    private Output<String> throughputUnit;

    /**
     * @return connection throughput unit (Mbps or Gbps).
     * 
     */
    public Output<String> throughputUnit() {
        return this.throughputUnit;
    }

    private DeviceLinkLinkArgs() {}

    private DeviceLinkLinkArgs(DeviceLinkLinkArgs $) {
        this.accountNumber = $.accountNumber;
        this.dstMetroCode = $.dstMetroCode;
        this.dstZoneCode = $.dstZoneCode;
        this.srcMetroCode = $.srcMetroCode;
        this.srcZoneCode = $.srcZoneCode;
        this.throughput = $.throughput;
        this.throughputUnit = $.throughputUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceLinkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceLinkLinkArgs $;

        public Builder() {
            $ = new DeviceLinkLinkArgs();
        }

        public Builder(DeviceLinkLinkArgs defaults) {
            $ = new DeviceLinkLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountNumber billing account number to be used for connection charges
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(Output<String> accountNumber) {
            $.accountNumber = accountNumber;
            return this;
        }

        /**
         * @param accountNumber billing account number to be used for connection charges
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(String accountNumber) {
            return accountNumber(Output.of(accountNumber));
        }

        /**
         * @param dstMetroCode connection destination metro code.
         * 
         * @return builder
         * 
         */
        public Builder dstMetroCode(Output<String> dstMetroCode) {
            $.dstMetroCode = dstMetroCode;
            return this;
        }

        /**
         * @param dstMetroCode connection destination metro code.
         * 
         * @return builder
         * 
         */
        public Builder dstMetroCode(String dstMetroCode) {
            return dstMetroCode(Output.of(dstMetroCode));
        }

        /**
         * @param dstZoneCode connection destination zone code is not required.
         * 
         * @return builder
         * 
         * @deprecated
         * DestinationZoneCode is not required
         * 
         */
        @Deprecated /* DestinationZoneCode is not required */
        public Builder dstZoneCode(@Nullable Output<String> dstZoneCode) {
            $.dstZoneCode = dstZoneCode;
            return this;
        }

        /**
         * @param dstZoneCode connection destination zone code is not required.
         * 
         * @return builder
         * 
         * @deprecated
         * DestinationZoneCode is not required
         * 
         */
        @Deprecated /* DestinationZoneCode is not required */
        public Builder dstZoneCode(String dstZoneCode) {
            return dstZoneCode(Output.of(dstZoneCode));
        }

        /**
         * @param srcMetroCode connection source metro code.
         * 
         * @return builder
         * 
         */
        public Builder srcMetroCode(Output<String> srcMetroCode) {
            $.srcMetroCode = srcMetroCode;
            return this;
        }

        /**
         * @param srcMetroCode connection source metro code.
         * 
         * @return builder
         * 
         */
        public Builder srcMetroCode(String srcMetroCode) {
            return srcMetroCode(Output.of(srcMetroCode));
        }

        /**
         * @param srcZoneCode connection source zone code is not required.
         * 
         * @return builder
         * 
         * @deprecated
         * SourceZoneCode is not required
         * 
         */
        @Deprecated /* SourceZoneCode is not required */
        public Builder srcZoneCode(@Nullable Output<String> srcZoneCode) {
            $.srcZoneCode = srcZoneCode;
            return this;
        }

        /**
         * @param srcZoneCode connection source zone code is not required.
         * 
         * @return builder
         * 
         * @deprecated
         * SourceZoneCode is not required
         * 
         */
        @Deprecated /* SourceZoneCode is not required */
        public Builder srcZoneCode(String srcZoneCode) {
            return srcZoneCode(Output.of(srcZoneCode));
        }

        /**
         * @param throughput connection throughput.
         * 
         * @return builder
         * 
         */
        public Builder throughput(Output<String> throughput) {
            $.throughput = throughput;
            return this;
        }

        /**
         * @param throughput connection throughput.
         * 
         * @return builder
         * 
         */
        public Builder throughput(String throughput) {
            return throughput(Output.of(throughput));
        }

        /**
         * @param throughputUnit connection throughput unit (Mbps or Gbps).
         * 
         * @return builder
         * 
         */
        public Builder throughputUnit(Output<String> throughputUnit) {
            $.throughputUnit = throughputUnit;
            return this;
        }

        /**
         * @param throughputUnit connection throughput unit (Mbps or Gbps).
         * 
         * @return builder
         * 
         */
        public Builder throughputUnit(String throughputUnit) {
            return throughputUnit(Output.of(throughputUnit));
        }

        public DeviceLinkLinkArgs build() {
            if ($.accountNumber == null) {
                throw new MissingRequiredPropertyException("DeviceLinkLinkArgs", "accountNumber");
            }
            if ($.dstMetroCode == null) {
                throw new MissingRequiredPropertyException("DeviceLinkLinkArgs", "dstMetroCode");
            }
            if ($.srcMetroCode == null) {
                throw new MissingRequiredPropertyException("DeviceLinkLinkArgs", "srcMetroCode");
            }
            if ($.throughput == null) {
                throw new MissingRequiredPropertyException("DeviceLinkLinkArgs", "throughput");
            }
            if ($.throughputUnit == null) {
                throw new MissingRequiredPropertyException("DeviceLinkLinkArgs", "throughputUnit");
            }
            return $;
        }
    }

}
