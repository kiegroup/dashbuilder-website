package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.DisplayerLocator;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsEditor> { public Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerSettingsEditor.class, "Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerSettingsEditor.class, Object.class, IsWidget.class });
  }

  public DisplayerSettingsEditor createInstance(final ContextManager contextManager) {
    final RendererManager _rendererManager_2 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerLocator _displayerLocator_1 = (DisplayerLocator) contextManager.getInstance("Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (DisplayerSettingsEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<DisplayerSettingsChangedEvent> _settingsChangedEvent_3 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerSettingsChangedEvent.class }, new Annotation[] { });
    final DisplayerSettingsEditor instance = new DisplayerSettingsEditor(_view_0, _displayerLocator_1, _rendererManager_2, _settingsChangedEvent_3);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _settingsChangedEvent_3);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}