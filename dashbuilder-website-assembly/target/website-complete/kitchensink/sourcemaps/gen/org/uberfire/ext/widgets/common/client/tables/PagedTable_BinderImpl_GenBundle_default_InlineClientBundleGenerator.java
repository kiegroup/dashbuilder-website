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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BJS{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GD0PFO4BIS{float:" + ("right")  + ";text-align:" + ("right")  + ";}.GD0PFO4BMS{display:" + ("inline")  + ";text-align:" + ("left")  + ";}.GD0PFO4BGS{text-align:" + ("center")  + ";}.GD0PFO4BKS{margin:" + ("0")  + ";}.GD0PFO4BKS td{padding-top:" + ("0")  + ";}.GD0PFO4BLS{padding-top:" + ("5px")  + ";}.GD0PFO4BHS{overflow:") + (("auto")  + ";}")) : ((".GD0PFO4BJS{padding-top:" + ("10px")  + ";padding-bottom:" + ("10px")  + ";}.GD0PFO4BIS{float:" + ("left")  + ";text-align:" + ("left")  + ";}.GD0PFO4BMS{display:" + ("inline")  + ";text-align:" + ("right")  + ";}.GD0PFO4BGS{text-align:" + ("center")  + ";}.GD0PFO4BKS{margin:" + ("0")  + ";}.GD0PFO4BKS td{padding-top:" + ("0")  + ";}.GD0PFO4BLS{padding-top:" + ("5px")  + ";}.GD0PFO4BHS{overflow:") + (("auto")  + ";}"));
      }
      public java.lang.String centerToolBar() {
        return "GD0PFO4BGS";
      }
      public java.lang.String dataGridContainer() {
        return "GD0PFO4BHS";
      }
      public java.lang.String leftToolBar() {
        return "GD0PFO4BIS";
      }
      public java.lang.String pagedTableContainer() {
        return "GD0PFO4BJS";
      }
      public java.lang.String pager() {
        return "GD0PFO4BKS";
      }
      public java.lang.String pagerRow() {
        return "GD0PFO4BLS";
      }
      public java.lang.String rightToolBar() {
        return "GD0PFO4BMS";
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
