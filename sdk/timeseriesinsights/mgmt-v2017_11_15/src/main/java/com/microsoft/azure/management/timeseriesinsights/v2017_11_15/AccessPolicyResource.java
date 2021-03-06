/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.AccessPolicyResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.TimeSeriesInsightsManager;
import java.util.List;

/**
 * Type representing AccessPolicyResource.
 */
public interface AccessPolicyResource extends HasInner<AccessPolicyResourceInner>, Indexable, Refreshable<AccessPolicyResource>, Updatable<AccessPolicyResource.Update>, HasManager<TimeSeriesInsightsManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the principalObjectId value.
     */
    String principalObjectId();

    /**
     * @return the roles value.
     */
    List<AccessPolicyRole> roles();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AccessPolicyResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithEnvironment, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AccessPolicyResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AccessPolicyResource definition.
         */
        interface Blank extends WithEnvironment {
        }

        /**
         * The stage of the accesspolicyresource definition allowing to specify Environment.
         */
        interface WithEnvironment {
           /**
            * Specifies resourceGroupName, environmentName.
            * @param resourceGroupName Name of an Azure Resource group
            * @param environmentName The name of the Time Series Insights environment associated with the specified resource group
            * @return the next definition stage
            */
            WithCreate withExistingEnvironment(String resourceGroupName, String environmentName);
        }

        /**
         * The stage of the accesspolicyresource definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description An description of the access policy
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the accesspolicyresource definition allowing to specify PrincipalObjectId.
         */
        interface WithPrincipalObjectId {
            /**
             * Specifies principalObjectId.
             * @param principalObjectId The objectId of the principal in Azure Active Directory
             * @return the next definition stage
             */
            WithCreate withPrincipalObjectId(String principalObjectId);
        }

        /**
         * The stage of the accesspolicyresource definition allowing to specify Roles.
         */
        interface WithRoles {
            /**
             * Specifies roles.
             * @param roles The list of roles the principal is assigned on the environment
             * @return the next definition stage
             */
            WithCreate withRoles(List<AccessPolicyRole> roles);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AccessPolicyResource>, DefinitionStages.WithDescription, DefinitionStages.WithPrincipalObjectId, DefinitionStages.WithRoles {
        }
    }
    /**
     * The template for a AccessPolicyResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AccessPolicyResource>, UpdateStages.WithDescription, UpdateStages.WithRoles {
    }

    /**
     * Grouping of AccessPolicyResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the accesspolicyresource update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description An description of the access policy
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the accesspolicyresource update allowing to specify Roles.
         */
        interface WithRoles {
            /**
             * Specifies roles.
             * @param roles The list of roles the principal is assigned on the environment
             * @return the next update stage
             */
            Update withRoles(List<AccessPolicyRole> roles);
        }

    }
}
