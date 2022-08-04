package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_c_c_m_w_MapTooltipTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_c_c_m_w_MapTooltipTemplateResource {
  private static Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_c_c_m_w_MapTooltipTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_c_c_m_w_MapTooltipTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-renderer-c3/0.0.0/dashbuilder-renderer-c3-0.0.0-sources.jar!/org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html
      public String getText() {
        return "<div id=\"uniqueD3MapTooltip\" class=\"mapTooltipContainer\">\n  <strong class=\"lblTooltipTitle\">Country Name</strong> <br />\n  <span class=\"lblTooltipCategory\">Data</span><strong class=\"lblTooltipValue\">123456</strong>\n</div>\n";
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
        return (".mapTooltipContainer{min-width:" + ("100px")  + ";min-height:" + ("50px")  + ";position:" + ("absolute")  + ";pointer-events:" + ("none")  + ";z-index:" + ("10")  + ";background-color:" + ("AliceBlue")  + ";border-style:" + ("groove")  + ";border-radius:" + ("8px")  + ";position:" + ("absolute")  + ";font-size:" + ("10px")  + ";}");
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
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_c_c_m_w_MapTooltipTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_c_c_m_w_MapTooltipTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
