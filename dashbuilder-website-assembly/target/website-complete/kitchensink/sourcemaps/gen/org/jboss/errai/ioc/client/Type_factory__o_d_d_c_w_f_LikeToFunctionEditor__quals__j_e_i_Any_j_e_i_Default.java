package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditor;
import org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_LikeToFunctionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<LikeToFunctionEditor> { public Type_factory__o_d_d_c_w_f_LikeToFunctionEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(LikeToFunctionEditor.class, "Type_factory__o_d_d_c_w_f_LikeToFunctionEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { LikeToFunctionEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public LikeToFunctionEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (LikeToFunctionEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_LikeToFunctionEditorView__quals__j_e_i_Any_j_e_i_Default");
    final LikeToFunctionEditor instance = new LikeToFunctionEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}