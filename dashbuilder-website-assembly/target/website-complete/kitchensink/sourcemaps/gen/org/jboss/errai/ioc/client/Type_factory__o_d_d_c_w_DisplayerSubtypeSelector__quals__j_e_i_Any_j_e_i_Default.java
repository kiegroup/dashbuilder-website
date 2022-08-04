package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.events.DisplayerSubtypeSelectedEvent;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelector;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelector.View;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelectorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSubtypeSelector> { public Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerSubtypeSelector.class, "Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerSubtypeSelector.class, Object.class, IsWidget.class });
  }

  public DisplayerSubtypeSelector createInstance(final ContextManager contextManager) {
    final Event<DisplayerSubtypeSelectedEvent> _selectEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerSubtypeSelectedEvent.class }, new Annotation[] { });
    final RendererManager _rendererManager_1 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (DisplayerSubtypeSelectorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerSubtypeSelectorView__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerSubtypeSelector instance = new DisplayerSubtypeSelector(_view_0, _rendererManager_1, _selectEvent_2);
    registerDependentScopedReference(instance, _selectEvent_2);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}