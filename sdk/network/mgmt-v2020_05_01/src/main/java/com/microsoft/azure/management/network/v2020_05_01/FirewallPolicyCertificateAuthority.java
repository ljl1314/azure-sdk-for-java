/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Trusted Root certificates properties for tls.
 */
@JsonFlatten
public class FirewallPolicyCertificateAuthority {
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     */
    @JsonProperty(value = "properties.keyVaultSecretId")
    private String keyVaultSecretId;

    /**
     * Name of the CA certificate.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     *
     * @return the keyVaultSecretId value
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set
     * @return the FirewallPolicyCertificateAuthority object itself.
     */
    public FirewallPolicyCertificateAuthority withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get name of the CA certificate.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the CA certificate.
     *
     * @param name the name value to set
     * @return the FirewallPolicyCertificateAuthority object itself.
     */
    public FirewallPolicyCertificateAuthority withName(String name) {
        this.name = name;
        return this;
    }

}
