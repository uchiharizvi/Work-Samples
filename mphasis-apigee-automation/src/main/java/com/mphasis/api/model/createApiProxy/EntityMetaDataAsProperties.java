
package com.mphasis.api.model.createApiProxy;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bundle_type",
    "lastModifiedBy",
    "createdBy",
    "lastModifiedAt",
    "subType",
    "createdAt"
})
public class EntityMetaDataAsProperties {

    @JsonProperty("bundle_type")
    private String bundleType;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lastModifiedAt")
    private String lastModifiedAt;
    @JsonProperty("subType")
    private String subType;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bundle_type")
    public String getBundleType() {
        return bundleType;
    }

    @JsonProperty("bundle_type")
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    @JsonProperty("lastModifiedBy")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("lastModifiedBy")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("lastModifiedAt")
    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    @JsonProperty("lastModifiedAt")
    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @JsonProperty("subType")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("subType")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
