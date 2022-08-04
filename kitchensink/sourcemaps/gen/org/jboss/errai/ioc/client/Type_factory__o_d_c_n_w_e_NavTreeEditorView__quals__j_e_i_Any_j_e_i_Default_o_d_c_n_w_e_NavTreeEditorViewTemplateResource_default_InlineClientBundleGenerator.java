package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavTreeEditorViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavTreeEditorViewTemplateResource {
  private static Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavTreeEditorViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavTreeEditorViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-navigation-client/0.0.0/dashbuilder-navigation-client-0.0.0-sources.jar!/org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html
      public String getText() {
        return "<div data-field=\"mainDiv\" class=\"uf-cms-nav-tree-panel\">\n  <div data-field=\"alertDiv\" class=\"uf-cms-nav-alert-panel alert alert-info\">\n    <div class=\"pull-right\">\n      <button data-field=\"saveButton\" class=\"btn btn-primary\" type=\"submit\">Save</button>\n      <button data-field=\"cancelButton\" class=\"btn btn-default\" type=\"submit\">Cancel</button>\n    </div>\n    <span class=\"pficon pficon-info\"></span>\n    <span data-field=\"alertMessage\">Save changes?</span>\n  </div>\n  <div data-field=\"childrenDiv\" class=\"uf-cms-nav-children-panel\"></div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".uf-cms-nav-tree-panel{overflow:" + ("auto")  + ";height:" + ("100%")  + ";}.uf-cms-nav-alert-panel{margin:" + ("15px")  + ";}.uf-cms-nav-children-panel{margin:" + ("10px"+ " " +"15px"+ " " +"5px"+ " " +"0")  + ";font-size:" + ("larger")  + ";}")) : ((".uf-cms-nav-tree-panel{overflow:" + ("auto")  + ";height:" + ("100%")  + ";}.uf-cms-nav-alert-panel{margin:" + ("15px")  + ";}.uf-cms-nav-children-panel{margin:" + ("10px"+ " " +"0"+ " " +"5px"+ " " +"15px")  + ";font-size:" + ("larger")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavTreeEditorViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavTreeEditorViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
