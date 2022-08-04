package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.events.DisplayerTypeSelectedEvent;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelector;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelector;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelector.View;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerTypeSelector> { public Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerTypeSelector.class, "Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerTypeSelector.class, Object.class, IsWidget.class });
  }

  public DisplayerTypeSelector createInstance(final ContextManager contextManager) {
    final RendererManager _rendererManager_3 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final Event<DisplayerTypeSelectedEvent> _typeSelectedEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerTypeSelectedEvent.class }, new Annotation[] { });
    final DisplayerSubtypeSelector _subtypeSelector_1 = (DisplayerSubtypeSelector) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (DisplayerTypeSelectorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerTypeSelectorView__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerTypeSelector instance = new DisplayerTypeSelector(_view_0, _subtypeSelector_1, _typeSelectedEvent_2, _rendererManager_3);
    registerDependentScopedReference(instance, _typeSelectedEvent_2);
    registerDependentScopedReference(instance, _subtypeSelector_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}