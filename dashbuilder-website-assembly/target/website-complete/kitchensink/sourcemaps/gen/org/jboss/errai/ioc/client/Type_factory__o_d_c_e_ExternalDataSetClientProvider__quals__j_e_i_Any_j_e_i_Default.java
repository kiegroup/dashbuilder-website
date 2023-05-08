package org.jboss.errai.ioc.client;

import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.external.ExternalDataCallbackCoordinator;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.client.DataSetReadyCallback;
import org.dashbuilder.dataset.def.ExternalDataSetDef;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDataSetClientProvider> { private class Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ExternalDataSetClientProvider implements Proxy<ExternalDataSetClientProvider> {
    private final ProxyHelper<ExternalDataSetClientProvider> proxyHelper = new ProxyHelperImpl<ExternalDataSetClientProvider>("Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ExternalDataSetClientProvider instance) {

    }

    public ExternalDataSetClientProvider asBeanType() {
      return this;
    }

    public void setInstance(final ExternalDataSetClientProvider instance) {
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

    @Override public void setup() {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public void fetchAndRegister(String uuid, DataSetLookup lookup, DataSetReadyCallback listener) {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.fetchAndRegister(uuid, lookup, listener);
      } else {
        super.fetchAndRegister(uuid, lookup, listener);
      }
    }

    @Override public void register(ExternalDataSetDef def) {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.register(def);
      } else {
        super.register(def);
      }
    }

    @Override public Optional get(String uuid) {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        final Optional retVal = proxiedInstance.get(uuid);
        return retVal;
      } else {
        return super.get(uuid);
      }
    }

    @Override public void unregister(String uuid) {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unregister(uuid);
      } else {
        super.unregister(uuid);
      }
    }

    @Override public void clear() {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clear();
      } else {
        super.clear();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ExternalDataSetClientProvider proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalDataSetClientProvider.class, "Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalDataSetClientProvider.class, Object.class });
  }

  public ExternalDataSetClientProvider createInstance(final ContextManager contextManager) {
    final ExternalDataSetClientProvider instance = new ExternalDataSetClientProvider();
    setIncompleteInstance(instance);
    final ClientDataSetManager ExternalDataSetClientProvider_clientDataSetManager = (ClientDataSetManager) contextManager.getInstance("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    ExternalDataSetClientProvider_ClientDataSetManager_clientDataSetManager(instance, ExternalDataSetClientProvider_clientDataSetManager);
    final ExternalDataCallbackCoordinator ExternalDataSetClientProvider_dataSetCallbackCoordinator = (ExternalDataCallbackCoordinator) contextManager.getInstance("Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default");
    ExternalDataSetClientProvider_ExternalDataCallbackCoordinator_dataSetCallbackCoordinator(instance, ExternalDataSetClientProvider_dataSetCallbackCoordinator);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalDataSetClientProvider instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ExternalDataSetClientProvider> proxyImpl = new Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static ClientDataSetManager ExternalDataSetClientProvider_ClientDataSetManager_clientDataSetManager(ExternalDataSetClientProvider instance) /*-{
    return instance.@org.dashbuilder.client.external.ExternalDataSetClientProvider::clientDataSetManager;
  }-*/;

  native static void ExternalDataSetClientProvider_ClientDataSetManager_clientDataSetManager(ExternalDataSetClientProvider instance, ClientDataSetManager value) /*-{
    instance.@org.dashbuilder.client.external.ExternalDataSetClientProvider::clientDataSetManager = value;
  }-*/;

  native static ExternalDataCallbackCoordinator ExternalDataSetClientProvider_ExternalDataCallbackCoordinator_dataSetCallbackCoordinator(ExternalDataSetClientProvider instance) /*-{
    return instance.@org.dashbuilder.client.external.ExternalDataSetClientProvider::dataSetCallbackCoordinator;
  }-*/;

  native static void ExternalDataSetClientProvider_ExternalDataCallbackCoordinator_dataSetCallbackCoordinator(ExternalDataSetClientProvider instance, ExternalDataCallbackCoordinator value) /*-{
    instance.@org.dashbuilder.client.external.ExternalDataSetClientProvider::dataSetCallbackCoordinator = value;
  }-*/;
}