package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerSettingsJSONSourceViewer__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsJSONSourceViewer> { public Type_factory__o_d_d_c_w_DisplayerSettingsJSONSourceViewer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerSettingsJSONSourceViewer.class, "Type_factory__o_d_d_c_w_DisplayerSettingsJSONSourceViewer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerSettingsJSONSourceViewer.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public DisplayerSettingsJSONSourceViewer createInstance(final ContextManager contextManager) {
    final DisplayerSettingsJSONSourceViewer instance = new DisplayerSettingsJSONSourceViewer();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}