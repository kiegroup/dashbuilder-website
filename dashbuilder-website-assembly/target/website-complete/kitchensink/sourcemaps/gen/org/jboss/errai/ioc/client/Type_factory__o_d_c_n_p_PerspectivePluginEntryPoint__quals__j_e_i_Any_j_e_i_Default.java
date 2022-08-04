package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginEntryPoint;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectivePluginEntryPoint> { private class Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectivePluginEntryPoint implements Proxy<PerspectivePluginEntryPoint> {
    private final ProxyHelper<PerspectivePluginEntryPoint> proxyHelper = new ProxyHelperImpl<PerspectivePluginEntryPoint>("Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PerspectivePluginEntryPoint instance) {

    }

    public PerspectivePluginEntryPoint asBeanType() {
      return this;
    }

    public void setInstance(final PerspectivePluginEntryPoint instance) {
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

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectivePluginEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectivePluginEntryPoint.class, "Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { PerspectivePluginEntryPoint.class, Object.class });
  }

  public PerspectivePluginEntryPoint createInstance(final ContextManager contextManager) {
    final PerspectivePluginEntryPoint instance = new PerspectivePluginEntryPoint();
    setIncompleteInstance(instance);
    final RuntimePerspectivePluginManager PerspectivePluginEntryPoint_perspectivePluginManager = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    PerspectivePluginEntryPoint_PerspectivePluginManager_perspectivePluginManager(instance, PerspectivePluginEntryPoint_perspectivePluginManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final PerspectivePluginEntryPoint instance) {
    PerspectivePluginEntryPoint_init(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectivePluginEntryPoint> proxyImpl = new Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PerspectivePluginManager PerspectivePluginEntryPoint_PerspectivePluginManager_perspectivePluginManager(PerspectivePluginEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.navigation.plugin.PerspectivePluginEntryPoint::perspectivePluginManager;
  }-*/;

  native static void PerspectivePluginEntryPoint_PerspectivePluginManager_perspectivePluginManager(PerspectivePluginEntryPoint instance, PerspectivePluginManager value) /*-{
    instance.@org.dashbuilder.client.navigation.plugin.PerspectivePluginEntryPoint::perspectivePluginManager = value;
  }-*/;

  public native static void PerspectivePluginEntryPoint_init(PerspectivePluginEntryPoint instance) /*-{
    instance.@org.dashbuilder.client.navigation.plugin.PerspectivePluginEntryPoint::init()();
  }-*/;
}