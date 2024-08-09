// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum NetworkType {
        Layer3("layer3"),
        Layer2Individual("layer2-individual"),
        Layer2Bonded("layer2-bonded"),
        Hybrid("hybrid");

        private final String value;

        NetworkType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "NetworkType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
