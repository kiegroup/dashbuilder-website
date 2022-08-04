package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.TextParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.TextParameterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.TextParameterEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_TextParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TextParameterEditor> { public Type_factory__o_d_d_c_w_f_TextParameterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TextParameterEditor.class, "Type_factory__o_d_d_c_w_f_TextParameterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TextParameterEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public TextParameterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (TextParameterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_TextParameterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final TextParameterEditor instance = new TextParameterEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}