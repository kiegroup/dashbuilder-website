package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_NotFoundScreenViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default.o_d_c_s_v_NotFoundScreenViewTemplateResource {
  private static Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_NotFoundScreenViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_NotFoundScreenViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // file:/home/wsiqueir/projects/kogito-tooling/packages/dashbuilder/dashbuilder-runtime-parent/dashbuilder-runtime-client/src/main/java/org/dashbuilder/client/screens/view/NotFoundScreenView.html
      public String getText() {
        return "<!--\n  Copyright 2020 Red Hat, Inc. and/or its affiliates.\n\n  Licensed under the Apache License, Version 2.0 (the \"License\");\n  you may not use this file except in compliance with the License.\n  You may obtain a copy of the License at\n\n        http://www.apache.org/licenses/LICENSE-2.0\n\n  Unless required by applicable law or agreed to in writing, software\n  distributed under the License is distributed on an \"AS IS\" BASIS,\n  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  See the License for the specific language governing permissions and\n  limitations under the License.\n-->\n<div class=\"blank-slate-pf\" id=\"root\" style=\"height: 100%\">\n  <div class=\"blank-slate-pf-icon\">\n    <span class=\"fa fa-ban\"></span>\n  </div>\n  <h1 data-i18n-key=\"title\"></h1>\n  <p data-i18n-key=\"subTitle\" id=\"subTitle\"></p>\n</div>\n";
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default.o_d_c_s_v_NotFoundScreenViewTemplateResource::getContents()();
    }
    return null;
  }-*/;
}