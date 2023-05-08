package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.perspective.SamplesPerspective;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.model.PerspectiveDefinition;

public class Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesPerspective> { private class Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends SamplesPerspective implements Proxy<SamplesPerspective> {
    private final ProxyHelper<SamplesPerspective> proxyHelper = new ProxyHelperImpl<SamplesPerspective>("Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final SamplesPerspective instance) {

    }

    public SamplesPerspective asBeanType() {
      return this;
    }

    public void setInstance(final SamplesPerspective instance) {
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
        final SamplesPerspective proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveDefinition retVal = proxiedInstance.buildPerspective();
        return retVal;
      } else {
        return super.buildPerspective();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final SamplesPerspective proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesPerspective.class, "Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SamplesPerspective.class, Object.class });
  }

  public SamplesPerspective createInstance(final ContextManager contextManager) {
    final SamplesPerspective instance = new SamplesPerspective();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<SamplesPerspective> proxyImpl = new Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}