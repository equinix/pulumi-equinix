// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.DeviceArgs;
import com.equinix.pulumi.metal.inputs.DeviceState;
import com.equinix.pulumi.metal.outputs.DeviceBehavior;
import com.equinix.pulumi.metal.outputs.DeviceIpAddress;
import com.equinix.pulumi.metal.outputs.DeviceNetwork;
import com.equinix.pulumi.metal.outputs.DevicePort;
import com.equinix.pulumi.metal.outputs.DeviceReinstall;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Equinix Metal device resource. This can be used to create, modify, and delete devices.
 * 
 * &gt; **NOTE:** All arguments including the `root_password` and `user_data` will be stored in the raw state as plain-text. Read more about sensitive data in state.
 * 
 * ## Example Usage
 * ### example 1
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web1 = new Device("web1", DeviceArgs.builder()
 *             .hostname("tf.coreos2")
 *             .plan("c3.small.x86")
 *             .metro("sv")
 *             .operatingSystem("ubuntu_20_04")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 2
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var pxe1 = new Device("pxe1", DeviceArgs.builder()
 *             .hostname("tf.coreos2-pxe")
 *             .plan("c3.small.x86")
 *             .metro("sv")
 *             .operatingSystem("custom_ipxe")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .ipxeScriptUrl("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe")
 *             .alwaysPxe("false")
 *             .userData(example.rendered())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 3
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import com.pulumi.equinix.metal.inputs.DeviceIpAddressArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web1 = new Device("web1", DeviceArgs.builder()
 *             .hostname("tf.coreos2")
 *             .plan("c3.small.x86")
 *             .metro("ny")
 *             .operatingSystem("ubuntu_20_04")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .ipAddresses(DeviceIpAddressArgs.builder()
 *                 .type("private_ipv4")
 *                 .cidr(30)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 4
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web1 = new Device("web1", DeviceArgs.builder()
 *             .hostname("tftest")
 *             .plan("c3.small.x86")
 *             .metro("ny")
 *             .operatingSystem("ubuntu_20_04")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .hardwareReservationId("next-available")
 *             .storage("""
 * {  \"disks\": [    {      \"device\": \"/dev/sda\",      \"wipeTable\": true,      \"partitions\": [        {          \"label\": \"BIOS\",          \"number\": 1,          \"size\": \"4096\"        },        {          \"label\": \"SWAP\",          \"number\": 2,          \"size\": \"3993600\"        },        {          \"label\": \"ROOT\",          \"number\": 3,          \"size\": \"0\"        }      ]    }  ],  \"filesystems\": [    {      \"mount\": {        \"device\": \"/dev/sda3\",        \"format\": \"ext4\",        \"point\": \"/\",        \"create\": {          \"options\": [            \"-L\",            \"ROOT\"          ]        }      }    },    {      \"mount\": {        \"device\": \"/dev/sda2\",        \"format\": \"swap\",        \"point\": \"none\",        \"create\": {          \"options\": [            \"-L\",            \"SWAP\"          ]        }      }    }  ]}
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * ### example 5
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import com.pulumi.equinix.metal.inputs.DeviceBehaviorArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var pxe1 = new Device("pxe1", DeviceArgs.builder()
 *             .hostname("tf.coreos2-pxe")
 *             .plan("c3.small.x86")
 *             .metro("sv")
 *             .operatingSystem("custom_ipxe")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .ipxeScriptUrl("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe")
 *             .alwaysPxe("false")
 *             .userData(userData)
 *             .customData(customData)
 *             .behavior(DeviceBehaviorArgs.builder()
 *                 .allowChanges(                
 *                     "custom_data",
 *                     "user_data")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:metal/device:Device")
public class Device extends com.pulumi.resources.CustomResource {
    /**
     * The ipv4 private IP assigned to the device
     * 
     */
    @Export(name="accessPrivateIpv4", refs={String.class}, tree="[0]")
    private Output<String> accessPrivateIpv4;

    /**
     * @return The ipv4 private IP assigned to the device
     * 
     */
    public Output<String> accessPrivateIpv4() {
        return this.accessPrivateIpv4;
    }
    /**
     * The ipv4 maintenance IP assigned to the device
     * 
     */
    @Export(name="accessPublicIpv4", refs={String.class}, tree="[0]")
    private Output<String> accessPublicIpv4;

    /**
     * @return The ipv4 maintenance IP assigned to the device
     * 
     */
    public Output<String> accessPublicIpv4() {
        return this.accessPublicIpv4;
    }
    /**
     * The ipv6 maintenance IP assigned to the device
     * 
     */
    @Export(name="accessPublicIpv6", refs={String.class}, tree="[0]")
    private Output<String> accessPublicIpv6;

    /**
     * @return The ipv6 maintenance IP assigned to the device
     * 
     */
    public Output<String> accessPublicIpv6() {
        return this.accessPublicIpv6;
    }
    /**
     * If true, a device with OS custom_ipxe will
     * 
     */
    @Export(name="alwaysPxe", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alwaysPxe;

    /**
     * @return If true, a device with OS custom_ipxe will
     * 
     */
    public Output<Optional<Boolean>> alwaysPxe() {
        return Codegen.optional(this.alwaysPxe);
    }
    @Export(name="behavior", refs={DeviceBehavior.class}, tree="[0]")
    private Output</* @Nullable */ DeviceBehavior> behavior;

    public Output<Optional<DeviceBehavior>> behavior() {
        return Codegen.optional(this.behavior);
    }
    /**
     * monthly or hourly
     * 
     */
    @Export(name="billingCycle", refs={String.class}, tree="[0]")
    private Output<String> billingCycle;

    /**
     * @return monthly or hourly
     * 
     */
    public Output<String> billingCycle() {
        return this.billingCycle;
    }
    /**
     * The timestamp for when the device was created
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The timestamp for when the device was created
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * A string of the desired Custom Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `&#34;custom_data&#34;`, the device will be updated in-place instead of recreated.
     * 
     */
    @Export(name="customData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customData;

    /**
     * @return A string of the desired Custom Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `&#34;custom_data&#34;`, the device will be updated in-place instead of recreated.
     * 
     */
    public Output<Optional<String>> customData() {
        return Codegen.optional(this.customData);
    }
    /**
     * The facility where the device is deployed
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Export(name="deployedFacility", refs={String.class}, tree="[0]")
    private Output<String> deployedFacility;

    /**
     * @return The facility where the device is deployed
     * 
     */
    public Output<String> deployedFacility() {
        return this.deployedFacility;
    }
    /**
     * ID of hardware reservation where this device was deployed. It is useful when using the next-available hardware reservation
     * 
     */
    @Export(name="deployedHardwareReservationId", refs={String.class}, tree="[0]")
    private Output<String> deployedHardwareReservationId;

    /**
     * @return ID of hardware reservation where this device was deployed. It is useful when using the next-available hardware reservation
     * 
     */
    public Output<String> deployedHardwareReservationId() {
        return this.deployedHardwareReservationId;
    }
    /**
     * Description string for the device
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description string for the device
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of facility codes with deployment preferences. Equinix Metal API will go through the list and will deploy your device to first facility with free capacity. List items must be facility codes or any (a wildcard). To find the facility code, visit [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth token in the top of the page and see JSON from the API response. Conflicts with metro
     * 
     * @deprecated
     * Use metro instead of facilities.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facilities.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Export(name="facilities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> facilities;

    /**
     * @return List of facility codes with deployment preferences. Equinix Metal API will go through the list and will deploy your device to first facility with free capacity. List items must be facility codes or any (a wildcard). To find the facility code, visit [Facilities API docs](https://metal.equinix.com/developers/api/facilities/), set your API auth token in the top of the page and see JSON from the API response. Conflicts with metro
     * 
     */
    public Output<Optional<List<String>>> facilities() {
        return Codegen.optional(this.facilities);
    }
    /**
     * Delete device even if it has volumes attached. Only applies for destroy action
     * 
     */
    @Export(name="forceDetachVolumes", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDetachVolumes;

    /**
     * @return Delete device even if it has volumes attached. Only applies for destroy action
     * 
     */
    public Output<Optional<Boolean>> forceDetachVolumes() {
        return Codegen.optional(this.forceDetachVolumes);
    }
    /**
     * The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your next available reservation automatically
     * 
     */
    @Export(name="hardwareReservationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hardwareReservationId;

    /**
     * @return The UUID of the hardware reservation where you want this device deployed, or next-available if you want to pick your next available reservation automatically
     * 
     */
    public Output<Optional<String>> hardwareReservationId() {
        return Codegen.optional(this.hardwareReservationId);
    }
    /**
     * The device hostname used in deployments taking advantage of Layer3 DHCP or metadata service configuration.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The device hostname used in deployments taking advantage of Layer3 DHCP or metadata service configuration.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * A list of IP address types for the device (structure is documented below)
     * 
     */
    @Export(name="ipAddresses", refs={List.class,DeviceIpAddress.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DeviceIpAddress>> ipAddresses;

    /**
     * @return A list of IP address types for the device (structure is documented below)
     * 
     */
    public Output<Optional<List<DeviceIpAddress>>> ipAddresses() {
        return Codegen.optional(this.ipAddresses);
    }
    /**
     * URL pointing to a hosted iPXE script. More
     * 
     */
    @Export(name="ipxeScriptUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipxeScriptUrl;

    /**
     * @return URL pointing to a hosted iPXE script. More
     * 
     */
    public Output<Optional<String>> ipxeScriptUrl() {
        return Codegen.optional(this.ipxeScriptUrl);
    }
    /**
     * Whether the device is locked or unlocked. Locking a device prevents you from deleting or reinstalling the device or performing a firmware update on the device, and it prevents an instance with a termination time set from being reclaimed, even if the termination time was reached
     * 
     */
    @Export(name="locked", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> locked;

    /**
     * @return Whether the device is locked or unlocked. Locking a device prevents you from deleting or reinstalling the device or performing a firmware update on the device, and it prevents an instance with a termination time set from being reclaimed, even if the termination time was reached
     * 
     */
    public Output<Boolean> locked() {
        return this.locked;
    }
    /**
     * Metro area for the new device. Conflicts with facilities
     * 
     */
    @Export(name="metro", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metro;

    /**
     * @return Metro area for the new device. Conflicts with facilities
     * 
     */
    public Output<Optional<String>> metro() {
        return Codegen.optional(this.metro);
    }
    /**
     * The device&#39;s private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 addresses: public ipv4, private ipv4 and ipv6
     * 
     */
    @Export(name="network", refs={List.class,DeviceNetwork.class}, tree="[0,1]")
    private Output<List<DeviceNetwork>> network;

    /**
     * @return The device&#39;s private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 addresses: public ipv4, private ipv4 and ipv6
     * 
     */
    public Output<List<DeviceNetwork>> network() {
        return this.network;
    }
    /**
     * Network type of a device, used in [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Will be one of layer3, hybrid, hybrid-bonded, layer2-individual, layer2-bonded
     * 
     * @deprecated
     * You should handle Network Type with one of &#39;equinix_metal_port&#39; or &#39;equinix_metal_device_network_type&#39; resources. See section &#39;Guides&#39; for more info
     * 
     */
    @Deprecated /* You should handle Network Type with one of 'equinix_metal_port' or 'equinix_metal_device_network_type' resources. See section 'Guides' for more info */
    @Export(name="networkType", refs={String.class}, tree="[0]")
    private Output<String> networkType;

    /**
     * @return Network type of a device, used in [Layer 2 networking](https://metal.equinix.com/developers/docs/networking/layer2/). Will be one of layer3, hybrid, hybrid-bonded, layer2-individual, layer2-bonded
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }
    /**
     * The operating system slug. To find the slug, or visit [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your API auth token in the top of the page and see JSON from the API response.  By default, changing this attribute will cause your device to be deleted and recreated.  If `reinstall` is enabled, the device will be updated in-place instead of recreated.
     * 
     */
    @Export(name="operatingSystem", refs={String.class}, tree="[0]")
    private Output<String> operatingSystem;

    /**
     * @return The operating system slug. To find the slug, or visit [Operating Systems API docs](https://metal.equinix.com/developers/api/operatingsystems), set your API auth token in the top of the page and see JSON from the API response.  By default, changing this attribute will cause your device to be deleted and recreated.  If `reinstall` is enabled, the device will be updated in-place instead of recreated.
     * 
     */
    public Output<String> operatingSystem() {
        return this.operatingSystem;
    }
    /**
     * The device plan slug. To find the plan slug, visit the [bare-metal server](https://deploy.equinix.com/product/bare-metal/servers/) and [plan documentation](https://deploy.equinix.com/developers/docs/metal/hardware/standard-servers/)
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return The device plan slug. To find the plan slug, visit the [bare-metal server](https://deploy.equinix.com/product/bare-metal/servers/) and [plan documentation](https://deploy.equinix.com/developers/docs/metal/hardware/standard-servers/)
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * Ports assigned to the device
     * 
     */
    @Export(name="ports", refs={List.class,DevicePort.class}, tree="[0,1]")
    private Output<List<DevicePort>> ports;

    /**
     * @return Ports assigned to the device
     * 
     */
    public Output<List<DevicePort>> ports() {
        return this.ports;
    }
    /**
     * The ID of the project in which to create the device
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the project in which to create the device
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Array of IDs of the project SSH keys which should be added to the device. If you specify this array, only the listed project SSH keys (and any SSH keys for the users specified in user*ssh*key*ids) will be added. If no SSH keys are specified (both user*ssh*keys*ids and project*ssh*key*ids are empty lists or omitted), all parent project keys, parent project members keys and organization members keys will be included.  Project SSH keys can be created with the equinix*metal*project*ssh*key resource
     * 
     */
    @Export(name="projectSshKeyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> projectSshKeyIds;

    /**
     * @return Array of IDs of the project SSH keys which should be added to the device. If you specify this array, only the listed project SSH keys (and any SSH keys for the users specified in user*ssh*key*ids) will be added. If no SSH keys are specified (both user*ssh*keys*ids and project*ssh*key*ids are empty lists or omitted), all parent project keys, parent project members keys and organization members keys will be included.  Project SSH keys can be created with the equinix*metal*project*ssh*key resource
     * 
     */
    public Output<Optional<List<String>>> projectSshKeyIds() {
        return Codegen.optional(this.projectSshKeyIds);
    }
    @Export(name="reinstall", refs={DeviceReinstall.class}, tree="[0]")
    private Output</* @Nullable */ DeviceReinstall> reinstall;

    public Output<Optional<DeviceReinstall>> reinstall() {
        return Codegen.optional(this.reinstall);
    }
    /**
     * Root password to the server (disabled after 24 hours)
     * 
     */
    @Export(name="rootPassword", refs={String.class}, tree="[0]")
    private Output<String> rootPassword;

    /**
     * @return Root password to the server (disabled after 24 hours)
     * 
     */
    public Output<String> rootPassword() {
        return this.rootPassword;
    }
    /**
     * The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
     * 
     */
    @Export(name="sosHostname", refs={String.class}, tree="[0]")
    private Output<String> sosHostname;

    /**
     * @return The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
     * 
     */
    public Output<String> sosHostname() {
        return this.sosHostname;
    }
    /**
     * List of IDs of SSH keys deployed in the device, can be both user and project SSH keys
     * 
     */
    @Export(name="sshKeyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sshKeyIds;

    /**
     * @return List of IDs of SSH keys deployed in the device, can be both user and project SSH keys
     * 
     */
    public Output<List<String>> sshKeyIds() {
        return this.sshKeyIds;
    }
    /**
     * The status of the device
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The status of the device
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * JSON for custom partitioning. Only usable on reserved hardware. More information in in the [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/) doc
     * 
     */
    @Export(name="storage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storage;

    /**
     * @return JSON for custom partitioning. Only usable on reserved hardware. More information in in the [Custom Partitioning and RAID](https://metal.equinix.com/developers/docs/servers/custom-partitioning-raid/) doc
     * 
     */
    public Output<Optional<String>> storage() {
        return Codegen.optional(this.storage);
    }
    /**
     * Tags attached to the device
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags attached to the device
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Timestamp for device termination. For example &#34;2021-09-03T16:32:00+03:00&#34;. If you don&#39;t supply timezone info, timestamp is assumed to be in UTC.
     * 
     */
    @Export(name="terminationTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> terminationTime;

    /**
     * @return Timestamp for device termination. For example &#34;2021-09-03T16:32:00+03:00&#34;. If you don&#39;t supply timezone info, timestamp is assumed to be in UTC.
     * 
     */
    public Output<Optional<String>> terminationTime() {
        return Codegen.optional(this.terminationTime);
    }
    /**
     * The timestamp for the last time the device was updated
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The timestamp for the last time the device was updated
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * A string of the desired User Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `&#34;user_data&#34;`, the device will be updated in-place instead of recreated.
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    /**
     * @return A string of the desired User Data for the device.  By default, changing this attribute will cause the provider to destroy and recreate your device.  If `reinstall` is specified or `behavior.allow_changes` includes `&#34;user_data&#34;`, the device will be updated in-place instead of recreated.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    /**
     * Array of IDs of the users whose SSH keys should be added to the device. If you specify this array, only the listed users&#39; SSH keys (and any project SSH keys specified in project*ssh*key*ids) will be added. If no SSH keys are specified (both user*ssh*keys*ids and project*ssh*key*ids are empty lists or omitted), all parent project keys, parent project members keys and organization members keys will be included. User SSH keys can be created with the equinix*metal*ssh*key resource
     * 
     */
    @Export(name="userSshKeyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userSshKeyIds;

    /**
     * @return Array of IDs of the users whose SSH keys should be added to the device. If you specify this array, only the listed users&#39; SSH keys (and any project SSH keys specified in project*ssh*key*ids) will be added. If no SSH keys are specified (both user*ssh*keys*ids and project*ssh*key*ids are empty lists or omitted), all parent project keys, parent project members keys and organization members keys will be included. User SSH keys can be created with the equinix*metal*ssh*key resource
     * 
     */
    public Output<Optional<List<String>>> userSshKeyIds() {
        return Codegen.optional(this.userSshKeyIds);
    }
    /**
     * Only used for devices in reserved hardware. If set, the deletion of this device will block until the hardware reservation is marked provisionable (about 4 minutes in August 2019)
     * 
     */
    @Export(name="waitForReservationDeprovision", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForReservationDeprovision;

    /**
     * @return Only used for devices in reserved hardware. If set, the deletion of this device will block until the hardware reservation is marked provisionable (about 4 minutes in August 2019)
     * 
     */
    public Output<Optional<Boolean>> waitForReservationDeprovision() {
        return Codegen.optional(this.waitForReservationDeprovision);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Device(java.lang.String name) {
        this(name, DeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Device(java.lang.String name, DeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(java.lang.String name, DeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/device:Device", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Device(java.lang.String name, Output<java.lang.String> id, @Nullable DeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/device:Device", name, state, makeResourceOptions(options, id), false);
    }

    private static DeviceArgs makeArgs(DeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeviceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/equinix")
            .additionalSecretOutputs(List.of(
                "customData",
                "rootPassword",
                "userData"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Device get(java.lang.String name, Output<java.lang.String> id, @Nullable DeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, state, options);
    }
}
