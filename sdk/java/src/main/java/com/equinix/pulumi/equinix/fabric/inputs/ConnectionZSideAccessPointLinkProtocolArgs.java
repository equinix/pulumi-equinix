// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.enums.AccessPointLinkProtocolType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionZSideAccessPointLinkProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionZSideAccessPointLinkProtocolArgs Empty = new ConnectionZSideAccessPointLinkProtocolArgs();

    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,AccessPointLinkProtocolType>> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Optional<Output<Either<String,AccessPointLinkProtocolType>>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="vlanCTag")
    private @Nullable Output<Integer> vlanCTag;

    public Optional<Output<Integer>> vlanCTag() {
        return Optional.ofNullable(this.vlanCTag);
    }

    @Import(name="vlanSTag")
    private @Nullable Output<Integer> vlanSTag;

    public Optional<Output<Integer>> vlanSTag() {
        return Optional.ofNullable(this.vlanSTag);
    }

    @Import(name="vlanTag")
    private @Nullable Output<Integer> vlanTag;

    public Optional<Output<Integer>> vlanTag() {
        return Optional.ofNullable(this.vlanTag);
    }

    private ConnectionZSideAccessPointLinkProtocolArgs() {}

    private ConnectionZSideAccessPointLinkProtocolArgs(ConnectionZSideAccessPointLinkProtocolArgs $) {
        this.type = $.type;
        this.vlanCTag = $.vlanCTag;
        this.vlanSTag = $.vlanSTag;
        this.vlanTag = $.vlanTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionZSideAccessPointLinkProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionZSideAccessPointLinkProtocolArgs $;

        public Builder() {
            $ = new ConnectionZSideAccessPointLinkProtocolArgs();
        }

        public Builder(ConnectionZSideAccessPointLinkProtocolArgs defaults) {
            $ = new ConnectionZSideAccessPointLinkProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,AccessPointLinkProtocolType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,AccessPointLinkProtocolType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(AccessPointLinkProtocolType type) {
            return type(Either.ofRight(type));
        }

        public Builder vlanCTag(@Nullable Output<Integer> vlanCTag) {
            $.vlanCTag = vlanCTag;
            return this;
        }

        public Builder vlanCTag(Integer vlanCTag) {
            return vlanCTag(Output.of(vlanCTag));
        }

        public Builder vlanSTag(@Nullable Output<Integer> vlanSTag) {
            $.vlanSTag = vlanSTag;
            return this;
        }

        public Builder vlanSTag(Integer vlanSTag) {
            return vlanSTag(Output.of(vlanSTag));
        }

        public Builder vlanTag(@Nullable Output<Integer> vlanTag) {
            $.vlanTag = vlanTag;
            return this;
        }

        public Builder vlanTag(Integer vlanTag) {
            return vlanTag(Output.of(vlanTag));
        }

        public ConnectionZSideAccessPointLinkProtocolArgs build() {
            return $;
        }
    }

}
