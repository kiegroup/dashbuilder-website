package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.displayer.client.DisplayerLocator;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.events.DataSetLookupChangedEvent;
import org.dashbuilder.displayer.client.events.DisplayerEditorClosedEvent;
import org.dashbuilder.displayer.client.events.DisplayerEditorSavedEvent;
import org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent;
import org.dashbuilder.displayer.client.events.DisplayerSubtypeSelectedEvent;
import org.dashbuilder.displayer.client.events.DisplayerTypeSelectedEvent;
import org.dashbuilder.displayer.client.prototypes.DisplayerPrototypes;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorStatus;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelector;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditor> { public Type_factory__o_d_d_c_w_DisplayerEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerEditor.class, "Type_factory__o_d_d_c_w_DisplayerEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerEditor.class, Object.class, IsWidget.class });
  }

  public DisplayerEditor createInstance(final ContextManager contextManager) {
    final ExternalComponentPropertiesEditor _externalComponentPropertiesEditor_12 = (ExternalComponentPropertiesEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerPrototypes _displayerPrototypes_3 = (DisplayerPrototypes) contextManager.getInstance("Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default");
    final Event<DisplayerSettingsChangedEvent> _displayerSettingsChangedEvent_13 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerSettingsChangedEvent.class }, new Annotation[] { });
    final DisplayerLocator _displayerLocator_2 = (DisplayerLocator) contextManager.getInstance("Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (DisplayerEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerTypeSelector _typeSelector_4 = (DisplayerTypeSelector) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default");
    final DataSetLookupEditor _lookupEditor_5 = (DataSetLookupEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerEditorStatus _editorStatus_7 = (DisplayerEditorStatus) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerSettingsEditor _settingsEditor_6 = (DisplayerSettingsEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerHtmlEditor _displayerHtmlEditor_8 = (DisplayerHtmlEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default");
    final RendererManager _rendererManager_11 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final DataSetClientServices _clientServices_1 = (RuntimeDataSetClientServices) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    final Event<DisplayerEditorSavedEvent> _savedEvent_9 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerEditorSavedEvent.class }, new Annotation[] { });
    final Event<DisplayerEditorClosedEvent> _closedEvent_10 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerEditorClosedEvent.class }, new Annotation[] { });
    final DisplayerEditor instance = new DisplayerEditor(_view_0, _clientServices_1, _displayerLocator_2, _displayerPrototypes_3, _typeSelector_4, _lookupEditor_5, _settingsEditor_6, _editorStatus_7, _displayerHtmlEditor_8, _savedEvent_9, _closedEvent_10, _rendererManager_11, _externalComponentPropertiesEditor_12, _displayerSettingsChangedEvent_13);
    registerDependentScopedReference(instance, _externalComponentPropertiesEditor_12);
    registerDependentScopedReference(instance, _displayerSettingsChangedEvent_13);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _typeSelector_4);
    registerDependentScopedReference(instance, _lookupEditor_5);
    registerDependentScopedReference(instance, _settingsEditor_6);
    registerDependentScopedReference(instance, _displayerHtmlEditor_8);
    registerDependentScopedReference(instance, _savedEvent_9);
    registerDependentScopedReference(instance, _closedEvent_10);
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onDataSetLookupChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DataSetLookupChangedEvent", new AbstractCDIEventCallback<DataSetLookupChangedEvent>() {
      public void fireEvent(final DataSetLookupChangedEvent event) {
        DisplayerEditor_onDataSetLookupChanged_DataSetLookupChangedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DataSetLookupChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDisplayerSettingsChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent", new AbstractCDIEventCallback<DisplayerSettingsChangedEvent>() {
      public void fireEvent(final DisplayerSettingsChangedEvent event) {
        DisplayerEditor_onDisplayerSettingsChanged_DisplayerSettingsChangedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDisplayerTypeChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DisplayerTypeSelectedEvent", new AbstractCDIEventCallback<DisplayerTypeSelectedEvent>() {
      public void fireEvent(final DisplayerTypeSelectedEvent event) {
        DisplayerEditor_onDisplayerTypeChanged_DisplayerTypeSelectedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DisplayerTypeSelectedEvent []";
      }
    }));
    thisInstance.setReference(instance, "onDisplayerSubtypeChangedSubscription", CDI.subscribeLocal("org.dashbuilder.displayer.client.events.DisplayerSubtypeSelectedEvent", new AbstractCDIEventCallback<DisplayerSubtypeSelectedEvent>() {
      public void fireEvent(final DisplayerSubtypeSelectedEvent event) {
        DisplayerEditor_onDisplayerSubtypeChanged_DisplayerSubtypeSelectedEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.displayer.client.events.DisplayerSubtypeSelectedEvent []";
      }
    }));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DisplayerEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final DisplayerEditor instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onDataSetLookupChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDisplayerSettingsChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDisplayerTypeChangedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onDisplayerSubtypeChangedSubscription", Subscription.class)).remove();
  }

  public native static void DisplayerEditor_onDataSetLookupChanged_DataSetLookupChangedEvent(DisplayerEditor instance, DataSetLookupChangedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditor::onDataSetLookupChanged(Lorg/dashbuilder/displayer/client/events/DataSetLookupChangedEvent;)(a0);
  }-*/;

  public native static void DisplayerEditor_onDisplayerSubtypeChanged_DisplayerSubtypeSelectedEvent(DisplayerEditor instance, DisplayerSubtypeSelectedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditor::onDisplayerSubtypeChanged(Lorg/dashbuilder/displayer/client/events/DisplayerSubtypeSelectedEvent;)(a0);
  }-*/;

  public native static void DisplayerEditor_onDisplayerSettingsChanged_DisplayerSettingsChangedEvent(DisplayerEditor instance, DisplayerSettingsChangedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditor::onDisplayerSettingsChanged(Lorg/dashbuilder/displayer/client/events/DisplayerSettingsChangedEvent;)(a0);
  }-*/;

  public native static void DisplayerEditor_onDisplayerTypeChanged_DisplayerTypeSelectedEvent(DisplayerEditor instance, DisplayerTypeSelectedEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerEditor::onDisplayerTypeChanged(Lorg/dashbuilder/displayer/client/events/DisplayerTypeSelectedEvent;)(a0);
  }-*/;
}