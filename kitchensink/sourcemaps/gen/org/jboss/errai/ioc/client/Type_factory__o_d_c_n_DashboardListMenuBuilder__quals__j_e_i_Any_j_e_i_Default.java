package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navbar.DashboardListMenuBuilder;
import org.dashbuilder.client.navbar.MenuBuilderHelper;
import org.dashbuilder.client.screens.RouterScreen;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.model.menu.MenuFactory.CustomMenuBuilder;
import org.uberfire.workbench.model.menu.MenuItem;

public class Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardListMenuBuilder> { private class Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DashboardListMenuBuilder implements Proxy<DashboardListMenuBuilder> {
    private final ProxyHelper<DashboardListMenuBuilder> proxyHelper = new ProxyHelperImpl<DashboardListMenuBuilder>("Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DashboardListMenuBuilder instance) {

    }

    public DashboardListMenuBuilder asBeanType() {
      return this;
    }

    public void setInstance(final DashboardListMenuBuilder instance) {
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

    @Override public void push(CustomMenuBuilder element) {
      if (proxyHelper != null) {
        final DashboardListMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.push(element);
      } else {
        super.push(element);
      }
    }

    @Override public MenuItem build() {
      if (proxyHelper != null) {
        final DashboardListMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        final MenuItem retVal = proxiedInstance.build();
        return retVal;
      } else {
        return super.build();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DashboardListMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DashboardListMenuBuilder.class, "Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DashboardListMenuBuilder.class, Object.class, CustomMenuBuilder.class });
  }

  public DashboardListMenuBuilder createInstance(final ContextManager contextManager) {
    final DashboardListMenuBuilder instance = new DashboardListMenuBuilder();
    setIncompleteInstance(instance);
    final MenuBuilderHelper DashboardListMenuBuilder_menuBuilderHelper = (MenuBuilderHelper) contextManager.getInstance("Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default");
    DashboardListMenuBuilder_MenuBuilderHelper_menuBuilderHelper(instance, DashboardListMenuBuilder_menuBuilderHelper);
    final RouterScreen DashboardListMenuBuilder_router = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    DashboardListMenuBuilder_RouterScreen_router(instance, DashboardListMenuBuilder_router);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DashboardListMenuBuilder> proxyImpl = new Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static RouterScreen DashboardListMenuBuilder_RouterScreen_router(DashboardListMenuBuilder instance) /*-{
    return instance.@org.dashbuilder.client.navbar.DashboardListMenuBuilder::router;
  }-*/;

  native static void DashboardListMenuBuilder_RouterScreen_router(DashboardListMenuBuilder instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.navbar.DashboardListMenuBuilder::router = value;
  }-*/;

  native static MenuBuilderHelper DashboardListMenuBuilder_MenuBuilderHelper_menuBuilderHelper(DashboardListMenuBuilder instance) /*-{
    return instance.@org.dashbuilder.client.navbar.DashboardListMenuBuilder::menuBuilderHelper;
  }-*/;

  native static void DashboardListMenuBuilder_MenuBuilderHelper_menuBuilderHelper(DashboardListMenuBuilder instance, MenuBuilderHelper value) /*-{
    instance.@org.dashbuilder.client.navbar.DashboardListMenuBuilder::menuBuilderHelper = value;
  }-*/;
}