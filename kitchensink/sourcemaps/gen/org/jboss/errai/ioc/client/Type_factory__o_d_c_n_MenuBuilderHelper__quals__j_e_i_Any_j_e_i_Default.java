package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navbar.MenuBuilderHelper;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.mvp.Command;
import org.uberfire.workbench.model.menu.MenuItem;

public class Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<MenuBuilderHelper> { private class Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends MenuBuilderHelper implements Proxy<MenuBuilderHelper> {
    private final ProxyHelper<MenuBuilderHelper> proxyHelper = new ProxyHelperImpl<MenuBuilderHelper>("Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final MenuBuilderHelper instance) {

    }

    public MenuBuilderHelper asBeanType() {
      return this;
    }

    public void setInstance(final MenuBuilderHelper instance) {
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

    @Override public MenuItem buildMenuItem(String title, IconType icon, Command action) {
      if (proxyHelper != null) {
        final MenuBuilderHelper proxiedInstance = proxyHelper.getInstance(this);
        final MenuItem retVal = proxiedInstance.buildMenuItem(title, icon, action);
        return retVal;
      } else {
        return super.buildMenuItem(title, icon, action);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final MenuBuilderHelper proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MenuBuilderHelper.class, "Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MenuBuilderHelper.class, Object.class });
  }

  public MenuBuilderHelper createInstance(final ContextManager contextManager) {
    final MenuBuilderHelper instance = new MenuBuilderHelper();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<MenuBuilderHelper> proxyImpl = new Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}