package org.dashbuilder.common.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AlertPanelView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle {
  private static AlertPanelView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new AlertPanelView_ViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BDQ{float:" + ("left")  + ";position:" + ("relative")  + ";margin:" + ("10px")  + ";}.GD0PFO4BCQ{margin:" + ("5px")  + ";}")) : ((".GD0PFO4BDQ{float:" + ("right")  + ";position:" + ("relative")  + ";margin:" + ("10px")  + ";}.GD0PFO4BCQ{margin:" + ("5px")  + ";}"));
      }
      public java.lang.String button() {
        return "GD0PFO4BCQ";
      }
      public java.lang.String buttonsPanel() {
        return "GD0PFO4BDQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
