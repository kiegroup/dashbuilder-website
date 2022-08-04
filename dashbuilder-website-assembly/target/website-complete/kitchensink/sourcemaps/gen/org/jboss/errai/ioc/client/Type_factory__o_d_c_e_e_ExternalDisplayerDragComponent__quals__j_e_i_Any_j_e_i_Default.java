package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.client.editor.external.ExternalComponentDragDef;
import org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent;
import org.dashbuilder.displayer.client.prototypes.DisplayerPrototypes;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.layout.editor.client.api.HasConfiguration;
import org.uberfire.ext.layout.editor.client.api.HasDragAndDropSettings;
import org.uberfire.ext.layout.editor.client.api.HasModalConfiguration;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;

public class Type_factory__o_d_c_e_e_ExternalDisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDisplayerDragComponent> { public Type_factory__o_d_c_e_e_ExternalDisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalDisplayerDragComponent.class, "Type_factory__o_d_c_e_e_ExternalDisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalDisplayerDragComponent.class, DisplayerDragComponent.class, Object.class, LayoutDragComponent.class, HasModalConfiguration.class, HasConfiguration.class, ExternalComponentDragDef.class, HasDragAndDropSettings.class });
  }

  public ExternalDisplayerDragComponent createInstance(final ContextManager contextManager) {
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerViewer _viewer_1 = (DisplayerViewer) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_2 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveCoordinator _perspectiveCoordinator_3 = (PerspectiveCoordinator) contextManager.getInstance("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default");
    final ExternalDisplayerDragComponent instance = new ExternalDisplayerDragComponent(_beanManager_0, _viewer_1, _placeManager_2, _perspectiveCoordinator_3);
    registerDependentScopedReference(instance, _beanManager_0);
    registerDependentScopedReference(instance, _viewer_1);
    setIncompleteInstance(instance);
    final DisplayerPrototypes ExternalDisplayerDragComponent_displayerPrototypes = (DisplayerPrototypes) contextManager.getInstance("Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default");
    ExternalDisplayerDragComponent_DisplayerPrototypes_displayerPrototypes(instance, ExternalDisplayerDragComponent_displayerPrototypes);
    final Event ExternalDisplayerDragComponent_displayerSettingsChangedEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DisplayerSettingsChangedEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ExternalDisplayerDragComponent_displayerSettingsChangedEvent);
    ExternalDisplayerDragComponent_Event_displayerSettingsChangedEvent(instance, ExternalDisplayerDragComponent_displayerSettingsChangedEvent);
    setIncompleteInstance(null);
    return instance;
  }

  native static DisplayerPrototypes ExternalDisplayerDragComponent_DisplayerPrototypes_displayerPrototypes(ExternalDisplayerDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent::displayerPrototypes;
  }-*/;

  native static void ExternalDisplayerDragComponent_DisplayerPrototypes_displayerPrototypes(ExternalDisplayerDragComponent instance, DisplayerPrototypes value) /*-{
    instance.@org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent::displayerPrototypes = value;
  }-*/;

  native static Event ExternalDisplayerDragComponent_Event_displayerSettingsChangedEvent(ExternalDisplayerDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent::displayerSettingsChangedEvent;
  }-*/;

  native static void ExternalDisplayerDragComponent_Event_displayerSettingsChangedEvent(ExternalDisplayerDragComponent instance, Event<DisplayerSettingsChangedEvent> value) /*-{
    instance.@org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent::displayerSettingsChangedEvent = value;
  }-*/;
}