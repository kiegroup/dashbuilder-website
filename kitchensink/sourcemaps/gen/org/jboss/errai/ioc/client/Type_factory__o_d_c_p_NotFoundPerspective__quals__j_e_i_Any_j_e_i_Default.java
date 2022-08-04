package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.perspective.NotFoundPerspective;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.model.PerspectiveDefinition;

public class Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundPerspective> { private class Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends NotFoundPerspective implements Proxy<NotFoundPerspective> {
    private final ProxyHelper<NotFoundPerspective> proxyHelper = new ProxyHelperImpl<NotFoundPerspective>("Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final NotFoundPerspective instance) {

    }

    public NotFoundPerspective asBeanType() {
      return this;
    }

    public void setInstance(final NotFoundPerspective instance) {
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
        final NotFoundPerspective proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveDefinition retVal = proxiedInstance.buildPerspective();
        return retVal;
      } else {
        return super.buildPerspective();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final NotFoundPerspective proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NotFoundPerspective.class, "Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NotFoundPerspective.class, Object.class });
  }

  public NotFoundPerspective createInstance(final ContextManager contextManager) {
    final NotFoundPerspective instance = new NotFoundPerspective();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<NotFoundPerspective> proxyImpl = new Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}