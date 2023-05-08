package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.widget.BaseNavWidget;
import org.dashbuilder.client.navigation.widget.NavDropDownWidget;
import org.dashbuilder.client.navigation.widget.NavDropDownWidget.View;
import org.dashbuilder.client.navigation.widget.NavDropDownWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidget;
import org.dashbuilder.navigation.event.NavTreeChangedEvent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidget> { public Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavDropDownWidget.class, "Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavDropDownWidget.class, BaseNavWidget.class, Object.class, NavWidget.class, IsWidget.class });
  }

  public NavDropDownWidget createInstance(final ContextManager contextManager) {
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final NavigationManager _navigationManager_2 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (NavDropDownWidgetView) contextManager.getInstance("Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default");
    final NavDropDownWidget instance = new NavDropDownWidget(_view_0, _beanManager_1, _navigationManager_2);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onNavTreeChangedSubscription", CDI.subscribe("org.dashbuilder.navigation.event.NavTreeChangedEvent", new AbstractCDIEventCallback<NavTreeChangedEvent>() {
      public void fireEvent(final NavTreeChangedEvent event) {
        instance.onNavTreeChanged(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.navigation.event.NavTreeChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onNavTreeChangedSubscriptionForNavTreeChangedEvent", ErraiBus.get().subscribe("cdi.event:org.dashbuilder.navigation.event.NavTreeChangedEvent", CDI.ROUTING_CALLBACK));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavDropDownWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavDropDownWidget instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscriptionForNavTreeChangedEvent", Subscription.class)).remove();
  }
}