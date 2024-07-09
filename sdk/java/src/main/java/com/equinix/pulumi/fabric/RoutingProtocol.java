// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.fabric.RoutingProtocolArgs;
import com.equinix.pulumi.fabric.inputs.RoutingProtocolState;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolBfd;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolBgpIpv4;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolBgpIpv6;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolChange;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolChangeLog;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolDirectIpv4;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolDirectIpv6;
import com.equinix.pulumi.fabric.outputs.RoutingProtocolOperation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric connection
 * 
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.fabric.RoutingProtocol;
 * import com.pulumi.equinix.fabric.RoutingProtocolArgs;
 * import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
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
 *         final var config = ctx.config();
 *         final var connectionId = config.get("connectionId");
 *         var routingProtocol = new RoutingProtocol("routingProtocol", RoutingProtocolArgs.builder()        
 *             .connectionUuid(connectionId)
 *             .name("My-Direct-route-1")
 *             .type("DIRECT")
 *             .directIpv4(RoutingProtocolDirectIpv4Args.builder()
 *                 .equinixIfaceIp("192.168.100.1/30")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("routingProtocolId", routingProtocol.id());
 *         ctx.export("routingProtocolState", routingProtocol.state());
 *         ctx.export("routingProtocolEquinixAsn", routingProtocol.equinixAsn());
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:fabric/routingProtocol:RoutingProtocol")
public class RoutingProtocol extends com.pulumi.resources.CustomResource {
    /**
     * Bidirectional Forwarding Detection
     * 
     */
    @Export(name="bfd", refs={RoutingProtocolBfd.class}, tree="[0]")
    private Output<RoutingProtocolBfd> bfd;

    /**
     * @return Bidirectional Forwarding Detection
     * 
     */
    public Output<RoutingProtocolBfd> bfd() {
        return this.bfd;
    }
    /**
     * BGP authorization key
     * 
     */
    @Export(name="bgpAuthKey", refs={String.class}, tree="[0]")
    private Output<String> bgpAuthKey;

    /**
     * @return BGP authorization key
     * 
     */
    public Output<String> bgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * Routing Protocol BGP IPv4
     * 
     */
    @Export(name="bgpIpv4", refs={RoutingProtocolBgpIpv4.class}, tree="[0]")
    private Output<RoutingProtocolBgpIpv4> bgpIpv4;

    /**
     * @return Routing Protocol BGP IPv4
     * 
     */
    public Output<RoutingProtocolBgpIpv4> bgpIpv4() {
        return this.bgpIpv4;
    }
    /**
     * Routing Protocol BGP IPv6
     * 
     */
    @Export(name="bgpIpv6", refs={RoutingProtocolBgpIpv6.class}, tree="[0]")
    private Output<RoutingProtocolBgpIpv6> bgpIpv6;

    /**
     * @return Routing Protocol BGP IPv6
     * 
     */
    public Output<RoutingProtocolBgpIpv6> bgpIpv6() {
        return this.bgpIpv6;
    }
    /**
     * Captures Routing Protocol lifecycle change information
     * 
     */
    @Export(name="changeLogs", refs={List.class,RoutingProtocolChangeLog.class}, tree="[0,1]")
    private Output<List<RoutingProtocolChangeLog>> changeLogs;

    /**
     * @return Captures Routing Protocol lifecycle change information
     * 
     */
    public Output<List<RoutingProtocolChangeLog>> changeLogs() {
        return this.changeLogs;
    }
    /**
     * Routing Protocol configuration Changes
     * 
     */
    @Export(name="changes", refs={List.class,RoutingProtocolChange.class}, tree="[0,1]")
    private Output<List<RoutingProtocolChange>> changes;

    /**
     * @return Routing Protocol configuration Changes
     * 
     */
    public Output<List<RoutingProtocolChange>> changes() {
        return this.changes;
    }
    /**
     * Connection URI associated with Routing Protocol
     * 
     */
    @Export(name="connectionUuid", refs={String.class}, tree="[0]")
    private Output<String> connectionUuid;

    /**
     * @return Connection URI associated with Routing Protocol
     * 
     */
    public Output<String> connectionUuid() {
        return this.connectionUuid;
    }
    /**
     * Customer-provided ASN
     * 
     */
    @Export(name="customerAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> customerAsn;

    /**
     * @return Customer-provided ASN
     * 
     */
    public Output<Integer> customerAsn() {
        return this.customerAsn;
    }
    /**
     * Customer-provided Fabric Routing Protocol description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Customer-provided Fabric Routing Protocol description
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Routing Protocol Direct IPv4
     * 
     */
    @Export(name="directIpv4", refs={RoutingProtocolDirectIpv4.class}, tree="[0]")
    private Output<RoutingProtocolDirectIpv4> directIpv4;

    /**
     * @return Routing Protocol Direct IPv4
     * 
     */
    public Output<RoutingProtocolDirectIpv4> directIpv4() {
        return this.directIpv4;
    }
    /**
     * Routing Protocol Direct IPv6
     * 
     */
    @Export(name="directIpv6", refs={RoutingProtocolDirectIpv6.class}, tree="[0]")
    private Output<RoutingProtocolDirectIpv6> directIpv6;

    /**
     * @return Routing Protocol Direct IPv6
     * 
     */
    public Output<RoutingProtocolDirectIpv6> directIpv6() {
        return this.directIpv6;
    }
    /**
     * Equinix ASN
     * 
     */
    @Export(name="equinixAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> equinixAsn;

    /**
     * @return Equinix ASN
     * 
     */
    public Output<Integer> equinixAsn() {
        return this.equinixAsn;
    }
    /**
     * Routing Protocol URI information
     * 
     */
    @Export(name="href", refs={String.class}, tree="[0]")
    private Output<String> href;

    /**
     * @return Routing Protocol URI information
     * 
     */
    public Output<String> href() {
        return this.href;
    }
    /**
     * Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Routing Protocol type-specific operational data
     * 
     */
    @Export(name="operations", refs={List.class,RoutingProtocolOperation.class}, tree="[0,1]")
    private Output<List<RoutingProtocolOperation>> operations;

    /**
     * @return Routing Protocol type-specific operational data
     * 
     */
    public Output<List<RoutingProtocolOperation>> operations() {
        return this.operations;
    }
    /**
     * Routing Protocol overall state
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Routing Protocol overall state
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Defines the routing protocol type like BGP or DIRECT
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Defines the routing protocol type like BGP or DIRECT
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Equinix-assigned routing protocol identifier
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return Equinix-assigned routing protocol identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoutingProtocol(String name) {
        this(name, RoutingProtocolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoutingProtocol(String name, RoutingProtocolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoutingProtocol(String name, RoutingProtocolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/routingProtocol:RoutingProtocol", name, args == null ? RoutingProtocolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoutingProtocol(String name, Output<String> id, @Nullable RoutingProtocolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:fabric/routingProtocol:RoutingProtocol", name, state, makeResourceOptions(options, id));
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
    public static RoutingProtocol get(String name, Output<String> id, @Nullable RoutingProtocolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoutingProtocol(name, id, state, options);
    }
}
