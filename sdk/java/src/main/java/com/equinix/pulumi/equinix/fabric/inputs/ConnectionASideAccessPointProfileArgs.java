// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.enums.ProfileType;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionASideAccessPointProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionASideAccessPointProfileArgs Empty = new ConnectionASideAccessPointProfileArgs();

    @Import(name="accessPointTypeConfigs")
    private @Nullable Output<List<ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs;

    public Optional<Output<List<ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>>> accessPointTypeConfigs() {
        return Optional.ofNullable(this.accessPointTypeConfigs);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Connection URI information
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Connection URI information
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ProfileType>> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Output<Either<String,ProfileType>> type() {
        return this.type;
    }

    @Import(name="uuid", required=true)
    private Output<String> uuid;

    public Output<String> uuid() {
        return this.uuid;
    }

    private ConnectionASideAccessPointProfileArgs() {}

    private ConnectionASideAccessPointProfileArgs(ConnectionASideAccessPointProfileArgs $) {
        this.accessPointTypeConfigs = $.accessPointTypeConfigs;
        this.description = $.description;
        this.href = $.href;
        this.name = $.name;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionASideAccessPointProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionASideAccessPointProfileArgs $;

        public Builder() {
            $ = new ConnectionASideAccessPointProfileArgs();
        }

        public Builder(ConnectionASideAccessPointProfileArgs defaults) {
            $ = new ConnectionASideAccessPointProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPointTypeConfigs(@Nullable Output<List<ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs) {
            $.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }

        public Builder accessPointTypeConfigs(List<ConnectionASideAccessPointProfileAccessPointTypeConfigArgs> accessPointTypeConfigs) {
            return accessPointTypeConfigs(Output.of(accessPointTypeConfigs));
        }

        public Builder accessPointTypeConfigs(ConnectionASideAccessPointProfileAccessPointTypeConfigArgs... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ProfileType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ProfileType> type) {
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
        public Builder type(ProfileType type) {
            return type(Either.ofRight(type));
        }

        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ConnectionASideAccessPointProfileArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.uuid = Objects.requireNonNull($.uuid, "expected parameter 'uuid' to be non-null");
            return $;
        }
    }

}
