
package com.mphasis.api.model.createApiProxy;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceFile"
})
public class ResourceFiles {

    @JsonProperty("resourceFile")
    private List<Object> resourceFile = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resourceFile")
    public List<Object> getResourceFile() {
        return resourceFile;
    }

    @JsonProperty("resourceFile")
    public void setResourceFile(List<Object> resourceFile) {
        this.resourceFile = resourceFile;
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
