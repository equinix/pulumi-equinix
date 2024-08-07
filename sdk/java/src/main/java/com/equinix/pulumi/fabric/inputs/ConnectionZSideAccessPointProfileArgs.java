// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.enums.ProfileType;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionZSideAccessPointProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionZSideAccessPointProfileArgs Empty = new ConnectionZSideAccessPointProfileArgs();

    /**
     * Access point config information
     * 
     */
    @Import(name="accessPointTypeConfigs")
    private @Nullable Output<List<ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs;

    /**
     * @return Access point config information
     * 
     */
    public Optional<Output<List<ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs>>> accessPointTypeConfigs() {
        return Optional.ofNullable(this.accessPointTypeConfigs);
    }

    /**
     * User-provided service description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided service description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Service Profile URI response attribute
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Service Profile URI response attribute
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Customer-assigned service profile name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Customer-assigned service profile name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ProfileType>> type;

    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
     * 
     */
    public Output<Either<String,ProfileType>> type() {
        return this.type;
    }

    /**
     * Equinix assigned service profile identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private ConnectionZSideAccessPointProfileArgs() {}

    private ConnectionZSideAccessPointProfileArgs(ConnectionZSideAccessPointProfileArgs $) {
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
    public static Builder builder(ConnectionZSideAccessPointProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionZSideAccessPointProfileArgs $;

        public Builder() {
            $ = new ConnectionZSideAccessPointProfileArgs();
        }

        public Builder(ConnectionZSideAccessPointProfileArgs defaults) {
            $ = new ConnectionZSideAccessPointProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(@Nullable Output<List<ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs>> accessPointTypeConfigs) {
            $.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(List<ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs> accessPointTypeConfigs) {
            return accessPointTypeConfigs(Output.of(accessPointTypeConfigs));
        }

        /**
         * @param accessPointTypeConfigs Access point config information
         * 
         * @return builder
         * 
         */
        public Builder accessPointTypeConfigs(ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }

        /**
         * @param description User-provided service description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided service description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param href Service Profile URI response attribute
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Service Profile URI response attribute
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Customer-assigned service profile name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Customer-assigned service profile name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ProfileType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ProfileType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
         * 
         * @return builder
         * 
         */
        public Builder type(ProfileType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param uuid Equinix assigned service profile identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix assigned service profile identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ConnectionZSideAccessPointProfileArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ConnectionZSideAccessPointProfileArgs", "type");
            }
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("ConnectionZSideAccessPointProfileArgs", "uuid");
            }
            return $;
        }
    }

}
