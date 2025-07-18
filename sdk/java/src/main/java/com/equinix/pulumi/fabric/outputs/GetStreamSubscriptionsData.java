// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetStreamSubscriptionsDataChangeLog;
import com.equinix.pulumi.fabric.outputs.GetStreamSubscriptionsDataEventSelector;
import com.equinix.pulumi.fabric.outputs.GetStreamSubscriptionsDataMetricSelector;
import com.equinix.pulumi.fabric.outputs.GetStreamSubscriptionsDataSink;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamSubscriptionsData {
    /**
     * @return Details of the last change on the stream resource
     * 
     */
    private GetStreamSubscriptionsDataChangeLog changeLog;
    /**
     * @return Customer-provided stream subscription description
     * 
     */
    private String description;
    /**
     * @return Stream subscription enabled status
     * 
     */
    private Boolean enabled;
    /**
     * @return Lists of events to be included/excluded on the stream subscription
     * 
     */
    private GetStreamSubscriptionsDataEventSelector eventSelector;
    /**
     * @return Equinix assigned URI of the stream subscription resource
     * 
     */
    private String href;
    /**
     * @return Lists of metrics to be included/excluded on the stream subscription
     * 
     */
    private GetStreamSubscriptionsDataMetricSelector metricSelector;
    /**
     * @return Customer-provided stream subscription name
     * 
     */
    private String name;
    /**
     * @return The details of the subscriber to the Equinix Stream
     * 
     */
    private GetStreamSubscriptionsDataSink sink;
    /**
     * @return Value representing provisioning status for the stream resource
     * 
     */
    private String state;
    /**
     * @return Type of the stream subscription request
     * 
     */
    private String type;
    /**
     * @return Equinix assigned unique identifier of the stream subscription resource
     * 
     */
    private String uuid;

    private GetStreamSubscriptionsData() {}
    /**
     * @return Details of the last change on the stream resource
     * 
     */
    public GetStreamSubscriptionsDataChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Customer-provided stream subscription description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Stream subscription enabled status
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Lists of events to be included/excluded on the stream subscription
     * 
     */
    public GetStreamSubscriptionsDataEventSelector eventSelector() {
        return this.eventSelector;
    }
    /**
     * @return Equinix assigned URI of the stream subscription resource
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Lists of metrics to be included/excluded on the stream subscription
     * 
     */
    public GetStreamSubscriptionsDataMetricSelector metricSelector() {
        return this.metricSelector;
    }
    /**
     * @return Customer-provided stream subscription name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The details of the subscriber to the Equinix Stream
     * 
     */
    public GetStreamSubscriptionsDataSink sink() {
        return this.sink;
    }
    /**
     * @return Value representing provisioning status for the stream resource
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Type of the stream subscription request
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix assigned unique identifier of the stream subscription resource
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamSubscriptionsData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetStreamSubscriptionsDataChangeLog changeLog;
        private String description;
        private Boolean enabled;
        private GetStreamSubscriptionsDataEventSelector eventSelector;
        private String href;
        private GetStreamSubscriptionsDataMetricSelector metricSelector;
        private String name;
        private GetStreamSubscriptionsDataSink sink;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetStreamSubscriptionsData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeLog = defaults.changeLog;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.eventSelector = defaults.eventSelector;
    	      this.href = defaults.href;
    	      this.metricSelector = defaults.metricSelector;
    	      this.name = defaults.name;
    	      this.sink = defaults.sink;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder changeLog(GetStreamSubscriptionsDataChangeLog changeLog) {
            if (changeLog == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "changeLog");
            }
            this.changeLog = changeLog;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder eventSelector(GetStreamSubscriptionsDataEventSelector eventSelector) {
            if (eventSelector == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "eventSelector");
            }
            this.eventSelector = eventSelector;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder metricSelector(GetStreamSubscriptionsDataMetricSelector metricSelector) {
            if (metricSelector == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "metricSelector");
            }
            this.metricSelector = metricSelector;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sink(GetStreamSubscriptionsDataSink sink) {
            if (sink == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "sink");
            }
            this.sink = sink;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetStreamSubscriptionsData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetStreamSubscriptionsData build() {
            final var _resultValue = new GetStreamSubscriptionsData();
            _resultValue.changeLog = changeLog;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.eventSelector = eventSelector;
            _resultValue.href = href;
            _resultValue.metricSelector = metricSelector;
            _resultValue.name = name;
            _resultValue.sink = sink;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
