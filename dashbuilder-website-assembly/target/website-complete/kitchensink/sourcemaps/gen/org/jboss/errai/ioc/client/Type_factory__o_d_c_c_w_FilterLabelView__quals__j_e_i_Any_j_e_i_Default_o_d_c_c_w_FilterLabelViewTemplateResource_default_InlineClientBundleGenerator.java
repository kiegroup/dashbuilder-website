package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default_o_d_c_c_w_FilterLabelViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default.o_d_c_c_w_FilterLabelViewTemplateResource {
  private static Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default_o_d_c_c_w_FilterLabelViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default_o_d_c_c_w_FilterLabelViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-common-client/0.0.0/dashbuilder-common-client-0.0.0-sources.jar!/org/dashbuilder/common/client/widgets/FilterLabelView.html
      public String getText() {
        return "<span class=\"label label-info\" style=\"margin-right: 5px; font-size: smaller\">\n  <span data-field=\"labelText\"></span>\n  <a data-field=\"labelRemove\" style=\"color: white; cursor: pointer\"><i class=\"pficon-close\"></i></a>\n</span>\n";
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default.o_d_c_c_w_FilterLabelViewTemplateResource::getContents()();
    }
    return null;
  }-*/;
}
