
package com.mphasis.api.model.createApiProxy;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "majorVersion",
    "minorVersion"
})
public class ConfigurationVersion {

    @JsonProperty("majorVersion")
    private Integer majorVersion;
    @JsonProperty("minorVersion")
    private Integer minorVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("majorVersion")
    public Integer getMajorVersion() {
        return majorVersion;
    }

    @JsonProperty("majorVersion")
    public void setMajorVersion(Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    @JsonProperty("minorVersion")
    public Integer getMinorVersion() {
        return minorVersion;
    }

    @JsonProperty("minorVersion")
    public void setMinorVersion(Integer minorVersion) {
        this.minorVersion = minorVersion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
