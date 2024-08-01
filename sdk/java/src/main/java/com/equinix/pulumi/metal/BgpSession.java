// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.BgpSessionArgs;
import com.equinix.pulumi.metal.inputs.BgpSessionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage BGP sessions in Equinix Metal Host. Refer to [Equinix Metal BGP documentation](https://metal.equinix.com/developers/docs/networking/local-global-bgp/) for more details.
 * 
 * You need to have BGP config enabled in your project.
 * 
 * BGP session must be linked to a device running [BIRD](https://bird.network.cz) or other BGP routing daemon which will control route advertisements via the session to Equinix Metal&#39;s upstream routers.
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.ReservedIpBlock;
 * import com.pulumi.equinix.metal.ReservedIpBlockArgs;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import com.pulumi.equinix.metal.BgpSession;
 * import com.pulumi.equinix.metal.BgpSessionArgs;
 * import com.pulumi.null.Resource;
 * import com.pulumi.null.ResourceArgs;
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
 *         final var bgpPassword = "955dB0b81Ef";
 * 
 *         final var projectId = "<UUID_of_your_project>";
 * 
 *         var addr = new ReservedIpBlock("addr", ReservedIpBlockArgs.builder()
 *             .projectId(projectId)
 *             .metro("ny")
 *             .quantity(1)
 *             .build());
 * 
 *         final var interfaceLo0 = Output.tuple(addr.address(), addr.netmask()).applyValue(values -> {
 *             var address = values.t1;
 *             var netmask = values.t2;
 *             return """
 * auto lo:0
 * iface lo:0 inet static
 *    address %s
 *    netmask %s
 * ", address,netmask);
 *         });
 * 
 *         var test = new Device("test", DeviceArgs.builder()
 *             .hostname("terraform-test-bgp-sesh")
 *             .plan("c3.small.x86")
 *             .metro("ny")
 *             .operatingSystem("ubuntu_20_04")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .build());
 * 
 *         final var birdConf = Output.tuple(addr.address(), addr.cidr(), test.network(), test.network()).applyValue(values -> {
 *             var address = values.t1;
 *             var cidr = values.t2;
 *             var testNetwork = values.t3;
 *             var testNetwork1 = values.t4;
 *             return """
 * filter equinix_metal_bgp {
 *     if net = %s/%s then accept;
 * }
 * router id %s;
 * protocol direct {
 *     interface "lo";
 * }
 * protocol kernel {
 *     scan time 10;
 *     persist;
 *     import all;
 *     export all;
 * }
 * protocol device {
 *     scan time 10;
 * }
 * protocol bgp {
 *     export filter equinix_metal_bgp;
 *     local as 65000;
 *     neighbor %s as 65530;
 *     password "%s";
 * }
 * ", address,cidr,testNetwork[2].address(),testNetwork1[2].gateway(),bgpPassword);
 *         });
 * 
 *         var testBgpSession = new BgpSession("testBgpSession", BgpSessionArgs.builder()
 *             .deviceId(test.id())
 *             .addressFamily("ipv4")
 *             .build());
 * 
 *         var configureBird = new Resource("configureBird", ResourceArgs.builder()
 *             .triggers(Map.ofEntries(
 *                 Map.entry("bird_conf", birdConf),
 *                 Map.entry("interface", interfaceLo0)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:metal/bgpSession:BgpSession")
public class BgpSession extends com.pulumi.resources.CustomResource {
    /**
     * `ipv4` or `ipv6`.
     * 
     */
    @Export(name="addressFamily", refs={String.class}, tree="[0]")
    private Output<String> addressFamily;

    /**
     * @return `ipv4` or `ipv6`.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * Boolean flag to set the default route policy. False by default.
     * 
     */
    @Export(name="defaultRoute", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultRoute;

    /**
     * @return Boolean flag to set the default route policy. False by default.
     * 
     */
    public Output<Optional<Boolean>> defaultRoute() {
        return Codegen.optional(this.defaultRoute);
    }
    /**
     * ID of device.
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return ID of device.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * Status of the session - `up` or `down`
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the session - `up` or `down`
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BgpSession(String name) {
        this(name, BgpSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BgpSession(String name, BgpSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BgpSession(String name, BgpSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/bgpSession:BgpSession", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private BgpSession(String name, Output<String> id, @Nullable BgpSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/bgpSession:BgpSession", name, state, makeResourceOptions(options, id));
    }

    private static BgpSessionArgs makeArgs(BgpSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BgpSessionArgs.Empty : args;
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
    public static BgpSession get(String name, Output<String> id, @Nullable BgpSessionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BgpSession(name, id, state, options);
    }
}
