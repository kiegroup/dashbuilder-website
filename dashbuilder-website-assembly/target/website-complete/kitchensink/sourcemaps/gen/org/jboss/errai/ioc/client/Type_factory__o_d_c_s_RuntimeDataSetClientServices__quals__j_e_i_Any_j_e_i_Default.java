package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.client.marshalling.ClientDataSetMetadataJSONMarshaller;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataprovider.DataSetProviderType;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.dataset.client.DataSetExportReadyCallback;
import org.dashbuilder.dataset.client.DataSetMetadataCallback;
import org.dashbuilder.dataset.client.DataSetReadyCallback;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.events.DataSetDefRemovedEvent;
import org.jboss.errai.bus.client.ErraiBus;
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

public class Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeDataSetClientServices> { private class Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeDataSetClientServices implements Proxy<RuntimeDataSetClientServices> {
    private final ProxyHelper<RuntimeDataSetClientServices> proxyHelper = new ProxyHelperImpl<RuntimeDataSetClientServices>("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeDataSetClientServices instance) {

    }

    public RuntimeDataSetClientServices asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeDataSetClientServices instance) {
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

    @Override public void setPushRemoteDataSetEnabled(boolean pushRemoteDataSetEnabled) {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setPushRemoteDataSetEnabled(pushRemoteDataSetEnabled);
      } else {
        super.setPushRemoteDataSetEnabled(pushRemoteDataSetEnabled);
      }
    }

