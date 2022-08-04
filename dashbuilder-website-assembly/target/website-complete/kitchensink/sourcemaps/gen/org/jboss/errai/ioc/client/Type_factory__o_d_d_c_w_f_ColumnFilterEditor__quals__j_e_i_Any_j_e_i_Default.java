package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.events.ColumnFilterChangedEvent;
import org.dashbuilder.displayer.client.events.ColumnFilterDeletedEvent;
import org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditor;
import org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_w_f_ColumnFilterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFilterEditor> { public Type_factory__o_d_d_c_w_f_ColumnFilterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ColumnFilterEditor.class, "Type_factory__o_d_d_c_w_f_ColumnFilterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ColumnFilterEditor.class, Object.class, IsWidget.class });
  }

  public ColumnFilterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (ColumnFilterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_ColumnFilterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<ColumnFilterDeletedEvent> _deletedEvent_3 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ColumnFilterDeletedEvent.class }, new Annotation[] { });
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final Event<ColumnFilterChangedEvent> _changedEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ColumnFilterChangedEvent.class }, new Annotation[] { });
    final ColumnFilterEditor instance = new ColumnFilterEditor(_view_0, _beanManager_1, _changedEvent_2, _deletedEvent_3);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _deletedEvent_3);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _changedEvent_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}