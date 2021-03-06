/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.management.network.v2018_11_01.VpnConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_11_01.VpnConnectionStatus;
import com.microsoft.azure.management.network.v2018_11_01.VirtualNetworkGatewayConnectionProtocol;
import java.util.List;
import com.microsoft.azure.management.network.v2018_11_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2018_11_01.ProvisioningState;

class VpnConnectionImpl extends CreatableUpdatableImpl<VpnConnection, VpnConnectionInner, VpnConnectionImpl> implements VpnConnection, VpnConnection.Definition, VpnConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String gatewayName;
    private String connectionName;

    VpnConnectionImpl(String name, NetworkManager manager) {
        super(name, new VpnConnectionInner());
        this.manager = manager;
        // Set resource name
        this.connectionName = name;
        //
    }

    VpnConnectionImpl(VpnConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.gatewayName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnGateways");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnConnections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VpnConnection> createResourceAsync() {
        VpnConnectionsInner client = this.manager().inner().vpnConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.gatewayName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VpnConnection> updateResourceAsync() {
        VpnConnectionsInner client = this.manager().inner().vpnConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.gatewayName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VpnConnectionInner> getInnerAsync() {
        VpnConnectionsInner client = this.manager().inner().vpnConnections();
        return client.getAsync(this.resourceGroupName, this.gatewayName, this.connectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Integer connectionBandwidth() {
        return this.inner().connectionBandwidth();
    }

    @Override
    public VpnConnectionStatus connectionStatus() {
        return this.inner().connectionStatus();
    }

    @Override
    public Long egressBytesTransferred() {
        return this.inner().egressBytesTransferred();
    }

    @Override
    public Boolean enableBgp() {
        return this.inner().enableBgp();
    }

    @Override
    public Boolean enableInternetSecurity() {
        return this.inner().enableInternetSecurity();
    }

    @Override
    public Boolean enableRateLimiting() {
        return this.inner().enableRateLimiting();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long ingressBytesTransferred() {
        return this.inner().ingressBytesTransferred();
    }

    @Override
    public List<IpsecPolicy> ipsecPolicies() {
        return this.inner().ipsecPolicies();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource remoteVpnSite() {
        return this.inner().remoteVpnSite();
    }

    @Override
    public Integer routingWeight() {
        return this.inner().routingWeight();
    }

    @Override
    public String sharedKey() {
        return this.inner().sharedKey();
    }

    @Override
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.inner().vpnConnectionProtocolType();
    }

    @Override
    public VpnConnectionImpl withExistingVpnGateway(String resourceGroupName, String gatewayName) {
        this.resourceGroupName = resourceGroupName;
        this.gatewayName = gatewayName;
        return this;
    }

    @Override
    public VpnConnectionImpl withConnectionBandwidth(Integer connectionBandwidth) {
        this.inner().withConnectionBandwidth(connectionBandwidth);
        return this;
    }

    @Override
    public VpnConnectionImpl withConnectionStatus(VpnConnectionStatus connectionStatus) {
        this.inner().withConnectionStatus(connectionStatus);
        return this;
    }

    @Override
    public VpnConnectionImpl withEnableBgp(Boolean enableBgp) {
        this.inner().withEnableBgp(enableBgp);
        return this;
    }

    @Override
    public VpnConnectionImpl withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.inner().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    @Override
    public VpnConnectionImpl withEnableRateLimiting(Boolean enableRateLimiting) {
        this.inner().withEnableRateLimiting(enableRateLimiting);
        return this;
    }

    @Override
    public VpnConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public VpnConnectionImpl withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.inner().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    @Override
    public VpnConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public VpnConnectionImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public VpnConnectionImpl withRemoteVpnSite(SubResource remoteVpnSite) {
        this.inner().withRemoteVpnSite(remoteVpnSite);
        return this;
    }

    @Override
    public VpnConnectionImpl withRoutingWeight(Integer routingWeight) {
        this.inner().withRoutingWeight(routingWeight);
        return this;
    }

    @Override
    public VpnConnectionImpl withSharedKey(String sharedKey) {
        this.inner().withSharedKey(sharedKey);
        return this;
    }

    @Override
    public VpnConnectionImpl withVpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.inner().withVpnConnectionProtocolType(vpnConnectionProtocolType);
        return this;
    }

}
