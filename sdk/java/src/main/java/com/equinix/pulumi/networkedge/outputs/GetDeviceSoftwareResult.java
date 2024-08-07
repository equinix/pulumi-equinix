// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeviceSoftwareResult {
    /**
     * @return Version release date.
     * 
     */
    private String date;
    private String deviceType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Software image name.
     * 
     */
    private String imageName;
    private @Nullable Boolean mostRecent;
    private List<String> packages;
    /**
     * @return Link to version release notes.
     * 
     */
    private String releaseNotesLink;
    private Boolean stable;
    /**
     * @return Version status.
     * 
     */
    private String status;
    /**
     * @return Version number.
     * 
     */
    private String version;
    private @Nullable String versionRegex;

    private GetDeviceSoftwareResult() {}
    /**
     * @return Version release date.
     * 
     */
    public String date() {
        return this.date;
    }
    public String deviceType() {
        return this.deviceType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Software image name.
     * 
     */
    public String imageName() {
        return this.imageName;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    public List<String> packages() {
        return this.packages;
    }
    /**
     * @return Link to version release notes.
     * 
     */
    public String releaseNotesLink() {
        return this.releaseNotesLink;
    }
    public Boolean stable() {
        return this.stable;
    }
    /**
     * @return Version status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Version number.
     * 
     */
    public String version() {
        return this.version;
    }
    public Optional<String> versionRegex() {
        return Optional.ofNullable(this.versionRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceSoftwareResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String date;
        private String deviceType;
        private String id;
        private String imageName;
        private @Nullable Boolean mostRecent;
        private List<String> packages;
        private String releaseNotesLink;
        private Boolean stable;
        private String status;
        private String version;
        private @Nullable String versionRegex;
        public Builder() {}
        public Builder(GetDeviceSoftwareResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.deviceType = defaults.deviceType;
    	      this.id = defaults.id;
    	      this.imageName = defaults.imageName;
    	      this.mostRecent = defaults.mostRecent;
    	      this.packages = defaults.packages;
    	      this.releaseNotesLink = defaults.releaseNotesLink;
    	      this.stable = defaults.stable;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
    	      this.versionRegex = defaults.versionRegex;
        }

        @CustomType.Setter
        public Builder date(String date) {
            if (date == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "date");
            }
            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder deviceType(String deviceType) {
            if (deviceType == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "deviceType");
            }
            this.deviceType = deviceType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(String imageName) {
            if (imageName == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "imageName");
            }
            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder mostRecent(@Nullable Boolean mostRecent) {

            this.mostRecent = mostRecent;
            return this;
        }
        @CustomType.Setter
        public Builder packages(List<String> packages) {
            if (packages == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "packages");
            }
            this.packages = packages;
            return this;
        }
        public Builder packages(String... packages) {
            return packages(List.of(packages));
        }
        @CustomType.Setter
        public Builder releaseNotesLink(String releaseNotesLink) {
            if (releaseNotesLink == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "releaseNotesLink");
            }
            this.releaseNotesLink = releaseNotesLink;
            return this;
        }
        @CustomType.Setter
        public Builder stable(Boolean stable) {
            if (stable == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "stable");
            }
            this.stable = stable;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDeviceSoftwareResult", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder versionRegex(@Nullable String versionRegex) {

            this.versionRegex = versionRegex;
            return this;
        }
        public GetDeviceSoftwareResult build() {
            final var _resultValue = new GetDeviceSoftwareResult();
            _resultValue.date = date;
            _resultValue.deviceType = deviceType;
            _resultValue.id = id;
            _resultValue.imageName = imageName;
            _resultValue.mostRecent = mostRecent;
            _resultValue.packages = packages;
            _resultValue.releaseNotesLink = releaseNotesLink;
            _resultValue.stable = stable;
            _resultValue.status = status;
            _resultValue.version = version;
            _resultValue.versionRegex = versionRegex;
            return _resultValue;
        }
    }
}
