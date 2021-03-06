// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.models.LanguageExtensionInner;
import com.azure.resourcemanager.kusto.models.LanguageExtension;
import com.azure.resourcemanager.kusto.models.LanguageExtensionName;

public final class LanguageExtensionImpl implements LanguageExtension {
    private LanguageExtensionInner innerObject;

    private final KustoManager serviceManager;

    LanguageExtensionImpl(LanguageExtensionInner innerObject, KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LanguageExtensionName languageExtensionName() {
        return this.innerModel().languageExtensionName();
    }

    public LanguageExtensionInner innerModel() {
        return this.innerObject;
    }

    private KustoManager manager() {
        return this.serviceManager;
    }
}
