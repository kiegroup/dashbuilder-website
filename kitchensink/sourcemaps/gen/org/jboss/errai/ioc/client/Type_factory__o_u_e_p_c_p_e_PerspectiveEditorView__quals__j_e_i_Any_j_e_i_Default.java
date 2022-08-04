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
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;
import org.uberfire.ext.editor.commons.client.BaseEditorView;
import org.uberfire.ext.editor.commons.client.BaseEditorViewImpl;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter.View;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView;
import org.uberfire.ext.widgets.common.client.common.HasBusyIndicator;

public class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorView> { public Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorView.class, "Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorView.class, BaseEditorViewImpl.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, BaseEditorView.class, HasBusyIndicator.class, View.class, UberView.class, HasPresenter.class });
  }

  public PerspectiveEditorView createInstance(final ContextManager contextManager) {
    final PerspectiveEditorView instance = new PerspectiveEditorView();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final PerspectiveEditorView instance) {
    instance.setup();
  }
}