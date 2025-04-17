// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSubscriptionEventSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSubscriptionEventSelectorArgs Empty = new StreamSubscriptionEventSelectorArgs();

    /**
     * List of events to exclude
     * 
     */
    @Import(name="excepts")
    private @Nullable Output<List<String>> excepts;

    /**
     * @return List of events to exclude
     * 
     */
    public Optional<Output<List<String>>> excepts() {
        return Optional.ofNullable(this.excepts);
    }

    /**
     * List of events to include
     * 
     */
    @Import(name="includes", required=true)
    private Output<List<String>> includes;

    /**
     * @return List of events to include
     * 
     */
    public Output<List<String>> includes() {
        return this.includes;
    }

    private StreamSubscriptionEventSelectorArgs() {}

    private StreamSubscriptionEventSelectorArgs(StreamSubscriptionEventSelectorArgs $) {
        this.excepts = $.excepts;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSubscriptionEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSubscriptionEventSelectorArgs $;

        public Builder() {
            $ = new StreamSubscriptionEventSelectorArgs();
        }

        public Builder(StreamSubscriptionEventSelectorArgs defaults) {
            $ = new StreamSubscriptionEventSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excepts List of events to exclude
         * 
         * @return builder
         * 
         */
        public Builder excepts(@Nullable Output<List<String>> excepts) {
            $.excepts = excepts;
            return this;
        }

        /**
         * @param excepts List of events to exclude
         * 
         * @return builder
         * 
         */
        public Builder excepts(List<String> excepts) {
            return excepts(Output.of(excepts));
        }

        /**
         * @param excepts List of events to exclude
         * 
         * @return builder
         * 
         */
        public Builder excepts(String... excepts) {
            return excepts(List.of(excepts));
        }

        /**
         * @param includes List of events to include
         * 
         * @return builder
         * 
         */
        public Builder includes(Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes List of events to include
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes List of events to include
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public StreamSubscriptionEventSelectorArgs build() {
            if ($.includes == null) {
                throw new MissingRequiredPropertyException("StreamSubscriptionEventSelectorArgs", "includes");
            }
            return $;
        }
    }

}
