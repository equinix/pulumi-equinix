// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteFilterChange {
    /**
     * @return The URI of the previous Route Filter Change
     * 
     */
    private String href;
    /**
     * @return Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
     * 
     */
    private String type;
    /**
     * @return Unique identifier for the previous change
     * 
     */
    private String uuid;

    private GetRouteFilterChange() {}
    /**
     * @return The URI of the previous Route Filter Change
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Type of change. One of [ &#34;BGP_IPv4_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv4_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv4_PREFIX_FILTER_DELETION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_UPDATE&#34;,&#34;BGP_IPv6_PREFIX_FILTER_CREATION&#34;,&#34;BGP_IPv6_PREFIX_FILTER_DELETION&#34; ]
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Unique identifier for the previous change
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterChange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRouteFilterChange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterChange", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterChange", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterChange", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRouteFilterChange build() {
            final var _resultValue = new GetRouteFilterChange();
            _resultValue.href = href;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
