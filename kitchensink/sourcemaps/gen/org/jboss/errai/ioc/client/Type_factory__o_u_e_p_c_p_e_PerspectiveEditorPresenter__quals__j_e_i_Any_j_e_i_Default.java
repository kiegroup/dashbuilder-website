package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.promise.Promises;
import org.uberfire.client.workbench.events.ChangeTitleWidgetEvent;
import org.uberfire.ext.editor.commons.client.BaseEditor;
import org.uberfire.ext.editor.commons.client.file.popups.DeletePopUpPresenter;
import org.uberfire.ext.editor.commons.client.menu.BasicFileMenuBuilder;
import org.uberfire.ext.editor.commons.client.menu.BasicFileMenuBuilderImpl;
import org.uberfire.ext.editor.commons.client.menu.DownloadMenuItemBuilder;
import org.uberfire.ext.editor.commons.client.menu.common.SaveAndRenameCommandBuilder;
import org.uberfire.ext.editor.commons.client.validation.DefaultFileNameValidator;
import org.uberfire.ext.editor.commons.file.DefaultMetadata;
import org.uberfire.ext.layout.editor.api.PerspectiveServices;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.client.LayoutEditorPluginImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponentPalette;
import org.uberfire.ext.layout.editor.client.api.LayoutEditorPlugin;
import org.uberfire.ext.layout.editor.client.widgets.LayoutComponentPalettePresenter;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter.View;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView;
import org.uberfire.ext.plugin.client.perspective.editor.events.PerspectiveEditorFocusEvent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.PerspectiveEditorSettings;
import org.uberfire.ext.plugin.client.type.PerspectiveLayoutPluginResourceType;
import org.uberfire.ext.plugin.client.validation.PluginNameValidator;
import org.uberfire.ext.plugin.event.PluginDeleted;
import org.uberfire.workbench.events.NotificationEvent;

