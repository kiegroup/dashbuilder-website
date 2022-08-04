package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.displayer.client.events.ColumnFilterChangedEvent;
import org.dashbuilder.displayer.client.events.ColumnFilterDeletedEvent;
import org.dashbuilder.displayer.client.events.DataSetFilterChangedEvent;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor.View;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetFilterEditor> { public Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataSetFilterEditor.class, "Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataSetFilterEditor.class, Object.class, IsWidget.class });
  }

  public DataSetFilterEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (DataSetFilterEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_f_DataSetFilterEditorView__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final Event<DataSetFilterChangedEvent> _changeEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetFilterChangedEvent.class }, new Annotation[] { });
    final DataSetFilterEditor instance = new DataSetFilterEditor(_view_0, _beanManager_1, _changeEvent_2);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _changeEvent_2);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onColumnFilterChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.ColumnFilterChangedEvent", new AbstractCDIEventCallback<ColumnFilterChangedEvent>() {
      public void fireEvent(final ColumnFilterChangedEvent event) {
        DataSetFilterEditor_onColumnFilterChanged_ColumnFilterChangedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.ColumnFilterChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onColumnFilterDeletedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.ColumnFilterDeletedEvent", new AbstractCDIEventCallback<ColumnFilterDeletedEvent>() {
      public void fireEvent(final ColumnFilterDeletedEvent event) {
        DataSetFilterEditor_onColumnFilterDeleted_ColumnFilterDeletedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.ColumnFilterDeletedEvent []";
      }
    }));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DataSetFilterEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final DataSetFilterEditor instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onColumnFilterChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onColumnFilterDeletedSubscription", Subscription.class)).remove();
  }

  public native static void DataSetFilterEditor_onColumnFilterDeleted_ColumnFilterDeletedEvent(DataSetFilterEditor instance, ColumnFilterDeletedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor::onColumnFilterDeleted(Lorg/dashbuilder/displayer/client/events/ColumnFilterDeletedEvent;)(a0);
  }-*/;

  public native static void DataSetFilterEditor_onColumnFilterChanged_ColumnFilterChangedEvent(DataSetFilterEditor instance, ColumnFilterChangedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor::onColumnFilterChanged(Lorg/dashbuilder/displayer/client/events/ColumnFilterChangedEvent;)(a0);
  }-*/;
}