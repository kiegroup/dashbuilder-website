package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.dataset.events.DataSetDefModifiedEvent;
import org.dashbuilder.dataset.events.DataSetDefRegisteredEvent;
import org.dashbuilder.dataset.events.DataSetDefRemovedEvent;
import org.dashbuilder.displayer.client.events.DataSetFilterChangedEvent;
import org.dashbuilder.displayer.client.events.DataSetGroupDateChanged;
import org.dashbuilder.displayer.client.events.DataSetLookupChangedEvent;
import org.dashbuilder.displayer.client.events.GroupFunctionChangedEvent;
import org.dashbuilder.displayer.client.events.GroupFunctionDeletedEvent;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditor;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditor.View;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetLookupEditor> { public Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataSetLookupEditor.class, "Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataSetLookupEditor.class, Object.class, IsWidget.class });
  }

  public DataSetLookupEditor createInstance(final ContextManager contextManager) {
    final Event<DataSetLookupChangedEvent> _event_5 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetLookupChangedEvent.class }, new Annotation[] { });
    final View _view_0 = (DataSetLookupEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DataSetLookupEditorView__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final DataSetGroupDateEditor _groupDateEditor_3 = (DataSetGroupDateEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default");
    final DataSetClientServices _clientServices_4 = (RuntimeDataSetClientServices) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    final DataSetFilterEditor _filterEditor_2 = (DataSetFilterEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default");
    final DataSetLookupEditor instance = new DataSetLookupEditor(_view_0, _beanManager_1, _filterEditor_2, _groupDateEditor_3, _clientServices_4, _event_5);
    registerDependentScopedReference(instance, _event_5);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _groupDateEditor_3);
    registerDependentScopedReference(instance, _filterEditor_2);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onFilterChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DataSetFilterChangedEvent", new AbstractCDIEventCallback<DataSetFilterChangedEvent>() {
      public void fireEvent(final DataSetFilterChangedEvent event) {
        DataSetLookupEditor_onFilterChanged_DataSetFilterChangedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DataSetFilterChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDateGroupChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DataSetGroupDateChanged", new AbstractCDIEventCallback<DataSetGroupDateChanged>() {
      public void fireEvent(final DataSetGroupDateChanged event) {
        DataSetLookupEditor_onDateGroupChanged_DataSetGroupDateChanged(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DataSetGroupDateChanged []";
      }
    }));
    thisInstance.setReference(instance, "onColumnFunctionChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.GroupFunctionChangedEvent", new AbstractCDIEventCallback<GroupFunctionChangedEvent>() {
      public void fireEvent(final GroupFunctionChangedEvent event) {
        DataSetLookupEditor_onColumnFunctionChanged_GroupFunctionChangedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.GroupFunctionChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onColumnFunctionDeletedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.GroupFunctionDeletedEvent", new AbstractCDIEventCallback<GroupFunctionDeletedEvent>() {
      public void fireEvent(final GroupFunctionDeletedEvent event) {
        DataSetLookupEditor_onColumnFunctionDeleted_GroupFunctionDeletedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.GroupFunctionDeletedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDataSetDefRegisteredEventSubscription", CDI.subscribe("org.dashbuilder.dataset.events.DataSetDefRegisteredEvent", new AbstractCDIEventCallback<DataSetDefRegisteredEvent>() {
      public void fireEvent(final DataSetDefRegisteredEvent event) {
        DataSetLookupEditor_onDataSetDefRegisteredEvent_DataSetDefRegisteredEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetDefRegisteredEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDataSetDefRegisteredEventSubscriptionForDataSetDefRegisteredEvent", ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetDefRegisteredEvent", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onDataSetDefModifiedEventSubscription", CDI.subscribe("org.dashbuilder.dataset.events.DataSetDefModifiedEvent", new AbstractCDIEventCallback<DataSetDefModifiedEvent>() {
      public void fireEvent(final DataSetDefModifiedEvent event) {
        DataSetLookupEditor_onDataSetDefModifiedEvent_DataSetDefModifiedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetDefModifiedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDataSetDefModifiedEventSubscriptionForDataSetDefModifiedEvent", ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetDefModifiedEvent", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onDataSetDefRemovedEventSubscription", CDI.subscribe("org.dashbuilder.dataset.events.DataSetDefRemovedEvent", new AbstractCDIEventCallback<DataSetDefRemovedEvent>() {
      public void fireEvent(final DataSetDefRemovedEvent event) {
        DataSetLookupEditor_onDataSetDefRemovedEvent_DataSetDefRemovedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.dataset.events.DataSetDefRemovedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDataSetDefRemovedEventSubscriptionForDataSetDefRemovedEvent", ErraiBus.get().subscribe("cdi.event:org.dashbuilder.dataset.events.DataSetDefRemovedEvent", CDI.ROUTING_CALLBACK));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DataSetLookupEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final DataSetLookupEditor instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onFilterChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDateGroupChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onColumnFunctionChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onColumnFunctionDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefRegisteredEventSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefRegisteredEventSubscriptionForDataSetDefRegisteredEvent", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefModifiedEventSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefModifiedEventSubscriptionForDataSetDefModifiedEvent", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefRemovedEventSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetDefRemovedEventSubscriptionForDataSetDefRemovedEvent", Subscription.class)).remove();
  }

  public native static void DataSetLookupEditor_onDataSetDefModifiedEvent_DataSetDefModifiedEvent(DataSetLookupEditor instance, DataSetDefModifiedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onDataSetDefModifiedEvent(Lorg/dashbuilder/dataset/events/DataSetDefModifiedEvent;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onFilterChanged_DataSetFilterChangedEvent(DataSetLookupEditor instance, DataSetFilterChangedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onFilterChanged(Lorg/dashbuilder/displayer/client/events/DataSetFilterChangedEvent;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onColumnFunctionDeleted_GroupFunctionDeletedEvent(DataSetLookupEditor instance, GroupFunctionDeletedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onColumnFunctionDeleted(Lorg/dashbuilder/displayer/client/events/GroupFunctionDeletedEvent;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onColumnFunctionChanged_GroupFunctionChangedEvent(DataSetLookupEditor instance, GroupFunctionChangedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onColumnFunctionChanged(Lorg/dashbuilder/displayer/client/events/GroupFunctionChangedEvent;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onDateGroupChanged_DataSetGroupDateChanged(DataSetLookupEditor instance, DataSetGroupDateChanged a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onDateGroupChanged(Lorg/dashbuilder/displayer/client/events/DataSetGroupDateChanged;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onDataSetDefRegisteredEvent_DataSetDefRegisteredEvent(DataSetLookupEditor instance, DataSetDefRegisteredEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onDataSetDefRegisteredEvent(Lorg/dashbuilder/dataset/events/DataSetDefRegisteredEvent;)(a0);
  }-*/;

  public native static void DataSetLookupEditor_onDataSetDefRemovedEvent_DataSetDefRemovedEvent(DataSetLookupEditor instance, DataSetDefRemovedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditor::onDataSetDefRemovedEvent(Lorg/dashbuilder/dataset/events/DataSetDefRemovedEvent;)(a0);
  }-*/;
}