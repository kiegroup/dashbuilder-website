package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_ExternalComponentEditorViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_ExternalComponentEditorViewTemplateResource {
  private static Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_ExternalComponentEditorViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_ExternalComponentEditorViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-displayer-client/0.0.0/dashbuilder-displayer-client-0.0.0-sources.jar!/org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html
      public String getText() {
        return "<!--\n  Copyright 2020 Red Hat, Inc. and/or its affiliates.\n\n  Licensed under the Apache License, Version 2.0 (the \"License\");\n  you may not use this file except in compliance with the License.\n  You may obtain a copy of the License at\n\n        http://www.apache.org/licenses/LICENSE-2.0\n\n  Unless required by applicable law or agreed to in writing, software\n  distributed under the License is distributed on an \"AS IS\" BASIS,\n  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  See the License for the specific language governing permissions and\n  limitations under the License.componentEditorRoot\n-->\n<div class=\"componentEditorRootContainer\">\n  <div class=\"container\">\n    <div class=\"row\">\n      <div class=\"col-md-3 componentEditorPropertiesColumn\"></div>\n      <div class=\"col-md-9 componentEditorPreviewColumn\"></div>\n    </div>\n  </div>\n</div>\n";
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
  private void getStyleInitializer() {
    getStyle = new com.google.gwt.resources.client.CssResource() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "getStyle";
      }
      public String getText() {
        return (".componentEditorRootContainer{margin-top:" + ("15px")  + ";}.componentEditorPropertiesColumn{overflow-x:" + ("hidden")  + ";overflow-y:" + ("auto")  + ";height:" + ("370px")  + ";}.componentEditorPreviewColumn{height:" + ("390px")  + ";overflow:" + ("auto")  + ";}");
      }
    }
    ;
  }
  private static class getStyleInitializer {
    static {
      _instance0.getStyleInitializer();
    }
    static com.google.gwt.resources.client.CssResource get() {
      return getStyle;
    }
  }
  public com.google.gwt.resources.client.CssResource getStyle() {
    return getStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  private static com.google.gwt.resources.client.CssResource getStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
      getStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
        resourceMap.put("getStyle", getStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_ExternalComponentEditorViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_ExternalComponentEditorViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
