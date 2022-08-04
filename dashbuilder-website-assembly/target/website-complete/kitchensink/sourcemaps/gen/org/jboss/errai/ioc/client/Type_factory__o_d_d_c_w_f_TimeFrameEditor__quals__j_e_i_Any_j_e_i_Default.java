package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.filter.FunctionParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_w_f_TimeFrameEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeFrameEditor> { public Type_factory__o_d_d_c_w_f_TimeFrameEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TimeFrameEditor.class, "Type_factory__o_d_d_c_w_f_TimeFrameEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TimeFrameEditor.class, Object.class, FunctionParameterEditor.class, IsWidget.class });
  }

  public TimeFrameEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (TimeFrameEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_TimeFrameEditorView__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final TimeFrameEditor instance = new TimeFrameEditor(_view_0, _beanManager_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _beanManager_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}