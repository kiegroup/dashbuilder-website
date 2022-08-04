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
import org.dashbuilder.common.client.editor.ToggleSwitchEditor.View;
import org.dashbuilder.common.client.editor.ToggleSwitchEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_c_c_e_ToggleSwitchEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ToggleSwitchEditorView> { public Type_factory__o_d_c_c_e_ToggleSwitchEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ToggleSwitchEditorView.class, "Type_factory__o_d_c_c_e_ToggleSwitchEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ToggleSwitchEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public ToggleSwitchEditorView createInstance(final ContextManager contextManager) {
    final ToggleSwitchEditorView instance = new ToggleSwitchEditorView();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}