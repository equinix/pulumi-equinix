// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    @Import(name="speed", required=true)
    private Output<Integer> speed;

    public Output<Integer> speed() {
        return this.speed;
    }

    @Import(name="status", required=true)
    private Output<String> status;

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

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

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

        public Builder speed(Output<Integer> speed) {
            $.speed = speed;
            return this;
        }

        public Builder speed(Integer speed) {
            return speed(Output.of(speed));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

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
            if ($.id == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "id");
            }
            if ($.linkStatus == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "linkStatus");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "name");
            }
            if ($.role == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "role");
            }
            if ($.speed == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "speed");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "status");
            }
            if ($.virtualCircuitIds == null) {
                throw new MissingRequiredPropertyException("InterconnectionPortArgs", "virtualCircuitIds");
            }
            return $;
        }
    }

}
