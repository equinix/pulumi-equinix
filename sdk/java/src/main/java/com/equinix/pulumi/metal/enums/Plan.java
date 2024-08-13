// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * See https://deploy.equinix.com/developers/api/metal/#tag/Plans/operation/findPlans
     * 
     */
    @EnumType
    public enum Plan {
        A3LargeX86("a3.large.x86"),
        C2LargeARM("c2.large.arm"),
        C2MediumX86("c2.medium.x86"),
        C3LargeARM("c3.large.arm64"),
        C3MediumX86("c3.medium.x86"),
        C3SmallX86("c3.small.x86"),
        F3LargeX86("f3.large.x86"),
        F3MediumX86("f3.medium.x86"),
        G2LargeX86("g2.large.x86"),
        M2XLargeX86("m2.xlarge.x86"),
        M3LargeX86("m3.large.x86"),
        M3SmallX86("m3.small.x86"),
        N2XLargeX86("n2.xlarge.x86"),
        N3XLargeX86("n3.xlarge.x86"),
        S3XLargeX86("s3.xlarge.x86"),
        T3SmallX86("t3.small.x86"),
        X2XLargeX86("x2.xlarge.x86"),
        X3XLargeX86("x3.xlarge.x86");

        private final String value;

        Plan(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "Plan[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
