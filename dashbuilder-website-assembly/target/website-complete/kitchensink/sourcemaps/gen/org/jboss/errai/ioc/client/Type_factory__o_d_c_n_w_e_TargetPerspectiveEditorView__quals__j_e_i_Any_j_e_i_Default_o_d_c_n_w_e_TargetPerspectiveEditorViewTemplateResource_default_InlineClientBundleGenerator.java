package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource {
  private static Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-navigation-client/0.0.0/dashbuilder-navigation-client-0.0.0-sources.jar!/org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html
      public String getText() {
        return "<div>\n  <div data-field=\"perspectiveSelectorDiv\"></div>\n  <a href=\"#\" data-toggle=\"tooltip\" data-delay=\"0\" class=\"uf-tpe-help-icon\"\n    ><span data-field=\"perspectiveSelectorHelp\" class=\"fa fa-info-circle\"></span\n  ></a>\n  <div data-field=\"groupSelectorDiv\">\n    <div class=\"btn-group bootstrap-select\" style=\"width: 150px\">\n      <button class=\"btn btn-default dropdown-toggle uf-tpe-selector-button\" type=\"button\" data-toggle=\"dropdown\">\n        <span data-field=\"navGroupSelection\" class=\"filter-option pull-left\"></span>&nbsp;<span class=\"bs-caret\"\n          ><span class=\"caret\"></span\n        ></span>\n      </button>\n      <ul data-field=\"navGroupItems\" class=\"dropdown-menu uf-tpe-selector-menu\" role=\"menu\"></ul>\n    </div>\n  </div>\n  <a href=\"#\" data-toggle=\"tooltip\" data-delay=\"0\" class=\"uf-tpe-help-icon\"\n    ><span data-field=\"navGroupSelectorHelp\" class=\"fa fa-info-circle\"></span\n  ></a>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".uf-tpe-selector-button{width:" + ("150px")  + ";text-align:" + ("right")  + ";}.uf-tpe-selector-menu{margin-right:" + ("37px")  + ";width:" + ("150px")  + ";overflow:" + ("auto")  + ";max-height:" + ("250px")  + ";}.uf-tpe-help-icon{position:" + ("absolute")  + ";margin-right:" + ("155px")  + ";margin-top:" + ("-25px")  + ";}")) : ((".uf-tpe-selector-button{width:" + ("150px")  + ";text-align:" + ("left")  + ";}.uf-tpe-selector-menu{margin-left:" + ("37px")  + ";width:" + ("150px")  + ";overflow:" + ("auto")  + ";max-height:" + ("250px")  + ";}.uf-tpe-help-icon{position:" + ("absolute")  + ";margin-left:" + ("155px")  + ";margin-top:" + ("-25px")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}