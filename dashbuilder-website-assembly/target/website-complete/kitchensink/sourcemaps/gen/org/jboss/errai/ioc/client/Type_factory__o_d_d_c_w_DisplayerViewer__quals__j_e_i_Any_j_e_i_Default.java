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
import org.dashbuilder.displayer.client.DisplayerLocator;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.dashbuilder.displayer.client.widgets.RendererSelector;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerViewer> { public Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerViewer.class, "Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerViewer.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public DisplayerViewer createInstance(final ContextManager contextManager) {
    final RendererSelector _rendererSelector_1 = (RendererSelector) contextManager.getInstance("Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerLocator _displayerLocator_0 = (DisplayerLocator) contextManager.getInstance("Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerViewer instance = new DisplayerViewer(_displayerLocator_0, _rendererSelector_1);
    registerDependentScopedReference(instance, _rendererSelector_1);
    setIncompleteInstance(instance);
    final DisplayerErrorWidget DisplayerViewer_errorWidget = (DisplayerErrorWidget) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DisplayerViewer_errorWidget);
    DisplayerViewer_DisplayerErrorWidget_errorWidget(instance, DisplayerViewer_errorWidget);
    setIncompleteInstance(null);
    return instance;
  }

  native static DisplayerErrorWidget DisplayerViewer_DisplayerErrorWidget_errorWidget(DisplayerViewer instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerViewer::errorWidget;
  }-*/;

  native static void DisplayerViewer_DisplayerErrorWidget_errorWidget(DisplayerViewer instance, DisplayerErrorWidget value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerViewer::errorWidget = value;
  }-*/;
}