package org.uberfire.ext.widgets.common.client.tables;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenBundle {
  private static PagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new PagedTable_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJIO14PDON{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GJIO14PDNN{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GJIO14PDBO{display:" + ("inline")  + ";text-align:" + ("left")  + ";}.GJIO14PDLN{text-align:" + ("center")  + ";}.GJIO14PDPN{margin:" + ("0")  + ";}.GJIO14PDPN td{padding-top:" + ("0")  + ";}.GJIO14PDAO{padding-top:" + ("5px")  + ";}.GJIO14PDMN{overflow:") + (("auto")  + ";}")) : ((".GJIO14PDON{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GJIO14PDNN{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GJIO14PDBO{display:" + ("inline")  + ";text-align:" + ("right")  + ";}.GJIO14PDLN{text-align:" + ("center")  + ";}.GJIO14PDPN{margin:" + ("0")  + ";}.GJIO14PDPN td{padding-top:" + ("0")  + ";}.GJIO14PDAO{padding-top:" + ("5px")  + ";}.GJIO14PDMN{overflow:") + (("auto")  + ";}"));
      }
      public java.lang.String centerToolBar() {
        return "GJIO14PDLN";
      }
      public java.lang.String dataGridContainer() {
        return "GJIO14PDMN";
      }
      public java.lang.String leftToolBar() {
        return "GJIO14PDNN";
      }
      public java.lang.String pagedTableContainer() {
        return "GJIO14PDON";
      }
      public java.lang.String pager() {
        return "GJIO14PDPN";
      }
      public java.lang.String pagerRow() {
        return "GJIO14PDAO";
      }
      public java.lang.String rightToolBar() {
        return "GJIO14PDBO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.uberfire.ext.widgets.common.client.tables.PagedTable_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