    @Override public void fetchMetadata(String uuid, DataSetMetadataCallback listener) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.fetchMetadata(uuid, listener);
      } else {
        super.fetchMetadata(uuid, listener);
      }
    }

    @Override public DataSetMetadata getMetadata(String uuid) {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        final DataSetMetadata retVal = proxiedInstance.getMetadata(uuid);
        return retVal;
      } else {
        return super.getMetadata(uuid);
      }
    }

    @Override public void lookupDataSet(DataSetDef def, DataSetLookup lookup, DataSetReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.lookupDataSet(def, lookup, listener);
      } else {
        super.lookupDataSet(def, lookup, listener);
      }
    }

    @Override public void lookupDataSet(DataSetLookup request, DataSetReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.lookupDataSet(request, listener);
      } else {
        super.lookupDataSet(request, listener);
      }
    }

    @Override public void exportDataSetCSV(DataSetLookup request, DataSetExportReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.exportDataSetCSV(request, listener);
      } else {
        super.exportDataSetCSV(request, listener);
      }
    }

    @Override public void exportDataSetExcel(DataSetLookup request, DataSetExportReadyCallback listener) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.exportDataSetExcel(request, listener);
      } else {
        super.exportDataSetExcel(request, listener);
      }
    }

    @Override public void newDataSet(DataSetProviderType type, RemoteCallback callback) throws Exception {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.newDataSet(type, callback);
      } else {
        super.newDataSet(type, callback);
      }
    }

    @Override public void getPublicDataSetDefs(RemoteCallback callback) {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getPublicDataSetDefs(callback);
      } else {
        super.getPublicDataSetDefs(callback);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeDataSetClientServices proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeDataSetClientServices.class, "Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeDataSetClientServices.class, Object.class, DataSetClientServices.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.dataset.events.DataSetDefRemovedEvent", new AbstractCDIEventCallback<DataSetDefRemovedEvent>() {
      public void fireEvent(final DataSetDefRemovedEvent event) {
        final RuntimeDataSetClientServices instance = Factory.maybeUnwrapProxy((RuntimeDataSetClientServices) context.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default"));
        RuntimeDataSetClientServices_onDataSetDefRemovedEvent_DataSetDefRemovedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetDefRemovedEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetDefRemovedEvent", CDI.ROUTING_CALLBACK);
  }

  public RuntimeDataSetClientServices createInstance(final ContextManager contextManager) {
    final RuntimeDataSetClientServices instance = new RuntimeDataSetClientServices();
    setIncompleteInstance(instance);
    final ErrorResponseVerifier RuntimeDataSetClientServices_verifier = (ErrorResponseVerifier) contextManager.getInstance("Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default");
    RuntimeDataSetClientServices_ErrorResponseVerifier_verifier(instance, RuntimeDataSetClientServices_verifier);
    final RuntimeClientLoader RuntimeDataSetClientServices_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    RuntimeDataSetClientServices_RuntimeClientLoader_loader(instance, RuntimeDataSetClientServices_loader);
    final ClientDataSetMetadataJSONMarshaller RuntimeDataSetClientServices_dataSetMetadataJsonMarshaller = (ClientDataSetMetadataJSONMarshaller) contextManager.getInstance("Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default");
    RuntimeDataSetClientServices_ClientDataSetMetadataJSONMarshaller_dataSetMetadataJsonMarshaller(instance, RuntimeDataSetClientServices_dataSetMetadataJsonMarshaller);
    final DefaultRuntimeErrorCallback RuntimeDataSetClientServices_errorCallback = (DefaultRuntimeErrorCallback) contextManager.getInstance("Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeDataSetClientServices_errorCallback);
    RuntimeDataSetClientServices_DefaultRuntimeErrorCallback_errorCallback(instance, RuntimeDataSetClientServices_errorCallback);
    final ClientDataSetManager RuntimeDataSetClientServices_clientDataSetManager = (ClientDataSetManager) contextManager.getInstance("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    RuntimeDataSetClientServices_ClientDataSetManager_clientDataSetManager(instance, RuntimeDataSetClientServices_clientDataSetManager);
    final ExternalDataSetClientProvider RuntimeDataSetClientServices_externalDataSetClientProvider = (ExternalDataSetClientProvider) contextManager.getInstance("Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default");
    RuntimeDataSetClientServices_ExternalDataSetClientProvider_externalDataSetClientProvider(instance, RuntimeDataSetClientServices_externalDataSetClientProvider);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeDataSetClientServices> proxyImpl = new Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static ClientDataSetManager RuntimeDataSetClientServices_ClientDataSetManager_clientDataSetManager(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::clientDataSetManager;
  }-*/;

  native static void RuntimeDataSetClientServices_ClientDataSetManager_clientDataSetManager(RuntimeDataSetClientServices instance, ClientDataSetManager value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::clientDataSetManager = value;
  }-*/;

  native static DefaultRuntimeErrorCallback RuntimeDataSetClientServices_DefaultRuntimeErrorCallback_errorCallback(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::errorCallback;
  }-*/;

  native static void RuntimeDataSetClientServices_DefaultRuntimeErrorCallback_errorCallback(RuntimeDataSetClientServices instance, DefaultRuntimeErrorCallback value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::errorCallback = value;
  }-*/;

  native static ExternalDataSetClientProvider RuntimeDataSetClientServices_ExternalDataSetClientProvider_externalDataSetClientProvider(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::externalDataSetClientProvider;
  }-*/;

  native static void RuntimeDataSetClientServices_ExternalDataSetClientProvider_externalDataSetClientProvider(RuntimeDataSetClientServices instance, ExternalDataSetClientProvider value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::externalDataSetClientProvider = value;
  }-*/;

  native static RuntimeClientLoader RuntimeDataSetClientServices_RuntimeClientLoader_loader(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::loader;
  }-*/;

  native static void RuntimeDataSetClientServices_RuntimeClientLoader_loader(RuntimeDataSetClientServices instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::loader = value;
  }-*/;

  native static ErrorResponseVerifier RuntimeDataSetClientServices_ErrorResponseVerifier_verifier(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::verifier;
  }-*/;

  native static void RuntimeDataSetClientServices_ErrorResponseVerifier_verifier(RuntimeDataSetClientServices instance, ErrorResponseVerifier value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::verifier = value;
  }-*/;

  native static ClientDataSetMetadataJSONMarshaller RuntimeDataSetClientServices_ClientDataSetMetadataJSONMarshaller_dataSetMetadataJsonMarshaller(RuntimeDataSetClientServices instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::dataSetMetadataJsonMarshaller;
  }-*/;

  native static void RuntimeDataSetClientServices_ClientDataSetMetadataJSONMarshaller_dataSetMetadataJsonMarshaller(RuntimeDataSetClientServices instance, ClientDataSetMetadataJSONMarshaller value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::dataSetMetadataJsonMarshaller = value;
  }-*/;

  public native static void RuntimeDataSetClientServices_onDataSetDefRemovedEvent_DataSetDefRemovedEvent(RuntimeDataSetClientServices instance, DataSetDefRemovedEvent a0) /*-{
    instance.@org.dashbuilder.client.services.RuntimeDataSetClientServices::onDataSetDefRemovedEvent(Lorg/dashbuilder/dataset/events/DataSetDefRemovedEvent;)(a0);
  }-*/;
}