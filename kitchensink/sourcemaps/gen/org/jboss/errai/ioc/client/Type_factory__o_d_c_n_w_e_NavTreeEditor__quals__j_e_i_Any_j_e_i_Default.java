package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.event.NavItemEditCancelledEvent;
import org.dashbuilder.client.navigation.event.NavItemEditStartedEvent;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditor;
import org.dashbuilder.client.navigation.widget.editor.NavTreeEditor;
import org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.common.client.widgets.LoadingBox;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;

public class Type_factory__o_d_c_n_w_e_NavTreeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeEditor> { public Type_factory__o_d_c_n_w_e_NavTreeEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTreeEditor.class, "Type_factory__o_d_c_n_w_e_NavTreeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTreeEditor.class, NavItemEditor.class, Object.class, IsElement.class });
  }

  public NavTreeEditor createInstance(final ContextManager contextManager) {
    final PerspectivePluginManager _perspectivePluginManager_5 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final Event<NavItemEditCancelledEvent> _navItemEditCancelledEvent_7 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavItemEditCancelledEvent.class }, new Annotation[] { });
    final LoadingBox _loadingBox_8 = (LoadingBox) contextManager.getInstance("Type_factory__o_d_c_c_w_LoadingBox__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_3 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final TargetPerspectiveEditor _targetPerspectiveEditor_4 = (TargetPerspectiveEditor) contextManager.getInstance("Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default");
    final NavigationManager _navigationManager_1 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_2 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final Event<NavItemEditStartedEvent> _navItemEditStartedEvent_6 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavItemEditStartedEvent.class }, new Annotation[] { });
    final NavTreeEditorView _view_0 = (NavTreeEditorView) contextManager.getInstance("Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default");
    final NavTreeEditor instance = new NavTreeEditor(_view_0, _navigationManager_1, _beanManager_2, _placeManager_3, _targetPerspectiveEditor_4, _perspectivePluginManager_5, _navItemEditStartedEvent_6, _navItemEditCancelledEvent_7, _loadingBox_8);
    registerDependentScopedReference(instance, _navItemEditCancelledEvent_7);
    registerDependentScopedReference(instance, _targetPerspectiveEditor_4);
    registerDependentScopedReference(instance, _beanManager_2);
    registerDependentScopedReference(instance, _navItemEditStartedEvent_6);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onItemEditStartedSubscription", CDI.subscribeLocal("org.dashbuilder.client.navigation.event.NavItemEditStartedEvent", new AbstractCDIEventCallback<NavItemEditStartedEvent>() {
      public void fireEvent(final NavItemEditStartedEvent event) {
        NavTreeEditor_onItemEditStarted_NavItemEditStartedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.client.navigation.event.NavItemEditStartedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onItemEditCancelledSubscription", CDI.subscribeLocal("org.dashbuilder.client.navigation.event.NavItemEditCancelledEvent", new AbstractCDIEventCallback<NavItemEditCancelledEvent>() {
      public void fireEvent(final NavItemEditCancelledEvent event) {
        NavTreeEditor_onItemEditCancelled_NavItemEditCancelledEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.client.navigation.event.NavItemEditCancelledEvent []";
      }
    }));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTreeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTreeEditor instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onItemEditStartedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onItemEditCancelledSubscription", Subscription.class)).remove();
  }

  public native static void NavTreeEditor_onItemEditCancelled_NavItemEditCancelledEvent(NavTreeEditor instance, NavItemEditCancelledEvent a0) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditor::onItemEditCancelled(Lorg/dashbuilder/client/navigation/event/NavItemEditCancelledEvent;)(a0);
  }-*/;

  public native static void NavTreeEditor_onItemEditStarted_NavItemEditStartedEvent(NavTreeEditor instance, NavItemEditStartedEvent a0) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditor::onItemEditStarted(Lorg/dashbuilder/client/navigation/event/NavItemEditStartedEvent;)(a0);
  }-*/;
}