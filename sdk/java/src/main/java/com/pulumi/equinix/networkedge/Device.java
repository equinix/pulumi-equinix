// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.equinix.Utilities;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceState;
import com.pulumi.equinix.networkedge.outputs.DeviceClusterDetails;
import com.pulumi.equinix.networkedge.outputs.DeviceInterface;
import com.pulumi.equinix.networkedge.outputs.DeviceSecondaryDevice;
import com.pulumi.equinix.networkedge.outputs.DeviceSshKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource `equinix.networkedge.Device` allows creation and management of Equinix Network Edge virtual
 * network devices.
 * 
 * Network Edge virtual network devices can be created in two modes:
 * 
 * * **managed** - (default) Where Equinix manages connectivity and services in the device and
 *   customer gets limited access to the device.
 * * **self-configured** - Where customer provisions and manages own services in the device with less
 *   restricted access. Some device types are offered only in this mode.
 * 
 * In addition to management modes, there are two software license modes available:
 * 
 * * **subscription** - Where Equinix provides software license, including end-to-end support, and
 *   bills for the service respectively.
 * * **BYOL** - [bring your own license] Where customer brings his own, already procured device
 *   software license. There are no charges associated with such license. It is the only licensing mode
 *   for `self-configured` devices.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
 * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
 * import com.pulumi.equinix.networkedge.Device;
 * import com.pulumi.equinix.networkedge.DeviceArgs;
 * import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
 *         final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
 *             .metroCode(&#34;DC&#34;)
 *             .build());
 * 
 *         final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
 *             .metroCode(&#34;SV&#34;)
 *             .build());
 * 
 *         var csr1000v_ha = new Device(&#34;csr1000v-ha&#34;, DeviceArgs.builder()        
 *             .throughput(500)
 *             .throughputUnit(&#34;Mbps&#34;)
 *             .metroCode(dc.applyValue(getAccountResult -&gt; getAccountResult.metroCode()))
 *             .typeCode(&#34;CSR1000V&#34;)
 *             .packageCode(&#34;SEC&#34;)
 *             .notifications(            
 *                 &#34;john@equinix.com&#34;,
 *                 &#34;marry@equinix.com&#34;,
 *                 &#34;fred@equinix.com&#34;)
 *             .hostname(&#34;csr1000v-p&#34;)
 *             .termLength(6)
 *             .accountNumber(dc.applyValue(getAccountResult -&gt; getAccountResult.number()))
 *             .version(&#34;16.09.05&#34;)
 *             .coreCount(2)
 *             .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
 *                 .name(&#34;tf-csr1000v-s&#34;)
 *                 .metroCode(sv.applyValue(getAccountResult -&gt; getAccountResult.metroCode()))
 *                 .hostname(&#34;csr1000v-s&#34;)
 *                 .notifications(                
 *                     &#34;john@equinix.com&#34;,
 *                     &#34;marry@equinix.com&#34;)
 *                 .accountNumber(sv.applyValue(getAccountResult -&gt; getAccountResult.number()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
 * import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
 * import com.pulumi.equinix.networkedge.Device;
 * import com.pulumi.equinix.networkedge.DeviceArgs;
 * import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
 * import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsArgs;
 * import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0Args;
 * import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0VendorConfigurationArgs;
 * import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1Args;
 * import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1VendorConfigurationArgs;
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
 *         final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
 *             .metroCode(&#34;SV&#34;)
 *             .build());
 * 
 *         var panw_cluster = new Device(&#34;panw-cluster&#34;, DeviceArgs.builder()        
 *             .metroCode(sv.applyValue(getAccountResult -&gt; getAccountResult.metroCode()))
 *             .typeCode(&#34;PA-VM&#34;)
 *             .selfManaged(true)
 *             .byol(true)
 *             .packageCode(&#34;VM100&#34;)
 *             .notifications(            
 *                 &#34;john@equinix.com&#34;,
 *                 &#34;marry@equinix.com&#34;,
 *                 &#34;fred@equinix.com&#34;)
 *             .termLength(6)
 *             .accountNumber(sv.applyValue(getAccountResult -&gt; getAccountResult.number()))
 *             .version(&#34;10.1.3&#34;)
 *             .interfaceCount(10)
 *             .coreCount(2)
 *             .sshKey(DeviceSshKeyArgs.builder()
 *                 .username(&#34;test&#34;)
 *                 .keyName(&#34;test-key&#34;)
 *                 .build())
 *             .aclTemplateId(&#34;0bff6e05-f0e7-44cd-804a-25b92b835f8b&#34;)
 *             .clusterDetails(DeviceClusterDetailsArgs.builder()
 *                 .clusterName(&#34;tf-panw-cluster&#34;)
 *                 .node0(DeviceClusterDetailsNode0Args.builder()
 *                     .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
 *                         .hostname(&#34;panw-node0&#34;)
 *                         .build())
 *                     .licenseToken(&#34;licenseToken&#34;)
 *                     .build())
 *                 .node1(DeviceClusterDetailsNode1Args.builder()
 *                     .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
 *                         .hostname(&#34;panw-node1&#34;)
 *                         .build())
 *                     .licenseToken(&#34;licenseToken&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing ID
 * 
 * ```sh
 *  $ pulumi import equinix:networkedge/device:Device example {existing_id}
 * ```
 * 
 *  The `license_token` and `mgtm_acl_template_uuid` fields can not be imported.
 * 
 */
@ResourceType(type="equinix:networkedge/device:Device")
public class Device extends com.pulumi.resources.CustomResource {
    /**
     * Billing account number for a device.
     * 
     */
    @Export(name="accountNumber", refs={String.class}, tree="[0]")
    private Output<String> accountNumber;

    /**
     * @return Billing account number for a device.
     * 
     */
    public Output<String> accountNumber() {
        return this.accountNumber;
    }
    /**
     * Identifier of an ACL template that will be applied on the device.
     * 
     */
    @Export(name="aclTemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aclTemplateId;

    /**
     * @return Identifier of an ACL template that will be applied on the device.
     * 
     */
    public Output<Optional<String>> aclTemplateId() {
        return Codegen.optional(this.aclTemplateId);
    }
    /**
     * Additional Internet bandwidth, in Mbps, that will be
     * allocated to the device (in addition to default 15Mbps).
     * 
     */
    @Export(name="additionalBandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> additionalBandwidth;

    /**
     * @return Additional Internet bandwidth, in Mbps, that will be
     * allocated to the device (in addition to default 15Mbps).
     * 
     */
    public Output<Integer> additionalBandwidth() {
        return this.additionalBandwidth;
    }
    /**
     * (Autonomous System Number) Unique identifier for a network on the internet.
     * 
     */
    @Export(name="asn", refs={Integer.class}, tree="[0]")
    private Output<Integer> asn;

    /**
     * @return (Autonomous System Number) Unique identifier for a network on the internet.
     * 
     */
    public Output<Integer> asn() {
        return this.asn;
    }
    /**
     * Boolean value that determines device licensing mode, i.e.,
     * `bring your own license` or `subscription` (default).
     * 
     */
    @Export(name="byol", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> byol;

    /**
     * @return Boolean value that determines device licensing mode, i.e.,
     * `bring your own license` or `subscription` (default).
     * 
     */
    public Output<Optional<Boolean>> byol() {
        return Codegen.optional(this.byol);
    }
    /**
     * An object that has the cluster details. See
     * Cluster Details below for more details.
     * 
     */
    @Export(name="clusterDetails", refs={DeviceClusterDetails.class}, tree="[0]")
    private Output</* @Nullable */ DeviceClusterDetails> clusterDetails;

    /**
     * @return An object that has the cluster details. See
     * Cluster Details below for more details.
     * 
     */
    public Output<Optional<DeviceClusterDetails>> clusterDetails() {
        return Codegen.optional(this.clusterDetails);
    }
    /**
     * Number of CPU cores used by device.
     * 
     */
    @Export(name="coreCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> coreCount;

    /**
     * @return Number of CPU cores used by device.
     * 
     */
    public Output<Integer> coreCount() {
        return this.coreCount;
    }
    /**
     * Device hostname prefix.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Device hostname prefix.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Device location Equinix Business Exchange name.
     * 
     */
    @Export(name="ibx", refs={String.class}, tree="[0]")
    private Output<String> ibx;

    /**
     * @return Device location Equinix Business Exchange name.
     * 
     */
    public Output<String> ibx() {
        return this.ibx;
    }
    /**
     * Number of network interfaces on a device. If not specified,
     * default number for a given device type will be used.
     * 
     */
    @Export(name="interfaceCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> interfaceCount;

    /**
     * @return Number of network interfaces on a device. If not specified,
     * default number for a given device type will be used.
     * 
     */
    public Output<Integer> interfaceCount() {
        return this.interfaceCount;
    }
    /**
     * List of device interfaces. See Interface Attribute below
     * for more details.
     * 
     */
    @Export(name="interfaces", refs={List.class,DeviceInterface.class}, tree="[0,1]")
    private Output<List<DeviceInterface>> interfaces;

    /**
     * @return List of device interfaces. See Interface Attribute below
     * for more details.
     * 
     */
    public Output<List<DeviceInterface>> interfaces() {
        return this.interfaces;
    }
    /**
     * Path to the license file that will be uploaded and applied on a
     * device. Applicable for some devices types in BYOL licensing mode.
     * 
     */
    @Export(name="licenseFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> licenseFile;

    /**
     * @return Path to the license file that will be uploaded and applied on a
     * device. Applicable for some devices types in BYOL licensing mode.
     * 
     */
    public Output<Optional<String>> licenseFile() {
        return Codegen.optional(this.licenseFile);
    }
    /**
     * License file id. This is necessary for Fortinet and Juniper clusters.
     * 
     */
    @Export(name="licenseFileId", refs={String.class}, tree="[0]")
    private Output<String> licenseFileId;

    /**
     * @return License file id. This is necessary for Fortinet and Juniper clusters.
     * 
     */
    public Output<String> licenseFileId() {
        return this.licenseFileId;
    }
    /**
     * Device license registration status. Possible values are `APPLYING_LICENSE`,
     * `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     * 
     */
    @Export(name="licenseStatus", refs={String.class}, tree="[0]")
    private Output<String> licenseStatus;

    /**
     * @return Device license registration status. Possible values are `APPLYING_LICENSE`,
     * `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     * 
     */
    public Output<String> licenseStatus() {
        return this.licenseStatus;
    }
    /**
     * License token. This is necessary for Palo Alto clusters.
     * 
     */
    @Export(name="licenseToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> licenseToken;

    /**
     * @return License token. This is necessary for Palo Alto clusters.
     * 
     */
    public Output<Optional<String>> licenseToken() {
        return Codegen.optional(this.licenseToken);
    }
    /**
     * Device location metro code.
     * 
     */
    @Export(name="metroCode", refs={String.class}, tree="[0]")
    private Output<String> metroCode;

    /**
     * @return Device location metro code.
     * 
     */
    public Output<String> metroCode() {
        return this.metroCode;
    }
    /**
     * Identifier of an MGMT interface ACL template that will be
     * applied on the device.
     * 
     */
    @Export(name="mgmtAclTemplateUuid", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mgmtAclTemplateUuid;

    /**
     * @return Identifier of an MGMT interface ACL template that will be
     * applied on the device.
     * 
     */
    public Output<Optional<String>> mgmtAclTemplateUuid() {
        return Codegen.optional(this.mgmtAclTemplateUuid);
    }
    /**
     * Device name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Device name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of email addresses that will receive device status
     * notifications.
     * 
     */
    @Export(name="notifications", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notifications;

    /**
     * @return List of email addresses that will receive device status
     * notifications.
     * 
     */
    public Output<List<String>> notifications() {
        return this.notifications;
    }
    /**
     * Name/number used to identify device order on the invoice.
     * 
     */
    @Export(name="orderReference", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orderReference;

    /**
     * @return Name/number used to identify device order on the invoice.
     * 
     */
    public Output<Optional<String>> orderReference() {
        return Codegen.optional(this.orderReference);
    }
    /**
     * Device software package code.
     * 
     */
    @Export(name="packageCode", refs={String.class}, tree="[0]")
    private Output<String> packageCode;

    /**
     * @return Device software package code.
     * 
     */
    public Output<String> packageCode() {
        return this.packageCode;
    }
    /**
     * Purchase order number associated with a device order.
     * 
     */
    @Export(name="purchaseOrderNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> purchaseOrderNumber;

    /**
     * @return Purchase order number associated with a device order.
     * 
     */
    public Output<Optional<String>> purchaseOrderNumber() {
        return Codegen.optional(this.purchaseOrderNumber);
    }
    /**
     * Device redundancy type applicable for HA devices, either
     * primary or secondary.
     * 
     */
    @Export(name="redundancyType", refs={String.class}, tree="[0]")
    private Output<String> redundancyType;

    /**
     * @return Device redundancy type applicable for HA devices, either
     * primary or secondary.
     * 
     */
    public Output<String> redundancyType() {
        return this.redundancyType;
    }
    /**
     * Unique identifier for a redundant device applicable for HA devices.
     * 
     */
    @Export(name="redundantId", refs={String.class}, tree="[0]")
    private Output<String> redundantId;

    /**
     * @return Unique identifier for a redundant device applicable for HA devices.
     * 
     */
    public Output<String> redundantId() {
        return this.redundantId;
    }
    /**
     * Device location region.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Device location region.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Definition of secondary device for redundant
     * device configurations. See Secondary Device below for more details.
     * 
     */
    @Export(name="secondaryDevice", refs={DeviceSecondaryDevice.class}, tree="[0]")
    private Output</* @Nullable */ DeviceSecondaryDevice> secondaryDevice;

    /**
     * @return Definition of secondary device for redundant
     * device configurations. See Secondary Device below for more details.
     * 
     */
    public Output<Optional<DeviceSecondaryDevice>> secondaryDevice() {
        return Codegen.optional(this.secondaryDevice);
    }
    /**
     * Boolean value that determines device management mode, i.e.,
     * `self-managed` or `Equinix managed` (default).
     * 
     */
    @Export(name="selfManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> selfManaged;

    /**
     * @return Boolean value that determines device management mode, i.e.,
     * `self-managed` or `Equinix managed` (default).
     * 
     */
    public Output<Optional<Boolean>> selfManaged() {
        return Codegen.optional(this.selfManaged);
    }
    /**
     * IP address of SSH enabled interface on the device.
     * 
     */
    @Export(name="sshIpAddress", refs={String.class}, tree="[0]")
    private Output<String> sshIpAddress;

    /**
     * @return IP address of SSH enabled interface on the device.
     * 
     */
    public Output<String> sshIpAddress() {
        return this.sshIpAddress;
    }
    /**
     * FQDN of SSH enabled interface on the device.
     * 
     */
    @Export(name="sshIpFqdn", refs={String.class}, tree="[0]")
    private Output<String> sshIpFqdn;

    /**
     * @return FQDN of SSH enabled interface on the device.
     * 
     */
    public Output<String> sshIpFqdn() {
        return this.sshIpFqdn;
    }
    /**
     * Definition of SSH key that will be provisioned on a device
     * 
     */
    @Export(name="sshKey", refs={DeviceSshKey.class}, tree="[0]")
    private Output</* @Nullable */ DeviceSshKey> sshKey;

    /**
     * @return Definition of SSH key that will be provisioned on a device
     * 
     */
    public Output<Optional<DeviceSshKey>> sshKey() {
        return Codegen.optional(this.sshKey);
    }
    /**
     * interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Device term length.
     * 
     */
    @Export(name="termLength", refs={Integer.class}, tree="[0]")
    private Output<Integer> termLength;

    /**
     * @return Device term length.
     * 
     */
    public Output<Integer> termLength() {
        return this.termLength;
    }
    /**
     * Device license throughput.
     * 
     */
    @Export(name="throughput", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> throughput;

    /**
     * @return Device license throughput.
     * 
     */
    public Output<Optional<Integer>> throughput() {
        return Codegen.optional(this.throughput);
    }
    /**
     * License throughput unit. One of `Mbps` or `Gbps`.
     * 
     */
    @Export(name="throughputUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> throughputUnit;

    /**
     * @return License throughput unit. One of `Mbps` or `Gbps`.
     * 
     */
    public Output<Optional<String>> throughputUnit() {
        return Codegen.optional(this.throughputUnit);
    }
    /**
     * Device type code.
     * 
     */
    @Export(name="typeCode", refs={String.class}, tree="[0]")
    private Output<String> typeCode;

    /**
     * @return Device type code.
     * 
     */
    public Output<String> typeCode() {
        return this.typeCode;
    }
    /**
     * Device unique identifier.
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Device unique identifier.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * An object that has fields relevant to the vendor of the
     * cluster device. See Cluster Details - Nodes - Vendor Configuration
     * below for more details.
     * 
     */
    @Export(name="vendorConfiguration", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> vendorConfiguration;

    /**
     * @return An object that has fields relevant to the vendor of the
     * cluster device. See Cluster Details - Nodes - Vendor Configuration
     * below for more details.
     * 
     */
    public Output<Map<String,String>> vendorConfiguration() {
        return this.vendorConfiguration;
    }
    /**
     * Device software software version.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Device software software version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * device interface id picked for WAN
     * 
     */
    @Export(name="wanInterfaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> wanInterfaceId;

    /**
     * @return device interface id picked for WAN
     * 
     */
    public Output<Optional<String>> wanInterfaceId() {
        return Codegen.optional(this.wanInterfaceId);
    }
    /**
     * Device location zone code.
     * 
     */
    @Export(name="zoneCode", refs={String.class}, tree="[0]")
    private Output<String> zoneCode;

    /**
     * @return Device location zone code.
     * 
     */
    public Output<String> zoneCode() {
        return this.zoneCode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Device(String name) {
        this(name, DeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Device(String name, DeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/device:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Device(String name, Output<String> id, @Nullable DeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/device:Device", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Device get(String name, Output<String> id, @Nullable DeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, state, options);
    }
}
