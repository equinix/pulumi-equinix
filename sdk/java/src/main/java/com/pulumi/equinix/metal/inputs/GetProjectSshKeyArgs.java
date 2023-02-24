// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectSshKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectSshKeyArgs Empty = new GetProjectSshKeyArgs();

    /**
     * The id of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Equinix Metal project id of the Equinix Metal SSH Key.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Equinix Metal project id of the Equinix Metal SSH Key.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The name, fingerprint, or public_key of the SSH Key to search for
     * in the Equinix Metal project.
     * 
     */
    @Import(name="search")
    private @Nullable Output<String> search;

    /**
     * @return The name, fingerprint, or public_key of the SSH Key to search for
     * in the Equinix Metal project.
     * 
     */
    public Optional<Output<String>> search() {
        return Optional.ofNullable(this.search);
    }

    private GetProjectSshKeyArgs() {}

    private GetProjectSshKeyArgs(GetProjectSshKeyArgs $) {
        this.id = $.id;
        this.projectId = $.projectId;
        this.search = $.search;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectSshKeyArgs $;

        public Builder() {
            $ = new GetProjectSshKeyArgs();
        }

        public Builder(GetProjectSshKeyArgs defaults) {
            $ = new GetProjectSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the SSH Key to search for in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the SSH Key to search for in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param projectId The Equinix Metal project id of the Equinix Metal SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Equinix Metal project id of the Equinix Metal SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param search The name, fingerprint, or public_key of the SSH Key to search for
         * in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable Output<String> search) {
            $.search = search;
            return this;
        }

        /**
         * @param search The name, fingerprint, or public_key of the SSH Key to search for
         * in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder search(String search) {
            return search(Output.of(search));
        }

        public GetProjectSshKeyArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
