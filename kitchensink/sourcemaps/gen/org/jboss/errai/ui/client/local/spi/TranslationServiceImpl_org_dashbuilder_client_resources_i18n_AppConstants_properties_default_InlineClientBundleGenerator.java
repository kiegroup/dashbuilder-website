package org.jboss.errai.ui.client.local.spi;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TranslationServiceImpl_org_dashbuilder_client_resources_i18n_AppConstants_properties_default_InlineClientBundleGenerator implements org.jboss.errai.ui.client.local.spi.TranslationServiceImpl.org_dashbuilder_client_resources_i18n_AppConstants_properties {
  private static TranslationServiceImpl_org_dashbuilder_client_resources_i18n_AppConstants_properties_default_InlineClientBundleGenerator _instance0 = new TranslationServiceImpl_org_dashbuilder_client_resources_i18n_AppConstants_properties_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // file:/home/wsiqueir/projects/kogito-tooling/packages/dashbuilder/dashbuilder-runtime-parent/dashbuilder-runtime-client/src/main/webapp/WEB-INF/classes/org/dashbuilder/client/resources/i18n/AppConstants.properties
      public String getText() {
        return "#\n# Copyright (C) 2020 Red Hat, Inc. and/or its affiliates.\n#\n# Licensed under the Apache License, Version 2.0 (the \"License\");\n# you may not use this file except in compliance with the License.\n# You may obtain a copy of the License at\n#\n#       http://www.apache.org/licenses/LICENSE-2.0\n#\n# Unless required by applicable law or agreed to in writing, software\n# distributed under the License is distributed on an \"AS IS\" BASIS,\n# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n# See the License for the specific language governing permissions and\n# limitations under the License.\n#\nEmptyScreenView.title=No content to show\nEmptyScreenView.subTitle=Dashboards were not imported. You can import by uploading a supported file or by posting content using dashbuilder's editor APIs.\nUploadWidgetView.importButton=Import Dashboards\nRuntimeScreenView.title=Welcome to Dashbuilder Runtimes\nRuntimeScreenView.subTitle=Select a Dashboard from menu to get started.\nNotFoundScreenView.title=Dashboard not found\nNotFoundScreenView.subTitle=Dashboard not found in this installation. Please check the dashboard name and try again.\nlogoutMenuTooltip=Logout\nerrorLoadingDashboards=Error Loading dashboard\nloadingDashboards=Loading Dashboards\nerrorUploadingDashboards=Error Uploading Dashboards\nuploadingDashboards=Uploading Dashboards\nruntimeScreenTitle=Welcome to Dashboards\nuploadDashboardsTitle=Upload Dashboards\nnotFoundScreenTitle=Page not found\nnotFoundDashboard=Dashboard {0} not found. Please review the dashboard name and try again.\nnotAbleToLoadDashboard=Not able to load dashboard: {0}\nrouterScreenTitle=Dashbuilder Runtime\ndashboardsListScreenTitle=Dashboards List\nDashboardsListScreenView.title=Available Dashboards\ndashboardListTooltip=Dashboards List\nlistDashboardsScreenTitle=Dashboards List\nrouterPerspective=Router\ndashboardAlreadyImport=Dashboard {0} already imported with name {1}\nimportSuccess=Dashboard {0} successfully imported\ndashboardOpenTooltip=Open this page in another tab\n\n# Error messages\ndisconnectedFromServer=Disconnected from server\ncouldNotConnectToServer=Could not connect to server. This very likely means a network problem. Do you want to reload the application?\nsessionTimeout=Session timeout\ninvalidBusResponseProbablySessionTimeout=Invalid response received from the server. This very likely means that you have been logged out due to inactivity. Do you want to log in again?\ndefaultErrorMessage=Unknown Error\nnotAuthorizedTitle=Not Authorized\nnotAuthorized=You are not authorized to access this resource.\n\n# Client Mode\nclientMode=Running in client mode\nemptyEditorMode=No content to display. Start editing to see the result here.\nerrorContentTitle=Error loading content";
      }
      public String getName() {
        return "getContents";
      }
    }
    ;
  }
  private static class getContentsInitializer {
    static {
      _instance0.getContentsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return getContents;
    }
  }
  public com.google.gwt.resources.client.TextResource getContents() {
    return getContentsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ui.client.local.spi.TranslationServiceImpl.org_dashbuilder_client_resources_i18n_AppConstants_properties::getContents()();
    }
    return null;
  }-*/;
}
