package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleTextParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleTextParameterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.MultipleTextParameterEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_MultipleTextParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleTextParameterEditor> { public Type_factory__o_d_d_c_w_f_MultipleTextParameterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MultipleTextParameterEditor.class, "Type_factory__o_d_d_c_w_f_MultipleTextParameterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MultipleTextParameterEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public MultipleTextParameterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (MultipleTextParameterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_MultipleTextParameterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final MultipleTextParameterEditor instance = new MultipleTextParameterEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}