package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_SamplesScreenViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default.o_d_c_s_v_SamplesScreenViewTemplateResource {
  private static Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_SamplesScreenViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default_o_d_c_s_v_SamplesScreenViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // file:/home/wsiqueir/projects/kogito-tooling/packages/dashbuilder/dashbuilder-runtime-parent/dashbuilder-runtime-client/src/main/java/org/dashbuilder/client/screens/view/SamplesScreenView.html
      public String getText() {
        return "<!--\n  Copyright 2023 Red Hat, Inc. and/or its affiliates.\n\n  Licensed under the Apache License, Version 2.0 (the \"License\");\n  you may not use this file except in compliance with the License.\n  You may obtain a copy of the License at\n\n        http://www.apache.org/licenses/LICENSE-2.0\n\n  Unless required by applicable law or agreed to in writing, software\n  distributed under the License is distributed on an \"AS IS\" BASIS,\n  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  See the License for the specific language governing permissions and\n  limitations under the License.\n-->\n<div class=\"samplesScreenRoot\">\n  <div class=\"samplesNavBarContainer\">\n    <nav class=\"navbar navbar-pf-vertical samplesVerticalNavBar\">\n      <button type=\"button\" class=\"navbar-toggle\" id=\"toggleCategoriesNavigation\">\n        <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n        <span class=\"icon-bar\"></span>\n      </button>\n      <div class=\"navbar-header\">\n        <a href=\"/\" class=\"navbar-brand\"> <img class=\"navbar-brand-icon\" src=\"images/samples_brand.png\" alt=\"\" /> </a>\n      </div>\n    </nav>\n  </div>\n  <!-- Samples NavBar -->\n  <div class=\"nav-pf-vertical samplesCategoriesNav hidden-icons-pf\">\n    <ul class=\"list-group\" id=\"samplesCategoriesGroup\"></ul>\n  </div>\n\n  <!-- Samples Row Container -->\n  <div class=\"container-fluid rowsContainer\"></div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".samplesScreenRoot{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";background:" + ("rgba(" + "200"+ ","+ " " +"200"+ ","+ " " +"200"+ ","+ " " +"0.2" + ")")  + ";overflow:" + ("hidden")  + ";}.rowsContainer{transition:" + ("0.2s"+ " " +"ease-in-out")  + ";margin-right:" + ("200px")  + ";padding-top:" + ("60px")  + ";overflow-y:" + ("auto")  + ";height:" + ("100%")  + ";}.samplesCategoriesNav{transition:") + (("0.2s"+ " " +"ease-in-out")  + ";width:" + ("200px")  + ";}.catNavCollapse{width:" + ("0")  + " !important;}.catNavCollapsed{margin-right:" + ("0")  + ";}.samplesVerticalNavBar{right:" + ("0")  + ";position:" + ("fixed")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("1030")  + ";}")) : ((".samplesScreenRoot{position:" + ("absolute")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";background:" + ("rgba(" + "200"+ ","+ " " +"200"+ ","+ " " +"200"+ ","+ " " +"0.2" + ")")  + ";overflow:" + ("hidden")  + ";}.rowsContainer{transition:" + ("0.2s"+ " " +"ease-in-out")  + ";margin-left:" + ("200px")  + ";padding-top:" + ("60px")  + ";overflow-y:" + ("auto")  + ";height:" + ("100%")  + ";}.samplesCategoriesNav{transition:") + (("0.2s"+ " " +"ease-in-out")  + ";width:" + ("200px")  + ";}.catNavCollapse{width:" + ("0")  + " !important;}.catNavCollapsed{margin-left:" + ("0")  + ";}.samplesVerticalNavBar{left:" + ("0")  + ";position:" + ("fixed")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("1030")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default.o_d_c_s_v_SamplesScreenViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default.o_d_c_s_v_SamplesScreenViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
