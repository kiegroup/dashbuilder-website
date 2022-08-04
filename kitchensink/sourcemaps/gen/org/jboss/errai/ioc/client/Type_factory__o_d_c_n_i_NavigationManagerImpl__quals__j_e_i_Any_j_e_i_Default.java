package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.event.NavItemGotoEvent;
import org.dashbuilder.client.navigation.event.NavTreeLoadedEvent;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.navigation.NavItem;
import org.dashbuilder.navigation.NavTree;
import org.dashbuilder.navigation.event.NavTreeChangedEvent;
import org.dashbuilder.navigation.service.NavigationServices;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.mvp.Command;

public class Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationManagerImpl> { private class Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends NavigationManagerImpl implements Proxy<NavigationManagerImpl> {
    private final ProxyHelper<NavigationManagerImpl> proxyHelper = new ProxyHelperImpl<NavigationManagerImpl>("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null, null, null);
    }

    public void initProxyProperties(final NavigationManagerImpl instance) {

    }

    public NavigationManagerImpl asBeanType() {
      return this;
    }

    public void setInstance(final NavigationManagerImpl instance) {
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

    @Override public void init(Command afterInit) {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init(afterInit);
      } else {
        super.init(afterInit);
      }
    }

    @Override public NavTree getDefaultNavTree() {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final NavTree retVal = proxiedInstance.getDefaultNavTree();
        return retVal;
      } else {
        return super.getDefaultNavTree();
      }
    }

    @Override public void setDefaultNavTree(NavTree defaultNavTree) {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDefaultNavTree(defaultNavTree);
      } else {
        super.setDefaultNavTree(defaultNavTree);
      }
    }

    @Override public NavTree getNavTree() {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final NavTree retVal = proxiedInstance.getNavTree();
        return retVal;
      } else {
        return super.getNavTree();
      }
    }

    @Override public boolean hasNavTree() {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.hasNavTree();
        return retVal;
      } else {
        return super.hasNavTree();
      }
    }

    @Override public void saveNavTree(NavTree newTree, Command afterSave) {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.saveNavTree(newTree, afterSave);
      } else {
        super.saveNavTree(newTree, afterSave);
      }
    }

    @Override public void navItemClicked(NavItem navItem) {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.navItemClicked(navItem);
      } else {
        super.navItemClicked(navItem);
      }
    }

    @Override public void update(NavTree navTree) {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.update(navTree);
      } else {
        super.update(navTree);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final NavigationManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavigationManagerImpl.class, "Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavigationManagerImpl.class, Object.class, NavigationManager.class });
  }

  public NavigationManagerImpl createInstance(final ContextManager contextManager) {
    final Event<NavTreeLoadedEvent> _navTreeLoadedEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavTreeLoadedEvent.class }, new Annotation[] { });
    final Caller<NavigationServices> _navServices_0 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { NavigationServices.class }, new Annotation[] { });
    final Event<NavItemGotoEvent> _navItemGotoEvent_3 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavItemGotoEvent.class }, new Annotation[] { });
    final Event<NavTreeChangedEvent> _navTreeChangedEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavTreeChangedEvent.class }, new Annotation[] { });
    final NavigationManagerImpl instance = new NavigationManagerImpl(_navServices_0, _navTreeLoadedEvent_1, _navTreeChangedEvent_2, _navItemGotoEvent_3);
    registerDependentScopedReference(instance, _navTreeLoadedEvent_1);
    registerDependentScopedReference(instance, _navServices_0);
    registerDependentScopedReference(instance, _navItemGotoEvent_3);
    registerDependentScopedReference(instance, _navTreeChangedEvent_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.dashbuilder.client.navigation.impl.NavigationManagerImpl an exception was thrown from this constructor: @javax.inject.Inject()  public org.dashbuilder.client.navigation.impl.NavigationManagerImpl ([org.jboss.errai.common.client.api.Caller, javax.enterprise.event.Event, javax.enterprise.event.Event, javax.enterprise.event.Event])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<NavigationManagerImpl> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}