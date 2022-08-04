package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_s_SourceCodeEditorViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_s_SourceCodeEditorViewTemplateResource {
  private static Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_s_SourceCodeEditorViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_d_c_w_s_SourceCodeEditorViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-displayer-client/0.0.0/dashbuilder-displayer-client-0.0.0-sources.jar!/org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html
      public String getText() {
        return "<div data-field=\"mainDiv\" class=\"form-group\">\n  <div data-field=\"aceEditor\" class=\"form-control\" style=\"height: 300px\"></div>\n  <div class=\"dropdown sce-variable-button\">\n    <button\n      class=\"btn btn-default dropdown-toggle\"\n      data-toggle=\"dropdown\"\n      data-field=\"addVariableButton\"\n      title=\"Add variable\"\n    >\n      <span class=\"glyphicon glyphicon-asterisk\"></span><span class=\"caret\"></span>\n    </button>\n    <ul class=\"dropdown-menu pull-right sce-variable-menu\" role=\"menu\" data-field=\"variablesMenu\"></ul>\n  </div>\n  <span data-field=\"errorLabel\" class=\"help-block sce-error\"></span>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".sce-error{font-size:" + ("smaller")  + ";}.sce-variable-menu{height:" + ("300px")  + ";overflow:" + ("auto")  + ";position:" + ("absolute")  + ";top:" + ("5px")  + ";margin-left:" + ("40px")  + ";}.sce-variable-button{position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("20px")  + ";z-index:" + ("1")  + ";}")) : ((".sce-error{font-size:" + ("smaller")  + ";}.sce-variable-menu{height:" + ("300px")  + ";overflow:" + ("auto")  + ";position:" + ("absolute")  + ";top:" + ("5px")  + ";margin-right:" + ("40px")  + ";}.sce-variable-button{position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("20px")  + ";z-index:" + ("1")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_s_SourceCodeEditorViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_d_c_w_s_SourceCodeEditorViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
