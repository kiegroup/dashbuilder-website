package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.perspective.ContentErrorPerspective;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.model.PerspectiveDefinition;

public class Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorPerspective> { private class Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ContentErrorPerspective implements Proxy<ContentErrorPerspective> {
    private final ProxyHelper<ContentErrorPerspective> proxyHelper = new ProxyHelperImpl<ContentErrorPerspective>("Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ContentErrorPerspective instance) {

    }

    public ContentErrorPerspective asBeanType() {
      return this;
    }

    public void setInstance(final ContentErrorPerspective instance) {
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
        final ContentErrorPerspective proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveDefinition retVal = proxiedInstance.buildPerspective();
        return retVal;
      } else {
        return super.buildPerspective();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ContentErrorPerspective proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ContentErrorPerspective.class, "Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ContentErrorPerspective.class, Object.class });
  }

  public ContentErrorPerspective createInstance(final ContextManager contextManager) {
    final ContentErrorPerspective instance = new ContentErrorPerspective();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ContentErrorPerspective> proxyImpl = new Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}