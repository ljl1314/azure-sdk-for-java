/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SkuNameEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service Tier details.
 */
public class AvailableServiceTierInner {
    /**
     * The name of the Service Tier. Possible values include: 'Free',
     * 'Standard', 'Premium', 'PerNode', 'PerGB2018', 'Standalone',
     * 'CapacityReservation'.
     */
    @JsonProperty(value = "serviceTier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuNameEnum serviceTier;

    /**
     * True if the Service Tier is enabled for the workspace.
     */
    @JsonProperty(value = "enabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enabled;

    /**
     * The minimum retention for the Service Tier, in days.
     */
    @JsonProperty(value = "minimumRetention", access = JsonProperty.Access.WRITE_ONLY)
    private Long minimumRetention;

    /**
     * The maximum retention for the Service Tier, in days.
     */
    @JsonProperty(value = "maximumRetention", access = JsonProperty.Access.WRITE_ONLY)
    private Long maximumRetention;

    /**
     * The default retention for the Service Tier, in days.
     */
    @JsonProperty(value = "defaultRetention", access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultRetention;

    /**
     * The capacity reservation level in GB per day. Returned for the Capacity
     * Reservation Service Tier.
     */
    @JsonProperty(value = "capacityReservationLevel", access = JsonProperty.Access.WRITE_ONLY)
    private Long capacityReservationLevel;

    /**
     * Time when the sku was last updated for the workspace. Returned for the
     * Capacity Reservation Service Tier.
     */
    @JsonProperty(value = "lastSkuUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastSkuUpdate;

    /**
     * Get the name of the Service Tier. Possible values include: 'Free', 'Standard', 'Premium', 'PerNode', 'PerGB2018', 'Standalone', 'CapacityReservation'.
     *
     * @return the serviceTier value
     */
    public SkuNameEnum serviceTier() {
        return this.serviceTier;
    }

    /**
     * Get true if the Service Tier is enabled for the workspace.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Get the minimum retention for the Service Tier, in days.
     *
     * @return the minimumRetention value
     */
    public Long minimumRetention() {
        return this.minimumRetention;
    }

    /**
     * Get the maximum retention for the Service Tier, in days.
     *
     * @return the maximumRetention value
     */
    public Long maximumRetention() {
        return this.maximumRetention;
    }

    /**
     * Get the default retention for the Service Tier, in days.
     *
     * @return the defaultRetention value
     */
    public Long defaultRetention() {
        return this.defaultRetention;
    }

    /**
     * Get the capacity reservation level in GB per day. Returned for the Capacity Reservation Service Tier.
     *
     * @return the capacityReservationLevel value
     */
    public Long capacityReservationLevel() {
        return this.capacityReservationLevel;
    }

    /**
     * Get time when the sku was last updated for the workspace. Returned for the Capacity Reservation Service Tier.
     *
     * @return the lastSkuUpdate value
     */
    public String lastSkuUpdate() {
        return this.lastSkuUpdate;
    }

}
