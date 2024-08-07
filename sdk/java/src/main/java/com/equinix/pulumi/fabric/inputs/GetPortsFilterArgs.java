// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPortsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPortsFilterArgs Empty = new GetPortsFilterArgs();

    /**
     * Query Parameter to Get Ports By Name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Query Parameter to Get Ports By Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetPortsFilterArgs() {}

    private GetPortsFilterArgs(GetPortsFilterArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPortsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPortsFilterArgs $;

        public Builder() {
            $ = new GetPortsFilterArgs();
        }

        public Builder(GetPortsFilterArgs defaults) {
            $ = new GetPortsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Query Parameter to Get Ports By Name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Query Parameter to Get Ports By Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetPortsFilterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPortsFilterArgs", "name");
            }
            return $;
        }
    }

}
