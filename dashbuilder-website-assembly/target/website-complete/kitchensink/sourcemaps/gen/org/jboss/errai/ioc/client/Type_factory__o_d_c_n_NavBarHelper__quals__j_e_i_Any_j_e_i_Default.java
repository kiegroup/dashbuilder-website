package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navigation.NavBarHelper;
import org.dashbuilder.navigation.NavTree;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.workbench.model.menu.MenuFactory.TopLevelMenusBuilder;

public class Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<NavBarHelper> { private class Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends NavBarHelper implements Proxy<NavBarHelper> {
    private final ProxyHelper<NavBarHelper> proxyHelper = new ProxyHelperImpl<NavBarHelper>("Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final NavBarHelper instance) {

    }

    public NavBarHelper asBeanType() {
      return this;
    }

    public void setInstance(final NavBarHelper instance) {
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

    @Override public TopLevelMenusBuilder buildMenusFromNavTree(NavTree navTree) {
      if (proxyHelper != null) {
        final NavBarHelper proxiedInstance = proxyHelper.getInstance(this);
        final TopLevelMenusBuilder retVal = proxiedInstance.buildMenusFromNavTree(navTree);
        return retVal;
      } else {
        return super.buildMenusFromNavTree(navTree);
      }
    }

    @Override public PlaceRequest resolvePlaceRequest(String perspectiveId) {
      if (proxyHelper != null) {
        final NavBarHelper proxiedInstance = proxyHelper.getInstance(this);
        final PlaceRequest retVal = proxiedInstance.resolvePlaceRequest(perspectiveId);
        return retVal;
      } else {
        return super.resolvePlaceRequest(perspectiveId);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final NavBarHelper proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavBarHelper.class, "Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavBarHelper.class, Object.class });
  }

  public NavBarHelper createInstance(final ContextManager contextManager) {
    final NavBarHelper instance = new NavBarHelper();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<NavBarHelper> proxyImpl = new Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}