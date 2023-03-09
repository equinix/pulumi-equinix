// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceBehaviorArgs Empty = new DeviceBehaviorArgs();

    /**
     * List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
     * 
     */
    @Import(name="allowChanges")
    private @Nullable Output<List<String>> allowChanges;

    /**
     * @return List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
     * 
     */
    public Optional<Output<List<String>>> allowChanges() {
        return Optional.ofNullable(this.allowChanges);
    }

    private DeviceBehaviorArgs() {}

    private DeviceBehaviorArgs(DeviceBehaviorArgs $) {
        this.allowChanges = $.allowChanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceBehaviorArgs $;

        public Builder() {
            $ = new DeviceBehaviorArgs();
        }

        public Builder(DeviceBehaviorArgs defaults) {
            $ = new DeviceBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowChanges List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
         * 
         * @return builder
         * 
         */
        public Builder allowChanges(@Nullable Output<List<String>> allowChanges) {
            $.allowChanges = allowChanges;
            return this;
        }

        /**
         * @param allowChanges List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
         * 
         * @return builder
         * 
         */
        public Builder allowChanges(List<String> allowChanges) {
            return allowChanges(Output.of(allowChanges));
        }

        /**
         * @param allowChanges List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`&#34;
         * 
         * @return builder
         * 
         */
        public Builder allowChanges(String... allowChanges) {
            return allowChanges(List.of(allowChanges));
        }

        public DeviceBehaviorArgs build() {
            return $;
        }
    }

}
