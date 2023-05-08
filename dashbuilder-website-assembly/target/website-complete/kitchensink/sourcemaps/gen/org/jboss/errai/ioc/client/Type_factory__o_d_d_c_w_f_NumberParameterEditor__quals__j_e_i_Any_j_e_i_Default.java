package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NumberParameterEditor> { public Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NumberParameterEditor.class, "Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NumberParameterEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public NumberParameterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (NumberParameterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_NumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final NumberParameterEditor instance = new NumberParameterEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}