package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.events.GroupFunctionChangedEvent;
import org.dashbuilder.displayer.client.events.GroupFunctionDeletedEvent;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor;
import org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditor;
import org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditor.View;
import org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_g_ColumnFunctionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFunctionEditor> { public Type_factory__o_d_d_c_w_g_ColumnFunctionEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ColumnFunctionEditor.class, "Type_factory__o_d_d_c_w_g_ColumnFunctionEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ColumnFunctionEditor.class, Object.class, IsWidget.class });
  }

  public ColumnFunctionEditor createInstance(final ContextManager contextManager) {
    final Event<GroupFunctionDeletedEvent> _deleteEvent_3 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GroupFunctionDeletedEvent.class }, new Annotation[] { });
    final View _view_0 = (ColumnFunctionEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_g_ColumnFunctionEditorView__quals__j_e_i_Any_j_e_i_Default");
    final ColumnDetailsEditor _columnDetailsEditor_1 = (ColumnDetailsEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default");
    final Event<GroupFunctionChangedEvent> _changeEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GroupFunctionChangedEvent.class }, new Annotation[] { });
    final ColumnFunctionEditor instance = new ColumnFunctionEditor(_view_0, _columnDetailsEditor_1, _changeEvent_2, _deleteEvent_3);
    registerDependentScopedReference(instance, _deleteEvent_3);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _columnDetailsEditor_1);
    registerDependentScopedReference(instance, _changeEvent_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}