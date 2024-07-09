// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectBgpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectBgpConfigArgs Empty = new ProjectBgpConfigArgs();

    /**
     * Autonomous System Number for local BGP deployment.
     * 
     */
    @Import(name="asn", required=true)
    private Output<Integer> asn;

    /**
     * @return Autonomous System Number for local BGP deployment.
     * 
     */
    public Output<Integer> asn() {
        return this.asn;
    }

    /**
     * `local` or `global`, the `local` is likely to be usable immediately, the `global` will need to be reviewed by Equinix Metal engineers.
     * 
     */
    @Import(name="deploymentType", required=true)
    private Output<String> deploymentType;

    /**
     * @return `local` or `global`, the `local` is likely to be usable immediately, the `global` will need to be reviewed by Equinix Metal engineers.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }

    /**
     * The maximum number of route filters allowed per server.
     * 
     */
    @Import(name="maxPrefix")
    private @Nullable Output<Integer> maxPrefix;

    /**
     * @return The maximum number of route filters allowed per server.
     * 
     */
    public Optional<Output<Integer>> maxPrefix() {
        return Optional.ofNullable(this.maxPrefix);
    }

    /**
     * Password for BGP session in plaintext (not a checksum).
     * 
     */
    @Import(name="md5")
    private @Nullable Output<String> md5;

    /**
     * @return Password for BGP session in plaintext (not a checksum).
     * 
     */
    public Optional<Output<String>> md5() {
        return Optional.ofNullable(this.md5);
    }

    /**
     * status of BGP configuration in the project.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return status of BGP configuration in the project.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ProjectBgpConfigArgs() {}

    private ProjectBgpConfigArgs(ProjectBgpConfigArgs $) {
        this.asn = $.asn;
        this.deploymentType = $.deploymentType;
        this.maxPrefix = $.maxPrefix;
        this.md5 = $.md5;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectBgpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectBgpConfigArgs $;

        public Builder() {
            $ = new ProjectBgpConfigArgs();
        }

        public Builder(ProjectBgpConfigArgs defaults) {
            $ = new ProjectBgpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn Autonomous System Number for local BGP deployment.
         * 
         * @return builder
         * 
         */
        public Builder asn(Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn Autonomous System Number for local BGP deployment.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param deploymentType `local` or `global`, the `local` is likely to be usable immediately, the `global` will need to be reviewed by Equinix Metal engineers.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType `local` or `global`, the `local` is likely to be usable immediately, the `global` will need to be reviewed by Equinix Metal engineers.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param maxPrefix The maximum number of route filters allowed per server.
         * 
         * @return builder
         * 
         */
        public Builder maxPrefix(@Nullable Output<Integer> maxPrefix) {
            $.maxPrefix = maxPrefix;
            return this;
        }

        /**
         * @param maxPrefix The maximum number of route filters allowed per server.
         * 
         * @return builder
         * 
         */
        public Builder maxPrefix(Integer maxPrefix) {
            return maxPrefix(Output.of(maxPrefix));
        }

        /**
         * @param md5 Password for BGP session in plaintext (not a checksum).
         * 
         * @return builder
         * 
         */
        public Builder md5(@Nullable Output<String> md5) {
            $.md5 = md5;
            return this;
        }

        /**
         * @param md5 Password for BGP session in plaintext (not a checksum).
         * 
         * @return builder
         * 
         */
        public Builder md5(String md5) {
            return md5(Output.of(md5));
        }

        /**
         * @param status status of BGP configuration in the project.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status of BGP configuration in the project.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ProjectBgpConfigArgs build() {
            if ($.asn == null) {
                throw new MissingRequiredPropertyException("ProjectBgpConfigArgs", "asn");
            }
            if ($.deploymentType == null) {
                throw new MissingRequiredPropertyException("ProjectBgpConfigArgs", "deploymentType");
            }
            return $;
        }
    }

}
