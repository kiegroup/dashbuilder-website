package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default_o_d_c_w_v_SampleCardViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default.o_d_c_w_v_SampleCardViewTemplateResource {
  private static Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default_o_d_c_w_v_SampleCardViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default_o_d_c_w_v_SampleCardViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // file:/home/wsiqueir/projects/kogito-tooling/packages/dashbuilder/dashbuilder-runtime-parent/dashbuilder-runtime-client/src/main/java/org/dashbuilder/client/widgets/view/SampleCardView.html
      public String getText() {
        return "<!--\n  Copyright 2023 Red Hat, Inc. and/or its affiliates.\n\n  Licensed under the Apache License, Version 2.0 (the \"License\");\n  you may not use this file except in compliance with the License.\n  You may obtain a copy of the License at\n\n        http://www.apache.org/licenses/LICENSE-2.0\n\n  Unless required by applicable law or agreed to in writing, software\n  distributed under the License is distributed on an \"AS IS\" BASIS,\n  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  See the License for the specific language governing permissions and\n  limitations under the License.\n-->\n<div class=\"col-xl-2 col-lg-2 col-md-4 col-sm-6 sampleCardContainer\" align=\"center\">\n  <div class=\"sampleCard\">\n    <!-- TODO: Import the sample when this is clicked -->\n    <a id=\"sampleImportLink\" class=\"sampleImportLink\"> <span class=\"fa fa-cubes\"></span> </a>\n    <div>\n      <div class=\"sampleUrlLinkDiv\">\n        <a id=\"sampleEditLink\" style=\"visibility: hidden; margin-right: 5px\"> <span class=\"fa fa-pencil\"></span></a>\n        <a id=\"sampleUrlLink\" target=\"_blank\"> <span class=\"fa fa-download\"></span></a>\n      </div>\n      <div>\n        <div class=\"sampleNameDiv\"></div>\n      </div>\n    </div>\n  </div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".sampleCardContainer{padding:" + ("10px")  + ";margin-bottom:" + ("20px")  + ";}.sampleImportLink{margin-top:" + ("10px")  + ";border-radius:" + ("1px")  + ";overflow:" + ("hidden")  + ";height:" + ("150px")  + ";display:" + ("block")  + ";}.sampleImportLink:hover{cursor:" + ("pointer")  + ";}.sampleImportLink span{width:" + ("100%")  + ";height:" + ("100%")  + ";font-size:") + (("100px")  + ";padding:" + ("20px")  + ";}.sampleImportLink svg{width:" + ("100%")  + ";height:" + ("100%")  + ";transition:" + ("0.5s"+ " " +"ease-in-out")  + ";}.sampleImportLink svg:hover{transform:" + ("scale(" + "1.2" + ")")  + ";}.sampleUrlLinkDiv{float:" + ("left")  + ";margin-top:" + ("10px")  + ";font-size:" + ("13px")  + ";}.sampleNameDiv{text-overflow:" + ("ellipsis")  + ";white-space:" + ("nowrap") ) + (";padding:" + ("10px"+ " " +"5px"+ " " +"0"+ " " +"10px")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";display:" + ("block")  + ";font-size:" + ("15px")  + ";text-align:" + ("right")  + ";}.sampleCard{width:" + ("100%")  + ";max-width:" + ("350px")  + ";position:" + ("relative")  + ";border-radius:" + ("10px")  + ";background:") + (("white")  + ";padding:" + ("5px")  + ";}")) : ((".sampleCardContainer{padding:" + ("10px")  + ";margin-bottom:" + ("20px")  + ";}.sampleImportLink{margin-top:" + ("10px")  + ";border-radius:" + ("1px")  + ";overflow:" + ("hidden")  + ";height:" + ("150px")  + ";display:" + ("block")  + ";}.sampleImportLink:hover{cursor:" + ("pointer")  + ";}.sampleImportLink span{width:" + ("100%")  + ";height:" + ("100%")  + ";font-size:") + (("100px")  + ";padding:" + ("20px")  + ";}.sampleImportLink svg{width:" + ("100%")  + ";height:" + ("100%")  + ";transition:" + ("0.5s"+ " " +"ease-in-out")  + ";}.sampleImportLink svg:hover{transform:" + ("scale(" + "1.2" + ")")  + ";}.sampleUrlLinkDiv{float:" + ("right")  + ";margin-top:" + ("10px")  + ";font-size:" + ("13px")  + ";}.sampleNameDiv{text-overflow:" + ("ellipsis")  + ";white-space:" + ("nowrap") ) + (";padding:" + ("10px"+ " " +"10px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0")  + ";overflow:" + ("hidden")  + ";display:" + ("block")  + ";font-size:" + ("15px")  + ";text-align:" + ("left")  + ";}.sampleCard{width:" + ("100%")  + ";max-width:" + ("350px")  + ";position:" + ("relative")  + ";border-radius:" + ("10px")  + ";background:") + (("white")  + ";padding:" + ("5px")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default.o_d_c_w_v_SampleCardViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default.o_d_c_w_v_SampleCardViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
