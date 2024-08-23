// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionRedundancyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionRedundancyArgs Empty = new ConnectionRedundancyArgs();

    /**
     * Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    private ConnectionRedundancyArgs() {}

    private ConnectionRedundancyArgs(ConnectionRedundancyArgs $) {
        this.group = $.group;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionRedundancyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionRedundancyArgs $;

        public Builder() {
            $ = new ConnectionRedundancyArgs();
        }

        public Builder(ConnectionRedundancyArgs defaults) {
            $ = new ConnectionRedundancyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix*fabric*connection.primary*port*connection.redundancy).group or equinix*fabric*connection.primary*port*connection.redundancy.0.group)
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param priority Connection priority in redundancy group - PRIMARY, SECONDARY
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Connection priority in redundancy group - PRIMARY, SECONDARY
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public ConnectionRedundancyArgs build() {
            return $;
        }
    }

}