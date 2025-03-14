// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.equinix.pulumi.fabric.inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class ServiceTokenServiceTokenConnectionASideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTokenServiceTokenConnectionASideArgs Empty = new ServiceTokenServiceTokenConnectionASideArgs();

    /**
     * List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    @Import(name="accessPointSelectors", required=true)
    private Output<List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs>> accessPointSelectors;

    /**
     * @return List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
     * 
     */
    public Output<List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs>> accessPointSelectors() {
        return this.accessPointSelectors;
    }

    private ServiceTokenServiceTokenConnectionASideArgs() {}

    private ServiceTokenServiceTokenConnectionASideArgs(ServiceTokenServiceTokenConnectionASideArgs $) {
        this.accessPointSelectors = $.accessPointSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTokenServiceTokenConnectionASideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTokenServiceTokenConnectionASideArgs $;

        public Builder() {
            $ = new ServiceTokenServiceTokenConnectionASideArgs();
        }

        public Builder(ServiceTokenServiceTokenConnectionASideArgs defaults) {
            $ = new ServiceTokenServiceTokenConnectionASideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointSelectors List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
         * 
         * @return builder
         * 
         */
        public Builder accessPointSelectors(Output<List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs>> accessPointSelectors) {
            $.accessPointSelectors = accessPointSelectors;
            return this;
        }

        /**
         * @param accessPointSelectors List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
         * 
         * @return builder
         * 
         */
        public Builder accessPointSelectors(List<ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs> accessPointSelectors) {
            return accessPointSelectors(Output.of(accessPointSelectors));
        }

        /**
         * @param accessPointSelectors List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability
         * 
         * @return builder
         * 
         */
        public Builder accessPointSelectors(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs... accessPointSelectors) {
            return accessPointSelectors(List.of(accessPointSelectors));
        }

        public ServiceTokenServiceTokenConnectionASideArgs build() {
            if ($.accessPointSelectors == null) {
                throw new MissingRequiredPropertyException("ServiceTokenServiceTokenConnectionASideArgs", "accessPointSelectors");
            }
            return $;
        }
    }

}
