package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.common.client.backend.PathUrlFactory;
import org.dashbuilder.dataprovider.DataSetProviderType;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.dataset.client.DataSetClientServicesImpl;
import org.dashbuilder.dataset.client.DataSetExportReadyCallback;
import org.dashbuilder.dataset.client.DataSetMetadataCallback;
import org.dashbuilder.dataset.client.DataSetReadyCallback;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderLocator;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.engine.function.AggregateFunctionManagerImpl;
import org.dashbuilder.dataset.engine.group.IntervalBuilderLocator;
import org.dashbuilder.dataset.events.DataSetDefRemovedEvent;
import org.dashbuilder.dataset.events.DataSetModifiedEvent;
import org.dashbuilder.dataset.events.DataSetPushOkEvent;
import org.dashbuilder.dataset.events.DataSetPushingEvent;
import org.dashbuilder.dataset.events.DataSetStaleEvent;
import org.dashbuilder.dataset.group.AggregateFunctionManager;
import org.dashbuilder.dataset.service.DataSetDefServices;
import org.dashbuilder.dataset.service.DataSetExportServices;
import org.dashbuilder.dataset.service.DataSetLookupServices;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.backend.vfs.Path;

public class Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetClientServicesImpl> { private class Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DataSetClientServicesImpl implements Proxy<DataSetClientServicesImpl> {
    private final ProxyHelper<DataSetClientServicesImpl> proxyHelper = new ProxyHelperImpl<DataSetClientServicesImpl>("Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DataSetClientServicesImpl instance) {

    }

    public DataSetClientServicesImpl asBeanType() {
      return this;
    }

    public void setInstance(final DataSetClientServicesImpl instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public boolean isPushRemoteDataSetEnabled() {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isPushRemoteDataSetEnabled();
        return retVal;
      } else {
        return super.isPushRemoteDataSetEnabled();
      }
    }

    @Override public void setPushRemoteDataSetEnabled(boolean pushRemoteDataSetEnabled) {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setPushRemoteDataSetEnabled(pushRemoteDataSetEnabled);
      } else {
        super.setPushRemoteDataSetEnabled(pushRemoteDataSetEnabled);
      }
    }

