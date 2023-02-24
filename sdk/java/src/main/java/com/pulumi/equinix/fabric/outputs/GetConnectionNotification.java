// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionNotification {
    private List<String> emails;
    private String sendInterval;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private String type;

    private GetConnectionNotification() {}
    public List<String> emails() {
        return this.emails;
    }
    public String sendInterval() {
        return this.sendInterval;
    }
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> emails;
        private String sendInterval;
        private String type;
        public Builder() {}
        public Builder(GetConnectionNotification defaults) {
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
        public Builder sendInterval(String sendInterval) {
            this.sendInterval = Objects.requireNonNull(sendInterval);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectionNotification build() {
            final var o = new GetConnectionNotification();
            o.emails = emails;
            o.sendInterval = sendInterval;
            o.type = type;
            return o;
        }
    }
}
