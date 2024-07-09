// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectSshKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectSshKeyPlainArgs Empty = new GetProjectSshKeyPlainArgs();

    /**
     * The id of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The id of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Equinix Metal project id of the Equinix Metal SSH Key.
     * 
     * &gt; **NOTE:** One of either `search` or `id` must be provided along with `project_id`.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The Equinix Metal project id of the Equinix Metal SSH Key.
     * 
     * &gt; **NOTE:** One of either `search` or `id` must be provided along with `project_id`.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * The name, fingerprint, or public_key of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    @Import(name="search")
    private @Nullable String search;

    /**
     * @return The name, fingerprint, or public_key of the SSH Key to search for in the Equinix Metal project.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }

    private GetProjectSshKeyPlainArgs() {}

    private GetProjectSshKeyPlainArgs(GetProjectSshKeyPlainArgs $) {
        this.id = $.id;
        this.projectId = $.projectId;
        this.search = $.search;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectSshKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectSshKeyPlainArgs $;

        public Builder() {
            $ = new GetProjectSshKeyPlainArgs();
        }

        public Builder(GetProjectSshKeyPlainArgs defaults) {
            $ = new GetProjectSshKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the SSH Key to search for in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param projectId The Equinix Metal project id of the Equinix Metal SSH Key.
         * 
         * &gt; **NOTE:** One of either `search` or `id` must be provided along with `project_id`.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param search The name, fingerprint, or public_key of the SSH Key to search for in the Equinix Metal project.
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable String search) {
            $.search = search;
            return this;
        }

        public GetProjectSshKeyPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectSshKeyPlainArgs", "projectId");
            }
            return $;
        }
    }

}
