/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ARM resource for a static site when patching.
 */
@JsonFlatten
public class StaticSitePatchResource extends ProxyOnlyResource {
    /**
     * The default autogenerated hostname for the static site.
     */
    @JsonProperty(value = "properties.defaultHostname", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostname;

    /**
     * URL for the repository of the static site.
     */
    @JsonProperty(value = "properties.repositoryUrl")
    private String repositoryUrl;

    /**
     * The target branch in the repository.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /**
     * The custom domains associated with this static site.
     */
    @JsonProperty(value = "properties.customDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> customDomains;

    /**
     * A user's github repository token. This is used to setup the Github
     * Actions workflow file and API secrets.
     */
    @JsonProperty(value = "properties.repositoryToken")
    private String repositoryToken;

    /**
     * Build properties to configure on the repository.
     */
    @JsonProperty(value = "properties.buildProperties")
    private StaticSiteBuildProperties buildProperties;

    /**
     * Get the default autogenerated hostname for the static site.
     *
     * @return the defaultHostname value
     */
    public String defaultHostname() {
        return this.defaultHostname;
    }

    /**
     * Get uRL for the repository of the static site.
     *
     * @return the repositoryUrl value
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set uRL for the repository of the static site.
     *
     * @param repositoryUrl the repositoryUrl value to set
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the target branch in the repository.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the target branch in the repository.
     *
     * @param branch the branch value to set
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the custom domains associated with this static site.
     *
     * @return the customDomains value
     */
    public List<String> customDomains() {
        return this.customDomains;
    }

    /**
     * Get a user's github repository token. This is used to setup the Github Actions workflow file and API secrets.
     *
     * @return the repositoryToken value
     */
    public String repositoryToken() {
        return this.repositoryToken;
    }

    /**
     * Set a user's github repository token. This is used to setup the Github Actions workflow file and API secrets.
     *
     * @param repositoryToken the repositoryToken value to set
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryToken(String repositoryToken) {
        this.repositoryToken = repositoryToken;
        return this;
    }

    /**
     * Get build properties to configure on the repository.
     *
     * @return the buildProperties value
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.buildProperties;
    }

    /**
     * Set build properties to configure on the repository.
     *
     * @param buildProperties the buildProperties value to set
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBuildProperties(StaticSiteBuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        return this;
    }

}
