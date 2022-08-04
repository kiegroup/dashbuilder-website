package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource {
  private static Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-navigation-client/0.0.0/dashbuilder-navigation-client-0.0.0-sources.jar!/org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html
      public String getText() {
        return "<div class=\"uf-navitem-container\">\n  <div class=\"dropdown dropdown-kebab-pf\">\n    <div class=\"pull-left\">\n      <span data-field=\"itemIcon\"></span>\n    </div>\n    <div data-field=\"itemViewDiv\" class=\"uf-navitem-view-div\">\n      <span data-field=\"itemName\" class=\"uf-navitem-name\"></span>\n      <button\n        class=\"btn btn-link dropdown-toggle\"\n        type=\"button\"\n        id=\"dropdownKebab\"\n        data-toggle=\"dropdown\"\n        aria-haspopup=\"true\"\n        aria-expanded=\"true\"\n      >\n        <span data-field=\"itemMenuIcon\" class=\"fa fa-cog uf-navitem-cog-icon\" title=\"Show menu\"></span>\n      </button>\n      <ul data-field=\"commandMenu\" class=\"dropdown-menu uf-navitem-command-menu\" aria-labelledby=\"dropdownKebab\"></ul>\n      <span data-field=\"itemEditIcon\" class=\"pf pficon-edit uf-navitem-edit-icon\"></span>\n      <span data-field=\"itemDeleteIcon\" class=\"pf pficon-delete uf-navitem-delete-icon\"></span>\n    </div>\n    <div data-field=\"itemEditDiv\" class=\"uf-navitem-edit-div\">\n      <div data-field=\"itemNameDiv\" class=\"uf-navitem-name-div\">\n        <input data-field=\"itemNameInput\" class=\"form-control uf-navitem-name-input\" type=\"text\" />\n        <span data-field=\"itemConfirmIcon\" class=\"fa fa-check uf-navitem-confirm-icon\"></span>\n        <span data-field=\"itemCancelIcon\" class=\"fa fa-close uf-navitem-cancel-icon\"></span>\n      </div>\n      <div data-field=\"extraDiv\" class=\"uf-navitem-extra-div\"></div>\n    </div>\n  </div>\n  <div data-field=\"childrenDiv\" class=\"uf-navitem-children\"></div>\n</div>\n";
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".uf-navitem-container{clear:" + ("both")  + ";}.uf-navitem-name{margin-right:" + ("7px")  + ";}.uf-navitem-cog-icon,.uf-navitem-edit-icon,.uf-navitem-delete-icon{margin-right:" + ("5px")  + ";visibility:" + ("hidden")  + ";cursor:" + ("pointer")  + ";}.uf-navitem-confirm-icon,.uf-navitem-cancel-icon{margin-right:" + ("5px")  + ";cursor:" + ("pointer")  + ";}.uf-navitem-name-div{float:" + ("right")  + ";}.uf-navitem-name-input{margin-right:" + ("7px")  + ";font-size:" + ("smaller")  + ";float:") + (("right")  + ";width:" + ("150px")  + ";}.uf-navitem-name-error{border-color:" + ("#c00")  + ";border-width:" + ("1px")  + ";}.uf-navitem-extra-div{margin-right:" + ("22px")  + ";margin-bottom:" + ("10px")  + ";display:" + ("none")  + ";}.uf-navitem-extra-div .dropdown-menu:before,.uf-navitem-extra-div .dropdown-menu:after{content:" + ("none")  + ";}.uf-navitem-extra-div .dropdown-menu{margin-top:" + ("-1px")  + ";margin-right:" + ("15px")  + ";}.uf-navitem-view-div:hover,.uf-navitem-edit-div:hover{background-color:" + ("lightcyan") ) + (";}.uf-navitem-view-div:hover .uf-navitem-cog-icon,.uf-navitem-view-div:hover .uf-navitem-edit-icon,.uf-navitem-view-div:hover .uf-navitem-delete-icon{visibility:" + ("visible")  + ";}.uf-navitem-edit-icon:hover,.uf-navitem-confirm-icon:hover,.uf-navitem-cancel-icon:hover{color:" + ("#0088ce")  + ";}.uf-navitem-delete-icon:hover{color:" + ("#900")  + ";}.uf-navitem-children{margin-right:" + ("15px")  + ";}.uf-navitem-command-menu{margin-right:" + ("30px")  + ";}")) : ((".uf-navitem-container{clear:" + ("both")  + ";}.uf-navitem-name{margin-left:" + ("7px")  + ";}.uf-navitem-cog-icon,.uf-navitem-edit-icon,.uf-navitem-delete-icon{margin-left:" + ("5px")  + ";visibility:" + ("hidden")  + ";cursor:" + ("pointer")  + ";}.uf-navitem-confirm-icon,.uf-navitem-cancel-icon{margin-left:" + ("5px")  + ";cursor:" + ("pointer")  + ";}.uf-navitem-name-div{float:" + ("left")  + ";}.uf-navitem-name-input{margin-left:" + ("7px")  + ";font-size:" + ("smaller")  + ";float:") + (("left")  + ";width:" + ("150px")  + ";}.uf-navitem-name-error{border-color:" + ("#c00")  + ";border-width:" + ("1px")  + ";}.uf-navitem-extra-div{margin-left:" + ("22px")  + ";margin-bottom:" + ("10px")  + ";display:" + ("none")  + ";}.uf-navitem-extra-div .dropdown-menu:before,.uf-navitem-extra-div .dropdown-menu:after{content:" + ("none")  + ";}.uf-navitem-extra-div .dropdown-menu{margin-top:" + ("-1px")  + ";margin-left:" + ("15px")  + ";}.uf-navitem-view-div:hover,.uf-navitem-edit-div:hover{background-color:" + ("lightcyan") ) + (";}.uf-navitem-view-div:hover .uf-navitem-cog-icon,.uf-navitem-view-div:hover .uf-navitem-edit-icon,.uf-navitem-view-div:hover .uf-navitem-delete-icon{visibility:" + ("visible")  + ";}.uf-navitem-edit-icon:hover,.uf-navitem-confirm-icon:hover,.uf-navitem-cancel-icon:hover{color:" + ("#0088ce")  + ";}.uf-navitem-delete-icon:hover{color:" + ("#900")  + ";}.uf-navitem-children{margin-left:" + ("15px")  + ";}.uf-navitem-command-menu{margin-left:" + ("30px")  + ";}"));
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
