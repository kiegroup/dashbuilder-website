package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeAmountEditor> { public Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TimeAmountEditor.class, "Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TimeAmountEditor.class, Object.class, IsWidget.class });
  }

  public TimeAmountEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (TimeAmountEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_TimeAmountEditorView__quals__j_e_i_Any_j_e_i_Default");
    final TimeAmountEditor instance = new TimeAmountEditor(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}