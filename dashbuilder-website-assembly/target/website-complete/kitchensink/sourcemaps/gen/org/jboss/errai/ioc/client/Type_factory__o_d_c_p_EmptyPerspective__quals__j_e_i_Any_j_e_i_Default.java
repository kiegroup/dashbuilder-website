package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.perspective.EmptyPerspective;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.model.PerspectiveDefinition;

public class Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyPerspective> { private class Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends EmptyPerspective implements Proxy<EmptyPerspective> {
    private final ProxyHelper<EmptyPerspective> proxyHelper = new ProxyHelperImpl<EmptyPerspective>("Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final EmptyPerspective instance) {

    }

    public EmptyPerspective asBeanType() {
      return this;
    }

    public void setInstance(final EmptyPerspective instance) {
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

    @Override public PerspectiveDefinition buildPerspective() {
      if (proxyHelper != null) {
        final EmptyPerspective proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveDefinition retVal = proxiedInstance.buildPerspective();
        return retVal;
      } else {
        return super.buildPerspective();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final EmptyPerspective proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EmptyPerspective.class, "Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EmptyPerspective.class, Object.class });
  }

  public EmptyPerspective createInstance(final ContextManager contextManager) {
    final EmptyPerspective instance = new EmptyPerspective();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<EmptyPerspective> proxyImpl = new Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}