// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InterconnectionPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectionPortArgs Empty = new InterconnectionPortArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="linkStatus", required=true)
    private Output<String> linkStatus;

    public Output<String> linkStatus() {
        return this.linkStatus;
    }

    /**
     * Name of the connection resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the connection resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    @Import(name="speed", required=true)
    private Output<Integer> speed;

    /**
     * @return Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    public Output<Integer> speed() {
        return this.speed;
    }

    /**
     * Status of the connection resource.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Status of the connection resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    @Import(name="virtualCircuitIds", required=true)
    private Output<List<String>> virtualCircuitIds;

    public Output<List<String>> virtualCircuitIds() {
        return this.virtualCircuitIds;
    }

    private InterconnectionPortArgs() {}

    private InterconnectionPortArgs(InterconnectionPortArgs $) {
        this.id = $.id;
        this.linkStatus = $.linkStatus;
        this.name = $.name;
        this.role = $.role;
        this.speed = $.speed;
        this.status = $.status;
        this.virtualCircuitIds = $.virtualCircuitIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectionPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectionPortArgs $;

        public Builder() {
            $ = new InterconnectionPortArgs();
        }

        public Builder(InterconnectionPortArgs defaults) {
            $ = new InterconnectionPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder linkStatus(Output<String> linkStatus) {
            $.linkStatus = linkStatus;
            return this;
        }

        public Builder linkStatus(String linkStatus) {
            return linkStatus(Output.of(linkStatus));
        }

        /**
         * @param name Name of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param speed Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(Output<Integer> speed) {
            $.speed = speed;
            return this;
        }

        /**
         * @param speed Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(Integer speed) {
            return speed(Output.of(speed));
        }

        /**
         * @param status Status of the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder virtualCircuitIds(Output<List<String>> virtualCircuitIds) {
            $.virtualCircuitIds = virtualCircuitIds;
            return this;
        }

        public Builder virtualCircuitIds(List<String> virtualCircuitIds) {
            return virtualCircuitIds(Output.of(virtualCircuitIds));
        }

        public Builder virtualCircuitIds(String... virtualCircuitIds) {
            return virtualCircuitIds(List.of(virtualCircuitIds));
        }

        public InterconnectionPortArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.linkStatus = Objects.requireNonNull($.linkStatus, "expected parameter 'linkStatus' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.speed = Objects.requireNonNull($.speed, "expected parameter 'speed' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.virtualCircuitIds = Objects.requireNonNull($.virtualCircuitIds, "expected parameter 'virtualCircuitIds' to be non-null");
            return $;
        }
    }

}
