// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsDataNotification {
    /**
     * @return Array of contact emails
     * 
     */
    private List<String> emails;
    /**
     * @return Send interval
     * 
     */
    private @Nullable String sendInterval;
    /**
     * @return Notification Type - ALL,CONNECTION_APPROVAL,SALES_REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    private String type;

    private GetConnectionsDataNotification() {}
    /**
     * @return Array of contact emails
     * 
     */
    public List<String> emails() {
        return this.emails;
    }
    /**
     * @return Send interval
     * 
     */
    public Optional<String> sendInterval() {
        return Optional.ofNullable(this.sendInterval);
    }
    /**
     * @return Notification Type - ALL,CONNECTION_APPROVAL,SALES_REP_NOTIFICATIONS, NOTIFICATIONS
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> emails;
        private @Nullable String sendInterval;
        private String type;
        public Builder() {}
        public Builder(GetConnectionsDataNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.sendInterval = defaults.sendInterval;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder emails(List<String> emails) {
            this.emails = Objects.requireNonNull(emails);
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder sendInterval(@Nullable String sendInterval) {
            this.sendInterval = sendInterval;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectionsDataNotification build() {
            final var _resultValue = new GetConnectionsDataNotification();
            _resultValue.emails = emails;
            _resultValue.sendInterval = sendInterval;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
