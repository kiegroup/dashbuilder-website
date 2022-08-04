package org.jboss.errai.bus.client.framework;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.dashbuilder.dataprovider.DataSetProviderType;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.backend.EditDataSetDef;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.service.DataSetDefServices;
import org.dashbuilder.dataset.service.DataSetDefVfsServices;
import org.dashbuilder.dataset.service.DataSetExportServices;
import org.dashbuilder.dataset.service.DataSetLookupServices;
import org.dashbuilder.dataset.service.SQLProviderServices;
import org.dashbuilder.external.service.BackendComponentFunctionService;
import org.dashbuilder.external.service.ComponentService;
import org.dashbuilder.kieserver.KieServerConnectionInfo;
import org.dashbuilder.kieserver.KieServerConnectionInfoProvider;
import org.dashbuilder.kieserver.RemoteDataSetDef;
import org.dashbuilder.navigation.NavTree;
import org.dashbuilder.navigation.layout.LayoutTemplateContext;
import org.dashbuilder.navigation.layout.LayoutTemplateInfo;
import org.dashbuilder.navigation.service.NavigationServices;
import org.dashbuilder.navigation.service.PerspectivePluginServices;
import org.dashbuilder.renderer.RendererSettings;
import org.dashbuilder.renderer.service.RendererSettingsService;
import org.dashbuilder.transfer.DataTransferExportModel;
import org.dashbuilder.transfer.DataTransferServices;
import org.dashbuilder.transfer.ExportInfo;
import org.dashbuilder.transfer.ExportModelValidationService;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.api.builder.RemoteCallSendable;
import org.jboss.errai.bus.client.api.messaging.MessageBus;
import org.jboss.errai.common.client.framework.ProxyProvider;
import org.jboss.errai.common.client.framework.RemoteServiceProxyFactory;
import org.uberfire.backend.vfs.Path;
import org.uberfire.ext.editor.commons.file.DefaultMetadata;
import org.uberfire.ext.layout.editor.api.LayoutServices;
import org.uberfire.ext.layout.editor.api.PerspectiveServices;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate.Style;
import org.uberfire.ext.plugin.model.Plugin;
import org.uberfire.ext.plugin.service.PluginServices;
import org.uberfire.ext.properties.editor.model.PropertyEditorCategory;
import org.uberfire.ext.properties.editor.service.BeanPropertyEditorBuilderService;
import org.uberfire.ext.services.shared.preferences.UserPreference;
import org.uberfire.ext.services.shared.preferences.UserPreferencesService;
import org.uberfire.ext.services.shared.preferences.UserPreferencesType;

public class RpcProxyLoaderImpl implements RpcProxyLoader { public void loadProxies(final MessageBus bus) {
    class org_uberfire_ext_services_shared_preferences_UserPreferencesServiceImpl extends AbstractRpcProxy implements UserPreferencesService { public void saveUserPreferences(final UserPreference a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.services.shared.preferences.UserPreferencesService").endpoint("saveUserPreferences:org.uberfire.ext.services.shared.preferences.UserPreference:", qualifiers, new Object[] { a0 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_services_shared_preferences_UserPreferencesServiceImpl.this.sendRequest(bus, sendable);
      }

