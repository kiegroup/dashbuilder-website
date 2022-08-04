package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.BaseNavWidget;
import org.dashbuilder.client.navigation.widget.HasDefaultNavItem;
import org.dashbuilder.client.navigation.widget.HasTargetDiv;
import org.dashbuilder.client.navigation.widget.NavTreeWidget;
import org.dashbuilder.client.navigation.widget.NavTreeWidget.View;
import org.dashbuilder.client.navigation.widget.NavTreeWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidget;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidget;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.navigation.event.NavTreeChangedEvent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.plugin.event.PluginSaved;

public class Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidget> { public Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTreeWidget.class, "Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTreeWidget.class, TargetDivNavWidget.class, BaseNavWidget.class, Object.class, NavWidget.class, IsWidget.class, HasTargetDiv.class, HasDefaultNavItem.class });
  }

  public NavTreeWidget createInstance(final ContextManager contextManager) {
    final View _view_0 = (NavTreeWidgetView) contextManager.getInstance("Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final PerspectivePluginManager _pluginManager_2 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_3 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final NavigationManager _navigationManager_4 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final NavTreeWidget instance = new NavTreeWidget(_view_0, _beanManager_1, _pluginManager_2, _placeManager_3, _navigationManager_4);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _beanManager_1);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onPluginSavedSubscription", CDI.subscribe("org.uberfire.ext.plugin.event.PluginSaved", new AbstractCDIEventCallback<PluginSaved>() {
      public void fireEvent(final PluginSaved event) {
        TargetDivNavWidget_onPluginSaved_PluginSaved(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginSaved []";
      }
    }));
    thisInstance.setReference(instance, "onPluginSavedSubscriptionForPluginSaved", ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginSaved", CDI.ROUTING_CALLBACK));
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
    destroyInstanceHelper((NavTreeWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTreeWidget instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onPluginSavedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onPluginSavedSubscriptionForPluginSaved", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onNavTreeChangedSubscriptionForNavTreeChangedEvent", Subscription.class)).remove();
  }

  public native static void TargetDivNavWidget_onPluginSaved_PluginSaved(TargetDivNavWidget instance, PluginSaved a0) /*-{
    instance.@org.dashbuilder.client.navigation.widget.TargetDivNavWidget::onPluginSaved(Lorg/uberfire/ext/plugin/event/PluginSaved;)(a0);
  }-*/;
}