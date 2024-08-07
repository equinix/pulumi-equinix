// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceProfilePortLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilePort {
    /**
     * @return Cross Connect Id
     * 
     */
    private @Nullable String crossConnectId;
    /**
     * @return Colo/Port Location
     * 
     */
    private @Nullable GetServiceProfilePortLocation location;
    /**
     * @return Seller Region
     * 
     */
    private @Nullable String sellerRegion;
    /**
     * @return Seller Region details
     * 
     */
    private @Nullable String sellerRegionDescription;
    /**
     * @return Colo/Port Type
     * 
     */
    private String type;
    /**
     * @return Colo/Port Uuid
     * 
     */
    private String uuid;

    private GetServiceProfilePort() {}
    /**
     * @return Cross Connect Id
     * 
     */
    public Optional<String> crossConnectId() {
        return Optional.ofNullable(this.crossConnectId);
    }
    /**
     * @return Colo/Port Location
     * 
     */
    public Optional<GetServiceProfilePortLocation> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Seller Region
     * 
     */
    public Optional<String> sellerRegion() {
        return Optional.ofNullable(this.sellerRegion);
    }
    /**
     * @return Seller Region details
     * 
     */
    public Optional<String> sellerRegionDescription() {
        return Optional.ofNullable(this.sellerRegionDescription);
    }
    /**
     * @return Colo/Port Type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Colo/Port Uuid
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilePort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String crossConnectId;
        private @Nullable GetServiceProfilePortLocation location;
        private @Nullable String sellerRegion;
        private @Nullable String sellerRegionDescription;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceProfilePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossConnectId = defaults.crossConnectId;
    	      this.location = defaults.location;
    	      this.sellerRegion = defaults.sellerRegion;
    	      this.sellerRegionDescription = defaults.sellerRegionDescription;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder crossConnectId(@Nullable String crossConnectId) {

            this.crossConnectId = crossConnectId;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable GetServiceProfilePortLocation location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder sellerRegion(@Nullable String sellerRegion) {

            this.sellerRegion = sellerRegion;
            return this;
        }
        @CustomType.Setter
        public Builder sellerRegionDescription(@Nullable String sellerRegionDescription) {

            this.sellerRegionDescription = sellerRegionDescription;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilePort", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilePort", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceProfilePort build() {
            final var _resultValue = new GetServiceProfilePort();
            _resultValue.crossConnectId = crossConnectId;
            _resultValue.location = location;
            _resultValue.sellerRegion = sellerRegion;
            _resultValue.sellerRegionDescription = sellerRegionDescription;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
