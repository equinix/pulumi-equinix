// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshKeyState extends com.pulumi.resources.ResourceArgs {

    public static final SshKeyState Empty = new SshKeyState();

    /**
     * The timestamp for when the SSH key was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The timestamp for when the SSH key was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The fingerprint of the SSH key.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return The fingerprint of the SSH key.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The name of the SSH key for identification
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SSH key for identification
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The UUID of the Equinix Metal API User who owns this key.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The UUID of the Equinix Metal API User who owns this key.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The timestamp for the last time the SSH key was updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return The timestamp for the last time the SSH key was updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    private SshKeyState() {}

    private SshKeyState(SshKeyState $) {
        this.created = $.created;
        this.fingerprint = $.fingerprint;
        this.name = $.name;
        this.ownerId = $.ownerId;
        this.publicKey = $.publicKey;
        this.updated = $.updated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshKeyState $;

        public Builder() {
            $ = new SshKeyState();
        }

        public Builder(SshKeyState defaults) {
            $ = new SshKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The timestamp for when the SSH key was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The timestamp for when the SSH key was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param fingerprint The fingerprint of the SSH key.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint of the SSH key.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param name The name of the SSH key for identification
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SSH key for identification
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerId The UUID of the Equinix Metal API User who owns this key.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The UUID of the Equinix Metal API User who owns this key.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param publicKey The public key. If this is a file, it can be read using the file interpolation function
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public key. If this is a file, it can be read using the file interpolation function
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param updated The timestamp for the last time the SSH key was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated The timestamp for the last time the SSH key was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        public SshKeyState build() {
            return $;
        }
    }

}
