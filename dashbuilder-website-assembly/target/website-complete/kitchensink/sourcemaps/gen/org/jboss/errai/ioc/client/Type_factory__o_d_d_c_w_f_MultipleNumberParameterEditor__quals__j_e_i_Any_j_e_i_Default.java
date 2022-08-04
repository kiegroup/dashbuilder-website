package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleNumberParameterEditor> { public Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MultipleNumberParameterEditor.class, "Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MultipleNumberParameterEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public MultipleNumberParameterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (MultipleNumberParameterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final MultipleNumberParameterEditor instance = new MultipleNumberParameterEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}