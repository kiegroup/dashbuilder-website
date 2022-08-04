package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DateParameterEditor> { public Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DateParameterEditor.class, "Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DateParameterEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public DateParameterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (DateParameterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_DateParameterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final DateParameterEditor instance = new DateParameterEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}