    @Override public void fetchMetadata(String uuid, DataSetMetadataCallback listener) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.fetchMetadata(uuid, listener);
      } else {
        super.fetchMetadata(uuid, listener);
      }
    }

    @Override public DataSetMetadata getMetadata(String uuid) {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final DataSetMetadata retVal = proxiedInstance.getMetadata(uuid);
        return retVal;
      } else {
        return super.getMetadata(uuid);
      }
    }

    @Override public void exportDataSetCSV(DataSetLookup request, DataSetExportReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.exportDataSetCSV(request, listener);
      } else {
        super.exportDataSetCSV(request, listener);
      }
    }

    @Override public void exportDataSetExcel(DataSetLookup request, DataSetExportReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.exportDataSetExcel(request, listener);
      } else {
        super.exportDataSetExcel(request, listener);
      }
    }

    @Override public void newDataSet(DataSetProviderType type, RemoteCallback callback) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.newDataSet(type, callback);
      } else {
        super.newDataSet(type, callback);
      }
    }

    @Override public void lookupDataSet(DataSetDef def, DataSetLookup request, DataSetReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.lookupDataSet(def, request, listener);
      } else {
        super.lookupDataSet(def, request, listener);
      }
    }

    @Override public void lookupDataSet(DataSetLookup request, DataSetReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.lookupDataSet(request, listener);
      } else {
        super.lookupDataSet(request, listener);
      }
    }

    @Override public void getRemoteSharedDataSetDefs(RemoteCallback callback) {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getRemoteSharedDataSetDefs(callback);
      } else {
        super.getRemoteSharedDataSetDefs(callback);
      }
    }

    @Override public void getPublicDataSetDefs(RemoteCallback callback) {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getPublicDataSetDefs(callback);
      } else {
        super.getPublicDataSetDefs(callback);
      }
    }

    @Override public AggregateFunctionManager getAggregateFunctionManager() {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final AggregateFunctionManager retVal = proxiedInstance.getAggregateFunctionManager();
        return retVal;
      } else {
        return super.getAggregateFunctionManager();
      }
    }

    @Override public IntervalBuilderLocator getIntervalBuilderLocator() {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final IntervalBuilderLocator retVal = proxiedInstance.getIntervalBuilderLocator();
        return retVal;
      } else {
        return super.getIntervalBuilderLocator();
      }
    }

    @Override public String getDownloadFileUrl(Path path) {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDownloadFileUrl(path);
        return retVal;
      } else {
        return super.getDownloadFileUrl(path);
      }
    }

    @Override public String getUploadFileUrl() {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getUploadFileUrl();
        return retVal;
      } else {
        return super.getUploadFileUrl();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DataSetClientServicesImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataSetClientServicesImpl.class, "Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataSetClientServicesImpl.class, Object.class, DataSetClientServices.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.dataset.events.DataSetStaleEvent", new AbstractCDIEventCallback<DataSetStaleEvent>() {
      public void fireEvent(final DataSetStaleEvent event) {
        final DataSetClientServicesImpl instance = Factory.maybeUnwrapProxy((DataSetClientServicesImpl) context.getInstance("Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default"));
        DataSetClientServicesImpl_onDataSetStaleEvent_DataSetStaleEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetStaleEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetStaleEvent", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.dashbuilder.dataset.events.DataSetDefRemovedEvent", new AbstractCDIEventCallback<DataSetDefRemovedEvent>() {
      public void fireEvent(final DataSetDefRemovedEvent event) {
        final DataSetClientServicesImpl instance = Factory.maybeUnwrapProxy((DataSetClientServicesImpl) context.getInstance("Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default"));
        DataSetClientServicesImpl_onDataSetRemovedEvent_DataSetDefRemovedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetDefRemovedEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetDefRemovedEvent", CDI.ROUTING_CALLBACK);
  }

  public DataSetClientServicesImpl createInstance(final ContextManager contextManager) {
    final Event<DataSetPushOkEvent> _dataSetPushOkEvent_5 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetPushOkEvent.class }, new Annotation[] { });
    final Caller<DataSetLookupServices> _dataSetLookupServices_7 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { DataSetLookupServices.class }, new Annotation[] { });
    final Caller<DataSetDefServices> _dataSetDefServices_8 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { DataSetDefServices.class }, new Annotation[] { });
    final PathUrlFactory _pathUrlFactory_1 = (PathUrlFactory) contextManager.getInstance("Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default");
    final Event<DataSetPushingEvent> _dataSetPushingEvent_4 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetPushingEvent.class }, new Annotation[] { });
    final Event<DataSetModifiedEvent> _dataSetModifiedEvent_6 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetModifiedEvent.class }, new Annotation[] { });
    final Caller<DataSetExportServices> _dataSetExportServices_9 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { DataSetExportServices.class }, new Annotation[] { });
    final IntervalBuilderLocator _intervalBuilderLocator_3 = (ClientIntervalBuilderLocator) contextManager.getInstance("Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default");
    final ClientDataSetManager _clientDataSetManager_0 = (ClientDataSetManager) contextManager.getInstance("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    final AggregateFunctionManager _aggregateFunctionManager_2 = (AggregateFunctionManagerImpl) contextManager.getInstance("Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final DataSetClientServicesImpl instance = new DataSetClientServicesImpl(_clientDataSetManager_0, _pathUrlFactory_1, _aggregateFunctionManager_2, _intervalBuilderLocator_3, _dataSetPushingEvent_4, _dataSetPushOkEvent_5, _dataSetModifiedEvent_6, _dataSetLookupServices_7, _dataSetDefServices_8, _dataSetExportServices_9);
    registerDependentScopedReference(instance, _dataSetPushOkEvent_5);
    registerDependentScopedReference(instance, _dataSetLookupServices_7);
    registerDependentScopedReference(instance, _dataSetDefServices_8);
    registerDependentScopedReference(instance, _dataSetPushingEvent_4);
    registerDependentScopedReference(instance, _dataSetModifiedEvent_6);
    registerDependentScopedReference(instance, _dataSetExportServices_9);
    registerDependentScopedReference(instance, _aggregateFunctionManager_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DataSetClientServicesImpl> proxyImpl = new Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void DataSetClientServicesImpl_onDataSetStaleEvent_DataSetStaleEvent(DataSetClientServicesImpl instance, DataSetStaleEvent a0) /*-{
    instance.@org.dashbuilder.dataset.client.DataSetClientServicesImpl::onDataSetStaleEvent(Lorg/dashbuilder/dataset/events/DataSetStaleEvent;)(a0);
  }-*/;

  public native static void DataSetClientServicesImpl_onDataSetRemovedEvent_DataSetDefRemovedEvent(DataSetClientServicesImpl instance, DataSetDefRemovedEvent a0) /*-{
    instance.@org.dashbuilder.dataset.client.DataSetClientServicesImpl::onDataSetRemovedEvent(Lorg/dashbuilder/dataset/events/DataSetDefRemovedEvent;)(a0);
  }-*/;
}