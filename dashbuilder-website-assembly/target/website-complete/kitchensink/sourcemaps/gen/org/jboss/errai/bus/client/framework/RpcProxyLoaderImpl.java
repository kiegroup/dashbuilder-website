package org.jboss.errai.bus.client.framework;

import java.util.List;
import org.dashbuilder.dataprovider.DataSetProviderType;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.service.DataSetDefServices;
import org.dashbuilder.dataset.service.DataSetLookupServices;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.api.builder.RemoteCallSendable;
import org.jboss.errai.bus.client.api.messaging.MessageBus;
import org.jboss.errai.common.client.framework.ProxyProvider;
import org.jboss.errai.common.client.framework.RemoteServiceProxyFactory;

public class RpcProxyLoaderImpl implements RpcProxyLoader { public void loadProxies(final MessageBus bus) {
    class org_dashbuilder_dataset_service_DataSetLookupServicesImpl extends AbstractRpcProxy implements DataSetLookupServices { public DataSet lookupDataSet(final DataSetLookup a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSet:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0 }).respondTo(DataSet.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSet lookupDataSet(final DataSetDef a0, final DataSetLookup a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSet:org.dashbuilder.dataset.def.DataSetDef:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0, a1 }).respondTo(DataSet.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSetMetadata lookupDataSetMetadata(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSetMetadata:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(DataSetMetadata.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetLookupServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetLookupServicesImpl();
      }
    });
    class org_dashbuilder_dataset_service_DataSetDefServicesImpl extends AbstractRpcProxy implements DataSetDefServices { public List getPublicDataSetDefs() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("getPublicDataSetDefs:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSetDef createDataSetDef(final DataSetProviderType a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("createDataSetDef:org.dashbuilder.dataprovider.DataSetProviderType:", qualifiers, new Object[] { a0 }).respondTo(DataSetDef.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public String registerDataSetDef(final DataSetDef a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("registerDataSetDef:org.dashbuilder.dataset.def.DataSetDef:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(String.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public void removeDataSetDef(final String a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("removeDataSetDef:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetDefServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetDefServicesImpl();
      }
    });
  }
}