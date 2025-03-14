// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionRouteFilterResult {
    /**
     * @return Status of the Route Filter Policy attachment lifecycle
     * 
     */
    private String attachmentStatus;
    /**
     * @return Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    private String connectionId;
    /**
     * @return Direction of the filtering of the attached Route Filter Policy
     * 
     */
    private String direction;
    /**
     * @return URI to the attached Route Filter Policy on the Connection
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    private String routeFilterId;
    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    private String type;
    /**
     * @return Equinix Assigned ID for Route Filter Policy
     * 
     */
    private String uuid;

    private GetConnectionRouteFilterResult() {}
    /**
     * @return Status of the Route Filter Policy attachment lifecycle
     * 
     */
    public String attachmentStatus() {
        return this.attachmentStatus;
    }
    /**
     * @return Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }
    /**
     * @return Direction of the filtering of the attached Route Filter Policy
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return URI to the attached Route Filter Policy on the Connection
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    public String routeFilterId() {
        return this.routeFilterId;
    }
    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix Assigned ID for Route Filter Policy
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionRouteFilterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachmentStatus;
        private String connectionId;
        private String direction;
        private String href;
        private String id;
        private String routeFilterId;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionRouteFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentStatus = defaults.attachmentStatus;
    	      this.connectionId = defaults.connectionId;
    	      this.direction = defaults.direction;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.routeFilterId = defaults.routeFilterId;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder attachmentStatus(String attachmentStatus) {
            if (attachmentStatus == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "attachmentStatus");
            }
            this.attachmentStatus = attachmentStatus;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder routeFilterId(String routeFilterId) {
            if (routeFilterId == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "routeFilterId");
            }
            this.routeFilterId = routeFilterId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteFilterResult", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionRouteFilterResult build() {
            final var _resultValue = new GetConnectionRouteFilterResult();
            _resultValue.attachmentStatus = attachmentStatus;
            _resultValue.connectionId = connectionId;
            _resultValue.direction = direction;
            _resultValue.href = href;
            _resultValue.id = id;
            _resultValue.routeFilterId = routeFilterId;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
