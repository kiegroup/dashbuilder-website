package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navbar.RuntimeNavBrand;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.workbench.widgets.menu.megamenu.brand.MegaMenuBrand;

public class Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeNavBrand> { private class Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeNavBrand implements Proxy<RuntimeNavBrand> {
    private final ProxyHelper<RuntimeNavBrand> proxyHelper = new ProxyHelperImpl<RuntimeNavBrand>("Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeNavBrand instance) {

    }

    public RuntimeNavBrand asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeNavBrand instance) {
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

    @Override public String brandImageUrl() {
      if (proxyHelper != null) {
        final RuntimeNavBrand proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.brandImageUrl();
        return retVal;
      } else {
        return super.brandImageUrl();
      }
    }

    @Override public String brandImageLabel() {
      if (proxyHelper != null) {
        final RuntimeNavBrand proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.brandImageLabel();
        return retVal;
      } else {
        return super.brandImageLabel();
      }
    }

    @Override public String menuAccessorLabel() {
      if (proxyHelper != null) {
        final RuntimeNavBrand proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.menuAccessorLabel();
        return retVal;
      } else {
        return super.menuAccessorLabel();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeNavBrand proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeNavBrand.class, "Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeNavBrand.class, Object.class, MegaMenuBrand.class });
  }

  public RuntimeNavBrand createInstance(final ContextManager contextManager) {
    final RuntimeNavBrand instance = new RuntimeNavBrand();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeNavBrand> proxyImpl = new Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}