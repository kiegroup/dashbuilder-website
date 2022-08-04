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
import org.dashbuilder.displayer.client.widgets.DisplayerEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorView> { public Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerEditorView.class, "Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public DisplayerEditorView createInstance(final ContextManager contextManager) {
    final DisplayerEditorView instance = new DisplayerEditorView();
    setIncompleteInstance(instance);
    final DisplayerErrorWidget DisplayerEditorView_errorWidget = (DisplayerErrorWidget) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DisplayerEditorView_errorWidget);
    DisplayerEditorView_DisplayerErrorWidget_errorWidget(instance, DisplayerEditorView_errorWidget);
    setIncompleteInstance(null);
    return instance;
  }

  native static DisplayerErrorWidget DisplayerEditorView_DisplayerErrorWidget_errorWidget(DisplayerEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditorView::errorWidget;
  }-*/;

  native static void DisplayerEditorView_DisplayerErrorWidget_errorWidget(DisplayerEditorView instance, DisplayerErrorWidget value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditorView::errorWidget = value;
  }-*/;
}