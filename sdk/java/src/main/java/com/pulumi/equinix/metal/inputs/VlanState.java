// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.equinix.metal.enums.Facility;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VlanState extends com.pulumi.resources.ResourceArgs {

    public static final VlanState Empty = new VlanState();

    /**
     * Description string.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description string.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Facility where to create the VLAN.
     * 
     */
    @Import(name="facility")
    private @Nullable Output<Either<String,Facility>> facility;

    /**
     * @return Facility where to create the VLAN.
     * 
     */
    public Optional<Output<Either<String,Facility>>> facility() {
        return Optional.ofNullable(this.facility);
    }

    @Import(name="metro")
    private @Nullable Output<String> metro;

    public Optional<Output<String>> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * ID of parent project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return ID of parent project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * VLAN ID, must be unique in metro.
     * 
     */
    @Import(name="vxlan")
    private @Nullable Output<Integer> vxlan;

    /**
     * @return VLAN ID, must be unique in metro.
     * 
     */
    public Optional<Output<Integer>> vxlan() {
        return Optional.ofNullable(this.vxlan);
    }

    private VlanState() {}

    private VlanState(VlanState $) {
        this.description = $.description;
        this.facility = $.facility;
        this.metro = $.metro;
        this.projectId = $.projectId;
        this.vxlan = $.vxlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VlanState $;

        public Builder() {
            $ = new VlanState();
        }

        public Builder(VlanState defaults) {
            $ = new VlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description string.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param facility Facility where to create the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder facility(@Nullable Output<Either<String,Facility>> facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param facility Facility where to create the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder facility(Either<String,Facility> facility) {
            return facility(Output.of(facility));
        }

        /**
         * @param facility Facility where to create the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder facility(String facility) {
            return facility(Either.ofLeft(facility));
        }

        /**
         * @param facility Facility where to create the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder facility(Facility facility) {
            return facility(Either.ofRight(facility));
        }

        public Builder metro(@Nullable Output<String> metro) {
            $.metro = metro;
            return this;
        }

        public Builder metro(String metro) {
            return metro(Output.of(metro));
        }

        /**
         * @param projectId ID of parent project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId ID of parent project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param vxlan VLAN ID, must be unique in metro.
         * 
         * @return builder
         * 
         */
        public Builder vxlan(@Nullable Output<Integer> vxlan) {
            $.vxlan = vxlan;
            return this;
        }

        /**
         * @param vxlan VLAN ID, must be unique in metro.
         * 
         * @return builder
         * 
         */
        public Builder vxlan(Integer vxlan) {
            return vxlan(Output.of(vxlan));
        }

        public VlanState build() {
            return $;
        }
    }

}
