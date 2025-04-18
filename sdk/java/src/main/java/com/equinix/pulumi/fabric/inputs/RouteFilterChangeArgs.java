// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteFilterChangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterChangeArgs Empty = new RouteFilterChangeArgs();

    /**
     * The URI of the previous Route Filter Change
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return The URI of the previous Route Filter Change
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Unique identifier for the previous change
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Unique identifier for the previous change
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private RouteFilterChangeArgs() {}

    private RouteFilterChangeArgs(RouteFilterChangeArgs $) {
        this.href = $.href;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterChangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterChangeArgs $;

        public Builder() {
            $ = new RouteFilterChangeArgs();
        }

        public Builder(RouteFilterChangeArgs defaults) {
            $ = new RouteFilterChangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param href The URI of the previous Route Filter Change
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href The URI of the previous Route Filter Change
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param type Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Unique identifier for the previous change
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Unique identifier for the previous change
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public RouteFilterChangeArgs build() {
            return $;
        }
    }

}
