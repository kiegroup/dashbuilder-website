package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_f_TimeInstantEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeInstantEditor> { public Type_factory__o_d_d_c_w_f_TimeInstantEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TimeInstantEditor.class, "Type_factory__o_d_d_c_w_f_TimeInstantEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TimeInstantEditor.class, Object.class, IsWidget.class });
  }

  public TimeInstantEditor createInstance(final ContextManager contextManager) {
    final TimeAmountEditor _timeAmountEditor_1 = (TimeAmountEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (TimeInstantEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_TimeInstantEditorView__quals__j_e_i_Any_j_e_i_Default");
    final TimeInstantEditor instance = new TimeInstantEditor(_view_0, _timeAmountEditor_1);
    registerDependentScopedReference(instance, _timeAmountEditor_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}