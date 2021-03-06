/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.TableServicePropertiesInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import java.util.List;

/**
 * Type representing TableServiceProperties.
 */
public interface TableServiceProperties extends HasInner<TableServicePropertiesInner>, Indexable, Refreshable<TableServiceProperties>, Updatable<TableServiceProperties.Update>, HasManager<StorageManager> {
    /**
     * @return the cors value.
     */
    CorsRules cors();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TableServiceProperties definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithCors, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TableServiceProperties definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TableServiceProperties definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the tableserviceproperties definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithCors withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the tableserviceproperties definition allowing to specify Cors.
         */
        interface WithCors {
           /**
            * Specifies cors.
            * @param cors Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Table service
            * @return the next definition stage
            */
            WithCreate withCors(CorsRules cors);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TableServiceProperties> {
        }
    }
    /**
     * The template for a TableServiceProperties update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TableServiceProperties>, UpdateStages.WithCors {
    }

    /**
     * Grouping of TableServiceProperties update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the tableserviceproperties update allowing to specify Cors.
         */
        interface WithCors {
            /**
             * Specifies cors.
             * @param cors Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Table service
             * @return the next update stage
             */
            Update withCors(CorsRules cors);
        }

    }
}
