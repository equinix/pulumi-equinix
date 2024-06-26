// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectBgpConfig {
    /**
     * @return Autonomous System Number for local BGP deployment.
     * 
     */
    private Integer asn;
    /**
     * @return One of `private`, `public`.
     * 
     */
    private String deploymentType;
    /**
     * @return The maximum number of route filters allowed per server.
     * 
     */
    private Integer maxPrefix;
    /**
     * @return Password for BGP session in plaintext (not a checksum).
     * 
     */
    private String md5;
    /**
     * @return Status of BGP configuration in the project.
     * 
     */
    private String status;

    private GetProjectBgpConfig() {}
    /**
     * @return Autonomous System Number for local BGP deployment.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return One of `private`, `public`.
     * 
     */
    public String deploymentType() {
        return this.deploymentType;
    }
    /**
     * @return The maximum number of route filters allowed per server.
     * 
     */
    public Integer maxPrefix() {
        return this.maxPrefix;
    }
    /**
     * @return Password for BGP session in plaintext (not a checksum).
     * 
     */
    public String md5() {
        return this.md5;
    }
    /**
     * @return Status of BGP configuration in the project.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectBgpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer asn;
        private String deploymentType;
        private Integer maxPrefix;
        private String md5;
        private String status;
        public Builder() {}
        public Builder(GetProjectBgpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.deploymentType = defaults.deploymentType;
    	      this.maxPrefix = defaults.maxPrefix;
    	      this.md5 = defaults.md5;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }
        @CustomType.Setter
        public Builder maxPrefix(Integer maxPrefix) {
            this.maxPrefix = Objects.requireNonNull(maxPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder md5(String md5) {
            this.md5 = Objects.requireNonNull(md5);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetProjectBgpConfig build() {
            final var _resultValue = new GetProjectBgpConfig();
            _resultValue.asn = asn;
            _resultValue.deploymentType = deploymentType;
            _resultValue.maxPrefix = maxPrefix;
            _resultValue.md5 = md5;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
