// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectPlainArgs Empty = new GetProjectPlainArgs();

    /**
     * The name which is used to look up the project.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name which is used to look up the project.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The UUID by which to look up the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return The UUID by which to look up the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetProjectPlainArgs() {}

    private GetProjectPlainArgs(GetProjectPlainArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectPlainArgs $;

        public Builder() {
            $ = new GetProjectPlainArgs();
        }

        public Builder(GetProjectPlainArgs defaults) {
            $ = new GetProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which is used to look up the project.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param projectId The UUID by which to look up the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectPlainArgs build() {
            return $;
        }
    }

}
