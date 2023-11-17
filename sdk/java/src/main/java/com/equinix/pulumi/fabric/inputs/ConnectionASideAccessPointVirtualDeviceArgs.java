// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionASideAccessPointVirtualDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionASideAccessPointVirtualDeviceArgs Empty = new ConnectionASideAccessPointVirtualDeviceArgs();

    /**
     * Unique Resource Identifier
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Port name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Port name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Interface type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Interface type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Equinix-assigned interface identifier
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private ConnectionASideAccessPointVirtualDeviceArgs() {}

    private ConnectionASideAccessPointVirtualDeviceArgs(ConnectionASideAccessPointVirtualDeviceArgs $) {
        this.href = $.href;
        this.name = $.name;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionASideAccessPointVirtualDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionASideAccessPointVirtualDeviceArgs $;

        public Builder() {
            $ = new ConnectionASideAccessPointVirtualDeviceArgs();
        }

        public Builder(ConnectionASideAccessPointVirtualDeviceArgs defaults) {
            $ = new ConnectionASideAccessPointVirtualDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param href Unique Resource Identifier
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Unique Resource Identifier
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param name Port name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Port name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Interface type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Interface type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Equinix-assigned interface identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned interface identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ConnectionASideAccessPointVirtualDeviceArgs build() {
            return $;
        }
    }

}
