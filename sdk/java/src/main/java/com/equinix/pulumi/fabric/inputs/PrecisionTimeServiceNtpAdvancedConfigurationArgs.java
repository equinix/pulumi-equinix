// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrecisionTimeServiceNtpAdvancedConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrecisionTimeServiceNtpAdvancedConfigurationArgs Empty = new PrecisionTimeServiceNtpAdvancedConfigurationArgs();

    /**
     * The plaintext authentication key. For ASCII type, the key\
     * \ must contain printable ASCII characters, range 10-20 characters. For\
     * \ HEX type, range should be 10-40 characters
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The plaintext authentication key. For ASCII type, the key\
     * \ must contain printable ASCII characters, range 10-20 characters. For\
     * \ HEX type, range should be 10-40 characters
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The authentication Key ID
     * 
     */
    @Import(name="keyNumber")
    private @Nullable Output<Integer> keyNumber;

    /**
     * @return The authentication Key ID
     * 
     */
    public Optional<Output<Integer>> keyNumber() {
        return Optional.ofNullable(this.keyNumber);
    }

    /**
     * md5 Authentication type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return md5 Authentication type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PrecisionTimeServiceNtpAdvancedConfigurationArgs() {}

    private PrecisionTimeServiceNtpAdvancedConfigurationArgs(PrecisionTimeServiceNtpAdvancedConfigurationArgs $) {
        this.key = $.key;
        this.keyNumber = $.keyNumber;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrecisionTimeServiceNtpAdvancedConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrecisionTimeServiceNtpAdvancedConfigurationArgs $;

        public Builder() {
            $ = new PrecisionTimeServiceNtpAdvancedConfigurationArgs();
        }

        public Builder(PrecisionTimeServiceNtpAdvancedConfigurationArgs defaults) {
            $ = new PrecisionTimeServiceNtpAdvancedConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The plaintext authentication key. For ASCII type, the key\
         * \ must contain printable ASCII characters, range 10-20 characters. For\
         * \ HEX type, range should be 10-40 characters
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The plaintext authentication key. For ASCII type, the key\
         * \ must contain printable ASCII characters, range 10-20 characters. For\
         * \ HEX type, range should be 10-40 characters
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param keyNumber The authentication Key ID
         * 
         * @return builder
         * 
         */
        public Builder keyNumber(@Nullable Output<Integer> keyNumber) {
            $.keyNumber = keyNumber;
            return this;
        }

        /**
         * @param keyNumber The authentication Key ID
         * 
         * @return builder
         * 
         */
        public Builder keyNumber(Integer keyNumber) {
            return keyNumber(Output.of(keyNumber));
        }

        /**
         * @param type md5 Authentication type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type md5 Authentication type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PrecisionTimeServiceNtpAdvancedConfigurationArgs build() {
            return $;
        }
    }

}
