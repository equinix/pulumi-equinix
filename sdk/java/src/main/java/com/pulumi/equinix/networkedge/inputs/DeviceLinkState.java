// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkDeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkLinkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceLinkState extends com.pulumi.resources.ResourceArgs {

    public static final DeviceLinkState Empty = new DeviceLinkState();

    /**
     * definition of one or more devices belonging to the
     * device link. See Device section below for more details.
     * 
     */
    @Import(name="devices")
    private @Nullable Output<List<DeviceLinkDeviceArgs>> devices;

    /**
     * @return definition of one or more devices belonging to the
     * device link. See Device section below for more details.
     * 
     */
    public Optional<Output<List<DeviceLinkDeviceArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    /**
     * definition of one or more, inter metro, connections belonging
     * to the device link. See Link section below for more details.
     * 
     */
    @Import(name="links")
    private @Nullable Output<List<DeviceLinkLinkArgs>> links;

    /**
     * @return definition of one or more, inter metro, connections belonging
     * to the device link. See Link section below for more details.
     * 
     */
    public Optional<Output<List<DeviceLinkLinkArgs>>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * device link name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return device link name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * device link provisioning status on a given device. One of `PROVISIONING`,
     * `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return device link provisioning status on a given device. One of `PROVISIONING`,
     * `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * device link subnet in CIDR format. Not required for link
     * between self configured devices.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return device link subnet in CIDR format. Not required for link
     * between self configured devices.
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Device link unique identifier.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Device link unique identifier.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private DeviceLinkState() {}

    private DeviceLinkState(DeviceLinkState $) {
        this.devices = $.devices;
        this.links = $.links;
        this.name = $.name;
        this.status = $.status;
        this.subnet = $.subnet;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceLinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceLinkState $;

        public Builder() {
            $ = new DeviceLinkState();
        }

        public Builder(DeviceLinkState defaults) {
            $ = new DeviceLinkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<List<DeviceLinkDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(List<DeviceLinkDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices definition of one or more devices belonging to the
         * device link. See Device section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder devices(DeviceLinkDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(@Nullable Output<List<DeviceLinkLinkArgs>> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(List<DeviceLinkLinkArgs> links) {
            return links(Output.of(links));
        }

        /**
         * @param links definition of one or more, inter metro, connections belonging
         * to the device link. See Link section below for more details.
         * 
         * @return builder
         * 
         */
        public Builder links(DeviceLinkLinkArgs... links) {
            return links(List.of(links));
        }

        /**
         * @param name device link name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name device link name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status device link provisioning status on a given device. One of `PROVISIONING`,
         * `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status device link provisioning status on a given device. One of `PROVISIONING`,
         * `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subnet device link subnet in CIDR format. Not required for link
         * between self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet device link subnet in CIDR format. Not required for link
         * between self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param uuid Device link unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Device link unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public DeviceLinkState build() {
            return $;
        }
    }

}
