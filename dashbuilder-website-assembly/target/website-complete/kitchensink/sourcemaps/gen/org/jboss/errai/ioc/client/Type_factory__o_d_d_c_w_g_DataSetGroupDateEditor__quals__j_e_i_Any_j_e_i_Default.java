package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.events.DataSetGroupDateChanged;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor.View;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetGroupDateEditor> { public Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataSetGroupDateEditor.class, "Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataSetGroupDateEditor.class, Object.class, IsWidget.class });
  }

  public DataSetGroupDateEditor createInstance(final ContextManager contextManager) {
    final Event<DataSetGroupDateChanged> _changeEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetGroupDateChanged.class }, new Annotation[] { });
    final View _view_0 = (DataSetGroupDateEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_g_DataSetGroupDateEditorView__quals__j_e_i_Any_j_e_i_Default");
    final DataSetGroupDateEditor instance = new DataSetGroupDateEditor(_view_0, _changeEvent_1);
    registerDependentScopedReference(instance, _changeEvent_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}