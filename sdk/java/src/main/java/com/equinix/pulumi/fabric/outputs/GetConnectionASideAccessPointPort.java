// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionASideAccessPointPortRedundancy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointPort {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Port name
     * 
     */
    private String name;
    /**
     * @return Redundancy Information
     * 
     */
    private List<GetConnectionASideAccessPointPortRedundancy> redundancies;
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    private String uuid;

    private GetConnectionASideAccessPointPort() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Port name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Redundancy Information
     * 
     */
    public List<GetConnectionASideAccessPointPortRedundancy> redundancies() {
        return this.redundancies;
    }
    /**
     * @return Equinix-assigned Port identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String name;
        private List<GetConnectionASideAccessPointPortRedundancy> redundancies;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.redundancies = defaults.redundancies;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointPort", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointPort", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder redundancies(List<GetConnectionASideAccessPointPortRedundancy> redundancies) {
            if (redundancies == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointPort", "redundancies");
            }
            this.redundancies = redundancies;
            return this;
        }
        public Builder redundancies(GetConnectionASideAccessPointPortRedundancy... redundancies) {
            return redundancies(List.of(redundancies));
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointPort", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionASideAccessPointPort build() {
            final var _resultValue = new GetConnectionASideAccessPointPort();
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.redundancies = redundancies;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