      public UserPreference loadUserPreferences(final String a0, final UserPreferencesType a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.services.shared.preferences.UserPreferencesService").endpoint("loadUserPreferences:java.lang.String:org.uberfire.ext.services.shared.preferences.UserPreferencesType:", qualifiers, new Object[] { a0, a1 }).respondTo(UserPreference.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_services_shared_preferences_UserPreferencesServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public UserPreference loadUserPreferences(final UserPreference a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.services.shared.preferences.UserPreferencesService").endpoint("loadUserPreferences:org.uberfire.ext.services.shared.preferences.UserPreference:", qualifiers, new Object[] { a0 }).respondTo(UserPreference.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_services_shared_preferences_UserPreferencesServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(UserPreferencesService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_uberfire_ext_services_shared_preferences_UserPreferencesServiceImpl();
      }
    });
    class org_dashbuilder_dataset_service_SQLProviderServicesImpl extends AbstractRpcProxy implements SQLProviderServices { public List getDataSourceDefs() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.SQLProviderServices").endpoint("getDataSourceDefs:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_SQLProviderServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(SQLProviderServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_SQLProviderServicesImpl();
      }
    });
    class org_dashbuilder_dataset_service_DataSetLookupServicesImpl extends AbstractRpcProxy implements DataSetLookupServices { public DataSet lookupDataSet(final DataSetLookup a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSet:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0 }).respondTo(DataSet.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSet lookupDataSet(final DataSetDef a0, final DataSetLookup a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSet:org.dashbuilder.dataset.def.DataSetDef:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0, a1 }).respondTo(DataSet.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSetMetadata lookupDataSetMetadata(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetLookupServices").endpoint("lookupDataSetMetadata:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(DataSetMetadata.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetLookupServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetLookupServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetLookupServicesImpl();
      }
    });
    class org_uberfire_ext_plugin_service_PluginServicesImpl extends AbstractRpcProxy implements PluginServices { public Collection listPlugins() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.plugin.service.PluginServices").endpoint("listPlugins:", qualifiers, new Object[] { }).respondTo(Collection.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_plugin_service_PluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PluginServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_uberfire_ext_plugin_service_PluginServicesImpl();
      }
    });
    class org_uberfire_ext_layout_editor_api_LayoutServicesImpl extends AbstractRpcProxy implements LayoutServices { public String toJson(final LayoutTemplate a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.LayoutServices").endpoint("toJson:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate:", qualifiers, new Object[] { a0 }).respondTo(String.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_LayoutServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate fromJson(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.LayoutServices").endpoint("fromJson:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_LayoutServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(LayoutServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_uberfire_ext_layout_editor_api_LayoutServicesImpl();
      }
    });
    class org_dashbuilder_transfer_DataTransferServicesImpl extends AbstractRpcProxy implements DataTransferServices { public String doExport(final DataTransferExportModel a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.transfer.DataTransferServices").endpoint("doExport:org.dashbuilder.transfer.DataTransferExportModel:", qualifiers, new Object[] { a0 }).respondTo(String.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_transfer_DataTransferServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public List doImport() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.transfer.DataTransferServices").endpoint("doImport:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_transfer_DataTransferServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public String generateExportUrl(final DataTransferExportModel a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.transfer.DataTransferServices").endpoint("generateExportUrl:org.dashbuilder.transfer.DataTransferExportModel:", qualifiers, new Object[] { a0 }).respondTo(String.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_transfer_DataTransferServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public ExportInfo exportInfo() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.transfer.DataTransferServices").endpoint("exportInfo:", qualifiers, new Object[] { }).respondTo(ExportInfo.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_transfer_DataTransferServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataTransferServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_transfer_DataTransferServicesImpl();
      }
    });
    class org_dashbuilder_renderer_service_RendererSettingsServiceImpl extends AbstractRpcProxy implements RendererSettingsService { public RendererSettings getSettings() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.renderer.service.RendererSettingsService").endpoint("getSettings:", qualifiers, new Object[] { }).respondTo(RendererSettings.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_renderer_service_RendererSettingsServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(RendererSettingsService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_renderer_service_RendererSettingsServiceImpl();
      }
    });
    class org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl extends AbstractRpcProxy implements DataSetDefVfsServices { public Path resolve(final DataSetDef a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("resolve:org.dashbuilder.dataset.def.DataSetDef:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSetDef get(final Path a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("get:org.uberfire.backend.vfs.Path:", qualifiers, new Object[] { a0 }).respondTo(DataSetDef.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public EditDataSetDef load(final Path a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("load:org.uberfire.backend.vfs.Path:", qualifiers, new Object[] { a0 }).respondTo(EditDataSetDef.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path save(final DataSetDef a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("save:org.dashbuilder.dataset.def.DataSetDef:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public void delete(final Path a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("delete:org.uberfire.backend.vfs.Path:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
      }

      public Path copy(final Path a0, final String a1, final String a2) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("copy:org.uberfire.backend.vfs.Path:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1, a2 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path copy(final Path a0, final String a1, final Path a2, final String a3) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefVfsServices").endpoint("copy:org.uberfire.backend.vfs.Path:java.lang.String:org.uberfire.backend.vfs.Path:java.lang.String:", qualifiers, new Object[] { a0, a1, a2, a3 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetDefVfsServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetDefVfsServicesImpl();
      }
    });
    class org_dashbuilder_navigation_service_PerspectivePluginServicesImpl extends AbstractRpcProxy implements PerspectivePluginServices { public Collection listPlugins() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("listPlugins:", qualifiers, new Object[] { }).respondTo(Collection.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Plugin getPerspectivePlugin(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getPerspectivePlugin:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(Plugin.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate getLayoutTemplate(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getLayoutTemplate:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate getLayoutTemplate(final Plugin a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getLayoutTemplate:org.uberfire.ext.plugin.model.Plugin:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplateInfo getLayoutTemplateInfo(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getLayoutTemplateInfo:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplateInfo.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplateInfo getLayoutTemplateInfo(final Plugin a0, final LayoutTemplateContext a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getLayoutTemplateInfo:org.uberfire.ext.plugin.model.Plugin:org.dashbuilder.navigation.layout.LayoutTemplateContext:", qualifiers, new Object[] { a0, a1 }).respondTo(LayoutTemplateInfo.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplateInfo getLayoutTemplateInfo(final LayoutTemplate a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.PerspectivePluginServices").endpoint("getLayoutTemplateInfo:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplateInfo.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_PerspectivePluginServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PerspectivePluginServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_navigation_service_PerspectivePluginServicesImpl();
      }
    });
    class org_dashbuilder_transfer_ExportModelValidationServiceImpl extends AbstractRpcProxy implements ExportModelValidationService { public Map checkMissingDatasets(final DataTransferExportModel a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.transfer.ExportModelValidationService").endpoint("checkMissingDatasets:org.dashbuilder.transfer.DataTransferExportModel:", qualifiers, new Object[] { a0 }).respondTo(Map.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_transfer_ExportModelValidationServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ExportModelValidationService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_transfer_ExportModelValidationServiceImpl();
      }
    });
    class org_dashbuilder_navigation_service_NavigationServicesImpl extends AbstractRpcProxy implements NavigationServices { public NavTree loadNavTree() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.NavigationServices").endpoint("loadNavTree:", qualifiers, new Object[] { }).respondTo(NavTree.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_NavigationServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public void saveNavTree(final NavTree a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.navigation.service.NavigationServices").endpoint("saveNavTree:org.dashbuilder.navigation.NavTree:", qualifiers, new Object[] { a0 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_navigation_service_NavigationServicesImpl.this.sendRequest(bus, sendable);
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(NavigationServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_navigation_service_NavigationServicesImpl();
      }
    });
    class org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl extends AbstractRpcProxy implements PerspectiveServices { public Plugin createNewPerspective(final String a0, final Style a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("createNewPerspective:java.lang.String:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate.Style:", qualifiers, new Object[] { a0, a1 }).respondTo(Plugin.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Collection listLayoutTemplates() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("listLayoutTemplates:", qualifiers, new Object[] { }).respondTo(Collection.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate getLayoutTemplate(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("getLayoutTemplate:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate getLayoutTemplate(final Path a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("getLayoutTemplate:org.uberfire.backend.vfs.Path:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate getLayoutTemplate(final Plugin a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("getLayoutTemplate:org.uberfire.ext.plugin.model.Plugin:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public LayoutTemplate convertToLayoutTemplate(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("convertToLayoutTemplate:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(LayoutTemplate.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path saveLayoutTemplate(final LayoutTemplate a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("saveLayoutTemplate:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path copy(final Path a0, final String a1, final String a2) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("copy:org.uberfire.backend.vfs.Path:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1, a2 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path copy(final Path a0, final String a1, final Path a2, final String a3) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("copy:org.uberfire.backend.vfs.Path:java.lang.String:org.uberfire.backend.vfs.Path:java.lang.String:", qualifiers, new Object[] { a0, a1, a2, a3 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public void delete(final Path a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("delete:org.uberfire.backend.vfs.Path:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
      }

      public Path saveAndRename(final Path a0, final String a1, final DefaultMetadata a2, final LayoutTemplate a3, final String a4) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("saveAndRename:org.uberfire.backend.vfs.Path:java.lang.String:org.uberfire.ext.editor.commons.file.DefaultMetadata:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate:java.lang.String:", qualifiers, new Object[] { a0, a1, a2, a3, a4 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path rename(final Path a0, final String a1, final String a2) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("rename:org.uberfire.backend.vfs.Path:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1, a2 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path save(final Path a0, final LayoutTemplate a1, final DefaultMetadata a2, final String a3) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.layout.editor.api.PerspectiveServices").endpoint("save:org.uberfire.backend.vfs.Path:org.uberfire.ext.layout.editor.api.editor.LayoutTemplate:org.uberfire.ext.editor.commons.file.DefaultMetadata:java.lang.String:", qualifiers, new Object[] { a0, a1, a2, a3 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PerspectiveServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_uberfire_ext_layout_editor_api_PerspectiveServicesImpl();
      }
    });
    class org_dashbuilder_dataset_service_DataSetExportServicesImpl extends AbstractRpcProxy implements DataSetExportServices { public Path exportDataSetCSV(final DataSetLookup a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetExportServices").endpoint("exportDataSetCSV:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetExportServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path exportDataSetCSV(final DataSet a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetExportServices").endpoint("exportDataSetCSV:org.dashbuilder.dataset.DataSet:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetExportServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path exportDataSetExcel(final DataSetLookup a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetExportServices").endpoint("exportDataSetExcel:org.dashbuilder.dataset.DataSetLookup:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetExportServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Path exportDataSetExcel(final DataSet a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetExportServices").endpoint("exportDataSetExcel:org.dashbuilder.dataset.DataSet:", qualifiers, new Object[] { a0 }).respondTo(Path.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetExportServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetExportServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetExportServicesImpl();
      }
    });
    class org_dashbuilder_dataset_service_DataSetDefServicesImpl extends AbstractRpcProxy implements DataSetDefServices { public List getPublicDataSetDefs() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("getPublicDataSetDefs:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public DataSetDef createDataSetDef(final DataSetProviderType a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("createDataSetDef:org.dashbuilder.dataprovider.DataSetProviderType:", qualifiers, new Object[] { a0 }).respondTo(DataSetDef.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public String registerDataSetDef(final DataSetDef a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("registerDataSetDef:org.dashbuilder.dataset.def.DataSetDef:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(String.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public void removeDataSetDef(final String a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.dataset.service.DataSetDefServices").endpoint("removeDataSetDef:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(void.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_dataset_service_DataSetDefServicesImpl.this.sendRequest(bus, sendable);
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DataSetDefServices.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_dataset_service_DataSetDefServicesImpl();
      }
    });
    class org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl extends AbstractRpcProxy implements KieServerConnectionInfoProvider { public Optional get(final String a0, final String a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.kieserver.KieServerConnectionInfoProvider").endpoint("get:java.lang.String:java.lang.String:", qualifiers, new Object[] { a0, a1 }).respondTo(Optional.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public List serverTemplates() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.kieserver.KieServerConnectionInfoProvider").endpoint("serverTemplates:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public KieServerConnectionInfo verifiedConnectionInfo(final RemoteDataSetDef a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.kieserver.KieServerConnectionInfoProvider").endpoint("verifiedConnectionInfo:org.dashbuilder.kieserver.RemoteDataSetDef:", qualifiers, new Object[] { a0 }).respondTo(KieServerConnectionInfo.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Optional getDefault() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.kieserver.KieServerConnectionInfoProvider").endpoint("getDefault:", qualifiers, new Object[] { }).respondTo(Optional.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(KieServerConnectionInfoProvider.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_kieserver_KieServerConnectionInfoProviderImpl();
      }
    });
    class org_dashbuilder_external_service_ComponentServiceImpl extends AbstractRpcProxy implements ComponentService { public List listExternalComponents() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.external.service.ComponentService").endpoint("listExternalComponents:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_external_service_ComponentServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public List listAllComponents() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.external.service.ComponentService").endpoint("listAllComponents:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_external_service_ComponentServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Optional byId(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.external.service.ComponentService").endpoint("byId:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(Optional.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_external_service_ComponentServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ComponentService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_external_service_ComponentServiceImpl();
      }
    });
    class org_dashbuilder_external_service_BackendComponentFunctionServiceImpl extends AbstractRpcProxy implements BackendComponentFunctionService { public List listFunctions() {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.external.service.BackendComponentFunctionService").endpoint("listFunctions:", qualifiers, new Object[] { }).respondTo(List.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_external_service_BackendComponentFunctionServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public Object callFunction(final String a0, final Map a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.dashbuilder.external.service.BackendComponentFunctionService").endpoint("callFunction:java.lang.String:java.util.Map:", qualifiers, new Object[] { a0, a1 }).respondTo(Object.class, remoteCallback).errorsHandledBy(errorCallback);
        org_dashbuilder_external_service_BackendComponentFunctionServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BackendComponentFunctionService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_dashbuilder_external_service_BackendComponentFunctionServiceImpl();
      }
    });
    class org_uberfire_ext_properties_editor_service_BeanPropertyEditorBuilderServiceImpl extends AbstractRpcProxy implements BeanPropertyEditorBuilderService { public PropertyEditorCategory extract(final String a0) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.properties.editor.service.BeanPropertyEditorBuilderService").endpoint("extract:java.lang.String:", qualifiers, new Object[] { a0 }).respondTo(PropertyEditorCategory.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_properties_editor_service_BeanPropertyEditorBuilderServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }

      public PropertyEditorCategory extract(final String a0, final Object a1) {
        RemoteCallSendable sendable = MessageBuilder.createCall().call("org.uberfire.ext.properties.editor.service.BeanPropertyEditorBuilderService").endpoint("extract:java.lang.String:java.lang.Object:", qualifiers, new Object[] { a0, a1 }).respondTo(PropertyEditorCategory.class, remoteCallback).errorsHandledBy(errorCallback);
        org_uberfire_ext_properties_editor_service_BeanPropertyEditorBuilderServiceImpl.this.sendRequest(bus, sendable);
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BeanPropertyEditorBuilderService.class, new ProxyProvider() {
      public Object getProxy() {
        return new org_uberfire_ext_properties_editor_service_BeanPropertyEditorBuilderServiceImpl();
      }
    });
  }
}