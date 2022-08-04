package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor.View;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnDetailsEditor> { public Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ColumnDetailsEditor.class, "Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ColumnDetailsEditor.class, Object.class, IsWidget.class });
  }

  public ColumnDetailsEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (ColumnDetailsEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_g_ColumnDetailsEditorView__quals__j_e_i_Any_j_e_i_Default");
    final ColumnDetailsEditor instance = new ColumnDetailsEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}