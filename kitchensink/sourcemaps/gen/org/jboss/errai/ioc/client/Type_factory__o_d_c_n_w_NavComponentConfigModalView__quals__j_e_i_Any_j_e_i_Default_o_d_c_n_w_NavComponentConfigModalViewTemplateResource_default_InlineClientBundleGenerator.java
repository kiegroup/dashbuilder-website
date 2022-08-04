package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavComponentConfigModalViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_NavComponentConfigModalViewTemplateResource {
  private static Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavComponentConfigModalViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavComponentConfigModalViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-navigation-client/0.0.0/dashbuilder-navigation-client-0.0.0-sources.jar!/org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html
      public String getText() {
        return "<div>\n  <div data-field=\"body\">\n    <form class=\"form-horizontal\">\n      <div class=\"form-group\" data-field=\"navGroupDiv\">\n        <label class=\"col-md-3 control-label\">\n          <span style=\"margin-right: 5px\" data-field=\"navGroupLabel\">Navigation group</span>\n          <a href=\"#\" data-toggle=\"tooltip\" data-delay=\"0\"\n            ><span data-field=\"navGroupHelp\" class=\"fa fa-info-circle\"></span\n          ></a>\n        </label>\n        <div class=\"dropdown col-md-4\">\n          <button\n            class=\"btn btn-default dropdown-toggle uf-navconfig-selector-button\"\n            type=\"button\"\n            data-toggle=\"dropdown\"\n          >\n            <span data-field=\"navGroupSelection\"></span>\n            <span class=\"uf-navconfig-selector-caret caret\" style=\"margin-left: 10px\"></span>\n          </button>\n          <ul data-field=\"navGroupItems\" class=\"dropdown-menu uf-navconfig-selector-menu\" role=\"menu\"></ul>\n        </div>\n      </div>\n      <div class=\"form-group\" data-field=\"defaultItemDiv\">\n        <label class=\"col-md-3 control-label\">\n          <span style=\"margin-right: 5px\" data-field=\"defaultItemLabel\">Default item to display</span>\n          <a href=\"#\" data-toggle=\"tooltip\" data-delay=\"0\"\n            ><span data-field=\"defaultItemHelp\" class=\"fa fa-info-circle\"></span\n          ></a>\n        </label>\n        <div class=\"dropdown col-md-4\">\n          <button\n            class=\"btn btn-default dropdown-toggle uf-navconfig-selector-button\"\n            type=\"button\"\n            data-toggle=\"dropdown\"\n          >\n            <span data-field=\"defaultItemSelection\"></span>\n            <span class=\"uf-navconfig-selector-caret caret\" style=\"margin-left: 10px\"></span>\n          </button>\n          <ul data-field=\"defaultItems\" class=\"dropdown-menu uf-navconfig-selector-menu\" role=\"menu\"></ul>\n        </div>\n      </div>\n      <div class=\"form-group\" data-field=\"targetDivDiv\">\n        <label class=\"col-md-3 control-label\">\n          <span style=\"margin-right: 5px\" data-field=\"targetDivLabel\">Target div</span>\n          <a href=\"#\" data-toggle=\"tooltip\" data-delay=\"0\"\n            ><span data-field=\"targetDivHelp\" class=\"fa fa-info-circle\"></span\n          ></a>\n        </label>\n        <div class=\"dropdown col-md-4\">\n          <button\n            class=\"btn btn-default dropdown-toggle uf-navconfig-selector-button\"\n            type=\"button\"\n            data-toggle=\"dropdown\"\n          >\n            <span data-field=\"targetDivSelection\"></span>\n            <span class=\"uf-navconfig-selector-caret caret\" style=\"margin-left: 10px\"></span>\n          </button>\n          <ul data-field=\"targetDivItems\" class=\"dropdown-menu uf-navconfig-selector-menu\" role=\"menu\"></ul>\n        </div>\n      </div>\n    </form>\n  </div>\n  <div data-field=\"footer\">\n    <button data-field=\"cancelButton\" type=\"button\" class=\"btn btn-default\">Cancel</button>\n    <button data-field=\"okButton\" type=\"button\" class=\"btn btn-primary\">Ok</button>\n  </div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".uf-navconfig-body{margin:" + ("15px")  + ";}.uf-navconfig-selector-button{min-width:" + ("200px")  + ";text-align:" + ("right")  + ";}.uf-navconfig-selector-menu{margin-right:" + ("20px")  + ";min-width:" + ("200px")  + ";}.uf-navconfig-selector-caret{float:" + ("left")  + ";margin-top:" + ("5px")  + ";}.uf-navconfig-disabled{opacity:" + ("0.5")  + ";pointer-events:" + ("none")  + ";}")) : ((".uf-navconfig-body{margin:" + ("15px")  + ";}.uf-navconfig-selector-button{min-width:" + ("200px")  + ";text-align:" + ("left")  + ";}.uf-navconfig-selector-menu{margin-left:" + ("20px")  + ";min-width:" + ("200px")  + ";}.uf-navconfig-selector-caret{float:" + ("right")  + ";margin-top:" + ("5px")  + ";}.uf-navconfig-disabled{opacity:" + ("0.5")  + ";pointer-events:" + ("none")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_NavComponentConfigModalViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_NavComponentConfigModalViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
