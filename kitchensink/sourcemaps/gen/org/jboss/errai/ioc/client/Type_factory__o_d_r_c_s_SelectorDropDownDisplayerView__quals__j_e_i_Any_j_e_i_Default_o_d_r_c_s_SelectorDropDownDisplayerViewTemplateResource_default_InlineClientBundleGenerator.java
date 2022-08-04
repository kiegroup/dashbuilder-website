package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource {
  private static Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-renderer-default/0.0.0/dashbuilder-renderer-default-0.0.0-sources.jar!/org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html
      public String getText() {
        return "<div data-field=\"containerDiv\">\n  <div>\n    <span data-field=\"titleSpan\"></span>\n  </div>\n  <div data-field=\"dropDownDiv\" class=\"dropdown btn-group selector-ddown-container\">\n    <button\n      data-field=\"dropDownButton\"\n      class=\"btn btn-default dropdown-toggle selector-ddown-button\"\n      type=\"button\"\n      data-toggle=\"dropdown\"\n      aria-expanded=\"false\"\n    >\n      <div data-field=\"dropDownText\" class=\"selector-ddown-text\"></div>\n      <span class=\"caret selector-ddown-caret\"></span>\n    </button>\n    <ul data-field=\"dropDownMenu\" class=\"dropdown-menu selector-ddown-menu\" role=\"menu\"></ul>\n    <ul data-field=\"resetMenu\" class=\"dropdown-menu\" role=\"menu\">\n      <a data-field=\"resetAnchor\" class=\"selector-ddown-reset-anchor\">Clear All</a>\n    </ul>\n  </div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".selector-ddown-container{margin:" + ("5px")  + ";}.selector-ddown-button{text-align:" + ("right")  + ";overflow:" + ("hidden")  + ";}.selector-ddown-text{float:" + ("right")  + ";overflow:" + ("hidden")  + ";}.selector-ddown-reset-anchor{margin-left:" + ("10px")  + ";cursor:" + ("pointer")  + ";float:" + ("left")  + ";}.selector-ddown-caret{float:" + ("left")  + ";margin-top:" + ("5px")  + ";margin-right:") + (("10px")  + ";}.selector-ddown-menu{max-height:" + ("252px")  + ";overflow-y:" + ("auto")  + ";}")) : ((".selector-ddown-container{margin:" + ("5px")  + ";}.selector-ddown-button{text-align:" + ("left")  + ";overflow:" + ("hidden")  + ";}.selector-ddown-text{float:" + ("left")  + ";overflow:" + ("hidden")  + ";}.selector-ddown-reset-anchor{margin-right:" + ("10px")  + ";cursor:" + ("pointer")  + ";float:" + ("right")  + ";}.selector-ddown-caret{float:" + ("right")  + ";margin-top:" + ("5px")  + ";margin-left:") + (("10px")  + ";}.selector-ddown-menu{max-height:" + ("252px")  + ";overflow-y:" + ("auto")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
