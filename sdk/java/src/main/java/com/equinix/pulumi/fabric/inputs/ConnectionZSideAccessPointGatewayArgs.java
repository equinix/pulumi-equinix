// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionZSideAccessPointGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionZSideAccessPointGatewayArgs Empty = new ConnectionZSideAccessPointGatewayArgs();

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

    private ConnectionZSideAccessPointGatewayArgs() {}

    private ConnectionZSideAccessPointGatewayArgs(ConnectionZSideAccessPointGatewayArgs $) {
        this.href = $.href;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionZSideAccessPointGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionZSideAccessPointGatewayArgs $;

        public Builder() {
            $ = new ConnectionZSideAccessPointGatewayArgs();
        }

        public Builder(ConnectionZSideAccessPointGatewayArgs defaults) {
            $ = new ConnectionZSideAccessPointGatewayArgs(Objects.requireNonNull(defaults));
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

        public ConnectionZSideAccessPointGatewayArgs build() {
            return $;
        }
    }

}
