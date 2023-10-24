// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge;

import com.equinix.pulumi.networkedge.inputs.AclTemplateInboundRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclTemplateArgs Empty = new AclTemplateArgs();

    /**
     * Inbound rule description, up to 200 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Inbound rule description, up to 200 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    @Import(name="inboundRules", required=true)
    private Output<List<AclTemplateInboundRuleArgs>> inboundRules;

    /**
     * @return One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    public Output<List<AclTemplateInboundRuleArgs>> inboundRules() {
        return this.inboundRules;
    }

    /**
     * ACL template location metro code.
     * 
     * @deprecated
     * Metro Code is no longer required
     * 
     */
    @Deprecated /* Metro Code is no longer required */
    @Import(name="metroCode")
    private @Nullable Output<String> metroCode;

    /**
     * @return ACL template location metro code.
     * 
     * @deprecated
     * Metro Code is no longer required
     * 
     */
    @Deprecated /* Metro Code is no longer required */
    public Optional<Output<String>> metroCode() {
        return Optional.ofNullable(this.metroCode);
    }

    /**
     * ACL template name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return ACL template name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AclTemplateArgs() {}

    private AclTemplateArgs(AclTemplateArgs $) {
        this.description = $.description;
        this.inboundRules = $.inboundRules;
        this.metroCode = $.metroCode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclTemplateArgs $;

        public Builder() {
            $ = new AclTemplateArgs();
        }

        public Builder(AclTemplateArgs defaults) {
            $ = new AclTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Inbound rule description, up to 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Inbound rule description, up to 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(Output<List<AclTemplateInboundRuleArgs>> inboundRules) {
            $.inboundRules = inboundRules;
            return this;
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(List<AclTemplateInboundRuleArgs> inboundRules) {
            return inboundRules(Output.of(inboundRules));
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(AclTemplateInboundRuleArgs... inboundRules) {
            return inboundRules(List.of(inboundRules));
        }

        /**
         * @param metroCode ACL template location metro code.
         * 
         * @return builder
         * 
         * @deprecated
         * Metro Code is no longer required
         * 
         */
        @Deprecated /* Metro Code is no longer required */
        public Builder metroCode(@Nullable Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param metroCode ACL template location metro code.
         * 
         * @return builder
         * 
         * @deprecated
         * Metro Code is no longer required
         * 
         */
        @Deprecated /* Metro Code is no longer required */
        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        /**
         * @param name ACL template name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name ACL template name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AclTemplateArgs build() {
            $.inboundRules = Objects.requireNonNull($.inboundRules, "expected parameter 'inboundRules' to be non-null");
            return $;
        }
    }

}
