// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DnsConfiguration model. */
@Fluent
public final class DnsConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsConfiguration.class);

    /*
     * The DNS servers for the container group.
     */
    @JsonProperty(value = "nameServers", required = true)
    private List<String> nameServers;

    /*
     * The DNS search domains for hostname lookup in the container group.
     */
    @JsonProperty(value = "searchDomains")
    private String searchDomains;

    /*
     * The DNS options for the container group.
     */
    @JsonProperty(value = "options")
    private String options;

    /**
     * Get the nameServers property: The DNS servers for the container group.
     *
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Set the nameServers property: The DNS servers for the container group.
     *
     * @param nameServers the nameServers value to set.
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withNameServers(List<String> nameServers) {
        this.nameServers = nameServers;
        return this;
    }

    /**
     * Get the searchDomains property: The DNS search domains for hostname lookup in the container group.
     *
     * @return the searchDomains value.
     */
    public String searchDomains() {
        return this.searchDomains;
    }

    /**
     * Set the searchDomains property: The DNS search domains for hostname lookup in the container group.
     *
     * @param searchDomains the searchDomains value to set.
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withSearchDomains(String searchDomains) {
        this.searchDomains = searchDomains;
        return this;
    }

    /**
     * Get the options property: The DNS options for the container group.
     *
     * @return the options value.
     */
    public String options() {
        return this.options;
    }

    /**
     * Set the options property: The DNS options for the container group.
     *
     * @param options the options value to set.
     * @return the DnsConfiguration object itself.
     */
    public DnsConfiguration withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nameServers() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property nameServers in model DnsConfiguration"));
        }
    }
}