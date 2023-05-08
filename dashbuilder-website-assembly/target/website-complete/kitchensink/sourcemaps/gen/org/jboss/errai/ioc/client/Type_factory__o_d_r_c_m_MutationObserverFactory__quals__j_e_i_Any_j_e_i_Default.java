package org.jboss.errai.ioc.client;

import elemental2.dom.MutationObserver;
import elemental2.dom.MutationObserver.MutationObserverCallbackFn;
import elemental2.dom.MutationObserverInit;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.renderer.c3.mutationobserver.MutationObserverFactory;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<MutationObserverFactory> { private class Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends MutationObserverFactory implements Proxy<MutationObserverFactory> {
    private final ProxyHelper<MutationObserverFactory> proxyHelper = new ProxyHelperImpl<MutationObserverFactory>("Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final MutationObserverFactory instance) {

    }

    public MutationObserverFactory asBeanType() {
      return this;
    }

    public void setInstance(final MutationObserverFactory instance) {
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

    @Override public MutationObserverInit mutationObserverInit() {
      if (proxyHelper != null) {
        final MutationObserverFactory proxiedInstance = proxyHelper.getInstance(this);
        final MutationObserverInit retVal = proxiedInstance.mutationObserverInit();
        return retVal;
      } else {
        return super.mutationObserverInit();
      }
    }

    @Override public MutationObserver mutationObserver(MutationObserverCallbackFn callback) {
      if (proxyHelper != null) {
        final MutationObserverFactory proxiedInstance = proxyHelper.getInstance(this);
        final MutationObserver retVal = proxiedInstance.mutationObserver(callback);
        return retVal;
      } else {
        return super.mutationObserver(callback);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final MutationObserverFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MutationObserverFactory.class, "Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MutationObserverFactory.class, Object.class });
  }

  public MutationObserverFactory createInstance(final ContextManager contextManager) {
    final MutationObserverFactory instance = new MutationObserverFactory();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<MutationObserverFactory> proxyImpl = new Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}