
package com.mphasis.api.model.createApiProxy;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "basepaths",
    "configurationVersion",
    "contextInfo",
    "createdAt",
    "createdBy",
    "displayName",
    "entityMetaDataAsProperties",
    "lastModifiedAt",
    "lastModifiedBy",
    "name",
    "policies",
    "proxies",
    "proxyEndpoints",
    "resourceFiles",
    "resources",
    "revision",
    "sharedFlows",
    "spec",
    "targetEndpoints",
    "targetServers",
    "targets",
    "type"
})
public class CreateApiProxyResponse {

    @JsonProperty("basepaths")
    private List<Object> basepaths = null;
    @JsonProperty("configurationVersion")
    private ConfigurationVersion configurationVersion;
    @JsonProperty("contextInfo")
    private String contextInfo;
    @JsonProperty("createdAt")
    private Long createdAt;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("entityMetaDataAsProperties")
    private EntityMetaDataAsProperties entityMetaDataAsProperties;
    @JsonProperty("lastModifiedAt")
    private Long lastModifiedAt;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("name")
    private String name;
    @JsonProperty("policies")
    private List<Object> policies = null;
    @JsonProperty("proxies")
    private List<Object> proxies = null;
    @JsonProperty("proxyEndpoints")
    private List<Object> proxyEndpoints = null;
    @JsonProperty("resourceFiles")
    private ResourceFiles resourceFiles;
    @JsonProperty("resources")
    private List<Object> resources = null;
    @JsonProperty("revision")
    private String revision;
    @JsonProperty("sharedFlows")
    private List<Object> sharedFlows = null;
    @JsonProperty("spec")
    private String spec;
    @JsonProperty("targetEndpoints")
    private List<Object> targetEndpoints = null;
    @JsonProperty("targetServers")
    private List<Object> targetServers = null;
    @JsonProperty("targets")
    private List<Object> targets = null;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("basepaths")
    public List<Object> getBasepaths() {
        return basepaths;
    }

    @JsonProperty("basepaths")
    public void setBasepaths(List<Object> basepaths) {
        this.basepaths = basepaths;
    }

    @JsonProperty("configurationVersion")
    public ConfigurationVersion getConfigurationVersion() {
        return configurationVersion;
    }

    @JsonProperty("configurationVersion")
    public void setConfigurationVersion(ConfigurationVersion configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    @JsonProperty("contextInfo")
    public String getContextInfo() {
        return contextInfo;
    }

    @JsonProperty("contextInfo")
    public void setContextInfo(String contextInfo) {
        this.contextInfo = contextInfo;
    }

    @JsonProperty("createdAt")
    public Long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("entityMetaDataAsProperties")
    public EntityMetaDataAsProperties getEntityMetaDataAsProperties() {
        return entityMetaDataAsProperties;
    }

    @JsonProperty("entityMetaDataAsProperties")
    public void setEntityMetaDataAsProperties(EntityMetaDataAsProperties entityMetaDataAsProperties) {
        this.entityMetaDataAsProperties = entityMetaDataAsProperties;
    }

    @JsonProperty("lastModifiedAt")
    public Long getLastModifiedAt() {
        return lastModifiedAt;
    }

    @JsonProperty("lastModifiedAt")
    public void setLastModifiedAt(Long lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @JsonProperty("lastModifiedBy")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("lastModifiedBy")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("policies")
    public List<Object> getPolicies() {
        return policies;
    }

    @JsonProperty("policies")
    public void setPolicies(List<Object> policies) {
        this.policies = policies;
    }

    @JsonProperty("proxies")
    public List<Object> getProxies() {
        return proxies;
    }

    @JsonProperty("proxies")
    public void setProxies(List<Object> proxies) {
        this.proxies = proxies;
    }

    @JsonProperty("proxyEndpoints")
    public List<Object> getProxyEndpoints() {
        return proxyEndpoints;
    }

    @JsonProperty("proxyEndpoints")
    public void setProxyEndpoints(List<Object> proxyEndpoints) {
        this.proxyEndpoints = proxyEndpoints;
    }

    @JsonProperty("resourceFiles")
    public ResourceFiles getResourceFiles() {
        return resourceFiles;
    }

    @JsonProperty("resourceFiles")
    public void setResourceFiles(ResourceFiles resourceFiles) {
        this.resourceFiles = resourceFiles;
    }

    @JsonProperty("resources")
    public List<Object> getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(List<Object> resources) {
        this.resources = resources;
    }

    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    @JsonProperty("sharedFlows")
    public List<Object> getSharedFlows() {
        return sharedFlows;
    }

    @JsonProperty("sharedFlows")
    public void setSharedFlows(List<Object> sharedFlows) {
        this.sharedFlows = sharedFlows;
    }

    @JsonProperty("spec")
    public String getSpec() {
        return spec;
    }

    @JsonProperty("spec")
    public void setSpec(String spec) {
        this.spec = spec;
    }

    @JsonProperty("targetEndpoints")
    public List<Object> getTargetEndpoints() {
        return targetEndpoints;
    }

    @JsonProperty("targetEndpoints")
    public void setTargetEndpoints(List<Object> targetEndpoints) {
        this.targetEndpoints = targetEndpoints;
    }

    @JsonProperty("targetServers")
    public List<Object> getTargetServers() {
        return targetServers;
    }

    @JsonProperty("targetServers")
    public void setTargetServers(List<Object> targetServers) {
        this.targetServers = targetServers;
    }

    @JsonProperty("targets")
    public List<Object> getTargets() {
        return targets;
    }

    @JsonProperty("targets")
    public void setTargets(List<Object> targets) {
        this.targets = targets;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
