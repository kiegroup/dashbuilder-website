package org.jboss.errai.ioc.client;

import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.external.ExternalDataCallbackCoordinator;
import org.dashbuilder.dataset.client.DataSetReadyCallback;
import org.dashbuilder.dataset.def.DataSetDef;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDataCallbackCoordinator> { private class Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ExternalDataCallbackCoordinator implements Proxy<ExternalDataCallbackCoordinator> {
    private final ProxyHelper<ExternalDataCallbackCoordinator> proxyHelper = new ProxyHelperImpl<ExternalDataCallbackCoordinator>("Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ExternalDataCallbackCoordinator instance) {

    }

    public ExternalDataCallbackCoordinator asBeanType() {
      return this;
    }

    public void setInstance(final ExternalDataCallbackCoordinator instance) {
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

    @Override public DataSetReadyCallback getCallback(DataSetDef def, DataSetReadyCallback callback, Consumer action, Runnable cleanUp) {
      if (proxyHelper != null) {
        final ExternalDataCallbackCoordinator proxiedInstance = proxyHelper.getInstance(this);
        final DataSetReadyCallback retVal = proxiedInstance.getCallback(def, callback, action, cleanUp);
        return retVal;
      } else {
        return super.getCallback(def, callback, action, cleanUp);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ExternalDataCallbackCoordinator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalDataCallbackCoordinator.class, "Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalDataCallbackCoordinator.class, Object.class });
  }

  public ExternalDataCallbackCoordinator createInstance(final ContextManager contextManager) {
    final ExternalDataCallbackCoordinator instance = new ExternalDataCallbackCoordinator();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalDataCallbackCoordinator instance) {
    ExternalDataCallbackCoordinator_setup(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ExternalDataCallbackCoordinator> proxyImpl = new Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void ExternalDataCallbackCoordinator_setup(ExternalDataCallbackCoordinator instance) /*-{
    instance.@org.dashbuilder.client.external.ExternalDataCallbackCoordinator::setup()();
  }-*/;
}