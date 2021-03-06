/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ApplicationInsightsManagementClientImpl class.
 */
public class ApplicationInsightsManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The Azure subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Azure subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ApplicationInsightsManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ApplicationInsightsManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ApplicationInsightsManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ApplicationInsightsManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The AnnotationsInner object to access its operations.
     */
    private AnnotationsInner annotations;

    /**
     * Gets the AnnotationsInner object to access its operations.
     * @return the AnnotationsInner object.
     */
    public AnnotationsInner annotations() {
        return this.annotations;
    }

    /**
     * The APIKeysInner object to access its operations.
     */
    private APIKeysInner aPIKeys;

    /**
     * Gets the APIKeysInner object to access its operations.
     * @return the APIKeysInner object.
     */
    public APIKeysInner aPIKeys() {
        return this.aPIKeys;
    }

    /**
     * The ExportConfigurationsInner object to access its operations.
     */
    private ExportConfigurationsInner exportConfigurations;

    /**
     * Gets the ExportConfigurationsInner object to access its operations.
     * @return the ExportConfigurationsInner object.
     */
    public ExportConfigurationsInner exportConfigurations() {
        return this.exportConfigurations;
    }

    /**
     * The ComponentCurrentBillingFeaturesInner object to access its operations.
     */
    private ComponentCurrentBillingFeaturesInner componentCurrentBillingFeatures;

    /**
     * Gets the ComponentCurrentBillingFeaturesInner object to access its operations.
     * @return the ComponentCurrentBillingFeaturesInner object.
     */
    public ComponentCurrentBillingFeaturesInner componentCurrentBillingFeatures() {
        return this.componentCurrentBillingFeatures;
    }

    /**
     * The ComponentQuotaStatusInner object to access its operations.
     */
    private ComponentQuotaStatusInner componentQuotaStatus;

    /**
     * Gets the ComponentQuotaStatusInner object to access its operations.
     * @return the ComponentQuotaStatusInner object.
     */
    public ComponentQuotaStatusInner componentQuotaStatus() {
        return this.componentQuotaStatus;
    }

    /**
     * The ComponentFeatureCapabilitiesInner object to access its operations.
     */
    private ComponentFeatureCapabilitiesInner componentFeatureCapabilities;

    /**
     * Gets the ComponentFeatureCapabilitiesInner object to access its operations.
     * @return the ComponentFeatureCapabilitiesInner object.
     */
    public ComponentFeatureCapabilitiesInner componentFeatureCapabilities() {
        return this.componentFeatureCapabilities;
    }

    /**
     * The ComponentAvailableFeaturesInner object to access its operations.
     */
    private ComponentAvailableFeaturesInner componentAvailableFeatures;

    /**
     * Gets the ComponentAvailableFeaturesInner object to access its operations.
     * @return the ComponentAvailableFeaturesInner object.
     */
    public ComponentAvailableFeaturesInner componentAvailableFeatures() {
        return this.componentAvailableFeatures;
    }

    /**
     * The ProactiveDetectionConfigurationsInner object to access its operations.
     */
    private ProactiveDetectionConfigurationsInner proactiveDetectionConfigurations;

    /**
     * Gets the ProactiveDetectionConfigurationsInner object to access its operations.
     * @return the ProactiveDetectionConfigurationsInner object.
     */
    public ProactiveDetectionConfigurationsInner proactiveDetectionConfigurations() {
        return this.proactiveDetectionConfigurations;
    }

    /**
     * The ComponentsInner object to access its operations.
     */
    private ComponentsInner components;

    /**
     * Gets the ComponentsInner object to access its operations.
     * @return the ComponentsInner object.
     */
    public ComponentsInner components() {
        return this.components;
    }

    /**
     * The WorkItemConfigurationsInner object to access its operations.
     */
    private WorkItemConfigurationsInner workItemConfigurations;

    /**
     * Gets the WorkItemConfigurationsInner object to access its operations.
     * @return the WorkItemConfigurationsInner object.
     */
    public WorkItemConfigurationsInner workItemConfigurations() {
        return this.workItemConfigurations;
    }

    /**
     * The FavoritesInner object to access its operations.
     */
    private FavoritesInner favorites;

    /**
     * Gets the FavoritesInner object to access its operations.
     * @return the FavoritesInner object.
     */
    public FavoritesInner favorites() {
        return this.favorites;
    }

    /**
     * The WebTestLocationsInner object to access its operations.
     */
    private WebTestLocationsInner webTestLocations;

    /**
     * Gets the WebTestLocationsInner object to access its operations.
     * @return the WebTestLocationsInner object.
     */
    public WebTestLocationsInner webTestLocations() {
        return this.webTestLocations;
    }

    /**
     * The WebTestsInner object to access its operations.
     */
    private WebTestsInner webTests;

    /**
     * Gets the WebTestsInner object to access its operations.
     * @return the WebTestsInner object.
     */
    public WebTestsInner webTests() {
        return this.webTests;
    }

    /**
     * The AnalyticsItemsInner object to access its operations.
     */
    private AnalyticsItemsInner analyticsItems;

    /**
     * Gets the AnalyticsItemsInner object to access its operations.
     * @return the AnalyticsItemsInner object.
     */
    public AnalyticsItemsInner analyticsItems() {
        return this.analyticsItems;
    }

    /**
     * The WorkbooksInner object to access its operations.
     */
    private WorkbooksInner workbooks;

    /**
     * Gets the WorkbooksInner object to access its operations.
     * @return the WorkbooksInner object.
     */
    public WorkbooksInner workbooks() {
        return this.workbooks;
    }

    /**
     * Initializes an instance of ApplicationInsightsManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ApplicationInsightsManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ApplicationInsightsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ApplicationInsightsManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ApplicationInsightsManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ApplicationInsightsManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-05-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.annotations = new AnnotationsInner(restClient().retrofit(), this);
        this.aPIKeys = new APIKeysInner(restClient().retrofit(), this);
        this.exportConfigurations = new ExportConfigurationsInner(restClient().retrofit(), this);
        this.componentCurrentBillingFeatures = new ComponentCurrentBillingFeaturesInner(restClient().retrofit(), this);
        this.componentQuotaStatus = new ComponentQuotaStatusInner(restClient().retrofit(), this);
        this.componentFeatureCapabilities = new ComponentFeatureCapabilitiesInner(restClient().retrofit(), this);
        this.componentAvailableFeatures = new ComponentAvailableFeaturesInner(restClient().retrofit(), this);
        this.proactiveDetectionConfigurations = new ProactiveDetectionConfigurationsInner(restClient().retrofit(), this);
        this.components = new ComponentsInner(restClient().retrofit(), this);
        this.workItemConfigurations = new WorkItemConfigurationsInner(restClient().retrofit(), this);
        this.favorites = new FavoritesInner(restClient().retrofit(), this);
        this.webTestLocations = new WebTestLocationsInner(restClient().retrofit(), this);
        this.webTests = new WebTestsInner(restClient().retrofit(), this);
        this.analyticsItems = new AnalyticsItemsInner(restClient().retrofit(), this);
        this.workbooks = new WorkbooksInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "ApplicationInsightsManagementClient", "2015-05-01");
    }
}