public class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorPresenter> { public Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorPresenter.class, "Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorPresenter.class, BaseEditor.class, Object.class });
  }

  public PerspectiveEditorPresenter createInstance(final ContextManager contextManager) {
    final PerspectiveEditorPresenter instance = new PerspectiveEditorPresenter();
    setIncompleteInstance(instance);
    final Event PerspectiveEditorPresenter_perspectiveEditorFocusEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PerspectiveEditorFocusEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PerspectiveEditorPresenter_perspectiveEditorFocusEvent);
    PerspectiveEditorPresenter_Event_perspectiveEditorFocusEvent(instance, PerspectiveEditorPresenter_perspectiveEditorFocusEvent);
    final LayoutComponentPalettePresenter PerspectiveEditorPresenter_layoutDragComponentPalette = (LayoutComponentPalettePresenter) contextManager.getInstance("Type_factory__o_u_e_l_e_c_w_LayoutComponentPalettePresenter__quals__j_e_i_Any_j_e_i_Default");
    PerspectiveEditorPresenter_LayoutDragComponentPalette_layoutDragComponentPalette(instance, PerspectiveEditorPresenter_layoutDragComponentPalette);
    final Caller PerspectiveEditorPresenter_perspectiveServices = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PerspectiveServices.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PerspectiveEditorPresenter_perspectiveServices);
    PerspectiveEditorPresenter_Caller_perspectiveServices(instance, PerspectiveEditorPresenter_perspectiveServices);
    final ManagedInstance BaseEditor_menuBuilderManagedInstance = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { BasicFileMenuBuilder.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseEditor_menuBuilderManagedInstance);
    BaseEditor_ManagedInstance_menuBuilderManagedInstance(instance, BaseEditor_menuBuilderManagedInstance);
    final PerspectiveEditorSettings PerspectiveEditorPresenter_perspectiveEditorSettings = (PerspectiveEditorSettings) contextManager.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default");
    PerspectiveEditorPresenter_PerspectiveEditorSettings_perspectiveEditorSettings(instance, PerspectiveEditorPresenter_perspectiveEditorSettings);
    final PerspectiveEditorView PerspectiveEditorPresenter_perspectiveEditorView = (PerspectiveEditorView) contextManager.getInstance("Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PerspectiveEditorPresenter_perspectiveEditorView);
    PerspectiveEditorPresenter_View_perspectiveEditorView(instance, PerspectiveEditorPresenter_perspectiveEditorView);
    final PlaceManagerImpl BaseEditor_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    BaseEditor_PlaceManager_placeManager(instance, BaseEditor_placeManager);
    final DeletePopUpPresenter BaseEditor_deletePopUpPresenter = (DeletePopUpPresenter) contextManager.getInstance("Type_factory__o_u_e_e_c_c_f_p_DeletePopUpPresenter__quals__j_e_i_Any_j_e_i_Default");
    BaseEditor_DeletePopUpPresenter_deletePopUpPresenter(instance, BaseEditor_deletePopUpPresenter);
    final DownloadMenuItemBuilder BaseEditor_downloadMenuItemBuilder = (DownloadMenuItemBuilder) contextManager.getInstance("Type_factory__o_u_e_e_c_c_m_DownloadMenuItemBuilder__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BaseEditor_downloadMenuItemBuilder);
    BaseEditor_DownloadMenuItemBuilder_downloadMenuItemBuilder(instance, BaseEditor_downloadMenuItemBuilder);
    final Event BaseEditor_changeTitleNotification = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ChangeTitleWidgetEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseEditor_changeTitleNotification);
    BaseEditor_Event_changeTitleNotification(instance, BaseEditor_changeTitleNotification);
    final Event BaseEditor_notification = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NotificationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseEditor_notification);
    BaseEditor_Event_notification(instance, BaseEditor_notification);
    final LayoutEditorPluginImpl PerspectiveEditorPresenter_layoutEditorPlugin = (LayoutEditorPluginImpl) contextManager.getInstance("Type_factory__o_u_e_l_e_c_LayoutEditorPluginImpl__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PerspectiveEditorPresenter_layoutEditorPlugin);
    PerspectiveEditorPresenter_LayoutEditorPlugin_layoutEditorPlugin(instance, PerspectiveEditorPresenter_layoutEditorPlugin);
    final PerspectiveLayoutPluginResourceType PerspectiveEditorPresenter_resourceType = (PerspectiveLayoutPluginResourceType) contextManager.getInstance("Type_factory__o_u_e_p_c_t_PerspectiveLayoutPluginResourceType__quals__j_e_i_Any_j_e_i_Default");
    PerspectiveEditorPresenter_PerspectiveLayoutPluginResourceType_resourceType(instance, PerspectiveEditorPresenter_resourceType);
    final PluginNameValidator PerspectiveEditorPresenter_pluginNameValidator = (PluginNameValidator) contextManager.getInstance("Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default");
    PerspectiveEditorPresenter_PluginNameValidator_pluginNameValidator(instance, PerspectiveEditorPresenter_pluginNameValidator);
    final Promises BaseEditor_promises = (Promises) contextManager.getInstance("Type_factory__o_u_c_p_Promises__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BaseEditor_promises);
    BaseEditor_Promises_promises(instance, BaseEditor_promises);
    final DefaultFileNameValidator BaseEditor_fileNameValidator = (DefaultFileNameValidator) contextManager.getInstance("Type_factory__o_u_e_e_c_c_v_DefaultFileNameValidator__quals__j_e_i_Any_j_e_i_Default");
    BaseEditor_DefaultFileNameValidator_fileNameValidator(instance, BaseEditor_fileNameValidator);
    final SyncBeanManager PerspectiveEditorPresenter_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PerspectiveEditorPresenter_beanManager);
    PerspectiveEditorPresenter_SyncBeanManager_beanManager(instance, PerspectiveEditorPresenter_beanManager);
    final BasicFileMenuBuilderImpl BaseEditor_menuBuilder = (BasicFileMenuBuilderImpl) contextManager.getInstance("Type_factory__o_u_e_e_c_c_m_BasicFileMenuBuilderImpl__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BaseEditor_menuBuilder);
    BaseEditor_BasicFileMenuBuilder_menuBuilder(instance, BaseEditor_menuBuilder);
    final SaveAndRenameCommandBuilder BaseEditor_saveAndRenameCommandBuilder = (SaveAndRenameCommandBuilder) contextManager.getInstance("Type_factory__o_u_e_e_c_c_m_c_SaveAndRenameCommandBuilder__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BaseEditor_saveAndRenameCommandBuilder);
    BaseEditor_SaveAndRenameCommandBuilder_saveAndRenameCommandBuilder(instance, BaseEditor_saveAndRenameCommandBuilder);
    thisInstance.setReference(instance, "onPlugInDeletedSubscription", CDI.subscribe("org.uberfire.ext.plugin.event.PluginDeleted", new AbstractCDIEventCallback<PluginDeleted>() {
      public void fireEvent(final PluginDeleted event) {
        instance.onPlugInDeleted(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginDeleted []";
      }
    }));
    thisInstance.setReference(instance, "onPlugInDeletedSubscriptionForPluginDeleted", ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginDeleted", CDI.ROUTING_CALLBACK));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PerspectiveEditorPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PerspectiveEditorPresenter instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onPlugInDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onPlugInDeletedSubscriptionForPluginDeleted", Subscription.class)).remove();
  }

  native static PlaceManager BaseEditor_PlaceManager_placeManager(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::placeManager;
  }-*/;

  native static void BaseEditor_PlaceManager_placeManager(BaseEditor instance, PlaceManager value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::placeManager = value;
  }-*/;

  native static Event BaseEditor_Event_notification(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::notification;
  }-*/;

  native static void BaseEditor_Event_notification(BaseEditor instance, Event<NotificationEvent> value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::notification = value;
  }-*/;

  native static SyncBeanManager PerspectiveEditorPresenter_SyncBeanManager_beanManager(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::beanManager;
  }-*/;

  native static void PerspectiveEditorPresenter_SyncBeanManager_beanManager(PerspectiveEditorPresenter instance, SyncBeanManager value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::beanManager = value;
  }-*/;

  native static BasicFileMenuBuilder BaseEditor_BasicFileMenuBuilder_menuBuilder(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::menuBuilder;
  }-*/;

  native static void BaseEditor_BasicFileMenuBuilder_menuBuilder(BaseEditor instance, BasicFileMenuBuilder value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::menuBuilder = value;
  }-*/;

  native static SaveAndRenameCommandBuilder BaseEditor_SaveAndRenameCommandBuilder_saveAndRenameCommandBuilder(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::saveAndRenameCommandBuilder;
  }-*/;

  native static void BaseEditor_SaveAndRenameCommandBuilder_saveAndRenameCommandBuilder(BaseEditor instance, SaveAndRenameCommandBuilder<LayoutTemplate, DefaultMetadata> value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::saveAndRenameCommandBuilder = value;
  }-*/;

  native static Caller PerspectiveEditorPresenter_Caller_perspectiveServices(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveServices;
  }-*/;

  native static void PerspectiveEditorPresenter_Caller_perspectiveServices(PerspectiveEditorPresenter instance, Caller<PerspectiveServices> value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveServices = value;
  }-*/;

  native static DeletePopUpPresenter BaseEditor_DeletePopUpPresenter_deletePopUpPresenter(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::deletePopUpPresenter;
  }-*/;

  native static void BaseEditor_DeletePopUpPresenter_deletePopUpPresenter(BaseEditor instance, DeletePopUpPresenter value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::deletePopUpPresenter = value;
  }-*/;

  native static Event PerspectiveEditorPresenter_Event_perspectiveEditorFocusEvent(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorFocusEvent;
  }-*/;

  native static void PerspectiveEditorPresenter_Event_perspectiveEditorFocusEvent(PerspectiveEditorPresenter instance, Event<PerspectiveEditorFocusEvent> value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorFocusEvent = value;
  }-*/;

  native static PerspectiveLayoutPluginResourceType PerspectiveEditorPresenter_PerspectiveLayoutPluginResourceType_resourceType(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::resourceType;
  }-*/;

  native static void PerspectiveEditorPresenter_PerspectiveLayoutPluginResourceType_resourceType(PerspectiveEditorPresenter instance, PerspectiveLayoutPluginResourceType value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::resourceType = value;
  }-*/;

  native static View PerspectiveEditorPresenter_View_perspectiveEditorView(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorView;
  }-*/;

  native static void PerspectiveEditorPresenter_View_perspectiveEditorView(PerspectiveEditorPresenter instance, View value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorView = value;
  }-*/;

  native static ManagedInstance BaseEditor_ManagedInstance_menuBuilderManagedInstance(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::menuBuilderManagedInstance;
  }-*/;

  native static void BaseEditor_ManagedInstance_menuBuilderManagedInstance(BaseEditor instance, ManagedInstance<BasicFileMenuBuilder> value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::menuBuilderManagedInstance = value;
  }-*/;

  native static PluginNameValidator PerspectiveEditorPresenter_PluginNameValidator_pluginNameValidator(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::pluginNameValidator;
  }-*/;

  native static void PerspectiveEditorPresenter_PluginNameValidator_pluginNameValidator(PerspectiveEditorPresenter instance, PluginNameValidator value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::pluginNameValidator = value;
  }-*/;

  native static DownloadMenuItemBuilder BaseEditor_DownloadMenuItemBuilder_downloadMenuItemBuilder(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::downloadMenuItemBuilder;
  }-*/;

  native static void BaseEditor_DownloadMenuItemBuilder_downloadMenuItemBuilder(BaseEditor instance, DownloadMenuItemBuilder value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::downloadMenuItemBuilder = value;
  }-*/;

  native static LayoutDragComponentPalette PerspectiveEditorPresenter_LayoutDragComponentPalette_layoutDragComponentPalette(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::layoutDragComponentPalette;
  }-*/;

  native static void PerspectiveEditorPresenter_LayoutDragComponentPalette_layoutDragComponentPalette(PerspectiveEditorPresenter instance, LayoutDragComponentPalette value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::layoutDragComponentPalette = value;
  }-*/;

  native static DefaultFileNameValidator BaseEditor_DefaultFileNameValidator_fileNameValidator(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::fileNameValidator;
  }-*/;

  native static void BaseEditor_DefaultFileNameValidator_fileNameValidator(BaseEditor instance, DefaultFileNameValidator value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::fileNameValidator = value;
  }-*/;

  native static PerspectiveEditorSettings PerspectiveEditorPresenter_PerspectiveEditorSettings_perspectiveEditorSettings(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorSettings;
  }-*/;

  native static void PerspectiveEditorPresenter_PerspectiveEditorSettings_perspectiveEditorSettings(PerspectiveEditorPresenter instance, PerspectiveEditorSettings value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::perspectiveEditorSettings = value;
  }-*/;

  native static LayoutEditorPlugin PerspectiveEditorPresenter_LayoutEditorPlugin_layoutEditorPlugin(PerspectiveEditorPresenter instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::layoutEditorPlugin;
  }-*/;

  native static void PerspectiveEditorPresenter_LayoutEditorPlugin_layoutEditorPlugin(PerspectiveEditorPresenter instance, LayoutEditorPlugin value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter::layoutEditorPlugin = value;
  }-*/;

  native static Event BaseEditor_Event_changeTitleNotification(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::changeTitleNotification;
  }-*/;

  native static void BaseEditor_Event_changeTitleNotification(BaseEditor instance, Event<ChangeTitleWidgetEvent> value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::changeTitleNotification = value;
  }-*/;

  native static Promises BaseEditor_Promises_promises(BaseEditor instance) /*-{
    return instance.@org.uberfire.ext.editor.commons.client.BaseEditor::promises;
  }-*/;

  native static void BaseEditor_Promises_promises(BaseEditor instance, Promises value) /*-{
    instance.@org.uberfire.ext.editor.commons.client.BaseEditor::promises = value;
  }-*/;
}