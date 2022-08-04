package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navbar.GoToDashboardMenuBuilder;
import org.dashbuilder.client.navbar.MenuBuilderHelper;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.workbench.model.menu.MenuFactory.CustomMenuBuilder;
import org.uberfire.workbench.model.menu.MenuItem;

public class Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<GoToDashboardMenuBuilder> { private class Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends GoToDashboardMenuBuilder implements Proxy<GoToDashboardMenuBuilder> {
    private final ProxyHelper<GoToDashboardMenuBuilder> proxyHelper = new ProxyHelperImpl<GoToDashboardMenuBuilder>("Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final GoToDashboardMenuBuilder instance) {

    }

    public GoToDashboardMenuBuilder asBeanType() {
      return this;
    }

    public void setInstance(final GoToDashboardMenuBuilder instance) {
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
        final GoToDashboardMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.push(element);
      } else {
        super.push(element);
      }
    }

    @Override public MenuItem build() {
      if (proxyHelper != null) {
        final GoToDashboardMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        final MenuItem retVal = proxiedInstance.build();
        return retVal;
      } else {
        return super.build();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final GoToDashboardMenuBuilder proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(GoToDashboardMenuBuilder.class, "Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { GoToDashboardMenuBuilder.class, Object.class, CustomMenuBuilder.class });
  }

  public GoToDashboardMenuBuilder createInstance(final ContextManager contextManager) {
    final GoToDashboardMenuBuilder instance = new GoToDashboardMenuBuilder();
    setIncompleteInstance(instance);
    final PerspectiveManagerImpl GoToDashboardMenuBuilder_perspectiveManager = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    GoToDashboardMenuBuilder_PerspectiveManager_perspectiveManager(instance, GoToDashboardMenuBuilder_perspectiveManager);
    final MenuBuilderHelper GoToDashboardMenuBuilder_menuBuilderHelper = (MenuBuilderHelper) contextManager.getInstance("Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default");
    GoToDashboardMenuBuilder_MenuBuilderHelper_menuBuilderHelper(instance, GoToDashboardMenuBuilder_menuBuilderHelper);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<GoToDashboardMenuBuilder> proxyImpl = new Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PerspectiveManager GoToDashboardMenuBuilder_PerspectiveManager_perspectiveManager(GoToDashboardMenuBuilder instance) /*-{
    return instance.@org.dashbuilder.client.navbar.GoToDashboardMenuBuilder::perspectiveManager;
  }-*/;

  native static void GoToDashboardMenuBuilder_PerspectiveManager_perspectiveManager(GoToDashboardMenuBuilder instance, PerspectiveManager value) /*-{
    instance.@org.dashbuilder.client.navbar.GoToDashboardMenuBuilder::perspectiveManager = value;
  }-*/;

  native static MenuBuilderHelper GoToDashboardMenuBuilder_MenuBuilderHelper_menuBuilderHelper(GoToDashboardMenuBuilder instance) /*-{
    return instance.@org.dashbuilder.client.navbar.GoToDashboardMenuBuilder::menuBuilderHelper;
  }-*/;

  native static void GoToDashboardMenuBuilder_MenuBuilderHelper_menuBuilderHelper(GoToDashboardMenuBuilder instance, MenuBuilderHelper value) /*-{
    instance.@org.dashbuilder.client.navbar.GoToDashboardMenuBuilder::menuBuilderHelper = value;
  }-*/;
}