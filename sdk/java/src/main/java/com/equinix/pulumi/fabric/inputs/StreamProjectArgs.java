// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StreamProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamProjectArgs Empty = new StreamProjectArgs();

    /**
     * Equinix Subscriber-assigned project ID
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Equinix Subscriber-assigned project ID
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private StreamProjectArgs() {}

    private StreamProjectArgs(StreamProjectArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamProjectArgs $;

        public Builder() {
            $ = new StreamProjectArgs();
        }

        public Builder(StreamProjectArgs defaults) {
            $ = new StreamProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Equinix Subscriber-assigned project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Equinix Subscriber-assigned project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public StreamProjectArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("StreamProjectArgs", "projectId");
            }
            return $;
        }
    }

}
